package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import defpackage.f26;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;", "Lf26;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DisableAbortCapturesOnStopQuirk implements f26 {
    public static final boolean a;
    public static final boolean b;

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    static {
        boolean z;
        String str = Build.MANUFACTURER;
        str.getClass();
        boolean z2 = false;
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                z = false;
            } else if ("d2q".equalsIgnoreCase(Build.DEVICE)) {
                z = true;
            } else {
                z = false;
            }
        } else if ("d2q".equalsIgnoreCase(Build.DEVICE)) {
            z = true;
        } else {
            z = false;
        }
        a = z;
        str.getClass();
        if (!str.equalsIgnoreCase("Poco")) {
            String str3 = Build.BRAND;
            str3.getClass();
            if (str3.equalsIgnoreCase("Poco")) {
                if ("M2102J20SG".equalsIgnoreCase(Build.MODEL)) {
                    z2 = true;
                }
            }
        } else if ("M2102J20SG".equalsIgnoreCase(Build.MODEL)) {
            z2 = true;
        }
        b = z2;
    }
}
