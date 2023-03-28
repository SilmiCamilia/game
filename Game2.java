/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game2;

/**
 *
 * @author rachmanhakim
 */
import java.util.Scanner;
public class Game2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        player2 main = new player2();
        System.out.println("who's playing rn? ");
        main.nama1 = input.nextLine();
        System.out.print("speed "+main.nama1+" = ");
        main.speed = input.nextInt();
        System.out.println(" ");
        
        
        do{
          main.run();
          main.attack();
          System.out.println(" ");
          main.isDead();
        } while(main.hp2>0&&main.hp1>0);  
        
    }
    
}
