package com.malibin.acnh.wiki.data.entity

// Rug
// Floor
// Wallpaper

class HouseFurniture(
    id: Int,
    nameKor: String,
    nameEng: String,
    imageUrl: String,
    buyCost: Int?,
    sellPrice: Int,
    source: String,
    sourceNote: String,
    colors: List<String>,
    available: String,
    canDiy: Boolean,
    size: String,
    milesPrice: Int?,
    dType: Type
) : Item(
    id = id,
    nameKor = nameKor,
    nameEng = nameEng,
    imageUrl = imageUrl,
    buyCost = buyCost,
    sellPrice = sellPrice,
    source = source,
    sourceNote = sourceNote,
    colors = colors,
    available = available,
    canDiy = canDiy,
    size = size,
    milesPrice = milesPrice,
    dType = dType
) {
    override fun toString(): String {
        return "HouseFurniture() $dType ${super.toString()} "
    }
}