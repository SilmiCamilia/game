/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game2;

/**
 *
 * @author rachmanhakim
 */
import java.util.Scanner;
public class player2 {
    Scanner input = new Scanner(System.in);
    public String nama1;
    public int hp1 = 100;
    public int hp2 = 100;
    public int speed;
    public int attackDamage;
    public int attackDamage2;
    
    void run(){
        System.out.println(nama1+" "+"is running");
        System.out.println(" ");
        System.out.println("with speed "+speed);
        System.out.println(" ");
        System.out.println("hp "+nama1+" "+"= "+hp1);
        System.out.println(" ");
    }
    
    void attack(){
        System.out.println("enemy is here!!");
        System.out.println(" ");
        System.out.println("hp enemy "+"= "+hp2);
        System.out.println(" ");
        System.out.println(nama1+" "+"is Attacking enemy"); 
        System.out.print("damage yang diberikan = ");
        attackDamage = input.nextInt();
        System.out.println(" ");
        System.out.print("damage yang diterima = ");
        attackDamage2 = input.nextInt();
        hp1 = hp1-attackDamage2;
        hp2 = hp2-attackDamage;
        System.out.println(" ");
        System.out.println("hp enemy now "+"= "+hp2);
        System.out.println(" ");
        System.out.println("hp "+nama1+" now "+"= "+hp1);
    }
    void isDead(){
        if(hp1<=0){
            System.out.println(nama1+" is dead");
            System.out.println("you lose");
        }
        else if(hp2<=0){
            System.out.println("enemy is dead");
            System.out.println("you win");
        }
        else{
            System.out.println("still playing");
        
        }
    }
}
