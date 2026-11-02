package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class rj1 implements dn2 {
    public final /* synthetic */ byte X;
    public final gk1 Y;

    public /* synthetic */ rj1(gk1 gk1Var, byte b) {
        this.X = b;
        this.Y = gk1Var;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0200  */
    @Override // defpackage.dn2
    public final Object invoke() throws IOException {
        ed1 ed1VarP;
        Class<?> clsT;
        y82 y82VarV;
        byte b = this.X;
        gk1 gk1Var = this.Y;
        switch (b) {
            case 0:
                qs0 qs0Var = ir6.a;
                fx5 fx5VarV = gk1Var.V();
                ov3 ov3Var = gk1Var.i0;
                jm4 jm4VarB = ir6.b(fx5VarV);
                if (!(jm4VarB instanceof yt3)) {
                    if (jm4VarB instanceof wt3) {
                        return ((wt3) jm4VarB).m0;
                    }
                    if ((jm4VarB instanceof xt3) || (jm4VarB instanceof zt3)) {
                        return null;
                    }
                    b61.c();
                    return null;
                }
                yt3 yt3Var = (yt3) jm4VarB;
                cz5 cz5Var = yt3Var.n0;
                fx5 fx5Var = yt3Var.m0;
                r62 r62Var = mu3.a;
                kt3 kt3VarB = mu3.b(cz5Var, yt3Var.p0, yt3Var.q0, true);
                if (kt3VarB == null) {
                    return null;
                }
                if (fx5Var.r() != 2) {
                    ed1 ed1VarP2 = fx5Var.p();
                    if (ed1VarP2 == null) {
                        gv3.a(1);
                        throw null;
                    }
                    if (bl1.k(ed1VarP2)) {
                        ed1 ed1VarP3 = ed1VarP2.p();
                        if (bl1.l(ed1VarP3, us0.X) || bl1.l(ed1VarP3, us0.Z)) {
                            sx4 sx4Var = (sx4) ed1VarP2;
                            LinkedHashSet linkedHashSet = px0.a;
                            if (bl1.k(sx4Var)) {
                                LinkedHashSet linkedHashSet2 = px0.a;
                                qs0 qs0VarF = el1.f(sx4Var);
                                if (wv0.m0(linkedHashSet2, qs0VarF != null ? qs0VarF.e() : null)) {
                                    if (bl1.k(fx5Var.p())) {
                                        y82VarV = fx5Var.V();
                                        if (!((y82VarV == null && y82VarV.getAnnotations().k(js3.a)) ? true : fx5Var.getAnnotations().k(js3.a))) {
                                            if (mu3.d(cz5Var)) {
                                                ed1VarP = fx5Var.p();
                                                if (ed1VarP instanceof sx4) {
                                                    clsT = ms8.q((sx4) ed1VarP);
                                                } else {
                                                    clsT = ov3Var.t();
                                                }
                                            }
                                        }
                                    } else if (mu3.d(cz5Var)) {
                                        ed1VarP = fx5Var.p();
                                        if (ed1VarP instanceof sx4) {
                                            clsT = ms8.q((sx4) ed1VarP);
                                        } else {
                                            clsT = ov3Var.t();
                                        }
                                    }
                                }
                            }
                        } else if (bl1.k(fx5Var.p())) {
                            y82VarV = fx5Var.V();
                            if (!((y82VarV == null && y82VarV.getAnnotations().k(js3.a)) ? true : fx5Var.getAnnotations().k(js3.a))) {
                                if (mu3.d(cz5Var)) {
                                    ed1VarP = fx5Var.p();
                                    if (ed1VarP instanceof sx4) {
                                        clsT = ms8.q((sx4) ed1VarP);
                                    } else {
                                        clsT = ov3Var.t();
                                    }
                                }
                            }
                        } else if (mu3.d(cz5Var)) {
                            ed1VarP = fx5Var.p();
                            if (ed1VarP instanceof sx4) {
                                clsT = ms8.q((sx4) ed1VarP);
                            } else {
                                clsT = ov3Var.t();
                            }
                        }
                    } else if (bl1.k(fx5Var.p())) {
                        y82VarV = fx5Var.V();
                        if (!((y82VarV == null && y82VarV.getAnnotations().k(js3.a)) ? true : fx5Var.getAnnotations().k(js3.a))) {
                            if (mu3.d(cz5Var)) {
                                ed1VarP = fx5Var.p();
                                if (ed1VarP instanceof sx4) {
                                    clsT = ms8.q((sx4) ed1VarP);
                                } else {
                                    clsT = ov3Var.t();
                                }
                            }
                        }
                    } else if (mu3.d(cz5Var)) {
                        ed1VarP = fx5Var.p();
                        if (ed1VarP instanceof sx4) {
                            clsT = ms8.q((sx4) ed1VarP);
                        } else {
                            clsT = ov3Var.t();
                        }
                    }
                    clsT = ov3Var.t().getEnclosingClass();
                } else if (mu3.d(cz5Var)) {
                    clsT = ov3Var.t().getEnclosingClass();
                } else {
                    ed1VarP = fx5Var.p();
                    if (ed1VarP instanceof sx4) {
                        clsT = ms8.q((sx4) ed1VarP);
                    } else {
                        clsT = ov3Var.t();
                    }
                }
                if (clsT == null) {
                    return null;
                }
                try {
                    return clsT.getDeclaredField(kt3VarB.l);
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            case 1:
                ov3 ov3Var2 = gk1Var.i0;
                String str = gk1Var.j0;
                String str2 = gk1Var.k0;
                ov3Var2.getClass();
                str.getClass();
                str2.getClass();
                fq4 fq4VarC = ov3.X.c(str2);
                if (fq4VarC != null) {
                    String str3 = (String) ((dq4) fq4VarC.a()).get(1);
                    fx5 fx5VarY = ov3Var2.Y(Integer.parseInt(str3));
                    if (fx5VarY != null) {
                        return fx5VarY;
                    }
                    StringBuilder sbP = p61.p("Local property #", str3, " not found in ");
                    sbP.append(ov3Var2.t());
                    throw new p14(sbP.toString());
                }
                Collection collectionB0 = ov3Var2.b0(v15.e(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionB0) {
                    if (dh3.f(ir6.b((fx5) obj).o(), str2)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbT = oi0.t("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                    sbT.append(ov3Var2);
                    throw new p14(sbT.toString());
                }
                if (arrayList.size() == 1) {
                    return (fx5) wv0.O0(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    fl1 fl1VarE = ((fx5) obj2).e();
                    Object arrayList2 = linkedHashMap.get(fl1VarE);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(fl1VarE, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                TreeMap treeMap = new TreeMap(new l71((byte) 24));
                treeMap.putAll(linkedHashMap);
                Collection collectionValues = treeMap.values();
                collectionValues.getClass();
                List list = (List) wv0.z0(collectionValues);
                if (list.size() == 1) {
                    return (fx5) wv0.r0(list);
                }
                String strY0 = wv0.y0(ov3Var2.b0(v15.e(str)), "\n", null, null, cl1.r0, 30);
                StringBuilder sbT2 = oi0.t("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbT2.append(ov3Var2);
                sbT2.append(':');
                sbT2.append(strY0.length() == 0 ? " no members found" : "\n".concat(strY0));
                throw new p14(sbT2.toString());
            default:
                return gk1Var.r().j();
        }
    }
}
