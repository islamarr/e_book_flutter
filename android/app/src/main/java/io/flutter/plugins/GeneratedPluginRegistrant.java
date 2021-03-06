package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
      com.shatsy.admobflutter.AdmobFlutterPlugin.registerWith(shimPluginRegistry.registrarFor("com.shatsy.admobflutter.AdmobFlutterPlugin"));
      dev.gilder.tom.apple_sign_in.AppleSignInPlugin.registerWith(shimPluginRegistry.registrarFor("dev.gilder.tom.apple_sign_in.AppleSignInPlugin"));
      xyz.luan.audioplayers.AudioplayersPlugin.registerWith(shimPluginRegistry.registrarFor("xyz.luan.audioplayers.AudioplayersPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.connectivity.ConnectivityPlugin());
      com.jideguru.epub_viewer.EpubViewerPlugin.registerWith(shimPluginRegistry.registrarFor("com.jideguru.epub_viewer.EpubViewerPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebaseanalytics.FirebaseAnalyticsPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.crashlytics.firebasecrashlytics.FirebaseCrashlyticsPlugin());
    flutterEngine.getPlugins().add(new vn.hunghd.flutterdownloader.FlutterDownloaderPlugin());
      io.endigo.plugins.pdfviewflutter.PDFViewFlutterPlugin.registerWith(shimPluginRegistry.registrarFor("io.endigo.plugins.pdfviewflutter.PDFViewFlutterPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin());
      io.adaptant.labs.flutter_windowmanager.FlutterWindowManagerPlugin.registerWith(shimPluginRegistry.registrarFor("io.adaptant.labs.flutter_windowmanager.FlutterWindowManagerPlugin"));
    flutterEngine.getPlugins().add(new io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.googlesignin.GoogleSignInPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.imagepicker.ImagePickerPlugin());
      com.onesignal.flutter.OneSignalPlugin.registerWith(shimPluginRegistry.registrarFor("com.onesignal.flutter.OneSignalPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
    flutterEngine.getPlugins().add(new com.baseflow.permissionhandler.PermissionHandlerPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin());
    flutterEngine.getPlugins().add(new com.tekartik.sqflite.SqflitePlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.videoplayer.VideoPlayerPlugin());
    flutterEngine.getPlugins().add(new creativecreatorormaybenot.wakelock.WakelockPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.webviewflutter.WebViewFlutterPlugin());
  }
}
