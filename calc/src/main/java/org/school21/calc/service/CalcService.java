package org.school21.calc.service;

import org.school21.calc.model.CalcData;
import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public void printArgs(CalcData data) {
        System.out.println(data);
    }
}
