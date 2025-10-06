import org.junit.Test;

public class PublicationTest {
    @Test
    public void testPublicationAvecMessages() {

        UtilisateurInscrit user1 = new UtilisateurInscrit("user1", "Jean", "Dupont", "jean@email.com");

        UtilisateurAnonyme anon1 = new UtilisateurAnonyme("Bonjour");
        UtilisateurAnonyme anon2 = new UtilisateurAnonyme("Comment ça va ?");


        Publication pub = new Publication("pub1", user1);

        pub.ajouterMessage(new Message("Message 1", user1, false));
        pub.ajouterMessage(new Message("Message 2", anon1, false));
        pub.ajouterMessage(new Message("Message 3", anon2, true));

        pub.afficherAuteurs();

    }
}