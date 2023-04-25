package me.luppolem.streamapp.lesson3.repository;

import me.luppolem.streamapp.lesson3.exception.TeamExistException;
import me.luppolem.streamapp.lesson3.exception.TeamNotExistException;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@Repository
public class TeamRepositoryImpl implements TeamRepository {
    private final Set<String> teams = new HashSet<>();

    @Override
    public String add(String teamName) {
        if (teams.contains(teamName)) {
            throw new TeamExistException();
        }
        teams.add(teamName);
        return teamName;
    }

    @Override
    public String remove(String teamName) {
        if (teams.contains(teamName)) {
            teams.remove(teamName);
            return teamName;
        }
        throw new TeamNotExistException();
    }

    @Override
    public String find(String teamName) {
        if (!teams.contains(teamName)) {
            throw new TeamNotExistException();
        }
        return teamName;
    }

    @Override
    public Collection<String> findAll() {
        return Collections.unmodifiableSet(teams);
    }

    @Override
    public Collection<String> removeAll() {
        Collection<String> result = Collections.unmodifiableSet(teams);
        teams.clear();
        return result;
    }

}
