package com.example.shoplist.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)
    fun getShopItem(id: Int): ShopItem
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopList(): List<ShopItem>
}