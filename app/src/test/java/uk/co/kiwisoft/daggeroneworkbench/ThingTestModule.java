package uk.co.kiwisoft.daggeroneworkbench;

import org.robolectric.Robolectric;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(injects = {ThingTest.class, MainActivity.class}, overrides = true)
public class ThingTestModule {
    @Provides
    @Singleton
    public Thing provideRealThing(MainActivity mainActivity) {
        return new Thing(mainActivity);
    }
}
