package com.masai.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
    private Integer userId;
    private String name;
    @Column(unique=true)
    private String email;
    private List<Rating> ratings;
}
