package emsi.ma.ateliercouplage.pres;

import emsi.ma.ateliercouplage.data.DataImpl;
import emsi.ma.ateliercouplage.data.IData;
import emsi.ma.ateliercouplage.metier.MetierImp;

public class Presentation
{
    public static void main(String[] args) {
        // Couplage fort (instanciation statique)
        MetierImp metier = new MetierImp();
        DataImpl data = new DataImpl();
        metier.setDatacal(data);
        System.out.println("Résultat (Couplage Fort) : " + metier.calcul());

        // Couplage faible (instanciation dynamique)
        try {
            // Instanciation dynamique avec reflexion
            IData dataDyn = (IData) Class.forName("DataImplExt").newInstance();
            metier.setDatacal(dataDyn);
            System.out.println("Résultat (Couplage Faible) : " + metier.calcul());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}