package com.example.Blockchain_App.Adapters;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.Blockchain_App.R;

import java.util.List;
public class Guest_Requests_Adapter extends RecyclerView.Adapter<Guest_Requests_Adapter.ViewHolder>
{
    List<> Guests_RequestsList;
    Context context;

    public Guest_Requests_Adapter(List<Guests_Requests> Guests_RequestsList)
    {
        this.Guests_RequestsList = Guests_RequestsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        context = parent.getContext();
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Guests_Requests request = Guests_RequestsList.get(position);

        holder.guestname.setText(request.getGuest_name());
        holder.imgname.setImageResource(request.getImg_url());
        holder.cv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"The position is:"+position,Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return Guests_RequestsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imgname;
        TextView guestname;
        CardView cv;

        public ViewHolder(View itemView)
        {
            super(itemView);
             imgname= (ImageView)itemView.findViewById(R.id.imagev);
             guestname = (TextView)itemView.findViewById(R.id.example_name);
             cv = (CardView)itemView.findViewById(R.id.cv);
        }

    }
}
}
