package uk.co.kiwisoft.daggeroneworkbench;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = MainActivity.class,
        includes = MainActivityModule.class
)
public class ThingModule {
    @Provides
    @Singleton
    public Thing provideThing(MainActivity mainActivity) {
        return new Thing(mainActivity);
    }
}
