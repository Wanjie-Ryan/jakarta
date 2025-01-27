import jee.Color;

public class Main {
    public static void main(String[] args) {

        Color color = Color.RED;

        System.out.println("red enum name " + color.name());
        System.out.println("red enum value " + color.getValue());

        // iterating over the enums
        for(Color c: Color.values()){
            System.out.println("Enum color value: " + c.getValue());
        }

    }
}
