/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sc303.project1;

/**
 *
 * @author Laboratorios
 */
public class Project1 {
    //atributos
    public String nombreCliente;
    public String cedula;
    public String mesaPreferida;
    public int telefono;
            
    //metodos
    public int ordenar(){
        String res = JOptionPane.showInputDialog("Desea ordenar (Y/N)");
        if(res == "Y"){
            return 1;
        }else{
            return 0;
        }
    }
    public void seleccionarMesa(){
        String res = JOptionPane.showInputDialog("Desea seleccionar una mesa (Y/N):");
        if(res == "Y"){
            String res2 = JOptionPane.showInputDialog("La misma mesa de siempre? (Y/N)");
            if(res2 == "Y"){
                this.mesaPreferida = "Mesa 36";
            }else{
                this.mesaPreferida = "Mesa 20";
            }
            JOptionPane.showMessageDialog(null, "se le asgno la:" +this.mesaPreferida);
        }else{
            JOptionPane.showMessageDialog(null, "Por favor selecciones una mesa");
        }
    }
}
