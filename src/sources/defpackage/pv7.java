package defpackage;

import su.happ.proxyutility.dto.ServerCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class pv7 implements tv7 {
    public final ServerCache a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final vn5 e;
    public final boolean f;
    public final boolean g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pv7(ServerCache serverCache, String str, boolean z, boolean z2, vn5 vn5Var, boolean z3, boolean z4) {
        str.getClass();
        this.a = serverCache;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = vn5Var;
        this.f = z3;
        this.g = z4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv7)) {
            return false;
        }
        pv7 pv7Var = (pv7) obj;
        return this.a.equals(pv7Var.a) && dh3.f(this.b, pv7Var.b) && this.c == pv7Var.c && this.d == pv7Var.d && this.e == pv7Var.e && this.f == pv7Var.f && this.g == pv7Var.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.g) + pc6.f((this.e.hashCode() + pc6.f(pc6.f(pc6.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Server(value=");
        sb.append(this.a);
        sb.append(", subId=");
        sb.append(this.b);
        sb.append(", isRoundedCorners=");
        sb.append(this.c);
        sb.append(", isSettingHidden=");
        sb.append(this.d);
        sb.append(", pingResult=");
        sb.append(this.e);
        sb.append(", isChecked=");
        sb.append(this.f);
        sb.append(", isDescriptionVisible=");
        return p61.o(sb, this.g, ")");
    }
}
