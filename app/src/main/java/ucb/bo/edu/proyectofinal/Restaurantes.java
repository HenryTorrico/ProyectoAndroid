package ucb.bo.edu.proyectofinal;

public class Restaurantes {
    private String nombre;
    private String ubicacion;
    private String tipo;
    public Restaurantes(String nombre, String ubicacion,String tipo)
    {
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.tipo=tipo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
