package com.jm.data;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class DataController {

    @RequestMapping(value = "/getTeam", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Team> getData(@RequestParam(value = "all", defaultValue = "") String all) {
//        List<Team> list = new FileHandler().readFromFile();
        List<Team> list = new DatabaseAccessor().getTeams();
        return list;

    }
}
