package edu.ucaldas.behavior;

public class Main {
    public static void main(String[] args) {
        // 1. Crear la cadena de responsabilidad
        Handler chain = SupportHandler.createChain();

        // 2. Simular solicitudes con distintos niveles
        String[] solicitudes = {
                "básica",
                "intermedia",
                "avanzada",
                "desconocida"
        };

        // 3. Enviar cada solicitud y mostrar la respuesta
        for (String solicitud : solicitudes) {
            String respuesta = chain.handleRequest(solicitud);
            System.out.println("Solicitud: " + solicitud + " -> Respuesta: " + respuesta);
        }
    }
}

