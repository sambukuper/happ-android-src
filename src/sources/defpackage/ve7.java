package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ve7 implements gn2 {
    public static final ve7 Y = new ve7(0);
    public static final ve7 Z = new ve7(1);
    public static final ve7 f0 = new ve7(2);
    public static final ve7 g0 = new ve7(3);
    public static final ve7 h0 = new ve7(4);
    public static final ve7 i0 = new ve7(5);
    public static final ve7 j0 = new ve7(6);
    public static final ve7 k0 = new ve7(7);
    public static final ve7 l0 = new ve7(8);
    public static final ve7 m0 = new ve7(9);
    public static final ve7 n0 = new ve7(10);
    public static final ve7 o0 = new ve7(11);
    public final /* synthetic */ byte X;

    public /* synthetic */ ve7(byte b) {
        this.X = b;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        ld0 ld0VarB;
        String strZ;
        byte b = this.X;
        cf7 cf7Var = null;
        boolean z = false;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                ld0 ld0Var = (ld0) obj;
                ld0Var.getClass();
                if (zz3.A(ld0Var)) {
                    int i = ta0.l;
                    if (ff7.e.contains(ld0Var.getName()) && (ld0VarB = el1.b(ld0Var, ag.g0)) != null && (strZ = w45.z(ld0VarB)) != null) {
                        if (ff7.b.contains(strZ)) {
                            cf7Var = cf7.X;
                        } else {
                            cf7Var = ((ef7) zp4.H(ff7.d, strZ)) == ef7.Y ? cf7.Z : cf7.Y;
                        }
                    }
                    if (cf7Var != null) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                nz5 nz5Var = (nz5) obj;
                nz5Var.getClass();
                return Integer.valueOf(nz5Var.f0.size());
            case 2:
                q97 q97Var = (q97) obj;
                q97Var.getClass();
                return q97Var;
            case 3:
                fx5 fx5Var = (fx5) obj;
                fx5Var.getClass();
                return fx5Var;
            case 4:
                jd0 jd0Var = (jd0) obj;
                jd0Var.getClass();
                return jd0Var;
            case 5:
                ed1 ed1Var = (ed1) obj;
                ed1Var.getClass();
                return Boolean.valueOf(!(ed1Var instanceof a41));
            case 6:
                ed1 ed1Var2 = (ed1) obj;
                ed1Var2.getClass();
                List typeParameters = ((jd0) ed1Var2).getTypeParameters();
                typeParameters.getClass();
                return new hu(typeParameters, (byte) 1);
            case 7:
                mo8 mo8Var = (mo8) obj;
                mo8Var.getClass();
                ot0 ot0VarX = mo8Var.n0().x();
                if (ot0VarX != null && (ot0VarX instanceof hi8) && (((hi8) ot0VarX).p() instanceof km1)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                mo8 mo8Var2 = (mo8) obj;
                mo8Var2.getClass();
                ot0 ot0VarX2 = mo8Var2.n0().x();
                if (ot0VarX2 != null && ((ot0VarX2 instanceof km1) || (ot0VarX2 instanceof hi8))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                Throwable th = (Throwable) obj;
                if (th != null && !(th instanceof CancellationException)) {
                    hi5.j0();
                }
                return dn8Var;
            case 10:
                pw3 pw3Var = (pw3) obj;
                fk2 fk2Var = ms8.a;
                pw3Var.getClass();
                return ms8.s(pw3Var);
            case 11:
                return null;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ((z14) obj).getClass();
                return null;
            case 13:
                ((qs0) obj).getClass();
                return ke7.G;
            case 14:
                ld0 ld0Var2 = (ld0) obj;
                if (ld0Var2.r() == 1) {
                    ed1 ed1VarP = ld0Var2.p();
                    ed1VarP.getClass();
                    String str = ll3.a;
                    if (ll3.j.containsKey(bl1.f((sx4) ed1VarP))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 15:
                return ((re4) obj).b.invoke();
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return (ld0) obj;
            case 17:
                return (ld0) obj;
            case 18:
                d97 d97Var = (d97) obj;
                d97Var.getClass();
                ql3 ql3Var = bs5.b;
                d97Var.a("java/util/function/Consumer", ql3Var, ql3Var);
                return dn8Var;
            case 19:
                d97 d97Var2 = (d97) obj;
                d97Var2.getClass();
                d97Var2.a("java/lang/Object", bs5.b);
                return dn8Var;
            case 20:
                d97 d97Var3 = (d97) obj;
                d97Var3.getClass();
                d97Var3.a("java/lang/Object", bs5.b);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                d97 d97Var4 = (d97) obj;
                d97Var4.getClass();
                d97Var4.c("java/lang/Object", bs5.b);
                return dn8Var;
            case 22:
                d97 d97Var5 = (d97) obj;
                d97Var5.getClass();
                d97Var5.c("java/lang/Object", bs5.b);
                return dn8Var;
            case 23:
                d97 d97Var6 = (d97) obj;
                d97Var6.getClass();
                d97Var6.a("java/lang/Object", bs5.b);
                return dn8Var;
            case 24:
                d97 d97Var7 = (d97) obj;
                d97Var7.getClass();
                d97Var7.a("java/lang/Object", bs5.b);
                return dn8Var;
            case 25:
                d97 d97Var8 = (d97) obj;
                d97Var8.getClass();
                d97Var8.c("java/lang/Object", bs5.b);
                return dn8Var;
            case 26:
                d97 d97Var9 = (d97) obj;
                d97Var9.getClass();
                d97Var9.c("java/lang/Object", bs5.b);
                return dn8Var;
            case 27:
                d97 d97Var10 = (d97) obj;
                d97Var10.getClass();
                d97Var10.c("java/lang/Object", bs5.b);
                return dn8Var;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                d97 d97Var11 = (d97) obj;
                d97Var11.getClass();
                d97Var11.c("java/lang/Object", bs5.b);
                return dn8Var;
            default:
                d97 d97Var12 = (d97) obj;
                d97Var12.getClass();
                ql3 ql3Var2 = bs5.b;
                d97Var12.c("java/util/Spliterator", ql3Var2, ql3Var2);
                return dn8Var;
        }
    }

    public /* synthetic */ ve7(Object obj, byte b) {
        this.X = b;
    }
}
