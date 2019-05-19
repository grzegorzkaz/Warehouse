package pl.gkaz.dao;

import pl.gkaz.model.Tool;

import java.util.List;

public interface ToolDao {

    List<Tool> getAllTools();

    void setAvailability(Long id, boolean availability);
}
