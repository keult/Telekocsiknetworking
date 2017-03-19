package hu.online.cars.networking.model.api;

import java.util.List;

/**
 * Created by demdani on 2016. 10. 25..
 */

public class ProfileDataResponseModel {

    private SessionResponseModel sessarray;
    private List<MyTripResponseModel> utjaim;
    private List<CarResponseModel> autoim;
    private List<SwitchJoin> csatlakoztamId;
    private List<JoinedTripResponseModel> csatlakoztamData;
    private ProfileInfoResponseModel profile;

    public SessionResponseModel getSessarray() {
        return sessarray;
    }

    public List<MyTripResponseModel> getUtjaim() {
        return utjaim;
    }

    public List<SwitchJoin> getCsatlakoztamId() {
        return csatlakoztamId;
    }

    public List<CarResponseModel> getAutoim() {
        return autoim;
    }

    public List<JoinedTripResponseModel> getCsatlakoztamData() {
        return csatlakoztamData;
    }

    public ProfileInfoResponseModel getProfile() {
        return profile;
    }
}
