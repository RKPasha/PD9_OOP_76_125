
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abdullah & Mohammad Ahsan
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
                                + "6- Check Palindrome String\n"
                                + "7- Check if String Contains only Digits\n"
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
                                    JOptionPane.showMessageDialog(null, "Resulted String is Empty\n");
                                }
                                else {
                                    JOptionPane.showMessageDialog(null, "Resulted String is:\n" + data1);
                                }
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
                                    res = "'" + data1 + "' and '" + data2 + "' are Anagrams of each other\n";
                                }
                                else {
                                    res = "'" + data1 + "' and '" + data2 + "' are not Anagrams of each other\n";
                                }
                                JOptionPane.showMessageDialog(null, res);
                                break;
                                
                            case "6":
                                data1 = ""; res = "";
                                MyString str6 = new MyString();
                                data1 = JOptionPane.showInputDialog(null, "Enter a String: ");
                                boolean flag = str6.isPalindrome(data1);
                                if(flag == true) {
                                    res = "'" + data1 + "' is Palindrome\n";
                                }
                                else {
                                    res = "'" + data1 + "' is not a Palindrome\n";
                                }
                                JOptionPane.showMessageDialog(null, res);
                                break;
                                
                            case "7":
                                data1 = ""; res = "";
                                MyString str7 = new MyString();
                                data1 = JOptionPane.showInputDialog(null, "Enter a String: ");
                                boolean isNumbered = str7.isStringNumbered(data1);
                                if(isNumbered != true) {
                                    res = "Entered String not contains only Digits";
                                }
                                else {
                                    res = "Entered String contains only Digits";
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


/**
 * This class has 7 String manipulation functions which is not provided in standard String class.
 * @author Mohammad Ahsan
 */
class MyString {

    /**
     * It is a method to return the maximum occurring character in the input string, e.g., if the input string is "Java"
     * then the function should return 'a'.
     * @param data String to be checked for Maximum Occurrence of characters.
     * @return returns String containing characters which are maximum occurred. 
     */
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

    /**
     * 
     * It is a method that takes two strings as arguments and removes the characters from the first string,
     * which are present in the second string. For example, if the first String "India is great" and the second String is
     * "in" then the output should be "da s great".
     * @param str1 String from which characters of another String(i.e, str2) will be removed.
     * @param str2 String containing characters to be removed in another String(i.e, str1).
     * @return returns String from which characters of second String(i.e, str2) are removed.
     */
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
    
    /**
     * It is a method to reverse a String. For example, if a given input is "abcd," then your function should return "dcba".
     * @param str String to be reversed
     * @return returns all reversed characters from given String (i.e, str).
     */
    public String reverseString(String str) {
        String res = "";
        for(int i=str.length()-1; i>=0; i--) {
            res = res + str.charAt(i);
        }
        return res;
    }
    
    /**
     * It is a method to reverse the words in a given String sentence. For example, if the input is "Java is best,"
     * then program should print "best is Java". There is no restriction on preserving white space.
     * @param str String whose words to be reversed.
     * @return returns Strings of reversed words
     */
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
    
    /**
     * It is a method to check if two String is an anagram of each other. An anagram contains are of the same length and 
     * contains the same character, but in a different order, for example, "Army" and "Mary" is the anagram.
     * @param str1 String to be compared with str2
     * @param str2 String to be compared with str1
     * @return returns true if above two given Strings are Anagram of each other, otherwise returns false.
     */
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
    
    /**
     * It is method to sort a Character array 
     * @param arr Array to be sorted
     * @return returns sorted character Array
     */
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
    
    /**
     * It is a method to check if a Given a string is a palindrome. For example,"121" is a palindrome, but "abc" is not.
     * @param str String to be checked of Palindrome Status.
     * @return returns true if above given String is Palindrome, otherwise returns false.
     */
    public boolean isPalindrome(String str) {
        boolean flag = true;
        String res = "";
        // To converting to Lower Case.
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                res = res + (char)(str.charAt(i) + 32);
            }
            else {
                res = res + str.charAt(i);
            }
        }
        str = res;
        res = "";
        
        // To remove spaces from string
        for(int i=0; i<str.length(); i++) {
            if(!(str.charAt(i) <= 32)) {
                res = res + str.charAt(i);
            }
        }
        str = res;
        
        int k = str.length() - 1;
        for(int i=0; i<str.length() / 2; i++) {
            if(!(str.charAt(i) == str.charAt(k))) { 
                flag = false;
            }
            k--;
        }
        return flag;
    }
    
    
    /**
     * It is a method to check if a Given String contains only digits or not.
     * @param str String to be checked if it consists of only Digits or not
     * @return returns true if above given String consists of only digits, otherwise returns false.
     */
    public boolean isStringNumbered(String str) {
        boolean flag = true;
        for(int i=0; i<str.length(); i++) {
            if(!(str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
