package com.example.e5m5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e5m5.databinding.ItemBinding;

import java.util.List;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.ViewHolder>{
    private List<String> ratNames;
    public void setRatNames(List<String> ratNames){
        this.ratNames= ratNames;
    }
    @NonNull
    @Override
    public WordAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull WordAdapter.ViewHolder holder, int position) {
        String rat = ratNames.get(position);
        holder.showData(rat);

    }

    @Override
    public int getItemCount() {
        return ratNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding itemBinding;
        public ViewHolder(ItemBinding binding) {
            super(binding.getRoot());
            itemBinding = binding;
        }

        public void showData(String rat) {
            itemBinding.ratasTxt.setText(rat);
        }
    }
}
