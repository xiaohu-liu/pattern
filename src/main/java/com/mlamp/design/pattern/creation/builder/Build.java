package com.mlamp.design.pattern.creation.builder;

import java.util.ArrayList;
import java.util.List;

public class Build {
    private List<Sender> sends = new ArrayList<Sender>();

    public void build(int num) {
        for (int i = 0; i < num; i++) {
            sends.add(new SmsSender());
        }

        for (int i = 0; i < num; i++) {
            sends.add(new MailSender());
        }
    }

    public void sends() {
        for (Sender send : sends) {
            send.send();
        }
    }
}
