package modelo;

import java.util.ArrayList;

public class TryBaseDatos {

    private ArrayList<BaseDeDatos> datos;

    public TryBaseDatos() {
        this.datos = new ArrayList<BaseDeDatos>();
    }

    public ArrayList<BaseDeDatos> listar() {
        return this.datos;
    }

    public boolean agregar(BaseDeDatos dato) {
        return this.datos.add(dato);
    }

    public boolean Modificar(BaseDeDatos dato) {
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(dato.getId())) {

                return true;
            }
        }
        return false;
    }
    
    public boolean eliminar(String cod){
        for(int i=0; i<datos.size();i++){
            if(datos.get(i).getId().equals(cod)){
                datos.remove(i);
                return true;
            }
        }
        return false;
    }
}
