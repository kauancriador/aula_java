/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maior.valor;

import javax.swing.JOptionPane;

/**
 *
 * @author caio.alunos
 */
public class MaiorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // var 
        int numero1, numero2;
        
        // 2 passo -  entrada
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primiero numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo numero"));

        
        // 3 passo
       if(numero1 > numero2){
        JOptionPane.showMessageDialog(null, "o numero 1 é MAIOR e o numero 2 e o meno");
           
       } 
     
       else if (numero2 > numero1){
        
      JOptionPane.showMessageDialog(null,"numero 2 é MAIOR e o numero 1 e o meno");
       }
       
       else {
            JOptionPane.showMessageDialog(null,"os numeros sao iguais");
       }
    }
    
}

 