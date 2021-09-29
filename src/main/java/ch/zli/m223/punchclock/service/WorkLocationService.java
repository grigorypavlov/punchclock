package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.WorkLocation;
import ch.zli.m223.punchclock.repository.WorkLocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkLocationService {
    private final WorkLocationRepository workLocationRepository;
    public WorkLocation createWorkLocation;

    public WorkLocationService(WorkLocationRepository workLocationRepository) {
        this.workLocationRepository = workLocationRepository;
    }

    public List<WorkLocation> findAll() {
        return workLocationRepository.findAll();
    }

    public WorkLocation createWorkLocation(WorkLocation workLocation) {
        return workLocationRepository.saveAndFlush(workLocation);
    }

    public void deleteWorkLocation(long id) {
        workLocationRepository.deleteById(id);
    }

    public WorkLocation updateLocation(WorkLocation workLocation) {
        return workLocationRepository.save(workLocation);
    }
}
