public class Libro {
    private float isbn;
    private String nombre;
    private int idAutoria;
    private int cantidad;

    public Libro(float isbn, String nombre, int autoria, int cantidad) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.idAutoria = autoria;
        this.cantidad = cantidad;
    }

    public Libro() {

    }

    public float getIsbn() {
        return isbn;
    }

    public void setIsbn(float isbn) {
        if (isbn >= 1_000_000_000 || isbn <= 9_999_999_999_999f) {
            this.isbn = isbn;
        } else {
            System.out.println("ERROR en PARAMETRO: el isbn es un numero de 10 a 13 cifras");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdAutoria() {
        return idAutoria;
    }

    public void setIdAutoria(int idAutoria) {
        this.idAutoria = idAutoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public String mostrar() {
        return "[ISBN-> " + isbn + "], [Nombre-> " + nombre + "], [Autoria-> " + idAutoria + "], [Cantidad-> " + cantidad + "]";
    }
}
