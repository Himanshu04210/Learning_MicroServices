package com.masai.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "HOTELS")
public class Hotels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer hotelId;
    private String hotelName;
    private String hotelStaff;
    private String about;
}
