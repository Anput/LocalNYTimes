package com.example.nytimes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AkosTimes {
    private final String status;
    private final String copyright;
    private final String section;
    private final String last_updated;
    private final int num_results;
    private ArrayList<Results> results;

    public AkosTimes(String status, String copyright, String section, String last_updated, int num_results, ArrayList<Results> results) {
        this.status = status;
        this.copyright = copyright;
        this.section = section;
        this.last_updated = last_updated;
        this.num_results = num_results;
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getSection() {
        return section;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public int getNum_results() {
        return num_results;
    }

    public ArrayList<Results> getResults() {
        return results;
    }
}

