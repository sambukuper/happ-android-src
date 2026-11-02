package defpackage;

import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.metrics.ConscryptStatsLog;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kw0 {
    public static final ox1 a = new ox1(new w60((byte) 11), (byte) 1);
    public static final ox1 b = new ox1(new w60((byte) 12), (byte) 1);

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public static final long a(long j, lp2 lp2Var) {
        lp2Var.W(89374938);
        iw0 iw0Var = (iw0) lp2Var.j(a);
        long j2 = iw0Var.a;
        long j3 = iw0Var.U;
        long j4 = iw0Var.Q;
        long j5 = iw0Var.M;
        long j6 = iw0Var.q;
        int i = dw0.h;
        if (tk8.a(j, j2)) {
            j3 = iw0Var.b;
        } else if (tk8.a(j, iw0Var.f)) {
            j3 = iw0Var.g;
        } else if (tk8.a(j, iw0Var.j)) {
            j3 = iw0Var.k;
        } else if (tk8.a(j, iw0Var.n)) {
            j3 = iw0Var.o;
        } else if (tk8.a(j, iw0Var.w)) {
            j3 = iw0Var.x;
        } else if (tk8.a(j, iw0Var.c)) {
            j3 = iw0Var.d;
        } else if (tk8.a(j, iw0Var.h)) {
            j3 = iw0Var.i;
        } else if (tk8.a(j, iw0Var.l)) {
            j3 = iw0Var.m;
        } else if (tk8.a(j, iw0Var.y)) {
            j3 = iw0Var.z;
        } else if (tk8.a(j, iw0Var.u)) {
            j3 = iw0Var.v;
        } else if (tk8.a(j, iw0Var.p)) {
            j3 = j6;
        } else if (tk8.a(j, iw0Var.r)) {
            j3 = iw0Var.s;
        } else if (tk8.a(j, iw0Var.D) || tk8.a(j, iw0Var.F) || tk8.a(j, iw0Var.G) || tk8.a(j, iw0Var.H) || tk8.a(j, iw0Var.I) || tk8.a(j, iw0Var.J) || tk8.a(j, iw0Var.E)) {
            j3 = j6;
        } else if (tk8.a(j, iw0Var.K) || tk8.a(j, iw0Var.L)) {
            j3 = j5;
        } else if (tk8.a(j, iw0Var.O) || tk8.a(j, iw0Var.P)) {
            j3 = j4;
        } else if (!tk8.a(j, iw0Var.S) && !tk8.a(j, iw0Var.T)) {
            j3 = dw0.g;
        }
        if (j3 == 16) {
            j3 = ((dw0) lp2Var.j(j41.a)).a;
        }
        lp2Var.p(false);
        return j3;
    }

    public static final long b(iw0 iw0Var, jw0 jw0Var) {
        switch (jw0Var.ordinal()) {
            case 0:
                return iw0Var.n;
            case 1:
                return iw0Var.w;
            case 2:
                return iw0Var.y;
            case 3:
                return iw0Var.v;
            case 4:
                return iw0Var.e;
            case 5:
                return iw0Var.u;
            case 6:
                return iw0Var.o;
            case 7:
                return iw0Var.x;
            case 8:
                return iw0Var.z;
            case 9:
                return iw0Var.b;
            case 10:
                return iw0Var.d;
            case 11:
                return iw0Var.M;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return iw0Var.N;
            case 13:
                return iw0Var.g;
            case 14:
                return iw0Var.i;
            case 15:
                return iw0Var.Q;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return iw0Var.R;
            case 17:
                return iw0Var.q;
            case 18:
                return iw0Var.s;
            case 19:
                return iw0Var.k;
            case 20:
                return iw0Var.m;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return iw0Var.U;
            case 22:
                return iw0Var.V;
            case 23:
                return iw0Var.A;
            case 24:
                return iw0Var.B;
            case 25:
                return iw0Var.a;
            case 26:
                return iw0Var.c;
            case 27:
                return iw0Var.K;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return iw0Var.L;
            case 29:
                return iw0Var.C;
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                return iw0Var.f;
            case 31:
                return iw0Var.h;
            case 32:
                return iw0Var.O;
            case 33:
                return iw0Var.P;
            case 34:
                return iw0Var.p;
            case 35:
                return iw0Var.D;
            case 36:
                return iw0Var.F;
            case 37:
                return iw0Var.G;
            case 38:
                return iw0Var.H;
            case 39:
                return iw0Var.I;
            case 40:
                return iw0Var.J;
            case 41:
                return iw0Var.E;
            case 42:
                return iw0Var.t;
            case 43:
                return iw0Var.r;
            case 44:
                return iw0Var.j;
            case 45:
                return iw0Var.l;
            case 46:
                return iw0Var.S;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                return iw0Var.T;
            default:
                b61.c();
                return 0L;
        }
    }

    public static final long c(jw0 jw0Var, lp2 lp2Var) {
        return b((iw0) lp2Var.j(a), jw0Var);
    }
}
