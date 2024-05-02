package lottery;

public class PlayLottery {
    public static void main(String[] args) {

        // создадим "константы" для нашей лотереи
        int lotterySize = 36;
        int winnerSize = 5;

        // создать экземпляр класса в котором есть все методы для лотереи

        Lottery lottery = new Lottery();
        // создать лотерейные номера

        lottery.createLotteryNumbers(lotterySize);

        // перемешать номера

        lottery.shuffleNumbers();

        int quantityPlayerTicket = 3;

        Player player1 = new Player("123-456-789");
        player1.createTickets(quantityPlayerTicket);
        player1.fillTickets(winnerSize,lotterySize);

        player1.printPlayerData();

        Player player2 = new Player("124-457-780");
        player2.createTickets(quantityPlayerTicket);
        player2.fillTickets(winnerSize,lotterySize);

        player2.printPlayerData();

        System.out.println("ПРОВОДИМ РОЗЫГРЫШ ЛОТЕРЕИ");

        lottery.lotteryRound(winnerSize);

        // печать результатов

        System.out.println("Выигрышные номера:");
        lottery.printWinnerNumbers();

        // проверка на выигрыш

        LotteryResult result = new LotteryResult();
        result.checkLotteryResult(lottery, player1);
        result.checkLotteryResult(lottery, player2);

    }
}