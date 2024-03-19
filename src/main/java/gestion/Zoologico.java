package gestion;
import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas=new ArrayList<>();
    public Zoologico(String nombre, String ubi) {
            this.nombre=nombre;
            this.ubicacion=ubi;
            
        }
    public Zoologico() {
		this(null,null);
		
	}
	
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String name){
        this.nombre=name;
    }  
    public String getUbicacion(){
        return this.ubicacion;
    }
    public void setUbicacion(String ubi){
        this.ubicacion=ubi;
    }
    public void setZonas(ArrayList<Zona> zonas) {
		this.zonas=zonas;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}
    public void agregarZonas(Zona nuevaZona){
        this.zonas.add(nuevaZona);
    }
    public int cantidadTotalAnimales(){
        int totalAnimales=0;
        for (Zona zonas : zonas) {
			totalAnimales= totalAnimales+zonas.cantidadAnimales();		
		}
		return totalAnimales;
        } 
    }

