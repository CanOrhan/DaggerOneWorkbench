package uk.co.kiwisoft.daggeroneworkbench;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import dagger.Lazy;
import uk.co.kiwisoft.daggeroneworkbench.di.Nurse;

public class MainActivity extends AppCompatActivity {
    @Inject
    Lazy<Thing> thing; // This could be a FragmentPagerAdapter depending on FragmentManager

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Nurse nurse = ((NurseProvider) getApplication()).getNurse(); //I'm not too convinced using the Injector Class pattern in Dagger 1...
        nurse.inject(this);

        Log.d("Cancantest", "This activity " + this);
        Log.d("Cancantest", "That activity " + thing.get().mainActivity);
    }
}
