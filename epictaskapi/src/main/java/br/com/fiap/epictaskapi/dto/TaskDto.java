package br.com.fiap.epictaskapi.dto;

public record TaskDto(
        String title,
        String description,
        Integer score,
        Integer status) {}
