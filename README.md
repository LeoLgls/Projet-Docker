# Instruction d'installation

- Cloner le référentiel :
```shell
git clone git@github.com:LeoLgls/docker-sae203.git
```

Comme vous pouvez le voir en allant dans le répértoire `docker-sae203/html/Video` il y a 2 répértoires `Anime` et `Musique`. 
A l'intérieur de ces 2 répértoires vous pourrez y retrouver des vidéos et musiques en .mp4. Il vous est possible d'ajouter des vidéos dans chacun des ces 2 répértoires pour les faires apparaitre sur le Site.
Attention de bien mettre vos vidéos au format **.mp4**. Le nom de votre vidéo sera le titre de la vidéo sur le site, vous pourrez tout de même les nommés par exemple *"One_Piece_Episode_719"*, les '_' apparaitront comme des espaces.

Puis :

- Aller au répositoire :
```shell
cd docker-sae203
```

- Construction du conteneur :
```shell
docker build -t debian-video-img .
```

- Lancer le service :
```shell
docker run -p 8080:80 debian-video-img
```

- Vérifier que l'application est en cours d'exécution. Pour ce faire, ouvrez un navigateur et tapez 
`localhost:8080`
