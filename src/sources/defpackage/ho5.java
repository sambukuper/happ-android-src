package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ho5 extends y43 {
    public final int s0;
    public dh8 t0;

    public ho5(int i) {
        super(Object.class, gh8.i0, uh8.u0, null, 1, null, null, false);
        this.s0 = i;
    }

    public static void U0() {
        throw new UnsupportedOperationException("Operation should not be attempted on ".concat(ho5.class.getName()));
    }

    @Override // defpackage.dh8
    public final StringBuilder A0(StringBuilder sb) {
        sb.append('$');
        sb.append(this.s0 + 1);
        return sb;
    }

    @Override // defpackage.dh8
    public final StringBuilder B0(StringBuilder sb) {
        A0(sb);
        return sb;
    }

    @Override // defpackage.dh8
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.dh8
    public final dh8 M0(Class cls, gh8 gh8Var, dh8 dh8Var, dh8[] dh8VarArr) {
        U0();
        throw null;
    }

    @Override // defpackage.dh8
    public final dh8 O0(dh8 dh8Var) {
        U0();
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        A0(sb);
        return sb.toString();
    }

    @Override // defpackage.dh8
    public final String w0() {
        return toString();
    }
}
