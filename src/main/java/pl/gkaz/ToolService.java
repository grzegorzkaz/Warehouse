package pl.gkaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ToolService {

    private List<Tool> tools;

    public ToolService() {
        tools = new ArrayList<>();
        tools.add(new Tool(1, "Czerwony młotek" , ToolType.HAMMER, true));
        tools.add(new Tool(2, "Niebieski młotek", ToolType.HAMMER, true));
        tools.add(new Tool(3, "Stara piła", ToolType.SAW, true));
        tools.add(new Tool(4, "Śrubokręt od kamaza", ToolType.SCREWDRIVER, false));
        tools.add(new Tool(5, "Soniczny śrubokręt", ToolType.SCREWDRIVER, true));
    }

    public List<Tool> getTools(){
        return tools;
    }

    public void takeTool(int id){
        setAvailability(id, false);
    }

    public void returnTool(int id){
        setAvailability(id, true);
    }

    private void setAvailability(int id, boolean isAvailable){
        getTool(id).ifPresent(tool -> tool.setAvailable(isAvailable));
    }

    public Optional<Tool> getTool(int id){
        return tools.stream().filter(tool -> tool.getId() == id).findAny();
    }
}
