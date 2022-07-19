/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entendido;

/**
 *
 * @author kayop
 */
import javax.swing.JOptionPane;

public class Entendido {
    public static void main(String[] args) {
       
        String nome[]= {"Não","Não"};
       
       int a= JOptionPane.showOptionDialog (null,"Entendido?", "teste", 0, 1, null,nome,1);
        while(a == 0){
            a= JOptionPane.showOptionDialog (null,"Entendido?", "teste", 0, 1, null,nome,1);
        }
       
    }
}
