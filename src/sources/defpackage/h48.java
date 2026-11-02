package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h48 implements CharSequence {
    public final List X;
    public final c78 Y;
    public final CharSequence Z;
    public final long f0;
    public final f88 g0;
    public final qg5 h0;

    public h48(CharSequence charSequence, long j, f88 f88Var, qg5 qg5Var, List list, List list2, c78 c78Var, int i) {
        f88Var = (i & 4) != 0 ? null : f88Var;
        qg5Var = (i & 8) != 0 ? null : qg5Var;
        list = (i & 16) != 0 ? null : list;
        c78Var = (i & 64) != 0 ? null : c78Var;
        this.X = list;
        this.Y = c78Var;
        this.Z = charSequence instanceof h48 ? ((h48) charSequence).Z : charSequence;
        this.f0 = ct7.d(charSequence.length(), j);
        this.g0 = f88Var != null ? new f88(ct7.d(charSequence.length(), f88Var.a)) : null;
        this.h0 = qg5Var != null ? new qg5(qg5Var.X, new f88(ct7.d(charSequence.length(), ((f88) qg5Var.Y).a))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.Z.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h48.class != obj.getClass()) {
            return false;
        }
        h48 h48Var = (h48) obj;
        if (f88.a(this.f0, h48Var.f0) && dh3.f(this.g0, h48Var.g0) && dh3.f(this.h0, h48Var.h0) && dh3.f(this.X, h48Var.X)) {
            return mm7.Q(this.Z, h48Var.Z) && dh3.f(this.Y, h48Var.Y);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.Z.hashCode() * 31;
        int i = f88.c;
        int iG = p61.g(iHashCode, this.f0, 31);
        f88 f88Var = this.g0;
        int iHashCode2 = (iG + (f88Var != null ? Long.hashCode(f88Var.a) : 0)) * 31;
        qg5 qg5Var = this.h0;
        int iHashCode3 = (iHashCode2 + (qg5Var != null ? qg5Var.hashCode() : 0)) * 31;
        List list = this.X;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        c78 c78Var = this.Y;
        return iHashCode4 + (c78Var != null ? c78Var.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.Z.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.Z.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.Z.toString();
    }
}
