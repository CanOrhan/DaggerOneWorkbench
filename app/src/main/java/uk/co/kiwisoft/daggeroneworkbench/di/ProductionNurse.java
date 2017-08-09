package uk.co.kiwisoft.daggeroneworkbench.di;

import java.lang.ref.WeakReference;

import dagger.ObjectGraph;
import uk.co.kiwisoft.daggeroneworkbench.MainActivity;
import uk.co.kiwisoft.daggeroneworkbench.MainActivityModule;
import uk.co.kiwisoft.daggeroneworkbench.ThingModule;

public class ProductionNurse implements Nurse{
    private static ObjectGraph applicationGraph;
    private static WeakReference<ObjectGraph> mainActivityGraph;

    @Override
    public void inject(MainActivity mainActivity) {
        applicationGraph = ObjectGraph.create(ThingModule.class, new MainActivityModule(mainActivity));
        applicationGraph.inject(mainActivity);

        mainActivityGraph = new WeakReference<>(applicationGraph.plus());
    }
}
