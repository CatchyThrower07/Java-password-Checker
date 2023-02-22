import java.util.Random;
import javax.swing.JOptionPane;

public class PasswordChecker {
    public static void main (String args[]){
        //try catch
        try{
            //minimum password length declaration assignment
            int intPasswordLength = Integer.parseInt(JOptionPane.showInputDialog("Enter Length \n (Must be at least 4)"));
            //bools for password requirements
            boolean containsCapital = false;
            boolean containsLowercase = false;
            boolean containsNumber = false;
            boolean containsSpecial = false;
            //check for password length
            if (intPasswordLength < 4) {
                while (intPasswordLength < 4)
               intPasswordLength = Integer.parseInt(JOptionPane.showInputDialog("Length Must Be at least 4"));
            }
            //ask user for password
            String strPassword = JOptionPane.showInputDialog("Enter Password\n (Enter 'r' to generate random password)");

            //generate random passowrd if user selects "r"
            if (strPassword.matches("r")) {
                JOptionPane.showMessageDialog(null, "I will create a password for you");
                String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
                String specialCharacters = "!@#$";
                String numbers = "1234567890";
                String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
                Random rand = new Random();
                char[] password = new char[intPasswordLength];
                password[0] = lowerCaseLetters.charAt(rand.nextInt(lowerCaseLetters.length()));
                password[1] = capitalCaseLetters.charAt(rand.nextInt(capitalCaseLetters.length()));
                password[2] = specialCharacters.charAt(rand.nextInt(specialCharacters.length()));
                password[3] = numbers.charAt(rand.nextInt(numbers.length()));

                //loop for random char selection
                for(int i = 4; i < intPasswordLength ; i++) {
                    password[i] = combinedChars.charAt(rand.nextInt(combinedChars.length()));
                }
                //convert the char array to string
                strPassword = String.valueOf(password);
                JOptionPane.showMessageDialog(null, strPassword);

            }
            //check if typed password meets minimum length
            else if(strPassword.length() < intPasswordLength){
                JOptionPane.showMessageDialog(null,"Password is Not long enough");
            }


            //check for password requirements
            for (int i = 0; i < strPassword.length(); i++){
                char c = strPassword.charAt(i);
                //check for capital
                if (c >= 65 && c<=90){
                    containsCapital = true;
                }
                //check for lowercase
                else if (c >= 97 && c <= 122){
                    containsLowercase = true;
                }
                //check for number
                else if (c >= 48 && c <= 57){
                    containsNumber = true;
                }
                //check for special characters
                else if (c >= 33 && c <= 47){
                    containsSpecial = true;
                }
                //check for space in password
                else if (c == 32) {
                    strPassword = JOptionPane.showInputDialog(null, "Invalid Password\n Cannot contain space");
              }

            }
            //display password checks
            JOptionPane.showMessageDialog(null, "Password is " + intPasswordLength+ "+ Characters true\n Upper case " + containsCapital+"\n Lowercase "+containsLowercase +
                    "\n Number " + containsNumber+ "\n Special " + containsSpecial);

        }
        //catch errors
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Length Must be a number");
        }




    }
}
