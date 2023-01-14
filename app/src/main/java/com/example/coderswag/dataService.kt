package com.example.coderswag

import com.example.coderswag.Model.category
import com.example.coderswag.Model.product

object dataService {
    val categories= listOf(
        category("HATS","hatimage"),
        category("HOODIE","hoodieimage"),
        category("SHIRT","shirtImage"),
        category("DIGITALGOODSIMAGE","digitalgoodsimage")

    )
    val hats= listOf(
        product("Bennie","Rs.170","hat1"),
        product("black","Rs.200","hat2"),
        product("white","Rs.250","hat3"),
        product("black and red","Rs.250","hat4")
    )
    val digitalGoods= listOf(
        product()
    )
    val hoodies= listOf(
        product("black","Rs.1350","hoodie1"),
        product("red","Rs.1245","hoodie2"),
        product("grey","Rs.1345","hoodie3"),
        product("black dark","Rs.1500","hoodie4"),


    )
    val shirts= listOf(
        product("black","Rs.350","shirt1"),
        product("white","Rs.245","shirt2"),
        product("red","Rs.345","shirt3"),
        product("grey","Rs.760","shirt4"),
        product("black dark","Rs.500","shirt5"),


    )



}