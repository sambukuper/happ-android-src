package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cb {
    public final wu0 a;
    public final long b;
    public final ai0 c;
    public final Throwable d;

    public cb(wu0 wu0Var, ai0 ai0Var, Exception exc, int i) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        ai0Var = (i & 4) != 0 ? null : ai0Var;
        exc = (i & 8) != 0 ? null : exc;
        this.a = wu0Var;
        this.b = jElapsedRealtimeNanos;
        this.c = ai0Var;
        this.d = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return this.a == cbVar.a && this.b == cbVar.b && dh3.f(this.c, cbVar.c) && dh3.f(this.d, cbVar.d);
    }

    public final int hashCode() {
        int iG = p61.g(this.a.hashCode() * 31, this.b, 31);
        ai0 ai0Var = this.c;
        int iHashCode = (iG + (ai0Var == null ? 0 : Integer.hashCode(ai0Var.a))) * 31;
        Throwable th = this.d;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ClosingInfo(reason=" + this.a + ", closingTimestamp=" + ((Object) ya8.a(this.b)) + ", errorCode=" + this.c + ", exception=" + this.d + ')';
    }
}
