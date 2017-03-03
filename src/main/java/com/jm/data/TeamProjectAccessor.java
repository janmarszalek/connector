package com.jm.data;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.extras.codecs.jdk8.LocalDateCodec;
import com.jm.data.beans.TeamProject;

import java.util.ArrayList;
import java.util.List;

public class TeamProjectAccessor {

    public List<TeamProject> getTeamProject() {
        List<TeamProject> projects = new ArrayList<>();
        try (Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
             Session session = cluster.connect("dev")) {
            cluster.getConfiguration().getCodecRegistry().register(LocalDateCodec.instance);
            ResultSet results = session.execute("SELECT \"PRJ\", \"TeamName\", \"Start\", \"End\", \"TargetRelease\" FROM \"TeamProject\"");
            for (Row row : results) {
                projects.add(new TeamProject(row.getString("PRJ"), row.getString("TeamName"),
                        row.getTimestamp("Start"), row.getTimestamp("End"), row.getString("TargetRelease")));
            }
        }

//        Collections.sort(projects, (p1, p2) -> p1.getStartDate().compareTo(p2.getStartDate()));
        return projects;
    }
}
