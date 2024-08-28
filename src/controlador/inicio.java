package controlador;

import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int NCasos = entrada.nextInt();


        int NDecimos = 0;

        

        for ( int n = 0; n < NCasos; n++) {

          

            NDecimos = entrada.nextInt();

            if ( NDecimos <= 10000) {

              

                int NComprables = 0;

                 int[] decimos = new int[NDecimos];

                

                 String[] Sdecimos = new String[NDecimos];

                
                 String TodosLosDecimos="";

                 entrada.nextLine();

                 TodosLosDecimos = entrada.nextLine();

                

                 Sdecimos = TodosLosDecimos.split(" ");

                

                
                for (int i = 0; i < NDecimos; i++) {

                    decimos[i] = Integer.parseInt(Sdecimos[i]);
             
                    if (decimos[i] >= 100000) {entrada.close(); System. exit(0); }

                    else if (decimos[i] % 2 == 0) { NComprables++;}
               

                }

                 System.out.println(NComprables);
                 
               }

            }
    }
}