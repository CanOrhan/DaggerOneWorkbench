package uk.co.kiwisoft.daggeroneworkbench;

import android.app.Application;

import dagger.ObjectGraph;
import uk.co.kiwisoft.daggeroneworkbench.di.Nurse;

public class TestApplication extends Application implements NurseProvider {
    public static final ObjectGraph applicationGraph = ObjectGraph.create(ThingTestModule.class);

    Nurse testNurse = new Nurse() {
        @Override
        public void inject(MainActivity mainActivity) {
            applicationGraph.plus(new MainActivityModule(mainActivity)).inject(mainActivity);
        }
    };

    @Override
    public Nurse getNurse() {
        return testNurse;
    }
}
