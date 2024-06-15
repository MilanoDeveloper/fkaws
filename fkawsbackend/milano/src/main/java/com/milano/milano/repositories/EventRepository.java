package com.milano.milano.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milano.milano.domain.event.Event;

public interface EventRepository  extends JpaRepository<Event, UUID>{
    
}
