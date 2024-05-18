package com.example.mylibrary

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

object ImageLibrary {
    fun imageViewer(context: Context, url:Any, imageView: ImageView, drawable: Int) {
        Glide.with(context)
            .load(url)
            .placeholder(drawable)
            .error(drawable)
            .into(imageView)
    }
}