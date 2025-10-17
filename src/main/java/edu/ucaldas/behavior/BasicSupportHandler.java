package edu.ucaldas.behavior;

public class BasicSupportHandler extends Handler {

    @Override
    public String handleRequest(String request) {
        if (request == null) return passToNext(request);

        String lower = request.toLowerCase();
        if (lower.contains("básica") || lower.contains("basic")) {
            return "BasicSupportHandler: solicitud básica atendida -> " + request;
        }

        return passToNext(request);
    }

    private String passToNext(String request) {
        if (next != null) {
            return next.handleRequest(request);
        } else {
            return "BasicSupportHandler: solicitud no manejada -> " + request;
        }
    }
}
