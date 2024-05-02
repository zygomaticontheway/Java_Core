package lottery;

import java.util.Random;

public class LotteryTicket {

    private int[] ticketNumbers;

    public int[] getTicketNumbers() {
        return ticketNumbers;
    }


    public void createTicket(int ticketSize) {
        ticketNumbers = new int[ticketSize];
    }

    public void fillTicket(int sizeLotteryNumbers) {

        // Math.random() - возвращает псевдослучайное значение от 0 до 1 (не включая)


        Random random = new Random();

        for (int i = 0; i < ticketNumbers.length; i++) {

            boolean isNotFillCurrentPosition = true;

            while (isNotFillCurrentPosition) {

                //
                // нам нужно пройти в цикле от начала массива чисел до предыдущего элемента
                // и проверить выпадал ли этот randomNumber уже
                // если "да" - то получить новый
                // если "нет" - то положить в массив
                //

                int randomNumber = random.nextInt(sizeLotteryNumbers) + 1;
                /*
                random.nextInt(10) - может вернуть случайное значение от 0 до 9
                 */

                if (isRandomNumberNotExist(randomNumber, i)) {
                    ticketNumbers[i] = randomNumber;
                    isNotFillCurrentPosition = false;
                }
            }

        }
    }


    private boolean isRandomNumberNotExist(int checkNumber, int currentPosition){
        for (int j = 0; j < currentPosition; j++) {
            if (ticketNumbers[j] == checkNumber) {
                return false;
            }
        }
        return true;
    }
}