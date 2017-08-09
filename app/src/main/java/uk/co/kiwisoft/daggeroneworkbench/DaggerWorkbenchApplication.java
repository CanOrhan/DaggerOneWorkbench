package uk.co.kiwisoft.daggeroneworkbench;

import android.app.Application;

import uk.co.kiwisoft.daggeroneworkbench.di.Nurse;
import uk.co.kiwisoft.daggeroneworkbench.di.ProductionNurse;

/**
 * ToDo: Explain the scope of this class
 */

public class DaggerWorkbenchApplication extends Application implements NurseProvider {
    Nurse nurse = new ProductionNurse();

    @Override
    public Nurse getNurse() {
        return nurse;
    }
}
