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
    
    Admin admin=new Admin();
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
               
                if (usuario_texto.getText().equalsIgnoreCase(admin.getNombre())&&contrasena_texto.getText().equalsIgnoreCase(admin.getPassword())) {
                   
                    pintura.setVisible(false);
                    admin.add();
                }
                else if (buscar_estudiante(usuario_texto.getText(),contrasena_texto.getText())){buscar_estudiante_dato(usuario_texto.getText(),contrasena_texto.getText());}
                else if (buscar_catedratico(usuario_texto.getText(),contrasena_texto.getText())){buscar_catedratico_dato(usuario_texto.getText(),contrasena_texto.getText());}
                else{ JOptionPane.showMessageDialog(null, "Usuario no encontrado", "alerta", JOptionPane.WARNING_MESSAGE);}

                
            }
        };
    
    boton_login.addActionListener(buscar);
    
    
    }
    private boolean buscar_estudiante(String nombre,String contraseña)
    { Estudiante aux=Archivo.estudiante_primero;
        if (aux==null) {
            return false;
        }else{
        
        do {
            if (nombre.equalsIgnoreCase(aux.getCarnet())&&contraseña.equalsIgnoreCase(aux.getPassword())) {
                return  true;
            }
            aux=aux.siguiente;
        } while (aux!=Archivo.estudiante_primero&&Archivo.estudiante_primero!=Archivo.estudiante_ultimo);}
        
    
    return false;
    }
    private boolean buscar_catedratico(String nombre,String contraseña)
    {  Catedratico aux=Archivo.catedratico_primero;
        if (aux==null) {
            return false;
        }else{
        do {
            
          if (nombre.equalsIgnoreCase(aux.getNombre())&&contraseña.equalsIgnoreCase(aux.getPassword()))
          {
              return true;
            }
            
            aux=aux.siguiente;
        } while (aux!=Archivo.catedratico_primero&&Archivo.catedratico_primero!=Archivo.catedratico_ultimo);}
        
    return false;
    }
    
    
    
    
       private  void buscar_estudiante_dato(String nombre,String contraseña)
    {
        Estudiante aux=Archivo.estudiante_primero;
        do {
            if (nombre.equalsIgnoreCase(aux.getCarnet())&&contraseña.equalsIgnoreCase(aux.getPassword())) {
               pintura.setVisible(false);
                
                    Estudiante a=new Estudiante(aux.getCarnet(), aux.getDPI(), aux.getNombre(),aux.getCorreo(),aux.getDireccion(),aux.getCredito(), aux.getPassword());
              a.pagina_principal();
                            
               
            }
            aux=aux.siguiente;
        } while (aux!=Archivo.estudiante_primero&&Archivo.estudiante_primero!=Archivo.estudiante_ultimo);
        
     
    }
    private void buscar_catedratico_dato(String nombre,String contraseña)
    {  Catedratico aux=Archivo.catedratico_primero;
    
        do {
            
          if (nombre.equalsIgnoreCase(aux.getNombre())&&contraseña.equalsIgnoreCase(aux.getPassword()))
          {
              pintura.setVisible(false);
              Catedratico a=new Catedratico(aux.getNombre(),aux.getPassword());
              a.pagina_principal(); 
               
              
            }
            
            aux=aux.siguiente;
        } while (aux!=Archivo.catedratico_primero&&Archivo.catedratico_primero!=Archivo.catedratico_ultimo);
        
  
    }
    
    
    
}
