package defpackage;

import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sj3 extends ob6 {
    public final rj3 X;
    public final Method Y;
    public final int Z;
    public final g44 f0 = x97.P(w74.X, new f3(this, (byte) 27));

    public sj3(rj3 rj3Var, Method method, int i) {
        this.X = rj3Var;
        this.Y = method;
        this.Z = i;
    }

    @Override // defpackage.ob6
    public final pw3 B() {
        return (pw3) this.f0.getValue();
    }

    @Override // defpackage.ob6
    public final boolean F() {
        return this.Y.getDefaultValue() != null;
    }

    @Override // defpackage.ob6
    public final boolean G() {
        return getName().equals("value") && this.Y.getReturnType().isArray();
    }

    @Override // defpackage.wu3
    public final List Q() {
        throw null;
    }

    @Override // defpackage.ob6
    public final kb6 f() {
        return this.X;
    }

    @Override // defpackage.ob6
    public final String getName() {
        String name = this.Y.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.ob6
    public final boolean t() {
        return F();
    }

    @Override // defpackage.ob6
    public final int v() {
        return this.Z;
    }

    @Override // defpackage.ob6
    public final fw3 x() {
        return fw3.f0;
    }
}
