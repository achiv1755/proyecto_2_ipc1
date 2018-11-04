/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201700556;

/**
 *
 * @author juare
 */
public class Curso 
{
 int codigo;
 String nombre;
 String catedratico;
 int credito;
 boolean laboratorio;
 String seccion;
 boolean estado;
 
 Curso siguiente;
  Curso pre_siguiente;
  Curso pos_siguiente;
  
  
  public Curso (int codigo,String nombre,String catedratico,int credito,boolean laboratorio,String seccion)
  {
  this.codigo=codigo;
  this.nombre=nombre;
  this.catedratico=catedratico;
  this.credito=credito;
  this.laboratorio =laboratorio;
  this.estado=false;
  pre_siguiente=null;
  siguiente=null;
  pos_siguiente=null;
  this.seccion=seccion;
  
  
  }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(String catedratico) {
        this.catedratico = catedratico;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public boolean isLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(boolean laboratorio) {
        this.laboratorio = laboratorio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
  
    
    Curso obtenetsiguiente()
    {
    return siguiente;
    }
  public void enlazarsiguiente(Curso siguiente)
  {
  this.siguiente=siguiente;
  }
  Curso obtenerPre()
  {return pre_siguiente;}
  public void  enlazarsiguientepre(Curso pre_siguiente)
  {
      this.pre_siguiente=pre_siguiente;
  }
  Curso obtenerpos(){return pos_siguiente;}
  public void enlazarpos(Curso pos_siguiente)
  {
  this.pos_siguiente=pos_siguiente;
  
  }
  
}

