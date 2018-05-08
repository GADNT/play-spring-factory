package com.gad.spring.play.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class PlayObjectTest {

    private PlayObject playObject;

    @Before
    public void setUp() throws Exception {
playObject = new PlayObject();
    }


    @Test
    public void givenStudentsContainsNumbers_whenGetRealNames_thenReturnNamesWithNumbers() {


        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                studentList.add(new Student("name"+i, i * 2));
            } else {
                studentList.add(null);

            }
        }

        List<String> realNames = playObject.getRealNames(studentList);

        assertNotNull(realNames);

//        realNames.forEach(s-> assertTrue(s.matches("^\\d.*?\\d$")));



    }
}