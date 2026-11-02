package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vx0 {
    public final Object a;
    public final em0 b;
    public final sn2 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ vx0(Object obj, em0 em0Var, sn2 sn2Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : em0Var, (i & 4) != 0 ? null : sn2Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static vx0 a(vx0 vx0Var, em0 em0Var, Throwable th, int i) {
        Object obj = vx0Var.a;
        if ((i & 2) != 0) {
            em0Var = vx0Var.b;
        }
        em0 em0Var2 = em0Var;
        sn2 sn2Var = vx0Var.c;
        Object obj2 = vx0Var.d;
        if ((i & 16) != 0) {
            th = vx0Var.e;
        }
        return new vx0(obj, em0Var2, sn2Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx0)) {
            return false;
        }
        vx0 vx0Var = (vx0) obj;
        return dh3.f(this.a, vx0Var.a) && dh3.f(this.b, vx0Var.b) && dh3.f(this.c, vx0Var.c) && dh3.f(this.d, vx0Var.d) && dh3.f(this.e, vx0Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        em0 em0Var = this.b;
        int iHashCode2 = (iHashCode + (em0Var == null ? 0 : em0Var.hashCode())) * 31;
        sn2 sn2Var = this.c;
        int iHashCode3 = (iHashCode2 + (sn2Var == null ? 0 : sn2Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public vx0(Object obj, em0 em0Var, sn2 sn2Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = em0Var;
        this.c = sn2Var;
        this.d = obj2;
        this.e = th;
    }
}
