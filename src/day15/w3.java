package day15;

public class w3{
    public static void main(String[] args) {
        //Example 3: Type "odd integers" from 68 to 13 in the same line with a space between consecutive integers
        for(int i=68; i>64; i--){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
