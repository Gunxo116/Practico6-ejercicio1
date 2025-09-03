
package Controllers;

import java.util.ArrayList;

public class DirectorioCategoria {
    
    private static ArrayList<Categoria> categoria;
    
    public DirectorioCategoria() {
        
        categoria=new ArrayList<Categoria>();
        
        categoria.add(new Categoria("Ropa"));
        categoria.add(new Categoria("Perfumeria"));
        categoria.add(new Categoria("Electrónica"));
        categoria.add(new Categoria("Alimentos"));
        
    }
    
    public static void agregarCategoria(Categoria nuevaCategoria) {
        categoria.add(nuevaCategoria);
    }

    public ArrayList<Categoria> getCategoria() {
        return categoria;
    }
    
}
