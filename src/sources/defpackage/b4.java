package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.net.NetworkRequest;
import android.net.NetworkSpecifier;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.util.Range;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import java.util.Objects;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b4 {
    public static Context a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static Icon b(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String c(Context context) {
        return context.getAttributionTag();
    }

    public static final Set d(CameraManager cameraManager) throws CameraAccessException {
        Set<Set<String>> concurrentCameraIds = cameraManager.getConcurrentCameraIds();
        concurrentCameraIds.getClass();
        return concurrentCameraIds;
    }

    public static final Range e(jj0 jj0Var) {
        Float f;
        Float fValueOf = Float.valueOf(1.0f);
        jj0Var.getClass();
        try {
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            key.getClass();
            Range range = (Range) ((lf0) jj0Var).c(key);
            if (range == null) {
                if (hi5.m0()) {
                    vi0.b(((lf0) jj0Var).X);
                }
                return new Range(fValueOf, fValueOf);
            }
            Object lower = range.getLower();
            lower.getClass();
            float fFloatValue = ((Number) lower).floatValue();
            if (Math.abs(fFloatValue) >= ((double) Math.ulp(Math.abs(fFloatValue))) * 2.0d && ((Number) range.getLower()).floatValue() >= 0.0f) {
                f = (Float) range.getLower();
            } else {
                if (hi5.m0()) {
                    Objects.toString(range.getLower());
                }
                f = fValueOf;
            }
            Object upper = range.getUpper();
            upper.getClass();
            float fFloatValue2 = ((Number) upper).floatValue();
            if (Math.abs(fFloatValue2) >= ((double) Math.ulp(Math.abs(fFloatValue2))) * 2.0d && ((Number) range.getUpper()).floatValue() >= 0.0f) {
                fValueOf = (Float) range.getUpper();
            } else if (hi5.m0()) {
                Objects.toString(range.getUpper());
            }
            return new Range(f, fValueOf);
        } catch (AssertionError unused) {
            if (um1.a().b(ControlZoomRatioRangeAssertionErrorQuirk.class) != null) {
                if (hi5.i0("CXCP")) {
                    String str = Build.MANUFACTURER;
                    String str2 = Build.MODEL;
                }
            } else if (hi5.j0()) {
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
            }
            hi5.m0();
            return null;
        }
    }

    public static Rect f(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics().getBounds();
    }

    public static void g(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static NetworkSpecifier h(NetworkRequest networkRequest) {
        return networkRequest.getNetworkSpecifier();
    }

    public static CharSequence i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static String j(m6 m6Var) {
        m6Var.getClass();
        if (m6Var instanceof l6) {
            return "image/*";
        }
        if (m6Var instanceof k6) {
            return null;
        }
        b61.c();
        return null;
    }

    public static Insets k(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static boolean l() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    public static boolean m(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static boolean n(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean o(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public static final void p(CameraDevice cameraDevice, int i) throws CameraAccessException {
        cameraDevice.setCameraAudioRestriction(i);
    }

    public static void q(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        window.setDecorFitsSystemWindows(z);
    }

    public static void r(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void s(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void t(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void u(Outline outline, lf lfVar) {
        if (lfVar instanceof lf) {
            outline.setPath(lfVar.a);
        } else {
            u52.k("Unable to obtain android.graphics.Path");
        }
    }

    public static void v(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
