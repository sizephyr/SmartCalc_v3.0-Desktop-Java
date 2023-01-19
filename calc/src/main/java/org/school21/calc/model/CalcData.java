package org.school21.calc.model;

import lombok.Data;

@Data
public class CalcData {

    private String line;

    @Override
    public String toString() {
        return "CalcData{" +
                "line='" + line + '\'' +
                '}';
    }
}
