# Google I/O :Instant Apps

[![N|Solid](https://developer.android.com/images/kotlin/android-and-kotlin.png)](https://nodesource.com/products/nsolid)

Google I/O: AdMob, Kotlin e InstantApps

### Instrucciones

- Tener instalado [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html/).
- Tener instalado [Android Studio](https://www.jetbrains.com/idea/).
- Importar o descargar el repositorio.

### Pasos

0. Copiamos el siguiente código en nuestro activit_main.xml el cual es el diseño de nuestro demo.

```xml
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/colorPrimary"
    tools:context="com.brayanmamani.instantapp.feature.MainActivity">

    <TextView
        android:id="@+id/app_title"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="50dp"
        android:text="Hola"
        android:textColor="#fff"
        android:textSize="50sp"/>

    <ImageView
        android:id="@+id/ivFoto"
        android:layout_width="150dp"
        android:layout_height="150dp"
        android:layout_below="@+id/app_title"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="29dp"
        android:src="@drawable/personas"/>

    <TextView
        android:id="@+id/app_contenido"
        android:layout_margin="18dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/ivFoto"
        android:layout_centerHorizontal="true"
        android:text="@string/app_hola"
        android:textColor="#fff"
        android:textSize="22sp"
        android:gravity="center"/>

    <android.support.design.widget.FloatingActionButton
        android:id="@+id/next_level_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginBottom="42dp"
        android:clickable="true"
        app:srcCompat="@drawable/next" />

</RelativeLayout>
```
1. Copiamos el siguiente código en nuestro MainActivity.kt .

```kotlin
supportActionBar!!.hide()
```

2. Copiamos el siguiente código en nuestro MainActivity.kt .

```kotlin
fabNext = findViewById<View>(R.id.next_level_button) as FloatingActionButton
app_title = findViewById<View>(R.id.app_title) as TextView
app_contenido = findViewById<View>(R.id.app_contenido) as TextView
ivFoto = findViewById<View>(R.id.ivFoto) as ImageView
```

3. Copiamos el siguiente código en nuestro MainActivity.kt .

```kotlin
fabNext!!.isEnabled = false
fabNext!!.setOnClickListener { showInterstitial() }
```

4. Copiamos el siguiente código en nuestro MainActivity.kt .

```kotlin
mLevel = START_LEVEL
```

5. Copiamos el siguiente código en nuestro MainActivity.kt .

```kotlin
mInterstitialAd = newInterstitialAd()
loadInterstitial()
```

6. Copiamos el siguiente código en nuestro MainActivity.kt .

```kotlin
private fun newInterstitialAd(): InterstitialAd {
    val interstitialAd = InterstitialAd(this)
      interstitialAd.adUnitId = getString(R.string.interstitial_ad_unit_id)
        interstitialAd.adListener = object : AdListener() {
            override fun onAdLoaded() {
                fabNext!!.isEnabled = true
            }

            override fun onAdFailedToLoad(errorCode: Int) {
                fabNext!!.isEnabled = true
            }

            override fun onAdClosed() {
                goToNextLevel()
            }
      }
      return interstitialAd
}
```

7. Copiamos el siguiente código en nuestro MainActivity.kt .

```kotlin
private fun loadInterstitial() {
      fabNext!!.isEnabled = false
        val adRequest = AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build()
      mInterstitialAd!!.loadAd(adRequest)
}
```

8. Copiamos el siguiente código en nuestro MainActivity.kt .

```kotlin
private fun showInterstitial() {
     if (mInterstitialAd != null && mInterstitialAd!!.isLoaded) {
          mInterstitialAd!!.show()
     } else {
          Toast.makeText(this, "Add no Cargado", Toast.LENGTH_SHORT).show()
          goToNextLevel()
     }
}
```

9. Copiamos el siguiente código en nuestro MainActivity.kt .

```kotlin
private fun goToNextLevel() {
     if (mLevel == 0) {
          app_title!!.text = "Hola"
          app_contenido!!.setText(R.string.app_hola)
          ivFoto!!.setImageResource(R.drawable.personas)
     }
     if (mLevel == 1) {
          app_title!!.text = "Dog"
          app_contenido!!.setText(R.string.app_dog)
          ivFoto!!.setImageResource(R.drawable.dog)
     }
     if (mLevel == 2) {
          app_title!!.text = "Cat"
          app_contenido!!.setText(R.string.app_cat)
          ivFoto!!.setImageResource(R.drawable.cat)
     }
     if (mLevel == 3) {
          app_title!!.text = "Fish"
          app_contenido!!.setText(R.string.app_pez)
          ivFoto!!.setImageResource(R.drawable.fish)
          mLevel = -1
     }
     ++mLevel
     mInterstitialAd = newInterstitialAd()
     loadInterstitial()
}
```
Diapositivas: [Instant Apps.pdf](https://drive.google.com/open?id=1eItFsCLM0b7Lxd8qmzB-uJE1G8oHU-ID).
