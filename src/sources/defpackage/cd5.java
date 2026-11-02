package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: loaded from: classes.dex */
public final class cd5 implements gn2 {
    public final /* synthetic */ byte X;
    public static final cd5 Y = new cd5(0);
    public static final cd5 Z = new cd5(1);
    public static final cd5 f0 = new cd5(2);
    public static final cd5 g0 = new cd5(3);
    public static final cd5 h0 = new cd5(4);
    public static final cd5 i0 = new cd5(5);
    public static final cd5 j0 = new cd5(6);
    public static final cd5 k0 = new cd5(7);
    public static final cd5 l0 = new cd5(8);
    public static final cd5 m0 = new cd5(9);
    public static final cd5 n0 = new cd5(10);
    public static final cd5 o0 = new cd5(11);
    public static final cd5 p0 = new cd5(12);
    public static final cd5 q0 = new cd5(13);
    public static final cd5 r0 = new cd5(14);
    public static final cd5 s0 = new cd5(15);
    public static final cd5 t0 = new cd5(16);
    public static final cd5 u0 = new cd5(17);
    public static final cd5 v0 = new cd5(18);
    public static final cd5 w0 = new cd5(19);
    public static final cd5 x0 = new cd5(20);
    public static final cd5 y0 = new cd5(21);
    public static final cd5 z0 = new cd5(22);
    public static final cd5 A0 = new cd5(23);
    public static final cd5 B0 = new cd5(24);
    public static final cd5 C0 = new cd5(25);
    public static final cd5 D0 = new cd5(26);
    public static final cd5 E0 = new cd5(27);
    public static final cd5 F0 = new cd5(28);
    public static final cd5 G0 = new cd5(29);

