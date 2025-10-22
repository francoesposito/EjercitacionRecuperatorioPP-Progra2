/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.esposito.franco;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Franco
 */
public abstract class Libro {

    protected Autor autor;
    protected int cantidadDePaginas;
    protected String titulo;
    protected double precio;
    protected static Random generadorDePaginas;

    static {

        Libro.generadorDePaginas = new Random();

    }

    public Libro(String titulo, double precio, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
    }

    public Libro(String titulo, double precio, String nombre, String apellido) {
        this(titulo, precio, new Autor(nombre, apellido));
    }

    public int getCantidadPaginas() {

        if (this.cantidadDePaginas == 0) {
            this.cantidadDePaginas = generadorDePaginas.nextInt(30, 913);
        }

        return this.cantidadDePaginas;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    
    private static String mostrar(Libro libro){
        StringBuilder sb = new StringBuilder("------- LIBRO " + libro.titulo + " -------\n");
        sb.append("Autor: ").append(libro.autor.getNombreYApellido()).append("\n");
        sb.append("Precio: ").append(libro.getPrecio()).append("\n");
        sb.append("Cantidad de paginas: ").append(libro.getCantidadPaginas()).append("\n");
        
        return sb.toString();
        
        
        
    }

    
    public static boolean sonIguales(Libro l1, Libro l2){
        return l1.equals(l2);
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }

    @Override
    public String toString() {
        return mostrar(this);
    }

    
    
}
