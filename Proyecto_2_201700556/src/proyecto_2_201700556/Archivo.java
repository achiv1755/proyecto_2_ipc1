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
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author juare
 */
public class Archivo 
{   String archivo;
    public void Leer()
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
        {
    
            // System.out.println(linea);
             //separa la linea  en palabra
            StringTokenizer st = new StringTokenizer (linea);
            
     while (st.hasMoreTokens ()) {
         // "$$" el parametro que separa la linea 

        //cambiar de lugar 
        //st.nextToken ("$$");
     }}
//contadores
        
         
        
//        
//               if (  0!=archivo_guardado.length()) 
//            {
//              
//               JOptionPane.showMessageDialog(null, "carga completa");  
//            }
           // else{JOptionPane.showMessageDialog(null, "no hay datos que cargar");  }
            
            
       //siempre se debe cerrar el archivo
        
         //  br.close();
       // fr.close();   
      
    
    
    
    
    
}catch (Exception c){JOptionPane.showMessageDialog(null, "archivo no valido"+ c);}}}