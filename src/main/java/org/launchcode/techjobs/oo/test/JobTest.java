package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1 instanceof Job);
        assertEquals(job1.getName(),"Product tester");
        assertTrue(job1.getEmployer() instanceof Employer);
        assertEquals(job1.getEmployer().getValue(), "ACME");
        assertTrue(job1.getLocation() instanceof Location);
        assertEquals(job1.getLocation().getValue(), "Desert");
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertEquals(job1.getPositionType().getValue(), "Quality control");
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job1.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job1a = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job1, job1a);
        assertFalse(job1.equals(job1a));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char expected = '\n';

        String tester1 = job1.toString();

        char start = tester1.charAt(0);
        assertEquals(expected, start);

        char end = tester1.charAt(tester1.length()-1);
        assertEquals(expected, end);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String tester1 = job1.toString();
        String expected1 = "\nID: " + job1.getId() + "\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n";
        assertEquals(tester1, expected1);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job jobWithEmptyField = new Job("", new Employer(null), new Location(""), new PositionType(null), new CoreCompetency(""));
        String tester2 = jobWithEmptyField.toString();
        String errorMessage = "Data not available";
        String expected2 = "\nID: " + jobWithEmptyField.getId() + "\n" +
                "Name: " + errorMessage + "\n" +
                "Employer: " + errorMessage + "\n" +
                "Location: " + errorMessage + "\n" + // account for empty field with " Data not available"
                "Position Type: " + errorMessage + "\n" +
                "Core Competency: " + errorMessage + "\n";
                assertEquals(tester2, expected2);
    }
}
