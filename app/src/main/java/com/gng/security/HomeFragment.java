package com.gng.security;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView devicesRecyclerView = view.findViewById(R.id.devices_recycler_view);
        devicesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Placeholder data
        List<String> deviceList = new ArrayList<>();
        deviceList.add("Front Door");
        deviceList.add("Bedroom Window");
        deviceList.add("Jewelry Box");

        DeviceAdapter adapter = new DeviceAdapter(deviceList);
        devicesRecyclerView.setAdapter(adapter);

        return view;
    }
}
