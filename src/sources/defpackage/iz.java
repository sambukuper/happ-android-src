package defpackage;

import android.util.Range;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class iz {
    public static final Range h = new Range(0, 0);
    public final Size a;
    public final Size b;
    public final px1 c;
    public final int d;
    public final Range e;
    public final l11 f;
    public final boolean g;

    public iz(Size size, Size size2, px1 px1Var, int i, Range range, l11 l11Var, boolean z) {
        this.a = size;
        this.b = size2;
        this.c = px1Var;
        this.d = i;
        this.e = range;
        this.f = l11Var;
        this.g = z;
    }

    public static xy0 a(Size size) {
        xy0 xy0Var = new xy0();
        if (size == null) {
            b61.i("Null resolution");
            return null;
        }
        xy0Var.Y = size;
        xy0Var.Z = size;
        xy0Var.g0 = 0;
        Range range = h;
        if (range == null) {
            b61.i("Null expectedFrameRateRange");
            return null;
        }
        xy0Var.h0 = range;
        xy0Var.f0 = px1.d;
        xy0Var.j0 = Boolean.FALSE;
        return xy0Var;
    }

    public final xy0 b() {
        xy0 xy0Var = new xy0();
        xy0Var.Y = this.a;
        xy0Var.Z = this.b;
        xy0Var.f0 = this.c;
        xy0Var.g0 = Integer.valueOf(this.d);
        xy0Var.h0 = this.e;
        xy0Var.i0 = this.f;
        xy0Var.j0 = Boolean.valueOf(this.g);
        return xy0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iz) {
            iz izVar = (iz) obj;
            if (this.a.equals(izVar.a) && this.b.equals(izVar.b) && this.c.equals(izVar.c) && this.d == izVar.d && this.e.equals(izVar.e)) {
                l11 l11Var = izVar.f;
                l11 l11Var2 = this.f;
                if (l11Var2 != null ? l11Var2.equals(l11Var) : l11Var == null) {
                    if (this.g == izVar.g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        l11 l11Var = this.f;
        return (this.g ? 1231 : 1237) ^ ((iHashCode ^ (l11Var == null ? 0 : l11Var.hashCode())) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.a);
        sb.append(", originalConfiguredResolution=");
        sb.append(this.b);
        sb.append(", dynamicRange=");
        sb.append(this.c);
        sb.append(", sessionType=");
        sb.append(this.d);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", zslDisabled=");
        return p61.o(sb, this.g, "}");
    }
}
