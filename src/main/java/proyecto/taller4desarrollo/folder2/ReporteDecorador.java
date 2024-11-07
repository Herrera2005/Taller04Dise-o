/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.taller4desarrollo.folder2;

import proyecto.taller4desarrollo.folder1.Reporte;

/**
 *
 * @author usuario
 */
public abstract class ReporteDecorador implements Reporte { 

    protected Reporte reporte; 

  

    public ReporteDecorador(Reporte reporte) { 

        this.reporte = reporte; 

    } 

  

    @Override
    public void generar() { 

        reporte.generar(); 

    } 

} 
