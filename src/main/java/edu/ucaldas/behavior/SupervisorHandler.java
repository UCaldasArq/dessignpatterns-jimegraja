package edu.ucaldas.behavior;

public class SupervisorHandler extends Handler {
    @Override
    public String handleRequest(String request) {
        if (request.equalsIgnoreCase("intermedia")) {
            return "Atendido por Supervisor";
        } else if (next != null) {
            return next.handleRequest(request);
        }
        return "No se puede atender la solicitud.";
    }
}

