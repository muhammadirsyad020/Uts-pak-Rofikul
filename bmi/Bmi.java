
package bmi;

import java.util.Scanner;

public class Bmi {
    
    public static void main(String[] args) {
        
        Scanner masukkan = new Scanner(System.in);
        
        float berat,tinggi,bmi,meter;
        
        System.out.println("MASUKKAN TERLEBIH DAHULU BERAT DAN TINGGI BADAN ANDA");
        System.out.println("Masukkan berat badan anda: ");
        berat = masukkan.nextFloat();
        System.out.println("Masukkan tinggi badan anda: ");
        tinggi = masukkan.nextFloat();
        
        
        meter = tinggi/100;
        bmi = (berat/(meter*meter));
        
        System.out.println("===================");
        System.out.println("BMI :"+bmi+ " ");
        
        if(bmi <18.5){
            System.out.println("KURUS");
        }
        
        else if(bmi <=22.9){
            System.out.println("NORMAL");
        }
        
        else if(bmi <24.9){
            System.out.println("GEMUK");
        }
        
        else{
            System.out.println("OBESITAS");
        } 
        
    }
    
}
