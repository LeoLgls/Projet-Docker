# Utiliser l'image debian officielle comme image parent
FROM debian:latest

# Installer des services et des packages ( ici nginx )
RUN apt-get update && apt-get -y install nginx-full 

# Installer openjdk pour nous permettre de compiler et executer
# un fichier.java
RUN apt-get update && apt-get -y install openjdk-11-jdk

# Copier les fichiers de l'hôte vers l'image à des emplacements précis
COPY ./java/ /Java/
 
COPY ./html/ /var/www/html/

# Compilation des fichers.java
RUN javac Java/*.java

# Execute le Controleur.java pour obtenir la page de Streaming
RUN cd Java && java Controleur

# Lancer le service nginx au démarrage du conteneur
CMD nginx -g 'daemon off;'