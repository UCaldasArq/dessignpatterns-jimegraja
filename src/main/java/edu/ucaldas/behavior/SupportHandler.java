package edu.ucaldas.behavior;

public class SupportHandler {
    public static Handler createChain() {
        Handler basic = new BasicSupportHandler();
        Handler supervisor = new SupervisorHandler();
        Handler manager = new ManagerHandler();

        basic.setNext(supervisor);
        supervisor.setNext(manager);

        return basic; // inicio de la cadena
    }
}
