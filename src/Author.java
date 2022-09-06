public class Author {
    private String name;
    private String secondName;
    Author(String name, String secondName){
        this.name = name;
        this.secondName = secondName;
    }
    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public int hashCode() {
        return 33333;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public String toString() {
        return getName()+" "+getSecondName();
    }
}
