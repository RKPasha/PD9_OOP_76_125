
import java.util.Arrays;
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
        String subOption = "";
        String data1 = "", data2 = "", res = "";
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
                    String text = JOptionPane.showInputDialog(null, "Enter the string :", "Task 1", 1);
                    int words = t1.wordCounter(text);
                    int vowels = t1.vowelCounter(text);
                    int punctuations = t1.puncCount(text);
                    JOptionPane.showMessageDialog(null, "Number of Words: " + words + "\nNumber of vowels : " + vowels + "\nNumber of punctuations : " + punctuations, "Task1", 1);
                    break;
                case 2:
                    task2 t2 = new task2();
                    String text1 = JOptionPane.showInputDialog(null, "Enter the string :", "Task 2", 1);
                    t2.sentenceSpliter(text1);
                    break;
                case 3:
                    task3 t3 = new task3();
                    int inpt = -1;
                    do {
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
                        switch (inpt) {
                            case 1:
                                String text2 = JOptionPane.showInputDialog(null, "Enter the string :", "Task 3", 1);
                                JOptionPane.showMessageDialog(null, t3.ridMultipleBlank(text2));
                                break;
                            case 2:
                                String text3 = JOptionPane.showInputDialog(null, "Enter the string :", "Task 3", 1);
                                JOptionPane.showMessageDialog(null, t3.removeInteger(text3));
                                break;
                            case 3:
                                String text4 = JOptionPane.showInputDialog(null, "Enter the string :", "Task 3", 1);
                                JOptionPane.showMessageDialog(null, t3.stringEncryption(text4));
                                break;
                            case 0:
                                break;
                        }
                    } while (inpt != 0);
                    break;
                case 4:
                    do {
                        subOption = JOptionPane.showInputDialog(null, "What you want to Check?\n\n"
                                + "1- Find Maximum Occuring Character in a String\n"
                                + "2- Remove characters from firstString which are in second String\n"
                                + "3- Reverse a Whole String\n"
                                + "4- Reverse Words in a String\n"
                                + "5- Check Anagram Strings\n"
                                + "R- to return Back\n"
                                + "0- to exit", "Group Tasks", 1);
                        switch (subOption) {
                            case "1":
                                data1 = ""; res = "";
                                data1 = JOptionPane.showInputDialog(null, "Enter a String:");
                                MyString str1 = new MyString();
                                res = str1.findMaxOcurringChar(data1);
                                JOptionPane.showMessageDialog(null, "Maximum Occurring Character or Characters in String: '" + data1
                                        + "' are:\n" + res);
                                break;

                            case "2":
                                data1 = ""; data2 = "";
                                data1 = JOptionPane.showInputDialog(null, "Enter First String:");
                                data2 = JOptionPane.showInputDialog(null, "Enter Second String:");
                                MyString str2 = new MyString();
                                data1 = str2.removeCharacters(data1, data2);
                                if(res.equals("")) {
                                    JOptionPane.showMessageDialog(null, "Resulted String Empty:\n");
                                }
                                JOptionPane.showMessageDialog(null, "Resulted String is:\n" + data1);
                                break;
                                
                            case "3":
                                data1 = "";
                                MyString str3 = new MyString();
                                data1 = JOptionPane.showInputDialog(null, "Enter a String: ");
                                data1 = str3.reverseString(data1);
                                JOptionPane.showMessageDialog(null, "Reversed String is:\n" + data1);
                                break;
                                
                            case "4":
                                data1 = "";
                                MyString str4 = new MyString();
                                data1 = JOptionPane.showInputDialog(null, "Enter a String: ");
                                data1 = str4.reverseStringWords(data1);
                                JOptionPane.showMessageDialog(null, "Reversed Words String is:\n" + data1);
                                break;
                                
                            case "5":
                                data1 = ""; data2 = ""; res = "";
                                MyString str5 = new MyString();
                                data1 = JOptionPane.showInputDialog(null, "Enter First String: ");
                                data2 = JOptionPane.showInputDialog(null, "Enter Second String: ");
                                boolean check = str5.isAnagram(data1, data2);
                                if(check == true) {
                                    res = data1 + " and " + data2 + " are Anagrams of each other\n";
                                }
                                else {
                                    res = data1 + " and " + data2 + " are not Anagrams of each other\n";
                                }
                                JOptionPane.showMessageDialog(null, res);
                                break;
                        }
                    } while (!subOption.equals("R") && !subOption.equals("r") && !subOption.equals("0"));
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "You have entered an invalid option. Try Again with Correct entry.");
                    break;
            }
        } while (option != 0 && !(subOption.equals("0")));
    }

}

