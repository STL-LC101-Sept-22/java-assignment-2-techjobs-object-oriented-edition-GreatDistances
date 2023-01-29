package org.launchcode.techjobs.oo;

public abstract class JobField {
    // 1. Create a new class called JobField in the package org.launchcode.techjobs.oo.
    // TODO 2. Consider the following questions to help you decide what code to put in the JobField class:
    //      What fields do ALL FOUR of the classes have in common?
    //      Which constructors are the same in ALL FOUR classes?
    //      What getters and setters do ALL of the classes share?
    //      Which custom methods are identical in ALL of the classes?
    // TODO 3. In JobField, declare each of the common fields.
    private int id;
    private static int nextId = 1;
    // TODO 4. Code the constructors.
    public JobField() {
        id = nextId;
        nextId++;
    }
    // TODO 5. Use Generate to create the appropriate getters and setters.
    // TODO 6. Add in the custom methods.
    // 7. Finally, to prevent the creation of a JobField object, make this class abstract.

}