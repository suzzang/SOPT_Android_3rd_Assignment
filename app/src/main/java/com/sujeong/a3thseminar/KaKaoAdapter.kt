package com.sujeong.a3thseminar

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.LayoutInflater.from
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

import kotlinx.android.synthetic.main.kakao_item.view.*
import kotlin.coroutines.experimental.coroutineContext

//어댑터로 뷰홀더와 데이타를 연결해주기전에 메인 액티비티에서 실제데이터들을 (처리해준다)넣어준다.

class KaKaoAdapter(var context: Context,private  var kakaoItems : ArrayList<KaKaoData>) : RecyclerView.Adapter<KaKaoViewHolder>() { //알트 엔터 눌러서 다 첫번째줄 클릭클릭!

    private lateinit var onItemClick : View.OnClickListener
    var headerFlags = false;
    fun setOnItemClickListener(l : View.OnClickListener){
        onItemClick = l
    }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  KaKaoViewHolder{
        val mainView : View
         Log.v("뷰타입",viewType.toString())
        if(viewType == 0){
            headerFlags = true;
            mainView =LayoutInflater.from(parent.context)
                    .inflate(R.layout.kakao_header_item,parent,false)
        }else{
            headerFlags = false;
            mainView =LayoutInflater.from(parent.context)
                    .inflate(R.layout.kakao_item,parent,false)
        }

        // mainView.setOnClickListener(onItemClick)//아이템 하나하나에 접근하도록
         return KaKaoViewHolder(headerFlags,mainView)
    }

    override fun getItemCount(): Int{
        Log.v("아이템사이즈",kakaoItems.size.toString())
        return kakaoItems.size+1 //들어가는 아이템 수에 맞추어 리사이클러 뷰의 길이 조정
    }
    //헤더가 들어가져서 조절을 해야하는데 왜 아무것도 안적어도 되지..?????? 왜 안밀리는거지..?? 는해결!!
    //밑에 포지션을 -1 해주고 맨 위에것도 다 나오게하면 밀린다능! 그래서 사이즈는 +1 해주면 다 보인당!

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: KaKaoViewHolder, position: Int) { // 실제 이어주는 부분 , 포지션에 맞게 뷰에 데이터를 넣어줌

        if(!holder.flags){ //뷰홀더안의 플래그를 사용해줘야지 오류가 안남...ㅇㅅㅇ......
            holder.kakaoProfile.setImageResource(kakaoItems[position-1].profile)
            holder.kakaoName.text = kakaoItems[position-1].name
            holder.kakaoDate.text = kakaoItems[position-1].date
            holder.kakaoPreview.text = kakaoItems[position-1].preView

            //특정 뷰를 눌렀을때 클릭이벤트가 작동되도록 할때!!!! intent를 위한 context를 위해 어댑터의 인자로 context를 설정한다.
            holder.kakaoProfile.setOnClickListener {
                val name : String = kakaoItems[position-1].name
                val profile : Int = kakaoItems[position-1].profile
                val intent : Intent = Intent(context,ChatActivity::class.java)
                intent.putExtra("name",name)
                intent.putExtra("profile",profile)
                context.startActivity(intent) //요로케 context. 으로 해주는거 잊지말기!

            }
        }



    }





}

