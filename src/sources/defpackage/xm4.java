package defpackage;

import java.util.Iterator;
import su.happ.proxyutility.dto.ServerConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class xm4 {
    public final String a;
    public final long b;
    public final ServerConfig c;
    public final b83 d;
    public final boolean e;
    public final int f;
    public final int g;
    public final a45 h;
    public final Integer i;
    public final boolean j;
    public final wm4 k;
    public final boolean l;
    public final pm4 m;
    public final boolean n;
    public final boolean o;
    public final tm4 p;
    public final boolean q;
    public final boolean r;
    public final qm4 s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xm4(String str, long j, ServerConfig serverConfig, b83 b83Var, boolean z, int i, int i2, a45 a45Var, Integer num, boolean z2, wm4 wm4Var, boolean z3, pm4 pm4Var, boolean z4, boolean z5, tm4 tm4Var) {
        qm4 qm4Var;
        b83Var.getClass();
        wm4Var.getClass();
        tm4Var.getClass();
        this.a = str;
        this.b = j;
        this.c = serverConfig;
        this.d = b83Var;
        this.e = z;
        this.f = i;
        this.g = i2;
        this.h = a45Var;
        this.i = num;
        this.j = z2;
        this.k = wm4Var;
        this.l = z3;
        this.m = pm4Var;
        this.n = z4;
        this.o = z5;
        this.p = tm4Var;
        boolean z6 = false;
        this.q = i > 0;
        if (num != null && num.intValue() >= 3) {
            z6 = true;
        }
        this.r = z6;
        if (((z0) b83Var).isEmpty()) {
            qm4Var = qm4.X;
        } else if (b83Var.isEmpty()) {
            qm4Var = qm4.Y;
        } else {
            Iterator it = b83Var.iterator();
            while (it.hasNext()) {
                if (!((ld6) it.next()).h0) {
                    qm4Var = qm4.Z;
                }
            }
            qm4Var = qm4.Y;
        }
        this.s = qm4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static xm4 a(xm4 xm4Var, String str, long j, ServerConfig serverConfig, b83 b83Var, boolean z, int i, int i2, a45 a45Var, Integer num, boolean z2, wm4 wm4Var, boolean z3, pm4 pm4Var, boolean z4, boolean z5, tm4 tm4Var, int i3) {
        String str2 = (i3 & 1) != 0 ? xm4Var.a : str;
        long j2 = (i3 & 2) != 0 ? xm4Var.b : j;
        ServerConfig serverConfig2 = (i3 & 4) != 0 ? xm4Var.c : serverConfig;
        b83 b83Var2 = (i3 & 8) != 0 ? xm4Var.d : b83Var;
        boolean z6 = (i3 & 16) != 0 ? xm4Var.e : z;
        int i4 = (i3 & 32) != 0 ? xm4Var.f : i;
        int i5 = (i3 & 64) != 0 ? xm4Var.g : i2;
        a45 a45Var2 = (i3 & 128) != 0 ? xm4Var.h : a45Var;
        Integer num2 = (i3 & 256) != 0 ? xm4Var.i : num;
        boolean z7 = (i3 & 512) != 0 ? xm4Var.j : z2;
        wm4 wm4Var2 = (i3 & 1024) != 0 ? xm4Var.k : wm4Var;
        boolean z8 = (i3 & 2048) != 0 ? xm4Var.l : z3;
        pm4 pm4Var2 = (i3 & 4096) != 0 ? xm4Var.m : pm4Var;
        String str3 = str2;
        boolean z9 = (i3 & 8192) != 0 ? xm4Var.n : z4;
        boolean z10 = (i3 & 16384) != 0 ? xm4Var.o : z5;
        tm4 tm4Var2 = (i3 & 32768) != 0 ? xm4Var.p : tm4Var;
        xm4Var.getClass();
        b83Var2.getClass();
        wm4Var2.getClass();
        tm4Var2.getClass();
        return new xm4(str3, j2, serverConfig2, b83Var2, z6, i4, i5, a45Var2, num2, z7, wm4Var2, z8, pm4Var2, z9, z10, tm4Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm4)) {
            return false;
        }
        xm4 xm4Var = (xm4) obj;
        String str = xm4Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            zEquals = str2.equals(str);
        }
        return zEquals && this.b == xm4Var.b && dh3.f(this.c, xm4Var.c) && dh3.f(this.d, xm4Var.d) && this.e == xm4Var.e && this.f == xm4Var.f && this.g == xm4Var.g && this.h == xm4Var.h && dh3.f(this.i, xm4Var.i) && this.j == xm4Var.j && dh3.f(this.k, xm4Var.k) && this.l == xm4Var.l && dh3.f(this.m, xm4Var.m) && this.n == xm4Var.n && this.o == xm4Var.o && dh3.f(this.p, xm4Var.p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.a;
        int iG = p61.g((str == null ? 0 : str.hashCode()) * 31, this.b, 31);
        ServerConfig serverConfig = this.c;
        int iE = oi0.e(this.g, oi0.e(this.f, pc6.f((this.d.hashCode() + ((iG + (serverConfig == null ? 0 : serverConfig.hashCode())) * 31)) * 31, 31, this.e), 31), 31);
        a45 a45Var = this.h;
        int iHashCode = (iE + (a45Var == null ? 0 : a45Var.hashCode())) * 31;
        Integer num = this.i;
        int iF = pc6.f((this.k.hashCode() + pc6.f((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.j)) * 31, 31, this.l);
        pm4 pm4Var = this.m;
        return this.p.hashCode() + pc6.f(pc6.f((iF + (pm4Var != null ? pm4Var.hashCode() : 0)) * 31, 31, this.n), 31, this.o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.a;
        if (str == null) {
            str = "null";
        }
        return "State(focusedGuid=" + str + ", selectServerTimestamp=" + this.b + ", selectedServer=" + this.c + ", remoteMessages=" + this.d + ", isHideAllAllowed=" + this.e + ", serversPinging=" + this.f + ", jobNotificationOpenCount=" + this.g + ", networkTransport=" + this.h + ", pushSendTry=" + this.i + ", isNotificationPermissionGranted=" + this.j + ", subSelectSheetState=" + this.k + ", isDuplicatedNameDialogVisible=" + this.l + ", geoFileCardProgressState=" + this.m + ", isGeoDownloadBottomSheetVisible=" + this.n + ", isUpdateSheetVisible=" + this.o + ", subscriptionEditSheetState=" + this.p + ")";
    }
}
