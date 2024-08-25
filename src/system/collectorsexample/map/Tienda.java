package system.collectorsexample.map;

import system.collectorsexample.map.Producto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tienda {
    private Map<String, Producto> productos = new HashMap<>();

    public void agregarProducto(String codigo, Producto producto) {
        productos.put(codigo, producto);
        System.out.println("Producto con codigo: " + codigo + ", agregado correctamente!!");
    }

    public Producto obtenerProducto(String codigo) {
        System.out.println("\n *********************** OBTENER PRODUCTO ****************************");
        System.out.println("Se encontró el siguiente resultado: ");
        return productos.get(codigo);
    }

    public void eliminarProducto(String codigo) {
        System.out.println("\n *********************** ELIMINAR PRODUCTO ****************************");
        productos.remove(codigo);
        System.out.println("Se eliminó el producto con código: " + codigo + " correctamente!!");
    }

    public void mostrarProductos() {
        System.out.println("\n *********************** MOSTRAR TODOS PRODUCTOS ****************************");
        System.out.println("Listado de productos");
        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            System.out.println("Código: " + entry.getKey() + ", " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        System.out.println("*********************** AGREGAR PRODUCTOS ****************************");
        tienda.agregarProducto("001", new Producto("Manzana", 0.50));
        tienda.agregarProducto("002", new Producto("Naranja", 0.75));
        tienda.agregarProducto("003", new Producto("Plátano", 0.30));

        System.out.println("Producto con código 002: " + tienda.obtenerProducto("002"));

        tienda.eliminarProducto("001");

        tienda.mostrarProductos();
    }
}
