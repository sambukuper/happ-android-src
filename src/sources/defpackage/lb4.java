package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lb4 implements e37 {
    public final e37 a;

    public lb4(e37 e37Var) {
        this.a = e37Var;
    }

    @Override // defpackage.e37
    public final int d(String str) {
        str.getClass();
        Integer numB0 = mm7.b0(str);
        if (numB0 != null) {
            return numB0.intValue();
        }
        bt.q(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // defpackage.e37
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb4)) {
            return false;
        }
        lb4 lb4Var = (lb4) obj;
        return dh3.f(this.a, lb4Var.a) && dh3.f(a(), lb4Var.a());
    }

    @Override // defpackage.e37
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.e37
    public final List g(int i) {
        if (i >= 0) {
            return d02.X;
        }
        xw3.v(ie2.l("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.e37
    public final e37 h(int i) {
        if (i >= 0) {
            return this.a;
        }
        xw3.v(ie2.l("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.e37
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        xw3.v(ie2.l("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return false;
    }

    @Override // defpackage.e37
    public final nr4 r() {
        return pm7.N;
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
