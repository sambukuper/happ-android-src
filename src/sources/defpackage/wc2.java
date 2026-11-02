package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wc2 implements v09 {
    public final int a;

    public wc2(int i) {
        this.a = i;
    }

    @Override // defpackage.v09
    public final int a(fi1 fi1Var) {
        return this.a;
    }

    @Override // defpackage.v09
    public final int b(fi1 fi1Var, z24 z24Var) {
        return 0;
    }

    @Override // defpackage.v09
    public final int c(fi1 fi1Var) {
        return 0;
    }

    @Override // defpackage.v09
    public final int d(fi1 fi1Var, z24 z24Var) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wc2) && this.a == ((wc2) obj).a;
    }

    public final int hashCode() {
        return this.a * 961;
    }

    public final String toString() {
        return ie2.h("Insets(left=0, top=", this.a, ", right=0, bottom=0)");
    }
}
