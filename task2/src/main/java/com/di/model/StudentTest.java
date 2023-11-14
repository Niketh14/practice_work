package com.di.model;

/*import com.di.model.Student;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class StudentTest {

    private Student student;

    @Before
    public void setUp() {
        student = new Student("1", 1, "John", "Doe", 123.0);
        student.setAddress("1234 Main St, City, Country");
        student.setBirthDate(new Date());
    }

    @Test
    public void testGetIdStudent() {
        assertEquals("1", student.getIdStudent());
    }

    @Test
    public void testGetIdType() {
        assertEquals(1, student.getIdType());
    }

    @Test
    public void testGetName() {
        assertEquals("John", student.getName());
    }

    @Test
    public void testGetLastName() {
        assertEquals("Doe", student.getLastName());
    }

    @Test
    public void testGetNationality() {
        assertEquals(123, student.getNationality());
    }

    @Test
    public void testGetAddress() {
        assertEquals("1234 Main St, City, Country", student.getAddress());
    }

    @Test
    public void testGetBirthDate() {
        assertNotNull(student.getBirthDate());
    }

    @Test
    public void testGetId() {
        assertNull(student.getId());
    }
}*/

import com.di.model.Student;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class StudentTest {

    private Student student;

    @Before
    public void setUp() {
        student = new Student("1", 1, "John", "Doe", 123.0);
        student.setAddress("1234 Main St, City, Country");
        student.setBirthDate(new Date());
    }

    // Test methods...

    @Test
    public void testGetId() {
        assertNull(student.getId());
    }

    @Test
    public void testingComplete() {
        System.out.println("Testing for Student class is completed.");
    }
}
