package com.sohan.verma.zoomlkotlin.TourAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sohan.verma.zoomlkotlin.Model.Place
import com.sohan.verma.zoomlkotlin.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.tour_rv_layout.view.*

class TourAdapter(val context:Context?, private val places: ArrayList<Place>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.tour_rv_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return places.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        Picasso.get().load(places[position].url).into(holder.itemView.tourImage)
        holder.itemView.tourImage.resume()
        holder.itemView.tourTitle.text = places[position].title
        holder.itemView.tourDescription.text = places[position].description
        holder.itemView.tourRating.rating = places[position].rating!!
    }

    class ViewHolder(v:View?):RecyclerView.ViewHolder(v!!), View.OnClickListener {
        override fun onClick(p0: View?) {

        }
        init {
            itemView.setOnClickListener(this)
        }

    }

}