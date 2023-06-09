package com.example.finalproject12be.domain.comment.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@NoArgsConstructor
public class CommentRequestDto {

    @NotBlank
    @Size(max = 100)
    private String contents;

    private boolean foreign;

    public CommentRequestDto(String contents, boolean foreign) {
        this.contents = contents;
        this.foreign = foreign;
    }
}