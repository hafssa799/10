# NavigationDrawerDemo3

Ce projet est une application Android développée en Java illustrant l'implémentation d'un menu latéral (Navigation Drawer) pour naviguer dynamiquement entre différents fragments

# Spécifications Techniques

•Langage : Java

•SDK Minimum : API 24 (Android 7.0)

•Architecture : Navigation par Fragments (FragmentManager)

•Dépendances Clés : AppCompat 1.7.1, ConstraintLayout 2.2.1, Material Components 1.13.0.

## Étape 1 – Configuration du Projet

•Template : Navigation Drawer Activity.

•Identité : NavigationDrawerDemo3.

•Objectif : Mise en place de la structure standard avec DrawerLayout et NavigationView.

## Étape 2 – Menu et Ressources Graphiques

Le menu latéral a été personnalisé dans res/menu/activity_main_drawer.xml :

1.Vector Assets : Création des icônes ic_home, ic_dashboard et ic_list.

2.Structure du Menu :

◦nav_fragment1 : Fragment 1

◦nav_fragment2 : Fragment 2

◦nav_list : Fragment List

## Étape 3 – Création des Fragments

Deux fragments ont été créés pour tester la navigation :

•BlankFragment : Arrière-plan Rose (#F8BBD0).

•BlankFragment2 : Arrière-plan Bleu (#3F51B5).

## Étape 4 – Conteneur de Navigation (FrameLayout)

Le fichier res/layout/content_main.xml a été modifié pour accueillir les fragments de manière dynamique via un FrameLayout.


## Étape 5 – Programmation de la Navigation

Implémentation de `NavigationView.OnNavigationItemSelectedListener` dans la `MainActivity`. 

**Logique utilisée :**

- `getSupportFragmentManager()` : Gère la pile de fragments.

- `replace(R.id.contenu, ...)` : Remplace dynamiquement le contenu visuel sans changer d'Activité.

- `GravityCompat.START` : Assure la fermeture fluide du menu latéral après une sélection.

##  Commandes de Navigation

| ID Menu | Fragment Affiché | Couleur |
|---------|------------------|---------|
| nav_fragment1 | BlankFragment | Rose |
| nav_fragment2 | BlankFragment2 | Bleu |
| nav_list | FragmentList | (Liste) |

## Étape 6 – Fragment de type Liste (ListFragment)

Implémentation de la classe FragmentList.java qui hérite de ListFragment. 

Ce fragment affiche une liste de modules de manière automatique sans avoir 

besoin d'un fichier layout XML spécifique.



https://github.com/user-attachments/assets/7624f34d-6bd0-442a-af49-4a027abee37b


