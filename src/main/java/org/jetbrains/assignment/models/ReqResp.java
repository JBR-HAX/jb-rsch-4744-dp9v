package org.jetbrains.assignment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class ReqResp {

    @Id
    @GeneratedValue
    private long id;

    private String request;

    private String response;

    private String url;

    public ReqResp(String request, String response, String url) {
        this.request = request;
        this.response = response;
        this.url = url;
    }

    public ReqResp() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
