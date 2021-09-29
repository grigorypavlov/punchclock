package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.Overtime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OvertimeRepository extends JpaRepository<Overtime, Long>, JpaSpecificationExecutor<Overtime> {
}