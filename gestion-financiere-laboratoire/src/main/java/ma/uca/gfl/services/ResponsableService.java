package ma.uca.gfl.services;

import ma.uca.gfl.entities.Responsable;
import ma.uca.gfl.repositories.ResponsableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ResponsableService {
	private final ResponsableRepository responsableRepository;

    @Autowired
	public ResponsableService(ResponsableRepository responsableRepository) {
		this.responsableRepository = responsableRepository;
	}

	public Responsable saveResponsable(Responsable responsable) {
		return responsableRepository.save(responsable);
	}

	public List<Responsable> findAllResponsables() {
		return responsableRepository.findAll();
	}

	public Responsable findResponsableById(Long id) {
		return responsableRepository.findResponsableById(id).orElse(null);
	}

	@Transactional
	public void deleteResponsable(Long id) {
		responsableRepository.deleteResponsableById(id);
	}
}
