package com.cxp.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * 文 件 名: PlacResponse
 * 创 建 人: CXP
 * 创建日期: 2020-04-22 21:39
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)