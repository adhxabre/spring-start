package com.waystalk.demo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Todo {
    
    private final UUID id;
    private final String title;

    public Todo(@JsonProperty("id") UUID id,
                @JsonProperty("title") String title) {
        this.id = id;
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}
