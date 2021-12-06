package com.example.msdk
import java.util.*

object  RandomMovie{
    private  val list= listOf("The Dark Night 2008","INCEPTION","PARASITE","The God Father","Fight Club")
    fun get(): Movie {
        return Movie(Random().nextInt(100-1),list.get(Random().nextInt(5-0)))
    }
}