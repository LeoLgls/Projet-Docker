import java.io.PrintWriter;
import java.util.regex.Pattern;
import java.io.File;

public class CreationPageAnime{

    public static void generer(){

        PrintWriter pw = null;

        String html =""; 
        String section ="";

        String[] tabNomVideo;
        String[] nom;

        File f = new File("../var/www/html/Video/Anime");

        tabNomVideo = f.list();


  		try{ 
            pw = new PrintWriter ( new File ( "../var/www/html/Anime.html" ), "utf-8" ); 
        }catch (Exception e){e.printStackTrace();}

        //Creation d'une grande partie de la page : head + body, header
        html ="" +
        "<!DOCTYPE html>\n" +
        "<html>\n" + 
        "\t<head>\n" +
        "\t\t<link rel=\"stylesheet\" href=\"style.css\" media=\"all\" type=\"text/css\"/>\n" +
        "\t\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css\">\n" +
		"\t\t<title>Streaming</title>\n" +
	    "\t</head>\n"+
        "\n"+
	    "\t<body>\n" +
        "\t\t<header class=\"header\">\n" +
        "\t\t\t<nav class=\"navbar navbar-expand-lg fixed-top py-3\">\n" +
        "\t\t\t\t<div class=\"container\"><a href=\"index.html\" class=\"navbar-brand text-uppercase font-weight-bold\">Docker Streaming</a>\n" +
        "\t\t\t\t\t<button type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\" class=\"navbar-toggler navbar-toggler-right\"><i class=\"fa fa-bars\"></i></button>\n" +
        "\n"+       
        "\t\t\t\t\t<div id=\"navbarSupportedContent\" class=\"collapse navbar-collapse\">\n" +
        "\t\t\t\t\t\t<ul class=\"navbar-nav ml-auto\">\n" +
        "\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"index.html\" class=\"nav-link text-uppercase font-weight-bold\">Accueil</a></li>\n"   +
        "\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"Anime.html\" class=\"nav-link text-uppercase font-weight-bold\">Anime</a></li>\n"     +
        "\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"Musique.html\" class=\"nav-link text-uppercase font-weight-bold\">Musique</a></li>\n" +
        "\t\t\t\t\t\t</ul>\n" +
        "\t\t\t\t\t</div>\n"  +
        "\t\t\t\t</div>\n"    +
        "\t\t\t</nav>\n"      +
        "\t\t</header>\n";

        pw.print(html);

        // Ajout de section pour chaque vidéos présentes dans le Dossier Video/Anime
        for(String tmp : tabNomVideo){

            nom = tmp.split(Pattern.quote("."));

            section = "" +
            "\t\t<br/>\n"   +
            "\t\t<section>\n" +
            "\t\t\t<div class=\"Video\">\n" +
            "\t\t\t\t<div>" + nom[0].replace('_', ' ') + "</div>\n" +
            "\t\t\t\t<video width=\"640\" height=\"480\" controls>\n" +
            "\t\t\t\t\t<source src=\"./Video/Anime/"+ tmp + "\" type=\"video/mp4\"/>\n"+
            "\t\t\t\t\t<source src=\"./Video/Anime/"+ tmp + "\" type=\"video/ogg\"/>\n"+
            "\t\t\t\t\tYour browser does not support the video tag.\n" +
            "\t\t\t\t</video>\n" +
            "\t\t\t</div>\n"     + 
            "\t\t</section>\n";

            pw.print(section);
        }

        // fin de l'html
        pw.print("\n"+ 
                 "\t</body>\n" +
                 "</html>\n"   );

        pw.close();

    }
}

    