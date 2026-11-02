package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pk0 extends mk0 {
    public final String a;
    public final wu0 b;
    public final Integer c;
    public final jx1 d;
    public final Throwable e;
    public final jx1 f;
    public final jx1 g;
    public final jx1 h;
    public final ai0 i;

    public pk0(String str, wu0 wu0Var, Integer num, jx1 jx1Var, Throwable th, jx1 jx1Var2, jx1 jx1Var3, jx1 jx1Var4, ai0 ai0Var) {
        str.getClass();
        this.a = str;
        this.b = wu0Var;
        this.c = num;
        this.d = jx1Var;
        this.e = th;
        this.f = jx1Var2;
        this.g = jx1Var3;
        this.h = jx1Var4;
        this.i = ai0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk0)) {
            return false;
        }
        pk0 pk0Var = (pk0) obj;
        return dh3.f(this.a, pk0Var.a) && this.b == pk0Var.b && dh3.f(this.c, pk0Var.c) && dh3.f(this.d, pk0Var.d) && dh3.f(this.e, pk0Var.e) && dh3.f(this.f, pk0Var.f) && dh3.f(this.g, pk0Var.g) && dh3.f(this.h, pk0Var.h) && dh3.f(this.i, pk0Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        jx1 jx1Var = this.d;
        int iHashCode3 = (iHashCode2 + (jx1Var == null ? 0 : Long.hashCode(jx1Var.a))) * 31;
        Throwable th = this.e;
        int iHashCode4 = (iHashCode3 + (th == null ? 0 : th.hashCode())) * 31;
        jx1 jx1Var2 = this.f;
        int iHashCode5 = (iHashCode4 + (jx1Var2 == null ? 0 : Long.hashCode(jx1Var2.a))) * 31;
        jx1 jx1Var3 = this.g;
        int iHashCode6 = (iHashCode5 + (jx1Var3 == null ? 0 : Long.hashCode(jx1Var3.a))) * 31;
        jx1 jx1Var4 = this.h;
        int iHashCode7 = (iHashCode6 + (jx1Var4 == null ? 0 : Long.hashCode(jx1Var4.a))) * 31;
        ai0 ai0Var = this.i;
        return iHashCode7 + (ai0Var != null ? Integer.hashCode(ai0Var.a) : 0);
    }

    public final String toString() {
        return "CameraStateClosed(cameraId=" + ((Object) vi0.b(this.a)) + ", cameraClosedReason=" + this.b + ", cameraRetryCount=" + this.c + ", cameraRetryDurationNs=" + this.d + ", cameraException=" + this.e + ", cameraOpenDurationNs=" + this.f + ", cameraActiveDurationNs=" + this.g + ", cameraClosingDurationNs=" + this.h + ", cameraErrorCode=" + this.i + ')';
    }
}
