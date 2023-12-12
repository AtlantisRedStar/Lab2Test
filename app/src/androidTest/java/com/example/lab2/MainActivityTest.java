package com.example.lab2;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;
import static androidx.test.espresso.action.ViewActions.click;


public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testButtonClick() {

        Espresso.onView(ViewMatchers.withId(R.id.button)).perform(click());


    }

    @Test
    public void testReplaceButtonClick() {

        Espresso.onView(ViewMatchers.withId(R.id.replaceButton)).perform(click());


    }


}
