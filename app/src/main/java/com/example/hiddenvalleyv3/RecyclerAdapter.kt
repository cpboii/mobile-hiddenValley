package com.example.hiddenvalleyv3

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
    private val titles = arrayOf("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")

    private val details = arrayOf("Apple","Ball","Cat","Duck","Elephant","Fish","Giraffe","House","Ice-cream","Jar","Kite","Lemon","Milk","Nurse","Orange","Pen","Queen","Rabbit","Seal","Tortoise","Umbrella","Van","Window","Xylophone","Yacht","Zebra")

    private val images = intArrayOf(R.drawable.pic_a,
        R.drawable.pic_b, R.drawable.pic_c,
        R.drawable.pic_d, R.drawable.pic_e,R.drawable.pic_f,R.drawable.pic_g,R.drawable.pic_h,R.drawable.pic_i,R.drawable.pic_j,
        R.drawable.pic_k,R.drawable.pic_l,R.drawable.pic_m,R.drawable.pic_n,R.drawable.pic_o,
        R.drawable.pic_p,R.drawable.pic_q,R.drawable.pic_r,R.drawable.pic_s,R.drawable.pic_t,R.drawable.pic_u,
        R.drawable.pic_v,R.drawable.pic_w,R.drawable.pic_x,R.drawable.pic_y,R.drawable.pic_z
        )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int {
        return titles.size
    }
}