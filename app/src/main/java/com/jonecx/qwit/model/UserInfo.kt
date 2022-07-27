package com.jonecx.qwit.model

import com.squareup.moshi.Json

data class UserInfo(
    @Json(name = "id")
    val id: Int,
    @Json(name = "id_str")
    val idStr: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "screen_name")
    val screenName: String,
    @Json(name = "location")
    val location: String,
    @Json(name = "description")
    val description: String,
    @Json(name = "url")
    val url: String,
    @Json(name = "entities")
    val entities: Entities,
    @Json(name = "protected")
    val `protected`: Boolean,
    @Json(name = "followers_count")
    val followersCount: Int,
    @Json(name = "friends_count")
    val friendsCount: Int,
    @Json(name = "listed_count")
    val listedCount: Int,
    @Json(name = "created_at")
    val createdAt: String,
    @Json(name = "favourites_count")
    val favouritesCount: Int,
    @Json(name = "utc_offset")
    val utcOffset: Any,
    @Json(name = "time_zone")
    val timeZone: Any,
    @Json(name = "geo_enabled")
    val geoEnabled: Boolean,
    @Json(name = "verified")
    val verified: Boolean,
    @Json(name = "statuses_count")
    val statusesCount: Int,
    @Json(name = "lang")
    val lang: Any,
    @Json(name = "status")
    val status: Status,
    @Json(name = "contributors_enabled")
    val contributorsEnabled: Boolean,
    @Json(name = "is_translator")
    val isTranslator: Boolean,
    @Json(name = "is_translation_enabled")
    val isTranslationEnabled: Boolean,
    @Json(name = "profile_background_color")
    val profileBackgroundColor: String,
    @Json(name = "profile_background_image_url")
    val profileBackgroundImageUrl: String,
    @Json(name = "profile_background_image_url_https")
    val profileBackgroundImageUrlHttps: String,
    @Json(name = "profile_background_tile")
    val profileBackgroundTile: Boolean,
    @Json(name = "profile_image_url")
    val profileImageUrl: String,
    @Json(name = "profile_image_url_https")
    val profileImageUrlHttps: String,
    @Json(name = "profile_banner_url")
    val profileBannerUrl: String,
    @Json(name = "profile_link_color")
    val profileLinkColor: String,
    @Json(name = "profile_sidebar_border_color")
    val profileSidebarBorderColor: String,
    @Json(name = "profile_sidebar_fill_color")
    val profileSidebarFillColor: String,
    @Json(name = "profile_text_color")
    val profileTextColor: String,
    @Json(name = "profile_use_background_image")
    val profileUseBackgroundImage: Boolean,
    @Json(name = "has_extended_profile")
    val hasExtendedProfile: Boolean,
    @Json(name = "default_profile")
    val defaultProfile: Boolean,
    @Json(name = "default_profile_image")
    val defaultProfileImage: Boolean,
    @Json(name = "following")
    val following: Boolean,
    @Json(name = "follow_request_sent")
    val followRequestSent: Boolean,
    @Json(name = "notifications")
    val notifications: Boolean,
    @Json(name = "translator_type")
    val translatorType: String,
    @Json(name = "withheld_in_countries")
    val withheldInCountries: List<Any>,
    @Json(name = "suspended")
    val suspended: Boolean,
    @Json(name = "needs_phone_verification")
    val needsPhoneVerification: Boolean
) {
    data class Entities(
        @Json(name = "description")
        val description: Description
    ) {
        data class Description(
            @Json(name = "urls")
            val urls: List<Any>
        )
    }

    data class Status(
        @Json(name = "created_at")
        val createdAt: String,
        @Json(name = "id")
        val id: Long,
        @Json(name = "id_str")
        val idStr: String,
        @Json(name = "text")
        val text: String,
        @Json(name = "truncated")
        val truncated: Boolean,
        @Json(name = "entities")
        val entities: Entities,
        @Json(name = "source")
        val source: String,
        @Json(name = "in_reply_to_status_id")
        val inReplyToStatusId: Any,
        @Json(name = "in_reply_to_status_id_str")
        val inReplyToStatusIdStr: Any,
        @Json(name = "in_reply_to_user_id")
        val inReplyToUserId: Any,
        @Json(name = "in_reply_to_user_id_str")
        val inReplyToUserIdStr: Any,
        @Json(name = "in_reply_to_screen_name")
        val inReplyToScreenName: Any,
        @Json(name = "geo")
        val geo: Any,
        @Json(name = "coordinates")
        val coordinates: Any,
        @Json(name = "place")
        val place: Any,
        @Json(name = "contributors")
        val contributors: Any,
        @Json(name = "retweeted_status")
        val retweetedStatus: RetweetedStatus,
        @Json(name = "is_quote_status")
        val isQuoteStatus: Boolean,
        @Json(name = "retweet_count")
        val retweetCount: Int,
        @Json(name = "favorite_count")
        val favoriteCount: Int,
        @Json(name = "favorited")
        val favorited: Boolean,
        @Json(name = "retweeted")
        val retweeted: Boolean,
        @Json(name = "lang")
        val lang: String
    ) {
        data class Entities(
            @Json(name = "hashtags")
            val hashtags: List<Hashtag>,
            @Json(name = "symbols")
            val symbols: List<Any>,
            @Json(name = "user_mentions")
            val userMentions: List<UserMention>,
            @Json(name = "urls")
            val urls: List<Any>
        ) {
            data class Hashtag(
                @Json(name = "text")
                val text: String,
                @Json(name = "indices")
                val indices: List<Int>
            )

            data class UserMention(
                @Json(name = "screen_name")
                val screenName: String,
                @Json(name = "name")
                val name: String,
                @Json(name = "id")
                val id: Long,
                @Json(name = "id_str")
                val idStr: String,
                @Json(name = "indices")
                val indices: List<Int>
            )
        }

        data class RetweetedStatus(
            @Json(name = "created_at")
            val createdAt: String,
            @Json(name = "id")
            val id: Long,
            @Json(name = "id_str")
            val idStr: String,
            @Json(name = "text")
            val text: String,
            @Json(name = "truncated")
            val truncated: Boolean,
            @Json(name = "entities")
            val entities: Entities,
            @Json(name = "source")
            val source: String,
            @Json(name = "in_reply_to_status_id")
            val inReplyToStatusId: Any,
            @Json(name = "in_reply_to_status_id_str")
            val inReplyToStatusIdStr: Any,
            @Json(name = "in_reply_to_user_id")
            val inReplyToUserId: Any,
            @Json(name = "in_reply_to_user_id_str")
            val inReplyToUserIdStr: Any,
            @Json(name = "in_reply_to_screen_name")
            val inReplyToScreenName: Any,
            @Json(name = "geo")
            val geo: Any,
            @Json(name = "coordinates")
            val coordinates: Any,
            @Json(name = "place")
            val place: Any,
            @Json(name = "contributors")
            val contributors: Any,
            @Json(name = "is_quote_status")
            val isQuoteStatus: Boolean,
            @Json(name = "retweet_count")
            val retweetCount: Int,
            @Json(name = "favorite_count")
            val favoriteCount: Int,
            @Json(name = "favorited")
            val favorited: Boolean,
            @Json(name = "retweeted")
            val retweeted: Boolean,
            @Json(name = "possibly_sensitive")
            val possiblySensitive: Boolean,
            @Json(name = "lang")
            val lang: String
        ) {
            data class Entities(
                @Json(name = "hashtags")
                val hashtags: List<Hashtag>,
                @Json(name = "symbols")
                val symbols: List<Any>,
                @Json(name = "user_mentions")
                val userMentions: List<Any>,
                @Json(name = "urls")
                val urls: List<Url>
            ) {
                data class Hashtag(
                    @Json(name = "text")
                    val text: String,
                    @Json(name = "indices")
                    val indices: List<Int>
                )

                data class Url(
                    @Json(name = "url")
                    val url: String,
                    @Json(name = "expanded_url")
                    val expandedUrl: String,
                    @Json(name = "display_url")
                    val displayUrl: String,
                    @Json(name = "indices")
                    val indices: List<Int>
                )
            }
        }
    }
}
