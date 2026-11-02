package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import su.happ.proxyutility.dto.AppInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class lk5 {
    public final jk5 a;
    public final String b;
    public final j2 c;
    public final km5 d;
    public final j2 e;
    public final boolean f;
    public final boolean g;
    public final km5 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lk5(jk5 jk5Var, String str, j2 j2Var, km5 km5Var, j2 j2Var2, boolean z) {
        jk5Var.getClass();
        j2Var.getClass();
        km5Var.getClass();
        j2Var2.getClass();
        this.a = jk5Var;
        this.b = str;
        this.c = j2Var;
        this.d = km5Var;
        this.e = j2Var2;
        this.f = z;
        this.g = km5Var.Z.Y == j2Var.a();
        ArrayList arrayList = new ArrayList(xv0.Z(j2Var, 10));
        ListIterator listIterator = j2Var.listIterator(0);
        while (listIterator.hasNext()) {
            arrayList.add(((AppInfo) listIterator.next()).getPackageName());
        }
        this.h = mb6.g0(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static lk5 a(lk5 lk5Var, jk5 jk5Var, String str, j2 j2Var, km5 km5Var, j2 j2Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            jk5Var = lk5Var.a;
        }
        jk5 jk5Var2 = jk5Var;
        if ((i & 2) != 0) {
            str = lk5Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j2Var = lk5Var.c;
        }
        j2 j2Var3 = j2Var;
        if ((i & 8) != 0) {
            km5Var = lk5Var.d;
        }
        km5 km5Var2 = km5Var;
        if ((i & 16) != 0) {
            j2Var2 = lk5Var.e;
        }
        j2 j2Var4 = j2Var2;
        if ((i & 32) != 0) {
            z = lk5Var.f;
        }
        lk5Var.getClass();
        jk5Var2.getClass();
        j2Var3.getClass();
        km5Var2.getClass();
        j2Var4.getClass();
        return new lk5(jk5Var2, str2, j2Var3, km5Var2, j2Var4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk5)) {
            return false;
        }
        lk5 lk5Var = (lk5) obj;
        return this.a == lk5Var.a && this.b.equals(lk5Var.b) && dh3.f(this.c, lk5Var.c) && dh3.f(this.d, lk5Var.d) && dh3.f(this.e, lk5Var.e) && this.f == lk5Var.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + pc6.e(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PerAppProxyState(currentMode=" + this.a + ", query=" + this.b + ", allApps=" + this.c + ", selectedAppPackages=" + this.d + ", shownApps=" + this.e + ", allowSystemApps=" + this.f + ")";
    }
}
