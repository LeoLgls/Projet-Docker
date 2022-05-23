# Instruction d'installation

- Cloner le référentiel :
```shell
git clone git@github.com:LeoLgls/docker-sae203.git
```

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
```localhost:8080```
