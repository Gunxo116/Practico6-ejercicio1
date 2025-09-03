
package Controllers;

import java.util.ArrayList;


public class DirectorioProductos {
    
    private ArrayList<Productos> productos = new ArrayList<>();

    public DirectorioProductos() {
    }
    
    
    public void agregarProducto(Productos producto) {
        this.productos.add(producto);
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }
    
    /*
     * /\_/\ ___
     * = o_o =_______ \ \
     * __^ __( \.__) )
     * (@)<_____>__(_____)____/
     */
   
    
}
