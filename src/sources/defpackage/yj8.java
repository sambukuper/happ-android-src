package defpackage;

import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yj8 {
    public static final ox1 a = new ox1(new ng8((byte) 1), (byte) 1);

    public static final o88 a(xj8 xj8Var, lp2 lp2Var) {
        wj8 wj8Var = (wj8) lp2Var.j(a);
        switch (xj8Var.ordinal()) {
            case 0:
                return wj8Var.j;
            case 1:
                return wj8Var.k;
            case 2:
                return wj8Var.l;
            case 3:
                return wj8Var.a;
            case 4:
                return wj8Var.b;
            case 5:
                return wj8Var.c;
            case 6:
                return wj8Var.d;
            case 7:
                return wj8Var.e;
            case 8:
                return wj8Var.f;
            case 9:
                return wj8Var.m;
            case 10:
                return wj8Var.n;
            case 11:
                return wj8Var.o;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return wj8Var.g;
            case 13:
                return wj8Var.h;
            case 14:
                return wj8Var.i;
            case 15:
                return wj8Var.y;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return wj8Var.z;
            case 17:
                return wj8Var.A;
            case 18:
                return wj8Var.p;
            case 19:
                return wj8Var.q;
            case 20:
                return wj8Var.r;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return wj8Var.s;
            case 22:
                return wj8Var.t;
            case 23:
                return wj8Var.u;
            case 24:
                return wj8Var.B;
            case 25:
                return wj8Var.C;
            case 26:
                return wj8Var.D;
            case 27:
                return wj8Var.v;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return wj8Var.w;
            case 29:
                return wj8Var.x;
            default:
                b61.c();
                return null;
        }
    }
}
