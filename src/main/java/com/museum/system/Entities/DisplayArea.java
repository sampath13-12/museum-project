package com.museum.system.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "display_areas")
public class DisplayArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String type;

    private String securityLevel;

    @OneToMany(mappedBy = "parentDisplayArea")
    private Set<DisplayArea> subAreas;

    @ManyToOne
    @JoinColumn(name = "parent_display_area_id")
    private DisplayArea parentDisplayArea;
}
