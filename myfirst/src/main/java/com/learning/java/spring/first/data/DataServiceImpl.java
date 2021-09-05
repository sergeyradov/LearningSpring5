package com.learning.java.spring.first.data;

import com.learning.java.spring.first.beans.Data;
import com.learning.java.spring.first.beans.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
@Scope("prototype")
public class DataServiceImpl implements DataService {

    @Override
    public List<Data> retrieveData(User user) {
        return Arrays.asList(new Data(10), new Data(20));
    }
}
