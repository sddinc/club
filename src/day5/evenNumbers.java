package day5;
public class evenNumbers {
    public static void main(String[] args) {
        int numbers[]={12,45,86,6,40,205};
        int cnt=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
