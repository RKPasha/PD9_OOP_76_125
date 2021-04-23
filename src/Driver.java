
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abdullah
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int option = -1;
        do {

            String input = JOptionPane.showInputDialog(null, "Programming Day Group Tasks\n\n"
                    + "-> Enter 1 to check Task1\n"
                    + "-> Enter 2 to check Task2\n"
                    + "-> Enter 3 to check Task3\n"
                    + "-> Enter 4 to check Task4\n"
                    + "-> Enter 0 to exit\n\n", "Group Task", 1);
            try {
                option = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You have entered an Invalid value.");
            }
            switch (option) {
                case 1:
                    task1 t1 = new task1();
                    String text = JOptionPane.showInputDialog(null, "Enter the string :" ,"Task 1",1);
                    int vowels = t1.vowelCounter(text);
                    int punctuations =t1.puncCount(text);
                    JOptionPane.showMessageDialog(null, "Number of vowels : " +vowels +"\nNumber of punctuations : " +punctuations, "Task1", 1);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "You have entered an invalid option. Try Again with Correct entry.");
                    break;
            }
        } while (option != 0);
    }

}

class task1{
    int vowelCounter(String text){
            int count = 0;
        for(int i = 0; i < text.length(); i++){
            if((text.charAt(i) == 'a' || text.charAt(i) == 'A') || (text.charAt(i) == 'e' || text.charAt(i) == 'E') || (text.charAt(i) == 'i' || text.charAt(i) == 'I') || (text.charAt(i) == 'o' || text.charAt(i) == 'O') || (text.charAt(i) == 'u' || text.charAt(i) == 'U') ){
                count++;
            }
        }
        return count;
    }
    int puncCount(String text) {
            int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.' || text.charAt(i) == ',' || text.charAt(i) == '"' || text.charAt(i) == ';' || text.charAt(i) == ':' || text.charAt(i) == '-') {
                count++;
            }
        }
        return count;
    }
    boolean findSubString(String text, String sub){
        boolean flag = false;
        return flag;
    }
}
class task2{
    
}
class task3{
    
}
class task4{
    
}