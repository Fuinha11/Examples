package com.example.fuinha.smelslikebacon;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Fuinha on 06/07/2017.
 */

public class RecyclerViewListAdapter extends RecyclerView.Adapter {


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerViewHolder(view); ///isso é a classe que criamos aqui em baixo
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((RecyclerViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView itemText;
        private ImageView itemImage;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            itemText = (TextView) itemView.findViewById(R.id.ItemText);
            itemImage = (ImageView) itemView.findViewById(R.id.ItemImage);

            itemImage.setOnClickListener(this);

        }

        public void bindView(int position){
            itemText.setText(Recipes.names[position]);
            itemImage.setImageResource(Recipes.resourceIds[position]);
        }

        @Override
        public void onClick(View v) {

        }
    }
}


