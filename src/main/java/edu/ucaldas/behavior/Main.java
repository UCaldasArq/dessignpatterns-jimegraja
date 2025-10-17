package edu.ucaldas.behavior;

public class Main {
    public static void main(String[] args) {
        Handler chain = SupportHandler.createChain();

        String[] solicitudes = {
                "Necesito ayuda básica con mi cuenta",
                "Tengo una solicitud intermedia sobre el sistema",
                "Requiero soporte avanzado para configuración del servidor",
                "Tipo de solicitud desconocido"
        };

        for (String req : solicitudes) {
            System.out.println(chain.handleRequest(req));
        }
    }
}
