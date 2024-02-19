package com.example.renzo_cueva_practica2.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
public class ResponseBase {
    private Boolean status;
    private int code;
    private String message;
    Optional data;
}
