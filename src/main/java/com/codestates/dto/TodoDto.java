package com.codestates.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

public class TodoDto {

    @Getter
    public static class Post {
        @NotBlank
        private String title;

        @NotBlank
        private int todoOrder;

        @NotBlank
        private boolean completed;
    }
}
