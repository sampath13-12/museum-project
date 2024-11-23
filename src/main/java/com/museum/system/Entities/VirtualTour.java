package com.museum.system.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "virtual_tours")
public class VirtualTour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String theme;

    @ManyToMany
    @JoinTable(
            name = "virtual_tour_art_objects",
            joinColumns = @JoinColumn(name = "virtual_tour_id"),
            inverseJoinColumns = @JoinColumn(name = "art_object_id")
    )
    private Set<ArtObject> objectsIncluded;

    private String renderingsType; // IMAGE, TEXT, VOICE, VIDEO

    private String language;

    private String contractType;

}
