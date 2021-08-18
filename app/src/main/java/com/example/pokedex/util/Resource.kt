package com.example.pokedex.util

//    제네릭 사용 알맞는 데이터형
sealed class Resource<T>(val data: T? = null, val message: String? = null){
    class Success<T>(data : T) : Resource<T>(data)
    class Error<T>(message: String?, data: T? = null) : Resource<T>(data,message)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}
