package androidx.camera.camera2.compat.quirk;

import android.util.Range;
import android.util.Size;
import defpackage.f26;
import defpackage.qg5;
import defpackage.qx7;
import defpackage.x97;
import defpackage.zp4;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "Lf26;", "x97", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraCroppingQuirk implements f26 {
    public static final LinkedHashMap a = zp4.K(new qg5("SM-T580", null), new qg5("SM-J710MN", new Range(21, 26)), new qg5("SM-A320FL", null), new qg5("SM-G570M", null), new qg5("SM-G610F", null), new qg5("SM-G610M", new Range(21, 26)));

    public static Size b(qx7 qx7Var) {
        if (!x97.K()) {
            return null;
        }
        int iOrdinal = qx7Var.ordinal();
        if (iOrdinal == 0) {
            return new Size(1920, 1080);
        }
        if (iOrdinal == 1) {
            return new Size(1280, 720);
        }
        if (iOrdinal != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
