
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
                    int words = t1.wordCounter(text);
                    int vowels = t1.vowelCounter(text);
                    int punctuations =t1.puncCount(text);
                    JOptionPane.showMessageDialog(null, "Number of Words: " +words +"\nNumber of vowels : " +vowels +"\nNumber of punctuations : " +punctuations, "Task1", 1);
                    break;
                case 2:
                    task2 t2 = new task2();
                    String text1 = JOptionPane.showInputDialog(null, "Enter the string :" ,"Task 2",1);
                    t2.sentenceSpliter(text1);
                    break;
                case 3:
                    task3 t3 = new task3();
                    int inpt = -1;
                    do{                        
                    String input1 = JOptionPane.showInputDialog(null, "What you want to check?\n\n"
                            + "> Enter 1 to check ridMultipleBlank(String s)\n"
                            + "> Enter 2 to check removeInteger(String s)\n"
                            + "> Enter 3 to check stringEncryption(String s)\n"
                            + "> Enter 0 to exit\n\n", "Task 3", 1);
                        try {
                            inpt = Integer.parseInt(input1);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "You have entered an Invalid value.");
                        }
                        switch(inpt){
                            case 1:
                                String text2 = JOptionPane.showInputDialog(null, "Enter the string :", "Task 3", 1);
                                JOptionPane.showMessageDialog(null, t3.ridMultipleBlank(text2));
                                break;
                            case 2:
                                String text3 = JOptionPane.showInputDialog(null, "Enter the string :", "Task 3", 1);
                                JOptionPane.showMessageDialog(null, t3.removeInteger(text3));
                                break;
                            case 3:
                                break;
                            case 0:
                                break;
                        }
                    }while(inpt != 0);
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
    int wordCounter(String text){
        int count = 1;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
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
    void sentenceSpliter(String text){
         for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
class task3{
    String ridMultipleBlank(String s){
        String result = s.replaceAll("\\s+", " ");
        return result;
    }
    String removeInteger(String s){
        String result = "";
         for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9' ) {
            }else{
                result += s.charAt(i);
            }
        }
        return result;
    }
}
class task4{
    
}