package com.codestates.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

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

    @Getter
    @Setter
    public static class Patch {
        // patch 부분의 엄격한 유효성 검증은 과제로 두고 여기서는 간단하게 optional 하게만 적용하였음.

        @Positive
        private long todoId;

        private String title;

        private Integer todoOrder;

        private Boolean completed;
    }

    @Setter
    public static class Response {
        private long id;

        private String title;

        private int todoOrder;

        private boolean completed;
    }
}
