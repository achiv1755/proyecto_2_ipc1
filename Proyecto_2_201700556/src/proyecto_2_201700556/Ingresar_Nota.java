/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201700556;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto_2_201700556.dinamico.Login;

/**
 *
 * @author juare
 */
public class Ingresar_Nota extends Catedratico {
    String year_curso = "";
    String semestre_curso = "";
    String Curso_curso = "";
    static  String nombre_2;
    int contador_cursos = 0;
    Semestre semestre_buscado;
    DefaultTableModel tabla_1;
    public Ingresar_Nota(String nombre){ 
nombre_2=nombre;
     
    }
    public Ingresar_Nota() {
         
        initComponents( );
        
        
         JButton boton_modificar =new JButton("Modificar Nota");
         Object data[][] = new Object[1][4];
         data[0][0]="201700556";
           data[0][1]="juan";
             data[0][2]="0";
              data[0][3]=boton_modificar;
           tabla.setDefaultRenderer(Object.class, new Render());
    String tituloo[] = {"Carnet", "Nombre", "Nota","Modificar Nota"};
       tabla.setRowHeight(30);
    tabla_1=new DefaultTableModel(data, tituloo)
          
            
                 
          {
            @Override
            public boolean isCellEditable(int filas, int columna) {
                if (columna >= 0) {
                    return false;
                }
                return super.isCellEditable(filas, columna);
            }
        };

    this.tabla.setModel(tabla_1);
    
    }

    public String getNombre_2() {
        return nombre_2;
    }
//    public void ingresarnombre(String nombre)
//{System.out.println(nombre);
//nombre_2=nombre;
//    
//   
//      
//m( );
//}

