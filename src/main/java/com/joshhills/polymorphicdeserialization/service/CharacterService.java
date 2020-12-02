package com.joshhills.polymorphicdeserialization.service;

import com.joshhills.polymorphicdeserialization.model.Character;

import java.util.Collection;

/**
 * A CRUD-like service to control the existence of {@link Character}s within this system
 */
public interface CharacterService {

    /**
     * Add a character to the system
     *
     * @param character The character to add to the system
     * @return The character that was added if it succeeded
     */
    Character createCharacter(Character character);

    /**
     * Get a character from the system by their ID
     *
     * @param id The unique ID of the character
     * @return The character matching that ID
     */
    Character getCharacter(String id);

    /**
     * Get all characters from the system
     *
     * @return A List of characters
     */
    Collection<Character> getCharacters();

    /**
     * Remove a character from the system
     *
     * @param id The ID of the character to remove
     * @return The character that was deleted
     */
    Character deleteCharacter(String id);

    /**
     * Update a character in the system
     *
     * @param character The updated character
     * @return The character that was updated
     */
    Character updateCharacter(Character character);
}
