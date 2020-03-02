package com.example.pahlawan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PahlawanAdapter extends RecyclerView.Adapter<PahlawanAdapter.ViewHolder> {

    private Context context;
    private ArrayList<PahlawanModel> listPahlawan = new ArrayList<>();

    public PahlawanAdapter(Context context, ArrayList<PahlawanModel> listPahlawan) {
        this.context = context;
        this.listPahlawan = listPahlawan;
    }

    public ArrayList<PahlawanModel> getListPahlawan() {
        return listPahlawan;
    }

    public void setPahlawanModels (ArrayList<PahlawanModel> pahlawanModels) {
        this.listPahlawan = pahlawanModels;
   }


    @NonNull
    @Override
    public PahlawanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup , int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_pahlawanan,viewGroup,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull PahlawanAdapter.ViewHolder holder, final int position) {
        holder.tvHeroName.setText(getListPahlawan().get(position).getNamaPahlawan());
        holder.tvHeroDetail.setText(getListPahlawan().get(position).getDescPahlawan());

        Glide.with(context).load(getListPahlawan().get(position).getGambarPahlawan()).into(holder.ivHero);

        holder.cvHero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Nama Pahlawan : " + getListPahlawan().get(position).getNamaPahlawan(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPahlawan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivHero;
        TextView tvHeroName,tvHeroDetail;
        CardView cvHero;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivHero = itemView.findViewById(R.id.itempahlawan_iv);
            tvHeroDetail = itemView.findViewById(R.id.itempahlawan_tv_pahlawandetail);
            tvHeroName = itemView.findViewById(R.id.itempahalawn_tv_nama);

            cvHero = itemView.findViewById(R.id.itempahlawan_cv);
        }
    }
}
