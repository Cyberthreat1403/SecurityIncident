public class SecurityIncident {
    //Atributos
    private int id;
    private String description;
    private String severity;
    private String reportedBy;
    private boolean confidentiality;
    private boolean integrity;
    private boolean availability;
    private String documentType;

    //constructor
    public SecurityIncident(
            int id,
            String description,
            String severity,
            String reportedBy,
            boolean confidentiality,
            boolean integrity,
            boolean availability,
            String documentType
    ){
        this.id = id;
        this.description = description;
        this.severity = severity;
        this.reportedBy = reportedBy;
        this.confidentiality = confidentiality;
        this.integrity = integrity;
        this.availability = availability;
        this.documentType = documentType;
    }
    //Metodo para mostrar la Informacion
    public void displayIncident() {
        System.out.println("=====BRECHA DE SEGURIDAD DE LA INFORMACION====");
        System.out.println("ID: " + id);
        System.out.println("Descripcion: " + description);
        System.out.println("Severidad: " + severity);
        System.out.println("Reportado por: " + reportedBy);
        System.out.println("Documento afectado: " + documentType);
        System.out.println("Compromiso de principios: ");
        System.out.println("-Confidencialidad comprometida: " + (confidentiality ? "Si" : "No"));
        System.out.println("-Integridad comprometida: " + (integrity ? "Si" : "No"));
        System.out.println("-Disponibilidad comprometida: " + (availability ? "Si" : "No"));
    }
}
