/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr1a_labiii;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel_Nascimento
 */
public class EXR1a_LABIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String altura, largura, comprimento;
        altura = JOptionPane.showInputDialog("Digite a altura do pacote:");
        largura = JOptionPane.showInputDialog("Digite a largura do pacote:");
        comprimento = JOptionPane.showInputDialog("Digite a comprimento do pacote:");
        
        Float l = Float.parseFloat(largura);
        Float a = Float.parseFloat(altura);
        Float c = Float.parseFloat(comprimento);
        Float resultado = a*l*c;
        
        JOptionPane.showMessageDialog(null, "A volume: " + resultado + " cm³.", "Resultado", JOptionPane.PLAIN_MESSAGE);
        
        
    }
    
}
