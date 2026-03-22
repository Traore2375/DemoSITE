# 🧪 Projet d’Automatisation des Tests - Selenium

## 📌 Description

Ce projet est une solution d’automatisation des tests web basée sur **Selenium WebDriver**, combinée avec **TestNG** et **ExtentReports** pour la génération de rapports détaillés.

Il permet de :

* Automatiser les tests fonctionnels d’une application web
* Générer des rapports HTML clairs et lisibles
* Gérer les tests via TestNG
* Lire des données depuis des fichiers Excel (Apache POI)

---

## 🌐 Site de test

Les tests sont exécutés sur le site de démonstration suivant :

👉 https://demoqa.com

Ce site permet de tester :

* Formulaires
* Boutons radio et checkbox
* Login / Register
* Interactions UI

---

## 🛠️ Technologies utilisées

* Java 17
* Selenium WebDriver
* TestNG
* ExtentReports
* Maven
* WebDriverManager
* Apache POI
* Cucummber

---

## 📁 Structure du projet

```bash
TestAuto/
│── src/
│   ├── main/
│   └── test/
│       ├── java/
│       │   ├── tests/          # Classes de test
│       │   ├── utilities/      # Utils (ExtentReports, Excel…)
│       │   ├── pageobject/     # Page Object Model
│       │   └── hooks/          # Hooks / configuration
│       └── resources/
│
│── testng.xml                 # Configuration TestNG
│── pom.xml                    # Dépendances Maven
│── target/                    # Résultats de build
```

---

## ⚙️ Installation

### 1️⃣ Prérequis

* Java 17 installé
* Maven installé
* Navigateur Chrome

### 2️⃣ Cloner le projet

```bash
git clone <URL_DU_REPO>
cd TestAuto
```

### 3️⃣ Installer les dépendances

```bash
mvn clean install
```

---

## ▶️ Exécution des tests

### Avec Maven

```bash
mvn test
```
### Avec TestNG

* Exécuter le fichier `testng.xml`
---
## 📊 Rapport de test

Après exécution, le rapport est généré ici :

```bash
target/ExtentReport.html
```
Ouvre ce fichier dans ton navigateur pour voir :

* ✅ Tests réussis
* ❌ Tests échoués
* ⚠️ Tests ignorés
* 📸 Captures d’écran (si configurées)
---

## 🎨 Personnalisation du rapport
```java
spark.config().setTheme(Theme.DARK);
```
## 🧩 Fonctionnalités

* Automatisation UI avec Selenium
* Gestion des tests avec TestNG
* Reporting avancé avec ExtentReports
* Lecture de données Excel
* Structure Page Object Model (POM)
* * Ajout de screenshots automatiques
* Intégration CI/CD (Jenkins, GitHub Actions)
* Intégration avec Cucumber (BDD)

## 🚀 Améliorations possibles
* Exécution parallèle des tests

## 👤 Auteur
* TRAORE
---
## 📄 Licence

Projet à usage éducatif et professionnel.

<img width="1793" height="891" alt="image" src="https://github.com/user-attachments/assets/1b353da8-fae4-4886-aabf-768bdf877d8e" />
