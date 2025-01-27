package jee;

public enum Color {
    RED("red"), GREEN("green"), BLUE("blue");

    private String value;

    //constructor
    Color(String value) {
        this.value = value;
    }

    //getter
    public String getValue() {
        return value;
    }
}

