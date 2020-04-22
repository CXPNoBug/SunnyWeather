package com.cxp.sunnyweather

import android.app.Application
import android.content.Context

/**
 * 文 件 名: SunnyWeatherApplication
 * 创 建 人: CXP
 * 创建日期: 2020-04-22 21:24
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
class SunnyWeatherApplication : Application() {

    companion object {
        lateinit var context: Context

        const val TOKEN = "tjaAyqvpxqDZbl0hF"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}