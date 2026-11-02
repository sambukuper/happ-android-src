package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o54 implements nw3 {
    public final g44 X;

    public o54(dn2 dn2Var) {
        this.X = x97.P(w74.X, dn2Var);
    }

    @Override // defpackage.wu3
    public final List Q() {
        return f().Q();
    }

    public final boolean equals(Object obj) {
        return dh3.f(f(), obj);
    }

    public final nw3 f() {
        return (nw3) this.X.getValue();
    }

    @Override // defpackage.xu3
    public final List g() {
        return f().g();
    }

    public final int hashCode() {
        return f().hashCode();
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        return f().j();
    }

    public final String toString() {
        return f().toString();
    }
}
