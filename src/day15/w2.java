package day15;

public class w2 {
    public static void main(String[] args) {
        //Example 2: Type "even integers" from 11 to 44 in the same line with a space between consecutive integers
        for(int i=11; i<45; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
