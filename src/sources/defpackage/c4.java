package defpackage;

import android.app.Activity;
import android.app.LocaleManager;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.text.LineBreakConfig;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.EncoderProfiles;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import okhttp3.dnsoverhttps.DnsOverHttps;
import su.happ.proxyutility.HappApplication;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c4 {
    public static kn A(Object obj, wp wpVar) {
        kn knVar = new kn(wpVar, (byte) 1);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, knVar);
        return knVar;
    }

    public static final void B(OutputConfiguration outputConfiguration, long j) {
        outputConfiguration.setDynamicRangeProfile(j);
    }

    public static final void C(CursorAnchorInfo.Builder builder, s86 s86Var) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(pu.T(s86Var)).setHandwritingBounds(pu.T(s86Var)).build());
    }

    public static final void D(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static final void E(OutputConfiguration outputConfiguration, int i) {
        outputConfiguration.setMirrorMode(i);
    }

    public static void F(qw1 qw1Var, boolean z) {
        qw1Var.setSelectedChildViewEnabled(z);
    }

    public static final void G(OutputConfiguration outputConfiguration, long j) {
        outputConfiguration.setStreamUseCase(j);
    }

    public static void H(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void I(Object obj, kn knVar) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback(knVar);
    }

    public static void J(Object obj, kn knVar) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback(knVar);
    }

    public static OnBackInvokedDispatcher a(Toolbar toolbar) {
        return toolbar.findOnBackInvokedDispatcher();
    }

    public static gy b(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new fy(audioProfile.getMediaType(), audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new hy(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return gy.a(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static vk1 c(jj0 jj0Var) {
        jj0Var.getClass();
        int i = Build.VERSION.SDK_INT;
        vk1 vk1Var = null;
        if (i >= 33) {
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            key.getClass();
            DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) ((lf0) jj0Var).c(key);
            if (dynamicRangeProfiles != null) {
                if (i < 33) {
                    kp5.h(ie2.h("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher. is not supported on API ", i, " (requires API 33)"));
                    return null;
                }
                vk1Var = new vk1((Object) new tx1(dynamicRangeProfiles), (byte) 5);
            }
        }
        return vk1Var == null ? ux1.a : vk1Var;
    }

    public static final Set d(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        Set<CaptureRequest.Key> availableCaptureRequestKeys = cameraExtensionCharacteristics.getAvailableCaptureRequestKeys(i);
        availableCaptureRequestKeys.getClass();
        return availableCaptureRequestKeys;
    }

    public static final Set e(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        Set<CaptureResult.Key> availableCaptureResultKeys = cameraExtensionCharacteristics.getAvailableCaptureResultKeys(i);
        availableCaptureResultKeys.getClass();
        return availableCaptureResultKeys;
    }

    public static List f(HappApplication happApplication, Intent intent) {
        intent.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            List<ResolveInfo> listQueryIntentActivities = happApplication.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L));
            listQueryIntentActivities.getClass();
            return listQueryIntentActivities;
        }
        List<ResolveInfo> listQueryIntentActivities2 = happApplication.getPackageManager().queryIntentActivities(intent, DnsOverHttps.MAX_RESPONSE_SIZE);
        listQueryIntentActivities2.getClass();
        return listQueryIntentActivities2;
    }

    public static int g() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) {
            return Integer.MAX_VALUE;
        }
        return MediaStore.getPickImagesMaxLimit();
    }

    public static OnBackInvokedDispatcher h(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static PackageInfo i(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object j(String str, Bundle bundle) {
        return bundle.getParcelable(str, i6.class);
    }

    public static final Parcelable[] k(Bundle bundle, zu3 zu3Var) {
        bundle.getClass();
        zu3Var.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            return (Parcelable[]) bundle.getParcelableArray("stories", zc1.M(zu3Var));
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("stories");
        if (parcelableArray != null) {
            return parcelableArray;
        }
        return null;
    }

    public static final Parcelable l(Bundle bundle, zu3 zu3Var) {
        bundle.getClass();
        zu3Var.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            return (Parcelable) bundle.getParcelable("story", zc1.M(zu3Var));
        }
        Parcelable parcelable = bundle.getParcelable("story");
        if (parcelable instanceof Parcelable) {
            return parcelable;
        }
        return null;
    }

    public static final Parcelable m(Intent intent, zu3 zu3Var) {
        intent.getClass();
        zu3Var.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            return (Parcelable) intent.getParcelableExtra("content", zc1.M(zu3Var));
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("content");
        if (parcelableExtra instanceof Parcelable) {
            return parcelableExtra;
        }
        return null;
    }

    public static px1 n(jj0 jj0Var) {
        jj0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE;
        key.getClass();
        Long l = (Long) ((lf0) jj0Var).c(key);
        if (l != null) {
            return (px1) qx1.a.get(l);
        }
        return null;
    }

    public static String o(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final BoringLayout.Metrics p(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean q(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static final boolean r(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static boolean s(qw1 qw1Var) {
        return qw1Var.isSelectedChildViewEnabled();
    }

    public static boolean t(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static LocaleList u(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void v(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    public static final void w(ir5 ir5Var, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = ir5Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    public static final void x(ir5 ir5Var, kn knVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (knVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = ir5Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(knVar);
    }

    public static final Intent y(Intent intent, String str, String str2) {
        if (str2 == null) {
            str2 = null;
        }
        Intent intentPutExtra = intent.putExtra(str, str2);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    public static Parcelable z(Parcel parcel) {
        ClassLoader classLoader = Notification.class.getClassLoader();
        return Build.VERSION.SDK_INT >= 33 ? (Parcelable) parcel.readParcelable(classLoader, Notification.class) : parcel.readParcelable(classLoader);
    }
}
