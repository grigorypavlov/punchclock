package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Overtime;
import ch.zli.m223.punchclock.repository.OvertimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OvertimeService {
    public OvertimeRepository overtimeRepository;

    public OvertimeService(OvertimeRepository overtimeRepository) {
        this.overtimeRepository = overtimeRepository;
    }

    public List<Overtime> findAll() {
        return overtimeRepository.findAll();
    }

    public void deleteOvertime(long id) {
        overtimeRepository.deleteById(id);
    }

    public Overtime updateOvertime(Overtime overtime) {
        return overtimeRepository.save(overtime);
    }

    public Overtime createOvertime(Overtime overtime) {
        return overtimeRepository.saveAndFlush(overtime);
    }
}
