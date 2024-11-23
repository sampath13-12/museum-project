package com.museum.system.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "admissions")
public class Admission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TicketType ticketType; // SINGLE, SEASON, SPECIAL_EVENT

    private LocalDate saleDate;

    @ManyToOne
    @JoinColumn(name = "patron_id")
    private Patron patron;

}
