package defpackage;

import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dj2 implements Comparable {
    public static final dj2 Y;
    public static final dj2 Z;
    public static final dj2 f0;
    public static final dj2 g0;
    public static final dj2 h0;
    public static final dj2 i0;
    public final int X;

    static {
        dj2 dj2Var = new dj2(100);
        dj2 dj2Var2 = new dj2(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE);
        dj2 dj2Var3 = new dj2(300);
        dj2 dj2Var4 = new dj2(400);
        Y = dj2Var4;
        dj2 dj2Var5 = new dj2(500);
        Z = dj2Var5;
        dj2 dj2Var6 = new dj2(XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMax);
        f0 = dj2Var6;
        dj2 dj2Var7 = new dj2(700);
        dj2 dj2Var8 = new dj2(800);
        dj2 dj2Var9 = new dj2(900);
        g0 = dj2Var4;
        h0 = dj2Var5;
        i0 = dj2Var7;
        i21.L(dj2Var, dj2Var2, dj2Var3, dj2Var4, dj2Var5, dj2Var6, dj2Var7, dj2Var8, dj2Var9);
    }

    public dj2(int i) {
        this.X = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        xc3.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return dh3.k(this.X, ((dj2) obj).X);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dj2) {
            return this.X == ((dj2) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return this.X;
    }

    public final String toString() {
        return ie2.h("FontWeight(weight=", this.X, ")");
    }
}
