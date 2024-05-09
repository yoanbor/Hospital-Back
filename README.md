# Application de suivi des patients d'un hôpital

## Contexte du projet

**Dans le cadre de notre formation, nous devons concevoir et développer une application de suivi des patients d'un hôpital afin de gérer le séjour des patients**

Le but est de pouvoir :

- Ajouter un nouveau patient
- Modifier des patients existants.
- Prendre en compte l’arrivée d’un patient dans un service.
- Prendre en compte la sortie d’un service.
- Un patient, lors d’un séjour, est affecté à un lit qui est lui-même dans une chambre.

___
## Contraintes

Tâches à réaliser :
- Mise en place des outils d'organisation de votre travail
- Conception MERISE
- Conception UML
- Création de la base de données
- Développement de la partie back-end
- Développement d'au moins un test unitaire et un test d'intégration
- Mise en place d'une architecture multi-couches
- Les requêtes SQL suivantes :
  - afficher les noms et prénoms de tous les patients affectés au service "Urgences"
  -  afficher tous les lits actuellement libres

## **Modalités d'évaluation**

Analyse du code et des documents associés par les formateurs

## **Livrables**

- Sources du projet sur GitHub
- Trello ou Jira pour l'organisation du travail
- Schéma des différents éléments de conception
- Les requêtes SQL attendues

## **Critères de performance**

Les fonctionnalités demandées sont bien implémentés.
Les contraintes sont bien respectées.




### _Technologies utilisées_

-   Outils / Logiciels utlisés pour le projet :

![FIGMA](https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white)
![TRELLO](https://img.shields.io/badge/Trello-0052CC?style=for-the-badge&logo=trello&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
![GIT](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

J'ai aussi utilisé draw.io pour l'UML

-   Environnement virtuel pour le déploiement:

![DOCKER](https://img.shields.io/badge/Docker-2CA5E0?style=for-the-badge&logo=docker&logoColor=white)

-   Frameworks et bibliothèques du code :

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

-   Système de gestion de base de données :

![POSTGRESQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)

J'ai aussi utilisé PGadmin

## **Livrés**

[Cliquez ici pour aller au Notion](https://chambray-armchair-216.notion.site/Application-de-suivi-des-patients-d-un-h-pital-9286ec27538c4a7284f0b4d2a76b3451?pvs=4)

[Cliquez ici pour aller au Figma](https://www.figma.com/file/EnEd53RR6CDL1GXDmzkkki/Application-de-suivi-des-patients-d'un-h%C3%B4pital?type=whiteboard&node-id=0%3A1&t=GMnO4cMrAugjv0Dq-1)

[Cliquez ici pour aller au Trello](https://trello.com/invite/b/VlyeLAyV/ATTIde259ce2476425aa0fb7b1171d2d1e73226F31FA/application-de-suivi-des-patients-dun-hopital)

**Merise** :

- Dictionnaire de données en png
- MCD en png
- MLD en png
- MPD en png



**UML** :

- Règles de gestions : 
  - Un utilisateur peut créer un patient
  - Un utilisateur médical peut modifier un patient
  - Un utilisateur peut voir la liste de tous les patient
  - Un utilisateur peut ajouter un patient à un service
  - Un utilisateur peut enlever un patient d’un service
  - Un utilisateur peut associer un lit à un patient
  - Un utilisateur peut associer une chambre à un patient


- Diagramme de cas d'utilisation en png
- Diagramme de classes en png
- Diagramme de séquence en png
- Fichier source en draw.io

**SQL**

Insérer des données dans la table "services" 

```sql
INSERT INTO services (name) VALUES
('Urgences'),
('Cardiologie'),
('Chirurgie'),
('Pédiatrie'),
('Radiologie'),
('Maternité'),
('Neurologie'),
('Psychiatrie');
```

Insérer des données dans la table "bedrooms"

```sql
INSERT INTO bedrooms (numbers) VALUES
(601),
(602),
(603),
(604),
(605),
(606),
(607),
(608),
(609);
```

Insérer des données dans la table "beds"

```sql
INSERT INTO beds (numbers, id_bedroom) VALUES
(91, 1),
(92, 2),
(93, 3),
(94, 4),
(95, 5),
(96, 6),
(97, 7),
(98, 8),
(99, 9);
```

Insérer des données dans la table "patients"

```sql
INSERT INTO patients (name, firstname, dob, securitysocialnumber, id_service, id_bed) VALUES
('Durand', 'Anne', '1978-05-15', '1234567890123', 1, 1),
('Leroux', 'Marc', '1965-09-22', '2345678901234', 2, 9),
('Fournier', 'Sophie', '1982-12-10', '3456789012345', 3, 5),
('Girard', 'Pierre', '1990-03-03', '4567890123456', 4, 6),
('Dubois', 'Marie', '1976-07-28', '5678901234567', 8, 9),
('Lefevre', 'Luc', '1950-11-18', '6789012345678', 4, 9),
('Petit', 'Laura', '1995-02-05', '7890123456789', 7, 1),
('Thomas', 'Jean', '1988-04-30', '8901234567890', 2, 9);
```

Voir la table patients

```sql
SELECT * FROM patients
```

Voir la table services

```sql
SELECT * FROM services
```

Voir la table beds

```sql
SELECT * FROM beds
```

Voir la table bedrooms

```sql
SELECT * FROM bedrooms
```

Afficher les noms et prénoms de tous les patients affectés au service "Urgences"

```sql
SELECT name, firstname FROM patients WHERE (id_service = 1);
```

```sql
SELECT patients.name, patients.firstname FROM patients INNER JOIN services ON patients.id_service = services.id_service WHERE services.name = 'Urgences';
```

Afficher tous les lits actuellement libres

```sql
SELECT beds.numbers FROM beds WHERE id_bed NOT IN (SELECT id_bed from patients); 
```

## Comment lancer le projet

- Clonez le repository Git
- Allez sur la branch "develop"
- Démarrez Docker Desktop
- A la racine, allez dans le dossier "Docker" et faites la commande "docker compose up"
- Ouvrez le projet dans l'IDE et démarrez le
- Ouvrez Postman et mettez ce lien 

Récuperer tous les patients
```
Get : http://localhost:8080/patient
```
Ajouter un patient
```
Post : http://localhost:8080/patient
```
Récuperer un patient par son id
```
Get : http://localhost:8080/patient/{id}
```
Modifier un patient par son id
```
Put : http://localhost:8080/patient/{id}
```

---

## **Author**

👤 **_Yoan Bor_**

<a href="https://github.com/yoanbor"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></img></a>
<a href="www.linkedin.com/in/yoan-bor"><img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"></img></a>
