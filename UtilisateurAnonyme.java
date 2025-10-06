public class UtilisateurAnonyme extends Utilisateur {
    public UtilisateurAnonyme(String identifiant) {
        super(identifiant);
    }

    @Override
    public String getInfoAffichage() {
        return "Anonyme: " + identifiant;
    }
}