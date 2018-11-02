/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201700556.dinamico;

import java.util.HashSet;
import java.util.Set;
import javax.swing.*;

/**
 *
 * @author juare
 */
public class Administrador extends JFrame
{
    
   public void add()
   {
    JFrame marco =new JFrame("Administrador");
    JPanel pintar=new JPanel();
    JLabel titulo =new JLabel("ADIMISTRADOR");
    JButton boton_reporte=new JButton("REPORTE");
    JButton boton_usuario=new JButton("USUARIO");
    JButton boton_curso=new JButton("CURSO");
    marco.setVisible(true);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pintar.setVisible(true);
    marco.setBounds(200, 100, 500, 500);
      pintar.setBounds(200, 100, 500, 500);
     pintar.setLayout(null);
     
     
     titulo.setBounds(190, 40, 150, 30);

    boton_curso.setBounds(200, 100, 100, 30);
    boton_reporte.setBounds(90, 100, 100, 30);
    boton_usuario.setBounds(310, 100, 100, 30);
      
       
    
   marco.add(pintar);
   pintar.add(titulo);
   pintar.add(boton_reporte);
   pintar.add(boton_curso);
   pintar.add(boton_usuario);
   
   
   
   
   
   
   }
   public void agregar_estudiante(){}
   public void modificar_estudiante(){}
   public void ver_estudiante(){}
   public void eliminar_estudiante(){}
   
   
   
   public void agregar_curso(){}
   public void modificar_curso(){}
   public void ver_curso(){}
   public void eliminar_curso(){}
   
   
    
    
    
}

