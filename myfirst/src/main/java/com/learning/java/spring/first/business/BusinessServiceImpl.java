package com.learning.java.spring.first.business;

import com.learning.java.spring.first.beans.Data;
import com.learning.java.spring.first.data.DataService;
import com.learning.java.spring.first.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class BusinessServiceImpl implements BusinessService {

    private final DataService dataService;

    @Autowired
    public BusinessServiceImpl(DataService data) {
        super();
        this.dataService = data;
    }

    @Override
    public long calculateSum(User user) {
        long sum = 0;
        for(Data data: dataService.retrieveData(user)) {
            sum += data.getNumber();
        }

        return sum;
    }
}
