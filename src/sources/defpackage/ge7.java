package defpackage;

import java.util.Arrays;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ge7 implements Comparable {
    public boolean X;
    public float g0;
    public int n0;
    public int Y = -1;
    public int Z = -1;
    public int f0 = 0;
    public boolean h0 = false;
    public final float[] i0 = new float[9];
    public final float[] j0 = new float[9];
    public zt[] k0 = new zt[16];
    public int l0 = 0;
    public int m0 = 0;

    public ge7(int i) {
        this.n0 = i;
    }

    public final void a(zt ztVar) {
        int i = 0;
        while (true) {
            int i2 = this.l0;
            zt[] ztVarArr = this.k0;
            if (i >= i2) {
                if (i2 >= ztVarArr.length) {
                    ztVarArr = (zt[]) Arrays.copyOf(ztVarArr, ztVarArr.length * 2);
                    this.k0 = ztVarArr;
                }
                int i3 = this.l0;
                ztVarArr[i3] = ztVar;
                this.l0 = i3 + 1;
                return;
            }
            if (ztVarArr[i] == ztVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(zt ztVar) {
        int i = this.l0;
        int i2 = 0;
        while (i2 < i) {
            if (this.k0[i2] == ztVar) {
                while (i2 < i - 1) {
                    zt[] ztVarArr = this.k0;
                    int i3 = i2 + 1;
                    ztVarArr[i2] = ztVarArr[i3];
                    i2 = i3;
                }
                this.l0--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n0 = 5;
        this.f0 = 0;
        this.Y = -1;
        this.Z = -1;
        this.g0 = 0.0f;
        this.h0 = false;
        int i = this.l0;
        for (int i2 = 0; i2 < i; i2++) {
            this.k0[i2] = null;
        }
        this.l0 = 0;
        this.m0 = 0;
        this.X = false;
        Arrays.fill(this.j0, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.Y - ((ge7) obj).Y;
    }

    public final void d(ka4 ka4Var, float f) {
        this.g0 = f;
        this.h0 = true;
        int i = this.l0;
        this.Z = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.k0[i2].h(ka4Var, this, false);
        }
        this.l0 = 0;
    }

    public final void e(ka4 ka4Var, zt ztVar) {
        int i = this.l0;
        for (int i2 = 0; i2 < i; i2++) {
            this.k0[i2].i(ka4Var, ztVar, false);
        }
        this.l0 = 0;
    }

    public final String toString() {
        return _UrlKt.FRAGMENT_ENCODE_SET + this.Y;
    }
}
