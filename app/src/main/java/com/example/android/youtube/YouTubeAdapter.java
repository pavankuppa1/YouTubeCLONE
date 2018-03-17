package com.example.android.youtube;

/**
 * Created by kmurali on 17-03-2018.
 */

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kmurali on 17-03-2018.
 */

public class YouTubeAdapter extends RecyclerView.Adapter<YouTubeAdapter.ViewHolder> {

    private Context mcontext;
    private ArrayList<Videos> mList;

    YouTubeAdapter(Context context, ArrayList<Videos> list){
        mcontext=context;
        mList=list;
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(mcontext);
        View view=layoutInflater.inflate(R.layout.items,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Videos video=mList.get(position);

        ImageView image=holder.vid_image;
        TextView text1,text2,text3;
        text1=holder.vid_text1;
        text2=holder.vid_text2;
        text3=holder.vid_text3;
        image.setImageResource(video.getImage());
        text1.setText(video.getText1());
        text2.setText(video.getText2());
        text3.setText(video.getText3());
    }



    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView vid_image;
        TextView vid_text1,vid_text2,vid_text3;



        public ViewHolder(View itemView) {
            super(itemView);

            vid_image=itemView.findViewById(R.id.vid_image);
            vid_text1=itemView.findViewById(R.id.vid_text1);
            vid_text2=itemView.findViewById(R.id.vid_text2);
            vid_text3=itemView.findViewById(R.id.vid_text3);
        }
    }
}
