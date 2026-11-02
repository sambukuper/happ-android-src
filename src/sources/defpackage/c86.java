package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c86 implements ab7 {
    public final ta7 X;

    public c86(ta7 ta7Var) {
        this.X = ta7Var;
    }

    @Override // defpackage.ab7
    public final Object a(q51 q51Var) {
        return this.X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c86) && this.X.equals(((c86) obj).X);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.X + ")";
    }
}
