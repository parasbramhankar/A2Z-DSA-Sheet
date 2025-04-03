package Hashing;

import java.util.Scanner;

public class CharacterHashingArray {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string in Lower case: ");

        String str=scanner.next();

        int []ch=new int[26];

        //precompute
        for(int i=0;i<str.length();i++){
            ch[str.charAt(i)-'a']++;
        }

        //fetching

        System.out.println("Enter the number of test cases: ");
        int n= scanner.nextInt();


        while(n>0){

            char c=scanner.next().charAt(0);
            System.out.println(c+" : "+ch[c-'a']);
            n--;
        }

        scanner.close();

    }
}
