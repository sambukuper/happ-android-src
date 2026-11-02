package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ki7 extends ft4 {
    public static final /* synthetic */ nw3[] f = {new lx5(ki7.class, "functions", "getFunctions()Ljava/util/List;", 0), new lx5(ki7.class, "properties", "getProperties()Ljava/util/List;", 0)};
    public final vl1 b;
    public final boolean c;
    public final te4 d;
    public final te4 e;

    public ki7(ve4 ve4Var, vl1 vl1Var, boolean z) {
        ve4Var.getClass();
        this.b = vl1Var;
        this.c = z;
        this.d = new te4(ve4Var, new ji7(this, (byte) 0));
        this.e = new te4(ve4Var, new ji7(this, (byte) 1));
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Collection a(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        nw3[] nw3VarArr = f;
        return wv0.H0((List) hi5.e0(this.d, nw3VarArr[0]), (List) hi5.e0(this.e, nw3VarArr[1]));
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Collection b(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        List list = (List) hi5.e0(this.d, f[0]);
        oc7 oc7Var = new oc7();
        for (Object obj : list) {
            if (dh3.f(((q97) obj).getName(), v15Var)) {
                oc7Var.add(obj);
            }
        }
        return oc7Var;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final ot0 e(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        return null;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Collection f(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        List list = (List) hi5.e0(this.e, f[1]);
        oc7 oc7Var = new oc7();
        for (Object obj : list) {
            if (dh3.f(((fx5) obj).getName(), v15Var)) {
                oc7Var.add(obj);
            }
        }
        return oc7Var;
    }
}
