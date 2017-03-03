package com.jm.data;

import com.jm.data.beans.Team;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    public List<Team> readFromFile() {
        List<Team> data = new ArrayList<Team>();

        try (BufferedReader br = new BufferedReader(new FileReader(getClass().getClassLoader().getResource("resources/data.csv").getFile()))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.add(parseTeam(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public Team parseTeam(String line) {
        String[] lines = line.split(",");
        return new Team(lines[0], Integer.valueOf(lines[1]));
    }
}
