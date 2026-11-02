package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ta4 implements e37 {
    public final e37 a;
    public final e37 b;

    public ta4(e37 e37Var, e37 e37Var2) {
        e37Var.getClass();
        e37Var2.getClass();
        this.a = e37Var;
        this.b = e37Var2;
    }

    @Override // defpackage.e37
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // defpackage.e37
    public final int d(String str) {
        str.getClass();
        Integer numB0 = mm7.b0(str);
        if (numB0 != null) {
            return numB0.intValue();
        }
        bt.q(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // defpackage.e37
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta4)) {
            return false;
        }
        ta4 ta4Var = (ta4) obj;
        return dh3.f(this.a, ta4Var.a) && dh3.f(this.b, ta4Var.b);
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
        em7.c(ie2.h("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return null;
    }

    @Override // defpackage.e37
    public final e37 h(int i) {
        if (i < 0) {
            em7.c(ie2.h("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.a;
        }
        if (i2 == 1) {
            return this.b;
        }
        bt.i("Unreached");
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override // defpackage.e37
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        em7.c(ie2.h("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return false;
    }

    @Override // defpackage.e37
    public final nr4 r() {
        return pm7.O;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
