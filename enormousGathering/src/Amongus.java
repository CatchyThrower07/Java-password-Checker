import javax.swing.*;

public class Amongus {
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null,"Thank You for choosing our Service!");
        dispTicketService();
    }

    private static void dispTicketService(){
        String strEventAttending = JOptionPane.showInputDialog("What event do you want to attend?");
        getAmounts();

    }

    private static void getAmounts() {
        int intNumberTickets = Integer.parseInt(JOptionPane.showInputDialog("How many Tickets?"));
        String strSeatingType = JOptionPane.showInputDialog("What Seating would you Like?\nGeneral or Premium");
        int intConsessionAmount = Integer.parseInt(JOptionPane.showInputDialog("How much would you like to spend on Conssessions?"));
        getTotal();

    }

    private static int getTotal() {
        int intTotalPrice = 0;
        final int PREMIUM = 60;
        final int GENERAL = 25;


        return 0;
    }
}
