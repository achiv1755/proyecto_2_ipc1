/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201700556;

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
import proyecto_2_201700556.dinamico.Login;

/**
 *
 * @author juare
 */
public class Admin extends Usuario {

    Archivo archivo = new Archivo();
    JPanel pintar2 = new JPanel();
    String nombre="add";
   String password="123";
    public Admin() {

        this.nombre = "add";
        this.password = "123";

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

    public void add() {
        JFrame marco = new JFrame("Administrador");
        JPanel pintar = new JPanel();
        JLabel titulo = new JLabel("ADIMISTRADOR");
        JButton boton_reporte = new JButton("REPORTE");
        JButton boton_usuario = new JButton("ESTUDIANTE");
        JButton boton_curso = new JButton("CURSO");
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
        JLabel log_out = new JLabel("LOG OUT");
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

            }
        };

        ActionListener usuario = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                //para opciones 
                String[] options = {"Agregar", "Modificar", "Eliminar", "ver", "Carga Masiva"};

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

            }
        };

        ActionListener curso = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                //para opciones 
                String[] options = {"Agregar", "Modificar", "Eliminar", "ver", "Carga Masiva"};

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

            }
        };

        log_out.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);
                Login login = new Login();
                login.buscar();

            }
        });

        boton_curso.addActionListener(curso);
        boton_reporte.addActionListener(reporte);
        boton_usuario.addActionListener(usuario);
        JButton boton_catedratico=new JButton("Ver Catedraticos");
        boton_catedratico.setBounds(150, 150, 200, 30);
        boton_catedratico.setBackground(Color.white);
        
        pintar.add(boton_catedratico);
         ActionListener catedratico = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                    marco.setVisible(false);
               ver_catedraticos();

                }
 
        };
