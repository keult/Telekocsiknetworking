package hu.online.cars.networking.model.api.geo;

import java.util.List;

/**
 * Created by demdani on 2016. 12. 01..
 */

public class NearCarDataResponseModel {

    private Integer lekertdb;
    private List<NearCar> autok;

    public Integer getLekertdb() {
        return lekertdb;
    }

    public List<NearCar> getAutok() {
        return autok;
    }
}
