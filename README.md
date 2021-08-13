# HuaweiService Demo

This demo project enables parts of Huawei HMS and AGC services in Unity for Android Build, which is implemented by wrapping HMS and AGC SDK. Name and usage of corresponding classes and functions are the same with Huawei.

The following Kits included.
- HMS
    - Game Service
    - Ads
    - Push
    - Location
    - Analytics
- AGC
    - App Linking
    - App Messaging
    - Remote Configuration
    - APM
    - Crash
    - Auth Service
    - Cloud Functions
    - Cloud Storage
    - Cloud DB

***Unity 2019 or higher***

***Before build, add your keystore, create huawei agc project and put `agconnect-services.json` under `Assets/Plugins/Android/`***

key store path `Edit -> Project Settings -> Player -> Android(icon) -> Publishing Settings`

In location test, before you click `CreateGeo` button, you should click `update with callback-102` to get your position.

***Please check the documentation folder or visite the [documentation webpages](https://docs.unity.cn/cn/Packages-cn/com.unity.huaweiservice@2.1/manual/) 
