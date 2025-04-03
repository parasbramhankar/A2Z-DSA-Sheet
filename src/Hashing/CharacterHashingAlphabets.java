package Hashing;

import java.util.Scanner;

public class CharacterHashingAlphabets {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String");
        String str=sc.next().toUpperCase();

        int []arr=new int[26];
        int n=str.length();
      //Precompute
        for(int i=0;i<n;i++){
            arr[str.charAt(i)-'A']+=1;
        }

      //fetch

        System.out.println("Number of character to search ? ");
        int num=sc.nextInt();

        while (num-->0){
            System.out.println("Enter the character: ");
            char ch=sc.next().charAt(0);

            System.out.println("Frequency: "+arr[ch-'A']);
        }


        sc.close();



    }
}
