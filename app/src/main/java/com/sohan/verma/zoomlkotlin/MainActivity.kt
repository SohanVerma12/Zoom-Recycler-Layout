package com.sohan.verma.zoomlkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.sohan.verma.zoomlkotlin.CustomZoomClass.CenterZoomLayout
import com.sohan.verma.zoomlkotlin.Model.Place
import com.sohan.verma.zoomlkotlin.TourAdapter.TourAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init
        val tourRv = findViewById<RecyclerView>(R.id.tourRV)
        //init layout managere here
        val layoutManager = CenterZoomLayout( this)

        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        layoutManager.reverseLayout = true
        layoutManager.stackFromEnd = true
        tourRv.layoutManager = layoutManager

        // To Auto Centre View
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(tourRv)
        tourRv.isNestedScrollingEnabled = false

        /*
        https://unsplash.com/photos/4e0PvfHClnI///
        https://unsplash.com/photos/FuxRM_jOFHY///
        https://unsplash.com/photos/102abqkKhbY
         */

        //Add Arraylist to items
        val places = ArrayList<Place>()
//        places.add(
//            Place(
//                "India",
//                "India is very famous for there regilision and called fjdskl fds8fdfklewnfkfiofiof",
//                        3.4f,
//                "https://images.unsplash.com/photo-1515091943-9d5c0ad475af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=375&q=80"
//
//            )
//        )
//
//        places.add(
//            Place(
//                "India123",
//                "India is very famous for there regilision and called fjdskl fds8fdfklewnfkfiofiof",
//                2.4f,
//                "https://images.unsplash.com/photo-1517330357046-3ab5a5dd42a1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80"
//
//                )
//        )
//
//
//        places.add(
//            Place(
//                "IndiaHidni",
//                "India is very famous for there regilision and called fjdskl fds8fdfklewnfkfiofiof",
//                1.4f,
//                "https://images.unsplash.com/photo-1524613032530-449a5d94c285?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1575&q=80"
//
//                )
//        )

        places.add(
            Place(
                "India",
                "India has very much population in the world. India have 36 Billions of God",
                3.4f,
                "https://images.unsplash.com/photo-1517330357046-3ab5a5dd42a1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80"
            )
        )

        places.add(
            Place(
                "California",
                "California has big amount of forest and beaches to gromming in the feel",
                2.4f,
                "https://images.unsplash.com/photo-1446630073557-fca43d580fbe?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80"
            )
        )

        places.add(
            Place(
                "Japan",
                "Japan is very small country as compare to other population of country ",
                3.0f,
                "https://images.unsplash.com/photo-1491884662610-dfcd28f30cfb?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80"
            )
        )


        //Arraylist to recyclerview
        tourRv.adapter = TourAdapter(this, places)
    }
}