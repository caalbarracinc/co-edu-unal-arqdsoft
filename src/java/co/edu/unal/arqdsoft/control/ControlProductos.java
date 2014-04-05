/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.arqdsoft.control;

import co.edu.unal.arqdsoft.dao.*;
import co.edu.unal.arqdsoft.entidad.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dmlr7
 */
public class ControlProductos {

    /**
     *
     * @param producto
     * @return informa si se pudo insertar o no el producto
     */
    public static boolean nuevoProducto(String[] producto) {
        Producto p = new Producto(producto[0], producto[1], Double.valueOf(producto[2]),null);
        DaoProducto dP=new DaoProducto();
        dP.crearProducto(p);
        return false;
    }

    /**
     *
     * @param idProducto id del producto a modificar
     * @param producto nueva definicion del producto
     * @return
     */
    public static boolean modificarProducto(int idProducto, String[] producto) {
        Producto p = new Producto(producto[0], producto[1], Double.valueOf(producto[2]),null);
        DaoProducto.modificarProducto(idProducto, p);
        return false;
    }

    /**
     *
     * @param plan1
     * @param plan2
     * @param plan3
     * @param productos lista de ids de los productos
     * @return
     */
    public static boolean nuevoPlan(String plan1,String plan2,String plan3, List<Producto> productos) {
        Plan p = new Plan( plan1, plan2, Double.valueOf(plan3), productos,null);
        DaoPlan.CrearPlan(p);
        return false;
    }

    /**
     *
     * @param id id del producto a modificar
     * @param plan id del plan a modificar
     * @return
     */
    public static boolean modificarPlan(int id, String[] plan) {

        return false;
    }

    /**
     *
     * @return retorna lista de productos
     */
    public static ArrayList<Producto> getProductos() {
        //TODO 
        return DaoProducto.getProductos();
    }

    /**
     *
     * @return
     */
    public static ArrayList<Plan> getPlanes() {
        //TODO
        return DaoPlan.getPlanes();
    }

    /**
     *
     * @param idProducto
     * @return retorna lista de productos
     */
    public static Producto getProducto(int idProducto) {
        //TODO 
        return DaoProducto.getProducto(idProducto);
    }

    /**
     *
     * @param idPlan
     * @return
     */
    public static Plan getPlane(int idPlan) {
        //TODO
        return DaoPlan.getPlane(idPlan);
    }
    
    /**
     *
     * @param id id del producto a modificar / nulo si se esta creando
     * @param get nombre del producto
     * @param get0 descripcion del producto
     * @param get1 valor del producto
     * @return retorna nulo si no se creo el producto o no se modifico
     */
    public static Producto setProducto(int id, String get, String get0, String get1) {

        Producto p2 = new Producto(get, get0, Double.valueOf(get1),null);
        try {
            String[] p = {get, get0, get1};
            if (id != -1) {
                ControlProductos.nuevoProducto(p);
            } else {
                ControlProductos.modificarProducto(id, p);
            }
        } catch (Exception e) {
            return null;
        }
        return p2;
    }
    public static boolean borrarProducto(int id){
        DaoProducto.eliminarProducto(ControlProductos.getProducto(id));
        return false;
    
    }
}
