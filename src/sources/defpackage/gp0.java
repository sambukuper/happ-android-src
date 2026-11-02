package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gp0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    public gp0(int i, boolean z, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp0)) {
            return false;
        }
        gp0 gp0Var = (gp0) obj;
        return this.a == gp0Var.a && this.b == gp0Var.b && this.c == gp0Var.c && this.d == gp0Var.d && this.e == gp0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + oi0.e(this.d, oi0.e(this.c, oi0.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        boolean z = this.e;
        StringBuilder sbR = oi0.r(i, "Change(preStart=", i2, ", preEnd=", ", originalStart=");
        oi0.x(sbR, i3, ", originalEnd=", i4, ", isFromHardwareSource=");
        return p61.o(sbR, z, ")");
    }
}
