package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p11 extends x90 {
    public final l90 u0;

    public p11(int i, l90 l90Var, gn2 gn2Var) {
        super(i, gn2Var);
        this.u0 = l90Var;
        if (l90Var == l90.X) {
            em7.h("This implementation does not support suspension for senders, use ", yb6.a.b(x90.class).E(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        em7.c(ie2.h("Buffered channel capacity must be at least 1, but ", i, " was specified"));
        throw null;
    }

    @Override // defpackage.x90
    public final boolean B() {
        return this.u0 == l90.Y;
    }

    public final Object Q(Object obj, boolean z) {
        gn2 gn2Var;
        xl8 xl8VarT;
        l90 l90Var = this.u0;
        l90 l90Var2 = l90.Z;
        dn8 dn8Var = dn8.a;
        vz8 vz8Var = null;
        if (l90Var == l90Var2) {
            Object objB = super.b(obj);
            if (!(objB instanceof tp0) || (objB instanceof sp0)) {
                return objB;
            }
            if (z && (gn2Var = this.Y) != null && (xl8VarT = jm4.t(gn2Var, obj, null)) != null) {
                throw xl8VarT;
            }
        } else {
            Object obj2 = obj;
            Object obj3 = z90.d;
            vp0 vp0Var = (vp0) x90.j0.get(this);
            while (true) {
                long andIncrement = x90.f0.getAndIncrement(this);
                long j = 1152921504606846975L & andIncrement;
                boolean zY = y(andIncrement, false);
                int i = z90.b;
                long j2 = i;
                long j3 = j / j2;
                vz8 vz8Var2 = vz8Var;
                int i2 = (int) (j % j2);
                if (vp0Var.f0 != j3) {
                    vp0 vp0VarJ = j(j3, vp0Var);
                    if (vp0VarJ != null) {
                        vp0Var = vp0VarJ;
                    } else if (zY) {
                        return new sp0(u());
                    }
                    vz8Var = vz8Var2;
                }
                int iN = N(vp0Var, i2, obj2, j, obj3, zY);
                if (iN == 0) {
                    vp0Var.a();
                    return dn8Var;
                }
                if (iN != 1) {
                    if (iN == 2) {
                        if (!zY) {
                            vz8 vz8Var3 = obj3 instanceof vz8 ? (vz8) obj3 : vz8Var2;
                            if (vz8Var3 != null) {
                                vz8Var3.a(vp0Var, i2 + i);
                            }
                            g((vp0Var.f0 * j2) + ((long) i2));
                            break;
                        }
                        vp0Var.i();
                        return new sp0(u());
                    }
                    if (iN == 3) {
                        bt.i("unexpected");
                        return vz8Var2;
                    }
                    if (iN == 4) {
                        if (j < t()) {
                            vp0Var.a();
                        }
                        return new sp0(u());
                    }
                    if (iN == 5) {
                        vp0Var.a();
                    }
                    obj2 = obj;
                    vz8Var = vz8Var2;
                } else {
                    break;
                }
            }
        }
        return dn8Var;
    }

    @Override // defpackage.x90, defpackage.n17
    public final Object a(q51 q51Var, Object obj) throws Throwable {
        xl8 xl8VarT;
        if (!(Q(obj, true) instanceof sp0)) {
            return dn8.a;
        }
        gn2 gn2Var = this.Y;
        if (gn2Var == null || (xl8VarT = jm4.t(gn2Var, obj, null)) == null) {
            throw u();
        }
        gv3.g(xl8VarT, u());
        throw xl8VarT;
    }

    @Override // defpackage.x90, defpackage.n17
    public final Object b(Object obj) {
        return Q(obj, false);
    }
}
