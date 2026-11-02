package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ij0 {
    public static final /* synthetic */ ij0 a = new ij0();
    public static final int[] b;

    static {
        HashMap map = xu4.c;
        zb6 zb6Var = yb6.a;
        nr4.o(zb6Var.b(gl0.class), "androidx.camera.camera2.pipe.scalar.streamConfigurationMap");
        nr4.o(zb6Var.b(kj0.class), "androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap");
        nr4.o(zb6Var.b(hh0.class), "androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap");
        b = new int[0];
    }

    public static boolean a(jj0 jj0Var) {
        jj0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
        key.getClass();
        lf0 lf0Var = (lf0) jj0Var;
        Float f = (Float) lf0Var.c(key);
        if (f == null) {
            CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
            key2.getClass();
            int[] iArr = (int[]) lf0Var.c(key2);
            if (iArr == null) {
                return false;
            }
            if (!eu.a0(iArr, 1) && !eu.a0(iArr, 2) && !eu.a0(iArr, 4) && !eu.a0(iArr, 3)) {
                return false;
            }
        } else if (f.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    public static boolean b(jj0 jj0Var) {
        jj0Var.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        jj0.h.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
        key.getClass();
        int[] iArr = (int[]) ((lf0) jj0Var).c(key);
        if (iArr == null) {
            iArr = b;
        }
        return eu.a0(iArr, 2);
    }

    public static boolean c(jj0 jj0Var) {
        jj0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        Integer num = (Integer) ((lf0) jj0Var).c(key);
        return num != null && num.intValue() == 2;
    }
}
