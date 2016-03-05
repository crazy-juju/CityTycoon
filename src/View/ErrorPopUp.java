/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author julien
 */
public class ErrorPopUp extends JDialog implements ActionListener{
    JLabel error_mess= new JLabel();
    JButton confirm= new JButton(" OK ! ");
    
    public ErrorPopUp(String text){
        confirm.addActionListener(this);
        error_mess.setText(text);
        this.setTitle(" ERROR ");
        this.getContentPane().add(error_mess, BorderLayout.CENTER);
        this.getContentPane().add(confirm,BorderLayout.LINE_END);
        this.pack();
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==confirm){
            this.dispose();
        }
    
    }
    
}
