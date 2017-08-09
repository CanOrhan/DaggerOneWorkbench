package uk.co.kiwisoft.daggeroneworkbench;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import javax.inject.Inject;


import dagger.Lazy;
import dagger.ObjectGraph;

import static org.hamcrest.MatcherAssert.assertThat;

@Config(application = TestApplication.class)
@RunWith(RoboRunner.class)
public class ThingTest {
    @Inject
    Thing thing;

    @Before
    public void setup() {
        ObjectGraph.create(ThingTestModule.class).inject(this);
    }

    @Test
    public void pretendToTestSomething() {
        assertThat(thing.mainActivity.thing.get(), Matchers.equalTo(thing));
    }
}