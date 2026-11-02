package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u98 {
    public final vz4 a;
    public t98 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public u98() {
        vz4 vz4Var = gf3.a;
        this.a = new vz4();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(t98 t98Var, long j, long j2, float[] fArr, long j3) {
        long j4 = t98Var.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            t98Var.g = j3;
            t98Var.a(t98Var.e, t98Var.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (hf3.a(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!hf3.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
