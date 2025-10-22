/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.esposito.franco;

import java.util.ArrayList;

/**
 *
 * @author Franco
 */
public class Biblioteca {

    private int capacidad;
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.capacidad = 3;
        this.libros = new ArrayList<>();
    }

    public Biblioteca(int capacidad) {
        this();
        this.capacidad = capacidad;
    }

    public boolean sonIguales(Libro libro) {
        for (Libro l : libros) {
            if (libro.equals(l)) {
                return true;
            }
        }
        return false;
    }
    
    public void agregar(Libro libro){
        
        if (capacidad > this.libros.size() && !this.sonIguales(libro)){
            this.libros.add(libro);
        } else {
            System.out.println("No se pudo agregar el libro.");
        }
            
        
    }
    
    
    private double getPrecio(PrecioLibro precioLibro){
        
        double total = 0;
        
        for (Libro libro : libros) {
            if (precioLibro == PrecioLibro.MANUALES && libro instanceof Manual manual){
                total += libro.getPrecio();
            } else if (precioLibro == PrecioLibro.NOVELAS && libro instanceof Novela novela){
                total += libro.getPrecio();
            } else if (precioLibro == PrecioLibro.TODOS){
                if (libro instanceof Manual){
                    total += libro.getPrecio();
                }
                
                if (libro instanceof Novela){
                    total += libro.getPrecio();
                }
                
            }
        }
        
        return total;
        
    }
    
    
    public double getPrecioManuales(){
        return getPrecio(PrecioLibro.MANUALES);
    }
    
    public double getPrecioDeNovelas(){
        return getPrecio(PrecioLibro.NOVELAS);
    }
    
    public double getPrecioTotal(){
        return getPrecio(PrecioLibro.TODOS);
    }
    
    
    public static String mostrar(Biblioteca biblioteca){
        StringBuilder sb = new StringBuilder("------ BIBLIOTECA ------\n");
        sb.append("Capacidad: ").append(biblioteca.capacidad).append("\n");
        sb.append("Precio Manuales: ").append(biblioteca.getPrecioManuales()).append("\n");
        sb.append("Precio Novelas: ").append(biblioteca.getPrecioDeNovelas()).append("\n");
        sb.append("Precio Total: ").append(biblioteca.getPrecioTotal()).append("\n");
        sb.append("Libros: ").append("\n");
        
        for (Libro libro : biblioteca.libros) {
            sb.append("- ").append(libro.toString()).append("\n");
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return mostrar(this);
    }
    
    
    
    
    
    

}
