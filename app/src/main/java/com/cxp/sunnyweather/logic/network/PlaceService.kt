package com.cxp.sunnyweather.logic.network

import com.cxp.sunnyweather.SunnyWeatherApplication
import com.cxp.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * 文 件 名: PlaceService
 * 创 建 人: CXP
 * 创建日期: 2020-04-22 21:42
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}