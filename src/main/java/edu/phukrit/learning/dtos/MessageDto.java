package edu.phukrit.learning.dtos;

import com.fasterxml.jackson.annotation.JsonAlias;

public class MessageDto {
    @JsonAlias("body")
    private String content;

    public MessageDto() {
    }

    public MessageDto(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
