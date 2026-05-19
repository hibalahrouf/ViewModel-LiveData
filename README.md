# Application Android — ViewModel & LiveData

## Présentation

Ce projet consiste à développer une application Android permettant de comprendre le fonctionnement de **ViewModel** et **LiveData** dans une architecture moderne Android.

L’application implémente un compteur interactif capable de :
- incrémenter une valeur
- décrémenter une valeur
- réinitialiser le compteur
- conserver automatiquement les données après rotation de l’écran

Le projet a été réalisé en Java avec Android Studio.

---

# Objectifs du projet

- Comprendre le problème des changements de configuration Android
- Découvrir les limites des variables classiques dans une Activity
- Utiliser ViewModel pour conserver les données
- Utiliser LiveData pour mettre à jour automatiquement l’interface
- Comprendre le fonctionnement des Observers et du Lifecycle Android

---

# Technologies utilisées

- Java
- Android Studio
- Android Jetpack
- ViewModel
- LiveData
- Observer
- Lifecycle

---

# Dépendances utilisées

```kotlin
val lifecycleVersion = "2.10.0"

implementation("androidx.lifecycle:lifecycle-viewmodel:$lifecycleVersion")
implementation("androidx.lifecycle:lifecycle-livedata:$lifecycleVersion")
```

---

# Structure du projet

```text
com.example.counterstateapp
│
├── MainActivity.java
├── ScoreViewModel.java
└── activity_main.xml
```

---

# Fonctionnement général

L’application repose sur :
- un `ViewModel` qui conserve les données
- un `LiveData` observable
- une Activity responsable uniquement de l’affichage

Le compteur continue à conserver sa valeur même après :
- rotation de l’écran
- changement d’orientation
- recréation temporaire de l’Activity

---

# Composants principaux

## 1. ScoreViewModel

Cette classe contient :
- le compteur principal
- les méthodes métier
- le `MutableLiveData<Integer>`

Fonctionnalités :
- augmentation du compteur
- diminution du compteur
- réinitialisation

---

## 2. LiveData

Le `LiveData` permet :
- l’observation automatique des données
- la mise à jour de l’interface sans manipulation manuelle
- le respect du cycle de vie Android

---

## 3. MainActivity

L’Activity :
- observe le LiveData
- met à jour le TextView automatiquement
- délègue la logique métier au ViewModel

---

# Interface graphique

L’interface contient :
- un affichage numérique du compteur
- un bouton INCREASE
- un bouton DECREASE
- un bouton RESET VALUE

---

# Tests réalisés

## Test 1 — Mise à jour du compteur

- incrémentation correcte
- décrémentation correcte
- réinitialisation fonctionnelle

## Test 2 — Rotation de l’écran

- rotation du téléphone/émulateur
- conservation automatique de la valeur

## Test 3 — LiveData

- mise à jour automatique de l’interface
- synchronisation immédiate du TextView



---


# Démonstration vidéo



---

# Résultats obtenus

- ViewModel fonctionnel
- LiveData opérationnel
- Persistance des données après rotation
- Mise à jour automatique de l’UI
- Architecture Android moderne respectée

---
