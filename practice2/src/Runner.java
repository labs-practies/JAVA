import com.company.Material;
import com.company.Subject;

public class Runner {
    public static void main(String[] args) {
        Material steel = new Material("steel" , 7850);
        Subject wire = new Subject("wire", steel, 0.03);
        wire.setMaterial(new Material("copper", 8500));

        System.out.println("After");
        System.out.println(wire.getMass());
        wire.setMaterial(steel);
        System.out.println("Changed");
        System.out.println(wire);
    }
}
