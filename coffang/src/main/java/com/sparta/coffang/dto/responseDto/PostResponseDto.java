package com.sparta.coffang.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class PostResponseDto {
    private String title;

    private String content;

    private String category;

    private String img;

    private String nickname;

    private String userImg;

    private int view;

    private int totalComment;

    private int totalLove;

    private boolean loveCheck;

    private boolean Bookmark;
}
