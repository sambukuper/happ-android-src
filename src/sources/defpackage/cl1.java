package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: loaded from: classes.dex */
public final class cl1 implements gn2 {
    public final /* synthetic */ byte X;
    public static final cl1 Y = new cl1(0);
    public static final cl1 Z = new cl1(1);
    public static final cl1 f0 = new cl1(2);
    public static final cl1 g0 = new cl1(3);
    public static final cl1 h0 = new cl1(4);
    public static final cl1 i0 = new cl1(5);
    public static final cl1 j0 = new cl1(6);
    public static final cl1 k0 = new cl1(7);
    public static final cl1 l0 = new cl1(8);
    public static final cl1 m0 = new cl1(9);
    public static final cl1 n0 = new cl1(10);
    public static final cl1 o0 = new cl1(11);
    public static final cl1 p0 = new cl1(12);
    public static final cl1 q0 = new cl1(13);
    public static final cl1 r0 = new cl1(14);
    public static final cl1 s0 = new cl1(15);
    public static final cl1 t0 = new cl1(16);
    public static final cl1 u0 = new cl1(17);
    public static final cl1 v0 = new cl1(18);
    public static final cl1 w0 = new cl1(19);
    public static final cl1 x0 = new cl1(20);
    public static final cl1 y0 = new cl1(21);
    public static final cl1 z0 = new cl1(22);
    public static final cl1 A0 = new cl1(23);
    public static final cl1 B0 = new cl1(24);
    public static final cl1 C0 = new cl1(25);
    public static final cl1 D0 = new cl1(26);
    public static final cl1 E0 = new cl1(27);
    public static final cl1 F0 = new cl1(28);
    public static final cl1 G0 = new cl1(29);

