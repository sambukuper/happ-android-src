package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tc6 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final c00 g;

    public tc6(long j, long j2, long j3, long j4, long j5, float[] fArr, c00 c00Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = c00Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && tc6.class == obj.getClass()) {
            tc6 tc6Var = (tc6) obj;
            if (this.a == tc6Var.a && this.b == tc6Var.b && this.e == tc6Var.e && hf3.a(this.c, tc6Var.c) && hf3.a(this.d, tc6Var.d)) {
                float[] fArr = tc6Var.f;
                float[] fArr2 = this.f;
                if (fArr2 == null) {
                    if (fArr == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                } else if (fArr == null) {
                    zEquals = false;
                } else {
                    zEquals = fArr2.equals(fArr);
                }
                return zEquals && this.g == tc6Var.g;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG = p61.g(p61.g(p61.g(p61.g(Long.hashCode(this.a) * 31, this.b, 31), this.e, 31), this.c, 31), this.d, 31);
        float[] fArr = this.f;
        return this.g.hashCode() + ((iG + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
