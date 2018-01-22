package com.map.woxapptestapp.ui.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.map.woxapptestapp.R;
import com.map.woxapptestapp.models.RideUserData;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by CherryPie on 17.11.2017
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<RideUserData> itemList = new ArrayList<>();

    public RecyclerAdapter(List<RideUserData> list) {
        itemList = list;
    }

    public void setList(List<RideUserData> list) {
        itemList = list;
        notifyDataSetChanged();
    }

    public List<RideUserData> getList() {
        return itemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.addressTextView.setText(itemList.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return (itemList == null) ? 0 :itemList.size();
    }

    // ---------- ViewHolder ---------- //
    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.address) TextView addressTextView;

        private ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
