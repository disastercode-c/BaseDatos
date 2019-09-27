package modelos;

import java.util.ArrayList;
import modelo.BaseDeDatos;
import modelo.TryBaseDatos;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 56964
 */
public class TestListar {
    
    @Test
    public void testListar(){
        System.out.println("Listar");
        TryBaseDatos instance = new TryBaseDatos();
        ArrayList<BaseDeDatos> esperado = new ArrayList<BaseDeDatos>();
        ArrayList<BaseDeDatos> obtenido = instance.listar();
        Assert.assertEquals(esperado, obtenido);
        
    }
}
