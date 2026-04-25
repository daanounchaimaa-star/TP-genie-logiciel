// 1. Classe de base
class CompteBancaire {
    protected String numeroCompte;
    protected double solde;

    public CompteBancaire(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " effectué.");
        }
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectué.");
        } else {
            System.out.println("Solde insuffisant !");
        }
    }

    public void afficherSolde() {
        System.out.println("Compte " + numeroCompte + " : Solde = " + solde);
    }
}

// 2. Classe CompteEpargne
class CompteEpargne extends CompteBancaire {

    public CompteEpargne(String numeroCompte, double solde) {
        super(numeroCompte, solde);
    }

    public void calculerInterets(double taux) {
        double interets = solde * taux;
        solde += interets;
        System.out.println("Intérêts ajoutés : " + interets);
    }
}

// 3. Classe CompteCourant
class CompteCourant extends CompteBancaire {

    public CompteCourant(String numeroCompte, double solde) {
        super(numeroCompte, solde);
    }
}

// 4. Classe principale
public class Banque {
    public static void main(String[] args) {

        CompteCourant courant = new CompteCourant("C001", 1000);
        CompteEpargne epargne = new CompteEpargne("E001", 2000);

        // Test compte courant
        courant.deposer(500);
        courant.retirer(300);
        courant.afficherSolde();

        System.out.println("------------------");

        // Test compte épargne
        epargne.deposer(1000);
        epargne.calculerInterets(0.05); // 5%
        epargne.afficherSolde();
    }
}