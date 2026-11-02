package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gc8 implements nr5 {
    public final int X;

    public gc8(int i) {
        this.X = i;
    }

    @Override // defpackage.nr5
    public final long x(lf3 lf3Var, long j, z24 z24Var, long j2) {
        int i = (int) (j2 >> 32);
        int iD = ((lf3Var.d() - i) / 2) + lf3Var.a;
        if (iD < 0) {
            iD = lf3Var.a;
        } else if (iD + i > ((int) (j >> 32))) {
            iD = lf3Var.c - i;
        }
        int i2 = lf3Var.b - ((int) (j2 & 4294967295L));
        int i3 = this.X;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = lf3Var.d + i3;
        }
        return (((long) iD) << 32) | (((long) i4) & 4294967295L);
    }
}
