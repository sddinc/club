package day44;

public class test2 {
    public static void main(String[] args) {
        String str="AAAAAB";
        int cnt=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.substring(i,i+1).equals(str.substring(i+1,i+2))){
                cnt++;
            }

        }

    }
}
