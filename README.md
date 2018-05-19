# Google I/O :Instant Apps

[![N|Solid](https://developer.android.com/images/kotlin/android-and-kotlin.png)](https://nodesource.com/products/nsolid)

Google I/O: AdMob, Kotlin e InstantApps

### Instrucciones

- Tener instalado [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html/).
- Tener instalado [Android Studio](https://www.jetbrains.com/idea/).
- Importar o descargar el repositorio.

### Pasos

0. Copiamos el siguiente código en nuestro MainActivity.xml el cual es el diseño de nuestro demo.

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

Diapositivas: [Instant Apps.pdf](https://drive.google.com/open?id=1eItFsCLM0b7Lxd8qmzB-uJE1G8oHU-ID).
