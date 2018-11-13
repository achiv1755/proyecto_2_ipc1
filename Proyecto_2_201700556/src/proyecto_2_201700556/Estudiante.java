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

public class Estudiante extends Usuario {

    String year_curso = "";
    String semestre_curso = "";
    String Curso_curso = "";
    
    int contador_cursos = 0;
    Semestre semestre_buscado;
    JFrame marco2 = new JFrame();
    JLabel desasignar[] = new JLabel[4];
    public Semestre primer_semestre;
     public Semestre ultimo_semestre;
    public int semestre_tamano;
    JPanel pintar = new JPanel();
      JPanel pintar_tabla = new JPanel();
    public Estudiante siguiente;
    public Estudiante anterior;
   
    JPanel pintar20=new JPanel();
 

    public Estudiante() {
    }

    public Estudiante(String carnet, String DPI, String nombre, String correo, String direccion, int Credito, String password) {
        this.carnet = carnet;
        
        this.DPI = DPI;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.Credito = Credito;
        this.password = password;
        siguiente = null;
        anterior = null;
        primer_semestre = null;
        ultimo_semestre = null;
        
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

    Estudiante obtenerSiguiente() {
        return siguiente;

    }

    public void enlazar_siguiente(Estudiante siguiente) {
        this.siguiente = siguiente;
    }

    Estudiante obtenerAnterior() {

        return anterior;
    }

    public void enlazar_anterior(Estudiante anterior) {
        this.anterior = anterior;
    }

    public void pagina_principal() {

        JFrame marco = new JFrame("USUARIO");
        JPanel pintar2_0 = new JPanel();
        JLabel titulo = new JLabel("USUARIO");

        JButton boton_asignar = new JButton("ASIGNAR CURSO");
        JButton boton_ver = new JButton("VER CURSOS APROBADOS");
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pintar2_0.setVisible(true);
        marco.setBounds(200, 100, 500, 300);
        pintar2_0.setBounds(200, 100, 500, 300);
        pintar2_0.setLayout(null);
        marco.setResizable(false);
        titulo.setBounds(230, 50, 150, 30);

        boton_ver.setBounds(50, 100, 200, 30);

        boton_asignar.setBounds(280, 100, 150, 30);

        boton_ver.setBackground(Color.white);

        boton_asignar.setBackground(Color.white);
        JLabel log_out = new JLabel("LOG OUT");
        log_out.setBounds(400, 10, 80, 30);
        pintar2_0.add(log_out);

        marco.add(pintar2_0);
        pintar2_0.add(titulo);

        pintar2_0.add(boton_ver);
        pintar2_0.add(boton_asignar);

        ActionListener ver_cursos = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                //marco.setVisible(false);
                  x();
            }
        };

        ActionListener asignar_cursos = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                marco.setVisible(false);
                asignar_curso asignar_curso=new asignar_curso( );
            
                
                asignar_curso.setCarnet_2(carnet);
                asignar_curso.m( carnet);
 
              
            }
        };

        boton_asignar.addActionListener(asignar_cursos);
        boton_ver.addActionListener(ver_cursos);
        log_out.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);
                Login login = new Login();
                login.buscar();

            }
        });

    }
     
    public void x()
    {
    Estudiante a=Archivo.estudiante_primero;
        
        do {
            
            if (a.getCarnet().equals(carnet)) 
            {
                Semestre b=a.primer_semestre;
                do {
                    
                      System.out.println(b.getSemestre()+"  "+b.getYear()+"  "+b.getCurso_tamano());  
                   
                    
                    
                    b=b.siguiente_semestre;
                } while (b!=a.primer_semestre&&a.primer_semestre!=a.ultimo_semestre);
                
                
                
            }
            
            
            
            
            
            a=a.siguiente;
        } while (a!=Archivo.estudiante_primero&&Archivo.estudiante_primero!=Archivo.estudiante_ultimo);
        
    
    
    }
}
