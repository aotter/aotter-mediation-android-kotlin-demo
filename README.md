# Mediation Example Demo
Mediation Example Demo

## Trek AdMob Mediation Example App Demo

### Trek AdMob Mediation Document
https://trek.gitbook.io/aottertrek-sdk-doc/android/admob-mediation

### Trek AdMob Mediation release change log
- 2022/06/22 release - SDK `4.6.1` (Recommend)
     - New Sensor
     -  `TrekAdLoader` instead of `TrekAd`
     - The `TrekAdLoader.loadAds()` method sends a request for multiple ads (up to 5)
     - `TrekNativeAd` instead of `AdData`
     - `TrekAds.initialize() method` instead of  `AotterService.initialize() method`
     - `TrekBannerAdView` instead of `TrekBannerView `
     - New `TrekAdViewBinder` object (Using the object register ad layout)
     - `TrekJsonObject` instead of `JsonObject`
     - Kotlinx-serialization instead of Gson
     - Updating ExoPlayer version to `2.17.1`
     - Updating Kotlin version to `1.6.21`
- 2022/06/22 release - SDK `4.5.0`
     - new TrekNativeAdImage 
     - Support vertical slide
     - Open browser with chrome
     - imp tool optimization
     - TrekMediaView optimization
     - Log optimization
- 2022/04/15 release - SDK `4.4.5`
     - Optimized implementation
     - The TrekAdmobAdViewBinder class has been removed, and the admob mediation binding view flow has been integrated into the mediation adapter.
     - Update admob mediation custom adapter ( [Migrate to SDK v21](https://developers.google.com/admob/android/migration) )
- 2022/03/28 release - Mediation `4.4.2`
     - Add `setContentUrl()` & `setContentTitle()`
     - OMSDK obstruction minor adjustment
     - Add OMSDK contentUrl and customRefencData
     - Mapping Admob mediation `hasVideoContent` parameter
- 2022/03/22 release - Mediation `4.4.0`
     - Change domain
     - Support om json tag
     - Support om js string dynamic update
     - Support webview slide
     - Improve BackgroundHolder setting
     - Update ExoPlayer
- 2021/12/23 release - Mediation `4.2.2`
     - Use Activity page instead of DialogFragment page when context came from application
- 2021/12/01 release - Mediation `4.2.1`
     - Support android 12
     - Support kotlin version 1.5.31
     - Update exoplayer
     - Adjust impression tool
     - Adjust third click event flow
     - Fix banner ad???supr.ad impression event
- 2021/09/27 release - Mediation `4.2.0`
     - Adjust om impressionType
- 2021/09/13 release - Mediation `4.1.9`
     - Optimize impression/VTR/CTR
     - Adjust TrekMediaView lifecycle
     - Adjsut TrekMediaView play video when visibility is 50% or more
     - New TrekBannerView
- 2021/08/31 release - Mediation `4.1.8`
     - Remove unneeded permission 
- 2021/08/30 release - Mediation `4.1.7`
     - Remove supr.ad third imp
- 2021/08/24 release - Mediation `4.1.6`
     - TrekMediaView default height
     - Defindes key of jsonObject
     - Add sdkVersion
     - Add mediationVersion
     - Optimization proguard
- 2021/07/16 release - Mediation `4.1.4`
     - Optimize adData
     - Adjust TrekMediaView lifecycle
- 2021/07/01 release - Mediation `4.1.3`
     - New released Trek AdMob Mediation

### Demo release change log
- 2022/07/19
    - update sample code
- 2022/04/15
    - update sample code
- 2022/03/28
    - update sample code
- 2021/07/01 
    - Add Native Ad sample code 
    - Add Supr.Ad sample code
    - Add Banner Ad sample code


## Trek MoPub Mediation Example App Demo

### Trek MoPub Mediation Document
https://trek.gitbook.io/aottertrek-sdk-doc/android/mopub-mediation

### Trek MoPub Mediation release change log
- 2021/12/01 release - Mediation `4.1.9`
     - support android 12
     - support kotlin version 1.5.31
     - update exoplayer
     - adjust impression tool
     - adjust third click event flow
     - fix banner ad???supr.ad impression event
- 2021/09/27 release - Mediation `4.1.8`
     - Adjust om impressionType
- 2021/09/13 release - Mediation `4.1.7`
     - Optimize impression/VTR/CTR
     - Adjust TrekMediaView lifecycle
     - Adjsut TrekMediaView play video when visibility is 50% or more
     - New TrekBannerView
- 2021/08/31 release - Mediation `4.1.6`
     - remove unneeded permission 
- 2021/08/30 release - Mediation `4.1.5`
     - remove supr.ad third imp
- 2021/08/24 release - Mediation `4.1.4`
     - TrekMediaView default height
     - Defindes key of jsonObject
     - Add sdkVersion
     - Add mediationVersion
     - Optimization proguard
- 2021/07/16 release - Mediation `4.1.2`
     - Optimize adData
     - Adjust TrekMediaView lifecycle
- 2021/07/01 release - Mediation `4.1.1`
     - New released Trek MoPub Mediation

### Demo release change log
- 2021/07/01 
    - Add Native Ad sample code 
    - Add Supr.Ad sample code
    - Add Banner Ad sample code
