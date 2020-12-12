import abb.ArbolBinarioBusqueda;

public class Main {

    public static void main(String[] args) {

        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();

        System.out.println("MOSTRANDO LOS ELEMENTOS EN ORDEN");

        abb.insertar(3);
        abb.insertar(2);
        abb.insertar(4);
        abb.insertar(1);
        abb.insertar(3);
        abb.insertar(5);
        abb.insertar(7);
        abb.insertar(6);



        abb.mostrarInOrden();


    }
}
