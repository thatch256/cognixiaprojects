package SpringBootCountry;

import java.util.ArrayList;

public class Country {

	private static ArrayList<Country> countryList = new ArrayList<Country>();

	static {
		countryList.add(new Country("United States", "Washington DC", 327000000));
		countryList.add(new Country("Norway", "Oslo", 5300000));
		countryList.add(new Country("South Africa", "Pretoria, Cape Town, and Bloemfontein", 56000000));
		countryList.add(new Country("Cambodia", "Phnom Penh", 16000000));
		countryList.add(new Country("Australia", "Canberra", 24000000));
	}

	public static ArrayList<Country> getCountries() {
		return countryList;
	}

	private String name;
	private String capitalName;
	private int population;

	public Country(String name, String capitalName, int population) {
		super();
		this.name = name;
		this.capitalName = capitalName;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public String getCapitalName() {
		return capitalName;
	}

	public int getPopulation() {
		return population;
	}

}
