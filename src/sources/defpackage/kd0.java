package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kd0 {
    public final fk2 a;
    public final v15 b;

    static {
        v15 v15Var = hf7.f;
        fk2 fk2Var = fk2.c;
        wl7.h0(v15Var);
    }

    public kd0(fk2 fk2Var, v15 v15Var) {
        fk2Var.getClass();
        this.a = fk2Var;
        this.b = v15Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd0)) {
            return false;
        }
        kd0 kd0Var = (kd0) obj;
        return this.a.equals(kd0Var.a) && this.b.equals(kd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return mm7.X(this.a.a.a, '.', '/') + "/" + this.b;
    }
}
