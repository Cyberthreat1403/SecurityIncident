public class Main {
    public static void main(String[] args) {
        InternalIncident internal = new InternalIncident(
                1,
                "Acceso indebido a base de datos interna",
                "Alta",
                "Equipo TI",
                true,
                true,
                false,
                "Restringido",
                "Recursos Humanos"
        );

        ExternalIncident external = new ExternalIncident(
                2,
                "Ataque de bruteforce desde IP extranjera",
                "Crítica",
                "SOC",
                true,
                true,
                true,
                "Confidencial",
                "IP: 203.0.113.42"
        );

        System.out.println("=== INCIDENTE INTERNO ===");
        internal.displayIncident();

        System.out.println("\n=== INCIDENTE EXTERNO ===");
        external.displayIncident();
    }
}
