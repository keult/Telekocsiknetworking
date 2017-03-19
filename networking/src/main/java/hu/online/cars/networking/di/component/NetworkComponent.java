package hu.online.cars.networking.di.component;

import dagger.Component;
import hu.online.cars.networking.di.module.NetworkModule;
import hu.online.cars.networking.service.ApiService;

/**
 * Created by demdani on 2016. 10. 10..
 */

@Component(
        modules = {
                NetworkModule.class
        }
)
public interface NetworkComponent {

        ApiService provideApiService();
}
