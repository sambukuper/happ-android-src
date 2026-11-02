package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class st3 implements xl1 {
    public final zs3 X;
    public final zs3 Y;
    public final qb6 Z;

    public st3(qb6 qb6Var, zy5 zy5Var, qt3 qt3Var, boolean z, wl1 wl1Var) {
        qb6Var.getClass();
        zy5Var.getClass();
        qt3Var.getClass();
        zs3 zs3Var = new zs3(zs3.b(ia6.a(qb6Var.a)));
        b04 b04Var = qb6Var.b;
        zs3 zs3Var2 = null;
        String str = b04Var.a != a04.MULTIFILE_CLASS_PART ? null : b04Var.f;
        if (str != null && str.length() > 0) {
            zs3Var2 = new zs3(str);
        }
        this.X = zs3Var;
        this.Y = zs3Var2;
        this.Z = qb6Var;
        aq2 aq2Var = lu3.k;
        aq2Var.getClass();
        Integer num = (Integer) ch3.y(zy5Var, aq2Var);
        if (num != null) {
            qt3Var.getString(num.intValue());
        }
    }

    public final qs0 a() {
        fk2 fk2Var;
        zs3 zs3Var = this.X;
        String str = zs3Var.a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            fk2Var = fk2.c;
            if (fk2Var == null) {
                zs3.a(9);
                throw null;
            }
        } else {
            fk2Var = new fk2(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String str2 = zs3Var.a;
        if (str2 != null) {
            return new qs0(fk2Var, v15.e(fm7.K0('/', str2, str2)));
        }
        zs3.a(10);
        throw null;
    }

    @Override // defpackage.xl1
    public final String m() {
        return oi0.o(new StringBuilder("Class '"), a().a().a.a, '\'');
    }

    public final String toString() {
        return st3.class.getSimpleName() + ": " + this.X;
    }
}
