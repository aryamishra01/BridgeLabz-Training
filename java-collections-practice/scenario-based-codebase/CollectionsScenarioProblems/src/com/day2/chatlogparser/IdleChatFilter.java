package com.day2.chatlogparser;

import java.util.*;

public class IdleChatFilter implements MessageFilter<String> {

    Set<String> idleWords =
            new HashSet<>(Arrays.asList("lol", "brb", "ok", "haha"));

    @Override
    public boolean allow(String msg) {
        String lower = msg.toLowerCase();
        for (String w : idleWords) {
            if (lower.contains(w))
                return false;
        }
        return true;
    }
}

