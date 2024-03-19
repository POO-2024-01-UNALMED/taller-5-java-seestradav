package zooAnimales;

import gestion.Zona;

public class Pez extends Animal{
    private Pez[] listado;
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    public int cantidadPeces(){
        return salmones+bacalaos;
    }
    public String movimiento(){
        return "nadar";
    }
    public void crearSalmon(String nombre,int edad,String genero){
        this.colorEscamas="rojo";
        this.cantidadAletas=6;
        String valor=getHabitat();
        setHabitat("oceano");
        salmones++;
    }
    public void crearBacalao(String nombre,int edad,String genero){
        this.colorEscamas="gris";
        this.cantidadAletas=6;
        String valor=getHabitat();
        setHabitat("oceano");
        bacalaos++;
    }
}
