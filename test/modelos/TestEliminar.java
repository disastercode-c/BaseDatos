/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import junit.framework.Assert;
import modelo.BaseDeDatos;
import modelo.TryBaseDatos;
import org.junit.Test;

/**
 *
 * @author 56964
 */
public class TestEliminar {
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String cod="01";
        BaseDeDatos dato = new BaseDeDatos("01", this);
        TryBaseDatos instance=new TryBaseDatos();
        instance.agregar(dato);
        boolean esperado = true;
        boolean obtenido = instance.eliminar(cod);
        Assert.assertEquals(esperado, obtenido);
    }
}
