package zooAnimales;

import gestion.Zona;

public class Ave extends Animal {
    private Ave[] listado;
    public int halcones;
    public int aguilas;
    private String colorPlumas;
    public int cantidadAves(){
        return halcones+aguilas;
    }
    public String movimiento(){
    return "volar";
    }
    public void crearHalcon(String nombre,int edad,String genero){
        this.colorPlumas="cafe glorioso";
        String valor=getHabitat();
        setHabitat("montanas");
        halcones++;
    }
    public void crearAguila(String nombre,int edad,String genero){
        this.colorPlumas="blanco y amarillo";
        String valor=getHabitat();
        setHabitat("montanas");
        aguilas++;
    }
}
