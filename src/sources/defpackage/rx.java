package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rx {
    public final rx7 a;
    public final int b;
    public final Size c;
    public final px1 d;
    public final List e;
    public final l11 f;
    public final int g;
    public final Range h;
    public final boolean i;
    public final int j;

    public rx(rx7 rx7Var, int i, Size size, px1 px1Var, List list, l11 l11Var, int i2, Range range, boolean z, int i3) {
        this.a = rx7Var;
        this.b = i;
        this.c = size;
        if (px1Var == null) {
            b61.i("Null dynamicRange");
            throw null;
        }
        this.d = px1Var;
        this.e = list;
        this.f = l11Var;
        this.g = i2;
        if (range == null) {
            b61.i("Null targetFrameRate");
            throw null;
        }
        this.h = range;
        this.i = z;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rx)) {
            return false;
        }
        rx rxVar = (rx) obj;
        if (!this.a.equals(rxVar.a) || this.b != rxVar.b || !this.c.equals(rxVar.c) || !this.d.equals(rxVar.d) || !this.e.equals(rxVar.e)) {
            return false;
        }
        l11 l11Var = rxVar.f;
        l11 l11Var2 = this.f;
        if (l11Var2 == null) {
            if (l11Var != null) {
                return false;
            }
        } else if (!l11Var2.equals(l11Var)) {
            return false;
        }
        return this.g == rxVar.g && this.h.equals(rxVar.h) && this.i == rxVar.i && this.j == rxVar.j;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        l11 l11Var = this.f;
        return this.j ^ ((((((((iHashCode ^ (l11Var == null ? 0 : l11Var.hashCode())) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb.append(this.a);
        sb.append(", imageFormat=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", dynamicRange=");
        sb.append(this.d);
        sb.append(", captureTypes=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", sessionType=");
        sb.append(this.g);
        sb.append(", targetFrameRate=");
        sb.append(this.h);
        sb.append(", strictFrameRateRequired=");
        sb.append(this.i);
        sb.append(", customMaxFrameRate=");
        return oi0.n(sb, this.j, "}");
    }
}
