package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k20 implements re6 {
    public final bm3 X;

    public /* synthetic */ k20(bm3 bm3Var) {
        this.X = bm3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k20) {
            return this.X.equals(((k20) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.X + ")";
    }
}
