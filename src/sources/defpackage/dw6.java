package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dw6 implements gn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ dw6(byte b) {
        this.X = b;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        dw0 dw0Var;
        pl plVar;
        dw0 dw0Var2;
        dw0 dw0Var3;
        int i = 0;
        nz1Var = null;
        nz1 nz1Var = null;
        t67Var = null;
        t67 t67Var = null;
        e88Var = null;
        e88 e88Var = null;
        na4Var = null;
        na4 na4Var = null;
        oa4Var = null;
        oa4 oa4Var = null;
        fq8Var = null;
        fq8 fq8Var = null;
        yu8Var = null;
        yu8 yu8Var = null;
        qe7Var = null;
        qe7 qe7Var = null;
        xg5Var = null;
        xg5 xg5Var = null;
        c88Var = null;
        c88 c88Var = null;
        c88Var = null;
        c88 c88Var2 = null;
        switch (this.X) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i2 = dw0.h;
                Boolean bool = Boolean.FALSE;
                dh3.f(obj2, bool);
                if (obj2 != null) {
                    dw0Var = obj2.equals(bool) ? new dw0(dw0.g) : new dw0(z51.d(((Integer) obj2).intValue()));
                } else {
                    dw0Var = null;
                }
                dw0Var.getClass();
                long j = dw0Var.a;
                Object obj3 = list.get(1);
                fw6 fw6Var = gw6.x;
                dh3.f(obj3, bool);
                z85 z85Var = obj3 != null ? (z85) fw6Var.Y.B(obj3) : null;
                z85Var.getClass();
                long j2 = z85Var.a;
                Object obj4 = list.get(2);
                Float f = obj4 != null ? (Float) obj4 : null;
                f.getClass();
                return new t67(j, j2, f.floatValue());
            case 1:
                obj.getClass();
                return new o28(((Integer) obj).intValue());
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                Object obj5 = list2.get(0);
                String str = obj5 != null ? (String) obj5 : null;
                str.getClass();
                Object obj6 = list2.get(1);
                xd6 xd6Var = gw6.i;
                if (!dh3.f(obj6, Boolean.FALSE) && obj6 != null) {
                    c88Var2 = (c88) ((gn2) xd6Var.Z).B(obj6);
                }
                return new oa4(str, c88Var2);
            case 3:
                obj.getClass();
                return new b48(((Integer) obj).intValue());
            case 4:
                obj.getClass();
                return new w23(((Integer) obj).intValue());
            case 5:
                obj.getClass();
                List list3 = (List) obj;
                ArrayList arrayList = new ArrayList(list3.size());
                int size = list3.size();
                while (i < size) {
                    Object obj7 = list3.get(i);
                    pl plVar2 = (dh3.f(obj7, Boolean.FALSE) || obj7 == null) ? null : (pl) ((gn2) gw6.b.Z).B(obj7);
                    plVar2.getClass();
                    arrayList.add(plVar2);
                    i++;
                }
                return arrayList;
            case 6:
                obj.getClass();
                return new bj2(((Integer) obj).intValue());
            case 7:
                obj.getClass();
                return new cj2(((Integer) obj).intValue());
            case 8:
                Boolean bool2 = Boolean.FALSE;
                if (dh3.f(obj, bool2)) {
                    return new v88(v88.c);
                }
                obj.getClass();
                List list4 = (List) obj;
                Object obj8 = list4.get(0);
                Float f2 = obj8 != null ? (Float) obj8 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj9 = list4.get(1);
                fw6 fw6Var2 = gw6.w;
                dh3.f(obj9, bool2);
                w88 w88Var = obj9 != null ? (w88) fw6Var2.Y.B(obj9) : null;
                w88Var.getClass();
                return new v88(eu7.i(fFloatValue, w88Var.a));
            case 9:
                if (dh3.f(obj, 0)) {
                    return new w88(8589934592L);
                }
                return dh3.f(obj, 1) ? new w88(4294967296L) : new w88(0L);
            case 10:
                if (dh3.f(obj, Boolean.FALSE)) {
                    return new z85(9205357640488583168L);
                }
                obj.getClass();
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                Float f3 = obj10 != null ? (Float) obj10 : null;
                f3.getClass();
                float fFloatValue2 = f3.floatValue();
                Object obj11 = list5.get(1);
                Float f4 = obj11 != null ? (Float) obj11 : null;
                f4.getClass();
                return new z85((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L));
            case 11:
                obj.getClass();
                List list6 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list6.size());
                int size2 = list6.size();
                while (i < size2) {
                    Object obj12 = list6.get(i);
                    ce4 ce4Var = (dh3.f(obj12, Boolean.FALSE) || obj12 == null) ? null : (ce4) ((gn2) gw6.z.Z).B(obj12);
                    ce4Var.getClass();
                    arrayList2.add(ce4Var);
                    i++;
                }
                return new ge4(arrayList2);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                obj.getClass();
                String str2 = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str2);
                if (dh3.f(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str2 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new ce4(localeForLanguageTag);
            case 13:
                obj.getClass();
                List list7 = (List) obj;
                Object obj13 = list7.get(0);
                String str3 = obj13 != null ? (String) obj13 : null;
                str3.getClass();
                Object obj14 = list7.get(1);
                xd6 xd6Var2 = gw6.i;
                if (!dh3.f(obj14, Boolean.FALSE) && obj14 != null) {
                    c88Var = (c88) ((gn2) xd6Var2.Z).B(obj14);
                }
                return new na4(str3, c88Var);
            case 14:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                float f5 = x94.b;
                fw6 fw6Var3 = gw6.B;
                Boolean bool3 = Boolean.FALSE;
                dh3.f(obj15, bool3);
                x94 x94Var = obj15 != null ? (x94) fw6Var3.Y.B(obj15) : null;
                x94Var.getClass();
                float f6 = x94Var.a;
                Object obj16 = list8.get(1);
                fw6 fw6Var4 = gw6.C;
                dh3.f(obj16, bool3);
                z94 z94Var = obj16 != null ? (z94) fw6Var4.Y.B(obj16) : null;
                z94Var.getClass();
                int i3 = z94Var.a;
                Object obj17 = list8.get(2);
                fw6 fw6Var5 = gw6.D;
                dh3.f(obj17, bool3);
                y94 y94Var = obj17 != null ? (y94) fw6Var5.Y.B(obj17) : null;
                y94Var.getClass();
                return new aa4(i3, f6, y94Var.a);
            case 15:
                obj.getClass();
                float fFloatValue3 = ((Float) obj).floatValue();
                x94.a(fFloatValue3);
                return new x94(fFloatValue3);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                obj.getClass();
                return new z94(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                List list9 = (List) obj;
                Object obj18 = list9.get(0);
                lm lmVar = obj18 != null ? (lm) obj18 : null;
                lmVar.getClass();
                Object obj19 = list9.get(2);
                Integer num = obj19 != null ? (Integer) obj19 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj20 = list9.get(3);
                Integer num2 = obj20 != null ? (Integer) obj20 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj21 = list9.get(4);
                String str4 = obj21 != null ? (String) obj21 : null;
                str4.getClass();
                switch (lmVar.ordinal()) {
                    case 0:
                        Object obj22 = list9.get(1);
                        xd6 xd6Var3 = gw6.g;
                        if (!dh3.f(obj22, Boolean.FALSE) && obj22 != null) {
                            xg5Var = (xg5) ((gn2) xd6Var3.Z).B(obj22);
                        }
                        xg5Var.getClass();
                        plVar = new pl(str4, iIntValue, iIntValue2, xg5Var);
                        break;
                    case 1:
                        Object obj23 = list9.get(1);
                        xd6 xd6Var4 = gw6.h;
                        if (!dh3.f(obj23, Boolean.FALSE) && obj23 != null) {
                            qe7Var = (qe7) ((gn2) xd6Var4.Z).B(obj23);
                        }
                        qe7Var.getClass();
                        plVar = new pl(str4, iIntValue, iIntValue2, qe7Var);
                        break;
                    case 2:
                        Object obj24 = list9.get(1);
                        xd6 xd6Var5 = gw6.c;
                        if (!dh3.f(obj24, Boolean.FALSE) && obj24 != null) {
                            yu8Var = (yu8) ((gn2) xd6Var5.Z).B(obj24);
                        }
                        yu8Var.getClass();
                        plVar = new pl(str4, iIntValue, iIntValue2, yu8Var);
                        break;
                    case 3:
                        Object obj25 = list9.get(1);
                        xd6 xd6Var6 = gw6.d;
                        if (!dh3.f(obj25, Boolean.FALSE) && obj25 != null) {
                            fq8Var = (fq8) ((gn2) xd6Var6.Z).B(obj25);
                        }
                        fq8Var.getClass();
                        plVar = new pl(str4, iIntValue, iIntValue2, fq8Var);
                        break;
                    case 4:
                        Object obj26 = list9.get(1);
                        xd6 xd6Var7 = gw6.e;
                        if (!dh3.f(obj26, Boolean.FALSE) && obj26 != null) {
                            oa4Var = (oa4) ((gn2) xd6Var7.Z).B(obj26);
                        }
                        oa4Var.getClass();
                        plVar = new pl(str4, iIntValue, iIntValue2, oa4Var);
                        break;
                    case 5:
                        Object obj27 = list9.get(1);
                        xd6 xd6Var8 = gw6.f;
                        if (!dh3.f(obj27, Boolean.FALSE) && obj27 != null) {
                            na4Var = (na4) ((gn2) xd6Var8.Z).B(obj27);
                        }
                        na4Var.getClass();
                        plVar = new pl(str4, iIntValue, iIntValue2, na4Var);
                        break;
                    case 6:
                        Object obj28 = list9.get(1);
                        String str5 = obj28 != null ? (String) obj28 : null;
                        str5.getClass();
                        plVar = new pl(str4, iIntValue, iIntValue2, new ul7(str5));
                        break;
                    default:
                        b61.c();
                        return null;
                }
                return plVar;
            case 18:
                obj.getClass();
                return new y94(((Integer) obj).intValue());
            case 19:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new yu8(str6);
            case 20:
                String str7 = obj != null ? (String) obj : null;
                str7.getClass();
                return new fq8(str7);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                obj.getClass();
                List list10 = (List) obj;
                Object obj29 = list10.get(0);
                fw6 fw6Var6 = gw6.q;
                Boolean bool4 = Boolean.FALSE;
                dh3.f(obj29, bool4);
                o28 o28Var = obj29 != null ? (o28) fw6Var6.Y.B(obj29) : null;
                o28Var.getClass();
                int i4 = o28Var.a;
                Object obj30 = list10.get(1);
                fw6 fw6Var7 = gw6.r;
                dh3.f(obj30, bool4);
                b48 b48Var = obj30 != null ? (b48) fw6Var7.Y.B(obj30) : null;
                b48Var.getClass();
                int i5 = b48Var.a;
                Object obj31 = list10.get(2);
                w88[] w88VarArr = v88.b;
                fw6 fw6Var8 = gw6.v;
                dh3.f(obj31, bool4);
                v88 v88Var = obj31 != null ? (v88) fw6Var8.Y.B(obj31) : null;
                v88Var.getClass();
                long j3 = v88Var.a;
                Object obj32 = list10.get(3);
                i78 i78Var = i78.c;
                i78 i78Var2 = (dh3.f(obj32, bool4) || obj32 == null) ? null : (i78) ((gn2) gw6.l.Z).B(obj32);
                Object obj33 = list10.get(4);
                fp5 fp5Var = (dh3.f(obj33, bool4) || obj33 == null) ? null : (fp5) ((gn2) zc1.c.Z).B(obj33);
                Object obj34 = list10.get(5);
                aa4 aa4Var = aa4.d;
                aa4 aa4Var2 = (dh3.f(obj34, bool4) || obj34 == null) ? null : (aa4) ((gn2) gw6.A.Z).B(obj34);
                Object obj35 = list10.get(6);
                v94 v94Var = (dh3.f(obj35, bool4) || obj35 == null) ? null : (v94) ((gn2) zc1.e.Z).B(obj35);
                v94Var.getClass();
                int i6 = v94Var.a;
                Object obj36 = list10.get(7);
                fw6 fw6Var9 = gw6.s;
                dh3.f(obj36, bool4);
                w23 w23Var = obj36 != null ? (w23) fw6Var9.Y.B(obj36) : null;
                w23Var.getClass();
                int i7 = w23Var.a;
                Object obj37 = list10.get(8);
                xd6 xd6Var9 = zc1.f;
                if (!dh3.f(obj37, bool4) && obj37 != null) {
                    e88Var = (e88) ((gn2) xd6Var9.Z).B(obj37);
                }
                return new xg5(i4, i5, j3, i78Var2, fp5Var, aa4Var2, i6, i7, e88Var);
            case 22:
                obj.getClass();
                List list11 = (List) obj;
                Object obj38 = list11.get(0);
                int i8 = dw0.h;
                Boolean bool5 = Boolean.FALSE;
                dh3.f(obj38, bool5);
                if (obj38 != null) {
                    dw0Var2 = obj38.equals(bool5) ? new dw0(dw0.g) : new dw0(z51.d(((Integer) obj38).intValue()));
                } else {
                    dw0Var2 = null;
                }
                dw0Var2.getClass();
                long j4 = dw0Var2.a;
                Object obj39 = list11.get(1);
                w88[] w88VarArr2 = v88.b;
                gn2 gn2Var = gw6.v.Y;
                dh3.f(obj39, bool5);
                v88 v88Var2 = obj39 != null ? (v88) gn2Var.B(obj39) : null;
                v88Var2.getClass();
                long j5 = v88Var2.a;
                Object obj40 = list11.get(2);
                dj2 dj2Var = dj2.Y;
                dj2 dj2Var2 = (dh3.f(obj40, bool5) || obj40 == null) ? null : (dj2) ((gn2) gw6.m.Z).B(obj40);
                Object obj41 = list11.get(3);
                bj2 bj2Var = (dh3.f(obj41, bool5) || obj41 == null) ? null : (bj2) ((gn2) gw6.t.Z).B(obj41);
                Object obj42 = list11.get(4);
                cj2 cj2Var = (dh3.f(obj42, bool5) || obj42 == null) ? null : (cj2) ((gn2) gw6.u.Z).B(obj42);
                Object obj43 = list11.get(6);
                String str8 = obj43 != null ? (String) obj43 : null;
                Object obj44 = list11.get(7);
                dh3.f(obj44, bool5);
                v88 v88Var3 = obj44 != null ? (v88) gn2Var.B(obj44) : null;
                v88Var3.getClass();
                long j6 = v88Var3.a;
                Object obj45 = list11.get(8);
                x20 x20Var = (dh3.f(obj45, bool5) || obj45 == null) ? null : (x20) ((gn2) gw6.n.Z).B(obj45);
                Object obj46 = list11.get(9);
                g78 g78Var = (dh3.f(obj46, bool5) || obj46 == null) ? null : (g78) ((gn2) gw6.k.Z).B(obj46);
                Object obj47 = list11.get(10);
                ge4 ge4Var = ge4.Z;
                ge4 ge4Var2 = (dh3.f(obj47, bool5) || obj47 == null) ? null : (ge4) ((gn2) gw6.y.Z).B(obj47);
                Object obj48 = list11.get(11);
                dh3.f(obj48, bool5);
                if (obj48 != null) {
                    dw0Var3 = obj48.equals(bool5) ? new dw0(dw0.g) : new dw0(z51.d(((Integer) obj48).intValue()));
                } else {
                    dw0Var3 = null;
                }
                dw0Var3.getClass();
                long j7 = dw0Var3.a;
                Object obj49 = list11.get(12);
                x38 x38Var = (dh3.f(obj49, bool5) || obj49 == null) ? null : (x38) ((gn2) gw6.j.Z).B(obj49);
                Object obj50 = list11.get(13);
                t67 t67Var2 = t67.d;
                xd6 xd6Var10 = gw6.o;
                if (!dh3.f(obj50, bool5) && obj50 != null) {
                    t67Var = (t67) ((gn2) xd6Var10.Z).B(obj50);
                }
                return new qe7(j4, j5, dj2Var2, bj2Var, cj2Var, (gi2) null, str8, j6, x20Var, g78Var, ge4Var2, j7, x38Var, t67Var, 49184);
            case 23:
                obj.getClass();
                List list12 = (List) obj;
                Object obj51 = list12.get(0);
                Boolean bool6 = obj51 != null ? (Boolean) obj51 : null;
                bool6.getClass();
                boolean zBooleanValue = bool6.booleanValue();
                Object obj52 = list12.get(1);
                xd6 xd6Var11 = zc1.d;
                if (!dh3.f(obj52, Boolean.FALSE) && obj52 != null) {
                    nz1Var = (nz1) ((gn2) xd6Var11.Z).B(obj52);
                }
                nz1Var.getClass();
                return new fp5(nz1Var.a, zBooleanValue);
            case 24:
                obj.getClass();
                return new nz1(((Integer) obj).intValue());
            case 25:
                obj.getClass();
                return new v94(((Integer) obj).intValue());
            case 26:
                obj.getClass();
                List list13 = (List) obj;
                Object obj53 = list13.get(0);
                d88 d88Var = (dh3.f(obj53, Boolean.FALSE) || obj53 == null) ? null : (d88) ((gn2) zc1.g.Z).B(obj53);
                d88Var.getClass();
                int i9 = d88Var.a;
                Object obj54 = list13.get(1);
                Boolean bool7 = obj54 != null ? (Boolean) obj54 : null;
                bool7.getClass();
                return new e88(i9, bool7.booleanValue());
            case 27:
                obj.getClass();
                return new d88(((Integer) obj).intValue());
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return Integer.valueOf(((lx6) obj).b);
            default:
                return Integer.valueOf(((lx6) obj).c.b());
        }
    }
}
