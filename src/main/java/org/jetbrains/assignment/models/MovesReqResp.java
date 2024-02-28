package org.jetbrains.assignment.models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class MovesReqResp {
    @Embedded
    List<Coordinates> request;

    @Embedded
    List<Move> response;

    public List<Coordinates> getRequest() {
        return request;
    }

    public void setRequest(List<Coordinates> request) {
        this.request = request;
    }

    public List<Move> getResponse() {
        return response;
    }

    public void setResponse(List<Move> response) {
        this.response = response;
    }
}
