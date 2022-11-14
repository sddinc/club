package day7;
public class forEach {
    public static void main(String[] args) {
        int numbers[]={23,45,67,23,12};
        int sum=0;
        String cities[]={"iasi","ploiesti","CT","Bucharest"};
        for (int i = 0; i <numbers.length ; i++) {
            System.out.printf(numbers[i]+"+");
        }
        for (int num:numbers) {
            sum=sum+num;
        }
        System.out.println(",Total="+sum);
    }
}
