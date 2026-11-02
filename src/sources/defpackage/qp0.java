package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qp0 implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public qp0(ea6 ea6Var, ze2 ze2Var, String[] strArr, int[] iArr) {
        this.X = (byte) 3;
        this.Y = ea6Var;
        this.g0 = ze2Var;
        this.Z = strArr;
        this.f0 = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r4.l(r2, r5) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r4.l(r2, r5) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int[] r18, defpackage.q51 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.Z
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.Object r4 = r0.g0
            ze2 r4 = (defpackage.ze2) r4
            boolean r5 = r2 instanceof defpackage.qf8
            if (r5 == 0) goto L21
            r5 = r2
            qf8 r5 = (defpackage.qf8) r5
            int r6 = r5.j0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L21
            int r6 = r6 - r7
            r5.j0 = r6
            goto L26
        L21:
            qf8 r5 = new qf8
            r5.<init>(r0, r2)
        L26:
            java.lang.Object r2 = r5.h0
            int r6 = r5.j0
            r7 = 0
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L47
            if (r6 == r9) goto L3a
            if (r6 != r8) goto L34
            goto L3a
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r0)
            return r7
        L3a:
            int[] r0 = r5.g0
            qp0 r1 = r5.f0
            defpackage.w39.n0(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto Lad
        L47:
            defpackage.w39.n0(r2)
            java.lang.Object r2 = r0.Y
            ea6 r2 = (defpackage.ea6) r2
            java.lang.Object r6 = r2.X
            c71 r10 = defpackage.c71.X
            if (r6 != 0) goto L65
            java.util.Set r2 = defpackage.eu.L0(r3)
            r5.f0 = r0
            r5.g0 = r1
            r5.j0 = r9
            java.lang.Object r2 = r4.l(r2, r5)
            if (r2 != r10) goto Lad
            goto Lac
        L65:
            java.lang.Object r6 = r0.f0
            int[] r6 = (int[]) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r11 = r3.length
            r12 = 0
            r13 = r12
        L71:
            if (r12 >= r11) goto L96
            r14 = r3[r12]
            int r15 = r13 + 1
            r19 = r7
            java.lang.Object r7 = r2.X
            if (r7 == 0) goto L90
            int[] r7 = (int[]) r7
            r13 = r6[r13]
            r7 = r7[r13]
            r13 = r1[r13]
            if (r7 == r13) goto L8a
            r9.add(r14)
        L8a:
            int r12 = r12 + 1
            r7 = r19
            r13 = r15
            goto L71
        L90:
            java.lang.String r0 = "Required value was null."
            defpackage.bt.i(r0)
            return r19
        L96:
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto Lad
            java.util.Set r2 = defpackage.wv0.c1(r9)
            r5.f0 = r0
            r5.g0 = r1
            r5.j0 = r8
            java.lang.Object r2 = r4.l(r2, r5)
            if (r2 != r10) goto Lad
        Lac:
            return r10
        Lad:
            java.lang.Object r0 = r0.Y
            ea6 r0 = (defpackage.ea6) r0
            r0.X = r1
            dn8 r0 = defpackage.dn8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp0.a(int[], q51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00f4  */
    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) {
        pp0 pp0Var;
        byte b = this.X;
        boolean z = true;
        c71 c71Var = c71.X;
        Object obj2 = this.g0;
        Object obj3 = this.f0;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                ea6 ea6Var = (ea6) obj5;
                if (q51Var instanceof pp0) {
                    pp0Var = (pp0) q51Var;
                    int i = pp0Var.i0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pp0Var.i0 = i - Integer.MIN_VALUE;
                    } else {
                        pp0Var = new pp0(this, q51Var);
                    }
                } else {
                    pp0Var = new pp0(this, q51Var);
                }
                Object obj6 = pp0Var.g0;
                int i2 = pp0Var.i0;
                if (i2 == 0) {
                    w39.n0(obj6);
                    bm3 bm3Var = (bm3) ea6Var.X;
                    if (bm3Var != null) {
                        bm3Var.m(new gr0());
                        pp0Var.f0 = obj;
                        pp0Var.i0 = 1;
                        if (bm3Var.V0(pp0Var) == c71Var) {
                            return c71Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = pp0Var.f0;
                    w39.n0(obj6);
                }
                ea6Var.X = w51.G((b71) obj4, null, e71.f0, new op0((rp0) obj3, (ze2) obj2, obj, null), 1);
                return dn8Var;
            case 1:
                vf3 vf3Var = (vf3) obj;
                ca6 ca6Var = (ca6) obj3;
                ca6 ca6Var2 = (ca6) obj4;
                ca6 ca6Var3 = (ca6) obj5;
                if (vf3Var instanceof ft5) {
                    ca6Var3.X++;
                } else if ((vf3Var instanceof gt5) || (vf3Var instanceof et5)) {
                    ca6Var3.X--;
                } else if (vf3Var instanceof d13) {
                    ca6Var2.X++;
                } else if (vf3Var instanceof e13) {
                    ca6Var2.X--;
                } else if (vf3Var instanceof yg2) {
                    ca6Var.X++;
                } else if (vf3Var instanceof zg2) {
                    ca6Var.X--;
                }
                boolean z2 = false;
                boolean z3 = ca6Var3.X > 0;
                boolean z4 = ca6Var2.X > 0;
                boolean z5 = ca6Var.X > 0;
                ie1 ie1Var = (ie1) obj2;
                if (ie1Var.r0 != z3) {
                    ie1Var.r0 = z3;
                    z2 = true;
                }
                if (ie1Var.s0 != z4) {
                    ie1Var.s0 = z4;
                    z2 = true;
                }
                if (ie1Var.t0 != z5) {
                    ie1Var.t0 = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    z68.W(ie1Var);
                }
                return dn8Var;
            case 2:
                h67 h67Var = (h67) obj;
                if (h67Var instanceof f67) {
                    ((gn2) obj5).B(new sa3(((f67) h67Var).a));
                    ((gn2) obj4).B(k67.a);
                } else {
                    if (!(h67Var instanceof g67)) {
                        b61.c();
                        return null;
                    }
                    String string = ((Context) obj2).getString(y46.update_not_found);
                    string.getClass();
                    Object objC = ((ky2) obj3).c(new by2(string, my2.Z), q51Var);
                    if (objC == c71Var) {
                        return objC;
                    }
                }
                return dn8Var;
            default:
                return a((int[]) obj, q51Var);
        }
    }

    public /* synthetic */ qp0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
    }
}