class task1 {

    int wordCounter(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    int vowelCounter(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) == 'a' || text.charAt(i) == 'A') || (text.charAt(i) == 'e' || text.charAt(i) == 'E') || (text.charAt(i) == 'i' || text.charAt(i) == 'I') || (text.charAt(i) == 'o' || text.charAt(i) == 'O') || (text.charAt(i) == 'u' || text.charAt(i) == 'U')) {
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

    boolean findSubString(String text, String sub) {
        boolean flag = false;
        return flag;
    }
}

class task2 {

    void sentenceSpliter(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}

class task3 {

    String ridMultipleBlank(String s) {
        String result = s.replaceAll("\\s+", " ");
        return result;
    }

    String removeInteger(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }

    String stringEncryption(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(i) + '@';
        }
        return result;
    }
}

class MyString {

    public String findMaxOcurringChar(String data) {
        String str = "";
        int[] count = new int[256];
        for (int i = 0; i < data.length(); i++) {
            int ascii = (int) data.charAt(i);
            count[ascii]++;
        }

        int largest = count[0];
        for (int i = 0; i < 256; i++) {
            if (largest <= count[i]) {
                largest = count[i];
            }
        }

        for (int i = 0; i < 256; i++) {
            if (largest == count[i]) {
                char c = (char) i;
                str = str + c;
            }
        }
        if (str.length() > 1) {
            String str1 = Character.toString(str.charAt(0));
            for (int i = 1; i < str.length(); i++) {
                str1 = str1 + " " + str.charAt(i);
            }
            return str1;
        }
        return str;
    }

    public String removeCharacters(String str1, String str2) {
        String res1 = "";
        String res2 = "";
        str1 = str1.toLowerCase();
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) != c) {

                    res1 = res1 + str1.charAt(j);

                }
            }
            res2 = res1;
            str1 = res1;
            res1 = "";
        }
        
        return res2;
    }
    
    public String reverseString(String str) {
        String res = "";
        for(int i=str.length()-1; i>=0; i--) {
            res = res + str.charAt(i);
        }
        return res;
    }
    
    public String reverseStringWords(String str) {
        String res = "";
        String word = "";
        String reversedWord = "";
        String spaces = "";
        int k = 0;
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) != 32) {
                word = word + str.charAt(i);
            }
            else {
                spaces = spaces + " ";
                k = word.length() - 1;
                for(int j=0; j<word.length(); j++) {
                    reversedWord = reversedWord + word.charAt(k);
                    k--;
                    
                }
                res = res + reversedWord + spaces;
                reversedWord = "";
                word = "";
                spaces = "";
            }
        }
        
        k = word.length() - 1;
        for(int z=0; z<word.length(); z++) {
            reversedWord = reversedWord + word.charAt(k);
            k--;
        }
        res = res + reversedWord + spaces;
        return res;
    }
    
    public boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase().trim();
        str2 = str2.toLowerCase().trim();
        boolean flag = true, check = false;
        if(str1.length() == str2.length() && !str1.equals(str2)) {
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();
            ch1 = sortArray(ch1);
            ch2 = sortArray(ch2);
            for(int k=0; k<ch1.length; k++) {
                if(ch1[k] != ch2[k]) {
                    flag = false;
                }
            }
            if(flag == true) {
                check = true;
            }
        }
        return check;
    }
    
    private char[] sortArray(char arr[]) {
        int smallest = 0, num = 0, k = 0;
        for(int i=0; i<arr.length; i++) {
            smallest = arr[i];
            num = arr[i];
            k = i;
            for(int j=i; j<arr.length; j++) {
                if(smallest > arr[j]) {
                    smallest = arr[j];
                    k = j;
                }
            }
           arr[i] = (char)smallest;
           arr[k] = (char)num;
        }
        return arr;
    }
}
