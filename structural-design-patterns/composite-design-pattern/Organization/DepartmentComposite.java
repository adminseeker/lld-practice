import java.util.ArrayList;
import java.util.List;

public class DepartmentComposite implements Entity{
    private String departmentName;
    private List<Entity> entities;

    public DepartmentComposite(String name){
        this.departmentName=name;
        this.entities=new ArrayList<>();
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent+"Department: "+departmentName);
        for(Entity entity : entities){
            entity.showDetails(indent+"\t");
        }
        
    }

    @Override
    public double getTotalSalary() {
        double netSalary=0;
        for(Entity entity : entities){
            netSalary+=entity.getTotalSalary();
        }
        return netSalary;
    }

    public void addEntity(Entity entity){
        entities.add(entity);
    }

    public void removeEntity(Entity entity){
        entities.remove(entity);
    }

}