    public void setNombre_2(String nombre_2) {
        this.nombre_2 = nombre_2;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combo_semestre = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        combo_year = new javax.swing.JComboBox<>();
        combo_curso = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INGRESAR NOTAS");

        jLabel2.setText("LOG OUT");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setText("REGRESAR");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        combo_semestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Primer Semestre", "Segundo Semestre" }));
        combo_semestre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_semestreItemStateChanged(evt);
            }
        });
        combo_semestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_semestreActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Nota", "Editar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combo_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        combo_year.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_yearItemStateChanged(evt);
            }
        });
        combo_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_yearActionPerformed(evt);
            }
        });

        combo_curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        combo_curso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_cursoItemStateChanged(evt);
            }
        });
        combo_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_cursoActionPerformed(evt);
            }
        });

        jLabel4.setText("SEMESTRE");

        jLabel5.setText("AÑO");

        jLabel6.setText("CURSO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(combo_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo_year, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jButton1)
                                .addGap(0, 217, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(321, 321, 321)
                                .addComponent(jLabel3)))))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(combo_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        for (int i = 17; i < 26; i++) {

            combo_year.addItem("20" + i);
        }
        Archivo Archivo=new Archivo();
        if (!Archivo.curso_vacio()) {
            Curso aux = Archivo.curso_primero;
            do {
                if  (nombre_2.equalsIgnoreCase(aux.getCatedratico())){
                    combo_curso.addItem(aux.getNombre());}
                aux = aux.siguiente;
            } while (Archivo.curso_primero != aux);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_semestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_semestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_semestreActionPerformed

    private void combo_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_yearActionPerformed

    private void combo_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_cursoActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
     setVisible(false);
            Login login = new Login();
            login.buscar();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
 setVisible(false);
Catedratico e=new Catedratico() ;
        
         
e.pagina_principal();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void combo_semestreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_semestreItemStateChanged
    semestre_curso = (String) combo_semestre.getSelectedItem();  
    }//GEN-LAST:event_combo_semestreItemStateChanged

    private void combo_yearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_yearItemStateChanged
year_curso=(String)combo_year.getSelectedItem();
       
    }//GEN-LAST:event_combo_yearItemStateChanged

    private void combo_cursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_cursoItemStateChanged
       Curso_curso=(String)combo_curso.getSelectedItem();
    }//GEN-LAST:event_combo_cursoItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  if (combo_semestre.getSelectedItem().equals("") || combo_year.getSelectedItem().equals("") || combo_curso.getSelectedItem().equals("")) {
                   JOptionPane.showMessageDialog(null, "Llene todos los campos");
                }else{       
        mostrar_tabla20();}
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
int column=tabla.getColumnModel().getColumnIndexAtX(evt.getX());
 int row=evt.getY()/tabla.getRowHeight();
        if ( row<tabla.getRowCount()&& row>=0&& column<tabla.getColumnCount()&&column>=0)  
        {
            Object Value=tabla.getValueAt(row, column);
            if (Value instanceof  JButton) 
            {
               ( (JButton)Value).doClick();
               JButton boton=(JButton)Value;
              
                
                {
                    //eventos para modificar
                }
            }
        }
        
    }//GEN-LAST:event_tablaMouseClicked

  
    public  void m() {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Nota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_curso;
    private javax.swing.JComboBox<String> combo_semestre;
    private javax.swing.JComboBox<String> combo_year;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
 private void mostrar_tabla20()
     {          
        int contador=0;
        int contador2=0;
         
         Estudiante aux_estudiante=Archivo.estudiante_primero;
         if (aux_estudiante==null) {
             tabla.setDefaultRenderer(Object.class, new Render());
            
             
                     Object data[][] = new Object[contador][4];
                String tituloo[] = {"Carnet", "Nombre", "Nota","Modificar Nota"};
                  tabla.setRowHeight(30);
        tabla_1=new DefaultTableModel(data, tituloo)     
          {
            @Override
            public boolean isCellEditable(int filas, int columna) {
                if (columna >= 0) {
                    return false;
                }
                return super.isCellEditable(filas, columna);
            }
        };

        this.tabla.setModel(tabla_1);
             
         }else{
         do {
             // imprime el false 
            // System.out.println(recorer_semestre(aux_estudiante));
             if (recorer_semestre(aux_estudiante)) {
                // System.out.println("hola");
               contador++;
                
                
             }
             aux_estudiante=aux_estudiante.siguiente;
         } while (aux_estudiante!=Archivo.estudiante_primero&& Archivo.estudiante_primero!=Archivo.estudiante_ultimo);
         
         tabla.setDefaultRenderer(Object.class, new Render());
        Object data[][] = new Object[contador][4];
        
              do {
                 // System.out.println("recore todo lol");
             if (recorer_semestre(aux_estudiante)) {
                   
             JButton boton_modificar =new JButton("Modificar Nota");
                // System.out.println("encontro al estudiantre");
                  data[contador2][0] = "" + aux_estudiante.getCarnet();
                    data[contador2][1] = aux_estudiante.getNombre();
                    Double nota=recorer_semestre_nota(aux_estudiante);
                    data[contador2][2] = ""+nota;
                    data[contador2][3]=boton_modificar;
                contador2++;
             }
             aux_estudiante=aux_estudiante.siguiente;
         } while (aux_estudiante!=Archivo.estudiante_primero&& Archivo.estudiante_primero!=Archivo.estudiante_ultimo);
        
        
        
        
        
        String tituloo[] = {"Carnet", "Nombre", "Nota","Modificar Nota"};
          tabla.setRowHeight(30);
        tabla_1=new DefaultTableModel(data, tituloo)
 
          {
            @Override
            public boolean isCellEditable(int filas, int columna) {
                if (columna >= 0) {
                    return false;
                }
                return super.isCellEditable(filas, columna);
            }
        };
       

        
        
        this.tabla.setModel(tabla_1);
         }
     }
         

 
 private boolean recorer_semestre(Estudiante estudiante)
 {//areglar este metodo
    
   // // System.out.println(estudiante.primer_semestre);
    //(semestre_curso+" y "+year_curso);
     Semestre aux_semestre=estudiante.primer_semestre;
     if (aux_semestre==null) {
         
         return false;
     }else{
     do 
     {//ekl problema es aqui en teoria 
      //  // System.out.println(aux_semestre.getSemestre());
        // System.out.println(aux_semestre.getYear());
         if (semestre_curso.equalsIgnoreCase(aux_semestre.getSemestre())&&year_curso.equalsIgnoreCase(aux_semestre.getYear())) 
         {
            // System.out.println("encontro el semestre ");
             //posible error????
             if (recorer_cursos(aux_semestre)){return true;}
         }
         
         aux_semestre=aux_semestre.siguiente_semestre;
         
     } while (aux_semestre!=estudiante.primer_semestre&&estudiante.primer_semestre!=estudiante.ultimo_semestre);}
     return false;
 
 }
 private boolean recorer_cursos(Semestre semestre)
 {
     
     Curso aux_curso=semestre.primer_curso;
     if (aux_curso==null) {
         return false;
     }else{
     do {
         if (Curso_curso.equalsIgnoreCase(aux_curso.getNombre())) {
             return true;
         }
         aux_curso=aux_curso.siguiente;
     } while (aux_curso!=semestre.primer_curso&&semestre.primer_curso!=semestre.ultimo_curso);}
     
 
 return false;
 }
  private Double recorer_semestre_nota(Estudiante estudiante)
 {
     Semestre aux_semestre=estudiante.primer_semestre;
     do 
     {
         if (semestre_curso.equalsIgnoreCase(aux_semestre.getSemestre())&&year_curso.equalsIgnoreCase(aux_semestre.getYear())) 
         {
           return  recorer_cursos_nota(aux_semestre);
         }
         
         aux_semestre=aux_semestre.siguiente_semestre;
         
     } while (aux_semestre!=estudiante.primer_semestre&&estudiante.primer_semestre!=estudiante.ultimo_semestre);
     return 0.0;
 
 }
 private Double recorer_cursos_nota(Semestre semestre)
 {
     Curso aux_curso=semestre.primer_curso;
     do {
         if (Curso_curso.equalsIgnoreCase(aux_curso.getNombre())) {
             return  aux_curso.getNota();
         }
         aux_curso=aux_curso.siguiente;
     } while (aux_curso!=semestre.primer_curso&&semestre.primer_curso!=semestre.ultimo_curso);
     
 
 return 0.0;
 }
}