    public /* synthetic */ cd5(byte b) {
        this.X = b;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        aa7 aa7VarX;
        mo8 mo8VarN;
        t14 t14VarJ;
        qs0 qs0VarF;
        t14 t14VarJ2;
        String value;
        boolean zI = false;
        switch (this.X) {
            case 0:
                ho2 ho2Var = (ho2) obj;
                List list = dd5.a;
                ho2Var.getClass();
                List listL = ho2Var.L();
                listL.getClass();
                ot8 ot8Var = (ot8) wv0.B0(listL);
                if (ot8Var == null || el1.a(ot8Var) || ot8Var.n0 != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            case 1:
                ho2 ho2Var2 = (ho2) obj;
                List list2 = dd5.a;
                ho2Var2.getClass();
                ed1 ed1VarP = ho2Var2.p();
                ed1VarP.getClass();
                if (ed1VarP instanceof sx4) {
                    v15 v15Var = zz3.e;
                    if (zz3.b((sx4) ed1VarP, tg7.a)) {
                        return null;
                    }
                }
                Collection collectionQ = ho2Var2.q();
                collectionQ.getClass();
                Collection collection = collectionQ;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ed1 ed1VarP2 = ((ho2) it.next()).p();
                        ed1VarP2.getClass();
                        if (ed1VarP2 instanceof sx4) {
                            v15 v15Var2 = zz3.e;
                            if (zz3.b((sx4) ed1VarP2, tg7.a)) {
                                return null;
                            }
                        }
                    }
                }
                ed1 ed1VarP3 = ho2Var2.p();
                sx4 sx4Var = ed1VarP3 instanceof sx4 ? (sx4) ed1VarP3 : null;
                if (sx4Var != null) {
                    if (!bd3.a(sx4Var)) {
                        sx4Var = null;
                    }
                    if (sx4Var != null && (aa7VarX = sx4Var.X()) != null && (mo8VarN = y08.n(aa7VarX)) != null && (t14VarJ = ho2Var2.j()) != null && dh3.f(((fd1) ho2Var2).getName(), id5.d)) {
                        v15 v15Var3 = zz3.e;
                        if ((zz3.C(t14VarJ, tg7.h) || zz3.F(t14VarJ)) && ho2Var2.L().size() == 1) {
                            t14 t14VarC = ((ot8) ho2Var2.L().get(0)).c();
                            t14VarC.getClass();
                            if (dh3.f(y08.n(t14VarC), mo8VarN) && ho2Var2.Y().isEmpty() && ho2Var2.S() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                ed1 ed1VarP4 = ho2Var2.p();
                ed1VarP4.getClass();
                if (bd3.a(ed1VarP4)) {
                    wk1 wk1Var = wk1.d;
                    ed1 ed1VarP5 = ho2Var2.p();
                    ed1VarP5.getClass();
                    aa7 aa7VarX2 = ((sx4) ed1VarP5).X();
                    aa7VarX2.getClass();
                    sb.append(" or define ''equals(other: " + wk1Var.P(y08.n(aa7VarX2)) + "): Boolean''");
                }
                return sb.toString();
            case 2:
                ho2 ho2Var3 = (ho2) obj;
                List list3 = dd5.a;
                ho2Var3.getClass();
                i44 i44VarP = ho2Var3.P();
                if (i44VarP == null) {
                    i44VarP = ho2Var3.S();
                }
                if (i44VarP != null) {
                    t14 t14VarJ3 = ho2Var3.j();
                    if (t14VarJ3 != null ? y08.i(t14VarJ3, i44VarP.c()) : false) {
                        return null;
                    }
                    i86 i86VarH0 = i44VarP.H0();
                    i86VarH0.getClass();
                    if (i86VarH0 instanceof d83) {
                        sx4 sx4Var2 = ((d83) i86VarH0).X;
                        if (sx4Var2.C() && (qs0VarF = el1.f(sx4Var2)) != null) {
                            vx4 vx4VarC = bl1.c(sx4Var2);
                            vx4VarC.getClass();
                            ot0 ot0VarN = oc.n(vx4VarC, qs0VarF);
                            km1 km1Var = ot0VarN instanceof km1 ? (km1) ot0VarN : null;
                            if (km1Var != null && (t14VarJ2 = ho2Var3.j()) != null) {
                                zI = y08.i(t14VarJ2, km1Var.I0());
                            }
                        }
                    }
                    if (zI) {
                        return null;
                    }
                }
                return "receiver must be a supertype of the return type";
            case 3:
                tf5 tf5Var = (tf5) obj;
                tf5Var.getClass();
                return ((uf5) tf5Var).i0;
            case 4:
                String str = (String) obj;
                str.getClass();
                return "(raw) ".concat(str);
            case 5:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List list4 = ia6.a;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 6:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                List list5 = ia6.a;
                parameterizedType2.getClass();
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                actualTypeArguments.getClass();
                return eu.Y(actualTypeArguments);
            case 7:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            case 8:
                String simpleName = ((Class) obj).getSimpleName();
                if (!v15.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return v15.e(simpleName);
                }
                return null;
            case 9:
                ob6 ob6Var = (ob6) obj;
                ob6Var.getClass();
                String name = ob6Var.getName();
                if (name == null) {
                    name = "_";
                }
                return name + ": " + ob6Var.B();
            case 10:
                ob6 ob6Var2 = (ob6) obj;
                ob6Var2.getClass();
                return lh4.W0(ob6Var2.B(), false);
            case 11:
                ob6 ob6Var3 = (ob6) obj;
                ob6Var3.getClass();
                return lh4.W0(ob6Var3.B(), false);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                v15 v15Var4 = (v15) obj;
                v15Var4.getClass();
                return pu.K(v15Var4);
            case 13:
                String str2 = (String) obj;
                str2.getClass();
                return str2;
            case 14:
                zz3 zz3Var = (zz3) obj;
                kk6 kk6Var = kk6.c;
                zz3Var.getClass();
                return zz3Var.t(du5.BOOLEAN);
            case 15:
                zz3 zz3Var2 = (zz3) obj;
                lk6 lk6Var = lk6.c;
                zz3Var2.getClass();
                return zz3Var2.t(du5.INT);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                zz3 zz3Var3 = (zz3) obj;
                mk6 mk6Var = mk6.c;
                zz3Var3.getClass();
                return zz3Var3.x();
            case 17:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String value2 = ((SubId) entry.getKey()).getValue();
                SubId.Companion.getClass();
                return Boolean.valueOf((dh3.f(value2, SubId.EMPTY) || ((Collection) entry.getValue()).isEmpty()) ? false : true);
            case 18:
                Class cls = (Class) obj;
                cls.getClass();
                return ia6.b(cls);
            case 19:
                Class cls2 = (Class) obj;
                cls2.getClass();
                return ia6.b(cls2);
            case 20:
                if (dh3.f(obj, Boolean.FALSE)) {
                    return new dw0(dw0.g);
                }
                obj.getClass();
                return new dw0(z51.d(((Integer) obj).intValue()));
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                nv7 nv7Var = (nv7) obj;
                nv7Var.getClass();
                String str3 = nv7Var instanceof lv7 ? ((lv7) nv7Var).a : null;
                if (str3 == null) {
                    str3 = null;
                }
                if (str3 != null) {
                    return new GuId(str3);
                }
                return null;
            case 22:
                nv7 nv7Var2 = (nv7) obj;
                nv7Var2.getClass();
                String str4 = nv7Var2 instanceof mv7 ? ((mv7) nv7Var2).a : null;
                if (str4 != null) {
                    SubId subId = new SubId(str4);
                    if (fm7.o0(subId.getValue())) {
                        subId = null;
                    }
                    if (subId != null) {
                        value = subId.getValue();
                    } else {
                        value = null;
                    }
                } else {
                    value = null;
                }
                if (value != null) {
                    return new SubId(value);
                }
                return null;
            case 23:
                String str5 = (String) obj;
                str5.getClass();
                return str5.length() > 1 ? p61.l(';', "L", str5) : str5;
            case 24:
                ld0 ld0Var = (ld0) obj;
                ld0Var.getClass();
                i44 i44VarS = ld0Var.S();
                i44VarS.getClass();
                return i44VarS.c();
            case 25:
                ld0 ld0Var2 = (ld0) obj;
                ld0Var2.getClass();
                t14 t14VarJ4 = ld0Var2.j();
                t14VarJ4.getClass();
                return t14VarJ4;
            case 26:
                mo8 mo8Var = (mo8) obj;
                mo8Var.getClass();
                return Boolean.valueOf(mo8Var instanceof r66);
            case 27:
                ot0 ot0VarX = ((mo8) obj).n0().x();
                if (ot0VarX == null) {
                    return Boolean.FALSE;
                }
                v15 name2 = ot0VarX.getName();
                fk2 fk2Var = ll3.f;
                return Boolean.valueOf(dh3.f(name2, fk2Var.a.g()) && dh3.f(el1.c(ot0VarX), fk2Var));
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                ld0 ld0Var3 = (ld0) obj;
                ld0Var3.getClass();
                return Boolean.valueOf(x97.C(el1.i(ld0Var3)));
            default:
                ld0 ld0Var4 = (ld0) obj;
                ld0Var4.getClass();
                int i = sa0.l;
                q97 q97Var = (q97) ld0Var4;
                return Boolean.valueOf(zz3.A(q97Var) && el1.b(q97Var, new f0(q97Var, (byte) 8)) != null);
        }
    }
}
