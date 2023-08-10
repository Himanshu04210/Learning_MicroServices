package com.masai.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "USERS")
public class Users {
    @Id
    private Integer userId;
    private String name;
    @Column(unique=true)
    private String email;

    @Transient
    private List<Rating> ratings;
}
