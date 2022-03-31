package com.skillbox.redisdemo;

import java.text.SimpleDateFormat;
import java.util.Random;

import static java.lang.System.out;

public class RedisTest {

    private static final SimpleDateFormat DF = new SimpleDateFormat("HH:mm:ss");

    private static final int USERS = 20;

    private static void log(String UsersOnline) {
        String log = "— На главной странице показываем пользователя " + UsersOnline;
        out.println(log);
    }

    public static void main(String[] args) throws InterruptedException {

        RedisStorage redis = new RedisStorage();
        redis.init();

        for (int request = 1; request <= USERS; request++) {
            int user_id = request;
            redis.logPageVisit(user_id);
        }

        int count = 0;
        while (true) {

            log(redis.showUsers());
            redis.moveToTheEnd();
            Thread.sleep(1000);
            count++;
            if (count % 10 == 0) {
                redis.payService(new Random().nextInt(USERS));
            }
        }
    }
}
