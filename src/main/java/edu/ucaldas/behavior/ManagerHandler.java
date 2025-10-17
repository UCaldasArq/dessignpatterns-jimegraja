package edu.ucaldas.behavior;

public class ManagerHandler extends Handler {

    @Override
    public String handleRequest(String request) {
        if (request == null) return "ManagerHandler: solicitud no manejada -> null";

        String lower = request.toLowerCase();
        if (lower.contains("avanzada") || lower.contains("advanced")) {
            return "ManagerHandler: solicitud avanzada atendida -> " + request;
        }

        if (next != null) {
            return next.handleRequest(request);
        } else {
            return "ManagerHandler: solicitud no manejada -> " + request;
        }
    }
}
