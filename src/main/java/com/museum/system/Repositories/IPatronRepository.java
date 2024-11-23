package com.museum.system.Repositories;

import com.museum.system.Entities.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatronRepository extends JpaRepository<Patron, Long> {
}
