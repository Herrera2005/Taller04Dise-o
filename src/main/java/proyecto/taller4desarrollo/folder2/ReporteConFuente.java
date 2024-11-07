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
public class ReporteConFuente extends ReporteDecorador { 

    public ReporteConFuente(Reporte reporte) { 

        super(reporte); 

    } 

  

    @Override
    public void generar() { 

        super.generar(); 

        System.out.println("Aplicando estilo de fuente..."); 

    } 

} 