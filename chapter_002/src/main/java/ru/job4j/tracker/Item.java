package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {
    private final LocalDateTime created = LocalDateTime.now();
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
