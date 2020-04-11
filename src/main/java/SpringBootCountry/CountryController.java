package SpringBootCountry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

	@GetMapping("/countries")
	public Object getCountries() {
		return Country.getCountries();
	}

	@GetMapping("/countrypop/{name}")
	public String countryPop(@PathVariable String name) {
		name = name.toLowerCase().replaceAll("\\s", "");
		for (Country c : Country.getCountries()) {
			if (c.getName().toLowerCase().replaceAll("\\s", "").equals(name)) {
				return c.getName() + "'s population is: " + c.getPopulation();
			}
		}
		return "I have no memory of this country...";
	}
}
