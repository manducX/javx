// import java.util.*;
// public class Third {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter String :");
//         String sen = s.nextLine();
//         int count = 0;
//         int word_count=0;
//         sen = sen.toLowerCase();
//         for(int i=0;i<sen.length();i++){
//             if(sen.charAt(i)=='a'||sen.charAt(i)=='e'||sen.charAt(i)=='i'||sen.charAt(i)=='o'||sen.charAt(i)=='u'){
//                 count++;
//             }
//             if(Character.isLetter(sen.charAt(i))){
//                 word_count++;
//             }
//             System.out.println("NO of Vowels:"+count);
//             System.out.println("NO of Words :"+word_count);
//         }
//     }
    
// }

// import java.util.Scanner;

// public class Third {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a paragraph: ");
//         String str = scanner.nextLine();
//         String[] words = str.split("\\s+");
//         System.out.println("Total words: " + words.length);
//         String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
//         int count = 0;
//         for (String word : words) {
//             for (String vowel : vowels) {
//                 if (word.startsWith(vowel)) {
//                     count++;
//                     break;
//                 }
//             }
//         }
//         System.out.println("Vowel words: " + count);
//     }
// }

// import java.util.*;
// class Main{
//     public static void main(String [] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the paragraph");
//         String paragraph=sc.nextLine();
//         int length=paragraph.length();
//         int count=0;
//         for(int i=0;i<length;i++)
//         {
//             if(paragraph.charAt(i)=='a'||paragraph.charAt(i)=='A'||paragraph.charAt(i)=='e'||paragraph.charAt(i)=='E'||paragraph.charAt(i)=='i'||paragraph.charAt(i)=='I'||paragraph.charAt(i)=='o'||paragraph.charAt(i)=='O'||paragraph.charAt(i)=='u'||paragraph.charAt(i)=='U')
//             {
//                 count++;
//             }
//         }
//         System.out.println("The number of vowels are:"+count);
//         String [] words;

//     }
// }

import java.util.Scanner;
public class Third
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a paragraph:");
        String paragraph = sc.nextLine();
        String vowels = "";
        int totalWords = 0;
        for(int i = 0; i < paragraph.length(); i++)
      {
            if(paragraph.charAt(i) == ' ')
            {
                totalWords++;
            }
            if(paragraph.charAt(i) == 'a' || paragraph.charAt(i) == 'e' || paragraph.charAt(i) == 'i' || paragraph.charAt(i) == 'o' || paragraph.charAt(i) == 'u')
            {
                vowels += paragraph.charAt(i);
            }
        }
        totalWords++;
        System.out.println("Vowels in the given paragraph are: " + vowels);
        System.out.println("Total words in the paragraph are: " + totalWords);

    }
}