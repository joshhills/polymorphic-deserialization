package com.joshhills.polymorphicdeserialization.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;
import java.util.Map;

/**
 * A subtype of {@link Character} for the player
 */
public class PlayerCharacter extends Character {

    /**
     * The player's inventory
     */
    private final Map<@NotEmpty String, @Min(0) @Max(10) Integer> inventory;

    /**
     * @param id          The unique ID of this entity
     * @param dateCreated The time at which this entity was created
     * @param dateUpdated The time at which this entity was last updated
     * @param name        The name of the character
     * @param maxHealth   The maximum number of health points
     * @param inventory   The player's inventory
     */
    public PlayerCharacter(String id, Instant dateCreated, Instant dateUpdated, String name, int maxHealth, Map<String, Integer> inventory) {
        super(id, dateCreated, dateUpdated, name, maxHealth);
        this.inventory = inventory;
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }
}
