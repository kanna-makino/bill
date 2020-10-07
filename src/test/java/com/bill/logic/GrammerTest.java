package com.bill.logic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author zhulongkun20@163.com
 * @since 2020/1/1 8:40 下午
 */
public class GrammerTest {
    public static void main(String[] args) {
        Integer.parseInt("1");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        String date = formatter.format(LocalDate.of(2020, 1, 1));
        System.out.println(date);

        String str = "20200001";
        String no = str.substring(str.length() - 4);
        int num = Integer.parseInt(no + 1);
    }
}
