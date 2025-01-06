public class Biblioteca {
    private Libro[] libros = new Libro[100];
    private Autoria[] autorias = new Autoria[100];
    public Biblioteca() {

    }

    public void aniadirLibro(Libro libro) {
        int i = 0;
        boolean colocado = false;
        GestorIO gestorIO = new GestorIO();
        while (i < libros.length && !colocado) {
            if (libros[i] == null) {
                libros[i] = libro;
                gestorIO.out("Introduce el ISBN, numero de 10 a 13 cifras: ");
                libro.setIsbn(gestorIO.inFloat());
                gestorIO.out("Introduce el Nombre del libro: ");
                libro.setNombre(gestorIO.inString());
                gestorIO.out("Introduce el ID de la Autoria del libro: ");
                libro.setIdAutoria(gestorIO.inInt());
                gestorIO.out("Introduce la cantidad total de libros: ");
                libro.setCantidad(gestorIO.inInt());
                colocado = true;
            } else {
                i++;
            }
        }
    }

    public Libro buscarLibro(float isbn) {
        int i = 0;
        boolean encontrado = false;
        GestorIO gestorIO = new GestorIO();
        while (i < libros.length && !encontrado) {
            if (libros[i].getIsbn() == isbn) {
                encontrado = true;
            } else {
                i++;
            }
        }
        if (encontrado) {
            gestorIO.out(libros[i].mostrar());
            return libros[i];
        } else {
            gestorIO.out("El libro que buscas no se encuentra en esta biblioteca.");
            return null;
        }
    }

    public void eliminarLibro(float isbn) {
        int i = 0;
        boolean encontrado = false;
        GestorIO gestorIO = new GestorIO();
        while (i < libros.length && !encontrado) {
            if (libros[i].getIsbn() == isbn && libros[i].getCantidad() != 1) {
                gestorIO.out("El libro tiene " + libros[i].getCantidad() + " ejemplares, si quieres eliminar todos los ejemplares marca 'y', si no marca 'n'.");
                char respuesta = gestorIO.inChar();
                if (respuesta == 'y') {
                    libros[i] = null;
                    gestorIO.out("se han eliminado todos los libros");
                } else {
                    libros[i].setCantidad(libros[i].getCantidad() - 1);
                    gestorIO.out("la nueva cantidad es de " + libros[i].getCantidad());
                }
                encontrado = true;
            } else if (libros[i].getIsbn() == isbn && libros[i].getCantidad() == 1) {
                libros[i] = null;
                gestorIO.out("El libro se ha eliminado correctamente.");
                encontrado = true;
            } else {
                i++;
            }
        }
    }


    public Autoria buscarAutoria(int idAutoria) {
        int i = 0;
        boolean encontrado = false;
        GestorIO gestorIO = new GestorIO();
        while (i < autorias.length && !encontrado) {
            if (autorias[i].getIdAutoria() == idAutoria) {
                encontrado = true;
            } else {
                i++;
            }
        }
        if (encontrado) {
            gestorIO.out(autorias[i].mostrar());
            return autorias[i];
        } else {
            gestorIO.out("La autoria que buscas no se encuentra en esta biblioteca.");
            return null;
        }
    }

    public void aniadirAutoria(Autoria autoria) {
        int i = 0;
        boolean colocado = false;
        GestorIO gestorIO = new GestorIO();
        while (i < autorias.length && !colocado) {
            if (autorias[i] == null) {
                autorias[i] = autoria;
                autoria.setIdAutoria(i + 1);
                gestorIO.outln("Para el ID " + (i + 1) + " añadiremos:");
                gestorIO.outln("- Nombre del autor/a: ");
                autorias[i].setNombre(gestorIO.inString());
                gestorIO.outln("- Apellido del autor/a: ");
                autorias[i].setApellidos(gestorIO.inString());
                colocado = true;
            } else {
                i++;
            }
        }
    }

    public void mostrarAutorias() {
        GestorIO gestorIO = new GestorIO();
        for (int i = 0; i < autorias.length; i++) {
            if (autorias[i] != null) {
                gestorIO.outln((i + 1) + ". " + autorias[i].mostrar());
            } else {
                gestorIO.outln((i + 1) + ". " + "hueco autoria.");
            }

        }
    }

    public void mostrar() {
        GestorIO gestorIO = new GestorIO();
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                gestorIO.outln((i + 1) + ". " + libros[i].mostrar());
            } else {
                gestorIO.outln((i + 1) + ". " + "hueco libre.");
            }

        }
    }
}
