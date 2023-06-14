package ma.uca.gfl.services;

import ma.uca.gfl.entities.Laboratoire;
import ma.uca.gfl.entities.Membre;
import ma.uca.gfl.repositories.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MembreService {
	private final MembreRepository membreRepository;

	@Autowired
	public MembreService(MembreRepository membreRepository) {
		this.membreRepository = membreRepository;
	}

	public Membre addMembre(Membre membre) {
		return membreRepository.save(membre);
	}

	public List<Membre> findAllMembres() {
		return membreRepository.findAll();
	}

	public List<Membre> findAllByLaboratoire(Long id) {
		return membreRepository.findAllByLaboratoire(id);
	}

	public double getDotationMembre(Long id) {
		return membreRepository.getDotationMembre(id);
	}

	public List<Membre> findAllDirecteurs() {
		return membreRepository.findAllByDirecteurIsTrue();
	}

	public Membre updateMembre(Membre membre) {
		return membreRepository.save(membre);
	}

	public Membre findMembreById(Long id) {
		return membreRepository.findMembreById(id).orElseThrow();
	}

	@Transactional
	public void deleteMembre(Long id) {
		membreRepository.deleteMembreById(id);
	}
}
