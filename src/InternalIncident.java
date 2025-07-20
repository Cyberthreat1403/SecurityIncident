public class InternalIncident extends SecurityIncident {
    private String departmentInvolved;

    public InternalIncident(
            int id,
            String description,
            String severity,
            String reportedBy,
            boolean confidentiality,
            boolean integrity,
            boolean availability,
            String documentType,
            String departmentInvolved
    ) {
        super(id, description, severity, reportedBy, confidentiality, integrity, availability, documentType);
        this.departmentInvolved = departmentInvolved;
    }

    @Override
    public void displayIncident() {
        super.displayIncident();
        System.out.println("Departamento involucrado: " + departmentInvolved);
    }
}
