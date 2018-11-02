
package proyecto_2_201700556;

public class Estudiante extends     Usuario
{
 
 Estudiante siguiente;
 Estudiante anterior;
public Estudiante (String carnet,String DPI,String nombre,String correo,String direccion,int Credito,String password)
{
    this.carnet=carnet;
    this.DPI=DPI;
    this.nombre=nombre;
    this. correo=correo;
    this .direccion=direccion;
    this .Credito=Credito;
    this .password=password;
    siguiente=null;
    anterior=null;
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

 Estudiante obtenerSiguiente()
    {
    return  siguiente;
    
    }
   
   public void enlazar_siguiente(Estudiante siguiente){this.siguiente=siguiente;}
    Estudiante obtenerAnterior()
    {
    
    return anterior;
    }
public void enlazar_anterior(Estudiante anterior){this.anterior=anterior;}


}
