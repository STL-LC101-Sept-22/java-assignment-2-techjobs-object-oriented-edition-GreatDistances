package org.launchcode.techjobs.oo;

public class PositionType extends JobField {

    /*
    private int id;
    private static int nextId = 1;
    private String value;


    public PositionType() {
        id = nextId;
        nextId++;
    }


    public PositionType(String value) {
        this();
        this.value = value;
    }
    */

    public PositionType(String value) {
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    // MW - initially done 23/01/27, 11:55a

    /*
    @Override
    public String toString() {
        return value;
    }
    */

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
    // MW auto-generated 23/01/27, 12:09 pm.  May need to rewrite equals()


    /*@Override
    public boolean equals(Object o) {

        // AUTO GENERATED EQUALS() START
        // if (this == o) return true;
        // if (o == null || getClass() != o.getClass()) return false;

        PositionType that = (PositionType) o;

        if (id != that.id) return false;
        return Objects.equals(value, that.value);
        // AUTO GENERATED EQUALS() END
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }*/

    // Getters and Setters:

    /*
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    */

}
