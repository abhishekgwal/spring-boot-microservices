package com.microservices.movieinfoservice.model;

public class MovieSummary {

    private String id;
    private String title;
    private String overview;
    private String tagline;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getOverview() { return overview; }

    public void setOverview(String overview) { this.overview = overview; }

    public String getTagline() { return tagline; }

    public void setTagline(String tagline) { this.tagline = tagline; }
}
