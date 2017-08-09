package uk.co.kiwisoft.daggeroneworkbench;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(injects = Thing.class)
public class MainActivityModule {
    private MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {

        this.mainActivity = mainActivity;
    }

    @Provides
    @Singleton
    public MainActivity provideActivity() {
        return mainActivity;
    }
}
