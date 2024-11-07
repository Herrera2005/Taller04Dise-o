/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.taller4desarrollo.folder3;

/**
 *
 * @author usuario
 */
public class GeneradorReportesSingleton { 

    private static GeneradorReportesSingleton instancia; 

  

    private GeneradorReportesSingleton() { 

        // Constructor privado 

    } 

  

    public static  GeneradorReportesSingleton obtenerInstancia() { 

        if (instancia == null) { 

            instancia = new GeneradorReportesSingleton(); 

        } 

        return instancia; 

    } 

  

    public void generarReporte(String tipo) { 

        System.out.println("Generando reporte: " + tipo); 

    } 

} 