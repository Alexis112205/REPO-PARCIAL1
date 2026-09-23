package com.biblioteca.modelo;

public class Novela extends Libro {

    private TipoNovela tipo;

    public Novela() {
        super();
        this.tipo = null;
    }

    public Novela(String titulo, String autor, int numeroEjemplares,
                  int numeroEjemplaresPrestados, TipoNovela tipo) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        this.tipo = tipo;
    }

    public TipoNovela getTipo() {
        return tipo;
    }

    public void setTipo(TipoNovela tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Novela [" + super.toString() + ", tipo=" + tipo + "]";
    }
}
