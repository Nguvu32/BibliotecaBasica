public class Autoria {
    private int idAutoria;
    private String nombre;
    private String apellidos;

    public Autoria() {

    }

    public int getIdAutoria() {
        return idAutoria;
    }

    public void setIdAutoria(int id) {
        this.idAutoria = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String mostrar(){
        return "[ID: " + idAutoria + "], [Nombre: " + nombre + "], [Apellidos: " + apellidos + "]";
    }
}
