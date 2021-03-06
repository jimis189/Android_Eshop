package com.example.e_shop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SalesFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    public SalesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sales, container, false);
        recyclerView = view.findViewById(R.id.salesRecyclerView);

        List<Sales> sales = MainActivity.myAppDatabase.myDao().getSales();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new SalesAdapter(sales);
        recyclerView.setAdapter(adapter);


        return view;
    }
}

