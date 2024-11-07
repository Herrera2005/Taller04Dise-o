/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.taller4desarrollo.folder4;

/**
 *
 * @author usuario
 */
public class NotificacionTelegram implements Notificacion { 

    @Override
    public void enviar(String mensaje) { 

        System.out.println("Enviando mensaje por Telegram: " + mensaje); 

    } 

} 