# AP N°2: ORM, Jpa, Hibernate Spring Data

Ce projet Java vise à illustrer l'implémentation d'une architecture basique utilisant des interfaces, des implémentations, et l'injection de dépendances. Les principales fonctionnalités du projet comprennent la création d'interfaces `IDao` et `IMetier`, leurs implémentations respectives, et l'injection de dépendances de différentes manières.<br>

1. **Création des entités JPA `Patient`, `Medecin`, `RendezVous` et `Consultation` :** <br>
  ![image](https://github.com/otari2002/JEE_AP2/assets/53525728/cb372dd6-dfcd-4613-a1fb-75466982c949)
<br>
  ![image](https://github.com/otari2002/JEE_AP2/assets/53525728/6ad12a94-925e-4cb0-9e16-42643bbfe49f)
<br>
  ![image](https://github.com/otari2002/JEE_AP2/assets/53525728/fc959d3e-30f3-4946-be9f-901b46dfff71)
<br>
  ![image](https://github.com/otari2002/JEE_AP2/assets/53525728/592d9354-7bd5-4162-a36d-02d52575a634)
<br>

2. **Configuration de l'unité de persistance dans le ficher application.properties  :**<br>
 ![image](https://github.com/otari2002/JEE_AP2/assets/53525728/522c4d99-8b6e-4035-b1a3-c21cd65f0f27)
<br>

3. **Création des interfaces JPA Repository basées sur Spring data :**<br>
 ![image](https://github.com/otari2002/JEE_AP2/assets/53525728/5bc5b4d0-deeb-4dab-828f-4f71d18ea93a)
<br>

5. **Ajout de quelques patients et medicins :**<br>
  ![image](https://github.com/otari2002/JEE_AP2/assets/53525728/cd6aa208-2235-4712-ac84-22d4e7d03e63)
<br>

6. **Accés à l'interface web `H2 Console` :**<br>
   ![image](https://github.com/otari2002/JEE_AP2/assets/53525728/9eaa6aa4-8a4d-435a-b156-8d1dcc21d5e4)
<br>
   <br>
   - Affichage des patients :<br>
   ![image](https://github.com/otari2002/JEE_AP2/assets/53525728/9a614ad7-8008-4188-a3e7-da70eea7f43f)
<br>
   - Affichage des medicins : <br>
   ![image](https://github.com/otari2002/JEE_AP2/assets/53525728/032f5418-7845-4306-9d27-c36b091edd8e)
<br>

7. **Migration de `H2 Database` vers `MySQL` en modifiant `application.properties` :**<br>
  ![image](https://github.com/otari2002/JEE_AP2/assets/53525728/5ef348c6-18e8-4eb9-9a87-d07b87b54681)
<br>
