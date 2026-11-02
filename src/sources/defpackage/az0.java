package defpackage;

import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class az0 implements xn2 {
    @Override // defpackage.xn2
    public final Object G(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, lp2 lp2Var, Integer num) {
        int i;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        h51 h51Var = (h51) obj2;
        sn2 sn2Var = (sn2) obj3;
        dn2 dn2Var = (dn2) obj4;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        hx4 hx4Var = hx4.X;
        if (i2 == 0) {
            i = (lp2Var.f(hx4Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= lp2Var.f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= lp2Var.g(zBooleanValue) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= lp2Var.f(h51Var) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= lp2Var.h(sn2Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= lp2Var.h(dn2Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if (lp2Var.N(i & 1, (599187 & i) != 599186)) {
            l51.c(str, zBooleanValue, h51Var, hx4Var, sn2Var, dn2Var, lp2Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
