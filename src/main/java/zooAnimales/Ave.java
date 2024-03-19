package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado=new ArrayList<>();
	public static int halcones=0;
	public static int aguilas=0;
	private String colorPlumas;
    
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas=colorPlumas;
		Ave.listado.add(this);
	}
	public Ave() {
		this(null,0,null,null,null);
	}
	public static ArrayList<Ave> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado=listado;
	}
	
    
    public String getColorPlumas(){
        return this.colorPlumas;
    }
    public void setColorPlumas(String colorplumas){
        this.colorPlumas=colorplumas;
    }
    public int cantidadAves(){
        return halcones+aguilas;
    }
    public static Ave crearHalcon(String nombre, int edad, String genero) {
        Ave Ave=new Ave(nombre,edad,"montanas",genero,null);
		halcones++;
		return Ave;

    }
    public static Ave crearAguila(String nombre, int edad, String genero) {
        Ave Ave=new Ave(nombre,edad,"montanas",genero,null);
		aguilas++;
		return Ave;

    }
    public String movimiento(){
        return "volar";
    }
}
