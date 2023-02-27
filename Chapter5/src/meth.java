import javax.swing.JOptionPane;
public class meth {
    public static void main (String[] args){
        String strName;
        int intAge;


        //Get name and age
        strName = JOptionPane.showInputDialog("What is your name?");
        intAge = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));

        //call method
        displayHello();
        //arguments are value passed to a method
        displayUsername(strName, intAge);

        String myUi;

        myUi = s("Name");

        s("Age");
        s("Address");

        //Back at main
        System.out.println("Back at the main method");


        //end program
        //System.exit(0);
    }


    //no argument void method
    //does not return a value
    // display hello
    public static void displayHello(){
        System.out.println("Hello World");

    }

    //Runs code and returns value
    //replace void with data type returned
    //needs return statement
    public static String s(String prompt) {

        String ui;
        ui = JOptionPane.showInputDialog(prompt);
        ageupdate(ui);



        return ui;
    }

    //Method to display users name and age
    //Parameters are received
    //args and params data type must match
    public static void displayUsername(String strUsername, int intUserAge){
        JOptionPane.showMessageDialog(null, "Your name is "+strUsername+"\nYour age is "+intUserAge);
    }

    public static String ageupdate(String userAge){


        System.out.println("In 100 yrs you will be ");// + (Integer.parseInt(userAge) + 100));

        return "";
    }

}
