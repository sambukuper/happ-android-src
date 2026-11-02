package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ud {
    public final Context a;
    public final fi1 b;
    public final long c;
    public final ig5 d;

    public ud(Context context, fi1 fi1Var, long j, ig5 ig5Var) {
        this.a = context;
        this.b = fi1Var;
        this.c = j;
        this.d = ig5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ud.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ud udVar = (ud) obj;
        if (!dh3.f(this.a, udVar.a) || !dh3.f(this.b, udVar.b)) {
            return false;
        }
        long j = udVar.c;
        int i = dw0.h;
        return tk8.a(this.c, j) && this.d.equals(udVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = dw0.h;
        return this.d.hashCode() + p61.g(iHashCode, this.c, 31);
    }
}
