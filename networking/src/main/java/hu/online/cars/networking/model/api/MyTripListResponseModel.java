package hu.online.cars.networking.model.api;

/**
 * Utak lekérdezésés válasza
 */
public class MyTripListResponseModel extends BaseResponseModel{

    private MyTripListDataResponseModel data;

    public MyTripListDataResponseModel getData() {
        return data;
    }
}
