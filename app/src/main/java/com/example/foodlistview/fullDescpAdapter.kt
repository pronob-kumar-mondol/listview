package com.example.foodlistview

import android.app.Activity
import android.widget.ArrayAdapter

class fullDescpAdapter(
    private val context: Activity,
    private val title: Array<String>,
    private val desc: Array<String>,
    private val imageId: Array<Int>
) : ArrayAdapter<String>(context,R.layout.activity_full_descp, title) {

}