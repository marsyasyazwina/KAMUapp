package com.marsya.idn.kamuapp.data

import com.marsya.idn.kamuapp.R

object MakeUpDataObject {

    private val makeUpImage = intArrayOf(
        R.drawable.check_heat_gel_cream_blush,
        R.drawable.dream_mousse_blush,
        R.drawable.fitt_me_fondation,
        R.drawable.glaze,
        R.drawable.lip_balm_maybelline_baby_lips,
        R.drawable.lip_balm_maybelline_baby_lips_loves_color,
        R.drawable.maybelline_fit_me_liquid_concealer,
        R.drawable.maybelline_new_york_ace_studio_master_glaze_listen_blush_tick,
        R.drawable.maybelline_instant_age_rewind,
        R.drawable.maybelline_new_york_sky_high_washable_mascara
    )

    val listData : ArrayList<MakeUpData>
    get() {
        val list = arrayListOf<MakeUpData>()
        for (position in makeUpImage.indices){
            val makeUp = MakeUpData()
            makeUp.photo = makeUpImage[position]
            list.add(makeUp)
        }
        return list
    }
}