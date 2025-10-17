package edu.ucaldas.behavior;

public class SupervisorHandler extends Handler {

    @Override
    public String handleRequest(String request) {
        if (request == null) return passToNext(request);

        String lower = request.toLowerCase();
        if (lower.contains("intermedia") || lower.contains("intermediate")) {
            return "SupervisorHandler: solicitud intermedia atendida -> " + request;
        }

        return passToNext(request);
    }

    private String passToNext(String request) {
        if (next != null) {
            return next.handleRequest(request);
        } else {
            return "SupervisorHandler: solicitud no manejada -> " + request;
        }
    }
}
