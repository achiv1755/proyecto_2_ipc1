/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201700556;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class Archivo 
{   String archivo;
      Estudiante aux; 
     static Estudiante  estudiante_primero;
     static   Estudiante estudiante_ultimo;
     static int estudiante_tamano;
public Archivo ()
    { 
     estudiante_primero =estudiante_primero;
    estudiante_ultimo=estudiante_ultimo;
    estudiante_tamano=estudiante_tamano;
    }
    public boolean estudiante_vacio()
    {
        if (estudiante_primero==null) {
          return true;  
        }
        else{return  false;}
    
    }
    
     public void Estudiante_agregar_final(Estudiante nuevo){
      
        // Consulta si la lista esta vacia.
        if (estudiante_vacio()) {
         
            estudiante_primero = nuevo;
           
            estudiante_ultimo = nuevo;
            
            estudiante_ultimo.enlazar_siguiente(estudiante_primero);
            estudiante_primero.enlazar_anterior(estudiante_ultimo);
        } else{
            
            estudiante_ultimo.enlazar_siguiente(nuevo);
            nuevo.enlazar_anterior(estudiante_ultimo);
            
            nuevo.enlazar_siguiente(estudiante_primero);
            estudiante_primero.enlazar_anterior(nuevo);
            
            
            estudiante_ultimo = nuevo;
        }
       
        estudiante_tamano++;
    }
    
  
    
    public void Estudiantes_Leer()
    {
        // es para 
    File archivo_guardado;
    FileReader fr;
    BufferedReader br;
  javax.swing.JFileChooser j=new javax.swing.JFileChooser();
       j.showOpenDialog(j);
       
       
      
    try
    {
         archivo=j.getSelectedFile().getAbsolutePath();
    archivo_guardado=new File(archivo);
       
    fr=new FileReader(archivo_guardado);
    br=new BufferedReader(fr);
        
        String linea;
        //lee el archivo que no sea nulo
       
        while((linea=br.readLine())!=null)
        { String []info=new String[6];
        int i=0;
    
            // System.out.println(linea);
             //separa la linea  en palabra
            StringTokenizer st = new StringTokenizer (linea);
            
     while (st.hasMoreTokens ()) {
         // ";" el parametro que separa la linea 

        //cambiar de lugar 
          info[i]  = st.nextToken (";");
            i++;
     }
        
        //nuevo estudiante 
        estudiante_vacio();
        String contra=null;
           Random aleatorio = new Random();
        int ID = 50 + aleatorio.nextInt(100);
        contra=info[0]+ID;
        Estudiante_agregar_final(new Estudiante(info[0],info[1],info[2],info[3],info[4],Integer.valueOf(info[5]),contra));
       
        }

        
         
        
        
               if (  0!=archivo_guardado.length()) 
            {
              
               JOptionPane.showMessageDialog(null, "carga completa");  
            }
            else{JOptionPane.showMessageDialog(null, "no hay datos que cargar");  }
            
            
      // siempre se debe cerrar el archivo
        
           br.close();
        fr.close();   
      
    
    
  
    
    
}catch (Exception c){JOptionPane.showMessageDialog(null, "archivo no valido"+ c);}}




public void mostrar ()
{
    Estudiante aux;
    aux=estudiante_primero;
    do{
        System.out.println(aux.getCarnet());
       aux= aux.siguiente;
    }while (aux!=estudiante_primero);



}

}