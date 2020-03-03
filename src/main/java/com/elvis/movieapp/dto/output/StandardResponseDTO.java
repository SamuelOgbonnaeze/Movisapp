package com.elvis.movieapp.dto.output;

import com.elvis.movieapp.dto.enums.Status;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class StandardResponseDTO implements Serializable {
    @JsonProperty
    protected Status status;

    public StandardResponseDTO() {
    }

    StandardResponseDTO(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}