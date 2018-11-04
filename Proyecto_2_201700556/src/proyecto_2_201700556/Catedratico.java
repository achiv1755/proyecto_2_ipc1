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
public class Catedratico extends Usuario
{
    Catedratico siguiente;
public Catedratico (String nombre, String password)
{
 
    this.nombre=nombre;
   
    this .password=password;
    siguiente=null;

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

     Catedratico  obtenersiguiente() {
         return siguiente;
         
    }
public void enlazarsiguiente(Catedratico siguiente){this.siguiente=siguiente;}
    

    
}
