package com.museum.system.Repositories;

import com.museum.system.Entities.Admission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdmissionRepository extends JpaRepository<Admission, Long> {
}
