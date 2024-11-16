package emsi.ma.ateliercouplage.pres;

import emsi.ma.ateliercouplage.metier.IMetier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PresSpringAnnotation {
    public static void main(String[] args) {
        // Configuration du contexte en scannant les packages
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("emsi.ma.ateliercouplage.data", "emsi.ma.ateliercouplage.metier");

        // Récupérer le bean de type IMetier
        IMetier metier = applicationContext.getBean(IMetier.class);

        // Exécuter la méthode et afficher le résultat
        System.out.println(metier.calcul());
    }
}
