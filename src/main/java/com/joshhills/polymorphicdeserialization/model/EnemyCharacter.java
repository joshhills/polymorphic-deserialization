package com.joshhills.polymorphicdeserialization.model;

import javax.validation.constraints.NotNull;
import java.time.Instant;

/**
 * A hostile NPC
 */
public class EnemyCharacter extends Character {

    /**
     * The type of elemental an enemy can be
     */
    public enum ElementalType {
        FIRE,
        WATER,
        EARTH,
        AIR
    }

    /**
     * The type of elemental this enemy is
     */
    @NotNull
    final private ElementalType elementalType;

    /**
     * @param id            The unique ID of this entity
     * @param dateCreated   The time at which this entity was created
     * @param dateUpdated   The time at which this entity was last updated
     * @param name          The name of the character
     * @param maxHealth     The maximum number of health points
     * @param elementalType The type of elemental this enemy is
     */
    public EnemyCharacter(String id, Instant dateCreated, Instant dateUpdated, String name, int maxHealth, ElementalType elementalType) {
        super(id, dateCreated, dateUpdated, name, maxHealth);
        this.elementalType = elementalType;
    }

    public ElementalType getElementalType() {
        return elementalType;
    }
}
