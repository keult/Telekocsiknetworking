package hu.online.cars.networking.model.api.cars;

import java.util.List;

/**
 * Created by demdani on 2016. 12. 03..
 */

public class BrandFactory {

    private String id;
    private String text;
    private String hr;
    private List<BrandType> autotipusai;

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getHr() {
        return hr;
    }

    public List<BrandType> getAutotipusai() {
        return autotipusai;
    }
}
