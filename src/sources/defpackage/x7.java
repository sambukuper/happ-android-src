package defpackage;

import io.sentry.c2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x7 {
    public int a;
    public Object c;
    public Object d;
    public Object e;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object f = null;
    public Object g = ui8.a;
    public boolean b = true;

    public x7(gx5 gx5Var) {
        this.k = gx5Var;
        this.c = gx5Var.p();
        this.d = gx5Var.m();
        this.e = gx5Var.e();
        this.a = gx5Var.r();
        this.h = gx5Var.x0;
        this.i = gx5Var.getName();
        this.j = gx5Var.c();
    }

    public gx5 a() {
        i44 i44Var;
        i44 i44Var2;
        hx5 hx5Var;
        tx5 tx5Var;
        dn2 dn2Var;
        i44 i44Var3;
        i44 i44Var4;
        gx5 gx5Var = (gx5) this.k;
        gx5 gx5VarJ0 = gx5Var.J0((ed1) this.c, (fx4) this.d, (fl1) this.e, (fx5) this.f, this.a, (v15) this.i);
        List typeParameters = gx5Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        wi8 wi8VarR = dh3.R(typeParameters, (ui8) this.g, gx5VarJ0, arrayList);
        t14 t14Var = (t14) this.j;
        rt8 rt8Var = rt8.OUT_VARIANCE;
        t14 t14VarH = wi8VarR.h(t14Var, rt8Var);
        if (t14VarH != null) {
            rt8 rt8Var2 = rt8.IN_VARIANCE;
            t14 t14VarH2 = wi8VarR.h(t14Var, rt8Var2);
            if (t14VarH2 != null) {
                gx5VarJ0.N0(t14VarH2);
            }
            i44 i44Var5 = (i44) this.h;
            if (i44Var5 != null) {
                i44 i44VarG = i44Var5.g(wi8VarR);
                i44Var = i44VarG != null ? i44VarG : null;
            }
            i44 i44Var6 = gx5Var.y0;
            if (i44Var6 != null) {
                t14 t14VarH3 = wi8VarR.h(i44Var6.c(), rt8Var2);
                if (t14VarH3 == null) {
                    i44Var4 = null;
                } else {
                    i44Var6.H0();
                    i44Var4 = new i44(gx5VarJ0, new o62(gx5VarJ0, t14VarH3), i44Var6.getAnnotations());
                }
                i44Var2 = i44Var4;
            } else {
                i44Var2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Iterator it = gx5Var.w0.iterator(); it.hasNext(); it = it) {
                i44 i44Var7 = (i44) it.next();
                t14 t14VarH4 = wi8VarR.h(i44Var7.c(), rt8Var2);
                if (t14VarH4 == null) {
                    i44Var3 = null;
                } else {
                    v15 v15VarF0 = ((g51) i44Var7.H0()).F0();
                    i44Var7.H0();
                    i44Var3 = new i44(gx5VarJ0, new g51(gx5VarJ0, t14VarH4, v15VarF0), i44Var7.getAnnotations());
                }
                if (i44Var3 != null) {
                    arrayList2.add(i44Var3);
                }
            }
            gx5VarJ0.O0(t14VarH, arrayList, i44Var, i44Var2, arrayList2);
            hx5 hx5Var2 = gx5Var.A0;
            g55 g55Var = ke7.G;
            if (hx5Var2 == null) {
                hx5Var = null;
            } else {
                sm annotations = hx5Var2.getAnnotations();
                fx4 fx4Var = (fx4) this.d;
                fl1 fl1VarE = gx5Var.A0.e();
                if (this.a == 2 && gl1.e(gl1.g(fl1VarE.a.k()))) {
                    fl1VarE = gl1.h;
                }
                fl1 fl1Var = fl1VarE;
                hx5 hx5Var3 = gx5Var.A0;
                boolean z = hx5Var3.i0;
                boolean z2 = hx5Var3.j0;
                boolean z3 = hx5Var3.m0;
                int i = this.a;
                fx5 fx5Var = (fx5) this.f;
                hx5Var = new hx5(gx5VarJ0, annotations, fx4Var, fl1Var, z, z2, z3, i, fx5Var == null ? null : fx5Var.b(), g55Var);
            }
            if (hx5Var != null) {
                hx5 hx5Var4 = gx5Var.A0;
                t14 t14Var2 = hx5Var4.q0;
                hx5Var.p0 = gx5.K0(wi8VarR, hx5Var4);
                hx5Var.J0(t14Var2 != null ? wi8VarR.h(t14Var2, rt8Var) : null);
            }
            tx5 tx5Var2 = gx5Var.B0;
            if (tx5Var2 == null) {
                tx5Var = null;
            } else {
                sm annotations2 = tx5Var2.getAnnotations();
                fx4 fx4Var2 = (fx4) this.d;
                fl1 fl1VarE2 = gx5Var.B0.e();
                if (this.a == 2 && gl1.e(gl1.g(fl1VarE2.a.k()))) {
                    fl1VarE2 = gl1.h;
                }
                fl1 fl1Var2 = fl1VarE2;
                tx5 tx5Var3 = gx5Var.B0;
                boolean z4 = tx5Var3.i0;
                boolean z5 = tx5Var3.j0;
                boolean z6 = tx5Var3.m0;
                int i2 = this.a;
                fx5 fx5Var2 = (fx5) this.f;
                tx5Var = new tx5(gx5VarJ0, annotations2, fx4Var2, fl1Var2, z4, z5, z6, i2, fx5Var2 == null ? null : fx5Var2.d(), g55Var);
            }
            if (tx5Var != null) {
                List listK0 = jo2.K0(tx5Var, gx5Var.B0.L(), wi8VarR, false, false, null);
                if (listK0 == null) {
                    listK0 = Collections.singletonList(tx5.I0(tx5Var, el1.e((ed1) this.c).o(), ((ot8) gx5Var.B0.L().get(0)).getAnnotations()));
                }
                if (listK0.size() != 1) {
                    c2.g();
                    return null;
                }
                tx5Var.p0 = gx5.K0(wi8VarR, gx5Var.B0);
                ot8 ot8Var = (ot8) listK0.get(0);
                if (ot8Var == null) {
                    tx5.B(6);
                    throw null;
                }
                tx5Var.q0 = ot8Var;
            }
            y82 y82Var = gx5Var.C0;
            y82 y82Var2 = y82Var == null ? null : new y82(y82Var.getAnnotations(), gx5VarJ0);
            y82 y82Var3 = gx5Var.D0;
            gx5VarJ0.L0(hx5Var, tx5Var, y82Var2, y82Var3 == null ? null : new y82(y82Var3.getAnnotations(), gx5VarJ0));
            if (this.b) {
                pc7 pc7Var = new pc7();
                Iterator it2 = gx5Var.q().iterator();
                while (it2.hasNext()) {
                    pc7Var.add(((fx5) it2.next()).g(wi8VarR));
                }
                gx5VarJ0.o0 = pc7Var;
            }
            if (gx5Var.w() && (dn2Var = gx5Var.l0) != null) {
                gx5VarJ0.M0(gx5Var.k0, dn2Var);
            }
            return gx5VarJ0;
        }
        return null;
    }
}
