package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jh7 {
    public final s7 a;
    public final t7 b;
    public final i00 c;
    public final qd2 d;
    public final List e;
    public final List f;
    public final List g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;

    public jh7(s7 s7Var, t7 t7Var, i00 i00Var, qd2 qd2Var, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = s7Var;
        this.b = t7Var;
        this.c = i00Var;
        this.d = qd2Var;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = bool;
        this.i = bool2;
        this.j = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh7)) {
            return false;
        }
        jh7 jh7Var = (jh7) obj;
        return dh3.f(this.a, jh7Var.a) && dh3.f(this.b, jh7Var.b) && dh3.f(this.c, jh7Var.c) && dh3.f(this.d, jh7Var.d) && dh3.f(this.e, jh7Var.e) && dh3.f(this.f, jh7Var.f) && dh3.f(this.g, jh7Var.g) && dh3.f(this.h, jh7Var.h) && dh3.f(this.i, jh7Var.i) && dh3.f(this.j, jh7Var.j);
    }

    public final int hashCode() {
        s7 s7Var = this.a;
        int iHashCode = (s7Var == null ? 0 : Integer.hashCode(s7Var.a)) * 31;
        t7 t7Var = this.b;
        int iHashCode2 = (iHashCode + (t7Var == null ? 0 : Integer.hashCode(t7Var.a))) * 31;
        i00 i00Var = this.c;
        int iHashCode3 = (iHashCode2 + (i00Var == null ? 0 : Integer.hashCode(i00Var.a))) * 31;
        qd2 qd2Var = this.d;
        int iHashCode4 = (iHashCode3 + (qd2Var == null ? 0 : Integer.hashCode(qd2Var.a))) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.g;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.j;
        return iHashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "State3A(aeMode=" + this.a + ", afMode=" + this.b + ", awbMode=" + this.c + ", flashMode=" + this.d + ", aeRegions=" + this.e + ", afRegions=" + this.f + ", awbRegions=" + this.g + ", aeLock=" + this.h + ", afLock=" + this.i + ", awbLock=" + this.j + ')';
    }
}
