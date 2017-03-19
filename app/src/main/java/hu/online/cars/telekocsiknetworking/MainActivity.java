package hu.online.cars.telekocsiknetworking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

import hu.online.cars.networking.NetworkManager;
import hu.online.cars.networking.callback.JoinedTripListCallback;
import hu.online.cars.networking.callback.MyTripListCallback;
import hu.online.cars.networking.error.NetworkError;
import hu.online.cars.networking.model.api.JoinedTripListResponseModel;
import hu.online.cars.networking.model.api.MyTripListResponseModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Map<String, Object> map = new HashMap<>();
//        map.put(INPUT, "bud");
//        map.put(TYPES, TYPES_VALUE);
//        map.put(LANGUAGE, LANGUAGE_VALUE);
//        map.put(KEY, PLACES_API_KEY);
//        NetworkManager.getInstance().fetchPlaces(map, new PlacesCallback() {
//            @Override
//            public void forwardResponse(PlacesResponseModel responseModel) {
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_LONG).show();
//            }
//        });

        // login
//        map = new HashMap<>();
//        map.put("apikey", "apikey");
//        map.put("username", "Balaz98");
//        map.put("password", "asd123");
//        NetworkManager.getInstance().login(map, new LoginCallback() {
//            @Override
//            public void forwardResponse(ProfileResponseModel profileResponseModel) {
//                profileResponseModel.getData().getProfile().getEmail();
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_LONG).show();
//            }
//        });

        // near cars
//        map = new HashMap<>();
//        map.put("apikey", "apikeygen");
//        map.put("username", "Balaz98");
//        map.put("password", "asd123");
//        map.put("locx", "1");
//        map.put("locy", "1");
//        NetworkManager.getInstance().nearCars(map, new NearCarsCallBack() {
//            @Override
//            public void forwardResponse(NearCarsResponseModel nearCarsResponseModel) {
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_LONG).show();
//            }
//        });
//
//
//        // show my position
//        map = new HashMap<>();
//        map.put("apikey", "apikeygen");
//        map.put("username", "Balaz98");
//        map.put("password", "asd123");
//        map.put("locx", "1");
//        map.put("locy", "1");
//        map.put("ferohely", "1");
//        map.put("comment", "1");
//        NetworkManager.getInstance().showMyPosition(map, new DefaultCallback() {
//            @Override
//            public void forwardResponse(BaseResponseModel baseResponseModel) {
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        // rating
//        map = new HashMap<>();
//        map.put("apikey", "apikeygen");
//        map.put("username", "Balaz98");
//        map.put("password", "asd123");
//        NetworkManager.getInstance().rating(map, new RatingCallback() {
//            @Override
//            public void forwardResponse(RatingResponseModel ratingResponseModel) {
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_LONG).show();
//            }
//        });
//
//
//        // brands check
//        map = new HashMap<>();
//        map.put("apikey", "apikeygen");
//        NetworkManager.getInstance().brandsCheck(map, new BrandsCheckCallback() {
//            @Override
//            public void forwardResponse(BrandsCheckResponseModel brandsCheckResponseModel) {
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        // brands
//        map = new HashMap<>();
//        map.put("apikey", "apikeygen");
//        NetworkManager.getInstance().brands(map, new BrandsCallback() {
//            @Override
//            public void forwardResponse(BrandsResponseModel BrandsResponseModel) {
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "hiba", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        // hide my positon
//        map = new HashMap<>();
//        map.put("apikey", "apikeygen");
//        map.put("username", "Balaz98");
//        map.put("password", "asd123");
//        NetworkManager.getInstance().hideMyPosition(map, new DefaultCallback() {
//            @Override
//            public void forwardResponse(BaseResponseModel baseResponseModel) {
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_LONG).show();
//            }
//        });

        // cars
