package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ga0 implements gm {
    public final zz3 a;
    public final fk2 b;
    public final Map c;
    public final g44 d;

    public ga0(zz3 zz3Var, fk2 fk2Var, Map map) {
        zz3Var.getClass();
        fk2Var.getClass();
        this.a = zz3Var;
        this.b = fk2Var;
        this.c = map;
        this.d = x97.P(w74.X, new f3(this, (byte) 4));
    }

    @Override // defpackage.gm
    public final t14 c() {
        Object value = this.d.getValue();
        value.getClass();
        return (t14) value;
    }

    @Override // defpackage.gm
    public final fk2 d() {
        return this.b;
    }

    @Override // defpackage.gm
    public final Map e() {
        return this.c;
    }

    @Override // defpackage.gm
    public final ke7 getSource() {
        return ke7.G;
    }
}
