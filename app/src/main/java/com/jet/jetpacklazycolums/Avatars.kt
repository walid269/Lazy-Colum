package com.jet.jetpacklazycolums

data class Avatars(
    var firstname : String,
    var lastname : String,
    var image : Int
)


fun getAllAvatars() : List<Avatars>
{
    return listOf<Avatars>(
        Avatars("Imam","Ali", R.drawable.a),
        Avatars("Fatima","Zahra", R.drawable.b),
        Avatars("Malala","Yousafzai", R.drawable.c),
        Avatars("Rumi","Jalaluddin", R.drawable.d),
        Avatars("Muhammad","Ali", R.drawable.e),
        Avatars("Noor","Inayat Khan", R.drawable.f),
        Avatars("Ahmed","Zewail", R.drawable.g),
        Avatars("Yusuf","Islam", R.drawable.g),
        Avatars("Salman","al-Farsi", R.drawable.h),
        Avatars("Musa","al-Kadhim", R.drawable.i),
        Avatars("Salahuddin","Ayyubi", R.drawable.j),
        Avatars("Nadia","Yassir", R.drawable.k),
        Avatars("Afnan","Ahmed", R.drawable.profile),
        Avatars("Elon","Musk", R.drawable.a),
        Avatars("Steve","Jobs", R.drawable.b),
        Avatars("Bill","Gates", R.drawable.c),
        Avatars("Mark","Zuckerberg", R.drawable.d),
        Avatars("Jeff","Bezos", R.drawable.e),
        Avatars("Sundar","Pichai", R.drawable.f),
        Avatars("Satya","Nadella", R.drawable.g),
        Avatars("Tim","Cook", R.drawable.g),
        Avatars("Warren","Buffett", R.drawable.h),
        Avatars("Oprah","Winfrey", R.drawable.i),
        Avatars("Barack","Obama", R.drawable.j),
        Avatars("Nelson","Mandela", R.drawable.k),
        Avatars("Elon","Musk", R.drawable.profile),
        Avatars("Steve","Jobs", R.drawable.a),
        Avatars("Bill","Gates", R.drawable.c),
        Avatars("Mark","Zuckerberg", R.drawable.a),



    )
}