package com.biblioteca.app;

import com.biblioteca.modelo.Libro;
import com.biblioteca.modelo.LibroTexto;
import com.biblioteca.modelo.LibroTextoUNIAC;
import com.biblioteca.modelo.Novela;
import com.biblioteca.modelo.TipoNovela;

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 3, 0);
        LibroTexto libroTexto = new LibroTexto("Cálculo I", "James Stewart", 5, 0, "Matemáticas I");
        LibroTextoUNIAC libroUniac = new LibroTextoUNIAC("Ingeniería de Software", "Ian Sommerville",
                4, 0, "Ingeniería de Software", "Facultad de Ingeniería");
        Novela novela = new Novela("El nombre del viento", "Patrick Rothfuss", 2, 0, TipoNovela.AVENTURAS);

        System.out.println(libro);
        System.out.println(libroTexto);
        System.out.println(libroUniac);
        System.out.println(novela);

        System.out.println(libro.prestamo());
        System.out.println(libroTexto.prestamo());
        System.out.println(novela.devolucion());
        System.out.println(novela.prestamo());
        System.out.println(novela.prestamo());
        System.out.println(novela.prestamo());

        System.out.println(libro);
        System.out.println(libroTexto);
        System.out.println(novela);
    }
}
