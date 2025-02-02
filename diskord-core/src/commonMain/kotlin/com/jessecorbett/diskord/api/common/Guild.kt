package com.jessecorbett.diskord.api.common

import kotlinx.serialization.*

@Serializable
public data class Guild(
    @SerialName("id") val id: String,
    @SerialName("name") val name: String,
    @SerialName("icon") val iconHash: String?,
    @SerialName("splash") val splashHash: String?,
    @SerialName("discovery_splash") val discoverySplashHash: String?,
    @SerialName("owner") val userIsOwner: Boolean? = null,
    @SerialName("owner_id") val ownerId: String,
    @SerialName("permissions") val permissions: Permissions? = null,
    @SerialName("afk_channel_id") val afkChannelId: String?,
    @SerialName("afk_timeout") val afkTimeoutSeconds: Int,
    @SerialName("widget_enabled") val widgetEnabled: Boolean? = null,
    @SerialName("widget_channel_id") val widgetChannelId: String? = null,
    @SerialName("verification_level") val verificationLevel: VerificationLevel,
    @SerialName("default_message_notifications") val defaultMessageNotificationLevel: NotificationsLevel,
    @SerialName("explicit_content_filter") val explicitContentFilterLevel: ExplicitContentFilterLevel,
    @SerialName("roles") val roles: List<Role>,
    @SerialName("emojis") val emojis: List<Emoji>,
    @SerialName("features") val features: List<GuildFeatures>,
    @SerialName("mfa_level") val mfaLevel: MFALevel,
    @SerialName("application_id") val owningApplicationId: String?,
    @SerialName("system_channel_id") val systemMessageChannelId: String?,
    @SerialName("system_channel_flags") val systemChannelFlags: SystemChannelFlags,
    @SerialName("rules_channel_id") val rulesChannelId: String?,
    @SerialName("max_presences") val maxPresences: Int? = null,
    @SerialName("max_members") val maxMembers: Int? = null,
    @SerialName("vanity_url_code") val vanityCodeUrl: String?,
    @SerialName("description") val description: String?,
    @SerialName("banner") val bannerHash: String?,
    @SerialName("premium_tier") val premiumType: GuildPremiumType,
    @SerialName("premium_subscription_count") val guildBoostCount: Int? = null,
    @SerialName("preferred_locale") val preferredLocale: String,
    @SerialName("public_updates_channel_id") val publicUpdatesChannelId: String?,
    @SerialName("max_video_channel_users") val maxVideoChannelUsers: Int? = null,
    @SerialName("approximate_member_count") val approximateMemberCount: Int? = null,
    @SerialName("approximate_presence_count") val approximatePresenceCount: Int? = null,
    @SerialName("welcome_screen") val welcomeScreen: WelcomeScreen? = null,
    @SerialName("nsfw_level") val nsfwLevel: GuildNSFWLevel,
    @SerialName("stage_instances") val stageInstances: List<StageInstance>? = null,
    @SerialName("stickers") val sticker: List<Sticker>? = null,
)

@Serializable
public enum class VerificationLevel {
    @SerialName("0") NONE,
    @SerialName("1") LOW,
    @SerialName("2") MEDIUM,
    @SerialName("3") HIGH,
    @SerialName("4") VERY_HIGH
}

@Serializable
public enum class NotificationsLevel {
    @SerialName("0") ALL_MESSAGES,
    @SerialName("1") ONLY_MENTIONS
}

@Serializable
public enum class ExplicitContentFilterLevel {
    @SerialName("0") DISABLED,
    @SerialName("1") MEMBERS_WITHOUT_ROLES,
    @SerialName("2") ALL_MEMBERS
}

public enum class GuildFeatures {
    ANIMATED_ICON,
    BANNER,
    COMMERCE,
    COMMUNITY,
    DISCOVERABLE,
    FEATURABLE,
    INVITE_SPLASH,
    MEMBER_VERIFICATION_GATE_ENABLED,
    NEWS,
    PARTNERED,
    PREVIEW_ENABLED,
    VANITY_URL,
    VERIFIED,
    VIP_REGIONS,
    WELCOME_SCREEN_ENABLED,
    TICKETED_EVENTS_ENABLED,
    MONETIZATION_ENABLED,
    MORE_STICKERS,
    THREE_DAY_THREAD_ARCHIVE,
    SEVEN_DAY_THREAD_ARCHIVE,
    PRIVATE_THREADS
}

@Serializable
public enum class GuildPremiumType(public val code: Int) {
    @SerialName("0") NONE(0),
    @SerialName("1") TIER_1(1),
    @SerialName("2") TIER_2(2),
    @SerialName("2") TIER_3(3)
}

@Serializable
public enum class MFALevel {
    @SerialName("0") NONE,
    @SerialName("1") ELEVATED
}

@Serializable
public data class WelcomeScreen(
    @SerialName("description") val description: String?,
    @SerialName("welcome_channels") val welcomeChannels: List<WelcomeScreenChannel>
)

@Serializable
public data class WelcomeScreenChannel(
    @SerialName("channel_id") val channelId: String,
    @SerialName("description") val description: String,
    @SerialName("emoji_id") val emojiId: String?,
    @SerialName("emoji_name") val emojiName: String?
)

@Serializable
public enum class GuildNSFWLevel {
    @SerialName("0") DEFAULT,
    @SerialName("1") EXPLICIT,
    @SerialName("2") SAFE,
    @SerialName("3") AGE_RESTRICTED,
}

@Serializable
public data class StageInstance(
    @SerialName("id") val id: String,
    @SerialName("guild_id") val guildId: String,
    @SerialName("channel_id") val channelId: String,
    @SerialName("topic") val topic: String,
    @SerialName("privacy_level") val privacyLevel: StagePrivacyLevel,
    @SerialName("discoverable_disabled") val discoverable_disabled: Boolean,
)

@Serializable
public enum class StagePrivacyLevel {
    @SerialName("1") PUBLIC,
    @SerialName("2") GUILD_ONLY,
}
