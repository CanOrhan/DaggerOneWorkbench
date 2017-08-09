package uk.co.kiwisoft.daggeroneworkbench;

import javax.inject.Inject;


public class Thing {
    public MainActivity mainActivity;

    @Inject
    public Thing(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
}
