package defpackage;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ou2 extends dt8 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = dw0.g;
    public List f;
    public boolean g;
    public lf h;
    public gn2 i;
    public final vj2 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public ou2() {
        int i = gu8.a;
        this.f = d02.X;
        this.g = true;
        this.j = new vj2((Object) this, (byte) 3);
        this.k = _UrlKt.FRAGMENT_ENCODE_SET;
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.dt8
    public final void a(sv1 sv1Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = or4.a();
                this.b = fArrA;
            } else {
                or4.d(fArrA);
            }
            or4.g(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = f17;
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.o;
            float f19 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f18;
                fArrA[1] = fArrA[1] * f18;
                fArrA[2] = fArrA[2] * f18;
                fArrA[3] = fArrA[3] * f18;
                fArrA[4] = fArrA[4] * f19;
                fArrA[5] = fArrA[5] * f19;
                fArrA[6] = fArrA[6] * f19;
                fArrA[7] = fArrA[7] * f19;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            or4.g(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                lf lfVarA = this.h;
                if (lfVarA == null) {
                    lfVarA = nf.a();
                    this.h = lfVarA;
                }
                ys0.d0(this.f, lfVarA);
            }
            this.g = false;
        }
        lr lrVarN0 = sv1Var.n0();
        long jP = lrVarN0.p();
        lrVarN0.k().g();
        try {
            lr lrVar = (lr) ((wl6) lrVarN0.Y).Y;
            float[] fArr = this.b;
            if (fArr != null) {
                lrVar.k().k(fArr);
            }
            lf lfVar = this.h;
            if (!this.f.isEmpty() && lfVar != null) {
                lrVar.k().l(lfVar);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((dt8) arrayList.get(i)).a(sv1Var);
            }
        } finally {
            p61.w(lrVarN0, jP);
        }
    }

    @Override // defpackage.dt8
    public final gn2 b() {
        return this.i;
    }

    @Override // defpackage.dt8
    public final void d(vj2 vj2Var) {
        this.i = vj2Var;
    }

    public final void e(int i, dt8 dt8Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, dt8Var);
        } else {
            arrayList.add(dt8Var);
        }
        g(dt8Var);
        dt8Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = gu8.a;
            if (dw0.g(j2) == dw0.g(j) && dw0.f(j2) == dw0.f(j) && dw0.d(j2) == dw0.d(j)) {
                return;
            }
            this.d = false;
            this.e = dw0.g;
        }
    }

    public final void g(dt8 dt8Var) {
        if (!(dt8Var instanceof pi5)) {
            if (dt8Var instanceof ou2) {
                ou2 ou2Var = (ou2) dt8Var;
                if (ou2Var.d && this.d) {
                    f(ou2Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = dw0.g;
                    return;
                }
            }
            return;
        }
        pi5 pi5Var = (pi5) dt8Var;
        d90 d90Var = pi5Var.b;
        if (this.d && d90Var != null) {
            if (d90Var instanceof fe7) {
                f(((fe7) d90Var).a);
            } else {
                this.d = false;
                this.e = dw0.g;
            }
        }
        d90 d90Var2 = pi5Var.g;
        if (this.d && d90Var2 != null) {
            if (d90Var2 instanceof fe7) {
                f(((fe7) d90Var2).a);
            } else {
                this.d = false;
                this.e = dw0.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dt8 dt8Var = (dt8) arrayList.get(i);
            sb.append("\t");
            sb.append(dt8Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
