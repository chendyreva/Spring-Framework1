package com.geekbrains.Hw2.spring.test;

import com.geekbrains.Hw2.spring.dao.CountingDAO;
import com.geekbrains.Hw2.spring.domain.Counting;
import com.geekbrains.Hw2.spring.service.CountingService;
import java.math.BigDecimal;
import javax.annotation.Resource;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring/test-context.xml"})
public class CountingServiceTest {

    @Resource(name = "countingDAO")
    private CountingDAO dao;

    @Resource(name = "countingService")
    private CountingService service;

    @Test
    public void testCountings() {
        BigDecimal amount = new BigDecimal("100");
        long humanId = 1L;
        long parentId = 2L;
        // prepare data for test

        final Counting expectedCounting = new Counting(amount, humanId, parentId);

        // prepare mock
        reset(dao);
        dao.saveCounting(expectedCounting);
        final long newId = 1L;
        expectLastCall().callback(new Runnable() {

            public void run() {
                expectedCounting.setId(newId);
            }
        });
        replay(dao);

        service.addCounting(expectedCounting);

        assertEquals(newId, expectedCounting.getId());
        verify(dao);
    }

    private void reset(CountingDAO dao) {
    }
}