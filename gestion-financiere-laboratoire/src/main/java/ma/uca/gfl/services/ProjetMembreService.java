package ma.uca.gfl.services;

import ma.uca.gfl.entities.ProjetMembre;
import ma.uca.gfl.repositories.ProjetMembreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjetMembreService {

	private final ProjetMembreRepository projetMembreRepository;

	@Autowired
	public ProjetMembreService(ProjetMembreRepository projetMembreRepository) {
		this.projetMembreRepository = projetMembreRepository;
	}

	public ProjetMembre addProjetMembre(ProjetMembre ProjetMembre) {
		return projetMembreRepository.save(ProjetMembre);
	}

	public List<ProjetMembre> findAllProjetMembres() {
		return projetMembreRepository.findAll();
	}

	public ProjetMembre updateProjetMembre(ProjetMembre ProjetMembre) {
		return projetMembreRepository.save(ProjetMembre);
	}

	public ProjetMembre findProjetMembreById(Long id) {
		return projetMembreRepository.findProjetMembreById(id).orElseThrow();
	}

	@Transactional
	public void deleteProjetMembre(Long id) {
		projetMembreRepository.deleteProjetMembreById(id);
	}
}
