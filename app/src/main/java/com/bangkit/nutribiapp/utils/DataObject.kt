package com.bangkit.nutribiapp.utils

import com.bangkit.nutribiapp.model.LoginResponse
import com.bangkit.nutribiapp.model.RegisterRequest
import com.bangkit.nutribiapp.model.SearchIngredientItemResponse
import com.bangkit.nutribiapp.model.SearchRecipeItemResponse

object DataObject {

    var loginResponse = LoginResponse()
    var registerRequest = RegisterRequest()

    var searchRecipeResponse = mutableSetOf<SearchIngredientItemResponse>()
}