//        map = new HashMap<>();
//        map.put("apikey", "apikey");
//        map.put("username", "Balaz98");
//        map.put("password", "asd123");
//        NetworkManager.getInstance().cars(map, new CarCallback() {
//            @Override
//            public void forwardResponse(MyCarsResponseModel myCarsResponseModel) {
//                myCarsResponseModel.getData().getAutoim().get(0).getEvjarat();
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_LONG).show();
//            }
//        });
//
////        // search
//        map = new HashMap<>();
//        map.put("apikey", "apikeygen");
//        map.put("from_country", "Magyarország");
//        map.put("from_city", "Nyíregyháza");
//        map.put("to_country", "Magyarország");
//        map.put("to_city", "Budapest");
//        map.put("start_date", "2016-10-24");
//        map.put("startid", "1");
//        map.put("filters", "d_klima");
//        NetworkManager.getInstance().search(map, new SearchCallback() {
//            @Override
//            public void forwardResponse(TripSearchResponseModel tripSearchResponseModel) {
//                tripSearchResponseModel.getData().getUtak().get(0).getCarid();
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_LONG).show();
//            }
//        });
////
////        // upload
//        map = new HashMap<>();
//        map.put("apikey", "apikey");
//        map.put("userid", "1");
//        map.put("from_country", "Magyarország");
//        map.put("from_city", "Budapest");
//        map.put("to_country", "Magyarország");
//        map.put("to_city", "Nyíregyháza");
//        map.put("carid", "4");
//        map.put("date", "2016-10-24");
//        map.put("time", "19:45:00");
//        map.put("number_helyek", "2");
//        map.put("pay", "3500");
//        map.put("comment", "Android teszt");
//        map.put("d_csomagszallitas", "1");
//        map.put("d_klima", "1");
//        map.put("d_autopalya", "1");
//        map.put("d_csakkezi", "1");
//        map.put("d_dohanyzo", "1");
//        map.put("d_csakno", "1");
//        map.put("d_koztes", "1");
//        NetworkManager.getInstance().upload(map, new DefaultCallback() {
//            @Override
//            public void forwardResponse(BaseResponseModel baseResponseModel) {
//                baseResponseModel.getSuccess();
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//        });
////
////        // join
//        map = new HashMap<>();
//        map.put("apikey", "apikey");
//        map.put("username", "Balaz98");
//        map.put("password", "asd123");
//        map.put("utid", "70");
//        NetworkManager.getInstance().join(map, new JoinCallback() {
//            @Override
//            public void forwardResponse(JoinResponseModel joinResponseModel) {
//                joinResponseModel.getData();
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//        });



        // register
//        map = new HashMap<>();
//        map.put("apikey", "apikey");
//        map.put("reg_username", "dani2");
//        map.put("reg_password", "dani2");
//        map.put("reg_password2", "dani2");
//        map.put("reg_email", "dani2@dani2.dani");
//        map.put("reg_vezeteknev", "dani2");
//        map.put("reg_keresztnev", "dani");
//        NetworkManager.getInstance().register(map, new DefaultCallback() {
//            @Override
//            public void forwardResponse(BaseResponseModel baseResponseModel) {
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_LONG).show();
//            }
//        });

//        // upload car
//        map = new HashMap<>();
//        map.put("apikey", "apikey");
//        map.put("username", "Balaz98");
//        map.put("password", "asd123");
//        map.put("rendszam", "ZZZ-999");
//        map.put("tipus", "25");
//        map.put("evjarat", "2000");
//        map.put("color", "piros");
//        NetworkManager.getInstance().uploadCar(map, new DefaultCallback() {
//            @Override
//            public void forwardResponse(BaseResponseModel baseResponseModel) {
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        // upload car
//        map = new HashMap<>();
//        map.put("apikey", "apikey");
//        map.put("username", "Balaz98");
//        map.put("password", "asd123");
//        map.put("ertekelesid", "27");
//        map.put("ertekelesval", "2");
//        map.put("ertekelesszoveg", "teszt");
//        NetworkManager.getInstance().rateUser(map, new DefaultCallback() {
//            @Override
//            public void forwardResponse(BaseResponseModel baseResponseModel) {
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_LONG).show();
//            }
//        });

//      MyTripList: Útjaim sofőrként
//        Map<String, Object> map;
//        map = new HashMap<>();
//        map.put("apikey", "apikey");
//        map.put("username", "Balaz98");
//        map.put("password", "asd123");
//
//        NetworkManager.getInstance().getMyTripList(map, new MyTripListCallback() {
//            @Override
//            public void forwardResponse(MyTripListResponseModel tripListResponseModel) {
//                tripListResponseModel.getData().getUtjaim();
//                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void forwardError(NetworkError networkError) {
//                Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_LONG).show();
//            }
//        });

        // JoinedTripList: Útjaim utasként
        Map<String, Object> map;
        map = new HashMap<>();
        map.put("apikey", "apikey");
        map.put("username", "Balaz98");
        map.put("password", "asd123");

        NetworkManager.getInstance().getJoinedTripList(map, new JoinedTripListCallback() {
            @Override
            public void forwardResponse(JoinedTripListResponseModel joinedTripListResponseModel) {
                joinedTripListResponseModel.getData().getCsatlakoztamData();
                Toast.makeText(MainActivity.this, "Siker", Toast.LENGTH_LONG).show();
            }

            @Override
            public void forwardError(NetworkError networkError) {
                Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_LONG).show();
            }
        });
    }
}
