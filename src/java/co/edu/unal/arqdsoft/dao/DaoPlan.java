/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unal.arqdsoft.dao;

import co.edu.unal.arqdsoft.entidad.Plan;
import co.edu.unal.arqdsoft.entidad.Producto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author dfoxpro
 */
public class DaoPlan {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("co-edu-unal-arqdsoftPU");

    /**
     *
     * @return
     */
    public static ArrayList<Plan> getPlanes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param p
     * @return 
     */
    public static boolean CrearPlan(Plan p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param idPlan
     * @return
     */
    public static Plan getPlane(int idPlan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     */
    public DaoPlan() {
    }
    
    /**
     *
     * @param plan
     */
    public boolean crear(Plan plan) {
        EntityManager em = emf.createEntityManager();
        boolean exito=false;
        try {
            em.getTransaction().begin();
            em.persist(plan);
            em.getTransaction().commit();
            exito=true;
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
            return exito;
        }
    }

    /**
     *
     * @param producto
     * @return
     */
    public boolean eliminarPlan(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean modificarPlan(int id, Plan p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
