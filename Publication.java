import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Publication {
    private String identifiant;
    private Utilisateur createur;
    private List<Message> messages;

    public Publication(String identifiant, Utilisateur createur) {
        this.identifiant = identifiant;
        this.createur = createur;
        this.messages = new ArrayList<>();
    }

    private static void accept(Utilisateur auteur) {
        System.out.println(auteur.getInfoAffichage());
    }

    public void ajouterMessage(Message message) {
        messages.add(message);
    }

    public void afficherAuteurs() {
        Set<Utilisateur> auteurs = messages.stream()
                .map(Message::getAuteur)
                .collect(Collectors.toSet());

        System.out.println("Auteurs des messages:");
        auteurs.forEach(Publication::accept);
    }
    public String getIdentifiant() {
        return identifiant;
    }
    public Utilisateur getCreateur() {
        return createur;
    }
    public List<Message> getMessages() {
        return messages;
    }
}