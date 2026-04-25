\# 📦 Rapport TP 01 – Programmation Orientée Objet (Java)



\---



<div align="center">



\### 👩‍🎓 Réalisé par



\*\*Chaimaa Daanoun\*\*



\### 🎓 Filière



Transformation Digitale industrielle



\### 🏫 Établissement



ENSA Béni Mellal



\### 👨‍🏫 Encadrant



Pr. ELBAGHAZAOUI



</div>



\---



\---



\# 📑 Sommaire



\* Exercice 1.1 : Gestion d’animaux

\* Exercice 1.2 : Gestion des véhicules

\* Exercice 1.3 : Comptes bancaires

\* Conclusion



\---



\# 🐾 Exercice 1.1 – Gestion d’animaux



\## partie 1:Concepts théoriques



\### Encapsulation



L’encapsulation consiste à protéger les données en les rendant privées.

Dans la classe `Animal`, l’attribut `nom` est privé et accessible via `getNom()`.



\---



\### Héritage



Les classes `Mammifere` et `Oiseau` héritent de `Animal` grâce à `extends`.



\---



\### Abstraction



La classe `Animal` est abstraite et contient la méthode abstraite `faireDuBruit()`.



\---



\### Polymorphisme



Dans `main()` :



```java

Animal tigre = new Mammifere("Tigre");

Animal perroquet = new Oiseau("Perroquet");

```



La méthode `faireDuBruit()` change selon l’objet.



\---



\## partie 2: Compléments apportés



\* Ajout de la méthode :



```java

public void voler() {

&#x20;   System.out.println("L'oiseau vole.");

}

```



\* Utilisation dans `main()` :



```java

Oiseau o = (Oiseau) perroquet;

o.voler();

```



\---



\## partie3: Mots-clés



\* Héritage → `extends`

\* Abstraction → `abstract`

\* Redéfinition → `@Override`



\---



\# 🚗 Exercice 1.2 – Gestion des véhicules



\## partie1: Concepts théoriques



\### Encapsulation



Les attributs `marque`, `modele`, `annee` sont privés et accessibles via des getters.



\---



\### Héritage



`Voiture` et `Camion` héritent de `Vehicule`.



\---



\### Abstraction



`Vehicule` est abstraite car elle contient `afficherDetails()` abstraite.



\---



\### Polymorphisme



```java

Vehicule maVoiture = new Voiture(...);

Vehicule monCamion = new Camion(...);

```



Chaque classe redéfinit `afficherDetails()`.



\---



\## partie 2: Compléments apportés



\### Méthode ajoutée dans Vehicule



```java

public void demarrer() {

&#x20;   System.out.println("Le véhicule démarre.");

}

```



\### Modification dans Voiture et Camion



```java

demarrer();

```



\---



\### Nouvelle classe Moto



```java

class Moto extends Vehicule {

&#x20;   private String typeDeGuidon;



&#x20;   public Moto(String marque, String modele, int annee, String typeDeGuidon) {

&#x20;       super(marque, modele, annee);

&#x20;       this.typeDeGuidon = typeDeGuidon;

&#x20;   }



&#x20;   @Override

&#x20;   public void afficherDetails() {

&#x20;       demarrer();

&#x20;       System.out.println("Moto: " + getMarque() + " " + getModele() +

&#x20;       " (" + getAnnee() + "), Guidon: " + typeDeGuidon);

&#x20;   }

}

```



\---



\## partie 3: Mots-clés



\* Redéfinition → `@Override`

\* Héritage → `extends`

\* Constructeur parent → `super`



\---



\# 🏦 Exercice 1.3 – Comptes bancaires



\## 🛠 Implémentation



\### Classe CompteBancaire



```java

class CompteBancaire {

&#x20;   protected String numeroCompte;

&#x20;   protected double solde;



&#x20;   public CompteBancaire(String numeroCompte, double solde) {

&#x20;       this.numeroCompte = numeroCompte;

&#x20;       this.solde = solde;

&#x20;   }



&#x20;   public void deposer(double montant) {

&#x20;       solde += montant;

&#x20;   }



&#x20;   public void retirer(double montant) {

&#x20;       if (solde >= montant) {

&#x20;           solde -= montant;

&#x20;       } else {

&#x20;           System.out.println("Solde insuffisant");

&#x20;       }

&#x20;   }

}

```



\---



\### Classe CompteEpargne



```java

class CompteEpargne extends CompteBancaire {



&#x20;   public CompteEpargne(String numeroCompte, double solde) {

&#x20;       super(numeroCompte, solde);

&#x20;   }



&#x20;   public void calculerInterets(double taux) {

&#x20;       solde += solde \* taux;

&#x20;   }

}

```



\---



\### Classe principale



```java

public class Banque {

&#x20;   public static void main(String\[] args) {



&#x20;       CompteBancaire courant = new CompteBancaire("C1", 1000);

&#x20;       CompteEpargne epargne = new CompteEpargne("E1", 2000);



&#x20;       courant.deposer(500);

&#x20;       courant.retirer(200);



&#x20;       epargne.calculerInterets(0.05);



&#x20;       System.out.println("Solde courant: " + courant.solde);

&#x20;       System.out.println("Solde épargne: " + epargne.solde);

&#x20;   }

}

```



\---



\# ✅ Conclusion



Ce TP a permis de maîtriser les concepts fondamentaux de la Programmation Orientée Objet :



\* Encapsulation

\* Héritage

\* Abstraction

\* Polymorphisme



Ces concepts permettent de développer des applications modulaires, réutilisables et maintenables, essentielles dans le développement logiciel moderne.



\---



