package com.museum.system.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "loan_contracts")
public class LoanContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToMany
    @JoinTable(
            name = "loan_contract_art_objects",
            joinColumns = @JoinColumn(name = "loan_contract_id"),
            inverseJoinColumns = @JoinColumn(name = "art_object_id")
    )
    private Set<ArtObject> artObjects;

    private LocalDate startDate;

    private LocalDate endDate;

    private String insurancePolicy;

    private String constraints;

    private String contractDetails;

}
