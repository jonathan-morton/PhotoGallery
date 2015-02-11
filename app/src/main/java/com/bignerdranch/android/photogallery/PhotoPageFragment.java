package com.bignerdranch.android.photogallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by larrikin on 2/11/15.
 */
public class PhotoPageFragment extends VisibleFragment {
    private String mUrl;
    private WebView mWebView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);

        mUrl = getActivity().getIntent().getData().toString();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_photo_page, parent, false);

        mWebView = (WebView)v.findViewById(R.id.webView);

        return v;
    }
}
