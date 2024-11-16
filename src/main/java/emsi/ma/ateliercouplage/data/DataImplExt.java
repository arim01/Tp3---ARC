package emsi.ma.ateliercouplage.data;

import org.springframework.stereotype.Component;

@Component
public class DataImplExt implements IData{


    @Override
    public double getData() {
        return 30;
    }
}
