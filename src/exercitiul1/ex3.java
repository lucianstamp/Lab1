package exercitiul1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("n=");
        int n=scanner.nextInt();
        int i;
        int k=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0){k++;
            System.out.println(i);}
        }
        if(k==2) System.out.println("numarul este prin");
    }
}
