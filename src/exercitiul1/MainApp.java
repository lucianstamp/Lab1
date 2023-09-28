package exercitiul1;
import java.io.*;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);
      System.out.print("lungime=");
      int lungime=scanner.nextInt();
      System.out.print("latime=");
      int latime=scanner.nextInt();
      int perimetru= 2*lungime + 2*latime;
      int aria= lungime*latime;
        System.out.println("Perimetru= "+perimetru);
        System.out.println("Aria= "+aria);
    }
}
