package com.jm.data;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.jm.data.beans.Team;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class TeamsAccessor {

    public List<Team> getTeams() {
        List<Team> teams = new ArrayList<>();
        try (Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
             Session session = cluster.connect("dev")) {
            ResultSet results = session.execute("SELECT * FROM \"Team\"");
            for (Row row : results) {
                teams.add(new Team(row.getString("TeamName"), row.getInt("Members")));
            }
        }

        return teams;
    }

    public void insertTeams(List<Team> list) {
        try (Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
             Session session = cluster.connect("dev")) {
            for (Team team : list) {
                String insert = "INSERT INTO \"Team\" (name, members) VALUES (''{0}'', {1}) ";
                session.execute(MessageFormat.format(insert, team.getName(), team.getMembers()));
            }
        }
    }

    public void deleteTeams(List<Team> list) {
        try (Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
             Session session = cluster.connect("dev")) {
            for (Team team : list) {
                String delete = "DELETE FROM \"Team\" WHERE name = ''{0}'' ";
                session.execute(MessageFormat.format(delete, team.getName()));
            }
        }
    }
}
