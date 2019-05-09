package com.geekbrains.Hw2.spring.service;


import com.geekbrains.Hw2.spring.domain.Counting;
import java.util.Set;

public interface CountingService {

    void addCounting(Counting counting);
    Set<Counting> getCountings();
    Counting get(long id);
}
