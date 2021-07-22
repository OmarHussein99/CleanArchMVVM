package com.icon.cleanarchmvvm


import com.squareup.moshi.Json

data class GetCharacterByIdResponse(
    @Json(name = "created")
    val created: String = "",
    @Json(name = "episode")
    val episode: List<Any> = listOf(),
    @Json(name = "gender")
    val gender: String = "",
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "image")
    val image: String = "",
    @Json(name = "location")
    val location: Location = Location(),
    @Json(name = "name")
    val name: String = "",
    @Json(name = "origin")
    val origin: Origin = Origin(),
    @Json(name = "species")
    val species: String = "",
    @Json(name = "status")
    val status: String = "",
    @Json(name = "type")
    val type: String = "",
    @Json(name = "url")
    val url: String = ""
) {
    data class Location(
        @Json(name = "name")
        val name: String = "",
        @Json(name = "url")
        val url: String = ""
    )

    data class Origin(
        @Json(name = "name")
        val name: String = "",
        @Json(name = "url")
        val url: String = ""
    )
}