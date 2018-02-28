package com.psl.integrador.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.psl.integrador.model.enums.Expertise;
import org.hibernate.validator.constraints.NotEmpty;

import java.time.LocalDateTime;

public class Detail {

    @NotEmpty(message = "Topic cannot be empty")
    private Topic topic;

    @NotEmpty(message = "Expertise cannot be empty")
    private Expertise expertise;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime createdAt;

    public Detail() {
        super();
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Expertise getExpertise() {
        return expertise;
    }

    public void setExpertise(Expertise expertise) {
        this.expertise = expertise;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
