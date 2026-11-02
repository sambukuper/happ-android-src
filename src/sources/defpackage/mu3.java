package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mu3 {
    public static final r62 a = hi5.H(cl1.q0);

    public static lt3 a(iy5 iy5Var, w15 w15Var, ux4 ux4Var) {
        String strY0;
        w15Var.getClass();
        ux4Var.getClass();
        aq2 aq2Var = lu3.a;
        aq2Var.getClass();
        du3 du3Var = (du3) ch3.y(iy5Var, aq2Var);
        String string = (du3Var == null || (du3Var.Y & 1) != 1) ? "<init>" : w15Var.getString(du3Var.Z);
        if (du3Var == null || (du3Var.Y & 2) != 2) {
            List<vz5> list = iy5Var.g0;
            list.getClass();
            ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
            for (vz5 vz5Var : list) {
                vz5Var.getClass();
                String strE = e(vr3.h0(vz5Var, ux4Var), w15Var);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strY0 = wv0.y0(arrayList, _UrlKt.FRAGMENT_ENCODE_SET, "(", ")V", null, 56);
        } else {
            strY0 = w15Var.getString(du3Var.f0);
        }
        return new lt3(string, strY0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x004a: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x004c A[HIDDEN] (LINE:75)
          (r4v2 java.lang.String) from 0x004d: PHI (r4 I:??) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x004a, B:20:0x003b] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static defpackage.kt3 b(defpackage.cz5 r4, defpackage.w15 r5, defpackage.ux4 r6, boolean r7) {
        /*
            r4.getClass()
            r5.getClass()
            r6.getClass()
            aq2 r0 = defpackage.lu3.d
            r0.getClass()
            java.lang.Object r0 = defpackage.ch3.y(r4, r0)
            fu3 r0 = (defpackage.fu3) r0
            r1 = 0
            if (r0 != 0) goto L18
            goto L4c
        L18:
            int r2 = r0.Y
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L21
            cu3 r0 = r0.Z
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 != 0) goto L27
            if (r7 == 0) goto L27
            goto L4c
        L27:
            if (r0 == 0) goto L31
            int r7 = r0.Y
            r7 = r7 & r3
            if (r7 != r3) goto L31
            int r7 = r0.Z
            goto L33
        L31:
            int r7 = r4.h0
        L33:
            if (r0 == 0) goto L42
            int r2 = r0.Y
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L42
            int r4 = r0.f0
            java.lang.String r4 = r5.getString(r4)
            goto L4d
        L42:
            nz5 r4 = defpackage.vr3.Y(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L4d
        L4c:
            return r1
        L4d:
            kt3 r6 = new kt3
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu3.b(cz5, w15, ux4, boolean):kt3");
    }

    public static lt3 c(vy5 vy5Var, w15 w15Var, ux4 ux4Var) {
        String strConcat;
        vy5Var.getClass();
        w15Var.getClass();
        ux4Var.getClass();
        aq2 aq2Var = lu3.b;
        aq2Var.getClass();
        du3 du3Var = (du3) ch3.y(vy5Var, aq2Var);
        int i = (du3Var == null || (du3Var.Y & 1) != 1) ? vy5Var.h0 : du3Var.Z;
        if (du3Var == null || (du3Var.Y & 2) != 2) {
            List listM = i21.M(vr3.U(vy5Var, ux4Var));
            List<vz5> list = vy5Var.r0;
            list.getClass();
            ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
            for (vz5 vz5Var : list) {
                vz5Var.getClass();
                arrayList.add(vr3.h0(vz5Var, ux4Var));
            }
            ArrayList arrayListH0 = wv0.H0(listM, arrayList);
            ArrayList arrayList2 = new ArrayList(xv0.Z(arrayListH0, 10));
            Iterator it = arrayListH0.iterator();
            while (it.hasNext()) {
                String strE = e((nz5) it.next(), w15Var);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(vr3.X(vy5Var, ux4Var), w15Var);
            if (strE2 == null) {
                return null;
            }
            strConcat = wv0.y0(arrayList2, _UrlKt.FRAGMENT_ENCODE_SET, "(", ")", null, 56).concat(strE2);
        } else {
            strConcat = w15Var.getString(du3Var.f0);
        }
        return new lt3(w15Var.getString(i), strConcat);
    }

    public static final boolean d(cz5 cz5Var) {
        jd2 jd2Var = dt3.a;
        Object objK = cz5Var.k(lu3.e);
        objK.getClass();
        return jd2Var.e(((Number) objK).intValue()).booleanValue();
    }

    public static String e(nz5 nz5Var, w15 w15Var) {
        if (nz5Var.p()) {
            return zs0.b(w15Var.a(nz5Var.k0));
        }
        return null;
    }

    public static final qg5 f(String[] strArr, String[] strArr2) throws rh3 {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(v50.a(strArr));
        qt3 qt3VarH = h(byteArrayInputStream, strArr2);
        au3 au3Var = fy5.J0;
        au3Var.getClass();
        iv0 iv0Var = new iv0(byteArrayInputStream);
        d2 d2Var = (d2) au3Var.b(iv0Var, a);
        try {
            iv0Var.a(0);
            if (d2Var.d()) {
                return new qg5(qt3VarH, (fy5) d2Var);
            }
            rh3 rh3Var = new rh3(new xm8().getMessage());
            rh3Var.X = d2Var;
            throw rh3Var;
        } catch (rh3 e) {
            e.X = d2Var;
            throw e;
        }
    }

    public static final qg5 g(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(v50.a(strArr));
        qt3 qt3VarH = h(byteArrayInputStream, strArr2);
        au3 au3Var = vy5.B0;
        au3Var.getClass();
        iv0 iv0Var = new iv0(byteArrayInputStream);
        d2 d2Var = (d2) au3Var.b(iv0Var, a);
        try {
            iv0Var.a(0);
            if (d2Var.d()) {
                return new qg5(qt3VarH, (vy5) d2Var);
            }
            rh3 rh3Var = new rh3(new xm8().getMessage());
            rh3Var.X = d2Var;
            throw rh3Var;
        } catch (rh3 e) {
            e.X = d2Var;
            throw e;
        }
    }

    public static qt3 h(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        ku3 ku3Var = (ku3) ku3.j0.a(byteArrayInputStream, a);
        ku3Var.getClass();
        return new qt3(ku3Var, strArr);
    }

    public static final qg5 i(String[] strArr, String[] strArr2) throws rh3 {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(v50.a(strArr));
        qt3 qt3VarH = h(byteArrayInputStream, strArr2);
        au3 au3Var = zy5.n0;
        au3Var.getClass();
        iv0 iv0Var = new iv0(byteArrayInputStream);
        d2 d2Var = (d2) au3Var.b(iv0Var, a);
        try {
            iv0Var.a(0);
            if (d2Var.d()) {
                return new qg5(qt3VarH, (zy5) d2Var);
            }
            rh3 rh3Var = new rh3(new xm8().getMessage());
            rh3Var.X = d2Var;
            throw rh3Var;
        } catch (rh3 e) {
            e.X = d2Var;
            throw e;
        }
    }
}
