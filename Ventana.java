package tarea1;

import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xavier
 */
public class Ventana extends JFrame{
    
    public Ventana(){
        super("Tarea 1");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp = new JPanel();
        GridBagLayout lo = new GridBagLayout();
        jp.setLayout(lo);
        GridBagConstraints gbc= new GridBagConstraints();
        JLabel lab1 = new JLabel("Nome :");
        JLabel lab2 = new JLabel("Password: ");
        JTextField tex1 = new JTextField(10);
        JTextField tex2 = new JTextField(10);
        JTextArea ta1 = new JTextArea(2,2);
        JButton b1 = new JButton("PREMER");
        JButton b2= new JButton("LIMPAR");
        //Constraints de lab1
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=0;
        jp.add(lab1,gbc);
        //Constraints de tex1
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=0;
        jp.add(tex1,gbc);
        //Constraints de lab2
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=1;
        jp.add(lab2,gbc);
        //Constraints de tex2
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=1;
        jp.add(tex2,gbc);
        //Constraints de text area
        gbc.fill=GridBagConstraints.BOTH;
        gbc.insets=new Insets(2,0,2,0);
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridwidth=2;
        gbc.gridheight=2;
        jp.add(ta1,gbc);
        //Constraints del boton PREMER
        gbc.gridheight=0;
        gbc.gridwidth=1;
        gbc.insets=new Insets(0,0,0,0);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=4;
        jp.add(b1,gbc);
        //Constraints del boton LIMPAR
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=4;
        jp.add(b2,gbc);
        //Añade el panel al frame
        this.add(jp);
    }
    
}
