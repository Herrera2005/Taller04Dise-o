/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.taller4desarrollo.folder1;

/**
 *
 * @author usuario
 */
public class FactoryReportePDF implements FactoryReporte { 

    @Override
    public Reporte crearReporte() { 

        return new ReportePDF(); 

    } 

} 
