/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201700556;

import java.util.StringTokenizer;

 
public class Semestre 
{
String year="";
String semestre="";

public Semestre siguiente_semestre;
  public Curso primer_curso;
  public Curso ultimo_curso;
int curso_tamano=0;
int cantidad_de_cursos=0;
public Semestre(String semestre,String year)
{
this.year=year;
this.semestre=semestre;
siguiente_semestre=null;
primer_curso=null;
ultimo_curso=null;

}

    public int getCurso_tamano() {
        return curso_tamano;
    }

    public void setCurso_tamano(int curso_tamano) {
        this.curso_tamano = curso_tamano;
    }

    public int getCantidad_de_cursos() {
        return cantidad_de_cursos;
    }

    public void setCantidad_de_cursos(int cantidad_de_cursos) {
        this.cantidad_de_cursos = cantidad_de_cursos;
    }

public Semestre(){}
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

public void enlazar_siguiente_semestre(Semestre siguiente_semestre){this.siguiente_semestre=siguiente_semestre;}
 
 Semestre obtenerSiguiente_semestre()
    {
    return  siguiente_semestre;
    
    }
 

public void curso_agregar_final(Curso nuevo)
{
  // Consulta si la lista esta vacia.
        if (curso_vacio()) {
         
            primer_curso = nuevo;
           
            ultimo_curso = nuevo;
            
                
            
        } else{
            
            ultimo_curso.enlazarsiguiente(nuevo);
            
            
           nuevo.enlazarsiguiente(primer_curso);
            
            
            
            ultimo_curso = nuevo;
             
        }curso_tamano++;
        
       

}
public boolean curso_vacio()
    {
        if (primer_curso==null) {
          return true;  
        }
        else{return  false;}
    
    }
 
 
 
}
 