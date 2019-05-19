package pl.gkaz;

import java.io.Serializable;

public class Tool implements Serializable {

    private int id;
    private String name;
    private ToolType type;
    private boolean available;

    public Tool() {
    }

    public Tool(int id, String name, ToolType status, boolean available) {
        this.id = id;
        this.name = name;
        this.type = status;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ToolType getStatus() {
        return type;
    }

    public void setStatus(ToolType status) {
        this.type = status;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public ToolType getType() {
        return type;
    }

    public void setType(ToolType type) {
        this.type = type;
    }
}
