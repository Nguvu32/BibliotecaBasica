public class main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        GestorIO gestorIO = new GestorIO();
        boolean salir = false;

        gestorIO.outln("Bienvenido a la biblioteca IES Palomeras, elija entre una de estas opciones:");
        do {
            System.out.println();
            gestorIO.outln("1. Mostrar el contenido de la Biblioteca.");
            gestorIO.outln("2. Añadir un libro a la biblioteca.");
            gestorIO.outln("3. Buscar un libro de la biblioteca.");
            gestorIO.outln("4. Eliminar un libro.");
            gestorIO.outln("5. Añadir autoria.");
            gestorIO.outln("6. Buscar autoria.");
            gestorIO.outln("7. Mostrar lista de Autorias.");
            gestorIO.outln("8. Salir.");
            switch (gestorIO.inInt()){
                case 1:
                    biblioteca.mostrar();
                    break;
                case 2:
                    biblioteca.aniadirLibro(new Libro());
                    break;
                case 3:
                    gestorIO.outln("¿Cuál es el ISBN (numero de 10 a 13 cifras) del libro que desea buscar?");
                    biblioteca.buscarLibro(gestorIO.inLong());
                    break;
                case 4:
                    gestorIO.outln("¿Cuál es el ISBN (numero de 10 a 13 cifras) del libro que desea eliminar?");
                    biblioteca.eliminarLibro(gestorIO.inLong());
                    break;
                case 5:
                    biblioteca.aniadirAutoria(new Autoria());
                    break;
                case 6:
                    gestorIO.outln("¿Cuál es el ID de la autoria que desea buscar??");
                    biblioteca.buscarAutoria(gestorIO.inInt());
                    break;
                case 7:
                    biblioteca.mostrarAutorias();
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    gestorIO.outln("Selecciona un número del 1 al 5, dependiendo de la opción que desee.");
            }
        } while(!salir);
    }
}
