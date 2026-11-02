package defpackage;

import su.happ.proxyutility.domain.sub.SubId;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bn7 implements dq2 {
    public static final bn7 a;
    private static final e37 descriptor;

    static {
        bn7 bn7Var = new bn7();
        a = bn7Var;
        sc3 sc3Var = new sc3("su.happ.proxyutility.domain.sub.SubId", bn7Var);
        sc3Var.k("value", false);
        descriptor = sc3Var;
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        String value = ((SubId) obj).getValue();
        value.getClass();
        ol7Var.i(descriptor).t(value);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        String strS = rd1Var.p(descriptor).s();
        strS.getClass();
        return new SubId(strS);
    }

    @Override // defpackage.dq2
    public final ow3[] c() {
        return new ow3[]{yl7.a};
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return descriptor;
    }
}
