package emsi.ma.ateliercouplage.data;

import org.springframework.stereotype.Component;

@Component("data") //indiquer qu'une classe est un bean spring
//cad c'est un objet géré par le conteneur Spring
//permet a Spring de détecter et d'instancier automatiquement cette classe

public class DataImpl implements IData
{

    @Override
    public double getData() {
        System.out.println("Recuperation de la base de données");
        return 40;
    }
}
