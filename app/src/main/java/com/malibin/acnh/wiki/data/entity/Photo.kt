package com.malibin.acnh.wiki.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.malibin.acnh.wiki.data.ItemType

/**
 * Created By Malibin
 * on 6월 13, 2020
 */

@Entity
data class Photo(
    @PrimaryKey
    val id: Int,
    val nameKor: String,
    val nameEng: String,
    val imageUrl: String,
    val buyCost: Int?,
    val sellPrice: Int,
    val source: String,
    val sourceNote: String,
    val colors: List<String>,
    val available: String,
    val canDiy: Boolean,
    val size: String,
    val milesPrice: Int?,
    val itemType: ItemType,
    val variantId: String,
    val variationName: String,
    val bodyTitle: String,
    val patternName: String,
    val patternTitle: String,
    val kitCost: Int,
    val canBodyCustom: Boolean,
    var collected: Boolean = false,
    var wished: Boolean = false
)