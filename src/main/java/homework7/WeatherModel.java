package homework7;

import java.io.IOException;

public interface WeatherModel {
    void getWeather(String selectedCity, Period period) throws IOException;
    //public List<Weather> getSavedToDBWeather();
}