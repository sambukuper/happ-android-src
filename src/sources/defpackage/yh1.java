package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yh1 extends aa7 {
    @Override // defpackage.t14
    public final et4 K() {
        return w0().K();
    }

    @Override // defpackage.t14
    public final List l0() {
        return w0().l0();
    }

    @Override // defpackage.t14
    public ch8 m0() {
        return w0().m0();
    }

    @Override // defpackage.t14
    public final lh8 n0() {
        return w0().n0();
    }

    @Override // defpackage.t14
    public boolean o0() {
        return w0().o0();
    }

    public abstract aa7 w0();

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public aa7 s0(z14 z14Var) {
        aa7 aa7VarW0 = w0();
        aa7VarW0.getClass();
        return y0(aa7VarW0);
    }

    public yh1 y0(aa7 aa7Var) {
        return new j65(aa7Var);
    }
}
