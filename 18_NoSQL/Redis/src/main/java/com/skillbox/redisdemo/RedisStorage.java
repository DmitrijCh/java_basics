package com.skillbox.redisdemo;

import org.redisson.Redisson;
import org.redisson.api.RKeys;
import org.redisson.api.RScoredSortedSet;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisConnectionException;
import org.redisson.config.Config;

import java.util.Date;

import static java.lang.System.out;

public class RedisStorage {

    private RedissonClient redisson;

    private RKeys rKeys;

    private RScoredSortedSet<String> onlineUsers;

    private final static String KEY = "ONLINE_USERS";

    private double getTs() {
        return new Date().getTime() / 1000;
    }

    public void listKeys() {
        Iterable<String> keys = rKeys.getKeys();
        for (String key : keys) {
            out.println("KEY: " + key + ", type:" + rKeys.getType(key));
        }
    }

    void init() {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        try {
            redisson = Redisson.create(config);
        } catch (RedisConnectionException Exc) {
            out.println("Не удалось подключиться к Redis");
            out.println(Exc.getMessage());
        }
        rKeys = redisson.getKeys();
        onlineUsers = redisson.getScoredSortedSet(KEY);
        rKeys.delete(KEY);
    }

    void shutdown() {
        redisson.shutdown();
    }

    void logPageVisit(int user_id) {
        onlineUsers.add(getTs(), String.valueOf(user_id));
    }

    String showUsers() {
        return onlineUsers.first();
    }

    void moveToTheEnd() {
        onlineUsers.addScore(showUsers(), getTs());
    }

    void payService(int user_id) {
        out.println("> Пользователь " + user_id + " оплатил платную услугу");
        onlineUsers.add(onlineUsers.getScore(showUsers()), String.valueOf(user_id));
    }
}
