package ma.uca.gfl;

import java.util.Arrays;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import ma.uca.gfl.entities.Etablissement;
import ma.uca.gfl.entities.Laboratoire;
import ma.uca.gfl.entities.Membre;
import ma.uca.gfl.entities.Responsable;
import ma.uca.gfl.enums.TypeResponsabilite;
import ma.uca.gfl.repositories.MembreRepository;
import ma.uca.gfl.services.EtablissementService;
import ma.uca.gfl.services.LaboratoireService;
import ma.uca.gfl.services.MembreService;
import ma.uca.gfl.services.ResponsableService;

@SpringBootApplication
public class GestionFinanciereLaboratoireApplication {
	public static void main(String[] args) {
		SpringApplication.run(GestionFinanciereLaboratoireApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ResponsableService responsableService, EtablissementService etablissementService,
			LaboratoireService laboratoireService, MembreService membreService, MembreRepository membreRepository) {
		return args -> {

//			System.out.println(membreRepository.getDotationMembre(1L));
//			Stream.of("FSSM", "FST", "ENSA").forEach(etab -> {
//
//				Etablissement etablissement = new Etablissement();
//				etablissement.setIntitule(etab);
//				etablissement.setAdresse("Adresse " + etab.toLowerCase());
//				etablissementService.addEtablissement(etablissement);
//			});

//			Stream.of("Lab Info", "Lab Ch", "Lab Pc", "Lab Elec").forEach(lab -> {
//				Laboratoire laboratoire = new Laboratoire();
//				laboratoire.setIntitule(lab);
//				laboratoire.setDepartement("Physique");
//				laboratoire.setEtablissement(etablissementService.findEtablissementById(1L));
//				laboratoireService.addLaboratoire(laboratoire);
//			});

//			Stream.of("Membre1", "Soul", "Yasmine", "Oussama", "Ahmed").forEach(memb -> {
//				Membre membre = new Membre();
//				Laboratoire lab = laboratoireService.findLaboratoireById(1L);
//				membre.setLaboratoire(lab);
//				membre.setNom("Al " + memb);
//				membre.setPrenom(memb);
//				membre.setEmail(memb + "@gmail.com");
//				membre.setPassword("123");
//				membre.setDateNaissance(new Date());
//				membre.setTelephone("061223345");
//				membreService.addMembre(membre);
//			});

//			Stream.of("Salah", "Soul", "Aya").forEach(name -> {
//				Responsable responsable = new Responsable();
//				responsable.setNom(name);
//				responsable.setPrenom(name);
//				responsable.setEmail(name + "@gmail.com");
//				responsable.setDateNaissance(new Date());
//				responsable.setTelephone("0645876534");
//				responsable.setTypeResponsabilite(TypeResponsabilite.RAF);
//				responsableService.saveResponsable(responsable);
//			});
//			responsableService.findAllResponsables().forEach(resp -> {
//
//				if (resp.getTypeResponsabilite().equals(TypeResponsabilite.RAF))
//					System.out.println("RAF: " + resp.getNom());
//				else
//					System.out.println("RM: " + resp.getNom());
//			});
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
