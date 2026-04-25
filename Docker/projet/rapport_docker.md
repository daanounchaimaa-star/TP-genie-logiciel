<div align="center">



\# 📦 Rapport TP Docker  

\## Application Multi-Conteneurs



\---



\### 👩‍🎓 Réalisé par :

Chaimaa Daanoun  



\### 🎓 Filière :

Transformation Digitale industrielle



\### 🏫 Établissement :

ENSA Béni Mellal  



\### 👨‍🏫 Encadrant :

Pr. ELBAGHAZAOUI 

&#x20;

</div>

\---



📄 Rapport – Application Multi-Conteneurs avec Docker

1\. Introduction



Dans le cadre de ce TP, nous avons réalisé la dockerisation d’une application web simple en utilisant Docker et Docker Compose.

L’objectif principal est de comprendre comment déployer une application composée de plusieurs services (frontend + base de données) dans des conteneurs isolés.



2\. Objectifs du TP

Créer une image personnalisée avec un Dockerfile

Utiliser un fichier .dockerignore pour optimiser le build

Configurer une base de données PostgreSQL

Orchestrer plusieurs conteneurs avec Docker Compose

Mettre en place un volume persistant

Tester la communication entre services

3\. Architecture de l’application



L’application est composée de 3 services :



Frontend : serveur web basé sur Nginx qui affiche une page HTML

Base de données : PostgreSQL pour le stockage

pgAdmin : interface graphique pour gérer la base de données



Structure du projet :



project/

├── frontend/

│   ├── Dockerfile

│   ├── index.html

│   └── .dockerignore

├── backend/

│   └── db.env

└── docker-compose.yml

4\. Description des composants

4.1 Frontend



Le frontend est une application web statique servie par Nginx.



Le fichier index.html contient une page simple affichant un message.



Le Dockerfile permet de :



Utiliser l’image nginx:alpine

Copier le fichier HTML

Exposer le port 80

4.2 Fichier .dockerignore



Ce fichier permet d’exclure les fichiers inutiles (comme les logs) lors de la construction de l’image, ce qui améliore les performances.



4.3 Base de données PostgreSQL



Les paramètres de configuration sont définis dans db.env :



utilisateur : admin

mot de passe : adminpassword

base de données : myapp

4.4 Docker Compose



Le fichier docker-compose.yml permet de gérer plusieurs services :



frontend

db (PostgreSQL)

pgadmin



Fonctionnalités importantes :



Réseau commun (app-network) pour la communication

Volume (db-data) pour la persistance des données

Dépendances entre services

5\. Déploiement



La commande suivante permet de construire et lancer les conteneurs :



docker-compose up --build

6\. Tests et Validation

Accès au frontend



Accessible via :

👉 http://localhost:8080



Résultat : affichage du message

"Bienvenue dans l'application Dockerisée"



Accès à pgAdmin



Accessible via :

👉 http://localhost:5050



Identifiants :



Email : admin@admin.com

Mot de passe : admin

Connexion à la base de données



Paramètres utilisés :



Host : db

Port : 5432

Username : admin

Password : adminpassword

7\. Persistance des données



Un volume Docker a été utilisé :



db-data:/var/lib/postgresql/data



Cela permet de conserver les données même après l’arrêt ou la suppression du conteneur.



8\. Difficultés rencontrées

Problème de connexion à la base (mauvais host → utiliser db et non localhost)

Erreurs liées aux variables d’environnement

Compréhension du rôle des réseaux Docker

9\. Conclusion



Ce TP nous a permis de :



Comprendre le fonctionnement de Docker

Déployer une application multi-conteneurs

Utiliser Docker Compose pour simplifier la gestion

Mettre en place une architecture propre et modulaire



Ce type d’architecture est largement utilisé dans les environnements industriels et DevOps.



10\. Améliorations possibles

Ajouter un backend (API en Node.js ou Python)

Mettre en place HTTPS

Ajouter un système de monitoring

Utiliser Kubernetes pour un déploiement avancé

