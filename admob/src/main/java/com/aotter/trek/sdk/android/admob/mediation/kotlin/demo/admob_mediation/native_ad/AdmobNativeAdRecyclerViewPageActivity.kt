package com.aotter.trek.sdk.android.admob.mediation.kotlin.demo.admob_mediation.native_ad

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.admob.mediation.kotlin.TrekAdmobDataKey
import com.admob.mediation.kotlin.ads.TrekAdmobCustomEventNative
import com.aotter.trek.sdk.android.admob.mediation.kotlin.demo.LocalNativeAdData
import com.aotter.trek.sdk.android.admob.mediation.kotlin.demo.admob_mediation.AdmobNativeAdAdapter
import com.aotter.trek.sdk.android.admob.mediation.kotlin.demo.databinding.ActivityNativeAdRecyclerviewPageBinding
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdLoader
import com.google.android.gms.ads.AdRequest

class AdmobNativeAdRecyclerViewPageActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityNativeAdRecyclerviewPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityNativeAdRecyclerviewPageBinding.inflate(layoutInflater)

        setContentView(viewBinding.root)


        initView()

    }


    private fun initView() {

        val admobNativeAdAdapter = AdmobNativeAdAdapter()

        val linearLayoutManager = LinearLayoutManager(this)

        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL

        viewBinding.nativeAdRecyclerView.layoutManager = linearLayoutManager

        viewBinding.nativeAdRecyclerView.adapter = admobNativeAdAdapter

        val list = mutableListOf<LocalNativeAdData>()

        repeat(15) {
            list.add(
                LocalNativeAdData(
                    "幸運調色盤：12星座明天穿什麼？（6/6-6/12）",
                    "電獺少女",
                    "http://pnn.aotter.net/Media/show/d8404d54-aab7-4729-8e85-64fb6b92a84e.jpg"
                )
            )
        }

        admobNativeAdAdapter.update(list)

        loadAdmobNativeAd(admobNativeAdAdapter)

        loadAdmobNativeAd2(admobNativeAdAdapter)

    }

    private fun loadAdmobNativeAd(
        admobNativeAdAdapter: AdmobNativeAdAdapter
    ) {

        val adUnit = "ca-app-pub-8836593984677243/1855351388"

        val adLoader = AdLoader.Builder(this, adUnit)
            .forNativeAd { nativeAd ->

                admobNativeAdAdapter.update(
                    1, LocalNativeAdData(
                        nativeAd.body ?: "",
                        nativeAd.advertiser ?: "",
                        nativeAd.icon?.uri.toString(),
                        nativeAd
                    )
                )

            }
            .withAdListener(object : AdListener() {
                override fun onAdClicked() {
                    super.onAdClicked()
                    Log.i("adLoader", "onAdClicked")
                }

                override fun onAdImpression() {
                    super.onAdImpression()

                    Log.i("adLoader", "onAdImpression")

                }

                override fun onAdLoaded() {
                    super.onAdLoaded()
                    Log.i("adLoader", "onAdLoaded")
                }
            })
            .build()

        val bundle = Bundle()

        bundle.putString(TrekAdmobDataKey.CATEGORY, "news")
        bundle.putString(TrekAdmobDataKey.CONTENT_URL, "https://agirls.aotter.net/")
        bundle.putString(TrekAdmobDataKey.CONTENT_TITLE, "電獺少女")

        val adRequest = AdRequest
            .Builder()
            .addNetworkExtrasBundle(TrekAdmobCustomEventNative::class.java, bundle)
            .build()

        adLoader.loadAd(adRequest)

    }

    private fun loadAdmobNativeAd2(
        admobNativeAdAdapter: AdmobNativeAdAdapter
    ) {

        val adUnit = "ca-app-pub-8836593984677243/1855351388"

        val adLoader = AdLoader.Builder(this, adUnit)
            .forNativeAd { nativeAd ->

                admobNativeAdAdapter.update(
                    5, LocalNativeAdData(
                        nativeAd.body ?: "",
                        nativeAd.advertiser ?: "",
                        nativeAd.icon?.uri.toString(),
                        nativeAd
                    )
                )
            }
            .withAdListener(object : AdListener() {
                override fun onAdClicked() {
                    super.onAdClicked()
                    Log.i("adLoader", "onAdClicked2")
                }

                override fun onAdImpression() {
                    super.onAdImpression()

                    Log.i("adLoader", "onAdImpression2")

                }

                override fun onAdLoaded() {
                    super.onAdLoaded()
                    Log.i("adLoader", "onAdLoaded2")
                }
            })
            .build()

        val bundle = Bundle()

        bundle.putString(TrekAdmobDataKey.CATEGORY, "news")
        bundle.putString(TrekAdmobDataKey.CONTENT_URL, "https://agirls.aotter.net/")
        bundle.putString(TrekAdmobDataKey.CONTENT_TITLE, "電獺少女")

        val adRequest = AdRequest
            .Builder()
            .addNetworkExtrasBundle(TrekAdmobCustomEventNative::class.java, bundle)
            .build()

        adLoader.loadAd(adRequest)

    }


}