package lottery;

import java.util.Arrays;

public class Player {

    private String idCode;

    private LotteryTicket[] tickets;

    public Player(String idCode) {
        this.idCode = idCode;
    }

    public String getIdCode() {
        return idCode;
    }

    public LotteryTicket[] getTickets() {
        return tickets;
    }

    public void createTickets(int numberOfTickets) {
        tickets = new LotteryTicket[numberOfTickets];
    }

    public void fillTickets(int sizeTicket, int sizeLotteryNumbers) {

        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = new LotteryTicket();
            tickets[i].createTicket(sizeTicket);
            tickets[i].fillTicket(sizeLotteryNumbers);
        }
    }

    public void printPlayerData() {
        System.out.println("Player ID: " + idCode);
        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Билет № " + (i + 1));
            System.out.println(Arrays.toString(tickets[i].getTicketNumbers()));
        }
    }

}