/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresodatosporcuadrodiálogo;

/**
 *
 * @author Usuario
 */

import javax.swing.JOptionPane;

public class IngresoDatosPorCuadroDiálogo {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        
               
                String p1 = JOptionPane.showInputDialog("Ingresá el número ID de IMDb");
                                //El número ID a ingresar es el 12345678910.
        
                long peli1 = Long.parseLong(p1);   
               
     
                JOptionPane.showMessageDialog(null,"El número ID de IMDb de tu película favorita es: " + peli1);
        
        }
        
}    
    
      
    