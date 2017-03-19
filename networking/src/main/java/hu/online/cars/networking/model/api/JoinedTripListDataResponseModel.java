package hu.online.cars.networking.model.api;

import java.util.List;

/**
 * Created by KeulT on 2016.12.31..
 */
public class JoinedTripListDataResponseModel {

    private SessionResponseModel sessarray;
    private List<SwitchJoin> csatlakoztamId;
    private List<JoinedTripResponseModel> csatlakoztamData;

    public SessionResponseModel getSessarray() {
        return sessarray;
    }

    public List<SwitchJoin> getCsatlakoztamId() {
        return csatlakoztamId;
    }

    public List<JoinedTripResponseModel> getCsatlakoztamData() {
        return csatlakoztamData;
    }
}
