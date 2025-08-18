import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter OS: ");
            String os = sc.nextLine();
            System.out.println("Enter Field: ");
            String fd = sc.nextLine();

            try {
                Field field = getField(OS.valueOf(os.trim().toUpperCase()), Fields.valueOf(fd.trim().toUpperCase()));
                field.render();
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Selecion!");
            }
            
        }
    }

    public static Field getField(OS os, Fields fields){
        GUIFactory factory;
        switch (os) {
            case WINDOWS:
                factory=new WindowsFactory();
                break;
            case MAC:
                factory=new MacFactory();
                break;
        
            default:
                throw new IllegalArgumentException("Enter Valid OS!");
        }
        
        Field field;
        switch (fields) {
            case BUTTON:
                field=factory.createButton();
                break;
            case CHECKBOX:
                field=factory.createCheckbox();
                break;
        
            default:
                throw new IllegalArgumentException("Enter Valid field!");
        }

        return field;

    }

}