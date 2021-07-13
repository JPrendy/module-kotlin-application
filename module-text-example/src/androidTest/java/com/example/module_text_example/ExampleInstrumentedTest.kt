package com.example.module_text_example

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {


    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.module_text_example.test", appContext.packageName)
    }

    // We can't use an Activity in a `Android library` module since it is not an app and we can't launch non app module like `module-text-example` module.
//    @get:Rule
//    val activityRule = ActivityTestRule(MainActivity::class.java, true, false)
//
//    @Test
//    fun checkTextMatchTextWeGetFromTheModuleClass() {
//        activityRule.launchActivity(null)
//
//        Espresso.onView(ViewMatchers.withText("The Pokémon Pikachu is from the Kanto region."))
//            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
//    }
}