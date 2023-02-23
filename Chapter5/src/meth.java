import javax.swing.JOptionPane;
public class meth { public static void main (String[] args){

//printHello is a no-arg METHOD to display hello

//printNameAge is a VOID METHOD to display user's name and age

//calcAge is a VALUE RETURNING METHOD to calculate age in 100 yea
            //create world and turtle
            /*
            World w = new World(800, 600);
            Turtle t = new Turtle(w);
            t.forward();
            t.turn(90);
            */

            String strName;
            int intAge;

            //Get name and age
            strName = JOptionPane.showInputDialog("What is your name?");
            intAge = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));

            //Back at main
            System.out.println("Back at the main method");

            //end program
            //System.exit(0);
    }
}


