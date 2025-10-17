package edu.ucaldas.behavior;

public class SupportHandler {

    public static Handler createChain() {
        // Crear instancias
        BasicSupportHandler basic = new BasicSupportHandler();
        SupervisorHandler supervisor = new SupervisorHandler();
        ManagerHandler manager = new ManagerHandler();

        // Enlazar: Basic -> Supervisor -> Manager
        basic.setNext(supervisor);
        supervisor.setNext(manager);

        // Retornar el primero (inicio de la cadena)
        return basic;
    }
}
