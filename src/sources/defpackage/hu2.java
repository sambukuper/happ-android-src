package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hu2 implements xw6, ha5, p52 {
    public final Context X;
    public final mh1 Z;
    public boolean f0;
    public final fv5 i0;
    public final xd6 j0;
    public final xy0 k0;
    public Boolean m0;
    public final cc0 n0;
    public final y5 o0;
    public final yr6 p0;
    public final HashMap Y = new HashMap();
    public final Object g0 = new Object();
    public final xd6 h0 = new xd6(new fj4((byte) 2));
    public final HashMap l0 = new HashMap();

    static {
        lh4.a1("GreedyScheduler");
    }

    public hu2(Context context, xy0 xy0Var, y5 y5Var, fv5 fv5Var, xd6 xd6Var, y5 y5Var2) {
        this.X = context;
        yr2 yr2Var = (yr2) xy0Var.h0;
        this.Z = new mh1(this, yr2Var, (f08) xy0Var.g0);
        this.p0 = new yr6(yr2Var, xd6Var);
        this.o0 = y5Var2;
        this.n0 = new cc0(y5Var);
        this.k0 = xy0Var;
        this.i0 = fv5Var;
        this.j0 = xd6Var;
    }

    @Override // defpackage.ha5
    public final void a(l49 l49Var, x31 x31Var) {
        s39 s39VarB = v18.b(l49Var);
        boolean z = x31Var instanceof v31;
        xd6 xd6Var = this.j0;
        yr6 yr6Var = this.p0;
        xd6 xd6Var2 = this.h0;
        if (z) {
            if (xd6Var2.j(s39VarB)) {
                return;
            }
            lh4 lh4VarP0 = lh4.P0();
            s39VarB.toString();
            lh4VarP0.getClass();
            bh7 bh7VarL = xd6Var2.L(s39VarB);
            yr6Var.q(bh7VarL);
            xd6Var.getClass();
            xd6Var.I(bh7VarL, null);
            return;
        }
        lh4 lh4VarP1 = lh4.P0();
        s39VarB.toString();
        lh4VarP1.getClass();
        bh7 bh7VarE = xd6Var2.E(s39VarB);
        if (bh7VarE != null) {
            yr6Var.b(bh7VarE);
            int i = ((w31) x31Var).a;
            xd6Var.getClass();
            xd6Var.J(bh7VarE, i);
        }
    }

    @Override // defpackage.p52
    public final void b(s39 s39Var, boolean z) {
        bm3 bm3Var;
        bh7 bh7VarE = this.h0.E(s39Var);
        if (bh7VarE != null) {
            this.p0.b(bh7VarE);
        }
        synchronized (this.g0) {
            bm3Var = (bm3) this.Y.remove(s39Var);
        }
        if (bm3Var != null) {
            lh4 lh4VarP0 = lh4.P0();
            Objects.toString(s39Var);
            lh4VarP0.getClass();
            bm3Var.m(null);
        }
        if (z) {
            return;
        }
        synchronized (this.g0) {
            this.l0.remove(s39Var);
        }
    }

    @Override // defpackage.xw6
    public final boolean c() {
        return false;
    }

    @Override // defpackage.xw6
    public final void d(String str) {
        List<bh7> listB;
        Runnable runnable;
        Boolean boolValueOf = this.m0;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(dv5.a(this.X, this.k0));
            this.m0 = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            lh4.P0().getClass();
            return;
        }
        if (!this.f0) {
            this.i0.a(this);
            this.f0 = true;
        }
        lh4.P0().getClass();
        mh1 mh1Var = this.Z;
        if (mh1Var != null && (runnable = (Runnable) mh1Var.c.remove(str)) != null) {
            ((Handler) mh1Var.b.Y).removeCallbacks(runnable);
        }
        xd6 xd6Var = this.h0;
        xd6Var.getClass();
        str.getClass();
        synchronized (xd6Var.Z) {
            listB = ((fj4) xd6Var.Y).b(str);
        }
        for (bh7 bh7Var : listB) {
            this.p0.b(bh7Var);
            xd6 xd6Var2 = this.j0;
            xd6Var2.getClass();
            xd6Var2.J(bh7Var, -512);
        }
    }

    @Override // defpackage.xw6
    public final void e(l49... l49VarArr) {
        long jMax;
        Boolean boolValueOf = this.m0;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(dv5.a(this.X, this.k0));
            this.m0 = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            lh4.P0().getClass();
            return;
        }
        if (!this.f0) {
            this.i0.a(this);
            this.f0 = true;
        }
        HashSet<l49> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (l49 l49Var : l49VarArr) {
            if (!this.h0.j(v18.b(l49Var))) {
                synchronized (this.g0) {
                    try {
                        s39 s39VarB = v18.b(l49Var);
                        gu2 gu2Var = (gu2) this.l0.get(s39VarB);
                        if (gu2Var == null) {
                            int i = l49Var.k;
                            Object obj = this.k0.g0;
                            gu2Var = new gu2(i, System.currentTimeMillis());
                            this.l0.put(s39VarB, gu2Var);
                        }
                        jMax = (((long) Math.max((l49Var.k - gu2Var.a) - 5, 0)) * 30000) + gu2Var.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(l49Var.a(), jMax);
                Object obj2 = this.k0.g0;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (l49Var.b == u39.X) {
                    if (jCurrentTimeMillis < jMax2) {
                        mh1 mh1Var = this.Z;
                        if (mh1Var != null) {
                            yr2 yr2Var = mh1Var.b;
                            HashMap map = mh1Var.c;
                            Runnable runnable = (Runnable) map.remove(l49Var.a);
                            if (runnable != null) {
                                ((Handler) yr2Var.Y).removeCallbacks(runnable);
                            }
                            zo2 zo2Var = new zo2((byte) 8, mh1Var, l49Var, false);
                            map.put(l49Var.a, zo2Var);
                            ((Handler) yr2Var.Y).postDelayed(zo2Var, jMax2 - System.currentTimeMillis());
                        }
                    } else if (!dh3.f(p31.j, l49Var.j)) {
                        p31 p31Var = l49Var.j;
                        if (p31Var.d) {
                            lh4 lh4VarP0 = lh4.P0();
                            l49Var.toString();
                            lh4VarP0.getClass();
                        } else if (p31Var.b()) {
                            lh4 lh4VarP1 = lh4.P0();
                            l49Var.toString();
                            lh4VarP1.getClass();
                        } else {
                            hashSet.add(l49Var);
                            hashSet2.add(l49Var.a);
                        }
                    } else if (!this.h0.j(v18.b(l49Var))) {
                        lh4.P0().getClass();
                        xd6 xd6Var = this.h0;
                        xd6Var.getClass();
                        bh7 bh7VarL = xd6Var.L(v18.b(l49Var));
                        this.p0.q(bh7VarL);
                        xd6 xd6Var2 = this.j0;
                        xd6Var2.getClass();
                        xd6Var2.I(bh7VarL, null);
                    }
                }
            }
        }
        synchronized (this.g0) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    lh4.P0().getClass();
                    for (l49 l49Var2 : hashSet) {
                        s39 s39VarB2 = v18.b(l49Var2);
                        if (!this.Y.containsKey(s39VarB2)) {
                            this.Y.put(s39VarB2, k39.a(this.n0, l49Var2, (u61) this.o0.Z, this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
