package gestion;
import zooAnimales.*;
public class Zona {
    private String nombre;
    private Zoologico zoo;
    private Animal[] animales;
    public Zona(String name,Zoologico zoo,Animal animales){
        this.nombre=name;
        this.animales = new Animal[]{animales};;
        this.zoo=zoo;
    }
    public Zona(String name,Animal animales){
        this.nombre=name;
        this.animales = new Animal[]{animales};
        this.animales=new Animal[0];
    }
    public Zona(String name,Zoologico zoo){
        this.nombre=name;
        this.zoo=zoo;
        this.animales=new Animal[0];
    }
    public Zona(String name){
        this.nombre=name;
        this.animales=new Animal[0];
    }
    public Zona(Animal animal){
        this.animales = new Animal[]{animal};
        this.animales=new Animal[0];
    }
    public Zona(){
        this.animales=new Animal[0];
    }
    public String getNombre(){
        return this.nombre;
    }
    public Zoologico getZoo(){
        return zoo;
    }
    public void agregarAnimales(Animal nuevosAnimal) {
        Animal[] nuevoArray = new Animal[this.animales.length + 1];
        for (int i = 0; i < this.animales.length; i++) {
            nuevoArray[i] = this.animales[i];
        }
        nuevoArray[this.animales.length] = nuevosAnimal;
        this.animales = nuevoArray;
    }
    public int cantidadAnimales(){
    return animales.length;
    }
}
