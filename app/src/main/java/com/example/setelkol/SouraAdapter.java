package com.example.setelkol;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.setelkol.Model.SouraItem;

import java.util.ArrayList;

public class SouraAdapter extends RecyclerView.Adapter<SouraAdapter.ViewHolder> {
    ArrayList<SouraItem>items;
    OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public SouraAdapter(ArrayList<SouraItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.soura_item,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        SouraItem item=items.get(i);
        viewHolder.name.setText(item.getSoura_name());
        if(onItemClickListener!=null){
            viewHolder.parent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.OnItemClick(i);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
       if (items==null)
        return 0;
       return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        View parent;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.souraName);
            parent=itemView;
        }
    }
    public interface OnItemClickListener{
        void OnItemClick(int position);
    }
}
