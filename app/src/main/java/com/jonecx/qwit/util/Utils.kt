package com.jonecx.qwit.util

import android.net.Uri
import android.os.Build
import android.text.format.DateUtils
import android.text.format.DateUtils.SECOND_IN_MILLIS
import android.text.format.DateUtils.WEEK_IN_MILLIS
import com.jonecx.qwit.BuildConfig
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter


private val oneSecond = 1000L
private val oneMinute = oneSecond * 60
private val oneHour = oneMinute * 60
private val oneDay = oneHour * 24
private val twoDay = oneDay * 2
fun Uri?.isAuthCallback(): Boolean {
    return this != null && this.toString().contains(BuildConfig.CALLBACK_URL)
}

fun String?.orString(text: String): String =
    if (this != null && this.isNotBlank() && this.isNotEmpty()) this else text

fun isOS12() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S

// TODO: Fix time like 50s, 1d, 4d, dd/mmm/yy if (more than one week)
fun String.toDate(): String {

    val originalDateFormat = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss Z yyyy")
    val localDateTime = LocalDateTime.parse(this, originalDateFormat)

    val dateTimeMillis: Long = localDateTime
        .atZone(ZoneOffset.UTC)
        .toInstant()
        .toEpochMilli()
    return DateUtils.getRelativeTimeSpanString(dateTimeMillis, System.currentTimeMillis(), SECOND_IN_MILLIS).toString()
}
