/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201700556.dinamico;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import proyecto_2_201700556.*;

/**
 *
 * @author juare
 */
public class Login
{
    JPanel login=new JPanel();
    JLabel titulo_login =new JLabel();
    JLabel usuario_label=new JLabel();
    JLabel contrasena_label=new JLabel();
    JTextField usuario_texto=new JTextField(); 
    JPasswordField contrasena_texto= new JPasswordField();
    JButton boton_login=new JButton();
    JFrame pintura=new JFrame();
 
    public Login(){
        
       pintura. setTitle("Login");
       pintura .setBounds(300, 75, 800, 500);
      pintura . setVisible(true);
        login = new JPanel();
        login.setBackground(Color.LIGHT_GRAY);
       pintura. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pintura.setContentPane(login);
        login.setLayout(null);
        titulo_login = new JLabel("LOGIN");
        usuario_label = new JLabel("Usuario");
        contrasena_label = new JLabel("Contraseña");
        usuario_texto = new JTextField();
        contrasena_texto = new JPasswordField();
        boton_login = new JButton("Ingresar");
         //caja de texto
        login.add(usuario_texto);
        usuario_texto.setBounds(300, 150, 155, 25);

        login.add(contrasena_texto);
        contrasena_texto.setBounds(300, 225, 155, 25);
    
        //etiquetas
        login.add(contrasena_label);
        contrasena_label.setBounds(345, 200, 155, 25);
        contrasena_label.setForeground(Color.white);

        login.add(usuario_label);
        usuario_label.setBounds(350, 120, 155, 25);
        usuario_label.setForeground(Color.white);

        //titulo
        login.add(titulo_login);
        titulo_login.setBounds(355, 50, 100, 30);
        titulo_login.setForeground(Color.white);

        //boton
        login.add(boton_login);
        boton_login.setBounds(330, 280, 100, 25);
        boton_login.setBackground(Color.white);
        
    }
    public void buscar()
    {
    
           ActionListener buscar = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
               
                
                 Archivo m=new Archivo();
                 m.Leer();
                

                
            }
        };
    
    boton_login.addActionListener(buscar);
    
    
    }
    
}
