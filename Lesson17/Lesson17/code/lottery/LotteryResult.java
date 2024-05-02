package lottery;

import java.util.Arrays;

public class LotteryResult {

    public void checkLotteryResult(Lottery lottery, Player player) {
        // проводим проверку выигрышных номеров и сравниваем их с номерами в билетах игрока

        // узнать выигрышные номера лотереи

        int[] winnerNumber = lottery.getWinnerNumbers();

        Arrays.sort(winnerNumber);

        // Получить билеты от игрока

        LotteryTicket[] tickets = player.getTickets();

        System.out.println("Результат проверки для игрока: " + player.getIdCode());

        // проводим проверку для КАЖДОГО билета

        for (int i = 0; i < tickets.length; i++) {
            // получаем номера из текущего билета

            int[] numbersFromCurrentTicket = tickets[i].getTicketNumbers();

            // сравним и посчитаем количество совпадений

            int matchCounter = 0;

            for (int j = 0; j < numbersFromCurrentTicket.length; j++) {
                if (Arrays.binarySearch(winnerNumber, numbersFromCurrentTicket[j]) > 0) {
                    matchCounter++;
                }
            }

            System.out.println("Ticket # " + ( i + 1 ) + " has " + matchCounter + " winner numbers" );
        }


    }

}