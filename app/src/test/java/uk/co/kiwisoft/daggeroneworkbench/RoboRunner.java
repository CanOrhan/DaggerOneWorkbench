package uk.co.kiwisoft.daggeroneworkbench;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * ToDo: Explain the scope of this class
 */

public class RoboRunner extends RobolectricTestRunner {
    /**
     * Creates a runner to run {@code testClass}. Looks in your working directory for your AndroidManifest.xml file
     * and res directory by default. Use the {@link Config} annotation to configure.
     *
     * @param testClass the test class to be run
     * @throws InitializationError if junit says so
     */
    public RoboRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    @Override
    protected Config buildGlobalConfig() {
        return Config.Builder.defaults()
                .setPackageName("uk.co.kiwisoft.daggeroneworkbench")
                .setManifest("build/intermediates/manifests/full/debug/AndroidManifest.xml")
                .setResourceDir("../../../res/merged/debug") // relative to manifest
                .setAssetDir("../../../assets/debug") // relative to manifest
                .build();
    }
}
