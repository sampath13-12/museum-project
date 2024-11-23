package com.museum.system.Repositories;

import com.museum.system.Entities.RestorationLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestorationLogRepository extends JpaRepository<RestorationLog, Long> {
}
