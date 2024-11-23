package com.museum.system.Repositories;

import com.museum.system.Entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILocationRepository extends JpaRepository<Location, Long> {
}
