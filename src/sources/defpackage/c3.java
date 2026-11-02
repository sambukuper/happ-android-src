package defpackage;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: loaded from: classes.dex */
public final class c3 implements dn2 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public final Object Z;

    public c3(f54 f54Var, za6 za6Var, ea6 ea6Var) {
        this.X = (byte) 26;
        this.Y = f54Var;
        this.Z = ea6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dn2
    public final Object invoke() throws IOException {
        uw3 uw3VarG0;
        uw3 uw3Var;
        pw3 pw3VarQ;
        iz2 iz2Var;
        bx8 bx8VarC;
        bx8 bx8VarC2;
        byte b = 4;
        byte b2 = 2;
        int i = 0;
        Object[] objArr = 0;
        byte b3 = 10;
        switch (this.X) {
            case 0:
                List list = (List) this.Y;
                w39 w39Var = (w39) this.Z;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    x14 x14VarL = w39Var.L((x14) it.next());
                    if (x14VarL != null) {
                        arrayList.add(x14VarL);
                    }
                }
                return arrayList;
            case 1:
                return new j3((k3) this.Z, (ve4) this.Y);
            case 2:
                ch8.Y.getClass();
                ch8 ch8Var = ch8.Z;
                lh8 lh8VarL = ((k3) this.Z).l();
                List list2 = Collections.EMPTY_LIST;
                f3 f3Var = new f3(this, b2);
                me4 me4Var = ve4.e;
                me4Var.getClass();
                return dh3.O(new p74(me4Var, f3Var), ch8Var, lh8VarL, list2, false);
            case 3:
                Class cls = (Class) this.Y;
                Map map = (Map) this.Z;
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(cls.getCanonicalName());
                wv0.x0(map.entrySet(), sb, ", ", "(", ")", ag.Z, 48);
                return sb.toString();
            case 4:
                z47 z47Var = (z47) this.Y;
                sm annotations = ((bt0) this.Z).getAnnotations();
                z47Var.getClass();
                annotations.getClass();
                return e0.b((mm) ((c6) z47Var.Y).p0, (rl3) ((g44) z47Var.f0).getValue(), annotations);
            case 5:
                z47 z47Var2 = (z47) this.Y;
                sm smVar = (sm) this.Z;
                z47Var2.getClass();
                smVar.getClass();
                return e0.b((mm) ((c6) z47Var2.Y).p0, (rl3) ((g44) z47Var2.f0).getValue(), smVar);
            case 6:
                mz3 mz3Var = (mz3) this.Y;
                ClassLoader classLoader = (ClassLoader) this.Z;
                mz3Var.getClass();
                gz3 gz3Var = tu3.c;
                gz3Var.getClass();
                ArrayList arrayList2 = ((tu3) jb5.N(mz3Var.g, gz3Var)).b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    fk2 fk2VarA = ys0.Y(((dy3) obj).a).a();
                    fk2 fk2Var = ls3.a;
                    fk2VarA.getClass();
                    if (!fk2VarA.equals(ks3.q) && !fk2VarA.b().equals(qg7.f)) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(xv0.Z(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(ys0.W((dy3) it2.next(), classLoader));
                }
                return arrayList4;
            case 7:
                long jA = we3.a.a().a();
                ph5 ph5Var = (ph5) this.Z;
                if (jA - ph5Var.l() > 300) {
                    ((dn2) this.Y).invoke();
                }
                ph5Var.m(jA);
                return dn8.a;
            case 8:
                ej1 ej1Var = (ej1) this.Y;
                yu3 yu3Var = (yu3) this.Z;
                List<hi8> typeParameters = ej1Var.V().getTypeParameters();
                typeParameters.getClass();
                ArrayList<rw3> arrayList5 = new ArrayList(xv0.Z(typeParameters, 10));
                for (hi8 hi8Var : typeParameters) {
                    kb6 kb6VarH0 = mb6.h0(ej1Var);
                    hi8Var.getClass();
                    arrayList5.add(new rw3(kb6VarH0, hi8Var));
                }
                ww3 ww3VarB = yu3Var.b(ej1Var.getName(), arrayList5);
                for (rw3 rw3Var : arrayList5) {
                    List upperBounds = rw3Var.getUpperBounds();
                    ArrayList arrayList6 = new ArrayList(xv0.Z(upperBounds, 10));
                    Iterator it3 = upperBounds.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(ww3VarB.c((pw3) it3.next(), ej1Var.getName()));
                    }
                    rw3Var.i0 = arrayList6;
                }
                return arrayList5;
            case 9:
                gj1 gj1Var = (gj1) this.Y;
                String str = (String) this.Z;
                ov3 ov3Var = gj1Var.i0;
                String str2 = gj1Var.j0;
                ov3Var.getClass();
                str2.getClass();
                Collection collectionY0 = str.equals("<init>") ? wv0.Y0(ov3Var.V()) : ov3Var.X(v15.e(str));
                ArrayList arrayList7 = new ArrayList();
                for (Object obj2 : collectionY0) {
                    if (dh3.f(ir6.c((ho2) obj2).g(), str2)) {
                        arrayList7.add(obj2);
                    }
                }
                if (arrayList7.size() == 1) {
                    return (ho2) wv0.O0(arrayList7);
                }
                String strY0 = wv0.y0(collectionY0, "\n", null, null, cl1.t0, 30);
                StringBuilder sbT = oi0.t("Function '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbT.append(ov3Var);
                sbT.append(':');
                sbT.append(strY0.length() == 0 ? " no members found" : "\n".concat(strY0));
                throw new p14(sbT.toString());
            case 10:
                kk1 kk1Var = (kk1) this.Y;
                dn2 dn2Var = (dn2) this.Z;
                List listL0 = kk1Var.Y.l0();
                if (listL0.isEmpty()) {
                    return d02.X;
                }
                ArrayList arrayList8 = new ArrayList(xv0.Z(listL0, 10));
                int i2 = 0;
                for (Object obj3 : listL0) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        i21.X();
                        throw null;
                    }
                    ni8 ni8Var = (ni8) obj3;
                    y51 y51Var = dn2Var == null ? null : new y51(new jk1(kk1Var, b2), i2, objArr == true ? 1 : 0);
                    if (ni8Var.c()) {
                        uw3VarG0 = uw3.c;
                    } else {
                        t14 t14VarB = ni8Var.b();
                        t14VarB.getClass();
                        kk1 kk1Var2 = new kk1(t14VarB, y51Var, false);
                        int iOrdinal = ni8Var.a().ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                uw3Var = new uw3(kk1Var2, yw3.Y);
                            } else {
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return null;
                                }
                                uw3Var = new uw3(kk1Var2, yw3.Z);
                            }
                            uw3VarG0 = uw3Var;
                        } else {
                            uw3 uw3Var2 = uw3.c;
                            uw3VarG0 = hi5.g0(kk1Var2);
                        }
                    }
                    arrayList8.add(uw3VarG0);
                    i2 = i3;
                }
                return arrayList8;
            case 11:
                vl1 vl1Var = (vl1) this.Y;
                return wv0.Y0(((hl1) vl1Var.n0.X).e.p(vl1Var.w0, (qy5) this.Z));
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ((gn2) this.Y).B((ko1) this.Z);
                return dn8.a;
            case 13:
                oc7 oc7Var = new oc7();
                Iterator it4 = ((jo2) this.Z).q().iterator();
                while (it4.hasNext()) {
                    oc7Var.add(((ho2) it4.next()).g((wi8) this.Y));
                }
                return oc7Var;
            case 14:
                h23 h23Var = (h23) this.Z;
                k23 k23Var = (k23) this.Y;
                try {
                    if (!k23Var.g(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (k23Var.g(false, this)) {
                    }
                    h23Var.g(1, 9, null);
                    ks8.c(k23Var);
                    return dn8.a;
                } catch (IOException e) {
                    h23Var.g(2, 2, e);
                } catch (Throwable th) {
                    h23Var.g(3, 3, null);
                    ks8.c(k23Var);
                    throw th;
                }
                break;
            case 15:
                ((uh3) this.Y).B((vh3) this.Z);
                return dn8.a;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return ((wx4) ((c6) ((z47) this.Y).Y).n0).h0.j(((tj3) this.Z).a).X();
            case 17:
                qk3 qk3Var = (qk3) this.Y;
                ov3 ov3Var2 = (ov3) this.Z;
                List listL = qk3Var.l();
                if (!mb6.K(qk3Var)) {
                    return listL;
                }
                if (listL.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder("Bound function reference has no parameters: ");
                    sb2.append(ov3Var2);
                    String name = qk3Var.getName();
                    sb2.append('.');
                    sb2.append(name);
                    throw new IllegalStateException(sb2.toString().toString());
                }
                int size = listL.size() - 1;
                ArrayList arrayList9 = new ArrayList(size);
                while (true) {
                    int i4 = i;
                    if (i4 >= size) {
                        return arrayList9;
                    }
                    i = i4 + 1;
                    ob6 ob6Var = (ob6) listL.get(i);
                    if (!(ob6Var instanceof wk3)) {
                        StringBuilder sb3 = new StringBuilder("Unexpected parameter type: ");
                        sb3.append(yb6.a.b(ob6Var.getClass()).E());
                        sb3.append(" (");
                        sb3.append(ov3Var2);
                        String name2 = qk3Var.getName();
                        sb3.append('.');
                        sb3.append(name2);
                        sb3.append(')');
                        throw new IllegalStateException(sb3.toString().toString());
                    }
                    wk3 wk3Var = (wk3) ob6Var;
                    arrayList9.add(new wk3(wk3Var.X, wk3Var.Y, wk3Var.Z, i4, wk3Var.g0, wk3Var.h0));
                }
                break;
            case 18:
                yu3 yu3Var2 = (yu3) this.Y;
                vk3 vk3Var = (vk3) this.Z;
                boolean zC = yu3Var2.c();
                List list3 = yu3Var2.f;
                if (zC && list3.size() == 1) {
                    pw3VarQ = ((kb6) wv0.O0(list3)).j();
                } else {
                    Type genericReturnType = vk3Var.X().getGenericReturnType();
                    genericReturnType.getClass();
                    pw3VarQ = w51.Q(genericReturnType, zp4.P(eu.M0(vk3Var.U(), vk3Var.getTypeParameters())), null, w51.D(vk3Var.Z), false, null, 26);
                }
                return (u1) mb6.c0(vk3Var, pw3VarQ);
            case 19:
                os3 os3Var = (os3) this.Y;
                ve4 ve4Var = (ve4) this.Z;
                gn2 gn2Var = os3Var.b;
                wx4 wx4Var = os3Var.a;
                ms0 ms0Var = new ms0((ed1) gn2Var.B(wx4Var), os3.g, fx4.g0, us0.Y, i21.K(wx4Var.h0.e()), ve4Var);
                ms0Var.B0(new qu0(ve4Var, ms0Var), m02.X, null);
                return ms0Var;
            case 20:
                rs3 rs3Var = (rs3) this.Y;
                ve4 ve4Var2 = (ve4) this.Z;
                wx4 wx4VarL = rs3Var.l();
                wx4VarL.getClass();
                return new us3(wx4VarL, ve4Var2, new zk3(rs3Var, b));
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                us3 us3Var = (us3) this.Y;
                ve4 ve4Var3 = (ve4) this.Z;
                wx4 wx4Var2 = us3Var.b().a;
                os3.d.getClass();
                return oc.o(wx4Var2, os3.h, new z47(ve4Var3, us3Var.b().a)).X();
            case 22:
                p44 p44Var = (p44) this.Y;
                sx4 sx4Var = (sx4) this.Z;
                z47 z47Var3 = p44Var.l0;
                c6 c6Var = (c6) z47Var3.Y;
                z47 z47Var4 = new z47(new c6((ve4) c6Var.f0, (lr5) c6Var.Y, (y45) c6Var.i0, (zl1) c6Var.j0, (g55) c6Var.k0, (lr5) c6Var.l0, (qe4) c6Var.m0, (wx4) c6Var.n0, (hc6) c6Var.o0, (mm) c6Var.p0, (we5) c6Var.q0, (p45) c6Var.Z, (o8) c6Var.g0, (ra) c6Var.h0), (ki8) z47Var3.Z, (g44) z47Var3.f0);
                ed1 ed1VarP = p44Var.p();
                ed1VarP.getClass();
                return new p44(z47Var4, ed1VarP, p44Var.j0, sx4Var);
            case 23:
                t14 t14Var = (t14) this.Y;
                ev3 ev3Var = (ev3) this.Z;
                ot0 ot0VarX = t14Var.n0().x();
                if (!(ot0VarX instanceof sx4)) {
                    xw3.j(ot0VarX, "Supertype not a class: ");
                    return null;
                }
                Class clsQ = ms8.q((sx4) ot0VarX);
                if (clsQ == null) {
                    b61.p("Unsupported superclass of ", ev3Var, ": ", ot0VarX);
                    return null;
                }
                Class cls2 = ev3Var.Y;
                if (dh3.f(cls2.getSuperclass(), clsQ)) {
                    Type genericSuperclass = cls2.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls2.getInterfaces();
                interfaces.getClass();
                int iV0 = eu.v0(clsQ, interfaces);
                if (iV0 < 0) {
                    b61.p("No superclass of ", ev3Var, " in Java reflection for ", ot0VarX);
                    return null;
                }
                Type type = cls2.getGenericInterfaces()[iV0];
                type.getClass();
                return type;
            case 24:
                z04 z04Var = (z04) this.Y;
                li8 li8Var = (li8) this.Z;
                mz3 mz3Var2 = z04Var.Y.c;
                if (mz3Var2 != null) {
                    return ys0.a0(mz3Var2, ia6.d(z04Var.X.D().t()), li8Var, new zk3(z04Var, b3), 4);
                }
                dh3.T("type");
                throw null;
            case 25:
                return new v44(((w44) this.Y).a, (db6) this.Z);
            case 26:
                f54 f54Var = (f54) this.Y;
                ea6 ea6Var = (ea6) this.Z;
                Object obj4 = f54Var.b.Y;
                ((fx5) ea6Var.X).getClass();
                return null;
            case 27:
                d45 d45Var = (d45) this.Y;
                z14 z14Var = (z14) this.Z;
                Iterable iterable = (List) d45Var.g0.getValue();
                if (iterable == null) {
                    iterable = d02.X;
                }
                ArrayList arrayList10 = new ArrayList(xv0.Z(iterable, 10));
                Iterator it5 = iterable.iterator();
                while (it5.hasNext()) {
                    arrayList10.add(((mo8) it5.next()).p0(z14Var));
                }
                return arrayList10;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                fx8 fx8Var = (fx8) ((g44) this.Z).getValue();
                iz2Var = fx8Var instanceof iz2 ? (iz2) fx8Var : null;
                return (iz2Var == null || (bx8VarC = iz2Var.c()) == null) ? ((ok7) this.Y).c() : bx8VarC;
            default:
                fx8 fx8Var2 = (fx8) ((g44) this.Z).getValue();
                iz2Var = fx8Var2 instanceof iz2 ? (iz2) fx8Var2 : null;
                return (iz2Var == null || (bx8VarC2 = iz2Var.c()) == null) ? ((wu7) this.Y).c() : bx8VarC2;
        }
    }

    public /* synthetic */ c3(byte b, Object obj, Object obj2, boolean z) {
        this.X = b;
        this.Z = obj;
        this.Y = obj2;
    }

    public /* synthetic */ c3(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }
}
