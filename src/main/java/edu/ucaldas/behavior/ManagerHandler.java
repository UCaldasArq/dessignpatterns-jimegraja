package edu.ucaldas.behavior;

public class ManagerHandler extends Handler {
    @Override
    public String handleRequest(String request) {
        if (request.equalsIgnoreCase("avanzada")) {
            return "Atendido por Gerente";
        } else {
            return "No se puede atender la solicitud.";
        }
    }
}

