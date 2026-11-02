package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jq5 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public jq5(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq5)) {
            return false;
        }
        jq5 jq5Var = (jq5) obj;
        return jm4.w(this.a, jq5Var.a) && this.b == jq5Var.b && z85.b(this.c, jq5Var.c) && z85.b(this.d, jq5Var.d) && this.e == jq5Var.e && Float.compare(this.f, jq5Var.f) == 0 && this.g == jq5Var.g && this.h == jq5Var.h && this.i.equals(jq5Var.i) && z85.b(this.j, jq5Var.j) && Float.compare(this.k, jq5Var.k) == 0 && z85.b(this.l, jq5Var.l) && z85.b(this.m, jq5Var.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + p61.g(pc6.d(p61.g((this.i.hashCode() + pc6.f(oi0.e(this.g, pc6.d(pc6.f(p61.g(p61.g(p61.g(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), this.f, 31), 31), 31, this.h)) * 31, this.j, 31), this.k, 31), this.l, 31);
    }

    public final String toString() {
        String strB0 = jm4.b0(this.a);
        String strH = z85.h(this.c);
        String strH2 = z85.h(this.d);
        String strA = oq5.a(this.g);
        String strH3 = z85.h(this.j);
        String strH4 = z85.h(this.l);
        String strH5 = z85.h(this.m);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(strB0);
        sb.append(", uptime=");
        sb.append(this.b);
        oi0.y(sb, ", positionOnScreen=", strH, ", position=", strH2);
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(strA);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append(strH3);
        sb.append(", scaleGestureFactor=");
        sb.append(this.k);
        sb.append(", panGestureOffset=");
        sb.append(strH4);
        return p61.n(sb, ", originalEventPosition=", strH5, ")");
    }
}
