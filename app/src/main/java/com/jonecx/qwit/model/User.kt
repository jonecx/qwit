package com.jonecx.qwit.model

import com.squareup.moshi.Json

data class User(
    @field:Json(name = "id")
    val id: Long,
    @field:Json(name = "id_str")
    val idStr: String,
    @field:Json(name = "name")
    val name: String,
    @field:Json(name = "screen_name")
    val screenName: String,
    @field:Json(name = "location")
    val location: String?,
    @field:Json(name = "derived")
    val derived: List<Location>?,
    @field:Json(name = "entities")
    val userEntities: UserEntity?,
    @field:Json(name = "url")
    val url: String?,
    @field:Json(name = "description")
    val description: String?,
    @field:Json(name = "protected")
    val isProtected: Boolean,
    @field:Json(name = "verified")
    val isVerified: Boolean,
    @field:Json(name = "followers_count")
    val followersCount: Int,
    @field:Json(name = "friends_count")
    val friendsCount: Int,
    @field:Json(name = "listed_count")
    val listedCount: Int,
    @field:Json(name = "favourites_count")
    val favoritesCount: Int,
    @field:Json(name = "statuses_count")
    val statusCount: Int,
    @field:Json(name = "status")
    val tweet: Tweet?,
    @field:Json(name = "created_at")
    val createdAt: String,
    @field:Json(name = "has_extended_profile")
    val hasExtendedProfile: Boolean,
    @field:Json(name = "profile_banner_url")
    val profileBannerUrl: String,
    @field:Json(name = "profile_image_url_https")
    val profileImageUrlHttps: String,
    @field:Json(name = "default_profile")
    val hasDefaultProfile: Boolean,
    @field:Json(name = "default_profile_image")
    val hasDefaultProfileImage: Boolean,
    @field:Json(name = "profile_background_color")
    val profileBackgroundColor: String,
    @field:Json(name = "profile_background_image_url")
    val profileBackgroundImageUrl: String,
    @field:Json(name = "profile_background_image_url_https")
    val profileBackgroundImageUrlHttps: String,
    @field:Json(name = "profile_background_tile")
    val isProfileBackgroundTiled: Boolean,
    @field:Json(name = "profile_image_url")
    val profileImageUrl: String,
    @field:Json(name = "profile_link_color")
    val profileLinkColor: String,
    @field:Json(name = "profile_sidebar_border_color")
    val profileSidebarBorderColor: String,
    @field:Json(name = "profile_sidebar_fill_color")
    val profileSidebarFillColor: String,
    @field:Json(name = "profile_text_color")
    val profileTextColor: String,
    @field:Json(name = "profile_use_background_image")
    val doesProfileUseBackgroundImage: Boolean,
    @field:Json(name = "following")
    val isFollowing: Boolean,
    @field:Json(name = "follow_request_sent")
    val isFollowRequestSent: Boolean,
    @field:Json(name = "notifications")
    val notifications: Boolean,
    @field:Json(name = "translator_type")
    val translatorType: String,
    @field:Json(name = "withheld_in_countries")
    val withheldInCountries: List<String>,
    @field:Json(name = "suspended")
    val isSuspended: Boolean,
    @field:Json(name = "needs_phone_verification")
    val needsPhoneVerification: Boolean,
    @field:Json(name = "contributors_enabled")
    val areContributorsEnabled: Boolean,
    @field:Json(name = "is_translator")
    val isTranslator: Boolean,
    @field:Json(name = "is_translation_enabled")
    val isTranslatorEnabled: Boolean,
)
