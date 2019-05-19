package pl.gkaz.service;

import pl.gkaz.dao.ToolDao;
import pl.gkaz.dao.ToolDaoImpl;
import pl.gkaz.model.Tool;
import pl.gkaz.model.ToolType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ToolService {

    private ToolDao toolDao = new ToolDaoImpl();

    public List<Tool> getTools(){
        return toolDao.getAllTools();
    }

    public Optional<Tool> getTool(Long id){
        return toolDao.getAllTools().stream().filter(tool -> tool.getId().equals(id)).findAny();
    }

    public void takeTool(Long id){
        setAvailability(id, false);
    }

    public void returnTool(Long id){
        setAvailability(id, true);
    }

    private List<Tool> setAvailability(Long id, boolean isAvailable){
        toolDao.setAvailability(id, isAvailable);

        return getTools();
    }
}
