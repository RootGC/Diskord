package com.jessecorbett.diskord.api.websocket.events

import kotlinx.serialization.Optional
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChannelPinUpdate(
    @SerialName("channel_id") val channelId: String,
    @Optional @SerialName("last_pin_timestamp") val lastPinAt: String? = null
)
