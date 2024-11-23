package com.museum.system.Repositories;

import com.museum.system.Entities.ArtObject;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IArtObjectRepository extends JpaRepository<ArtObject, Long> {

}
