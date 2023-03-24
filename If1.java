/*Nama : Atsilah Rifqah Wardani*/
/*NIM  : 13020210060*/
/*Hari/Tanggal : Jum'at 24-03-2023*/
/*Waktu : 17.20*/

import java.util.Scanner;

public class If1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Kamus */
        Scanner masukan=new Scanner(System.in);
        int a;
        /* Program */
        System.out.print ("Contoh IF satu kasus \n");
        System.out.print ("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if (a >= 0)
        System.out.println ("\nNilai a positif "+ a);
    }
}