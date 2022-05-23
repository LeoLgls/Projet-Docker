# S2.03 Installation de services réseau

## I. Présentation de notre projet

### I.1  Introduction de la SAE

Avant cette SAE, nous avons eu une introduction à Git et à GitHub. Nous avons commencé à l'utiliser notamment pour partager des documents dans un répertoir avec nos camarades. Lors de la SAE, nous avons fini cette introduction à Git avec le tp4 et le tp5. 
Ensuite, nous avons eu des tp à faire pour découvrir Docker.   
Une fois l'introcuction terminé, nous avons pris connaissance du projet de cette SAE et nous avons commencé à travaillé.

### I.2  Notre projet 

Nous avons réalisé un site de vidéo à la demande grâce à Docker. Pour cela nous avons créé un fichier docker avec un fichier README.md.
  
## II. Rapport de notre travail tout au long de la SAE

### II.1  Introduction 

Comme nous l'avons déjà dit en introduction de présentation de notre projet, nous avons fait l'introduction à Git ey à Docker. Nous avons fait tous les tp dans le but de pouvoir réutiliser ce que l'on a appris dans le contexte de la SAE. Grâce à GitHub, nous avons créé un repository qui nous a permis de partager nos fichiers et de les ranger. Dans la main on retrouve le fichier README.md et le Dockerfile et dans le dossier gh-pages il y a notre site web réalisé directement sur gitbub.com.

### II.2  Une première idée

Après avoir fini les tp, nous nous sommes lancé dans la découverte du sujet. Dans un premier temps nous voulions faire un site permettant de partager des fichiers entre plusieurs utilisateurs. Nous y avons réfléchi toute une après-midi mais nous avons abandonné cette idée car c'était trop compliqué. Au début, nous pensions qu'avec quelques recherches nous réussirions à faire notre projet mais nous avons été bloqué lorsque l'on a réfléchi à comment nous pouvions faire en sorte qu'un utilisateur, connecté au même réseau internet que celui qui a lancé le dockerfile, puisse récupérer une copie d'un fichier, comment faire en sorte de ne pas supprimer un fichier losque l'on souhaite le copier dans notre répertoire personnel ou bien encore comment sauvegarder les fichiers déposés sur la page.

A cause de ces différentes difficultés, nous avons opté pour une autre idée qui nous paraissait plus simple : un site de vidéo à la demande.

### II.3  Repartir avec un projet plus simple

Suite aux difficultés rencontrées dans l'élaboration du sujet précédent, nous nous sommes tournés vers l'idée de faire un site de vidéo à la demande, ce qui est plus simple. 

Nous avons tout d'abord discuter de la manière dont nous allions construire notre page. Sur notre site, il y a donc une page d'accueil qui mène à un menu avec des épisodes d'animés avec leur nom, leur auteur, les studios d'animations, etc... ou bien qui mène à une liste de musique avec leur titre, le nom de l'artiste, etc...

Grâce à un dossier contenant un fichier html, un fichier css ainsi qu'un dossier avec des animés et des musiques que nous avons téléchargé. Dans ce même dossier nous avons mis notre fichier dockerfile qui permet de lancer un docker qui va télécharger les vidéos et lancer le fichier html. Une fois le docker exécuté, nous avons regardé si notre page fonctionnait correctement. Une fois que notre page était fonctionnelle, il ne nous restait plus qu'à ajouter plus d'animés et de musiques afin d'avoir un site complet. 

Pour finir le projet, il ne nous restait plus qu'à faire le fichier README.md et préparer l'oral de présentation du projet. Cependant, nous avons changé d'avis.

### II.4  Ajouter plus de piment au projet

Comme nous avions finis le projet plus vite que prévu et pour rendre le résultat final plus intéressant, nous avons réfléchi à un nouveau concept qui est basé sur le modèle de notre projet déjà existant. Cependant, la personne qui lance le fichier dockerfile a la possibilité de modifier les animés et les musiques qu'elle souhaite mettre sur le site. Pour cela, la personne va télécharger les animés et les musiques qu'elle souhaite ajouté. Ensuite, elle va mettre dans un fichier ```Musique``` toutes les musiques téléchargé et pareil pour le dossier ```Anime```. Ces deux dossiers vont être contenu dans un dossier ```Vidéo``` qui va lui-même se trouver dans un dossier ```html```.

<< on peut ajouter une image de ce que donne l'arborescence de tous les dossiers >>

Grâce à un fichier java, nous allons créer notre page html en fonction des vidéos qui se trouvent dans les différents dossiers. Lors de l'exécution du fichier dockerfile, toutes les vidéos vont êtres téléchargées et le fichier java va-t-être exécuté. Il ne reste plus qu'à vérifier si le site fonctionne correctement et à finir notre projet. Une fois le site fonctionnel, nous avons ajouté notre fichier README.md et le dossier Docker au repository ```docker-sae203``` afin de conclure notre projet.
