package com.joshhills.polymorphicdeserialization.model;

import java.time.Instant;

/**
 * An entity of this system
 */
public class Entity {

    /**
     * The unique ID of this entity
     */
    private final String id;

    /**
     * The time at which this entity was created
     */
    private final Instant dateCreated;

    /**
     * The time at which this entity was last updated
     */
    private Instant dateUpdated;

    /**
     * @param id The unique ID of this entity
     * @param dateCreated The time at which this entity was created
     * @param dateUpdated The time at which this entity was last updated
     */
    public Entity(String id, Instant dateCreated, Instant dateUpdated) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public String getId() {
        return id;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public Instant getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Instant dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
