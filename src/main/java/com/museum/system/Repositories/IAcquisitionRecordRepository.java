package com.museum.system.Repositories;

import com.museum.system.Entities.AcquisitionRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAcquisitionRecordRepository extends JpaRepository<AcquisitionRecord, Long> {
}
