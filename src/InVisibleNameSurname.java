public class InVisibleNameSurname {
    public static void main(String[] args) {
        String str="Alin Vlademir";
        String str2="";

        for (int i=0; i<str.length();i++){
            if(i==0){
                str2=str2+str.substring(i,i+1);

            }else if(str.charAt(i)==' '){
                i=i+1;
                str2=str2+" "+str.substring(i,i+1);

            }else{
                str2=str2+"*";
            }
        }
        System.out.printf(str2);
    }
}
