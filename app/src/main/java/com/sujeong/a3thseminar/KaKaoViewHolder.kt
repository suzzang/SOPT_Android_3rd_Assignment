package com.sujeong.a3thseminar

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.sujeong.a3thseminar.R
import org.w3c.dom.Text

class KaKaoViewHolder(flag : Boolean,itemView: View?) : RecyclerView.ViewHolder(itemView) {
    var flags = flag
    lateinit var kakaoProfile : ImageView
    lateinit var kakaoName : TextView
    lateinit var kakaoDate : TextView
    lateinit var kakaoPreview : TextView
    lateinit var kakaoHeader : EditText
    init {
        if (!flags){
            kakaoProfile = itemView!!.findViewById(R.id.item_profile_image) as ImageView
            kakaoName  = itemView!!.findViewById(R.id.item_name_tv) as TextView
            kakaoDate  = itemView!!.findViewById(R.id.item_date_tv) as TextView
            kakaoPreview  = itemView!!.findViewById(R.id.item_preview_tv) as TextView
        }
        else{kakaoHeader = itemView!!.findViewById(R.id.kakao_header_item) as EditText}
    }


}
