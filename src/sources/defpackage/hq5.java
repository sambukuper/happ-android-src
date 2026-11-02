package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hq5 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;
    public boolean o;
    public boolean p;
    public hq5 q;

    public hq5(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public final void a() {
        hq5 hq5Var = this.q;
        if (hq5Var == null) {
            this.o = true;
            this.p = true;
        } else if (hq5Var != null) {
            hq5Var.a();
        }
    }

    public final List b() {
        ArrayList arrayList = this.m;
        return arrayList == null ? d02.X : arrayList;
    }

    public final boolean c() {
        hq5 hq5Var = this.q;
        if (hq5Var != null) {
            return hq5Var.c();
        }
        return this.o || this.p;
    }

    public final String toString() {
        String strB0 = jm4.b0(this.a);
        String strH = z85.h(this.c);
        String strH2 = z85.h(this.g);
        boolean zC = c();
        String strA = oq5.a(this.i);
        List listB = b();
        String strH3 = z85.h(this.j);
        String strH4 = z85.h(this.l);
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append(strB0);
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(strH);
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append(strH2);
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(zC);
        sb.append(", type=");
        sb.append(strA);
        sb.append(", historical=");
        sb.append(listB);
        sb.append(", scrollDelta=");
        sb.append(strH3);
        sb.append(", scaleFactor=");
        sb.append(this.k);
        return p61.n(sb, ", panOffset=", strH4, ")");
    }

    public hq5(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }
}
