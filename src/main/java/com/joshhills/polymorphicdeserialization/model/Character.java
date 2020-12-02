package com.joshhills.polymorphicdeserialization.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

/**
 * A game character
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
@JsonSubTypes({
        @Type(value = PlayerCharacter.class),
        @Type(value = EnemyCharacter.class)
})
public class Character extends Entity {

    /**
     * The name of the character
     */
    @NotEmpty
    @Length(max = 10, min = 3)
    private String name;

    /**
     * The maximum number of health points
     */
    @Min(1)
    @Max(100)
    private final int maxHealth;

    /**
     * @param id The unique ID of this entity
     * @param dateCreated The time at which this entity was created
     * @param dateUpdated The time at which this entity was last updated
     * @param name The name of the character
     * @param maxHealth The maximum number of health points
     */
    public Character(String id, Instant dateCreated, Instant dateUpdated, String name, int maxHealth) {
        super(id, dateCreated, dateUpdated);
        this.name = name;
        this.maxHealth = maxHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
}
