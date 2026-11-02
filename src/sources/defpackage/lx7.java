package defpackage;

import android.util.Range;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lx7 {
    public final int a;
    public final int b;
    public final boolean c;
    public final lv8 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Range i;
    public final boolean j;

    public lx7(int i, int i2, boolean z, lv8 lv8Var, boolean z2, boolean z3, boolean z4, boolean z5, Range range, boolean z6) {
        lv8Var.getClass();
        range.getClass();
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = lv8Var;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = range;
        this.j = z6;
    }

    public static lx7 a(lx7 lx7Var, boolean z, Range range, int i) {
        int i2 = lx7Var.a;
        int i3 = lx7Var.b;
        boolean z2 = lx7Var.c;
        lv8 lv8Var = lx7Var.d;
        boolean z3 = lx7Var.e;
        boolean z4 = lx7Var.f;
        boolean z5 = lx7Var.g;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            range = lx7Var.i;
        }
        Range range2 = range;
        boolean z6 = lx7Var.j;
        lv8Var.getClass();
        range2.getClass();
        return new lx7(i2, i3, z2, lv8Var, z3, z4, z5, z, range2, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx7)) {
            return false;
        }
        lx7 lx7Var = (lx7) obj;
        return this.a == lx7Var.a && this.b == lx7Var.b && this.c == lx7Var.c && this.d == lx7Var.d && this.e == lx7Var.e && this.f == lx7Var.f && this.g == lx7Var.g && this.h == lx7Var.h && dh3.f(this.i, lx7Var.i) && this.j == lx7Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + pc6.f(pc6.f(pc6.f(pc6.f((this.d.hashCode() + pc6.f(oi0.e(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31);
    }

    public final String toString() {
        return "FeatureSettings(cameraMode=" + this.a + ", requiredMaxBitDepth=" + this.b + ", hasVideoCapture=" + this.c + ", videoStabilization=" + this.d + ", isUltraHdrOn=" + this.e + ", isHighSpeedOn=" + this.f + ", isFeatureComboInvocation=" + this.g + ", requiresFeatureComboQuery=" + this.h + ", targetFpsRange=" + this.i + ", isStrictFpsRequired=" + this.j + ')';
    }
}
