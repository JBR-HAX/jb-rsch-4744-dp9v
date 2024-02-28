package org.jetbrains.assignment.models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class LocationsReqResp {
    @Embedded
    List<Move> request;

    @Embedded
    List<Coordinates> response;

    public List<Move> getRequest() {
        return request;
    }

    public void setRequest(List<Move> request) {
        this.request = request;
    }

    public List<Coordinates> getResponse() {
        return response;
    }

    public void setResponse(List<Coordinates> response) {
        this.response = response;
    }
}
