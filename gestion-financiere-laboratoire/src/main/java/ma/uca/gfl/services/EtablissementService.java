package ma.uca.gfl.services;

import ma.uca.gfl.entities.Etablissement;
import ma.uca.gfl.repositories.EtablissementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EtablissementService {
	
	private EtablissementRepository etablissementRepository;

	@Autowired
	public EtablissementService(EtablissementRepository etablissementRepository) {
		this.etablissementRepository = etablissementRepository;
	}

	public Etablissement addEtablissement(Etablissement etablissement) {
		return etablissementRepository.save(etablissement);
	}

	public List<Etablissement> findAllEtablissements() {
		return etablissementRepository.findAll();
	}
	
	public Page<Etablissement> getEtablissements(Pageable pageable) {
        return etablissementRepository.findAll(pageable);
    }

	public Etablissement updateEtablissement(Etablissement etablissement) {
		return etablissementRepository.save(etablissement);
	}

	public Etablissement findEtablissementById(Long id) {
		return etablissementRepository.findEtablissementById(id).orElseThrow();
	}

	@Transactional
	public void deleteEtalissement(Long id) {
		boolean etablissement = etablissementRepository.findEtablissementById(id).isPresent();
		if (etablissement) {
			etablissementRepository.deleteEtablissementById(id);
		}
	}
}
