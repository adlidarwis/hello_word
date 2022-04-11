/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Biodata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Scanner inputbiodata = new Scanner(System.in);
       
       System.out.println("Masukan Nama : ");
       String masuknama  = inputbiodata.nextLine();
       
       System.out.println("Masukan Tempat Lahir : ");
       String masuktempat  = inputbiodata.nextLine();
       
       System.out.println("Masukan Tanggal Lahir : ");
       String tanggallahir = inputbiodata.nextLine();
       
       System.out.println("Masukan Hobi : ");
       String masukhobi  = inputbiodata.nextLine();
       
       System.out.println("Masukan Zodiak : ");
       String masukzodiak  = inputbiodata.nextLine();
       
       System.out.println("Masukan Makanan Favorit : ");
       String masukmakanan  = inputbiodata.nextLine();
       
       System.out.println("Masukan Cita-cita : ");
       String masukcita  = inputbiodata.nextLine();
       
       
       System.out.println("===TAMPILKAN INPUT BIODATA===");
       System.out.println("Nama Mahasiswa : " + masuknama);
       System.out.println("Tempat Lahir : " + masuktempat);
       System.out.println("Tanggal Lahir : " + tanggallahir);
       System.out.println("Hobi : " + masukhobi);
       System.out.println("Zodiak : " + masukzodiak);
       System.out.println("Cita-cita : " + masukcita);
       System.out.println("=============================");
       
            
       
       
    
       
        // TODO code application logic here
    }
    
}
