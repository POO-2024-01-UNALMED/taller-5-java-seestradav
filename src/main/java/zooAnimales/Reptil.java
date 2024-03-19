package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal {
   private Reptil[] listado;
   public int iguanas;
   public int serpientes;
   private String colorEscamas;
   private int largoCola;
   public int CantidadReptiles(){
    return iguanas+serpientes;
   } 
   public String movimiento(){
    return "reptar";
    
   }
   public void crearIguana(String nombre,int edad,String genero){
        this.colorEscamas="verde";
        this.largoCola=3;
        String valor=getHabitat();
        setHabitat("humedal");
        iguanas++;
    }
    public void crearSerpiente(String nombre,int edad,String genero){
        this.colorEscamas="blanco";
        this.largoCola=1;
        String valor=getHabitat();
        setHabitat("jungla");
        serpientes++;
    }
}
