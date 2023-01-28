package org.launchcode.techjobs.oo;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    // MW added both constructors 23/01/27, 12:16p
    //

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    // MW added 23/01/27, 12:21p - equals() is auto-generated, will need another look

    @Override
    public boolean equals(Object o) {
        // if memory addresses are the same, objects are equal, return true.
        if (o == this) {
            return true;
        }
        // if test object is null, or if object's class is not the same as parameterized object's class, objects are not equal, return false.
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Job job = (Job) o;

        if (id == job.id) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (employer != null ? employer.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (positionType != null ? positionType.hashCode() : 0);
        result = 31 * result + (coreCompetency != null ? coreCompetency.hashCode() : 0);
        return result;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    // MW done 23/01/27, 12:22p

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String errorMessage = "Data not available";
        String printName;
        String printId;
        String printLocation;
        String printEmployer;
        String printPositionType;
        String printCoreCompetency;

        if (getName() == null || getName() == "") {
            printName = errorMessage;
        } else {
            printName = getName();
        }
        if (getLocation().getValue() == null || getLocation().getValue() == "") {
            printLocation = errorMessage;
        } else {
            printLocation = getLocation().getValue();
        }
        if (getEmployer().getValue() == null || getEmployer().getValue() == "") {
            printEmployer = errorMessage;
        } else {
            printEmployer = getEmployer().getValue();
        }
        if (getPositionType().getValue() == null || getPositionType().getValue() == "") {
            printPositionType = errorMessage;
        } else {
            printPositionType = getPositionType().getValue();
        }
        if (getCoreCompetency().getValue() == null || getCoreCompetency().getValue() == "") {
            printCoreCompetency = errorMessage;
        } else {
            printCoreCompetency = getCoreCompetency().getValue();
        }

        String output = "\nID: " + getId() + "\n" +
                "Name: " + printName + "\n" +
                "Employer: " + printEmployer + "\n" +
                "Location: " + printLocation + "\n" +
                "Position Type: " + printPositionType + "\n" +
                "Core Competency: " + printCoreCompetency + "\n";
        return output;
    }
}
