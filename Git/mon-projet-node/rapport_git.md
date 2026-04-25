\# 🧪 TP Git \& Node.js – Rapport



\## 👤 Auteur

\*\*Chaimaa Daanoun\*\* – Transformation digitale industrielle, ENSA Béni Mellal



\## 🎯 Objectif

Mise en pratique des concepts Git (branches, merge, conflit, rebase, cherry-pick, GitHub) à travers un projet Node.js.



\---



\## 🗂️ Structure finale du projet

mon-projet-node/

├── .gitignore

├── README.md

├── package.json

├── index.js

└── RAPPORT\_GIT.md



text



\---



\## 📄 Fichiers clés



\### `index.js` (version finale)

\- Fonction `addition` : gère les valeurs non numériques (NaN) → retourne 0

\- Fonction `soustraction`

\- Export des deux fonctions

\- Affichage des résultats pour `(5, 3)`



\### `.gitignore`

Ignore le dossier `node\_modules/`



\### `package.json`

Contient le script `start` : `node index.js`



\---



\## 🔧 Commandes essentielles exécutées



| Étape | Commandes |

|-------|-----------|

| Initialisation | `git init`, `npm init -y` |

| Branche `dev` | `git checkout -b dev`, ajout addition, commit |

| Merge `dev` → `main` | `git checkout main`, `git merge dev` |

| Branche `feature` | Ajout soustraction |

| Conflit | Merge `feature` dans `main` → résolution manuelle |

| Branche `bugfix` | Gestion NaN dans addition |

| Rebase | `git rebase bugfix` sur `main` |

| Cherry-pick | Appliquer commit `bugfix` sur `feature` |

| GitHub | `git remote add origin`, `git push -u origin main` |



\---



\## 🌿 Arborescence des branches

main

├── dev (addition) → fusion

├── feature (soustraction) → conflit → résolu

└── bugfix (NaN) → rebase







\---



\## 🧪 Résultat attendu



```bash

npm start

text

Résultat addition: 8

Résultat soustraction: 2

