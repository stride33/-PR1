package app;

//import java.util.Scanner;

public class Vowel {

    public static int count_vowel(String str) {

        char[] m_str = str.replaceAll(" ", "").toCharArray();
        int count = 0;
        char vowel[] = { 'a', 'e', 'i', 'o' };
        for (int i = 0; i < m_str.length; i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (m_str[i] == vowel[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println(count_vowel("asdsdas  fas   fghio"));
        ;

    }

}