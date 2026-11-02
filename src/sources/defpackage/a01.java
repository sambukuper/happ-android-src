package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a01 {
    public final lp2 a;
    public ep0 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final qf3 d = new qf3((byte) 1);
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public a01(lp2 lp2Var, ep0 ep0Var) {
        this.a = lp2Var;
        this.b = ep0Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            wc5 wc5Var = this.b.i0;
            wc5Var.b0(sc5.d);
            wc5Var.n0[wc5Var.o0 - wc5Var.l0[wc5Var.m0 - 1].b] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        ep0 ep0Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        ep0Var.getClass();
        if (size != 0) {
            wc5 wc5Var2 = ep0Var.i0;
            wc5Var2.b0(sb5.d);
            w45.S(wc5Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                wc5 wc5Var = this.b.i0;
                wc5Var.b0(hc5.d);
                int i3 = wc5Var.o0 - wc5Var.l0[wc5Var.m0 - 1].b;
                int[] iArr = wc5Var.n0;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                wc5 wc5Var2 = this.b.i0;
                wc5Var2.b0(dc5.d);
                int i6 = wc5Var2.o0 - wc5Var2.l0[wc5Var2.m0 - 1].b;
                int[] iArr2 = wc5Var2.n0;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        xb7 xb7Var = this.a.G;
        int i = z ? xb7Var.i : xb7Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            d01.a("Tried to seek backward");
        }
        if (i2 > 0) {
            wc5 wc5Var = this.b.i0;
            wc5Var.b0(lb5.d);
            wc5Var.n0[wc5Var.o0 - wc5Var.l0[wc5Var.m0 - 1].b] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                d01.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
