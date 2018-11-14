/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201700556;

import java.awt.Frame;
import javax.swing.table.DefaultTableModel;
import proyecto_2_201700556.dinamico.Login;

/**
 *
 * @author juare
 */
public class Curso_Aprobado extends Estudiante {
 DefaultTableModel tabla_1;
    int contador=0;
      String carnet_3;
      
    Estudiante estudiante_encontrado;

    public Curso_Aprobado()
    {
        initComponents();
       
                estudiante_encontrado=buscar_estudiante(nombre_del_usuario);
            
            recorer_semestres(estudiante_encontrado);
        
        
        
        
            
    String data[][] = new String[contador][4];
         
           
    //ingresa toda la info :v
    
    //ya tengo al estudiante ahora devo recorerlo
     
    Semestre aux_semestre=estudiante_encontrado.primer_semestre;
    int cont=0;
    if (aux_semestre!=null) {
        
    
    do {
        
        if (!aux_semestre.curso_vacio()) 
        {
             Curso aux_curso=aux_semestre.primer_curso;
            // recorer cursos
             

    do {
        
      if (aux_curso.isEstado())
        {
            data[cont][0]=""+aux_curso.getCodigo();
            data[cont][1]=aux_curso.getNombre();
            data[cont][2]=""+aux_curso.getCredito();
            data[cont][3]=""+aux_curso.getNota();
            
            cont++;
        }
        
        
         aux_curso=aux_curso.siguiente;
    } while (aux_curso!=aux_semestre.primer_curso&&aux_semestre.primer_curso!=aux_semestre.ultimo_curso);
    
             
        }
        
        
        
        aux_semestre=aux_semestre.siguiente_semestre;
    } while (aux_semestre!=estudiante_encontrado.primer_semestre&&estudiante_encontrado.primer_semestre!=estudiante_encontrado.ultimo_semestre);}
    
    
    
            
            
            
            
            
            
            
           
    String tituloo[] = {"Codigo", "Nombre", "Credito","Nota"};
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

    public   String getCarnet_3() {
        return carnet_3;
    }

    public   void setCarnet_3(String carnet_3) {
        this.carnet_3 = carnet_3;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CURSO APROBADO");
        setLocation(new java.awt.Point(200, 50));
        setResizable(false);

        jLabel1.setText("CURSOS APROBADOS");

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

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(jLabel1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setVisible(false);
            Login login = new Login();
            login.buscar();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
 
         setVisible(false);
Estudiante e=new Estudiante();
e.pagina_principal();
        
    }//GEN-LAST:event_jLabel3MouseClicked
 
    public  void ver_curso_aprobado(String carnet) {
       
    
       carnet_3=carnet;
      
        
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Curso_Aprobado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Curso_Aprobado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Curso_Aprobado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Curso_Aprobado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Curso_Aprobado().setVisible(true);
            }
        });
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

private Estudiante buscar_estudiante(String carnet)
{
   
    Estudiante aux_estudiante=Archivo.estudiante_primero;
    if (aux_estudiante!=null) {
        
    
    do {
        
        if (aux_estudiante.getCarnet().equalsIgnoreCase(carnet)) 
        {
        return aux_estudiante;
        }
        
        
        aux_estudiante=aux_estudiante.siguiente;
    } while (aux_estudiante!=Archivo.estudiante_primero&&Archivo.estudiante_primero!=Archivo.estudiante_ultimo);
    
    }
    return null;}
 
private void recorer_semestres(Estudiante estudiante)
{
   
   if(estudiante.primer_semestre!=null){
        Semestre aux_semestre=estudiante.primer_semestre;
    do {
        
        if (!aux_semestre.curso_vacio()) 
        {
            // recorer cursos
            recorer_cursos(aux_semestre);
        }
        
        
        
        aux_semestre=aux_semestre.siguiente_semestre;
    } while (aux_semestre!=estudiante.primer_semestre&&estudiante.primer_semestre!=estudiante.ultimo_semestre);}
   
    




}
private void recorer_cursos(Semestre semestre)
{
    Curso aux_curso=semestre.primer_curso;

    do {
        
       if (aux_curso.isEstado())
        {
            contador++;
        }
        
        
         aux_curso=aux_curso.siguiente;
    } while (aux_curso!=semestre.primer_curso&&semestre.primer_curso!=semestre.ultimo_curso);
    
    
    

}

}
