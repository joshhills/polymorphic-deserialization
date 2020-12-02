package com.joshhills.polymorphicdeserialization.service;

import com.joshhills.polymorphicdeserialization.model.EnemyCharacter;
import com.joshhills.polymorphicdeserialization.model.Character;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple implementation of {@link CharacterService} that stores created objects in-memory
 *
 * TODO: Service-layer error handling should happen here - semantics like duplicate keys, which can be
 * caught by the {@link org.springframework.web.bind.annotation.RestControllerAdvice} and handled
 * in respect to the client
 */
@Service
public class InMemoryCharacterService implements CharacterService {

    /**
     * Store a mapping of {@link Character} IDs to their objects in-memory
     */
    private final Map<String, Character> characters = new HashMap<>();

    public InMemoryCharacterService() {
        final Instant now = Instant.now();
        characters.put("1", new EnemyCharacter("1", now, now, "Fire Goober", 10, EnemyCharacter.ElementalType.FIRE));
    }

    @Override
    public Character createCharacter(Character character) throws RuntimeException {
        characters.put(character.getId(), character);
        return characters.get(character.getId());
    }

    @Override
    public Character getCharacter(String id) {
        return characters.get(id);
    }

    @Override
    public Collection<Character> getCharacters() {
        return characters.values();
    }

    @Override
    public Character deleteCharacter(String id) {
        return characters.remove(id);
    }

    @Override
    public Character updateCharacter(Character character) {
        characters.put(character.getId(), character);
        return characters.get(character.getId());
    }
}
