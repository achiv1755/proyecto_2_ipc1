/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201700556.dinamico;
import proyecto_2_201700556.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import proyecto_2_201700556.Archivo;
import proyecto_2_201700556.Estudiante;


public class Administrador extends JFrame
{ Archivo archivo =new Archivo();
    
   public void add()
   {
    JFrame marco =new JFrame("Administrador");
    JPanel pintar=new JPanel();
    JLabel titulo =new JLabel("ADIMISTRADOR");
    JButton boton_reporte=new JButton("REPORTE");
    JButton boton_usuario=new JButton("ESTUDIANTE");
    JButton boton_curso=new JButton("CURSO");
    marco.setVisible(true);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pintar.setVisible(true);
    marco.setBounds(200, 100, 500, 400);
      pintar.setBounds(200, 100, 500, 400);
     pintar.setLayout(null);
   marco.setResizable(false);
     titulo.setBounds(190, 50, 150, 30);

    boton_curso.setBounds(200, 100, 100, 30);
    boton_reporte.setBounds(90, 100, 100, 30);
    boton_usuario.setBounds(310, 100, 120, 30);
    
    boton_curso.setBackground(Color.white);
      boton_reporte.setBackground(Color.white);
    boton_usuario.setBackground(Color.white);
    JLabel log_out=new JLabel("LOG OUT");
    log_out.setBounds(400, 10, 80, 30);
    pintar.add(log_out);
    
    
    
    
   marco.add(pintar);
   pintar.add(titulo);
   pintar.add(boton_reporte);
   pintar.add(boton_curso);
   pintar.add(boton_usuario);
   
   
   
   
   
   
    ActionListener reporte = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
            
            
            
            
            
            
            
                System.out.println("hola");
            
            
            }};
    
     ActionListener usuario = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) 
            {
               //para opciones 
                String[] options = {"Agregar", "Modificar", "Eliminar", "ver","Carga Masiva"};
                //Integer[] options = {1, 3, 5, 7, 9, 11};
                //Double[] options = {3.141, 1.618};
                //Character[] options = {'a', 'b', 'c', 'd'};
                int x = JOptionPane.showOptionDialog(null, "Seleccione una opcion",
                        "Estudiante",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                switch (x) {
                    case 0:
                        marco.setVisible(false);
                        agregar_estudiante();
                        break;
                    case 1:
                           marco.setVisible(false);
                        modificar_estudiante();
                        break;
                    case 2:
                           marco.setVisible(false);
                        eliminar_estudiante();
                        break;
                    case 3:
                           marco.setVisible(false);
                        ver_estudiante();
                        break;
                    case 4:
                        marco.setVisible(false);
                        archivo.Estudiantes_Leer();
                        break;

                }
            
            
            }};
     
     
     
      ActionListener curso = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) 
            {
            
             //para opciones 
                String[] options = {"Agregar", "Modificar", "Eliminar", "ver","Carga Masiva"};
                //Integer[] options = {1, 3, 5, 7, 9, 11};
                //Double[] options = {3.141, 1.618};
                //Character[] options = {'a', 'b', 'c', 'd'};
                int x = JOptionPane.showOptionDialog(null, "Seleccione una opcion",
                        "Curso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                switch (x) {
                    case 0:
                           marco.setVisible(false);
                        agregar_curso();
                        break;
                    case 1:
                           marco.setVisible(false);
                        modificar_curso();
                        break;
                    case 2:
                           marco.setVisible(false);
                        eliminar_curso();
                        break;
                    case 3:
                           marco.setVisible(false);
                        ver_curso();
                        break;
                    case 4:
                            marco.setVisible(false);
                            archivo.curso_leer();
                            break;

                }
            
            
            }};
      
      
       log_out.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);
                Login login=new Login();
                login.buscar();

            }
        });
      
      
   
   
   boton_curso.addActionListener(curso);
   boton_reporte.addActionListener(reporte);
   boton_usuario.addActionListener(usuario);
   }
   public void agregar_estudiante()
   {
   
   JFrame marco =new JFrame("AGREGAR ESTUDIANTE");
    JPanel pintar=new JPanel();
    JLabel titulo =new JLabel("AGREGAR ESTUDIANTE");
    JButton boton_confirmar=new JButton("CONFIRMAR");
   
    marco.setVisible(true);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pintar.setVisible(true);
    marco.setBounds(400, 100, 500, 450);
      pintar.setBounds(200, 100, 500, 600);
     pintar.setLayout(null);
   marco.setResizable(false);
     titulo.setBounds(190, 50, 150, 30);

    boton_confirmar.setBounds(350, 350, 120, 30);
   
    
    boton_confirmar .setBackground(Color.white);
   
    JLabel log_out=new JLabel("LOG OUT");
    log_out.setBounds(400, 10, 80, 30);
    pintar.add(log_out);
    JLabel regresar=new JLabel("REGRESAR");
    regresar.setBounds(400, 45, 80, 30);
    pintar.add(regresar);
    
    
    
   marco.add(pintar);
   pintar.add(titulo);
   pintar.add(boton_confirmar);
 
   
   
   JLabel []datos=new JLabel[6];
   JTextField []text=new JTextField[6];
   int a=0;
    
    
 
    

       for (int i = 0; i < 6; i++)
       {
           datos[i]=new JLabel();
       datos[i].setBounds(50, 100+a, 100, 30); 
            text[i]=new JTextField();
              text[i].setBounds(150, 100+a, 100, 30); 
            a+=33;
            pintar.add(text[i]);
       pintar.add(datos[i]);    
       }
       for (int i = 0; i < 6; i++) {
           
       }
       solo_numero(text[0]);
       solo_numero(text[1]);
       solo_numero(text[5]);
    
    datos[0].setText("Carnet");
    datos[1].setText("DPI");
    datos[2].setText("Nombre");
    datos[3].setText("Correo");
    datos[4].setText("Direccion");
    datos[5].setText("Creditos");
   
   
   
        ActionListener confirmar = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
            boolean permiso=true;
                for (int i = 0; i < 6; i++) 
                {
                    if (text[i].getText().equals("")) 
                    {permiso=false;
                        JOptionPane.showMessageDialog(null, "llene todo los campos", "ALERTA", JOptionPane.WARNING_MESSAGE);
                      break;    
                    } 
                }
                if(permiso)
                {
                try{
                 Random aleatorio = new Random();
                  int ID = 50 + aleatorio.nextInt(100);
                   String  contra=text[0].getText()+ID;
                
                
                archivo.Estudiante_agregar_final(new Estudiante(text[0].getText(),text[1].getText(),text[2].getText(),text[3].getText(),text[4].getText(),Integer.valueOf(text[5].getText()),contra));
                    JOptionPane.showMessageDialog(null, "su contraña es¨: "+contra, "Creacion Exitosa", JOptionPane.WARNING_MESSAGE);
                    marco.setVisible(false);
                    add();
                }catch(Exception v){ JOptionPane.showMessageDialog(null, "error al llenar los datos","alerta", JOptionPane.WARNING_MESSAGE);}}
            
            
            }};
        boton_confirmar.addActionListener(confirmar);
    
    
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
                
                add();

            }
        });
   
   
   }
   public void modificar_estudiante()
   {
   JFrame marco =new JFrame("AGREGAR ESTUDIANTE");
    JPanel pintar=new JPanel();
    JLabel titulo =new JLabel("AGREGAR ESTUDIANTE");
    JButton boton_confirmar=new JButton("CONFIRMAR");
   
    marco.setVisible(true);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pintar.setVisible(true);
    marco.setBounds(400, 100, 500, 450);
      pintar.setBounds(200, 100, 500, 600);
     pintar.setLayout(null);
   marco.setResizable(false);
     titulo.setBounds(190, 50, 150, 30);

    boton_confirmar.setBounds(350, 350, 120, 30);
   
    
    boton_confirmar .setBackground(Color.white);
   
    JLabel log_out=new JLabel("LOG OUT");
    log_out.setBounds(400, 10, 80, 30);
    pintar.add(log_out);
    JLabel regresar=new JLabel("REGRESAR");
    regresar.setBounds(400, 45, 80, 30);
    pintar.add(regresar);
    
    boton_confirmar.setVisible(false);
    
   marco.add(pintar);
   pintar.add(titulo);
   pintar.add(boton_confirmar);
 
   
  
   JButton buscar=new JButton("BUSCAR");
  
   buscar.setBackground(Color.white);
   buscar.setBounds(330,100,100,30);
   
   pintar.add(buscar);
  
   JLabel []datos=new JLabel[7];
   JTextField []text=new JTextField[7];
   int a=0;
    
    
 
    

       for (int i = 0; i < 7; i++)
       {
           datos[i]=new JLabel();
       datos[i].setBounds(50, 100+a, 100, 30); 
            text[i]=new JTextField();
              text[i].setBounds(150, 100+a, 100, 30); 
              text[i].setVisible(false);
            a+=33;
            pintar.add(text[i]);
       pintar.add(datos[i]);    
       }
       text[0].setVisible(true);
       solo_numero(text[0]);
       solo_numero(text[1]);
       solo_numero(text[5]);
    
    datos[0].setText("Carnet");
    datos[1].setText("DPI");
    datos[2].setText("Nombre");
    datos[3].setText("Correo");
    datos[4].setText("Direccion");
    datos[5].setText("Creditos");
    datos[6].setText("Contraseña");
   
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
                
                add();

            }
        });
   
       ActionListener buscar_action = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) 
            { 
              
             Estudiante aux=archivo.estudiante_primero;
            boolean validacion=true;
            do{
       
    
                
           
            if (aux.getCarnet().equals(text[0].getText())) 
                {
            
                    for (int i = 1; i < 7; i++)
                    {
                    text[i].setVisible(true);
                    }
            
            text[1].setText(aux.getDPI());
            text[2].setText(aux.getNombre());
            text[3].setText(aux.getCorreo());
            text[4].setText(aux.getDireccion());
            text[5].setText(""+aux.getCredito());
            text[6].setText(aux.getPassword());
            boton_confirmar.setVisible(true);
            
            text[0].setEditable(false);
            validacion=false;
            break;
            }
             aux=aux.siguiente;
            
             

            } while (aux != archivo.estudiante_primero);
            if (validacion) 
            {
                JOptionPane.showMessageDialog(null, "No se encontro al estudiante", "ALERTA", JOptionPane.WARNING_MESSAGE);
            }
            }};
        buscar.addActionListener(buscar_action);
    
       
       
        ActionListener editar = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) 
            { 
            
                boolean permiso=true;
                  for (int i = 0; i < 6; i++) 
                {
                    if (text[i].getText().equals("")) 
                    {permiso=false;
                        JOptionPane.showMessageDialog(null, "llene todo los campos", "ALERTA", JOptionPane.WARNING_MESSAGE);
                      break;    
                    } 
                }
              if(permiso){  
             Estudiante aux=archivo.estudiante_primero;
       
            while(aux!=null)
            {
            if (aux.getCarnet().equals(text[0].getText())) 
                {
                    
                    aux.setDPI(text[1].getText());
                    aux.setNombre(text[2].getText());
                    aux.setCorreo(text[3].getText());
                    aux.setDireccion(text[4].getText());
                    aux.setCredito(Integer.valueOf(text[5].getText()));
                    aux.setPassword(text[6].getText());
                    
                    JOptionPane.showMessageDialog(null, "Cambio exitoso", "ALERTA", JOptionPane.WARNING_MESSAGE);
                    marco.setVisible(false);
                    add();
                    
           
            
           
            break;
             }
             aux=aux.siguiente;
    
            }
           
            
            }}};
       
      boton_confirmar.addActionListener(editar);
       
       
       
       
       
       
       
       
   }
   public void ver_estudiante()
      {
      JFrame marco=new JFrame("MOSTRAR ESTUDIANTES");
      JPanel pintar=new JPanel();
      
      marco.setLayout(null);
      pintar.setLayout(null);
      JLabel titulo=new JLabel("MOSTRAR ESTUDIANTES");
      marco.setBounds(200, 200, 1200, 600);
        pintar.setBounds(0, 0, 1200, 600);
        
        
      titulo.setBounds(500,50,200,30);
      
      
      marco.setVisible(true);
      
       
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel log_out=new JLabel("LOG OUT");
    log_out.setBounds(1100, 10, 80, 30);

    JLabel regresar=new JLabel("REGRESAR");
    regresar.setBounds(1100, 45, 80, 30);
    
    
 
    marco.setResizable(false);
    
    pintar.add(regresar);
     pintar.add(log_out);
   
      pintar.add(titulo);
      marco.add(pintar);
    
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
                
                add();

            }
        });
      
      
    

        String data[][] = new String[archivo.estudiante_tamano][8];
        int contador=0;
        if (archivo.estudiante_vacio()!=true) {
           
       
            try {
                    Estudiante aux=archivo.estudiante_primero;
                do{
                    
                  
                        
                     
                    data[contador][0]=aux.getCarnet();
                    data[contador][1] = aux.getDPI();
                    data[contador][2] =aux.getNombre();
                    data[contador][3] = aux.getCorreo();
                    data[contador][4] = aux.getDireccion();
                    data[contador][5]  =""+aux.getCredito();
                    data[contador][6] = aux.getPassword();
                   contador++;
                    aux=aux.siguiente;
                    
                }while(archivo.estudiante_primero!=aux);
            } catch (Exception e) {
        
        }}
            
        String tituloo[] = {"Carnet", "DPI", "Nombre", "Correo", "Direccion", "Creditos", "Contraseña"};

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
        scroll.setBounds(100, 100, 1000, 300);
    
    
    
   }
      public void eliminar_estudiante()
   {
   
    JFrame marco =new JFrame("AGREGAR ESTUDIANTE");
    JPanel pintar=new JPanel();
    JLabel titulo =new JLabel("AGREGAR ESTUDIANTE");
    JButton boton_confirmar=new JButton("CONFIRMAR");
   
    marco.setVisible(true);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pintar.setVisible(true);
    marco.setBounds(400, 100, 500, 450);
    pintar.setBounds(200, 100, 500, 600);
    pintar.setLayout(null);
    marco.setResizable(false);
    titulo.setBounds(190, 50, 150, 30);

    boton_confirmar.setBounds(350, 350, 120, 30);
   
    
    boton_confirmar .setBackground(Color.white);
   
    JLabel log_out=new JLabel("LOG OUT");
    log_out.setBounds(400, 10, 80, 30);
    pintar.add(log_out);
    JLabel regresar=new JLabel("REGRESAR");
    regresar.setBounds(400, 45, 80, 30);
    pintar.add(regresar);
    
    boton_confirmar.setVisible(false);
    
   marco.add(pintar);
   pintar.add(titulo);
   pintar.add(boton_confirmar);
 
   
  
   JButton buscar=new JButton("BUSCAR");
  
   buscar.setBackground(Color.white);
   buscar.setBounds(330,100,100,30);
   
   pintar.add(buscar);
        
       JButton cancelar=new JButton("CANCELAR");
   JLabel []datos=new JLabel[7];
   JTextField []text=new JTextField[7];
   int a=0;
    
    
 
    

       for (int i = 0; i < 7; i++)
       {
           datos[i]=new JLabel();
       datos[i].setBounds(50, 100+a, 100, 30); 
            text[i]=new JTextField();
              text[i].setBounds(150, 100+a, 100, 30); 
              text[i].setVisible(false);
            a+=33;
            pintar.add(text[i]);
       pintar.add(datos[i]);    
       }
       text[0].setVisible(true);
       solo_numero(text[0]);
       solo_numero(text[1]);
       solo_numero(text[5]);
    
    datos[0].setText("Carnet");
    datos[1].setText("DPI");
    datos[2].setText("Nombre");
    datos[3].setText("Correo");
    datos[4].setText("Direccion");
    datos[5].setText("Creditos");
    datos[6].setText("Contraseña");
   
    cancelar.setBounds(200, 350, 120, 30);
    cancelar.setBackground(Color.white);
    
    
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
                
                add();

            }
        });
   
       ActionListener buscar_action = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) 
            { 
                if (text[0].getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "llene el campo", "ALERTA", JOptionPane.WARNING_MESSAGE);
                }
                else{
                
            Estudiante aux=archivo.estudiante_primero;
            boolean validacion=true;
            do
            {
            if (aux.getCarnet().equals(text[0].getText())) 
                {
                    for (int i = 0; i < 7; i++)
                    {
                    text[i].setVisible(true);
                    text[i].setEditable(false);
                    }
             text[1].setText(aux.getDPI());
            text[2].setText(aux.getNombre());
            text[3].setText(aux.getCorreo());
            text[4].setText(aux.getDireccion());
            text[5].setText(""+aux.getCredito());
            text[6].setText(aux.getPassword());
            boton_confirmar.setVisible(true);
            cancelar.setVisible(true);
            
            validacion=false;
            break;
                }
            aux=aux.siguiente;
    
            } while (aux != archivo.estudiante_primero);
            if (validacion) {
                JOptionPane.showMessageDialog(null, "No se encontro al estudiante", "ALERTA", JOptionPane.WARNING_MESSAGE);
        
            }
                }
            }};
       buscar.addActionListener(buscar_action);
       ActionListener cancelar_accion = new ActionListener() {
            @Override

            
            public void actionPerformed(ActionEvent e){
                for (int i = 0; i < 7; i++) 
                {
                 text[i].setText("");
                 text[i].setVisible(false);
                }
                text[0].setVisible(true);
                text[0].setEditable(true);
                cancelar.setVisible(false);
                boton_confirmar.setVisible(false);
            }};
       
    pintar.add(cancelar);
    cancelar.addActionListener(cancelar_accion);
   
         ActionListener eliminar_accion = new ActionListener() {
            @Override

            
            public void actionPerformed(ActionEvent e)
            {
                Estudiante aux=archivo.estudiante_primero;
        boolean validacion=false;
        
        if(archivo.estudiante_primero.getCarnet().equals(text[0].getText()))
        {
            
            archivo.estudiante_primero=archivo.estudiante_primero.siguiente; 
            archivo .estudiante_ultimo.enlazar_siguiente(archivo.estudiante_primero);
            archivo.estudiante_primero.enlazar_anterior(archivo.estudiante_ultimo);
            
            archivo.estudiante_tamano--;}
        else
        {
            
          do
            {
                if (aux.siguiente.getCarnet().equals(text[0].getText())) 
                {
                    validacion=true; 
                    break;
                }
                aux=aux.siguiente;
            
            }while(aux.siguiente!=archivo.estudiante_primero);
            if (validacion) {
                
                
                
                aux.siguiente=aux.siguiente.siguiente;
                
                aux.siguiente.enlazar_anterior(aux);
                archivo.estudiante_tamano--;
               
                
                
                
                
                
                
                if (aux.siguiente==archivo.estudiante_primero)
                {
                archivo.estudiante_ultimo=aux.anterior;
                }
            
            
            
            }
            else
            {
                    System.out.println("no hay dato ");}  
            }
        marco.setVisible(false);
            add();}};
   boton_confirmar.addActionListener(eliminar_accion);
   
   
   }
   
   public void agregar_curso(){}
   public void modificar_curso(){}
   public void ver_curso(){archivo.mostrar3();}
   public void eliminar_curso(){}
   
   
      public void solo_numero(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                    JOptionPane.showMessageDialog(null, "No Se Permiten letras", "ALERTA", JOptionPane.WARNING_MESSAGE);
                    e.consume();

                }
            }

        });

    }
    
 
}

