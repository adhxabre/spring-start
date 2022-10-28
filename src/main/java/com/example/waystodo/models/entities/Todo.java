package com.example.waystodo.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_todo")
public class Todo implements Serializable {

    @Id
    @Column(unique = true)
    private String title;
    private String content;

    public Todo() {}

    public Todo(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void SetContent(String content) {
        this.content = content;
    }

}
