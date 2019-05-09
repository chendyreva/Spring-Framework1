package com.geekbrains.Hw2.spring.dao;

import com.geekbrains.Hw2.spring.domain.Counting;
import java.util.Set;

public interface CountingDAO {

    void saveCounting(Counting counting);
    Set<Counting> getCountings();
    Counting get(long id);
}


