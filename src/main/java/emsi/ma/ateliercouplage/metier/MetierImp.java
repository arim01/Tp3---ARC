package emsi.ma.ateliercouplage.metier;

import emsi.ma.ateliercouplage.data.IData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImp implements IMetier
{
    @Autowired @Qualifier("data")
    private IData datacal;
    @Override
    public double calcul() {
        return this.datacal.getData()*10;
    }

    public void setDatacal(IData d){
        this.datacal=d;
    }
}
