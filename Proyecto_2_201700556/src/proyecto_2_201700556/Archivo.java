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
import proyecto_2_201700556.dinamico.Administrador;


public class Archivo 
{   String archivo;
      Estudiante aux; 
    public   static Estudiante  estudiante_primero;
    public static   Estudiante estudiante_ultimo;
    public static int estudiante_tamano;
    
    public static Curso curso_primero;
    public static Curso curso_ultimo;
    public static int curso_tamano;
    
    public static Catedratico catedratico_primero;
    public static Catedratico catedratico_ultimo;
    public static int catedratico_tamano;
    
 
        //Curso primero=null;
       // Curso ultimo=null;
     
     
     
     
     
     
public Archivo ()
    { 
       
     estudiante_primero =estudiante_primero;
    estudiante_ultimo=estudiante_ultimo;
    estudiante_tamano=estudiante_tamano;
    
    curso_primero=curso_primero;
    curso_ultimo=curso_ultimo;
    curso_tamano=curso_tamano;
    
    catedratico_tamano=catedratico_tamano;
    catedratico_primero=catedratico_primero;
    catedratico_ultimo=catedratico_ultimo;
    }
    public boolean estudiante_vacio()
    {
        if (estudiante_primero==null) {
          return true;  
        }
        else{return  false;}
    
    }
       public boolean curso_vacio()
    {
        if (curso_primero==null) {
          return true;  
        }
        else{return  false;}
    
    }
       
          public boolean catedratico_vacio()
    {
        if (catedratico_primero==null) {
          return true;  
        }
        else{return  false;}
    
    }
    
