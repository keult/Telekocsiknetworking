package hu.online.cars.networking.service;

import java.util.Map;

import hu.online.cars.networking.model.api.BaseResponseModel;
import hu.online.cars.networking.model.api.JoinResponseModel;
import hu.online.cars.networking.model.api.JoinedTripListResponseModel;
import hu.online.cars.networking.model.api.MyCarsResponseModel;
import hu.online.cars.networking.model.api.ProfileResponseModel;
import hu.online.cars.networking.model.api.MyTripListResponseModel;
import hu.online.cars.networking.model.api.TripSearchResponseModel;
import hu.online.cars.networking.model.api.cars.BrandsCheckResponseModel;
import hu.online.cars.networking.model.api.cars.BrandsResponseModel;
import hu.online.cars.networking.model.api.geo.NearCarsResponseModel;
import hu.online.cars.networking.model.api.rating.RatingResponseModel;
import hu.online.cars.networking.model.places.PlacesResponseModel;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import rx.Observable;

import static hu.online.cars.networking.constant.ApiConstants.BRANDS;
import static hu.online.cars.networking.constant.ApiConstants.BRANDS_CHECK;
import static hu.online.cars.networking.constant.ApiConstants.CAR_UPLOAD;
import static hu.online.cars.networking.constant.ApiConstants.HIDE_POSITION;
import static hu.online.cars.networking.constant.ApiConstants.JOIN;
import static hu.online.cars.networking.constant.ApiConstants.JOINED_TRIP_LIST;
import static hu.online.cars.networking.constant.ApiConstants.LOG_IN;
import static hu.online.cars.networking.constant.ApiConstants.MY_CARS;
import static hu.online.cars.networking.constant.ApiConstants.MY_POSITION_ON;
import static hu.online.cars.networking.constant.ApiConstants.NEAR_CARS;
import static hu.online.cars.networking.constant.ApiConstants.PLACE_AUTOCOMPLETE_URL;
import static hu.online.cars.networking.constant.ApiConstants.RATE;
import static hu.online.cars.networking.constant.ApiConstants.RATING;
import static hu.online.cars.networking.constant.ApiConstants.REGISTER;
import static hu.online.cars.networking.constant.ApiConstants.SEARCH;
import static hu.online.cars.networking.constant.ApiConstants.TRIP_UPLOAD;
import static hu.online.cars.networking.constant.ApiConstants.MY_TRIP_LIST;

/**
 * Created by demdani on 2016. 10. 10..
 */

public interface ApiService {

    @POST(PLACE_AUTOCOMPLETE_URL)
    Observable<PlacesResponseModel> findMatchingPlaces(@QueryMap Map<String, Object> query);

    @FormUrlEncoded
    @POST(LOG_IN)
    Observable<ProfileResponseModel> login(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(SEARCH)
    Observable<TripSearchResponseModel> search(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(TRIP_UPLOAD)
    Observable<BaseResponseModel> upload(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(JOIN)
    Observable<JoinResponseModel> join(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(MY_CARS)
    Observable<MyCarsResponseModel> cars(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(NEAR_CARS)
    Observable<NearCarsResponseModel> nearCars(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(MY_POSITION_ON)
    Observable<BaseResponseModel> showMyPosition(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(HIDE_POSITION)
    Observable<BaseResponseModel> hideMyPosition(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(RATING)
    Observable<RatingResponseModel> rating(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(BRANDS_CHECK)
    Observable<BrandsCheckResponseModel> brandsCheck(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(BRANDS)
    Observable<BrandsResponseModel> brands(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(REGISTER)
    Observable<BaseResponseModel> register(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(CAR_UPLOAD)
    Observable<BaseResponseModel> uploadCar(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(RATE)
    Observable<BaseResponseModel> rateUser(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(MY_TRIP_LIST)
    Observable<MyTripListResponseModel> getTripList(@FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST(JOINED_TRIP_LIST)
    Observable<JoinedTripListResponseModel> getJoinedTripList(@FieldMap Map<String, Object> body);

}
