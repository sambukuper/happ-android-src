package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class cw3 implements dn2 {
    public final /* synthetic */ byte X;
    public final dw3 Y;
    public final ew3 Z;

    public cw3(ew3 ew3Var, dw3 dw3Var) {
        this.X = (byte) 0;
        this.Z = ew3Var;
        this.Y = dw3Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    @Override // defpackage.dn2
    public final Object invoke() throws ClassNotFoundException {
        String str;
        lb6 v04Var;
        byte b = this.X;
        ew3 ew3Var = this.Z;
        dw3 dw3Var = this.Y;
        switch (b) {
            case 0:
                Class cls = ew3Var.Y;
                boolean z = q08.c;
                Iterable<et4> iterableK0 = d02.X;
                if (!z) {
                    tb6 tb6Var = dw3Var.e;
                    nw3 nw3Var = dw3.g[1];
                    Object objInvoke = tb6Var.invoke();
                    objInvoke.getClass();
                    et4 et4Var = (et4) objInvoke;
                    if (et4Var instanceof hm1) {
                        iterableK0 = i21.K(et4Var);
                    } else if (et4Var instanceof yo0) {
                        iterableK0 = eu.K0(((yo0) et4Var).c);
                    }
                    ArrayList arrayList = new ArrayList(xv0.Z(iterableK0, 10));
                    for (et4 et4Var2 : iterableK0) {
                        et4Var2.getClass();
                        hm1 hm1Var = (hm1) et4Var2;
                        arrayList.add(vj8.q0(hm1Var.h, (w15) hm1Var.b.Y, false, 6));
                    }
                    return arrayList;
                }
                Metadata metadata = (Metadata) cls.getAnnotation(Metadata.class);
                z91 z91VarO = metadata != null ? z51.O(metadata) : null;
                if (z91VarO instanceof d04) {
                    return i21.K(((d04) z91VarO).f);
                }
                if (z91VarO instanceof f04) {
                    return i21.K(((f04) z91VarO).f);
                }
                if (!(z91VarO instanceof e04)) {
                    return iterableK0;
                }
                List list = ((e04) z91VarO).f;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Class<?> clsLoadClass = ia6.d(cls).loadClass(mm7.X((String) it.next(), '/', '.'));
                    clsLoadClass.getClass();
                    mv3 mv3Var = (mv3) uc0.b.Q(clsLoadClass);
                    mv3Var.getClass();
                    bw0.d0(arrayList2, (List) ((dw3) ((ew3) mv3Var).Z.getValue()).c.getValue());
                }
                return arrayList2;
            case 1:
                tb6 tb6Var2 = dw3Var.d;
                nw3 nw3Var2 = dw3.g[0];
                qb6 qb6Var = (qb6) tb6Var2.invoke();
                if (qb6Var != null) {
                    b04 b04Var = qb6Var.b;
                    str = b04Var.f;
                    if (b04Var.a != a04.MULTIFILE_CLASS_PART) {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null || str.length() <= 0) {
                    return null;
                }
                ClassLoader classLoaderD = ia6.d(ew3Var.Y);
                String strReplace = str.replace('/', '.');
                strReplace.getClass();
                return classLoaderD.loadClass(strReplace);
            default:
                boolean z2 = q08.a;
                ew3 ew3Var2 = this.Z;
                if (z2) {
                    fv3 fv3Var = new fv3(ew3Var2, (byte) 1);
                    tb6 tb6Var3 = dw3Var.e;
                    nw3 nw3Var3 = dw3.g[1];
                    Object objInvoke2 = tb6Var3.invoke();
                    objInvoke2.getClass();
                    Collection<ed1> collectionB0 = hi5.b0((et4) objInvoke2, null, 3);
                    ArrayList arrayList3 = new ArrayList();
                    for (ed1 ed1Var : collectionB0) {
                        ej1 ej1Var = ed1Var instanceof ld0 ? (ej1) ed1Var.J(fv3Var, dn8.a) : null;
                        if (ej1Var != null) {
                            arrayList3.add(ej1Var);
                        }
                    }
                    return wv0.Y0(arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                for (jz3 jz3Var : (List) dw3Var.c.getValue()) {
                    for (kz3 kz3Var : jz3Var.b) {
                        kz3Var.getClass();
                        String str2 = kz3Var.b;
                        byte b2 = kz3Var.h.isEmpty() ? kz3Var.f != null ? (byte) 1 : (byte) 0 : (byte) -1;
                        String strO = ys0.o(kz3Var, ew3Var2);
                        if (strO == null) {
                            throw new p14(oi0.l("No field or getter signature for property: ", str2));
                        }
                        Object obj = nd0.NO_RECEIVER;
                        if (ow.r.x(ow.a[37], kz3Var)) {
                            if (b2 == -1) {
                                v04Var = new v04(ew3Var2, strO, obj, kz3Var, yu3.k);
                            } else if (b2 == 0) {
                                v04Var = new r04(ew3Var2, strO, obj, kz3Var, yu3.k);
                            } else if (b2 != 1) {
                                v04Var = null;
                            } else {
                                v04Var = new t04(ew3Var2, strO, obj, kz3Var, yu3.k);
                            }
                        } else if (b2 == -1) {
                            v04Var = new n14(ew3Var2, strO, obj, kz3Var, yu3.k);
                        } else if (b2 == 0) {
                            v04Var = new h14(ew3Var2, strO, obj, kz3Var, yu3.k);
                        } else if (b2 != 1) {
                            v04Var = null;
                        } else {
                            v04Var = new k14(ew3Var2, strO, obj, kz3Var, yu3.k);
                        }
                        if (v04Var == null) {
                            StringBuilder sbT = oi0.t("Unsupported property: name=", str2, " signature=", strO, " container=");
                            sbT.append(ew3Var2);
                            throw new p14(sbT.toString());
                        }
                        arrayList4.add(v04Var);
                    }
                    for (iz3 iz3Var : jz3Var.a) {
                        iz3Var.getClass();
                        pt3 pt3Var = ch3.E(iz3Var).a;
                        if (pt3Var == null) {
                            u52.t(iz3Var.b, "No signature for function: ");
                            return null;
                        }
                        arrayList4.add(new y04(ew3Var2, pt3Var.toString(), nd0.NO_RECEIVER, iz3Var, yu3.k));
                    }
                }
                return wv0.Y0(arrayList4);
        }
    }

    public /* synthetic */ cw3(dw3 dw3Var, ew3 ew3Var, byte b) {
        this.X = b;
        this.Y = dw3Var;
        this.Z = ew3Var;
    }
}
