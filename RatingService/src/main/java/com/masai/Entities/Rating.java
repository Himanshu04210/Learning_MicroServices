package com.masai.Entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="RATINGS")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ratingId;
    private String userEmail;
    private Integer hotelId;
    private Integer rating;
    private String feedback;
}
