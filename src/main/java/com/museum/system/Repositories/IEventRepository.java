package com.museum.system.Repositories;

import com.museum.system.Entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEventRepository extends JpaRepository<Event, Long> {
}
