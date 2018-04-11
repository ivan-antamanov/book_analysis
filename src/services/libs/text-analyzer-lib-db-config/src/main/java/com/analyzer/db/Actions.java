package com.analyzer.db;

public enum Actions {
    ADD("Add"),
    UPDATE("Update"),
    DELETE("Delete"),
    RETRIEVE("Retrieve"),;

    private String action;

    Actions(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

}
