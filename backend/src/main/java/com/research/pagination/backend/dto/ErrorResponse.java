package com.research.pagination.backend.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatusCode;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorResponse {
    String title;
    HttpStatusCode statusCode;
    String message;
    LocalDateTime timestamp;
}