boton_catedratico.addActionListener(catedratico);
    }

    public void agregar_estudiante() {

        JFrame marco = new JFrame("AGREGAR ESTUDIANTE");
        JPanel pintar = new JPanel();
        JLabel titulo = new JLabel("AGREGAR ESTUDIANTE");
        JButton boton_confirmar = new JButton("CONFIRMAR");

        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pintar.setVisible(true);
        marco.setBounds(400, 100, 500, 450);
        pintar.setBounds(200, 100, 500, 600);
        pintar.setLayout(null);
        marco.setResizable(false);
        titulo.setBounds(190, 50, 150, 30);

        boton_confirmar.setBounds(350, 350, 120, 30);

        boton_confirmar.setBackground(Color.white);

        JLabel log_out = new JLabel("LOG OUT");
        log_out.setBounds(400, 10, 80, 30);
        pintar.add(log_out);
        JLabel regresar = new JLabel("REGRESAR");
        regresar.setBounds(400, 45, 80, 30);
        pintar.add(regresar);

        marco.add(pintar);
        pintar.add(titulo);
        pintar.add(boton_confirmar);

        JLabel[] datos = new JLabel[6];
        JTextField[] text = new JTextField[6];
        int a = 0;

        for (int i = 0; i < 6; i++) {
            datos[i] = new JLabel();
            datos[i].setBounds(50, 100 + a, 100, 30);
            text[i] = new JTextField();
            text[i].setBounds(150, 100 + a, 100, 30);
            a += 33;
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
                boolean permiso = true;
                for (int i = 0; i < 6; i++) {
                    if (text[i].getText().equals("")) {
                        permiso = false;
                        JOptionPane.showMessageDialog(null, "llene todo los campos", "ALERTA", JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                }
                Estudiante aux1 = archivo.estudiante_primero;
                do {
                    if (!archivo.estudiante_vacio()) {
                        if (aux1.getCarnet().equals(text[0].getText())) {
                            JOptionPane.showMessageDialog(null, "Carnet no disponible", "ALERTA", JOptionPane.WARNING_MESSAGE);
                            permiso = false;
                            break;
                        }
                    } else {
                        break;
                    }
                    if (archivo.estudiante_primero != archivo.estudiante_ultimo) {
                        aux1 = aux1.siguiente;
                    }
                } while (aux1 != archivo.estudiante_primero);

                if (permiso) {
                    try {
                        Random aleatorio = new Random();
                        int ID = 50 + aleatorio.nextInt(100);
                        String contra = text[0].getText() + ID;

                        archivo.Estudiante_agregar_final(new Estudiante(text[0].getText(), text[1].getText(), text[2].getText(), text[3].getText(), text[4].getText(), Integer.valueOf(text[5].getText()), contra));
                        JOptionPane.showMessageDialog(null, "su contraña es¨: " + contra, "Creacion Exitosa", JOptionPane.WARNING_MESSAGE);
                        marco.setVisible(false);
                        add();
                    } catch (Exception v) {
                        JOptionPane.showMessageDialog(null, "error al llenar los datos", "alerta", JOptionPane.WARNING_MESSAGE);
                    }
                }

            }
        };
        boton_confirmar.addActionListener(confirmar);

        log_out.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);
                Login login = new Login();
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

    public void modificar_estudiante() {
        JFrame marco = new JFrame("MODIFICAR ESTUDIANTE");
        JPanel pintar = new JPanel();
        JLabel titulo = new JLabel("MODIFICAR ESTUDIANTE");
        JButton boton_confirmar = new JButton("CONFIRMAR");

        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pintar.setVisible(true);
        marco.setBounds(400, 100, 500, 450);
        pintar.setBounds(200, 100, 500, 600);
        pintar.setLayout(null);
        marco.setResizable(false);
        titulo.setBounds(190, 50, 150, 30);

        boton_confirmar.setBounds(350, 350, 120, 30);

        boton_confirmar.setBackground(Color.white);

        JLabel log_out = new JLabel("LOG OUT");
        log_out.setBounds(400, 10, 80, 30);
        pintar.add(log_out);
        JLabel regresar = new JLabel("REGRESAR");
        regresar.setBounds(400, 45, 80, 30);
        pintar.add(regresar);

        boton_confirmar.setVisible(false);

        marco.add(pintar);
        pintar.add(titulo);
        pintar.add(boton_confirmar);

        JButton buscar = new JButton("BUSCAR");

        buscar.setBackground(Color.white);
        buscar.setBounds(330, 100, 100, 30);

        pintar.add(buscar);

        JLabel[] datos = new JLabel[7];
        JTextField[] text = new JTextField[7];
        int a = 0;

        for (int i = 0; i < 7; i++) {
            datos[i] = new JLabel();
            datos[i].setBounds(50, 100 + a, 100, 30);
            text[i] = new JTextField();
            text[i].setBounds(150, 100 + a, 100, 30);
            text[i].setVisible(false);
            a += 33;
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
                Login login = new Login();
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

            public void actionPerformed(ActionEvent e) {

                Estudiante aux = archivo.estudiante_primero;
                boolean validacion = true;
                do {

                    if (aux.getCarnet().equals(text[0].getText())) {

                        for (int i = 1; i < 7; i++) {
                            text[i].setVisible(true);
                        }

                        text[1].setText(aux.getDPI());
                        text[2].setText(aux.getNombre());
                        text[3].setText(aux.getCorreo());
                        text[4].setText(aux.getDireccion());
                        text[5].setText("" + aux.getCredito());
                        text[6].setText(aux.getPassword());
                        boton_confirmar.setVisible(true);

                        text[0].setEditable(false);
                        validacion = false;
                        break;
                    }
                    aux = aux.siguiente;

                } while (aux != archivo.estudiante_primero);
                if (validacion) {
                    JOptionPane.showMessageDialog(null, "No se encontro al estudiante", "ALERTA", JOptionPane.WARNING_MESSAGE);
                }
            }
        };
        buscar.addActionListener(buscar_action);

        ActionListener editar = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                boolean permiso = true;
                for (int i = 0; i < 6; i++) {
                    if (text[i].getText().equals("")) {
                        permiso = false;
                        JOptionPane.showMessageDialog(null, "llene todo los campos", "ALERTA", JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                }
                if (permiso) {
                    Estudiante aux = archivo.estudiante_primero;

                    while (aux != null) {
                        if (aux.getCarnet().equals(text[0].getText())) {

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
                        aux = aux.siguiente;

                    }

                }
            }
        };

        boton_confirmar.addActionListener(editar);

    }

    public void ver_estudiante() {
        JFrame marco = new JFrame("MOSTRAR ESTUDIANTES");

        marco.setLayout(null);
        pintar2.setLayout(null);
        JLabel titulo = new JLabel("MOSTRAR ESTUDIANTES");
        marco.setBounds(200, 200, 1200, 600);
        pintar2.setBounds(0, 0, 1200, 600);

        titulo.setBounds(500, 50, 200, 30);

        marco.setVisible(true);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel log_out = new JLabel("LOG OUT");
        log_out.setBounds(1100, 10, 80, 30);

        JLabel regresar = new JLabel("REGRESAR");
        regresar.setBounds(1100, 45, 80, 30);

        marco.setResizable(false);

        pintar2.add(regresar);
        pintar2.add(log_out);

        pintar2.add(titulo);
        marco.add(pintar2);

        log_out.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);
                Login login = new Login();
                login.buscar();

            }
        });
        regresar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);

                add();

            }
        });

        mostrar();

    }

    public void mostrar() {

        String data[][] = new String[archivo.estudiante_tamano][8];
        int contador = 0;
        if (archivo.estudiante_vacio() != true) {

            try {
                Estudiante aux = archivo.estudiante_primero;
                do {

                    data[contador][0] = aux.getCarnet();
                    data[contador][1] = aux.getDPI();
                    data[contador][2] = aux.getNombre();
                    data[contador][3] = aux.getCorreo();
                    data[contador][4] = aux.getDireccion();
                    data[contador][5] = "" + aux.getCredito();
                    data[contador][6] = aux.getPassword();
                    contador++;
                    aux = aux.siguiente;

                } while (archivo.estudiante_primero != aux);
            } catch (Exception e) {

            }
        }

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
        pintar2.add(scroll);
        scroll.repaint();
        scroll.setBounds(100, 100, 1000, 300);

    }

    public void eliminar_estudiante() {

        JFrame marco = new JFrame("ELIMINAR ESTUDIANTE");
        JPanel pintar = new JPanel();
        JLabel titulo = new JLabel("ELIMINAR ESTUDIANTE");
        JButton boton_confirmar = new JButton("CONFIRMAR");

        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pintar.setVisible(true);
        marco.setBounds(400, 100, 500, 450);
        pintar.setBounds(200, 100, 500, 600);
        pintar.setLayout(null);
        marco.setResizable(false);
        titulo.setBounds(190, 50, 150, 30);

        boton_confirmar.setBounds(350, 350, 120, 30);

        boton_confirmar.setBackground(Color.white);

        JLabel log_out = new JLabel("LOG OUT");
        log_out.setBounds(400, 10, 80, 30);
        pintar.add(log_out);
        JLabel regresar = new JLabel("REGRESAR");
        regresar.setBounds(400, 45, 80, 30);
        pintar.add(regresar);

        boton_confirmar.setVisible(false);

        marco.add(pintar);
        pintar.add(titulo);
        pintar.add(boton_confirmar);

        JButton buscar = new JButton("BUSCAR");

        buscar.setBackground(Color.white);
        buscar.setBounds(330, 100, 100, 30);

        pintar.add(buscar);

        JButton cancelar = new JButton("CANCELAR");
        JLabel[] datos = new JLabel[7];
        JTextField[] text = new JTextField[7];
        int a = 0;

        cancelar.setVisible(false);

        for (int i = 0; i < 7; i++) {
            datos[i] = new JLabel();
            datos[i].setBounds(50, 100 + a, 100, 30);
            text[i] = new JTextField();
            text[i].setBounds(150, 100 + a, 100, 30);
            text[i].setVisible(false);
            a += 33;
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
                Login login = new Login();
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

            public void actionPerformed(ActionEvent e) {
                if (text[0].getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "llene el campo", "ALERTA", JOptionPane.WARNING_MESSAGE);
                } else {

                    Estudiante aux = archivo.estudiante_primero;
                    boolean validacion = true;
                    do {
                        if (aux.getCarnet().equals(text[0].getText())) {
                            for (int i = 0; i < 7; i++) {
                                text[i].setVisible(true);
                                text[i].setEditable(false);
                            }
                            text[1].setText(aux.getDPI());
                            text[2].setText(aux.getNombre());
                            text[3].setText(aux.getCorreo());
                            text[4].setText(aux.getDireccion());
                            text[5].setText("" + aux.getCredito());
                            text[6].setText(aux.getPassword());
                            boton_confirmar.setVisible(true);
                            cancelar.setVisible(true);

                            validacion = false;
                            break;
                        }
                        aux = aux.siguiente;

                    } while (aux != archivo.estudiante_primero);
                    if (validacion) {
                        JOptionPane.showMessageDialog(null, "No se encontro al estudiante", "ALERTA", JOptionPane.WARNING_MESSAGE);

                    }
                }
            }
        };
        buscar.addActionListener(buscar_action);
        ActionListener cancelar_accion = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 7; i++) {
                    text[i].setText("");
                    text[i].setVisible(false);
                }
                text[0].setVisible(true);
                text[0].setEditable(true);
                cancelar.setVisible(false);
                boton_confirmar.setVisible(false);
            }
        };

        pintar.add(cancelar);
        cancelar.addActionListener(cancelar_accion);

        ActionListener eliminar_accion = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                Estudiante aux = archivo.estudiante_primero;
                boolean validacion = false;

                if (archivo.estudiante_primero.getCarnet().equals(text[0].getText())) {

                    archivo.estudiante_primero = archivo.estudiante_primero.siguiente;
                    archivo.estudiante_ultimo.enlazar_siguiente(archivo.estudiante_primero);
                    archivo.estudiante_primero.enlazar_anterior(archivo.estudiante_ultimo);
                    JOptionPane.showMessageDialog(null, "Curso eliminado", "ELIMINADO", JOptionPane.WARNING_MESSAGE);
                    archivo.estudiante_tamano--;
                } else {

                    do {
                        if (aux.siguiente.getCarnet().equals(text[0].getText())) {
                            validacion = true;
                            break;
                        }
                        aux = aux.siguiente;

                    } while (aux.siguiente != archivo.estudiante_primero);
                    if (validacion) {

                        aux.siguiente = aux.siguiente.siguiente;

                        aux.siguiente.enlazar_anterior(aux);
                        JOptionPane.showMessageDialog(null, "Curso eliminado", "ELIMINADO", JOptionPane.WARNING_MESSAGE);
                        archivo.estudiante_tamano--;

                        if (aux.siguiente == archivo.estudiante_primero) {
                            archivo.estudiante_ultimo = aux.anterior;
                        }

                    } else {
                        System.out.println("no hay dato ");
                    }
                }
                marco.setVisible(false);
                add();
            }
        };
        boton_confirmar.addActionListener(eliminar_accion);

    }

    public void agregar_curso() {

        JFrame marco = new JFrame("AGREGAR CURSO");
        JPanel pintar = new JPanel();
        JLabel titulo = new JLabel("AGREGAR CURSO");
        JButton boton_confirmar = new JButton("CONFIRMAR");

        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pintar.setVisible(true);
        marco.setBounds(400, 100, 500, 450);
        pintar.setBounds(200, 100, 500, 600);
        pintar.setLayout(null);
        marco.setResizable(false);
        titulo.setBounds(190, 50, 150, 30);

        boton_confirmar.setBounds(350, 350, 120, 30);

        boton_confirmar.setBackground(Color.white);

        JLabel log_out = new JLabel("LOG OUT");
        log_out.setBounds(400, 10, 80, 30);
        pintar.add(log_out);
        JLabel regresar = new JLabel("REGRESAR");
        regresar.setBounds(400, 45, 80, 30);
        pintar.add(regresar);

        JComboBox combo_disparo_1 = new JComboBox();
        combo_disparo_1.addItem("no");
        combo_disparo_1.addItem("si");
        marco.add(pintar);
        pintar.add(titulo);
        pintar.add(boton_confirmar);

        JLabel[] datos = new JLabel[8];
        JTextField[] text = new JTextField[8];
        int a = 0;

        for (int i = 0; i < 8; i++) {
            datos[i] = new JLabel();
            datos[i].setBounds(50, 100 + a, 100, 30);
            text[i] = new JTextField();
            text[i].setBounds(150, 100 + a, 100, 30);
            a += 33;
            pintar.add(text[i]);
            pintar.add(datos[i]);
        }
        for (int i = 0; i < 6; i++) {

        }
        solo_numero(text[0]);
        solo_numero(text[3]);
        solo_numero(text[6]);
        solo_numero(text[7]);
        solo_letra(text[2]);
        solo_letra(text[5]);

        pintar.add(combo_disparo_1);
        datos[0].setText("Codigo");
        datos[1].setText("Nombre Curso");
        datos[2].setText("Catedratico");
        datos[3].setText("Credito");
        datos[4].setText("Laboratorio");

        datos[5].setText("Seccion");
        datos[6].setText("Pre-Requisito");
        datos[7].setText("Pos-Requisito");
        text[4].setVisible(false);
        text[4].setText(" ");
        combo_disparo_1.setBounds(150, 100 + (33 * 4), 100, 30);
        combo_disparo_1.setVisible(true);

        ActionListener confirmar = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                boolean permiso = true;
                for (int i = 0; i < 6; i++) {
                    if (text[i].getText().equals("")) {
                        permiso = false;
                        JOptionPane.showMessageDialog(null, "llene todo los campos", "ALERTA", JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                }

                Curso aux1 = archivo.curso_primero;
                do {
                    if (!archivo.curso_vacio()) {
                        if (aux1.getCodigo() == Integer.valueOf(text[0].getText())) {
                            JOptionPane.showMessageDialog(null, "Codigo de curso no disponible", "ALERTA", JOptionPane.WARNING_MESSAGE);
                            permiso = false;
                            break;
                        }
                    } else {
                        break;
                    }
                    if (Archivo.curso_primero != Archivo.curso_ultimo) {
                        aux1 = aux1.siguiente;
                    }
                } while (aux1 != archivo.curso_primero);

                if (permiso) {
                    //try{

                    boolean lab = false;
                    if (combo_disparo_1.getSelectedItem().toString().equalsIgnoreCase("si")) {
                        lab = true;
                    } else {
                        lab = false;
                    }
                    if (text[6].getText().equals("")) {
                        text[6].setText(" ");

                    }
                    if (text[7].getText().equals("")) {
                        text[7].setText("-1");

                    }
                    archivo.curso_agregar_final(new Curso(Integer.valueOf(text[0].getText()), text[1].getText(), text[2].getText(), Integer.valueOf(text[3].getText()), lab, text[5].getText(), text[6].getText(), text[7].getText()), text[6].getText(), text[7].getText());
                    JOptionPane.showMessageDialog(null, "Curso creado exitosamente", "ALERTA", JOptionPane.WARNING_MESSAGE);
                    marco.setVisible(false);
                    add();

                }

            }
        };
        boton_confirmar.addActionListener(confirmar);

        log_out.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);
                Login login = new Login();
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

    public void modificar_curso() {

        JFrame marco = new JFrame("MODIFICAR CURSO");
        JPanel pintar = new JPanel();
        JLabel titulo = new JLabel("MODIFICAR CURSO");
        JButton boton_confirmar = new JButton("CONFIRMAR");

        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pintar.setVisible(true);
        marco.setBounds(400, 100, 500, 450);
        pintar.setBounds(200, 100, 500, 600);
        pintar.setLayout(null);
        marco.setResizable(false);
        titulo.setBounds(190, 50, 150, 30);

        boton_confirmar.setBounds(350, 350, 120, 30);

        boton_confirmar.setBackground(Color.white);

        JLabel log_out = new JLabel("LOG OUT");
        log_out.setBounds(400, 10, 80, 30);
        pintar.add(log_out);
        JLabel regresar = new JLabel("REGRESAR");
        regresar.setBounds(400, 45, 80, 30);
        pintar.add(regresar);

        boton_confirmar.setVisible(false);

        marco.add(pintar);
        pintar.add(titulo);
        pintar.add(boton_confirmar);

        JButton buscar = new JButton("BUSCAR");

        buscar.setBackground(Color.white);
        buscar.setBounds(330, 100, 100, 30);

        pintar.add(buscar);

        JLabel[] datos = new JLabel[8];
        JTextField[] text = new JTextField[8];
        int a = 0;

        for (int i = 0; i < 8; i++) {
            datos[i] = new JLabel();
            datos[i].setBounds(50, 100 + a, 100, 30);
            text[i] = new JTextField();
            text[i].setBounds(150, 100 + a, 100, 30);
            a += 33;
            text[i].setVisible(false);
            text[i].setEditable(false);
            pintar.add(text[i]);
            pintar.add(datos[i]);
        }
        text[0].setVisible(true);

        solo_numero(text[0]);
        solo_numero(text[3]);
        solo_numero(text[6]);
        solo_numero(text[7]);
        solo_letra(text[2]);
        solo_letra(text[5]);

        text[0].setEditable(true);

        datos[0].setText("Codigo");
        datos[1].setText("Nombre Curso");
        datos[2].setText("Catedratico");
        datos[3].setText("Credito");
        datos[4].setText("Laboratorio");
        datos[5].setText("Seccion");
        datos[6].setText("Pre-Requisito");
        datos[7].setText("Pos-Requisito");

        log_out.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);
                Login login = new Login();
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

            public void actionPerformed(ActionEvent e) {
                try {

                    Curso aux = archivo.curso_primero;
                    Curso aux2 = archivo.curso_primero;
                    boolean validacion = true;
                    do {

                        if (aux.getCodigo() == Integer.valueOf(text[0].getText())) {

                            for (int i = 1; i < 8; i++) {
                                text[i].setVisible(true);
                            }

                            text[1].setText(aux.getNombre());
                            text[2].setText(aux.getCatedratico());
                            text[3].setText("" + aux.getCredito());

                            String lab;
                            if (aux.isLaboratorio()) {
                                lab = "si";
                            } else {
                                lab = "no";
                            }
                            text[4].setText(lab);
                            text[5].setText(aux.getSeccion());

                            //
                            String pre = "";
                            int curso_primero = 0;
                            int curso_primerop = 0;
                            int pre_contador = 0;
                            int pos_contador = 0;
                            if (aux.pre_siguiente == null) {

                            } else {

                                curso_primero = aux.pre_siguiente.getCodigo();

                                if (aux2.pos_siguiente == null) {

                                } else {
                                    curso_primerop = aux2.pos_siguiente.getCodigo();
                                }
                            }
                            //recorer pre
                            do {
                                if (aux.pre_siguiente == null) {
                                    break;
                                }
                                if (pre.equals("")) {
                                    pre = "" + aux.pre_siguiente.getCodigo();
                                } else {
                                    pre = pre.concat("," + aux.pre_siguiente.getCodigo());
                                }
                                pre_contador++;

                                Curso x = aux.pre_siguiente.pre_siguiente;

                                if (x == null) {

                                } else {
                                    aux.pre_siguiente = aux.pre_siguiente.pre_siguiente;
                                }

                                if (aux.pre_siguiente == null && pre_contador == 1) {

                                    break;
                                }

                            } while (aux.pre_siguiente.getCodigo() != curso_primero);

                            //recorer pos
                            String pos = "";
                            do {

                                if (aux2.pos_siguiente == null) {
                                    break;
                                }
                                if (pos.equals("")) {
                                    pos = "" + aux2.pos_siguiente.getCodigo();
                                } else {
                                    pos = pos.concat("," + aux2.pos_siguiente.getCodigo());
                                }

                                pos_contador++;

                                Curso a = aux2.pos_siguiente.pos_siguiente;
                                if (a == null) {

                                } else {
                                    aux2.pos_siguiente = aux2.pos_siguiente.pos_siguiente;
                                }

                                if (aux2.pos_siguiente == null && pos_contador == 1) {
                                    break;
                                }

                            } while (aux2.pos_siguiente.getCodigo() != curso_primerop);

                            //recorer pre y pos
                            text[6].setText(pre);
                            text[7].setText(pos);
                            boton_confirmar.setVisible(true);

                            text[0].setEditable(false);
                            validacion = false;
                            break;
                        }
                        aux2 = aux2.siguiente;
                        aux = aux.siguiente;

                    } while (aux != archivo.curso_primero);
                    if (validacion) {
                        JOptionPane.showMessageDialog(null, "No se encontro al curso", "ALERTA", JOptionPane.WARNING_MESSAGE);
                    } else {
                        for (int i = 1; i < 8; i++) {

                            text[i].setEditable(true);
                        }
                    }
                } catch (Exception z) {
                    JOptionPane.showMessageDialog(null, "llene el campo", "ALERTA", JOptionPane.WARNING_MESSAGE);
                }
            }
        };
        buscar.addActionListener(buscar_action);

        ActionListener editar = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                boolean permiso = true;
                for (int i = 0; i < 6; i++) {
                    if (text[i].getText().equals("")) {
                        permiso = false;
                        JOptionPane.showMessageDialog(null, "llene todo los campos", "ALERTA", JOptionPane.WARNING_MESSAGE);
                        break;
                    }

                    if (text[4].getText().equalsIgnoreCase("si") || text[4].getText().equalsIgnoreCase("no")) {

                    } else {
                        permiso = false;
                        JOptionPane.showMessageDialog(null, "opcion de laboratorio no valida", "ALERTA", JOptionPane.WARNING_MESSAGE);
                    }

                }
                if (permiso) {
                    Curso aux = archivo.curso_primero;

                    while (aux != null) {
                        if (aux.getCodigo() == Integer.valueOf(text[0].getText())) {

                            aux.setNombre((text[1].getText()));
                            aux.setCatedratico(text[2].getText());
                            aux.setCredito(Integer.valueOf(text[3].getText()));
                            boolean lab;
                            if (text[4].getText().equalsIgnoreCase("si")) {
                                lab = true;

                            } else {
                                lab = false;
                            }
                            aux.setLaboratorio(lab);
                            aux.setSeccion((text[5].getText()));

                            //pre       
                            if (text[6].getText().equalsIgnoreCase("")) {
                                aux.enlazarsiguientepre(null);
                            } else {

                                Curso primero = null;
                                Curso ultimo = null;

                                String[] Pre = text[6].getText().split(",");

                                for (int i = 0; i < Pre.length; i++) {

                                    Curso nuevo = new Curso(Integer.valueOf(Pre[i]), "", "", 0, false, "", "", "");

                                    if (primero == null) {
                                        primero = nuevo;
                                        ultimo = nuevo;

                                    } else {
                                        ultimo.enlazarsiguientepre(nuevo);
                                        nuevo.enlazarsiguientepre(primero);
                                        ultimo = nuevo;
                                    }
                                }
                                aux.enlazarsiguientepre(primero);
                            }

                            if (text[7].getText().equalsIgnoreCase("")) {
                                aux.enlazarpos(null);
                            } else {
                                //pos 
                                Curso primero2 = null;
                                Curso ultimo2 = null;

                                String[] pos = text[7].getText().split(",");

                                for (int i = 0; i < pos.length; i++) {

                                    Curso nuevo = new Curso(Integer.valueOf(pos[i]), "", "", 0, false, "", "", "");

                                    if (primero2 == null) {
                                        primero2 = nuevo;
                                        ultimo2 = nuevo;

                                    } else {
                                        ultimo2.enlazarpos(nuevo);
                                        nuevo.enlazarpos(primero2);
                                        ultimo2 = nuevo;
                                    }
                                }

                                aux.enlazarpos(primero2);
                            }

                            //(text[6].getText());
                            JOptionPane.showMessageDialog(null, "Cambio exitoso", "ALERTA", JOptionPane.WARNING_MESSAGE);
                            marco.setVisible(false);
                            add();

                            break;
                        }
                        aux = aux.siguiente;

                    }

                }
            }
        };

        boton_confirmar.addActionListener(editar);

    }

    public void ver_curso() {

        JFrame marco = new JFrame("MOSTRAR CURSOS");
        JPanel pintar = new JPanel();

        marco.setLayout(null);
        pintar.setLayout(null);
        JLabel titulo = new JLabel("MOSTRAR CURSOS");
        marco.setBounds(200, 200, 1200, 600);
        pintar.setBounds(0, 0, 1200, 600);

        titulo.setBounds(500, 50, 200, 30);

        marco.setVisible(true);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel log_out = new JLabel("LOG OUT");
        log_out.setBounds(1100, 10, 80, 30);

        JLabel regresar = new JLabel("REGRESAR");
        regresar.setBounds(1100, 45, 80, 30);

        marco.setResizable(false);

        pintar.add(regresar);
        pintar.add(log_out);

        pintar.add(titulo);
        marco.add(pintar);

        log_out.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);
                Login login = new Login();
                login.buscar();

            }
        });
        regresar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);

                add();

            }
        });

        String data[][] = new String[archivo.curso_tamano][8];
        int contador = 0;
        if (archivo.curso_vacio() != true) {
            Curso aux = archivo.curso_primero;
            Curso aux2 = archivo.curso_primero;
            try {

                do {

                    String lab = null;
                    if (aux.isLaboratorio()) {
                        lab = "si";
                    } else {
                        lab = "no";
                    }

                    data[contador][0] = "" + aux.getCodigo();
                    data[contador][1] = aux.getNombre();
                    data[contador][2] = aux.getCatedratico();
                    data[contador][3] = "" + aux.getCredito();
                    data[contador][4] = lab;
                    data[contador][5] = aux.getSeccion();

                    //recorer los pre 
                    String pre = "";
                    int curso_primero = 0;
                    int curso_primerop = 0;
                    int pre_contador = 0;
                    int pos_contador = 0;
                    if (aux.pre_siguiente == null) {

                    } else {

                        curso_primero = aux.pre_siguiente.getCodigo();

                        if (aux2.pos_siguiente == null) {

                        } else {
                            curso_primerop = aux2.pos_siguiente.getCodigo();
                        }
                    }
                    //recorer pre
                    do {
                        if (aux.pre_siguiente == null) {
                            break;
                        }
                        if (pre.equals("")) {
                            pre = "" + aux.pre_siguiente.getCodigo();
                        } else {
                            pre = pre.concat("," + aux.pre_siguiente.getCodigo());
                        }
                        pre_contador++;

                        Curso x = aux.pre_siguiente.pre_siguiente;

                        if (x == null) {

                        } else {
                            aux.pre_siguiente = aux.pre_siguiente.pre_siguiente;
                        }

                        if (aux.pre_siguiente == null && pre_contador == 1) {

                            break;
                        }

                    } while (aux.pre_siguiente.getCodigo() != curso_primero);
                    data[contador][6] = pre;
                    //recorer pos

                    String pos = "";
                    do {

                        if (aux2.pos_siguiente == null) {
                            break;
                        }
                        if (pos.equals("")) {
                            pos = "" + aux2.pos_siguiente.getCodigo();
                        } else {
                            pos = pos.concat("," + aux2.pos_siguiente.getCodigo());
                        }

                        pos_contador++;
                        //cambiar la variable para que no se chinge nada haa funciona           manana hago lista de catedraticos     creo los sinwg    y  el martes enlazo y termino gg
                        Curso a = aux2.pos_siguiente.pos_siguiente;
                        if (a == null) {

                        } else {
                            aux2.pos_siguiente = aux2.pos_siguiente.pos_siguiente;
                        }

                        if (aux2.pos_siguiente == null && pos_contador == 1) {
                            break;
                        }

                    } while (aux2.pos_siguiente.getCodigo() != curso_primerop);

                    data[contador][7] = pos;

                    contador++;
                    aux2 = aux2.siguiente;
                    aux = aux.siguiente;

                } while (archivo.curso_primero != aux);
            } catch (Exception e) {

            }
        }

        String tituloo[] = {"Codigo", "Curso", "Catedratico", "Credito", "Lab", "Seccion", "Pre-requisito", "Pos-requitito"};

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

    public void eliminar_curso() {

        JFrame marco = new JFrame("ELIMINAR ESTUDIANTE");
        JPanel pintar = new JPanel();
        JLabel titulo = new JLabel("ELIMINAR ESTUDIANTE");
        JButton boton_confirmar = new JButton("CONFIRMAR");

        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pintar.setVisible(true);
        marco.setBounds(400, 100, 500, 450);
        pintar.setBounds(200, 100, 500, 650);
        pintar.setLayout(null);
        marco.setResizable(false);
        titulo.setBounds(190, 50, 150, 30);

        boton_confirmar.setBounds(350, 375, 120, 30);

        boton_confirmar.setBackground(Color.white);

        JLabel log_out = new JLabel("LOG OUT");
        log_out.setBounds(400, 10, 80, 30);
        pintar.add(log_out);
        JLabel regresar = new JLabel("REGRESAR");
        regresar.setBounds(400, 45, 80, 30);
        pintar.add(regresar);

        boton_confirmar.setVisible(false);

        marco.add(pintar);
        pintar.add(titulo);
        pintar.add(boton_confirmar);

        JButton buscar = new JButton("BUSCAR");

        buscar.setBackground(Color.white);
        buscar.setBounds(330, 100, 100, 30);

        pintar.add(buscar);

        JButton cancelar = new JButton("CANCELAR");
        cancelar.setVisible(false);
        JLabel[] datos = new JLabel[8];
        JTextField[] text = new JTextField[8];
        int a = 0;

        for (int i = 0; i < 8; i++) {
            datos[i] = new JLabel();
            datos[i].setBounds(50, 100 + a, 100, 30);
            text[i] = new JTextField();
            text[i].setBounds(150, 100 + a, 100, 30);
            text[i].setVisible(false);
            a += 33;
            pintar.add(text[i]);
            pintar.add(datos[i]);
        }
        text[0].setVisible(true);
        solo_numero(text[0]);
        solo_numero(text[1]);
        solo_numero(text[5]);
        solo_letra(text[2]);

        datos[0].setText("Codigo");
        datos[1].setText("Nombre Curso");
        datos[2].setText("Catedratico");
        datos[3].setText("Credito");
        datos[4].setText("Laboratorio");
        datos[5].setText("Seccion");
        datos[6].setText("Pre-Requisito");
        datos[7].setText("Pos-Requisito");

        cancelar.setBounds(200, 375, 120, 30);
        cancelar.setBackground(Color.white);

        log_out.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);
                Login login = new Login();
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

            public void actionPerformed(ActionEvent e) {
                try {

                    Curso aux = archivo.curso_primero;
                    Curso aux2 = archivo.curso_primero;
                    boolean validacion = true;
                    do {

                        if (aux.getCodigo() == Integer.valueOf(text[0].getText())) {

                            for (int i = 0; i < 8; i++) {
                                text[i].setEditable(false);
                                text[i].setVisible(true);
                            }

                            text[1].setText(aux.getNombre());
                            text[2].setText(aux.getCatedratico());
                            text[3].setText("" + aux.getCredito());
                            String lab;
                            if (aux.isLaboratorio()) {
                                lab = "si";
                            } else {
                                lab = "no";
                            }
                            text[4].setText(lab);
                            text[5].setText(aux.getSeccion());
                            boton_confirmar.setVisible(true);
                            cancelar.setVisible(true);
                            //

                            String pre = "";
                            int curso_primero = 0;
                            int curso_primerop = 0;
                            int pre_contador = 0;
                            int pos_contador = 0;
                            if (aux.pre_siguiente == null) {

                            } else {

                                curso_primero = aux.pre_siguiente.getCodigo();

                                if (aux2.pos_siguiente == null) {

                                } else {
                                    curso_primerop = aux2.pos_siguiente.getCodigo();
                                }
                            }
                            //recorer pre
                            do {
                                if (aux.pre_siguiente == null) {
                                    break;
                                }
                                if (pre.equals("")) {
                                    pre = "" + aux.pre_siguiente.getCodigo();
                                } else {
                                    pre = pre.concat("," + aux.pre_siguiente.getCodigo());
                                }
                                pre_contador++;

                                Curso x = aux.pre_siguiente.pre_siguiente;

                                if (x == null) {

                                } else {
                                    aux.pre_siguiente = aux.pre_siguiente.pre_siguiente;
                                }

                                if (aux.pre_siguiente == null && pre_contador == 1) {

                                    break;
                                }

                            } while (aux.pre_siguiente.getCodigo() != curso_primero);

                            //recorer pos
                            String pos = "";
                            do {

                                if (aux2.pos_siguiente == null) {
                                    break;
                                }
                                if (pos.equals("")) {
                                    pos = "" + aux2.pos_siguiente.getCodigo();
                                } else {
                                    pos = pos.concat("," + aux2.pos_siguiente.getCodigo());
                                }

                                pos_contador++;

                                Curso a = aux2.pos_siguiente.pos_siguiente;
                                if (a == null) {

                                } else {
                                    aux2.pos_siguiente = aux2.pos_siguiente.pos_siguiente;
                                }

                                if (aux2.pos_siguiente == null && pos_contador == 1) {
                                    break;
                                }

                            } while (aux2.pos_siguiente.getCodigo() != curso_primerop);

                            //recorer pre y pos
                            text[6].setText(pre);
                            text[7].setText(pos);
                            boton_confirmar.setVisible(true);
                            text[3].setEditable(false);
                            for (int i = 0; i < 8; i++) {
                                text[i].setEditable(false);

                            }
                            validacion = false;
                            break;
                        }
                        aux2 = aux2.siguiente;
                        aux = aux.siguiente;

                    } while (aux != archivo.curso_primero);
                    if (validacion) {
                        JOptionPane.showMessageDialog(null, "No se encontro al curso", "ALERTA", JOptionPane.WARNING_MESSAGE);
                    } else {
                        for (int i = 0; i < 8; i++) {

                            text[i].setEditable(false);
                        }
                    }
                } catch (Exception z) {
                    JOptionPane.showMessageDialog(null, "llene el campo", "ALERTA", JOptionPane.WARNING_MESSAGE);
                }
            }

        };
        buscar.addActionListener(buscar_action);
        ActionListener cancelar_accion = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 8; i++) {
                    text[i].setText("");
                    text[i].setVisible(false);
                }
                text[0].setVisible(true);
                text[0].setEditable(true);
                cancelar.setVisible(false);
                boton_confirmar.setVisible(false);
            }
        };

        pintar.add(cancelar);
        cancelar.addActionListener(cancelar_accion);

        ActionListener eliminar_accion = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                Curso aux = archivo.curso_primero;
                boolean validacion = false;

                if (archivo.curso_primero.getCodigo() == Integer.valueOf(text[0].getText())) {
                    archivo.curso_primero = archivo.curso_primero.siguiente;
                    Archivo.curso_tamano--;
                    archivo.curso_ultimo.enlazarsiguiente(Archivo.curso_primero);

                    JOptionPane.showMessageDialog(null, "Curso eliminado", "ELIMINADO", JOptionPane.WARNING_MESSAGE);
                } else {
                    do {
                        if (aux.siguiente.getCodigo() == Integer.valueOf(text[0].getText())) {
                            validacion = true;
                            break;
                        }
                        aux = aux.siguiente;
                    } while (aux.siguiente != Archivo.curso_primero);
                    if (validacion) {
                        JOptionPane.showMessageDialog(null, "Curso eliminado", "ELIMINADO", JOptionPane.WARNING_MESSAGE);
                        aux.siguiente = aux.siguiente.siguiente;
                        Archivo.curso_tamano--;
//cambiar el valor del ultimo :v
                        if (aux.siguiente != null) {
                            Archivo.curso_ultimo = aux;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "no hay curso", "ALERTA", JOptionPane.WARNING_MESSAGE);
                    }
                }

                marco.setVisible(false);
                add();
            }
        };
        boton_confirmar.addActionListener(eliminar_accion);

    }

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

    public void solo_letra(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(null, "No Se Permiten numeros", "ALERTA", JOptionPane.WARNING_MESSAGE);
                    e.consume();

                }
            }

        });

    }
    
     public void ver_catedraticos() {

        JFrame marco = new JFrame("MOSTRAR CATEDRATICOS");
        JPanel pintar = new JPanel();

        marco.setLayout(null);
        pintar.setLayout(null);
        JLabel titulo = new JLabel("MOSTRAR CATEDRATICOS");
        marco.setBounds(200, 200, 700, 400);
        pintar.setBounds(0, 0, 700, 400);

        titulo.setBounds(300, 50, 200, 30);

        marco.setVisible(true);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel log_out = new JLabel("LOG OUT");
        log_out.setBounds(600, 10, 80, 30);

        JLabel regresar = new JLabel("REGRESAR");
        regresar.setBounds(600, 45, 80, 30);

        marco.setResizable(false);

        pintar.add(regresar);
        pintar.add(log_out);

        pintar.add(titulo);
        marco.add(pintar);

        log_out.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);
                Login login = new Login();
                login.buscar();

            }
        });
        regresar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco.setVisible(false);

                add();

            }
        });
 String data[][] = new String[archivo.catedratico_tamano][2];
        int contador = 0;
        if (archivo.catedratico_vacio()!= true) {

            try {
                Catedratico aux = archivo.catedratico_primero;
                do {

                    data[contador][0] = aux.getNombre();
                    data[contador][1] = aux.getPassword();
                     
                    contador++;
                    aux = aux.siguiente;

                } while (archivo.catedratico_primero!= aux);
            } catch (Exception e) {

            }
        }

        String tituloo[] = {"Nombre", "Contraseña"};

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
        scroll.repaint();
        scroll.setBounds(100, 100, 500, 200);
        

     }
}
