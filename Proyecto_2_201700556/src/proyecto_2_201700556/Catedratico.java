/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201700556;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import proyecto_2_201700556.dinamico.Login;

/**
 *
 * @author juare
 */
public class Catedratico extends Usuario
{
    public Catedratico siguiente;
    public Catedratico(){}
public Catedratico (String nombre, String password)
{
 
    this.nombre=nombre;
   
    this .password=password;
    siguiente=null;

}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

     Catedratico  obtenersiguiente() {
         return siguiente;
         
    }
public void enlazarsiguiente(Catedratico siguiente){this.siguiente=siguiente;}
    
    public void pagina_principal()
    {
        JFrame marco=new JFrame("CATEDRATICO");
        JPanel panel=new JPanel();
        JLabel log_out=new JLabel("LOG OUT");

        JLabel titulo =new JLabel("CATEDRATICO");
        JButton  boton=new JButton("INGRESO DE NOTAS");
         marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        marco.setBounds(75, 75, 500,300 );
        marco.add(panel);
        panel.add(boton);
        panel.add(log_out);
        
        panel.add(titulo);
        panel.setLayout(null);
        titulo.setBounds(200, 50, 150, 30);
       log_out.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);
                Login login = new Login();
                login.buscar();}});
        log_out.setBounds(400, 30, 60, 30);
        boton.setBounds(160, 100, 150, 35);
        boton.setBackground(Color.white);
        
           ActionListener agregar_nota = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                marco.setVisible(false);
               Ingresar_Nota a=new Ingresar_Nota();
                a.main();
            }
        };
        boton.addActionListener(agregar_nota);
        
        
        
    }
    
}
