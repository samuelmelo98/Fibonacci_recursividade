/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Melo
 */

public class Fibonacci {

    /**
     * @param args the command line arguments
     */
     private double Fib(double n){
         
         if(n <=1){
        return 1;
         }
         else{
             //recursividade a função chama a propria função 
             return Fib(n-1) + Fib(n-2);
         }
    }
     
     public String  mostrar(){
           int j;
           int[] vetor;
           vetor = new int[2];
       
        for( j=0; j<10;j++){
        
         //  JOptionPane.showMessageDialog(null, vetor[j]);
          
        
           
        
       }
      return String.valueOf(vetor[j]); 
       }
      
    public static void main(String[] args) {
        // TODO code application logic here
        double[] vetor;
        int j=0;
     
        JOptionPane p = new JOptionPane();
       int y=Integer.parseInt( JOptionPane.showInputDialog(null,"valor:"));
        vetor = new double[y];
        //Scanner s = new Scanner(System.in);
        //System.out.println("Sequencia de Fibonacci:");
        //double x=s.nextDouble();
        double x=y;
       Fibonacci fib = new Fibonacci();
      // double x=100;
       //int res=fib.Fib(x);
       // System.out.println(fib.Fib(x));
        for(int i =0; i<x; i++){
        //System.out.println(fib.Fib(i+1));
            
            
            
                
           vetor[i]= fib.Fib(i+1);
           System.out.println(vetor[i]);
         //  JOptionPane.showMessageDialog(null, vetor[i]);
          
            
            
        
       }
      JOptionPane.showMessageDialog(null,fib.mostrar());
        
    }
     
     
}
