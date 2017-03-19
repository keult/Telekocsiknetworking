package hu.online.cars.networking.constant;


import hu.online.cars.networking.BuildConfig;

/**
 * Created by demdani on 2016. 10. 10..
 */

public class ApiConstants {

    public static final String BASE_URL = BuildConfig.BASE_URL;

    // places
    public static final String PLACE_AUTOCOMPLETE_URL = "https://maps.googleapis.com/maps/api/place/autocomplete/json";
    public static final String PLACES_API_KEY = BuildConfig.PACES_API_KEY;
    public static final String INPUT = "input";
    public static final String KEY = "key";
    public static final String TYPES = "types";
    public static final String TYPES_VALUE = "(cities)";
    public static final String LANGUAGE = "language";
    public static final String LANGUAGE_VALUE = "hu";

    // api trips
    public static final String SEARCH = "utak/osszes";
    public static final String TRIP_UPLOAD = "utak/ujut";

    // api profile
    public static final String LOG_IN = "profile/login";
    public static final String JOIN = "profile/foglalas";
    public static final String MY_CARS = "profile/autoim";
    public static final String REGISTER = "profile/register";
    public static final String MY_TRIP_LIST = "profile/utjaim";
    public static final String JOINED_TRIP_LIST = "profile/csatlakozott";

    // api geo
    public static final String NEAR_CARS = "lokalis/leker";
    public static final String MY_POSITION_ON = "lokalis/bekapcsol";
    public static final String HIDE_POSITION = "lokalis/kikapcsol";

    // api rating
    public static final String RATING = "ertekeles/lista";
    public static final String RATE = "ertekeles/uj";

    // api cars
    public static final String BRANDS_CHECK = "cars/brandscheck";
    public static final String BRANDS = "cars/brands";
    public static final String CAR_UPLOAD = "cars/new";
}
