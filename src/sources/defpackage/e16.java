package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e16 implements g16 {
    public final ai0 a;

    public e16(ai0 ai0Var) {
        this.a = ai0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e16) && dh3.f(this.a, ((e16) obj).a);
    }

    public final int hashCode() {
        ai0 ai0Var = this.a;
        if (ai0Var == null) {
            return 0;
        }
        return Integer.hashCode(ai0Var.a);
    }

    public final String toString() {
        return "Error(lastCameraError=" + this.a + ')';
    }
}
