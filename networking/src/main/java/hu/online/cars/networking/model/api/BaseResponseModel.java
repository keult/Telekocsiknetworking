package hu.online.cars.networking.model.api;

import java.util.List;

/**
 * Created by demdani on 2016. 10. 23..
 */

public class BaseResponseModel {

    protected int status;
    protected int success;
    private Double benchmark;
    private Double version;
    protected List<String> error;

    public int getStatus() {
        return status;
    }

    public int getSuccess() {
        return success;
    }

    public List<String> getError() {
        return error;
    }

    public Double getBenchmark() {
        return benchmark;
    }

    public Double getVersion() {
        return version;
    }
}
