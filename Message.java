import java.time.LocalDateTime;

public class Message {
    private String texte;
    private LocalDateTime dateHeure;
    private boolean confidentiel;
    private Utilisateur auteur;

    public Message(String texte, Utilisateur auteur, boolean confidentiel) {
        this.texte = texte;
        this.auteur = auteur;
        this.confidentiel = confidentiel;
        this.dateHeure = LocalDateTime.now();
    }

    public Utilisateur getAuteur() {
        return auteur;
    }
}