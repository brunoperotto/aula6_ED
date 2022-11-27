/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author bperotto
 */
public class NewMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        String n,aux,m;

        n = JOptionPane.showInputDialog("Insira uma frase");
        System.out.println("A frase inserida foi: "+n);
        System.out.println("------------------------");
        int tam = n.length();
        aux = "";
        
        for(int i=tam-1;i>=0;i--){
            m = Character.toString(n.charAt(i));
              pilha.push(m);
              pilha.pop();
              aux = aux + n.charAt(i);
            }
        
        pilha.imprimir();
        System.out.println("\n---------------\n"+aux);

    }

}
