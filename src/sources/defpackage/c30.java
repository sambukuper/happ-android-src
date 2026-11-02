package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c30 implements s55 {
    public final z82 a;

    public c30(z82 z82Var) {
        this.a = z82Var;
    }

    @Override // defpackage.qj2
    public final rj2 a() {
        return this.a.a();
    }

    @Override // defpackage.qj2
    public final li5 b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c30) {
            return this.a.equals(((c30) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.a + ')';
    }
}
