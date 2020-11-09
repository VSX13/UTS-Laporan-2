package com.example.profilfakultasupn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_fk.view.*

class AdapterFk(val fkItem: List<DataFk>, val clickListener: (DataFk) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_fk, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(fkItem[position], clickListener)
    }

    override fun getItemCount() = fkItem.size
    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: DataFk, clickListener: (DataFk) -> Unit) {
            itemView.imgList.setImageResource(data.fkImage)
            itemView.Listfk.text = data.fkName
            itemView.setOnClickListener { clickListener(data) }
        }
    }

}