package lesson_44.matchparser;


import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MatchExample {
    public static void main(String[] args) throws IOException {

        Service service = new Service();

        service.parseMatches();


        System.out.println("a) выбрать все матчи которые были в первой половине месяца");
        System.out.println(service.findMatchesLessDate());

        System.out.println("b) посчитать общее количество матчей в выборке");
        System.out.println(service.allMatchesAmount());

        System.out.println("c) выбрать топ 10 самых посещаемых матчей");
        System.out.println(service.top10MatchesByWatchers());

        System.out.println("d) выбрать топ 3 матчей с самой большой разницей в счете на стадионе WWK Arena");
        System.out.println(service.top3MatchesByGoalsDifference());

        System.out.println("e) посчитать сколько матчей содержат упоминания о стадионе");
        System.out.println(service.matchesWithStaduimName());

        System.out.println("f) посчитать сколько матчей сыграла каждая команда в качестве гостя (в формате map)");
        System.out.println(service.guestMatchesByTeams());
    }

}
