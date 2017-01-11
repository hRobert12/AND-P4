package com.udacity.gradle.builditbigger.paid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.Joker;
import com.example.android.jokedisplay.Joke;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Robert on 1/11/2017.
 */

public class MainActivityFragment extends Fragment {

    @BindView(R.id.tell_joke)
    Button tellJoke;
    @OnClick(R.id.tell_joke) void onClick() {
        new EndpointsAsyncTask().execute(Pair.create(this.getContext(), "lol"));
        startActivity(new Intent(getActivity(), Joke.class).putExtra("joke", Joker.getJoke()));
    }

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        ButterKnife.bind(getActivity());

        return root;
    }

}
