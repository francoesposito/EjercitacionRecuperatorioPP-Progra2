/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.esposito.franco;

/**
 *
 * @author Franco
 */
public class Manual extends Libro {
    
       private Tipo tipo;
       
       public Manual(String titulo, double precio, Autor autor, Tipo tipo){
           super(titulo, precio, autor);
           this.tipo = tipo;
       }
       
       public Manual(String titulo, double precio, String nombre, String apellido, Tipo tipo){
           this(titulo, precio, new Autor(nombre, apellido), tipo);
       }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Manual{");
        sb.append(super.toString());
        sb.append("tipo=").append(tipo).append("\n");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)){
            final Manual other = (Manual) obj;
            return this.tipo == other.tipo;
        }
        return false;
    }
    
    
       
       
    
}
