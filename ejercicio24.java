/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios2;

/**
 *
 * @author migue
 */
public class ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String estacion="otoño";
        
        switch(estacion){
            case"verano":
                System.out.println("estamos en "+estacion);
                break;
            case"otoño":
                System.out.println("estamos en "+estacion);
                break;
            case"invierno":
                System.out.println("estamos en "+ estacion);
                break;
            case"primavera":
                System.out.println("estamos en "+ estacion);
                break;
            default:
                System.out.println("la estacion no es valida ");
                break;
        }
    }
    
}
