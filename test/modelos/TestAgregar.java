package modelos;

import junit.framework.Assert;
import modelo.BaseDeDatos;
import modelo.TryBaseDatos;
import org.junit.Test;

public class TestAgregar {
    
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        BaseDeDatos dato = new BaseDeDatos("01", this);
        TryBaseDatos instance = new TryBaseDatos();
        boolean esperado=true;
        boolean obtenido=instance.agregar(dato);
        Assert.assertEquals(esperado, obtenido);
        
    }
    
}
