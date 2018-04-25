package com.example.nassim.topay;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class SampleActivityTest {

    @Rule
    public ActivityTestRule<SampleActivity> sActivityTestRule = new ActivityTestRule<SampleActivity>(SampleActivity.class);

    private SampleActivity sActivity = null;

    @Before
    public void setUp() throws Exception {

        sActivity = sActivityTestRule.getActivity();
    }

    @Test
    public void testLauch() throws Exception {

        View view = sActivity.findViewById(R.id.buyItBtn);
        assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {

        sActivity = null;

    }


    @Test
    public void onBuyPressed() {
    }

    @Test
    public void onFuturePaymentPressed() {
    }

    @Test
    public void onProfileSharingPressed() {
    }

    @Test
    public void onFuturePaymentPurchasePressed() {
    }
}