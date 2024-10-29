public class Persona {
    private String nombre;

    private Auto tiene;

    public Persona() {

    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Auto getTiene() {
        return tiene;
    }

    public void setTiene(Auto tiene) {
        this.tiene = tiene;
    }

    public void caminar(){
        System.out.println("Estoy caminando");
    }
    public void mostrarDatos(){
        System.out.println("Yo soy " + nombre);
    }
}
