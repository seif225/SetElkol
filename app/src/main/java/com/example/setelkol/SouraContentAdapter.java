package com.example.setelkol;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.setelkol.Model.SouraItem;

import java.util.ArrayList;

public class SouraContentAdapter extends RecyclerView.Adapter<SouraContentAdapter.ViewHolder> {
    ArrayList<SouraItem>souraItems;

    public SouraContentAdapter(ArrayList<SouraItem> souraItems) {
        this.souraItems = souraItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.soura_content_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
         SouraItem item=souraItems.get(i);
         viewHolder.aya2.setText(item.getSoura_name()+"("+item.getPosition()+")");
        Log.e("SouraContentPresenter",item.getSoura_name()+"");

    }

    @Override
    public int getItemCount() {
        if (souraItems==null)
            return 0;
        return souraItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView aya2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            aya2=itemView.findViewById(R.id.aya);
        }
    }
}
