package com.example.jasur.kotlinrecyclerviewwithimages

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var cars: ArrayList<Cars> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = CarAdapter(cars, this)

        addCars()
    }

    fun addCars(){
        cars.add(Cars(R.drawable.car1,"Car One",2014))
        cars.add(Cars(R.drawable.car2,"Car Two",2014))
        cars.add(Cars(R.drawable.car3,"Car Three",2014))
        cars.add(Cars(R.drawable.car4,"Car Four",2014))



    }
}
