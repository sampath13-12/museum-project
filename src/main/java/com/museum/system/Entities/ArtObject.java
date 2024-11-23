package com.museum.system.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "art_objects")
public class ArtObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ElementCollection
    @CollectionTable(name = "art_object_renderings", joinColumns = @JoinColumn(name = "art_object_id"))
    @Column(name = "rendering_url")
    private List<String> renderings; // URLs to text, video, audio

    private String condition;

    @Enumerated(EnumType.STRING)
    private Status status; // ON_DISPLAY, IN_WAREHOUSE, ON_LOAN, IN_RESTORATION

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    private String period;

    private String areaOfOrigin;

    private String form;

    private String material;

    private String securityLevel;

    private Double appraisalValue;

    private String insuranceDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "acquisition_record_id", referencedColumnName = "id")
    private AcquisitionRecord acquisitionRecord;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "disposal_record_id", referencedColumnName = "id")
    private DisposalRecord disposalRecord;
}