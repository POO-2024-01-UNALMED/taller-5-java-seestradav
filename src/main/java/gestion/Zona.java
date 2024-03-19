package gestion;
import zooAnimales.*;
import java.util.ArrayList;
public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal>animales= new ArrayList<>();
    public Zona(String name){
        this(name,null);
    }
    public Zona(String name,Zoologico zoo){
        this.nombre=name;
        this.zoo=zoo;
    }
    public Zona(Zoologico zoo){
        this(null,zoo);
    }
    public Zona(){
        this(null,null);
    }
    public String getNombre(){
        return this.nombre;
    }
    public Zoologico getZoo(){
        return zoo;
    }
    public void agregarAnimales(Animal nuevosAnimal) {
        animales.add(nuevosAnimal);
    }
    public int cantidadAnimales(){
    return animales.size();
    }
}
