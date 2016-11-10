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
        switch(selector){
            case 1:
        // condicion para salir del bucle
        int salir=0;
        //con este while hacemos que se vuelva a ejecutar el codigo una vez acertado el numero
        while (salir!=1){
        int numero=0;
        //Aki pide el numero, comprueba que está entre 1 y 50, sino lo vuelve a pedir
        //a no ser k pongas 999 en cuyo caso sale del bucle
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Jugador 1: Elige un numero del 1 al 50\n Escribe 999 para salir"));
            if (numero==999){
                salir=1;
                //cambio el numero a 1 cuando elejimos 999 para que salga del bucle do while
                numero=1;
            }
        
        }
        while (numero<1||numero>50);
        //si la condicion de salir se cumple no ejecuta el juego y salta al else de despedida
        if (salir!=1){
        //pide al jugador 2 que intente adivinar el numero
            int numeroBuscar=Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador 2: Adivina el numero entre 1 y 50"));
            do{
                //si es menor que el numero elegido por el jugador lo indica con un mensaje
                if (numeroBuscar>numero){
                    JOptionPane.showMessageDialog(null,"El numero que buscas es menor que "+numeroBuscar);
                    numeroBuscar=Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador 2: elije otro numero menor que "+numeroBuscar));
                }
                //igual que arriba para el caso de que sea mayor
                else if (numeroBuscar<numero){
                    JOptionPane.showMessageDialog(null,"El numero que buscas es mayor que "+numeroBuscar);
                    numeroBuscar=Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador 2: elije otro numero mayor que "+numeroBuscar));
                }
            }
            //sigue en este bucle hasta que el numero sea igual al elegido
            while (numeroBuscar!=numero);
            //al acertar salta este mensaje (pq salimos del bucle anterior)
            JOptionPane.showMessageDialog(null,"Has Acertado! el numero era "+numeroBuscar);
    
        }
        //else de despedida
        else JOptionPane.showMessageDialog(null,"Gracias por jugar");
        }
            case 2:
                Random rd1=new Random();
                int salir2=0;
                while (salir2!=1){
                    int numeroIA=rd1.nextInt(49)+1;
                    int numeroBuscar=Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador 2: Adivina el numero entre 1 y 50\n Escribe 999 para salir"));
                    if (numeroBuscar==999){
                        salir2=1;
                    }
                    if(salir2!=1){
                        do{
//                            int diferencia=0;
//                            if(numeroBuscar>numeroIA){
//                               diferencia=numeroBuscar-numeroIA; 
//                            }
//                            else if (numeroBuscar<numeroIA){
//                               diferencia=numeroIA-numeroBuscar; 
//                            }
                            //Uso math para hallar el valor absoluto y escribir menos codigo
                            int diferencia=Math.abs(numeroIA-numeroBuscar);
                            if (diferencia<=5){
                                JOptionPane.showMessageDialog(null,"Muy cerca");
                            }
                            else if (diferencia>5&&diferencia<10){
                                JOptionPane.showMessageDialog(null,"Cerca");
                            }
                            else if (diferencia>=10&&diferencia<=20){
                                JOptionPane.showMessageDialog(null,"Lejos");
                            }
                            else if (diferencia>20){
                                JOptionPane.showMessageDialog(null,"Muy lejos");
                            }
                            numeroBuscar=Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador 2: elije otro numero"));
                            
                        }
                        while (numeroIA!=numeroBuscar);
                        JOptionPane.showMessageDialog(null,"Has Acertado! el numero era "+numeroBuscar);
                    
                    }
                    else JOptionPane.showMessageDialog(null,"Gracias por jugar");
                }
        }
    
    }
}