    public /* synthetic */ cl1(byte b) {
        this.X = b;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        t14 t14VarC;
        boolean z = false;
        switch (this.X) {
            case 0:
                ed1 ed1Var = (ed1) obj;
                int i = el1.a;
                ed1Var.getClass();
                return ed1Var.p();
            case 1:
                return ((ot8) obj).c();
            case 2:
                kb6 kb6Var = (kb6) obj;
                tx0 tx0Var = y72.a;
                kb6Var.getClass();
                fs0 fs0VarD = y72.d(kb6Var);
                zu3 zu3Var = fs0VarD instanceof zu3 ? (zu3) fs0VarD : null;
                return Boolean.valueOf(zu3Var != null && zc1.M(zu3Var).isInterface());
            case 3:
                kb6 kb6Var2 = (kb6) obj;
                tx0 tx0Var2 = y72.a;
                kb6Var2.getClass();
                return Boolean.valueOf(dh3.f(y72.d(kb6Var2), yb6.a.b(Object.class)));
            case 4:
                ((qs0) obj).getClass();
                return 0;
            case 5:
                return Boolean.TRUE;
            case 6:
                ir2 ir2Var = (ir2) obj;
                ir2Var.getClass();
                StateDownloadFileV2 stateDownloadFileV2 = ir2Var.b;
                if (stateDownloadFileV2 instanceof StateDownloadFileV2.Success) {
                    if (System.currentTimeMillis() - ((StateDownloadFileV2.Success) stateDownloadFileV2).getTimestamp() > StateDownloadFileV2.Success.OUTDATED_DURATION_MS) {
                        z = true;
                    }
                }
                return Boolean.valueOf(!z);
            case 7:
                t14 t14Var = (t14) obj;
                t14Var.getClass();
                return t14Var.toString();
            case 8:
                t14 t14Var2 = (t14) obj;
                t14Var2.getClass();
                return t14Var2.toString();
            case 9:
                ob6 ob6Var = (ob6) obj;
                ob6Var.getClass();
                return ia6.b(zc1.M(ci8.v(ob6Var.B())));
            case 10:
                vx4 vx4Var = (vx4) obj;
                Map map = wj3.a;
                vx4Var.getClass();
                ot8 ot8VarX = ch3.x(uj3.b, vx4Var.f().j(tg7.t));
                return (ot8VarX == null || (t14VarC = ot8VarX.c()) == null) ? u32.c(s32.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : t14VarC;
            case 11:
                vx4 vx4Var2 = (vx4) obj;
                k32 k32Var = os3.d;
                vx4Var2.getClass();
                List list = (List) hi5.e0(vx4Var2.b0(os3.f).i0, n74.l0[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof oa0) {
                        arrayList.add(obj2);
                    }
                }
                return (ed1) wv0.r0(arrayList);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                Class<?> returnType = ((Method) obj).getReturnType();
                returnType.getClass();
                return ia6.b(returnType);
            case 13:
                r62 r62Var = (r62) obj;
                r62 r62Var2 = mu3.a;
                r62Var.getClass();
                r62Var.a(lu3.a);
                r62Var.a(lu3.b);
                r62Var.a(lu3.c);
                r62Var.a(lu3.d);
                r62Var.a(lu3.e);
                r62Var.a(lu3.f);
                r62Var.a(lu3.g);
                r62Var.a(lu3.h);
                r62Var.a(lu3.i);
                r62Var.a(lu3.j);
                r62Var.a(lu3.k);
                r62Var.a(lu3.l);
                r62Var.a(o37.a);
                return dn8.a;
            case 14:
                fx5 fx5Var = (fx5) obj;
                kc6 kc6Var = ov3.X;
                fx5Var.getClass();
                return wk1.e.n(fx5Var) + " | " + ir6.b(fx5Var).o();
            case 15:
                iz3 iz3Var = (iz3) obj;
                kc6 kc6Var2 = ov3.X;
                iz3Var.getClass();
                return iz3Var.b + " | " + ch3.E(iz3Var).a;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                ho2 ho2Var = (ho2) obj;
                kc6 kc6Var3 = ov3.X;
                ho2Var.getClass();
                return wk1.e.n(ho2Var) + " | " + ir6.c(ho2Var).g();
            case 17:
                Method method = (Method) obj;
                kc6 kc6Var4 = ov3.X;
                method.getClass();
                return km4.M(method);
            case 18:
                cz3 cz3Var = (cz3) obj;
                kc6 kc6Var5 = ov3.X;
                cz3Var.getClass();
                return String.valueOf(ch3.D(cz3Var).a);
            case 19:
                Constructor constructor = (Constructor) obj;
                kc6 kc6Var6 = ov3.X;
                constructor.getClass();
                return km4.K(constructor);
            case 20:
                Field field = (Field) obj;
                kc6 kc6Var7 = ov3.X;
                return field.getName() + ' ' + field.getType();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                pw3 pw3Var = (pw3) obj;
                pw3Var.getClass();
                lv3 lv3VarM = pw3Var.M();
                rw3 rw3Var = lv3VarM instanceof rw3 ? (rw3) lv3VarM : null;
                if (rw3Var != null) {
                    return (pw3) wv0.t0(rw3Var.getUpperBounds());
                }
                return null;
            case 22:
                qg5 qg5Var = (qg5) obj;
                qg5Var.getClass();
                return ((String) qg5Var.X) + " = " + ((xy3) qg5Var.Y);
            case 23:
                bb6 bb6Var = (bb6) obj;
                int i2 = t44.v;
                bb6Var.getClass();
                return Boolean.valueOf(!Modifier.isStatic(bb6Var.b().getModifiers()));
            case 24:
                q97 q97Var = (q97) obj;
                nw3[] nw3VarArr = f54.m;
                q97Var.getClass();
                return q97Var;
            case 25:
                bb6 bb6Var2 = (bb6) obj;
                int i3 = h54.p;
                bb6Var2.getClass();
                return Boolean.valueOf(Modifier.isStatic(bb6Var2.b().getModifiers()));
            case 26:
                et4 et4Var = (et4) obj;
                int i4 = h54.p;
                et4Var.getClass();
                return et4Var.g();
            case 27:
                int i5 = h54.p;
                ot0 ot0VarX = ((t14) obj).n0().x();
                if (ot0VarX instanceof sx4) {
                    return (sx4) ot0VarX;
                }
                return null;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                lh4 lh4Var = lh4.f0;
                ((v15) obj).getClass();
                return Boolean.TRUE;
            default:
                String value = ((SubId) obj).getValue();
                value.getClass();
                kw4 kw4Var = kw4.a;
                SubscriptionItem subscriptionItemF = kw4.f(value);
                if (subscriptionItemF != null) {
                    return new qg5(new SubId(value), subscriptionItemF);
                }
                return null;
        }
    }
}
