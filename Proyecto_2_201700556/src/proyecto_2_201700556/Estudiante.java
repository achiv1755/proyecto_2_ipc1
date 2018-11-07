
package proyecto_2_201700556;

import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyecto_2_201700556.dinamico.Login;

public class Estudiante extends     Usuario
{
     int contador_cursos=0;
public  Estudiante siguiente;
public Estudiante anterior;
public Estudiante(){};
public Estudiante (String carnet,String DPI,String nombre,String correo,String direccion,int Credito,String password)
{
    this.carnet=carnet;
    this.DPI=DPI;
    this.nombre=nombre;
    this. correo=correo;
    this .direccion=direccion;
    this .Credito=Credito;
    this .password=password;
    siguiente=null;
    anterior=null;
}

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

        public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCredito() {
        return Credito;
    }

    public void setCredito(int Credito) {
        this.Credito = Credito;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 Estudiante obtenerSiguiente()
    {
    return  siguiente;
    
    }
   
   public void enlazar_siguiente(Estudiante siguiente){this.siguiente=siguiente;}
    Estudiante obtenerAnterior()
    {
    
    return anterior;
    }
public void enlazar_anterior(Estudiante anterior){this.anterior=anterior;}
public void pagina_principal()
{

    JFrame marco =new JFrame("USUARIO");
    JPanel pintar=new JPanel();
    JLabel titulo =new JLabel("USUARIO");
     
    JButton boton_asignar=new JButton("ASIGNAR CURSO");
    JButton boton_ver=new JButton("VER CURSOS APROBADOS");
    marco.setVisible(true);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pintar.setVisible(true);
    marco.setBounds(200, 100, 500, 300);
    pintar.setBounds(200, 100, 500, 300);
    pintar.setLayout(null);
    marco.setResizable(false);
    titulo.setBounds(230, 50, 150, 30);

    boton_ver.setBounds(50, 100, 200, 30);
   
    boton_asignar.setBounds(280, 100, 150, 30);
    
    boton_ver.setBackground(Color.white);
    
    boton_asignar.setBackground(Color.white);
    JLabel log_out=new JLabel("LOG OUT");
    log_out.setBounds(400, 10, 80, 30);
    pintar.add(log_out);
    
    
    
    
    marco.add(pintar);
    pintar.add(titulo);
    
    pintar.add(boton_ver);
    pintar.add(boton_asignar);
   

     ActionListener ver_cursos = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                //marco.setVisible(false);
                Admin a=new Admin();
                a.add();
               }};
    
     ActionListener asignar_cursos = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {  marco.setVisible(false); asignar_curso();}};
    
    boton_asignar.addActionListener(asignar_cursos);
    boton_ver.addActionListener(ver_cursos);
       log_out.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);
                Login login=new Login();
                login.buscar();

            }
        });
       
}
private void asignar_curso()
{

        Archivo Archivo=new Archivo();
    JFrame marco =new JFrame("ASIGNAR CURSO");
    JPanel pintar=new JPanel();
    JLabel titulo =new JLabel("ASIGNAR CURSO");
     
    JButton boton_confirmar=new JButton("CONFIRMAR");
    
    marco.setVisible(true);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pintar.setVisible(true);
    marco.setBounds(200, 100, 1200, 500);
    pintar.setBounds(200, 100, 500, 300);
    pintar.setLayout(null);
    marco.setResizable(false);
    titulo.setBounds(600, 50, 150, 30);
 JLabel regresar=new JLabel("REGRESAR");
    regresar.setBounds(1100, 45, 80, 30);
    pintar.add(regresar);
     
    boton_confirmar.setBounds(1000, 400, 150, 30);
    
     
    boton_confirmar.setBackground(Color.white);
    JLabel log_out=new JLabel("LOG OUT");
    log_out.setBounds(1100, 10, 80, 30);
    pintar.add(log_out);
    
 
    
    
    
    JComboBox box_semestre =new JComboBox();
    JComboBox box_year =new JComboBox  ();
    JComboBox box_curso=new JComboBox();
    box_semestre.setBounds(40+80, 150, 150, 30);
    box_year.setBounds(200+80, 150, 75, 30);
    box_curso.setBounds(300+80, 150, 220, 30);
    box_semestre.addItem("");
    box_semestre.addItem("Primer Semestre");
    box_semestre.addItem("Segundo Semestre");
    
    box_curso.addItem("");
     
    box_year.addItem("");
    for (int i = 17; i < 26; i++) 
    {
        
        box_year.addItem("20"+i);
    }
    
    JButton  asignar =new JButton("ASIGNAR");
    asignar.setBackground(Color.white);
    asignar.setBounds(667,150,100,30);
    pintar.add(asignar);
    
 
    
  

    
     ActionListener asignar_accion = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) 
            {
                if (box_semestre.getSelectedItem().equals("") ||box_curso.getSelectedItem().equals("")||box_year.getSelectedItem().equals("")) 
                {
                JOptionPane.showMessageDialog(null, "Llene todos los campos");    
                }else
                {
                
                
                contador_cursos++;
                }  
                 
               }};
    asignar.addActionListener(asignar_accion);
    
    
    if (!Archivo.curso_vacio())
    {
        Curso aux=Archivo.curso_primero;
         do
         {
             box_curso.addItem(aux.getNombre());
             aux=aux.siguiente;
         }while(Archivo.curso_primero!=aux);
    }
    
    
    pintar.add(box_semestre);
   pintar.add( box_year);
    pintar.add(box_curso);
    marco.add(pintar);
    pintar.add(titulo);
   
    pintar.add(boton_confirmar);
   String data[][]=new String [contador_cursos][8];
      String tituloo[] = {"Codigo", "Curso", "Catedratico", "Credito", "Lab", "Seccion","Pre-requisito", "Pos-requitito","Asignar"};

        DefaultTableModel tabla = new DefaultTableModel(data, tituloo) {
            @Override
            public boolean isCellEditable(int filas, int columna) {
                if (columna >= 0) {
                    return false;
                }
                return super.isCellEditable(filas, columna);
            }
        };
        JTable lista_usuario = new JTable(tabla);

        JScrollPane scroll = new JScrollPane(lista_usuario);
        pintar.add(scroll);
        scroll.setBounds(100, 200, 1000, 150);
    
    
  log_out.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);
                Login login=new Login();
                login.buscar();

            }
        });
  regresar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);
                
                pagina_principal();

            }
        });
  
}

 
     
    

}
