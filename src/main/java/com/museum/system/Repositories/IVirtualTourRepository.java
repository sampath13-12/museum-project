package com.museum.system.Repositories;

import com.museum.system.Entities.VirtualTour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVirtualTourRepository extends JpaRepository<VirtualTour, Long> {
}
