package com.masai.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rating {
	
	private Integer ratingId;
	private String UserId;
	private Integer hotelId;
	private Integer rating;
	private String feedback;
}

