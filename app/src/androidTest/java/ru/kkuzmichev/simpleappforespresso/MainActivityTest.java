package ru.kkuzmichev.simpleappforespresso;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class)

            @Test
             public void testGreen() {
                ViewInteraction mainText = onView(
                        withId(R.id.text_home)
                );
                mainText.check(
                        matches(
                                withText("This is home fragment")
                        )
                );
            }
}
