package com.example.jasur.kotlinrecyclerviewwithimages

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.row.view.*

class CarAdapter(val cars: ArrayList<Cars>, val mContext: Context): RecyclerView.Adapter<CarAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.row, parent, false))
    }

    override fun getItemCount(): Int {
        return cars.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            Glide
                .with(mContext)
                .load(cars.get(position).img)
                .into(holder?.carPic);

        holder?.carName?.text = cars.get(position).title
        holder?.carYear?.text = cars.get(position).year.toString()
    }

    class MyViewHolder(v: View): RecyclerView.ViewHolder(v){
        var carPic = v.carImage
        var carName = v.carName
        var carYear = v.carYear
    }
}