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
    public Estudiante siguiente;
    public Estudiante anterior;

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
                Admin a = new Admin();
                a.add();
            }
        };

        ActionListener asignar_cursos = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                marco.setVisible(false);
                asignar_curso();
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

    private void asignar_curso() {

        Archivo Archivo = new Archivo();
          marco2 = new JFrame("ASIGNAR CURSO");

        JLabel titulo = new JLabel("ASIGNAR CURSO");

        JButton boton_confirmar = new JButton("CONFIRMAR");

        marco2.setVisible(true);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pintar.setVisible(true);
        marco2.setBounds(200, 100, 1200, 1200);
        
        pintar.setBackground(Color.red);
        pintar.setBounds(200, 100, 500, 300);
       
        
        pintar.setLayout(null);
        marco2.setResizable(false);
        titulo.setBounds(600, 50, 150, 30);
        JLabel regresar = new JLabel("REGRESAR");
        regresar.setBounds(1100, 45, 80, 30);
        pintar.add(regresar);

        boton_confirmar.setBounds(1000, 400, 150, 30);

        boton_confirmar.setBackground(Color.white);
        JLabel log_out = new JLabel("LOG OUT");
        log_out.setBounds(1100, 10, 80, 30);
        pintar.add(log_out);

        JComboBox box_semestre = new JComboBox();
        JComboBox box_year = new JComboBox();
        JComboBox box_curso = new JComboBox();

        box_curso.repaint();
        box_semestre.repaint();
        box_year.repaint();
        box_semestre.setBounds(40 + 80, 150, 150, 30);
        box_year.setBounds(200 + 80, 150, 75, 30);
        box_curso.setBounds(300 + 80, 150, 220, 30);
        box_semestre.addItem("");
        box_semestre.addItem("Primer Semestre");
        box_semestre.addItem("Segundo Semestre");

        box_curso.addItem("");

        box_year.addItem("");
        for (int i = 17; i < 26; i++) {

            box_year.addItem("20" + i);
        }

        JButton asignar = new JButton("ASIGNAR");
        asignar.setBackground(Color.white);
        asignar.setBounds(667, 150, 100, 30);
        pintar.add(asignar);

        ActionListener asignar_accion = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                if (box_semestre.getSelectedItem().equals("") || box_curso.getSelectedItem().equals("") || box_year.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, "Llene todos los campos");
                } else if (contador_cursos == 3) {
                    JOptionPane.showMessageDialog(null, "Limite de cursos asignados", "ALERTA", JOptionPane.WARNING_MESSAGE);
                } else {// se busca si el semestre existe o si es nulo
                    Semestre aux_de_semestre = buscar_semestre(year_curso, semestre_curso);

                    if (aux_de_semestre == null) {

                        //se crea el semestre
                        agregar_semestre(new Semestre(semestre_curso, year_curso));

                        //se crea el curso
                    }

                    Semestre aux_de_semestre2 = buscar_semestre(year_curso, semestre_curso);
                    if (aux_de_semestre2 != null) {
                        semestre_buscado = buscar_semestre(year_curso, semestre_curso);
                        //se crea un curso;

                        Curso aux_curso_encontrado = buscar_curso(Curso_curso);

                        aux_de_semestre2.curso_agregar_final(aux_curso_encontrado);
                        //contador_cursos++;
                        // aux_de_semestre.setCantidad_de_cursos(contador_cursos);

                    }
                    Semestre aux_de_sumar_cursos = buscar_semestre(year_curso, semestre_curso);
                    if (aux_de_sumar_cursos == primer_semestre) {

                        contador_cursos = primer_semestre.curso_tamano;
                    } else {

                        contador_cursos = aux_de_sumar_cursos.curso_tamano;

                    }
                    // mostrardasda();
                    // System.out.println("ff");
                    mostrar_tabla20();

                }

            }
        };
        asignar.addActionListener(asignar_accion);

        if (!Archivo.curso_vacio()) {
            Curso aux = Archivo.curso_primero;
            do {
                box_curso.addItem(aux.getNombre());
                aux = aux.siguiente;
            } while (Archivo.curso_primero != aux);
        }

        pintar.add(box_semestre);
        pintar.add(box_year);
        pintar.add(box_curso);
        marco2.add(pintar);
        pintar.add(titulo);

        pintar.add(boton_confirmar);

        ItemListener year = new ItemListener() {
            public void itemStateChanged(ItemEvent w) {
                if (!year_curso.equals((String) box_year.getSelectedItem())) {
                    // contador_cursos=0;
                }
                year_curso = (String) box_year.getSelectedItem();
                box_year.setFocusable(true);
            }
        };
        ItemListener semestre = new ItemListener() {
            public void itemStateChanged(ItemEvent w) {

                if (!semestre_curso.equals((String) box_semestre.getSelectedItem())) {
                    // contador_cursos=0;
                }

                semestre_curso = (String) box_semestre.getSelectedItem();
                box_semestre.setFocusable(true);

            }
        };
        ItemListener curso_box = new ItemListener() {
            public void itemStateChanged(ItemEvent w) {
                Curso_curso = (String) box_curso.getSelectedItem();
                box_curso.setFocusable(true);
            }
        };

        FocusListener focus = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            }

            public void focusLost(FocusEvent fe) {
                if (!year_curso.equals("") && !semestre_curso.equals("")) {

                    mostrar_tabla20();
                    if (semestre_buscado != null) {

                        Semestre aux_de_sumar_cursos = buscar_semestre(year_curso, semestre_curso);
                        if (aux_de_sumar_cursos == primer_semestre) {

                            contador_cursos = primer_semestre.curso_tamano;
                        }

                        if (aux_de_sumar_cursos != primer_semestre) {

                            contador_cursos = aux_de_sumar_cursos.curso_tamano;

                        }

                    }
                }

            }
        };

        box_year.addItemListener(year);
        box_semestre.addItemListener(semestre);
        box_curso.addItemListener(curso_box);
        box_semestre.addFocusListener(focus);

        box_year.addFocusListener(focus);

        log_out.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco2.setVisible(false);
                Login login = new Login();
                login.buscar();

            }
        });
        regresar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                marco2.setVisible(false);

                pagina_principal();

            }
        });

    }

    private Semestre buscar_semestre(String year_curso, String semestre_curso) {
        if (Semestre_vacio()) {
            return null;
        } else {
            Semestre aux = primer_semestre;
            do {
                if (aux.getSemestre().equals(semestre_curso) && aux.getYear().equals(year_curso)) {

                    return aux;
                }
                aux = aux.siguiente_semestre;
            } while (aux != primer_semestre && primer_semestre != ultimo_semestre);

        }
        return null;

    }

    private Curso buscar_curso(String dato_a_buscar) {//curso que voy a agregar 
        Curso aux = Archivo.curso_primero;
        do {
            if (dato_a_buscar.equalsIgnoreCase(aux.getNombre())) {
                Curso a = new Curso(aux.getCodigo(), aux.getNombre(), aux.getCatedratico(), aux.getCredito(), aux.isLaboratorio(), aux.getSeccion(), aux.getPre_credito(), aux.getPos_credito());

                return a;

            }

            aux = aux.siguiente;
        } while (aux != Archivo.curso_primero && Archivo.curso_primero != Archivo.curso_ultimo);
        return null;
    }

    private void agregar_semestre(Semestre nuevo) {
        Semestre aux = primer_semestre;
        // Consulta si la lista esta vacia.
        if (Semestre_vacio()) {

            primer_semestre = nuevo;
            ultimo_semestre = nuevo;
            ultimo_semestre.enlazar_siguiente_semestre(primer_semestre);

        } else {
            ultimo_semestre.enlazar_siguiente_semestre(nuevo);
            nuevo.enlazar_siguiente_semestre(primer_semestre);
            ultimo_semestre = nuevo;

        }
        semestre_buscado = nuevo;
        semestre_tamano++;
    }

    public boolean Semestre_vacio() {
        if (primer_semestre == null) {
            return true;
        } else {
            return false;
        }

    }

    public void mostrar() {
        Semestre aux = primer_semestre;

        if (primer_semestre == ultimo_semestre) {
            System.out.println(primer_semestre.primer_curso.getCodigo());
            System.out.println(primer_semestre.getYear() + " zzz " + primer_semestre.getSemestre());
            Curso aux2 = aux.primer_curso;

            if (aux.primer_curso == aux.ultimo_curso) {
                System.out.println(aux.primer_curso.getCodigo() + " " + aux.primer_curso.getNombre());
            } else {

                do {

                    System.out.println(aux2.getCodigo() + " " + aux2.getNombre());

                    aux2 = aux2.siguiente;
                } while (aux2 != aux.primer_curso);

            }

        } else {
        }

    }

    private void mostrar_tabla20() {

        Semestre aux_del_semestre = buscar_semestre(year_curso, semestre_curso);

        int contador_de_cursos = 0;

        //contador_cursos
        String data[][] = new String[3][8];
        if (aux_del_semestre == null) {

        } else {
            if (aux_del_semestre.curso_vacio()) {

            } else {
                Curso aux_de_cursos = aux_del_semestre.primer_curso;
                do {

                    //agregar todos los valores a la tabla 
                    data[contador_de_cursos][0] = "" + aux_de_cursos.getCodigo();
                    data[contador_de_cursos][1] = aux_de_cursos.getNombre();
                    data[contador_de_cursos][2] = aux_de_cursos.getCatedratico();
                    data[contador_de_cursos][3] = "" + aux_de_cursos.getCredito();

                    if (aux_de_cursos.isLaboratorio()) {
                        data[contador_de_cursos][4] = "si";
                    } else {
                        data[contador_de_cursos][4] = "no";
                    }

                    data[contador_de_cursos][5] = aux_de_cursos.getSeccion();
                    data[contador_de_cursos][6] = aux_de_cursos.getPre_credito();
                    data[contador_de_cursos][7] = aux_de_cursos.getPos_credito();

                    contador_de_cursos++;
                    aux_de_cursos = aux_de_cursos.siguiente;
                } while (aux_de_cursos != aux_del_semestre.primer_curso && aux_del_semestre.primer_curso != aux_del_semestre.ultimo_curso);

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
        lista_usuario.enable(false);
        JScrollPane scroll = new JScrollPane(lista_usuario);
        scroll.repaint();

        scroll.setBounds(100, 200, 1000, 150);
        pintar.add(scroll);
        
        JPanel panel2 =new JPanel();
        panel2.setBounds(200, 600, 500, 300);
        panel2.setBackground(Color.yellow);
        marco2.add(panel2);

    }

    public void mostrardasda() {
        Semestre aux_semestre = primer_semestre;

        do {
            if (aux_semestre.getSemestre().equals(semestre_curso) && aux_semestre.getYear().equals(year_curso)) {

                break;
            }

            aux_semestre = aux_semestre.siguiente_semestre;
        } while (aux_semestre != primer_semestre && primer_semestre != ultimo_semestre);
        Curso aux_de_curso = aux_semestre.primer_curso;
        do {
            System.out.println(aux_de_curso.getCodigo() + "  " + aux_de_curso.getNombre());
            aux_de_curso = aux_de_curso.siguiente;
        } while (aux_de_curso != aux_semestre.primer_curso && aux_semestre.primer_curso != aux_semestre.ultimo_curso);

    }
}
