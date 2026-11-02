package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class af implements bo8 {
    public final OutputConfiguration X;

    public af(OutputConfiguration outputConfiguration) {
        this.X = outputConfiguration;
        outputConfiguration.getSurface();
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        if (zu3Var.equals(yb6.a.b(OutputConfiguration.class))) {
            return this.X;
        }
        return null;
    }

    public final void a(Surface surface) {
        surface.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            kp5.h(ie2.h("addSurface is not supported on API ", i, " (requires API 26)"));
        } else if (i >= 26) {
            ue3.a(this.X, surface);
        }
    }

    public final String toString() {
        return this.X.toString();
    }
}
