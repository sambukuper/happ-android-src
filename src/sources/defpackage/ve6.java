package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ve6 extends kk0 {
    public final sy8 a;
    public final List b;
    public final it2 c;
    public final ze0 d;

    public ve6(sy8 sy8Var, List list, it2 it2Var, ze0 ze0Var) {
        this.a = sy8Var;
        this.b = list;
        this.c = it2Var;
        this.d = ze0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ve6) {
            ve6 ve6Var = (ve6) obj;
            return this.a == ve6Var.a && this.b.equals(ve6Var.b) && this.c == ve6Var.c && this.d == ve6Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + pc6.f((this.c.hashCode() + p61.f(this.a.hashCode() * 31, 31, this.b)) * 31, 31, false);
    }

    public final String toString() {
        return "RequestOpen(virtualCamera=" + this.a + ", sharedCameraIds=" + this.b + ", graphListener=" + this.c + ", isPrewarm=false, isForegroundObserver=" + this.d + ')';
    }
}
