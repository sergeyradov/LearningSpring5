package com.learning.java.spring.first.business;

import com.learning.java.spring.first.beans.Data;
import com.learning.java.spring.first.beans.User;
import com.learning.java.spring.first.data.DataService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class BusinessServiceJavaContextTest {

    private static final User DUMMY_USER = new User("dummy");

    @Mock
    private DataService dataServiceMock;
    private BusinessService service;

    @Before
    public void setUp(){
        service = new BusinessServiceImpl(dataServiceMock);
    }

    @Test
    public void testCalculateSum() {
        BDDMockito.given(dataServiceMock.retrieveData(ArgumentMatchers.any(User.class)))
                .willReturn(Arrays.asList(new Data(10), new Data(15), new Data(25)));

        long sum = service.calculateSum(DUMMY_USER);
        assertEquals(10 + 15 + 25, sum);
    }
}
