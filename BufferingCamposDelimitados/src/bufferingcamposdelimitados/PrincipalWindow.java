/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferingcamposdelimitados;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Arles Cerrato
 */
public class PrincipalWindow extends JFrame{
    
    //Atributes
    
    private JPanel principal_panel;
    
    //Constructor
    
    public PrincipalWindow(String title){
        super(title);
        configuration();
    }
    
    
    
    //Administration methods
    
    private void configuration(){
        setSize(500,600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
