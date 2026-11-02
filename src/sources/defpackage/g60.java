package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g60 {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public g60(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            h60.h();
            porterDuffColorFilter = h60.a(z51.U(j), wa.L(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(z51.U(j), wa.N(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g60)) {
            return false;
        }
        g60 g60Var = (g60) obj;
        long j = g60Var.b;
        int i = dw0.h;
        return tk8.a(this.b, j) && this.c == g60Var.c;
    }

    public final int hashCode() {
        int i = dw0.h;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return pc6.q("BlendModeColorFilter(color=", dw0.h(this.b), ", blendMode=", oc.F(this.c), ")");
    }
}
