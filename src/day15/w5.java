package day15;

public class w5 {
    public static void main(String[] args) {
        //Example 5: Type code to print integers from 0 to 100 without using any number in your code
        for(int i='a'-'a'; i<'e'; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        /*
            We can use "int" as data type for char data
            If you use "char" as data type for "char"s Java gives you the character
            If you use "int" as data type for "char"s Java gives you the ASCII value of the char
         */
        char ch = 'm';
        System.out.println(ch);// m

        int dh = 'm';
        System.out.println(dh);// 109
    }
}
