package com.mgen256.al;

import net.minecraft.util.IStringSerializable;

public enum FireTypes implements IStringSerializable {
    NORMAL("normal"),
    SOUL("soul");

    private final String name;

    private FireTypes(String name) {
       this.name = name;
    }
 
    public String toString() {
       return this.getString();
    }
 
    public String getString() {
       return this.name;
    }
}