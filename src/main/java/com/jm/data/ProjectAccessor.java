package com.jm.data;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.jm.data.beans.Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProjectAccessor {

    public List<Project> getProjects() {
        List<Project> projects = new ArrayList<>();
        try (Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
             Session session = cluster.connect("dev")) {
            ResultSet results = session.execute("SELECT \"PRJ\", \"DevManager\", \"ProjectName\", \"ProjectManager\", \"Budget\" FROM \"Projects\"");
            for (Row row : results) {
                projects.add(new Project(row.getString("PRJ"), row.getString("DevManager"),
                        row.getString("ProjectName"), row.getString("ProjectManager"), row.getLong("budget")));
            }
        }

        Collections.sort(projects, (p1, p2) -> p1.getPRJ().compareTo(p2.getPRJ()));
        return projects;
    }
}
