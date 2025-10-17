package edu.ucaldas.structural;

public class Main {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier();
        Notifier sms = new SMSNotifier(email);

        System.out.println(email.send("Hola desde el correo."));
        System.out.println(sms.send("Hola desde el SMS."));
    }
}
