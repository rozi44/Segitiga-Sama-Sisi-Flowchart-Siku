/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.bintang;

/**
 *
 * @author User
 */
public class TugasBintang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,z;
        
        for(x=1; x<5; x++){
            for(y=x; y<5; y++){
                System.out.print(" ");
            }
            for(z=1; z<=(2*x-1); z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
