package sept.ex_250924;

import java.util.Scanner;

public class Count {

    //Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine().toLowerCase().trim();

        int vowelCount = 0;
        int consonantCount = 0;


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u'){
              vowelCount++;
            }else if(c >= 'a' && c <= 'z'){
                consonantCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

}
