package com.jm.data.controllers;

import com.jm.data.ProjectAccessor;
import com.jm.data.TeamProjectAccessor;
import com.jm.data.TeamsAccessor;
import com.jm.data.beans.Project;
import com.jm.data.beans.Team;
import com.jm.data.beans.TeamProject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class DataController {

    @RequestMapping(value = "/getTeam", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Team> getTeams(@RequestParam(value = "all", defaultValue = "") String all) {
        List<Team> list = new TeamsAccessor().getTeams();
        return list;

    }

    @RequestMapping(value = "/getProjects", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Project> getProjects(@RequestParam(value = "all", defaultValue = "") String all) {
        List<Project> list = new ProjectAccessor().getProjects();
        return list;

    }

    @RequestMapping(value = "/getTeamProjects", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TeamProject> getTeamProjects(@RequestParam(value = "all", defaultValue = "") String all) {
        List<TeamProject> list = new TeamProjectAccessor().getTeamProject();
        return list;

    }


}
