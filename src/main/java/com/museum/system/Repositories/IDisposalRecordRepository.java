package com.museum.system.Repositories;

import com.museum.system.Entities.DisposalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDisposalRecordRepository extends JpaRepository<DisposalRecord, Long> {
}
