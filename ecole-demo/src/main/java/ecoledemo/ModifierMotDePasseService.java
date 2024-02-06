package ecoledemo;

public class ModifierMotDePasseService {
    public String modifierMotDePasse(Administrateur admin, String nouveauMotDePasse) {
        admin.setMotDePasse(nouveauMotDePasse);
        return "Mot de passe modifié avec succès";
    }
}
