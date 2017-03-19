package hu.online.cars.networking;

import java.util.Map;

import hu.online.cars.networking.callback.BrandsCallback;
import hu.online.cars.networking.callback.BrandsCheckCallback;
import hu.online.cars.networking.callback.CarCallback;
import hu.online.cars.networking.callback.DefaultCallback;
import hu.online.cars.networking.callback.JoinCallback;
import hu.online.cars.networking.callback.JoinedTripListCallback;
import hu.online.cars.networking.callback.LoginCallback;
import hu.online.cars.networking.callback.NearCarsCallBack;
import hu.online.cars.networking.callback.PlacesCallback;
import hu.online.cars.networking.callback.RatingCallback;
import hu.online.cars.networking.callback.SearchCallback;
import hu.online.cars.networking.callback.MyTripListCallback;
import hu.online.cars.networking.di.component.DaggerNetworkComponent;
import hu.online.cars.networking.error.factory.ErrorFactory;
import hu.online.cars.networking.service.ApiService;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by demdani on 2016. 10. 18..
 */

public class NetworkManager {

    private static NetworkManager instance;
    private ApiService apiService;

    private NetworkManager() {
        this.apiService = DaggerNetworkComponent
                .create()
                .provideApiService();
    }

    public static synchronized NetworkManager getInstance() {
        if (instance == null) {
            instance =  new NetworkManager();
        }
        return instance;
    }

    public void fetchPlaces(Map<String, Object> query, PlacesCallback callback) {
        apiService.findMatchingPlaces(query)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        callback::forwardResponse,
                        throwable -> {
                            callback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );

    }

    public void login(Map<String, Object> body, LoginCallback loginCallback) {
        apiService.login(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        loginCallback::forwardResponse,
                        throwable -> {
                            loginCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void search(Map<String, Object> body, SearchCallback searchCallback) {
        apiService.search(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        searchCallback::forwardResponse,
                        throwable -> {
                            searchCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void upload(Map<String, Object> body, DefaultCallback defaultCallback) {
        apiService.upload(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        defaultCallback::forwardResponse,
                        throwable -> {
                            defaultCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void join(Map<String, Object> body, JoinCallback joinCallback) {
        apiService.join(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        joinCallback::forwardResponse,
                        throwable -> {
                            joinCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void cars(Map<String, Object> body, CarCallback carCallback) {
        apiService.cars(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        carCallback::forwardResponse,
                        throwable -> {
                            carCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void nearCars(Map<String, Object> body, NearCarsCallBack nearCarsCallBack) {
        apiService.nearCars(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        nearCarsCallBack::forwardResponse,
                        throwable -> {
                            nearCarsCallBack.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void showMyPosition(Map<String, Object> body, DefaultCallback defaultCallback) {
        apiService.showMyPosition(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        defaultCallback::forwardResponse,
                        throwable -> {
                            defaultCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void hideMyPosition(Map<String, Object> body, DefaultCallback defaultCallback) {
        apiService.hideMyPosition(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        defaultCallback::forwardResponse,
                        throwable -> {
                            defaultCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void rating(Map<String, Object> body, RatingCallback ratingCallback) {
        apiService.rating(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        ratingCallback::forwardResponse,
                        throwable -> {
                            ratingCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void brandsCheck(Map<String, Object> body, BrandsCheckCallback brandsCheckCallback) {
        apiService.brandsCheck(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        brandsCheckCallback::forwardResponse,
                        throwable -> {
                            brandsCheckCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void brands(Map<String, Object> body, BrandsCallback brandsCallback) {
        apiService.brands(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        brandsCallback::forwardResponse,
                        throwable -> {
                            brandsCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void register(Map<String, Object> body, DefaultCallback defaultCallback) {
        apiService.register(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        defaultCallback::forwardResponse,
                        throwable -> {
                            defaultCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void uploadCar(Map<String, Object> body, DefaultCallback defaultCallback) {
        apiService.uploadCar(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        defaultCallback::forwardResponse,
                        throwable -> {
                            defaultCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void rateUser(Map<String, Object> body, DefaultCallback defaultCallback) {
        apiService.rateUser(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        defaultCallback::forwardResponse,
                        throwable -> {
                            defaultCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void getMyTripList(Map<String, Object> body, MyTripListCallback tripListCallback) {
        apiService.getTripList(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        tripListCallback::forwardResponse,
                        throwable -> {
                            tripListCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }

    public void getJoinedTripList(Map<String, Object> body, JoinedTripListCallback joinedTripListCallback) {
        apiService.getJoinedTripList(body)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        joinedTripListCallback::forwardResponse,
                        throwable -> {
                            joinedTripListCallback.forwardError(ErrorFactory.createNetworkError(throwable));
                        }
                );
    }
}
