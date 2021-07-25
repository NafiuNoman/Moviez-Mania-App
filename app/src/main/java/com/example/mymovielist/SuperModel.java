package com.example.mymovielist;

import java.util.List;

public class SuperModel {

    private int page;
    private int total_pages;

    private List<InsideModel> results ;

    public SuperModel() {
    }

    public SuperModel(int page, int total_pages, List<InsideModel> results) {
        this.page = page;
        this.total_pages = total_pages;
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<InsideModel> getResults() {
        return results;
    }

    public void setResults(List<InsideModel> results) {
        this.results = results;
    }
}
