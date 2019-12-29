package com.bill.logic;

import java.util.regex.Pattern;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/29 2:59 下午
 */
public class LoginTest {
    public boolean checkPassword(String inputPassword) {
        return Pattern.matches("^[a-zA-Z0-9]{5,20}", inputPassword);
    }

    public static void main(String[] args) {
        System.out.println(new LoginTest().checkPassword("abcdeabcdeabcdeabcdea"));
    }
}
