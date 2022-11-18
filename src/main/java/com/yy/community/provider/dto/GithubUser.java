package com.yy.community.provider.dto;

import lombok.Data;


@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}