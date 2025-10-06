public class UtilisateurInscrit extends Utilisateur {
    private String prenom;
    private String nom;
    private String email;

    public UtilisateurInscrit(String identifiant, String nom, String prenom, String email) {
        super(identifiant);
        this.prenom = nom;
        this.nom = prenom;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UtilisateurInscrit{");
        sb.append("prenom='").append(prenom).append('\'');
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getInfoAffichage() {
        return String.format("ID: %s, Nom: %s, Prénom: %s, Email: %s",
                identifiant, nom, prenom, email);
    }
}