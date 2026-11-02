package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s76 {
    public final Context a;
    public final t63 b;
    public final vz7 c;
    public final vz7 d;
    public final vz7 e;
    public final uy0 f;

    public s76(Context context, t63 t63Var, vz7 vz7Var, vz7 vz7Var2, vz7 vz7Var3, uy0 uy0Var) {
        this.a = context;
        this.b = t63Var;
        this.c = vz7Var;
        this.d = vz7Var2;
        this.e = vz7Var3;
        this.f = uy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s76) {
            s76 s76Var = (s76) obj;
            return dh3.f(this.a, s76Var.a) && this.b.equals(s76Var.b) && this.c == s76Var.c && this.d == s76Var.d && this.e == s76Var.e && this.f == s76Var.f;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f.hashCode() + ((c42.a.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + c42.a + ", componentRegistry=" + this.f + ", logger=null)";
    }
}
