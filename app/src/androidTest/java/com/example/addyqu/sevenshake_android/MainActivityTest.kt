package com.example.addyqu.sevenshake_android


import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.example.addyqu.sevenshake_android.activity.MainActivity

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val activityRule =
            ActivityTestRule<MainActivity>(MainActivity::class.java, true, true)
    @Test
    fun test_Input_On_EdiText() {
        onView(withId(R.id.edt_test))
                .check(matches(withText("")))
    }

    @Test
    fun test_On_Click_Button() {
        onView(withId(R.id.btn_test))
                .perform(ViewActions.click())
    }

    @Test
    fun test_Text_in_TextView() {
        onView(withId(R.id.tv_hello))
                .check(matches(withText("สวัสดีคับ")))
    }
}
