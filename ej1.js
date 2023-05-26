package com.sc303.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorios
 */
public class Mavenproject1 {
    
    public static void main(String[] args) {
        
        //Variables
        int num;
        int num2;  
        int num3;
        int num4;
        float resSuma;
        double resPromedio;
        
        //Introduccion datos
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        num4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        //Proceso de datos
        PesSuma = num + num2 + num3 + num4;
        resPromedio = resSuma / 4;

        //Salida datos
        System.out.println("La suma total de los datos es: "+resSuma);
        System.out.println("El promedio de los datos es: "+resPromedio);
        
        
        //trabajo 2
        String nombre = "";
        
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
       JOptionPane.showMessageDialog(null,("Hola " +nombre+ ", bienvenida a este programa desarrollado en JAVA con Netbeans."));
