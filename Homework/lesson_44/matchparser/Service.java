package lesson_44.matchparser;

import Lesson18hw.company.UserInput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Service {


    private List<Match> matches = new ArrayList<>();
    private String line;
    UserInput ui = new UserInput();

    public List<Match> parseMatches() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Homework/lesson_44/matchparser/matches.txt"));

        while ((line = bufferedReader.readLine()) != null) {
            matches.add(createRecord(line));
        }
        bufferedReader.close();
        return matches;
    }

    private Match createRecord(String line) {
        String[] data = line.split(",");

        String year = data[0].trim();
        String month = data[1].trim();
        String day = data[2].trim();
        String team1 = data[3].trim();
        String result = data[4].trim();
        String team2 = data[5].trim();

        int watchers = 0;

        if (!Objects.equals(data[6].trim(), "NULL")) {
            watchers = Integer.parseInt(data[6].trim());
        }

        String stadium = "";

        if (data[7] != null) {
            stadium = data[7].trim();
        }

        return new Match(year, month, day, team1, result, team2, watchers, stadium);
    }


//    a) выбрать все матчи которые были в первой половине месяца
    public List<Match> findMatchesLessDate (){
        int dayNumber = ui.inputInt("Введите число месяца, до которого выбрать матчи:");
        return matches.stream()
                .filter(match -> Integer.parseInt(match.getDay()) < dayNumber)
                .collect(Collectors.toList());
    }


//    b) посчитать общее количество матчей в выборке
    public Integer allMatchesAmount (){
        return matches.size();
    }

//    c) выбрать топ 10 самых посещаемых матчей
    public List<Match> top10MatchesByWatchers(){
        return matches.stream()
                .sorted(Comparator.comparingInt(Match::getWatchers))
                .sorted(Collections.reverseOrder())
                .limit(10)
                .collect(Collectors.toList());

    }
//    d) выбрать топ 3 матчей с самой большой разницей в счете на стадионе WWK Arena
    public List<Match> top3MatchesByGoalsDifference(){
        return matches.stream()
                .filter(match -> match.getStadium().contains("WWK Arena"))
                .sorted(Comparator.comparingInt(match -> Math.abs(match.getResultTeam1()-match.getResultTeam2())))
                .limit(3)
                .collect(Collectors.toList());
    }
//    e) посчитать сколько матчей содержат упоминания о стадионе
    public long matchesWithStaduimName(){
        return matches.stream()
                .filter(match -> !match.getStadium().isBlank())
                .count();
    }
//    f) посчитать сколько матчей сыграла каждая команда в качестве гостя (в формате map)
    public Map<String, Integer> guestMatchesByTeams(){

        Map<String, List<Match>> guestMatchesOfTeamsMap = matches.stream()
                .collect(Collectors.groupingBy(Match::getTeam2));

        Map<String, Integer> amountOfGuestMatchesOfTeams = new HashMap<>();

        for (String team : guestMatchesOfTeamsMap.keySet()){
            amountOfGuestMatchesOfTeams.put(team, guestMatchesOfTeamsMap.get(team).size());
        }
        return amountOfGuestMatchesOfTeams;
    }
//    g) выделить наиболее популярный день проведения матча


}



