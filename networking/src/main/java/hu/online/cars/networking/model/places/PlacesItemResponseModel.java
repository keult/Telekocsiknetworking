package hu.online.cars.networking.model.places;

import java.util.List;

/**
 * Created by demdani on 2016. 10. 12..
 */

public class PlacesItemResponseModel {

    private String description;
    private String id;
    private String placeId;
    private String reference;
    private List<PlacesValueResponseModel> terms;
    private List<String> types;

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getPlaceId() {
        return placeId;
    }

    public String getReference() {
        return reference;
    }

    public List<PlacesValueResponseModel> getTerms() {
        return terms;
    }

    public List<String> getTypes() {
        return types;
    }
}
