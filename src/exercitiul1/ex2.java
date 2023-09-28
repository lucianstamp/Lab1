package exercitiul1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ex2 {

    public static void main(String[] args) throws IOException {
        String nume_fis_in="src/exercitiul1/in.txt";
        String nume_fis_out="src/exercitiul1/out.txt";
        BufferedReader flux_in;
        flux_in= new BufferedReader(new FileReader(nume_fis_in));
        String linie= flux_in.readLine();
        while((linie=flux_in.readLine())!=null )
        {

        }

    }
}
