public abstract class Utilisateur {
    protected String identifiant;

    public Utilisateur(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public abstract String getInfoAffichage();
}