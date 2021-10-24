package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import static android.content.ContentValues.TAG;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    String joke;
    InterstitialAd mInterstitialAd;
    ProgressBar progressBar;
    private View mClickedView;

    public MainActivityFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        Log.d(TAG, "onCreateView: mainActivityFragment");
        progressBar = (ProgressBar) root.findViewById(R.id.progress_bar);


        final MainActivity activity = (MainActivity) getActivity();

        mInterstitialAd = new InterstitialAd(getActivity());
        mInterstitialAd.setAdUnitId(getString(R.string.banner_ad_unit_id));

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {

                requestNewInterstitial();

                switch (mClickedView.getId()) {
                    case R.id.button_get_joke_android_lib:
                        activity.displayJokeAndroidLib();
                        break;
                    case R.id.button_get_joke_android_gce:
                        activity.displayJokeAndroidGCE();
                        break;
                }
            }
        });

        requestNewInterstitial();

        AdView mAdView = (AdView) root.findViewById(R.id.adView);
        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
        setupInterstitialAds();

        Button toastButton = (Button) root.findViewById(R.id.button_get_joke_java_lib);
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.tellJoke();
            }
        });

        Button androidLibraryButton = (Button) root.findViewById(R.id.button_get_joke_android_lib);
        androidLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mClickedView = view;
                    mInterstitialAd.show();
                } else {
                    activity.displayJokeAndroidLib();
                }
            }
        });

        Button androidGceButton = (Button) root.findViewById(R.id.button_get_joke_android_gce);
        androidGceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mClickedView = view;
                    mInterstitialAd.show();
                } else {
                    activity.displayJokeAndroidGCE();
                }
            }
        });

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    private void setupInterstitialAds() {
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId(getActivity().getString(R.string.banner_ad_unit_id));

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                final MainActivity activity = (MainActivity) getActivity();
                activity.displayJokeAndroidLib();
            }
        });
        requestNewInterstitial();
    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        mInterstitialAd.loadAd(adRequest);
    }
}






