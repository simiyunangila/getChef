package com.example.getmychef

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getmychef.databinding.ChefsBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class chefadapter (var chefsList:List<chefffs>):RecyclerView.Adapter<ChefViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChefViewHolder {
        val binding =
            ChefsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ChefViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChefViewHolder, position: Int) {
    val currentChef = chefsList.get(position)
    val binding = holder.binding
    binding.tvname.text = currentChef.name
    binding.tvspeciality.text = currentChef.speciality
    binding.tvworkplace.text = currentChef.workplace
    binding.tvdishes.text = currentChef.dishes.toString()


    Picasso
        .get()
        .load(currentChef.person)
        .placeholder(R.drawable.baseline_password_24)
        .transform(CropCircleTransformation())
        .into(binding.imageView8)
    }

    override fun getItemCount(): Int {
        return chefsList.size
    }
}
class ChefViewHolder(var binding: ChefsBinding):RecyclerView.ViewHolder(binding.root)



