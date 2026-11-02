package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class up1 {
    public final DisplayCutout a;

    public up1(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final fe3 a() {
        return Build.VERSION.SDK_INT >= 30 ? fe3.d(b4.k(this.a)) : fe3.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || up1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((up1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
