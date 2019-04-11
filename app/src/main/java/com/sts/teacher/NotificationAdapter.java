package com.sts.teacher;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Notification> notifications = new ArrayList<>();

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView notification;

        public MyViewHolder(View view){
            super(view);
            notification = view.findViewById(R.id.notification);
        }
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        MyViewHolder holder1 = (MyViewHolder) viewHolder;
        holder1.notification.setText(notifications.get(i).getMessage());
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_notification,viewGroup,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public int getItemCount() {
        return notifications.size();
    }

    public void update( List<Notification> attentances ){
        this.notifications = attentances;
        notifyDataSetChanged();
    }
}
