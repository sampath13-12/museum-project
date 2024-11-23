package com.museum.system.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate eventDate;

    @ManyToMany
    @JoinTable(
            name = "event_collections",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "art_object_id")
    )
    private Set<ArtObject> associatedCollections;

    @ManyToMany
    @JoinTable(
            name = "event_display_areas",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "display_area_id")
    )
    private Set<DisplayArea> displayAreas;

}
