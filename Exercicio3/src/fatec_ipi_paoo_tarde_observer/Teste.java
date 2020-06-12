package fatec_ipi_paoo_tarde_observer;

public class Teste {

	public static void main(String[] args){
		WeatherData wd = new WeatherData();
		CurrentConditionsDisplay conditionsDisplay = 
				new CurrentConditionsDisplay();
		ForecastDisplay forecastDisplay = 
				new ForecastDisplay();
		StatsDisplay statsDisplay = 
				new StatsDisplay();
		wd.registerObserver(conditionsDisplay);
		wd.registerObserver(forecastDisplay);
		wd.registerObserver(statsDisplay);
		wd.iniciar();
	}

}
