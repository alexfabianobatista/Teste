package br.edu.utfpr.javaexception;

import javax.swing.JOptionPane;

/*
exemplo de tratamento de exceção
*/
public class Exemplo1 {
    public static void main(String[] args) {
        int numero = -1;
        
        String res = JOptionPane.showInputDialog("Informe um número: ");
        
        try{
            numero = Integer.valueOf(res);
            
            System.out.println("O número lido foi: " + numero); 
            
            if (numero == 10) {
                float a = numero /0;
            }
        } catch(NumberFormatException e) {
            System.out.println("O número é inválido!");
            JOptionPane.showMessageDialog(null, "Formato de número inválido!");
            
            //e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("Opeação inválida: " + e.getMessage()); 
        }
        
        finally {
            System.out.println("O número lido foi: " + numero); 
        }
    }
}