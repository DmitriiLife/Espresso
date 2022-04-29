package ru.kkuzmichev.simpleappforespresso;

import static org.junit.Assert.*;
import

@RunWith(AndroidJUnit4.class)
public class SimpleEspressoTestTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class)

    @Test
    public void testTextName() {
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