public class ExternalIncident extends SecurityIncident {
    private String attackerOrigin;

    public ExternalIncident(
            int id,
            String description,
            String severity,
            String reportedBy,
            boolean confidentiality,
            boolean integrity,
            boolean availability,
            String documentType,
            String attackerOrigin
    ) {
        super(id, description, severity, reportedBy, confidentiality, integrity, availability, documentType);
        this.attackerOrigin = attackerOrigin;
    }

    @Override
    public void displayIncident() {
        super.displayIncident();
        System.out.println("Origen del atacante: " + attackerOrigin);
    }
}
