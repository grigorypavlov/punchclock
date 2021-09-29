package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.WorkLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WorkLocationRepository extends JpaRepository<WorkLocation, Long>, JpaSpecificationExecutor<WorkLocation> {
}