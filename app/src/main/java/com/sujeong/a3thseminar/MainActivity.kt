package com.sujeong.a3thseminar


import android.content.Intent
import android.graphics.Canvas
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.RelativeLayout
import android.widget.Toast
import com.sujeong.a3thseminar.KaKaoAdapter
import com.sujeong.a3thseminar.KaKaoData
import com.sujeong.a3thseminar.R

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()/*, View.OnClickListener */{

//    override fun onClick(p0: View?) { 이고능 이제 안쓰임 ㅇㅅㅇ
//        val idx : Int = main_rv.getChildAdapterPosition(p0)
//        val name : String = kakaoItems[idx].name
//        val profile : Int = kakaoItems[idx].profile
//        val intent : Intent = Intent(applicationContext,ChatActivity::class.java)
//        intent.putExtra("name",name)
//        intent.putExtra("profile",profile)
//        startActivity(intent)
//
//    }
    //이러한 버튼이벤트들을 어댑터에도 설정해 줘야한다.

    /*2018.06.02 7차 세미나 코드 시작*/

    //   lateinit var itemTouchListener: ItemTouchHelper
    //  var isDisplayButtons : Boolean = false
    /*2018.06.02 7차 세미나 코드 끝*/

    lateinit var kakaoItems : ArrayList<KaKaoData> //lateinit을 이용해 당장의 초기화를 넘어간다. 지금당장 초기화값을 정하지 않겠다고 말하는것 or ? = null 혹은 = ArrayList()

    lateinit var kakaoAdapter : KaKaoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kakaoItems = ArrayList()

        kakaoItems.add(KaKaoData(R.drawable.p1,"뚜덩이의 안드로이드","안농하세용~~~오늘은 리사이클러 뷰를 사용했습니댱","오후 3:19"))//어래이 리스트에는 객체화된 아이템들을 넣어줘여한다. 코릍ㅌ린에선 뉴가 없으므로 그냥 생성자를 통째로 add해줄것
        kakaoItems.add(KaKaoData(R.drawable.p2,"고라니","오빠가 내죠","오후 3:20"))
        kakaoItems.add(KaKaoData(R.drawable.p3,"히꺼츄","히튜히튜히튷","오후 3:30"))
        kakaoItems.add(KaKaoData(R.drawable.p4,"떠뤄니","깁스빼구시퍼","오후 3:55"))
        kakaoItems.add(KaKaoData(R.drawable.p5,"우나우나","뚜동아!","오후 4:13"))
        kakaoItems.add(KaKaoData(R.drawable.p6,"나주배","배는 나주가 짱이죠!","오후 4:22"))
        kakaoItems.add(KaKaoData(R.drawable.p7,"찌녕겅듀","아임 프린세스 킴~","오후 4:25"))
        kakaoItems.add(KaKaoData(R.drawable.p8,"밍구맘","월월ㅇ뤙뤙뤌!!","오후 4:36"))
        kakaoItems.add(KaKaoData(R.drawable.p9,"미녀","부장님산책그만해요","오후 4:47"))
        kakaoItems.add(KaKaoData(R.drawable.p10,"쭈노","주노오지마","오후 4:52"))

        //어댑터 생성하기
        kakaoAdapter = KaKaoAdapter(this,kakaoItems)

        // kakaoAdapter.setOnItemClickListener(this)


        //메인 rv의 위치 조정. 선형으로 떨어지게끔
        main_rv.layoutManager = LinearLayoutManager(this)

        //메인에 어댑터를 연결해주면 끝!
        main_rv.adapter = kakaoAdapter

        /*2018.06.02 7차 세미나 코드 시작*/
        //swipeController = SwipeController()

        // itemTouchListener = ItemTouchListener(swipeController)
        // itemTouchListener = ItemTouchHelper(swipeController)
        //itemTouchListener.attachToRecyclerView(main_rv)

        // main_rv.addItemDecoration(object:RecyclerView.ItemDecoration(){
        //  override fun onDraw(c: Canvas?, parent: RecyclerView?, state: RecyclerView.State?) {
        //          swipeController.onDraw(c!!)
        //       }
        //    })


    }


}
