/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unal.arqdsoft.dao;

import co.edu.unal.arqdsoft.entidad.Producto;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhh
 */
public class DaoProductoTest {
    
    public DaoProductoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of modificarProducto method, of class DaoProducto.
     */
   /****** @Test
    public void testModificarProducto() {
        System.out.println("modificarProducto");
        int idProducto = 0;
        Producto p = null;
        DaoProducto.modificarProducto(idProducto, p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProducto method, of class DaoProducto.
     */
    /*******@Test
    public void testGetProducto() {
        System.out.println("getProducto");
        int idProducto = 0;
        Producto expResult = null;
        Producto result = DaoProducto.getProducto(idProducto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearProducto method, of class DaoProducto.
     */
    @Test
    public void testCrearProducto() {
        System.out.println("crear");
        //int id = 132456;
        
        Producto productos = new Producto("datos", "ninguna", 12000);
        
        DaoProducto daoProducto = new DaoProducto();
        
        daoProducto.crearProducto(productos);
        //TODO
    }

    
    @Test
    public void testLeer() {
        System.out.println("leer");
        Producto prod = new Producto(1,"data", "nada", 12000);
        DaoProducto instance = new DaoProducto();
        Producto expResult = new Producto(1, "data", "nada", 12000);
        Producto result = instance.leerProducto(prod);
        System.out.println(expResult + " = "+ result);
        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProductos method, of class DaoProducto.
     */
   /**** @Test
    public void testGetProductos() {
        System.out.println("getProductos");
        ArrayList<Producto> expResult = null;
        ArrayList<Producto> result = DaoProducto.getProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
