/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.esposito.franco;

/**
 *
 * @author Franco
 */
public class Novela extends Libro {

    private Genero genero;

    public Novela(String titulo, double precio, Autor autor, Genero genero) {
        super(titulo, precio, autor);
        this.genero = genero;
    }

    public Novela(String titulo, double precio, String nombre, String apellido, Genero genero) {
        this(titulo, precio, new Autor(nombre, apellido), genero);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Novela{");
        sb.append(super.toString());
        sb.append("genero=").append(genero).append("\n");
        sb.append('}');
        return sb.toString();
    }

    
    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            final Novela other = (Novela) obj;
            return this.genero == other.genero;
        }
        return false;
    }
}
