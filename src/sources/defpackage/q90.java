package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q90 implements vz8 {
    public Object X = z90.p;
    public mm0 Y;
    public final /* synthetic */ x90 Z;

    public q90(x90 x90Var) {
        this.Z = x90Var;
    }

    @Override // defpackage.vz8
    public final void a(nz6 nz6Var, int i) {
        mm0 mm0Var = this.Y;
        if (mm0Var != null) {
            mm0Var.a(nz6Var, i);
        }
    }

    public final Object b(s51 s51Var) {
        vp0 vp0VarI;
        Boolean bool;
        Object obj = this.X;
        boolean z = true;
        if (obj == z90.p || obj == z90.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x90.k0;
            x90 x90Var = this.Z;
            vp0 vp0Var = (vp0) atomicReferenceFieldUpdater.get(x90Var);
            while (true) {
                byte b = 0;
                if (x90Var.z()) {
                    this.X = z90.l;
                    Throwable thL = x90Var.l();
                    if (thL == null) {
                        z = false;
                        break;
                    }
                    int i = gg7.a;
                    throw thL;
                }
                long andIncrement = x90.g0.getAndIncrement(x90Var);
                long j = z90.b;
                long j2 = andIncrement / j;
                int i2 = (int) (andIncrement % j);
                if (vp0Var.f0 != j2) {
                    vp0VarI = x90Var.i(j2, vp0Var);
                    if (vp0VarI == null) {
                        continue;
                    }
                } else {
                    vp0VarI = vp0Var;
                }
                Object objM = x90Var.M(vp0VarI, i2, andIncrement, null);
                z31 z31Var = z90.m;
                o90 o90Var = null;
                if (objM == z31Var) {
                    bt.i("unreachable");
                    return null;
                }
                z31 z31Var2 = z90.o;
                if (objM != z31Var2) {
                    if (objM != z90.n) {
                        vp0VarI.a();
                        this.X = objM;
                        break;
                    }
                    x90 x90Var2 = this.Z;
                    mm0 mm0VarT = u70.T(mb6.H(s51Var));
                    try {
                        this.Y = mm0VarT;
                        Object objM2 = x90Var2.M(vp0VarI, i2, andIncrement, this);
                        gn2 gn2Var = x90Var2.Y;
                        if (objM2 != z31Var) {
                            if (objM2 == z31Var2) {
                                if (andIncrement < x90Var2.v()) {
                                    vp0VarI.a();
                                }
                                vp0 vp0Var2 = (vp0) x90.k0.get(x90Var2);
                                while (true) {
                                    if (x90Var2.z()) {
                                        mm0 mm0Var = this.Y;
                                        mm0Var.getClass();
                                        this.Y = null;
                                        this.X = z90.l;
                                        Throwable thL2 = x90Var.l();
                                        if (thL2 != null) {
                                            mm0Var.f(new rj6(thL2));
                                            break;
                                        }
                                        mm0Var.f(Boolean.FALSE);
                                        break;
                                    }
                                    long andIncrement2 = x90.g0.getAndIncrement(x90Var2);
                                    long j3 = z90.b;
                                    long j4 = andIncrement2 / j3;
                                    int i3 = (int) (andIncrement2 % j3);
                                    if (vp0Var2.f0 != j4) {
                                        vp0 vp0VarI2 = x90Var2.i(j4, vp0Var2);
                                        if (vp0VarI2 != null) {
                                            vp0Var2 = vp0VarI2;
                                        }
                                    }
                                    Object objM3 = x90Var2.M(vp0Var2, i3, andIncrement2, this);
                                    if (objM3 == z90.m) {
                                        a(vp0Var2, i3);
                                        break;
                                    }
                                    if (objM3 == z90.o) {
                                        if (andIncrement2 < x90Var2.v()) {
                                            vp0Var2.a();
                                        }
                                    } else {
                                        if (objM3 == z90.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        vp0Var2.a();
                                        this.X = objM3;
                                        this.Y = null;
                                        bool = Boolean.TRUE;
                                        if (gn2Var != null) {
                                            o90Var = new o90(gn2Var, objM3, b);
                                        }
                                    }
                                }
                            } else {
                                vp0VarI.a();
                                this.X = objM2;
                                this.Y = null;
                                bool = Boolean.TRUE;
                                if (gn2Var != null) {
                                    o90Var = new o90(gn2Var, objM2, b);
                                }
                            }
                            mm0VarT.y(bool, o90Var);
                            break;
                        }
                        a(vp0VarI, i2);
                        return mm0VarT.q();
                    } catch (Throwable th) {
                        mm0VarT.C();
                        throw th;
                    }
                }
                if (andIncrement < x90Var.v()) {
                    vp0VarI.a();
                }
                vp0Var = vp0VarI;
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.X;
        z31 z31Var = z90.p;
        if (obj == z31Var) {
            bt.i("`hasNext()` has not been invoked");
            return null;
        }
        this.X = z31Var;
        if (obj != z90.l) {
            return obj;
        }
        Throwable thP = this.Z.p();
        int i = gg7.a;
        throw thP;
    }
}
