/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyecto.taller4desarrollo;

import proyecto.taller4desarrollo.folder1.FactoryReportePDF;
import proyecto.taller4desarrollo.folder1.FactoryReporte;
import proyecto.taller4desarrollo.folder1.Reporte;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) { 

        FactoryReporte factoryPDF = new FactoryReportePDF(); 

        Reporte reportePDF = factoryPDF.crearReporte(); 
        reportePDF.generar(); 
    } 
}
