// 1. Classe abstraite Animal
abstract class Animal {
    private String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public abstract void faireDuBruit();
}

// 2. Classe Mammifere
class Mammifere extends Animal {
    public Mammifere(String nom) {
        super(nom);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " grogne.");
    }
}

// 3. Classe Oiseau
class Oiseau extends Animal {
    public Oiseau(String nom) {
        super(nom);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " chante.");
    }

    // ✅ Méthode ajoutée
    public void voler() {
        System.out.println("L'oiseau vole.");
    }
}

// 4. Classe principale
public class Zoo {
    public static void main(String[] args) {

        Animal tigre = new Mammifere("Tigre");
        tigre.faireDuBruit();

        Animal perroquet = new Oiseau("Perroquet");
        perroquet.faireDuBruit();

        // ✅ Cast pour accéder à voler()
        Oiseau o = (Oiseau) perroquet;
        o.voler();
    }
}
