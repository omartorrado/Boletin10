/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class Boletin10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int selector=Integer.parseInt(JOptionPane.showInputDialog("Elije modo de juego\nPulsa 1 para modo 2 jugadores\nPulsa 2 para modo vs IA"));
        Juego j1=new Juego();
        switch(selector){
            case 1:
                j1.jugar2P();
            
            case 2:
                j1.jugarIA();
            
            default:
                break;
        }
    
    }
}