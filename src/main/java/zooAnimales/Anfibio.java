package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado=new ArrayList<>();
	public static int ranas=0;
	public static int salamandras=0;
	private String colorPiel;
	private boolean venenoso;
    
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		Anfibio.listado.add(this);
	}
	public Anfibio() {
		this(null,0,null,null,null,false);
	}
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado=listado;
	}
	
    
    public String getColorPiel(){
        return this.colorPiel;
    }
    public void setColorPiel(String tf){
        this.colorPiel=tf;
    }
    public boolean isVenenoso(){
        return this.venenoso;
    }
    public void setVenenoso(boolean venenoso){
        this.venenoso=venenoso;
    }
    public int cantidadAnfibios(){
        return ranas+salamandras;
    }
    public static Anfibio crearRana(String nombre, int edad, String genero) {
        Anfibio Anfibio=new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas++;
		return Anfibio;

    }
    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        Anfibio Anfibio=new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		salamandras++;
		return Anfibio;

    }
    public String movimiento(){
        return "saltar";
    }
}
