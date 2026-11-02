package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xr2 extends ft4 {
    public static final /* synthetic */ nw3[] d = {new lx5(xr2.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0)};
    public final m0 b;
    public final te4 c;

    public xr2(ve4 ve4Var, m0 m0Var) {
        ve4Var.getClass();
        this.b = m0Var;
        this.c = new te4(ve4Var, new f3(this, (byte) 26));
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Collection a(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        if (!pk1Var.a(pk1.n.b)) {
            return d02.X;
        }
        return (List) hi5.e0(this.c, d[0]);
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Collection b(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        List list = (List) hi5.e0(this.c, d[0]);
        if (list.isEmpty()) {
            return d02.X;
        }
        oc7 oc7Var = new oc7();
        for (Object obj : list) {
            if ((obj instanceof q97) && dh3.f(((q97) obj).getName(), v15Var)) {
                oc7Var.add(obj);
            }
        }
        return oc7Var;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Collection f(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        List list = (List) hi5.e0(this.c, d[0]);
        if (list.isEmpty()) {
            return d02.X;
        }
        oc7 oc7Var = new oc7();
        for (Object obj : list) {
            if ((obj instanceof fx5) && dh3.f(((fx5) obj).getName(), v15Var)) {
                oc7Var.add(obj);
            }
        }
        return oc7Var;
    }

    public List h() {
        v15 v15Var = qu0.e;
        g55 g55Var = ke7.G;
        m0 m0Var = this.b;
        q97 q97VarR0 = q97.R0(m0Var, v15Var, 1, g55Var);
        i44 i44VarP0 = m0Var.p0();
        aa7 aa7VarE = el1.e(m0Var).e();
        fx4 fx4Var = fx4.f0;
        fl1 fl1Var = gl1.c;
        d02 d02Var = d02.X;
        q97VarR0.L0(null, i44VarP0, d02Var, d02Var, d02Var, aa7VarE, fx4Var, fl1Var);
        return i21.K(q97VarR0);
    }
}
