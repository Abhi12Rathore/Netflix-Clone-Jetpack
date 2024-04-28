package com.example.netflixclone.views.homeScreenViews

import androidx.compose.runtime.Composable
import com.example.netflixclone.R
import com.example.netflixclone.models.HomeScreenData

@Composable
fun Carousal() {

}

fun getCarousalData(): List<HomeScreenData>? {
    val homeCarousalData: MutableList<HomeScreenData>? = null;

    val list1 = ArrayList<Int>()
    list1.add(R.drawable.m1)
    list1.add(R.drawable.m2)
    list1.add(R.drawable.m3)
    list1.add(R.drawable.m1)
    list1.add(R.drawable.m2)
    var homeScreenData1 = HomeScreenData("Popular on Netflix", list1)

    val list2 = ArrayList<Int>()
    list2.add(R.drawable.m4)
    list2.add(R.drawable.m5)
    list2.add(R.drawable.m6)
    list2.add(R.drawable.m4)
    list2.add(R.drawable.m5)
    var homeScreenData2 = HomeScreenData("Trending Now", list2)


    val list3 = ArrayList<Int>()
    list3.add(R.drawable.m7)
    list3.add(R.drawable.m8)
    list3.add(R.drawable.m9)
    list3.add(R.drawable.m7)
    list3.add(R.drawable.m8)
    var homeScreenData3 = HomeScreenData("Top 10 in Nigeria Today", list3)


    val list4 = ArrayList<Int>()
    list4.add(R.drawable.m10)
    list4.add(R.drawable.m11)
    list4.add(R.drawable.m12)
    list4.add(R.drawable.m10)
    list4.add(R.drawable.m11)
    var homeScreenData4 = HomeScreenData("My List", list4)


    val list5 = ArrayList<Int>()
    list5.add(R.drawable.m13)
    list5.add(R.drawable.m14)
    list5.add(R.drawable.m15)
    list5.add(R.drawable.m14)
    list5.add(R.drawable.m13)
    var homeScreenData5 = HomeScreenData("Africans Movies", list5)


    val list6 = ArrayList<Int>()
    list6.add(R.drawable.m16)
    list6.add(R.drawable.m17)
    list6.add(R.drawable.m18)
    list6.add(R.drawable.m16)
    list6.add(R.drawable.m18)
    var homeScreenData6 = HomeScreenData("Movies & TV", list6)



    homeCarousalData?.add(homeScreenData1)
    homeCarousalData?.add(homeScreenData2)
    homeCarousalData?.add(homeScreenData3)
    homeCarousalData?.add(homeScreenData4)
    homeCarousalData?.add(homeScreenData5)
    homeCarousalData?.add(homeScreenData6)


    return homeCarousalData
}