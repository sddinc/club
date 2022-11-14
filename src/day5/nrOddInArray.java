package day5;
public class nrOddInArray {
    public static void main(String[] args) {
        int arrNum[]={23,45,44,2,78};// size=5, arrNum[3]=2
        // arrays
        int sum=0;
        for (int i = 0; i < arrNum.length; i++) {// arrNum.length; nr size of array
            if(arrNum[i]%2==0){//23%2= 1 false, 45%2=1 false,
                System.out.println(arrNum[i]);
                sum=sum+arrNum[i];
            }
        }
        System.out.println(sum);
    }
}
