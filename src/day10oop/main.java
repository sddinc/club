package day10oop;

public class main {
    public static void main(String[] args) {
        pen p1= new pen();
        salary s1= new salary();
        tva tva1 =new tva();

        System.out.println("motorina 100lei cu tva="+tva1.motorina(100));
        System.out.println("motorina 20lei cu tva="+tva1.book(20));


        System.out.println(s1.yearMoreThen10(1200));
        System.out.println(s1.yearLessThen10(1200));

        pen p2= new pen();
        matematica m1=new matematica();

        System.out.println(p1.color);
        p1.color="red";
        System.out.println("new color is "+p1.color);
        System.out.println(p2.color);
        p1.click();
        if(pen.clicked){
            System.out.println("pen is clicked");
        }else{
            System.out.println("pen is unClick");
        }

        m1.add(2,5);

        System.out.println(m1.div(40,3));

    }

}
