package com.masai.Exceptions;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MyErrorDetails {
    private LocalDateTime timeStamp;
    private String message;
    private String details;

}
