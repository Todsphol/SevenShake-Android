package com.example.addyqu.sevenshake_android

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val activityRule =
            ActivityTestRule<MainActivity>(MainActivity::class.java, true, true)
    @Test
    fun test_on_click_button() {
        onView(withId(R.id.btnBlue))
                .perform(ViewActions.click())
    }
}
