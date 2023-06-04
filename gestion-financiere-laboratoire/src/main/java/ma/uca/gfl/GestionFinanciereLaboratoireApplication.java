package ma.uca.gfl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import ma.uca.gfl.entities.Responsable;
import ma.uca.gfl.entities.ResponsableAffaireFinanciere;
import ma.uca.gfl.entities.ResponsableMarche;
import ma.uca.gfl.enums.TypeResponsabilite;
import ma.uca.gfl.services.ResponsableService;

import java.util.Arrays;
import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class GestionFinanciereLaboratoireApplication {
	public static void main(String[] args) {
		SpringApplication.run(GestionFinanciereLaboratoireApplication.class, args);
	}

//	@Bean
	CommandLineRunner run(ResponsableService responsableService) {
		return args -> {
			Stream.of("Salah", "Soul", "Aya").forEach(name -> {
				Responsable responsable = new Responsable();
				responsable.setNom(name);
				responsable.setPrenom(name);
				responsable.setEmail(name + "@gmail.com");
				responsable.setDateNaissance(new Date());
				responsable.setTelephone("0645876534");
				responsable.setTypeResponsabilite(TypeResponsabilite.RAF);
				responsableService.saveResponsable(responsable);
			});
			responsableService.findAllResponsables().forEach(resp -> {

				if (resp.getTypeResponsabilite().equals(TypeResponsabilite.RAF))
					System.out.println("RAF: " + resp.getNom());
				else
					System.out.println("RM: " + resp.getNom());
			});
		};
	}

	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:3000", "http://localhost:4200"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Jwt-Token", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Jwt-Token",
				"Authorization", "Access-Control-Allow-Origin", "Access-Control-Allow-Origin",
				"Access-Control-Allow-Credentials", "Filename"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}
}
