package com.example.nytimes;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AkosTimesController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    ArrayList<String> des_facet = new ArrayList<>(){{
        add(new String("Collectors and Collections"));
    }};
    ArrayList<String> org_facet = new ArrayList<>(){{
        add(new String("Academy Museum of Motion Pictures"));
    }};
    ArrayList<String> per_facet = new ArrayList<>(){{
        add(new String("Reynolds, Debbie"));
    }};
    ArrayList<String> geo_facet = new ArrayList<>(){{
        add(new String());
    }};
    ArrayList<Multimedia> multimedia = new ArrayList<>(){{
        add(new Multimedia("https://static01.nyt.com/images/2020/11/17/arts/16debbie1/merlin_178877478_6315376c-10c6-4808-99d4-899c3e76c3ad-superJumbo.jpg", "superJumbo", 1536, 2048, "image", "photo", "“My mother was one of the most forgiving people ever,” said Todd Fisher, Debbie Reynolds’s son, who inherited the remaining part of her collection. “She would never want me to hold a grudge.”", "Roger Kisby for The New York Times"));
    }};
    ArrayList<Results> results = new ArrayList<>(){{
        add(new Results("movies", "", "Academy Museum Gives Debbie Reynolds Her Due as a Costume Conservator", "When the “Singin’ in the Rain” actress was alive, the film academy turned up its nose at her fabled costume collection. Now it has gone to her son with hat in hand.", "https://www.nytimes.com/2020/11/16/movies/academy-museum-debbie-reynolds-costumes.html", "nyt://article/7076608f-0ab6-5b6a-86ad-22ca51e11fc8", "By Brooks Barnes", "Article", "2020-11-16T14:58:33-05:00", "2020-11-16T13:26:14-05:00", "2020-11-16T13:26:14-05:00", "", "", multimedia, "https://nyti.ms/2H5t74v"));
    }};

    @GetMapping("/Home")
    public AkosTimes greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new AkosTimes("active", "AkosTimes", "Top Hits & More","11.11.2020 @ 15:10", 16, results);
    }
}