     public void Estudiante_agregar_final(Estudiante nuevo){
      
        // Consulta si la lista esta vacia.
        if (estudiante_vacio()) {
         
            estudiante_primero = nuevo;
           
            estudiante_ultimo = nuevo;
            
          
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
    {  if(j.getSelectedFile()!=null){
        
        
        
       
         
         archivo=j.getSelectedFile().getAbsolutePath();
         
         
         String aux_archivo=archivo;
             
         String []verificar= aux_archivo.split("\\.");
         
              
              
         
                if (verificar[1].equals("ipc_c")) {
                             
         
         
         
         
    archivo_guardado=new File(archivo);
        
    fr=new FileReader(archivo_guardado);
    br=new BufferedReader(fr);
        
        String linea;
        //lee el archivo que no sea nulo
       
        while((linea=br.readLine())!=null)
        { String []info=new String[6];
        int i=0;
    
             
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
               Administrador Administrador=new Administrador();
    Administrador.add();
            }
            else{JOptionPane.showMessageDialog(null, "no hay datos que cargar");  }
            
            
      // siempre se debe cerrar el archivo
        
           br.close();
        fr.close();   
      
    
    
  
    
                }else{JOptionPane.showMessageDialog(null, "Archivo no valido");Administrador Administrador=new Administrador();Administrador.add();}}   else{Administrador Administrador=new Administrador();
    Administrador.add();}
}catch (Exception c){JOptionPane.showMessageDialog(null, "archivo no valido"+ c);Administrador Administrador=new Administrador();
    Administrador.add();}}



//muestra de adelante para atras
public void mostrar ()
{
    Estudiante aux;
    aux=estudiante_primero;
    do{
        System.out.println(aux.getCarnet());
       aux= aux.siguiente;
    }while (aux!=estudiante_primero);

Administrador Administrador=new Administrador();
    Administrador.add();
}

//muestra de atras para adelante 
public void mostrar2 ()
{ 
    Estudiante aux;
    aux=estudiante_primero.anterior;
    //verificar si es nulo o no :v sino ya pise xD
    do{
        System.out.println(aux.getCarnet());
       aux= aux.anterior;
    }while (aux!=estudiante_primero.anterior);

Administrador Administrador=new Administrador();
    Administrador.add();
}
public void curso_leer()
{
 // es para 
    File archivo_guardado;
    FileReader fr;
    BufferedReader br;
  javax.swing.JFileChooser j=new javax.swing.JFileChooser();
       j.showOpenDialog(j);
    
    try
    {  if(j.getSelectedFile()!=null){
         archivo=j.getSelectedFile().getAbsolutePath();
         String aux_archivo=archivo;
         String []verificar= aux_archivo.split("\\.");
           if (verificar[1].equals("ipc_c")) {
            archivo_guardado=new File(archivo);
        
    fr=new FileReader(archivo_guardado);
    br=new BufferedReader(fr);
        
        String linea;
        //lee el archivo que no sea nulo
       
        while((linea=br.readLine())!=null)
        {  
        
         linea=linea.replace(";;","; ;");
          String   []info=linea.split(";");
   
     
        curso_vacio();
        boolean estado=false;
        if(info[4].equalsIgnoreCase("si")){estado=true;}else{estado=false;}
         
            
            
            if (info.length==7) {
                String z="-1";
                
                  curso_agregar_final(new Curso(Integer.valueOf(info[0]),info[1],info[2],Integer.valueOf(info[3]),estado,info[5]),info[6],z);
            }
             
            
                 
            else{
 
               
        curso_agregar_final(new Curso(Integer.valueOf(info[0]),info[1],info[2],Integer.valueOf(info[3]),estado,info[5]),info[6],info[7]);
            }
        }

        
         
        
        
               if (  0!=archivo_guardado.length()) 
            {
              
               JOptionPane.showMessageDialog(null, "carga completa");
               Administrador Administrador=new Administrador();
    Administrador.add();
            }
            else{JOptionPane.showMessageDialog(null, "no hay datos que cargar");  }
            
            
      // siempre se debe cerrar el archivo
        
           br.close();
        fr.close();   
      
    
    
  
    
                }else{JOptionPane.showMessageDialog(null, "Archivo no valido");Administrador Administrador=new Administrador();Administrador.add();}}   else{Administrador Administrador=new Administrador();
    Administrador.add();}
}catch (Exception c){JOptionPane.showMessageDialog(null, "archivo no valido"+ c);Administrador Administrador=new Administrador();
    Administrador.add();}
    

}
public void curso_agregar_final(Curso nuevo,String pre_cursos,String pos_cursos)
{
  // Consulta si la lista esta vacia.
        if (curso_vacio()) {
         
            curso_primero = nuevo;
           
            curso_ultimo = nuevo;
            if (pre_cursos.equals(" ")) {}else{agregar_pre_final( pre_cursos,true);  }
            if (pos_cursos.equals("-1")) {}else{agregar_pos_final(pos_cursos,true);}
                
            
        } else{
            
            curso_ultimo.enlazarsiguiente(nuevo);
            
            
            nuevo.enlazarsiguiente(curso_primero);
            
            
            
            curso_ultimo = nuevo;
              if (pre_cursos.equals(" ")) {}else{agregar_pre_final( pre_cursos,false); }
             if (pos_cursos.equals("-1")) {}else{agregar_pos_final(pos_cursos,false);}      
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        curso_tamano++;

}
public void catedratico_agregar_final(Catedratico nuevo)
{
  // Consulta si la lista esta vacia.
        if (catedratico_vacio()) {
         
            catedratico_primero = nuevo;
           
            catedratico_ultimo = nuevo;
            
            catedratico_ultimo.enlazarsiguiente(catedratico_primero);
           
        } else{
            
            catedratico_ultimo.enlazarsiguiente(nuevo);
            
            
            nuevo.enlazarsiguiente(catedratico_primero);
            
            
            
            catedratico_ultimo = nuevo;
        }
       
        catedratico_tamano++;

}
public void agregar_pre_final(String cadena_cursos,boolean primer_curso)
{
        Curso primero=null;
       Curso ultimo=null;
         String []Pre=cadena_cursos.split(",");
     
            
            for (int i = 0; i < Pre.length; i++) {
             
    Curso nuevo= new Curso(Integer.valueOf(Pre[i]),"","",0,false,"");
            
    if (primero==null) {
             primero= nuevo;
            ultimo=nuevo;
            
    }else
    {
        ultimo.enlazarsiguientepre(nuevo);
        nuevo.enlazarsiguientepre(primero);
        ultimo=nuevo;
      }  }     
          
    Curso aux;
      aux=primero;
             if (primer_curso)
            {
                curso_primero.enlazarsiguientepre(primero); 
                curso_ultimo=curso_primero;
               
         
            }else
            {
             curso_ultimo.enlazarsiguientepre(primero);
             
            } }
public void agregar_pos_final(String cadena_pos,boolean primer_curso)
{
 Curso primero=null;
       Curso ultimo=null;
         String []pos=cadena_pos.split(",");
      
            
            for (int i = 0; i < pos.length; i++) {
    
    Curso nuevo= new Curso(Integer.valueOf(pos[i]),"","",0,false,"");
            
    if (primero==null) {
             primero= nuevo;
            ultimo=nuevo;
            
    }else
    {
        ultimo.enlazarpos(nuevo);
          nuevo.enlazarpos(primero);
       ultimo=nuevo;  }  }     
          
    Curso aux;
      aux=primero;
             if (primer_curso)
            {
                curso_primero.enlazarpos(primero); 
                curso_ultimo=curso_primero;
            }else
            {
             curso_ultimo.enlazarpos(primero);
            }





}
public void mostrar3()
{
    
    
    Curso aux;
      aux=curso_primero;
      
      do{
          System.out.println(aux.getCodigo()+"    ,  "+aux.getNombre());
          
          Curso aux2=aux;
          
          
          
         // while(aux2.pre_siguiente!=null)
          do{
             System.out.print(aux2.pre_siguiente.getCodigo()+" ,");
             
             aux2.pre_siguiente=aux2.pre_siguiente.pre_siguiente;
          }while(aux2.pre_siguiente!=aux.pre_siguiente);
          
          System.out.println("");
          
      aux=aux.siguiente;
      }while(aux!=curso_primero);
      
      

}
}