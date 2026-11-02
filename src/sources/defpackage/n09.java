package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n09 implements fu4 {
    public final l50 a;

    public n09(l50 l50Var) {
        this.a = l50Var;
    }

    @Override // defpackage.fu4
    public final int a(lf3 lf3Var, long j, int i, z24 z24Var) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1.0f + (z24Var == z24.X ? 0.0f : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return x97.n(this.a.a(i, i2, z24Var), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n09) && this.a.equals(((n09) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
