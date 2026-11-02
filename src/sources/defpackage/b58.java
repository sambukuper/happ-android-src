package defpackage;

import java.net.InetAddress;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b58 implements gn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ b58(oi8 oi8Var) {
        this.X = (byte) 8;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        c88 c88VarA;
        qe7 qe7Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                ((Integer) obj).intValue();
                return c58.a;
            case 1:
                return Boolean.valueOf(((s86) obj) == null);
            case 2:
                return dn8Var;
            case 3:
                pl plVar = (pl) obj;
                Object obj2 = plVar.a;
                if (!(obj2 instanceof pa4) || (c88VarA = ((pa4) obj2).a()) == null || (c88VarA.a == null && c88VarA.b == null && c88VarA.c == null && c88VarA.d == null)) {
                    return i21.f(plVar);
                }
                Object obj3 = plVar.a;
                obj3.getClass();
                c88 c88VarA2 = ((pa4) obj3).a();
                if (c88VarA2 == null || (qe7Var = c88VarA2.a) == null) {
                    qe7Var = new qe7(0L, 0L, (dj2) null, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65535);
                }
                return i21.f(plVar, new pl(plVar.b, plVar.c, qe7Var));
            case 4:
                ((f17) obj).a(c17.B, dn8Var);
                return dn8Var;
            case 5:
                ((tj6) obj).getClass();
                return dn8Var;
            case 6:
                xr6 xr6Var = (xr6) obj;
                xr6Var.getClass();
                return Boolean.valueOf(xr6Var.S0());
            case 7:
                xr6 xr6Var2 = (xr6) obj;
                xr6Var2.getClass();
                o57 o57Var = new o57();
                while (xr6Var2.S0()) {
                    o57Var.add(Integer.valueOf((int) xr6Var2.getLong(0)));
                }
                return w45.m(o57Var);
            case 8:
                uw3 uw3Var = (uw3) obj;
                uw3Var.getClass();
                yw3 yw3Var = uw3Var.a;
                if (yw3Var == null) {
                    return "*";
                }
                pw3 pw3Var = uw3Var.b;
                oi8 oi8Var = pw3Var instanceof oi8 ? (oi8) pw3Var : null;
                String strF = oi8Var != null ? oi8Var.f(true) : String.valueOf(pw3Var);
                int iOrdinal = yw3Var.ordinal();
                if (iOrdinal == 0) {
                    return strF;
                }
                if (iOrdinal == 1) {
                    return "in ".concat(strF);
                }
                if (iOrdinal == 2) {
                    return "out ".concat(strF);
                }
                b61.c();
                return null;
            case 9:
                ((cc1) obj).getClass();
                return dn8Var;
            case 10:
                hq8 hq8Var = (hq8) obj;
                hq8Var.getClass();
                return hq8Var.h;
            case 11:
                wr8 wr8Var = (wr8) obj;
                wr8Var.getClass();
                wr8.p(wr8Var);
                z68.v0(wr8Var, _UrlKt.FRAGMENT_ENCODE_SET, new b58((byte) 12));
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                wr8 wr8Var2 = (wr8) obj;
                wr8Var2.getClass();
                wr8.q(wr8Var2);
                z68.v0(wr8Var2, _UrlKt.FRAGMENT_ENCODE_SET, new b58((byte) 14));
                return dn8Var;
            case 13:
                wr8 wr8Var3 = (wr8) obj;
                wr8Var3.getClass();
                z68.t(wr8Var3, ':');
                wr8.r(wr8Var3);
                return dn8Var;
            case 14:
                wr8 wr8Var4 = (wr8) obj;
                wr8Var4.getClass();
                wr8.r(wr8Var4);
                return dn8Var;
            case 15:
                wr8 wr8Var5 = (wr8) obj;
                wr8Var5.getClass();
                wr8Var5.a("z");
                return dn8Var;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                wr8 wr8Var6 = (wr8) obj;
                wr8Var6.getClass();
                z68.v0(wr8Var6, "Z", new b58((byte) 19));
                return dn8Var;
            case 17:
                wr8 wr8Var7 = (wr8) obj;
                wr8Var7.getClass();
                wr8Var7.a("z");
                return dn8Var;
            case 18:
                wr8 wr8Var8 = (wr8) obj;
                wr8Var8.getClass();
                z68.v0(wr8Var8, "Z", new b58((byte) 11));
                return dn8Var;
            case 19:
                wr8 wr8Var9 = (wr8) obj;
                wr8Var9.getClass();
                wr8.p(wr8Var9);
                z68.t(wr8Var9, ':');
                wr8.q(wr8Var9);
                z68.v0(wr8Var9, _UrlKt.FRAGMENT_ENCODE_SET, new b58((byte) 13));
                return dn8Var;
            case 20:
                wr8 wr8Var10 = (wr8) obj;
                wr8Var10.getClass();
                z68.t(wr8Var10, 'z');
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return Boolean.valueOf(!((InetAddress) obj).isLoopbackAddress());
            case 22:
                return dn8Var;
            case 23:
                return new sk(((Float) obj).floatValue());
            case 24:
                return new sk(((Integer) obj).intValue());
            case 25:
                return Integer.valueOf((int) ((sk) obj).a);
            case 26:
                return new sk(((kt1) obj).X);
            case 27:
                return new kt1(((sk) obj).a);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                mt1 mt1Var = (mt1) obj;
                return new tk(Float.intBitsToFloat((int) (mt1Var.a >> 32)), Float.intBitsToFloat((int) (mt1Var.a & 4294967295L)));
            default:
                tk tkVar = (tk) obj;
                return new mt1((((long) Float.floatToRawIntBits(tkVar.a)) << 32) | (((long) Float.floatToRawIntBits(tkVar.b)) & 4294967295L));
        }
    }

    public /* synthetic */ b58(byte b) {
        this.X = b;
    }
}
