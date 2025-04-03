package Hashing;

import java.util.Scanner;

public class CharacterHashing_AllCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String");
        String str=sc.next();

        int []arr=new int[256];
        int n=str.length();

        //Precompute

        for(int i=0;i<n;i++){
            arr[str.charAt(i)]++;
        }

        //fetch
        System.out.println("Enter number of character to search ? ");
        int num=sc.nextInt();

        while (num-->0){
            System.out.println("Enter character to search: ");
            char ch=sc.next().charAt(0);
            System.out.println("Frequency: "+arr[ch]);
        }

        sc.close();
    }
}
