package com.devtides.recyclerviewproject

object DataProvider {
    fun provideData(): List<Animal> {
        val finalList = arrayListOf<Animal>()
        finalList.add(Animal(R.drawable.a1_bison))
        finalList.add(Animal(R.drawable.a2_cat))
        finalList.add(Animal(R.drawable.a3_cow))
        finalList.add(Animal(R.drawable.a4_dog))
        finalList.add(Animal(R.drawable.a5_donkey))
        finalList.add(Animal(R.drawable.a6_goat))
        finalList.add(Animal(R.drawable.a7_hen))
        finalList.add(Animal(R.drawable.a8_horse))
        finalList.add(Animal(R.drawable.a9_lama))
        finalList.add(Animal(R.drawable.a10_pig))
        finalList.add(Animal(R.drawable.a11_rabbit))
        finalList.add(Animal(R.drawable.a12_sheep))
        finalList.add(Animal(R.drawable.a13_turkey))
        finalList.add(Animal(R.drawable.a14_goose))
        finalList.add(Animal(R.drawable.a15_duck))
        finalList.add(Animal(R.drawable.a16_rooster))
        finalList.add(Animal(R.drawable.a17_rat))
        finalList.add(Animal(R.drawable.a18_bear))
        finalList.add(Animal(R.drawable.a19_fox))
        finalList.add(Animal(R.drawable.a20_deer))
        finalList.add(Animal(R.drawable.a21_wolf))
        finalList.add(Animal(R.drawable.a22_frog))
        finalList.add(Animal(R.drawable.a23_owl))
        finalList.add(Animal(R.drawable.a24_hedgehog))
        finalList.add(Animal(R.drawable.a25_mole))
        return finalList
    }

    fun provideReversedData(): List<Animal> = provideData().reversed()
}