package zooAnimales;
import gestion.Zona;
public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;
    
    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = null;
        totalAnimales++;
    }
    public Animal(){
        this(null,0,null,null);
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int age){
        this.edad=age;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public void setHabitat(String habitat){
        this.habitat=habitat;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public Zona getZona(){
        return this.zona;
    }
    public void setZona(Zona zona){
        this.zona=zona;
    }
    public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales=totalAnimales;
	}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
    public String movimiento(){
        return "desplazarse";
    }
    public static String totalPorTipo() {
		
		return "Mamiferos: "+Mamifero.getListado().size()+"\n"+ 
		"Aves: "+Ave.getListado().size()+"\n"+ 
		"Reptiles: "+Reptil.getListado().size()+"\n" + 
		"Peces: " +Pez.getListado().size()+"\n"+ 
		"Anfibios: "+Anfibio.getListado().size();
		
		
	}
	
	public String toString() {
		if (getZona()!=null) {
			return "Mi nombre es "+ getNombre()+", tengo una edad de " +getEdad()+ ", habito en "+getHabitat()+" y mi genero es "+getGenero()+", la zona en la que me ubico es "+getZona().getNombre()+", en el "+getZona().getZoo().getNombre();
		}
		else {
		    return "Mi nombre es "+ getNombre()+", tengo una edad de " +getEdad()+ ", habito en "+getHabitat()+" y mi genero es "+getGenero();
		}
	}
}