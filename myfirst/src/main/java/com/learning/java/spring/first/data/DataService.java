package com.learning.java.spring.first.data;

import com.learning.java.spring.first.beans.Data;
import com.learning.java.spring.first.beans.User;

import java.util.List;

public interface DataService {
    List<Data> retrieveData(User user);
}
