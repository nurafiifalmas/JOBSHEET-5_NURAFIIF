/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author user
 */
public class OperatorUnary {
    public static void main(String[]args) {
        int x = 1;
        int y = 0;
        
        y = ++x;
        System.out.println("a. Nilai y sekarang :" +y);
        System.out.println("   Nilai x sekarang :" +x);
        
        y = --x;
         System.out.println("b. Nilai y sekarang :" +y);
         System.out.println("   Nilai x sekarang :" +x);
    }
}
