package me.luppolem.streamapp.lesson3.services;

import java.util.Collection;

public interface TeamService {

    String add(String teamName);

    String find(String teamName);

    String remove(String teamName);

    String findTeamsAsString();

    Collection<String> findTeams();

    Collection<String> findTeamsByPrefix(String prefix);


    Collection<String> removeAll();
}
