package com.example.pahlawan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PahlawanAdapter extends RecyclerView.Adapter<PahlawanAdapter.ViewHolder> {

    private Context context;
    private ArrayList<PahlawanModel> pahlawanModels;

    public PahlawanAdapter(Context context) {
        this.context = context;
    }
    public ArrayList<PahlawanModel> getPahlawanModels(){
        return pahlawanModels;
   }
   public void setPahlawanModels (ArrayList<PahlawanModel> pahlawanModels) {
        this.pahlawanModels = pahlawanModels;
   }


    @NonNull
    @Override
    public PahlawanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup , int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_pahlawanan,viewGroup,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull PahlawanAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getPahlawanModels().get(i).getGambarPahlawan()).into(viewHolder.ivGambarPahlawan);

        viewHolder.tvNamaPahlawan.setText(getPahlawanModels().get(i).getNamaPahlawan());
    }

    @Override
    public int getItemCount() {

        return pahlawanModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivGambarPahlawan;
        private TextView tvNamaPahlawan;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivGambarPahlawan = itemView.findViewById(R.id.gambar_pahlawan);
            tvNamaPahlawan = itemView.findViewById(R.id.nama_pahlawan);
        }
    }
}
