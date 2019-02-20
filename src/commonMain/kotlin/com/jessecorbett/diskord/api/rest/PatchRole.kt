package com.jessecorbett.diskord.api.rest

import com.jessecorbett.diskord.api.model.Color
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PatchRole(
    @SerialName("name") val name: String,
    @SerialName("permissions") val permissions: Int, // TODO: convert bitwise stuff
    @SerialName("color") val color: Color,
    @SerialName("hoist") val displayedSeparately: Boolean,
    @SerialName("mentionable") val mentionable: Boolean
)
