package com.deloitte.learnspring.sample.enterprise.flow.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService {
    public List<Integer> retrieveData() {
        return Arrays.asList(87100, 60101, 8888);
    }
}
