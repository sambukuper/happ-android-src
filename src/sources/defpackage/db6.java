package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class db6 extends xa6 implements vj3 {
    public final fk2 a;

    public db6(fk2 fk2Var) {
        fk2Var.getClass();
        this.a = fk2Var;
    }

    @Override // defpackage.vj3
    public final ja6 a(fk2 fk2Var) {
        fk2Var.getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof db6) {
            return dh3.f(this.a, ((db6) obj).a);
        }
        return false;
    }

    @Override // defpackage.vj3
    public final Collection getAnnotations() {
        return d02.X;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return db6.class.getName() + ": " + this.a;
    }
}
