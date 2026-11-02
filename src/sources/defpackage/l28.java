package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l28 implements k28 {
    public final boolean X;
    public final boolean Y;

    public l28(i26 i26Var) {
        boolean z;
        i26Var.getClass();
        Iterator it = i26Var.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                z = true;
                this.X = z;
                this.Y = i26Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
            }
        }
        z = false;
        this.X = z;
        this.Y = i26Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @Override // defpackage.k28
    public final Map e(we6 we6Var) {
        if (we6Var != null && we6Var.a == 3 && this.X) {
            Map mapSingletonMap = Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        if (we6Var == null || we6Var.a != 4 || !this.Y) {
            return e02.X;
        }
        Map mapSingletonMap2 = Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        mapSingletonMap2.getClass();
        return mapSingletonMap2;
    }
}
