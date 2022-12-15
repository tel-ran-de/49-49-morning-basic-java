package lessons.lesson6.exampleString;

public class TemperatureConverter {

    public double convertCelsiumFarengait(double temperatureCelsium){
        double temperatureFarengait = temperatureCelsium *1.8 +32;
        return temperatureFarengait;
    }

    public double convertCelsiumKelvin(double temperatureCelsium){
        double temperatureKelvin = temperatureCelsium - 273.15;
        return temperatureKelvin;
    }

}
