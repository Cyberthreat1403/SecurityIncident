public class Main {
    public static void main(String[] args) {
        //Incidente ejemplo
        SecurityIncident Incident1 = new SecurityIncident(
                1001,
                "Filtracion de informacion via correo electonico",
                "Alta",
                "Christian de la Rosa",
                true,
                true,
                true,
                "Confidencial"
        );
        Incident1.displayIncident();

    }
}
