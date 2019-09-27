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


public class TestModificar {
    
    @Test
    public void testModificar(){
        System.out.println("Modificar");
        BaseDeDatos dato = new BaseDeDatos("01", this);
        TryBaseDatos instance = new TryBaseDatos();
        instance.agregar(dato);
        boolean esperado = true;
        dato = new BaseDeDatos("01", this );
        boolean obtenido=instance.Modificar(dato);
        Assert.assertEquals(esperado, obtenido);
    }
}
