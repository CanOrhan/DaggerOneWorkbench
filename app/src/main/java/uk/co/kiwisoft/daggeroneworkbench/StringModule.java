package uk.co.kiwisoft.daggeroneworkbench;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

//@Module(injects = {
//        Thing.class,
//        MainActivity.class
//})
public class StringModule {
//    @Provides
//    @Singleton
    public String provideThatStringThatGuyNeeds() {
        return new String("Thank you Mr Module");
    }
}
