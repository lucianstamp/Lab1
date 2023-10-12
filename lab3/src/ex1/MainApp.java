package ex1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("val a=");
        a= scanner.nextInt();
        System.out.println("val b=");
        b=scanner.nextInt();
        System.out.println("val c=");
        c=scanner.nextInt();
        List<Parabola> parabole= new ArrayList<Parabola>();
        parabole.add(new Parabola(a,b,c));
        for(Parabola p:parabole) {
            System.out.println(p);
        }
        Parabola vf= new Parabola(a,b,c);
        vf.varf();
        System.out.println(vf.varf());







        }
    }



