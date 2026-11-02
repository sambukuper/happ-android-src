package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q18 {
    public static final iv1 a = new iv1(3, null, (byte) 2);

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.bz7 r5, boolean r6, defpackage.bq5 r7, defpackage.r10 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.h18
            if (r0 == 0) goto L13
            r0 = r8
            h18 r0 = (defpackage.h18) r0
            int r1 = r0.j0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j0 = r1
            goto L18
        L13:
            h18 r0 = new h18
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.i0
            int r1 = r0.j0
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.h0
            bq5 r6 = r0.g0
            bz7 r7 = r0.f0
            defpackage.w39.n0(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r5)
            r5 = 0
            return r5
        L36:
            defpackage.w39.n0(r8)
        L39:
            r0.f0 = r5
            r0.g0 = r7
            r0.h0 = r6
            r0.j0 = r2
            java.lang.Object r8 = r5.a(r7, r0)
            c71 r1 = defpackage.c71.X
            if (r8 != r1) goto L4a
            return r1
        L4a:
            aq5 r8 = (defpackage.aq5) r8
            boolean r1 = e(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q18.a(bz7, boolean, bq5, r10):java.lang.Object");
    }

    public static /* synthetic */ Object b(bz7 bz7Var, r10 r10Var, int i) {
        return a(bz7Var, (i & 1) != 0, (i & 2) != 0 ? bq5.Y : bq5.X, r10Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[LOOP:1: B:22:0x005e->B:26:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0060
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.bz7 r7, defpackage.s51 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.i18
            if (r0 == 0) goto L13
            r0 = r8
            i18 r0 = (defpackage.i18) r0
            int r1 = r0.h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h0 = r1
            goto L18
        L13:
            i18 r0 = new i18
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.g0
            int r1 = r0.h0
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            bz7 r7 = r0.f0
            defpackage.w39.n0(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.w39.n0(r8)
        L31:
            r0.f0 = r7
            r0.h0 = r2
            bq5 r8 = defpackage.bq5.Y
            java.lang.Object r8 = r7.a(r8, r0)
            c71 r1 = defpackage.c71.X
            if (r8 != r1) goto L40
            return r1
        L40:
            aq5 r8 = (defpackage.aq5) r8
            java.util.List r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4a:
            if (r5 >= r3) goto L58
            java.lang.Object r6 = r1.get(r5)
            hq5 r6 = (defpackage.hq5) r6
            r6.a()
            int r5 = r5 + 1
            goto L4a
        L58:
            java.util.List r8 = r8.a
            int r1 = r8.size()
        L5e:
            if (r4 >= r1) goto L6e
            java.lang.Object r3 = r8.get(r4)
            hq5 r3 = (defpackage.hq5) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L6b
            goto L31
        L6b:
            int r4 = r4 + 1
            goto L5e
        L6e:
            dn8 r7 = defpackage.dn8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q18.c(bz7, s51):java.lang.Object");
    }

    public static Object d(mq5 mq5Var, lo4 lo4Var, gn2 gn2Var, q51 q51Var, int i) {
        Object obj = lo4Var;
        if ((i & 4) != 0) {
            obj = a;
        }
        Object objN = gv3.n(new pi((Object) mq5Var, obj, (Object) gn2Var, (q51) null, (byte) 18), q51Var);
        return objN == c71.X ? objN : dn8.a;
    }

    public static boolean e(aq5 aq5Var, boolean z) {
        List list = aq5Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hq5 hq5Var = (hq5) list.get(i);
            if (!(z ? vr3.j(hq5Var) : vr3.k(hq5Var))) {
                return false;
            }
        }
        return true;
    }

    public static og7 f(b71 b71Var, bm3 bm3Var, rn2 rn2Var) {
        return w51.G(b71Var, null, e71.f0, new bv(bm3Var, rn2Var, null, (byte) 10), 1);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x039d  */
    /* JADX WARN: Code duplicated, block: B:102:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:104:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:106:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:109:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:26:0x0181  */
    /* JADX WARN: Code duplicated, block: B:27:0x019c  */
    /* JADX WARN: Code duplicated, block: B:29:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:37:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:40:0x0201  */
    /* JADX WARN: Code duplicated, block: B:43:0x0229  */
    /* JADX WARN: Code duplicated, block: B:46:0x0235  */
    /* JADX WARN: Code duplicated, block: B:48:0x0239  */
    /* JADX WARN: Code duplicated, block: B:49:0x023e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0242  */
    /* JADX WARN: Code duplicated, block: B:54:0x024a  */
    /* JADX WARN: Code duplicated, block: B:55:0x025a  */
    /* JADX WARN: Code duplicated, block: B:57:0x026e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0270 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0272  */
    /* JADX WARN: Code duplicated, block: B:61:0x027d  */
    /* JADX WARN: Code duplicated, block: B:64:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x02b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:75:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0314  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x031f  */
    /* JADX WARN: Code duplicated, block: B:83:0x033d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0350  */
    /* JADX WARN: Code duplicated, block: B:89:0x0377  */
    /* JADX WARN: Code duplicated, block: B:92:0x0383  */
    /* JADX WARN: Code duplicated, block: B:94:0x0387  */
    /* JADX WARN: Code duplicated, block: B:96:0x0392  */
    /* JADX WARN: Code duplicated, block: B:98:0x0396  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13, types: [q51] */
    /* JADX WARN: Type inference failed for: r12v18, types: [q51] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r13v13, types: [hq5] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r27v1, types: [q51] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [q51, s61] */
    /* JADX WARN: Type inference failed for: r5v10 */
    public static final Object g(bz7 bz7Var, b71 b71Var, dt5 dt5Var, sn2 sn2Var, gn2 gn2Var, r10 r10Var) throws Throwable {
        m18 m18Var;
        b71 b71Var2;
        dt5 dt5Var2;
        ?? r5;
        sn2 sn2Var2;
        gn2 gn2Var2;
        byte b;
        Object objB;
        gn2 gn2Var3;
        gn2 gn2Var4;
        hq5 hq5Var;
        og7 og7VarG;
        dt5 dt5Var3;
        Object objH;
        bz7 bz7Var2;
        bm3 bm3Var;
        b71 b71Var3;
        gn2 gn2Var5;
        dt5 dt5Var4;
        Object objI;
        sn2 sn2Var3;
        gn2 gn2Var6;
        b71 b71Var4;
        gn2 gn2Var7;
        gn2 gn2Var8;
        hq5 hq5Var2;
        sn2 sn2Var4;
        b71 b71Var5;
        dt5 dt5Var5;
        og7 og7VarF;
        og7 og7Var;
        Object objG;
        bz7 bz7Var3;
        gn2 gn2Var9;
        gn2 gn2Var10;
        hq5 hq5Var3;
        bm3 bm3Var2;
        ki4 ki4Var;
        q51 q51Var;
        dt5 dt5Var6;
        b71 b71Var6;
        hq5 hq5Var4;
        q51 q51Var2;
        og7 og7VarG2;
        gn2 gn2Var11;
        dt5 dt5Var7;
        Object objH2;
        bm3 bm3Var3;
        hq5 hq5Var5;
        hq5 hq5Var6;
        dt5 dt5Var8;
        gn2 gn2Var12;
        gn2 gn2Var13;
        bz7 bz7Var4;
        bm3 bm3Var4;
        gn2 gn2Var14;
        gn2 gn2Var15;
        ?? r13;
        ?? r12;
        gn2 gn2Var16;
        ki4 ki4Var2;
        Object obj;
        b71 b71Var7;
        bm3 bm3Var5;
        ?? r14;
        bz7 bz7Var5 = bz7Var;
        if (r10Var instanceof m18) {
            m18Var = (m18) r10Var;
            int i = m18Var.p0;
            if ((i & Integer.MIN_VALUE) != 0) {
                m18Var.p0 = i - Integer.MIN_VALUE;
            } else {
                m18Var = new m18(r10Var);
            }
        } else {
            m18Var = new m18(r10Var);
        }
        Object objI2 = m18Var.o0;
        int i2 = m18Var.p0;
        e71 e71Var = e71.f0;
        bq5 bq5Var = bq5.Y;
        ji4 ji4Var = ji4.a;
        iv1 iv1Var = a;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        switch (i2) {
            case 0:
                w39.n0(objI2);
                m18Var.f0 = bz7Var5;
                b71Var2 = b71Var;
                m18Var.g0 = b71Var2;
                dt5Var2 = dt5Var;
                m18Var.h0 = dt5Var2;
                r5 = 0;
                m18Var.i0 = null;
                m18Var.j0 = null;
                sn2Var2 = sn2Var;
                m18Var.k0 = sn2Var2;
                gn2Var2 = gn2Var;
                m18Var.l0 = gn2Var2;
                b = 1;
                m18Var.p0 = 1;
                objB = b(bz7Var5, m18Var, 3);
                if (objB != c71Var) {
                    gn2Var3 = null;
                    gn2Var4 = null;
                    hq5 hq5Var7 = (hq5) objB;
                    hq5Var7.a();
                    hq5Var = hq5Var7;
                    og7VarG = w51.G(b71Var2, r5, e71Var, new k18(dt5Var2, r5, b), b);
                    if (sn2Var2 != iv1Var) {
                        dt5 dt5Var9 = dt5Var2;
                        dt5Var3 = dt5Var9;
                        f(b71Var2, og7VarG, new n18(sn2Var2, dt5Var9, hq5Var, r5, (byte) 0));
                    } else {
                        dt5Var3 = dt5Var2;
                    }
                    if (gn2Var3 == null) {
                        m18Var.f0 = bz7Var5;
                        m18Var.g0 = b71Var2;
                        m18Var.h0 = dt5Var3;
                        m18Var.i0 = gn2Var4;
                        m18Var.j0 = gn2Var3;
                        m18Var.k0 = sn2Var2;
                        m18Var.l0 = gn2Var2;
                        m18Var.m0 = og7VarG;
                        m18Var.p0 = 2;
                        objI = i(bz7Var5, bq5Var, m18Var);
                        if (objI != c71Var) {
                            bz7Var2 = bz7Var5;
                            bm3Var = og7VarG;
                            sn2Var3 = sn2Var2;
                            gn2Var6 = gn2Var3;
                            b71Var4 = b71Var2;
                            objI2 = objI;
                            gn2Var7 = gn2Var2;
                            gn2Var8 = gn2Var4;
                            hq5Var2 = (hq5) objI2;
                            dt5 dt5Var10 = dt5Var3;
                            sn2Var4 = sn2Var3;
                            b71Var5 = b71Var4;
                            gn2Var3 = gn2Var6;
                            dt5Var5 = dt5Var10;
                            if (hq5Var2 == null) {
                                og7VarF = f(b71Var5, bm3Var, new j18(dt5Var5, null, (byte) 3));
                            } else {
                                hq5Var2.a();
                                og7VarF = f(b71Var5, bm3Var, new j18(dt5Var5, null, (byte) 4));
                            }
                            if (hq5Var2 != null) {
                                if (gn2Var8 == null) {
                                    m18Var.f0 = bz7Var2;
                                    m18Var.g0 = b71Var5;
                                    m18Var.h0 = dt5Var5;
                                    m18Var.i0 = gn2Var8;
                                    m18Var.j0 = gn2Var3;
                                    m18Var.k0 = sn2Var4;
                                    m18Var.l0 = gn2Var7;
                                    m18Var.m0 = hq5Var2;
                                    m18Var.n0 = og7VarF;
                                    m18Var.p0 = 5;
                                    og7Var = og7VarF;
                                    objG = bz7Var2.g(bz7Var2.c().a(), new j07(hq5Var2, null), m18Var);
                                    if (objG != c71Var) {
                                        bz7Var3 = bz7Var2;
                                        gn2Var9 = gn2Var8;
                                        gn2Var10 = gn2Var7;
                                        hq5Var3 = hq5Var2;
                                        objI2 = objG;
                                        bm3Var2 = og7Var;
                                        hq5Var4 = (hq5) objI2;
                                        if (hq5Var4 != null) {
                                            q51Var2 = null;
                                            og7VarG2 = w51.G(b71Var5, null, e71Var, new y9(bm3Var2, dt5Var5, q51Var2, (byte) 17), 1);
                                            if (sn2Var4 != iv1Var) {
                                                dt5 dt5Var11 = dt5Var5;
                                                n18 n18Var = new n18(sn2Var4, dt5Var11, hq5Var4, q51Var2, (byte) 1);
                                                dt5Var7 = dt5Var11;
                                                gn2Var11 = null;
                                                f(b71Var5, og7VarG2, n18Var);
                                            } else {
                                                gn2Var11 = null;
                                                dt5Var7 = dt5Var5;
                                            }
                                            if (gn2Var3 == null) {
                                                m18Var.f0 = b71Var5;
                                                m18Var.g0 = dt5Var7;
                                                m18Var.h0 = gn2Var9;
                                                m18Var.i0 = gn2Var10;
                                                m18Var.j0 = og7VarG2;
                                                m18Var.k0 = hq5Var3;
                                                m18Var.l0 = gn2Var11;
                                                m18Var.m0 = gn2Var11;
                                                m18Var.n0 = gn2Var11;
                                                m18Var.p0 = 6;
                                                objI2 = i(bz7Var3, bq5Var, m18Var);
                                                if (objI2 != c71Var) {
                                                    hq5 hq5Var8 = hq5Var3;
                                                    bm3Var4 = og7VarG2;
                                                    hq5Var6 = hq5Var8;
                                                    b71Var5 = b71Var5;
                                                    gn2Var12 = gn2Var10;
                                                    gn2Var14 = gn2Var9;
                                                    gn2Var15 = gn2Var11;
                                                    r12 = gn2Var15;
                                                    r13 = (hq5) objI2;
                                                    if (r13 != 0) {
                                                        r13.a();
                                                        f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                                                        gn2Var14.B(new z85(r13.c));
                                                        return dn8Var;
                                                    }
                                                    f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                                                    if (gn2Var12 != null) {
                                                        gn2Var12.B(new z85(hq5Var6.c));
                                                        return dn8Var;
                                                    }
                                                }
                                            } else {
                                                m18Var.f0 = bz7Var3;
                                                m18Var.g0 = b71Var5;
                                                m18Var.h0 = dt5Var7;
                                                m18Var.i0 = gn2Var9;
                                                m18Var.j0 = gn2Var3;
                                                m18Var.k0 = gn2Var10;
                                                m18Var.l0 = og7VarG2;
                                                m18Var.m0 = hq5Var3;
                                                m18Var.n0 = r26;
                                                m18Var.p0 = 7;
                                                objH2 = h(bz7Var3, bq5Var, m18Var);
                                                if (objH2 != c71Var) {
                                                    gn2 gn2Var17 = gn2Var10;
                                                    bm3Var3 = og7VarG2;
                                                    hq5Var5 = hq5Var4;
                                                    objI2 = objH2;
                                                    hq5Var6 = hq5Var3;
                                                    dt5Var8 = dt5Var7;
                                                    gn2Var12 = gn2Var17;
                                                    gn2Var13 = gn2Var9;
                                                    bz7Var4 = bz7Var3;
                                                    gn2Var16 = gn2Var11;
                                                    ki4Var2 = (ki4) objI2;
                                                    if (dh3.f(ki4Var2, ji4Var)) {
                                                        gn2Var3.B(new z85(hq5Var5.c));
                                                        m18Var.f0 = b71Var5;
                                                        m18Var.g0 = dt5Var8;
                                                        m18Var.h0 = bm3Var3;
                                                        m18Var.i0 = gn2Var16;
                                                        m18Var.j0 = gn2Var16;
                                                        m18Var.k0 = gn2Var16;
                                                        m18Var.l0 = gn2Var16;
                                                        m18Var.m0 = gn2Var16;
                                                        m18Var.n0 = gn2Var16;
                                                        m18Var.p0 = 8;
                                                        if (c(bz7Var4, m18Var) != c71Var) {
                                                            b71Var7 = b71Var5;
                                                            bm3Var5 = bm3Var3;
                                                            r14 = gn2Var16;
                                                            f(b71Var7, bm3Var5, new j18(dt5Var8, r14, (byte) 7));
                                                            return dn8Var;
                                                        }
                                                    } else {
                                                        if (ki4Var2 instanceof ii4) {
                                                            obj = ((ii4) ki4Var2).a;
                                                        } else {
                                                            if (ki4Var2 instanceof hi4) {
                                                                b61.c();
                                                                return null;
                                                            }
                                                            obj = gn2Var16;
                                                        }
                                                        dt5Var7 = dt5Var8;
                                                        bm3Var4 = bm3Var3;
                                                        gn2Var14 = gn2Var13;
                                                        r12 = gn2Var16;
                                                        r13 = obj;
                                                        if (r13 != 0) {
                                                            r13.a();
                                                            f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                                                            gn2Var14.B(new z85(r13.c));
                                                            return dn8Var;
                                                        }
                                                        f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                                                        if (gn2Var12 != null) {
                                                            gn2Var12.B(new z85(hq5Var6.c));
                                                            return dn8Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (gn2Var10 != null) {
                                            gn2Var10.B(new z85(hq5Var3.c));
                                            return dn8Var;
                                        }
                                    }
                                } else if (gn2Var7 != null) {
                                    gn2Var7.B(new z85(hq5Var2.c));
                                    return dn8Var;
                                }
                            }
                            return dn8Var;
                        }
                    } else {
                        m18Var.f0 = bz7Var5;
                        m18Var.g0 = b71Var2;
                        m18Var.h0 = dt5Var3;
                        m18Var.i0 = gn2Var4;
                        m18Var.j0 = gn2Var3;
                        m18Var.k0 = sn2Var2;
                        m18Var.l0 = gn2Var2;
                        m18Var.m0 = hq5Var;
                        m18Var.n0 = og7VarG;
                        m18Var.p0 = 3;
                        objH = h(bz7Var5, bq5Var, m18Var);
                        if (objH != c71Var) {
                            bz7Var2 = bz7Var5;
                            bm3Var = og7VarG;
                            dt5 dt5Var12 = dt5Var3;
                            b71Var3 = b71Var2;
                            objI2 = objH;
                            gn2Var5 = gn2Var2;
                            dt5Var4 = dt5Var12;
                            ki4Var = (ki4) objI2;
                            if (!dh3.f(ki4Var, ji4Var)) {
                                if (ki4Var instanceof ii4) {
                                    hq5Var2 = ((ii4) ki4Var).a;
                                } else {
                                    if (!(ki4Var instanceof hi4)) {
                                        b61.c();
                                        return null;
                                    }
                                    hq5Var2 = null;
                                }
                                gn2Var7 = gn2Var5;
                                b71Var5 = b71Var3;
                                sn2Var4 = sn2Var2;
                                dt5Var5 = dt5Var4;
                                gn2Var8 = gn2Var4;
                                if (hq5Var2 == null) {
                                    og7VarF = f(b71Var5, bm3Var, new j18(dt5Var5, null, (byte) 3));
                                } else {
                                    hq5Var2.a();
                                    og7VarF = f(b71Var5, bm3Var, new j18(dt5Var5, null, (byte) 4));
                                }
                                if (hq5Var2 != null) {
                                    if (gn2Var8 == null) {
                                        m18Var.f0 = bz7Var2;
                                        m18Var.g0 = b71Var5;
                                        m18Var.h0 = dt5Var5;
                                        m18Var.i0 = gn2Var8;
                                        m18Var.j0 = gn2Var3;
                                        m18Var.k0 = sn2Var4;
                                        m18Var.l0 = gn2Var7;
                                        m18Var.m0 = hq5Var2;
                                        m18Var.n0 = og7VarF;
                                        m18Var.p0 = 5;
                                        og7Var = og7VarF;
                                        objG = bz7Var2.g(bz7Var2.c().a(), new j07(hq5Var2, null), m18Var);
                                        if (objG != c71Var) {
                                            bz7Var3 = bz7Var2;
                                            gn2Var9 = gn2Var8;
                                            gn2Var10 = gn2Var7;
                                            hq5Var3 = hq5Var2;
                                            objI2 = objG;
                                            bm3Var2 = og7Var;
                                            hq5Var4 = (hq5) objI2;
                                            if (hq5Var4 != null) {
                                                q51Var2 = null;
                                                og7VarG2 = w51.G(b71Var5, null, e71Var, new y9(bm3Var2, dt5Var5, q51Var2, (byte) 17), 1);
                                                if (sn2Var4 != iv1Var) {
                                                    dt5 dt5Var13 = dt5Var5;
                                                    n18 n18Var2 = new n18(sn2Var4, dt5Var13, hq5Var4, q51Var2, (byte) 1);
                                                    dt5Var7 = dt5Var13;
                                                    gn2Var11 = null;
                                                    f(b71Var5, og7VarG2, n18Var2);
                                                } else {
                                                    gn2Var11 = null;
                                                    dt5Var7 = dt5Var5;
                                                }
                                                if (gn2Var3 == null) {
                                                    m18Var.f0 = b71Var5;
                                                    m18Var.g0 = dt5Var7;
                                                    m18Var.h0 = gn2Var9;
                                                    m18Var.i0 = gn2Var10;
                                                    m18Var.j0 = og7VarG2;
                                                    m18Var.k0 = hq5Var3;
                                                    m18Var.l0 = gn2Var11;
                                                    m18Var.m0 = gn2Var11;
                                                    m18Var.n0 = gn2Var11;
                                                    m18Var.p0 = 6;
                                                    objI2 = i(bz7Var3, bq5Var, m18Var);
                                                    if (objI2 != c71Var) {
                                                        hq5 hq5Var9 = hq5Var3;
                                                        bm3Var4 = og7VarG2;
                                                        hq5Var6 = hq5Var9;
                                                        b71Var5 = b71Var5;
                                                        gn2Var12 = gn2Var10;
                                                        gn2Var14 = gn2Var9;
                                                        gn2Var15 = gn2Var11;
                                                        r12 = gn2Var15;
                                                        r13 = (hq5) objI2;
                                                        if (r13 != 0) {
                                                            r13.a();
                                                            f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                                                            gn2Var14.B(new z85(r13.c));
                                                            return dn8Var;
                                                        }
                                                        f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                                                        if (gn2Var12 != null) {
                                                            gn2Var12.B(new z85(hq5Var6.c));
                                                            return dn8Var;
                                                        }
                                                    }
                                                } else {
                                                    m18Var.f0 = bz7Var3;
                                                    m18Var.g0 = b71Var5;
                                                    m18Var.h0 = dt5Var7;
                                                    m18Var.i0 = gn2Var9;
                                                    m18Var.j0 = gn2Var3;
                                                    m18Var.k0 = gn2Var10;
                                                    m18Var.l0 = og7VarG2;
                                                    m18Var.m0 = hq5Var3;
                                                    m18Var.n0 = r26;
                                                    m18Var.p0 = 7;
                                                    objH2 = h(bz7Var3, bq5Var, m18Var);
                                                    if (objH2 != c71Var) {
                                                        gn2 gn2Var18 = gn2Var10;
                                                        bm3Var3 = og7VarG2;
                                                        hq5Var5 = hq5Var4;
                                                        objI2 = objH2;
                                                        hq5Var6 = hq5Var3;
                                                        dt5Var8 = dt5Var7;
                                                        gn2Var12 = gn2Var18;
                                                        gn2Var13 = gn2Var9;
                                                        bz7Var4 = bz7Var3;
                                                        gn2Var16 = gn2Var11;
                                                        ki4Var2 = (ki4) objI2;
                                                        if (dh3.f(ki4Var2, ji4Var)) {
                                                            gn2Var3.B(new z85(hq5Var5.c));
                                                            m18Var.f0 = b71Var5;
                                                            m18Var.g0 = dt5Var8;
                                                            m18Var.h0 = bm3Var3;
                                                            m18Var.i0 = gn2Var16;
                                                            m18Var.j0 = gn2Var16;
                                                            m18Var.k0 = gn2Var16;
                                                            m18Var.l0 = gn2Var16;
                                                            m18Var.m0 = gn2Var16;
                                                            m18Var.n0 = gn2Var16;
                                                            m18Var.p0 = 8;
                                                            if (c(bz7Var4, m18Var) != c71Var) {
                                                                b71Var7 = b71Var5;
                                                                bm3Var5 = bm3Var3;
                                                                r14 = gn2Var16;
                                                                f(b71Var7, bm3Var5, new j18(dt5Var8, r14, (byte) 7));
                                                                return dn8Var;
                                                            }
                                                        } else {
                                                            if (ki4Var2 instanceof ii4) {
                                                                obj = ((ii4) ki4Var2).a;
                                                            } else {
                                                                if (ki4Var2 instanceof hi4) {
                                                                    b61.c();
                                                                    return null;
                                                                }
                                                                obj = gn2Var16;
                                                            }
                                                            dt5Var7 = dt5Var8;
                                                            bm3Var4 = bm3Var3;
                                                            gn2Var14 = gn2Var13;
                                                            r12 = gn2Var16;
                                                            r13 = obj;
                                                            if (r13 != 0) {
                                                                r13.a();
                                                                f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                                                                gn2Var14.B(new z85(r13.c));
                                                                return dn8Var;
                                                            }
                                                            f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                                                            if (gn2Var12 != null) {
                                                                gn2Var12.B(new z85(hq5Var6.c));
                                                                return dn8Var;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (gn2Var10 != null) {
                                                gn2Var10.B(new z85(hq5Var3.c));
                                                return dn8Var;
                                            }
                                        }
                                    } else if (gn2Var7 != null) {
                                        gn2Var7.B(new z85(hq5Var2.c));
                                        return dn8Var;
                                    }
                                }
                                return dn8Var;
                            }
                            gn2Var3.B(new z85(hq5Var.c));
                            m18Var.f0 = b71Var3;
                            m18Var.g0 = dt5Var4;
                            m18Var.h0 = bm3Var;
                            q51Var = null;
                            m18Var.i0 = null;
                            m18Var.j0 = null;
                            m18Var.k0 = null;
                            m18Var.l0 = null;
                            m18Var.m0 = null;
                            m18Var.n0 = null;
                            m18Var.p0 = 4;
                            if (c(bz7Var2, m18Var) != c71Var) {
                                dt5Var6 = dt5Var4;
                                b71Var6 = b71Var3;
                                f(b71Var6, bm3Var, new j18(dt5Var6, q51Var, (byte) 2));
                                return dn8Var;
                            }
                        }
                    }
                }
                return c71Var;
            case 1:
                gn2 gn2Var19 = (gn2) m18Var.l0;
                sn2 sn2Var5 = (sn2) m18Var.k0;
                gn2 gn2Var20 = (gn2) m18Var.j0;
                gn2 gn2Var21 = m18Var.i0;
                dt5 dt5Var14 = (dt5) m18Var.h0;
                b71 b71Var8 = (b71) m18Var.g0;
                bz7 bz7Var6 = (bz7) m18Var.f0;
                w39.n0(objI2);
                objB = objI2;
                gn2Var4 = gn2Var21;
                b71Var2 = b71Var8;
                b = 1;
                sn2Var2 = sn2Var5;
                dt5Var2 = dt5Var14;
                gn2Var2 = gn2Var19;
                bz7Var5 = bz7Var6;
                gn2Var3 = gn2Var20;
                r5 = 0;
                hq5 hq5Var10 = (hq5) objB;
                hq5Var10.a();
                hq5Var = hq5Var10;
                og7VarG = w51.G(b71Var2, r5, e71Var, new k18(dt5Var2, r5, b), b);
                if (sn2Var2 != iv1Var) {
                    dt5 dt5Var15 = dt5Var2;
                    dt5Var3 = dt5Var15;
                    f(b71Var2, og7VarG, new n18(sn2Var2, dt5Var15, hq5Var, r5, (byte) 0));
                } else {
                    dt5Var3 = dt5Var2;
                }
                if (gn2Var3 == null) {
                    m18Var.f0 = bz7Var5;
                    m18Var.g0 = b71Var2;
                    m18Var.h0 = dt5Var3;
                    m18Var.i0 = gn2Var4;
                    m18Var.j0 = gn2Var3;
                    m18Var.k0 = sn2Var2;
                    m18Var.l0 = gn2Var2;
                    m18Var.m0 = og7VarG;
                    m18Var.p0 = 2;
                    objI = i(bz7Var5, bq5Var, m18Var);
                    if (objI != c71Var) {
                        bz7Var2 = bz7Var5;
                        bm3Var = og7VarG;
                        sn2Var3 = sn2Var2;
                        gn2Var6 = gn2Var3;
                        b71Var4 = b71Var2;
                        objI2 = objI;
                        gn2Var7 = gn2Var2;
                        gn2Var8 = gn2Var4;
                        hq5Var2 = (hq5) objI2;
                        dt5 dt5Var16 = dt5Var3;
                        sn2Var4 = sn2Var3;
                        b71Var5 = b71Var4;
                        gn2Var3 = gn2Var6;
                        dt5Var5 = dt5Var16;
                        if (hq5Var2 == null) {
                            og7VarF = f(b71Var5, bm3Var, new j18(dt5Var5, null, (byte) 3));
                        } else {
                            hq5Var2.a();
                            og7VarF = f(b71Var5, bm3Var, new j18(dt5Var5, null, (byte) 4));
                        }
                        if (hq5Var2 != null) {
                            if (gn2Var8 == null) {
                                m18Var.f0 = bz7Var2;
                                m18Var.g0 = b71Var5;
                                m18Var.h0 = dt5Var5;
                                m18Var.i0 = gn2Var8;
                                m18Var.j0 = gn2Var3;
                                m18Var.k0 = sn2Var4;
                                m18Var.l0 = gn2Var7;
                                m18Var.m0 = hq5Var2;
                                m18Var.n0 = og7VarF;
                                m18Var.p0 = 5;
                                og7Var = og7VarF;
                                objG = bz7Var2.g(bz7Var2.c().a(), new j07(hq5Var2, null), m18Var);
                                if (objG != c71Var) {
                                    bz7Var3 = bz7Var2;
                                    gn2Var9 = gn2Var8;
                                    gn2Var10 = gn2Var7;
                                    hq5Var3 = hq5Var2;
                                    objI2 = objG;
                                    bm3Var2 = og7Var;
                                    hq5Var4 = (hq5) objI2;
                                    if (hq5Var4 != null) {
                                        q51Var2 = null;
                                        og7VarG2 = w51.G(b71Var5, null, e71Var, new y9(bm3Var2, dt5Var5, q51Var2, (byte) 17), 1);
                                        if (sn2Var4 != iv1Var) {
                                            dt5 dt5Var17 = dt5Var5;
                                            n18 n18Var3 = new n18(sn2Var4, dt5Var17, hq5Var4, q51Var2, (byte) 1);
                                            dt5Var7 = dt5Var17;
                                            gn2Var11 = null;
                                            f(b71Var5, og7VarG2, n18Var3);
                                        } else {
                                            gn2Var11 = null;
                                            dt5Var7 = dt5Var5;
                                        }
                                        if (gn2Var3 == null) {
                                            m18Var.f0 = b71Var5;
                                            m18Var.g0 = dt5Var7;
                                            m18Var.h0 = gn2Var9;
                                            m18Var.i0 = gn2Var10;
                                            m18Var.j0 = og7VarG2;
                                            m18Var.k0 = hq5Var3;
                                            m18Var.l0 = gn2Var11;
                                            m18Var.m0 = gn2Var11;
                                            m18Var.n0 = gn2Var11;
                                            m18Var.p0 = 6;
                                            objI2 = i(bz7Var3, bq5Var, m18Var);
                                            if (objI2 != c71Var) {
                                                hq5 hq5Var11 = hq5Var3;
                                                bm3Var4 = og7VarG2;
                                                hq5Var6 = hq5Var11;
                                                b71Var5 = b71Var5;
                                                gn2Var12 = gn2Var10;
                                                gn2Var14 = gn2Var9;
                                                gn2Var15 = gn2Var11;
                                                r12 = gn2Var15;
                                                r13 = (hq5) objI2;
                                                if (r13 != 0) {
                                                    r13.a();
                                                    f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                                                    gn2Var14.B(new z85(r13.c));
                                                    return dn8Var;
                                                }
                                                f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                                                if (gn2Var12 != null) {
                                                    gn2Var12.B(new z85(hq5Var6.c));
                                                    return dn8Var;
                                                }
                                            }
                                        } else {
                                            m18Var.f0 = bz7Var3;
                                            m18Var.g0 = b71Var5;
                                            m18Var.h0 = dt5Var7;
                                            m18Var.i0 = gn2Var9;
                                            m18Var.j0 = gn2Var3;
                                            m18Var.k0 = gn2Var10;
                                            m18Var.l0 = og7VarG2;
                                            m18Var.m0 = hq5Var3;
                                            m18Var.n0 = r26;
                                            m18Var.p0 = 7;
                                            objH2 = h(bz7Var3, bq5Var, m18Var);
                                            if (objH2 != c71Var) {
                                                gn2 gn2Var110 = gn2Var10;
                                                bm3Var3 = og7VarG2;
                                                hq5Var5 = hq5Var4;
                                                objI2 = objH2;
                                                hq5Var6 = hq5Var3;
                                                dt5Var8 = dt5Var7;
                                                gn2Var12 = gn2Var110;
                                                gn2Var13 = gn2Var9;
                                                bz7Var4 = bz7Var3;
                                                gn2Var16 = gn2Var11;
                                                ki4Var2 = (ki4) objI2;
                                                if (dh3.f(ki4Var2, ji4Var)) {
                                                    gn2Var3.B(new z85(hq5Var5.c));
                                                    m18Var.f0 = b71Var5;
                                                    m18Var.g0 = dt5Var8;
                                                    m18Var.h0 = bm3Var3;
                                                    m18Var.i0 = gn2Var16;
                                                    m18Var.j0 = gn2Var16;
                                                    m18Var.k0 = gn2Var16;
                                                    m18Var.l0 = gn2Var16;
                                                    m18Var.m0 = gn2Var16;
                                                    m18Var.n0 = gn2Var16;
                                                    m18Var.p0 = 8;
                                                    if (c(bz7Var4, m18Var) != c71Var) {
                                                        b71Var7 = b71Var5;
                                                        bm3Var5 = bm3Var3;
                                                        r14 = gn2Var16;
                                                        f(b71Var7, bm3Var5, new j18(dt5Var8, r14, (byte) 7));
                                                        return dn8Var;
                                                    }
                                                } else {
                                                    if (ki4Var2 instanceof ii4) {
                                                        obj = ((ii4) ki4Var2).a;
                                                    } else {
                                                        if (ki4Var2 instanceof hi4) {
                                                            b61.c();
                                                            return null;
                                                        }
                                                        obj = gn2Var16;
                                                    }
                                                    dt5Var7 = dt5Var8;
                                                    bm3Var4 = bm3Var3;
                                                    gn2Var14 = gn2Var13;
                                                    r12 = gn2Var16;
                                                    r13 = obj;
                                                    if (r13 != 0) {
                                                        r13.a();
                                                        f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                                                        gn2Var14.B(new z85(r13.c));
                                                        return dn8Var;
                                                    }
                                                    f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                                                    if (gn2Var12 != null) {
                                                        gn2Var12.B(new z85(hq5Var6.c));
                                                        return dn8Var;
                                                    }
                                                }
                                            }
                                        }
                                    } else if (gn2Var10 != null) {
                                        gn2Var10.B(new z85(hq5Var3.c));
                                        return dn8Var;
                                    }
                                }
                            } else if (gn2Var7 != null) {
                                gn2Var7.B(new z85(hq5Var2.c));
                                return dn8Var;
                            }
                        }
                        return dn8Var;
                    }
                } else {
                    m18Var.f0 = bz7Var5;
                    m18Var.g0 = b71Var2;
                    m18Var.h0 = dt5Var3;
                    m18Var.i0 = gn2Var4;
                    m18Var.j0 = gn2Var3;
                    m18Var.k0 = sn2Var2;
                    m18Var.l0 = gn2Var2;
                    m18Var.m0 = hq5Var;
                    m18Var.n0 = og7VarG;
                    m18Var.p0 = 3;
                    objH = h(bz7Var5, bq5Var, m18Var);
                    if (objH != c71Var) {
                        bz7Var2 = bz7Var5;
                        bm3Var = og7VarG;
                        dt5 dt5Var18 = dt5Var3;
                        b71Var3 = b71Var2;
                        objI2 = objH;
                        gn2Var5 = gn2Var2;
                        dt5Var4 = dt5Var18;
                        ki4Var = (ki4) objI2;
                        if (!dh3.f(ki4Var, ji4Var)) {
                            if (ki4Var instanceof ii4) {
                                hq5Var2 = ((ii4) ki4Var).a;
                            } else {
                                if (!(ki4Var instanceof hi4)) {
                                    b61.c();
                                    return null;
                                }
                                hq5Var2 = null;
                            }
                            gn2Var7 = gn2Var5;
                            b71Var5 = b71Var3;
                            sn2Var4 = sn2Var2;
                            dt5Var5 = dt5Var4;
                            gn2Var8 = gn2Var4;
                            if (hq5Var2 == null) {
                                og7VarF = f(b71Var5, bm3Var, new j18(dt5Var5, null, (byte) 3));
                            } else {
                                hq5Var2.a();
                                og7VarF = f(b71Var5, bm3Var, new j18(dt5Var5, null, (byte) 4));
                            }
                            if (hq5Var2 != null) {
                                if (gn2Var8 == null) {
                                    m18Var.f0 = bz7Var2;
                                    m18Var.g0 = b71Var5;
                                    m18Var.h0 = dt5Var5;
                                    m18Var.i0 = gn2Var8;
                                    m18Var.j0 = gn2Var3;
                                    m18Var.k0 = sn2Var4;
                                    m18Var.l0 = gn2Var7;
                                    m18Var.m0 = hq5Var2;
                                    m18Var.n0 = og7VarF;
                                    m18Var.p0 = 5;
                                    og7Var = og7VarF;
                                    objG = bz7Var2.g(bz7Var2.c().a(), new j07(hq5Var2, null), m18Var);
                                    if (objG != c71Var) {
                                        bz7Var3 = bz7Var2;
                                        gn2Var9 = gn2Var8;
                                        gn2Var10 = gn2Var7;
                                        hq5Var3 = hq5Var2;
                                        objI2 = objG;
                                        bm3Var2 = og7Var;
                                        hq5Var4 = (hq5) objI2;
                                        if (hq5Var4 != null) {
                                            q51Var2 = null;
                                            og7VarG2 = w51.G(b71Var5, null, e71Var, new y9(bm3Var2, dt5Var5, q51Var2, (byte) 17), 1);
                                            if (sn2Var4 != iv1Var) {
                                                dt5 dt5Var19 = dt5Var5;
                                                n18 n18Var4 = new n18(sn2Var4, dt5Var19, hq5Var4, q51Var2, (byte) 1);
                                                dt5Var7 = dt5Var19;
                                                gn2Var11 = null;
                                                f(b71Var5, og7VarG2, n18Var4);
                                            } else {
                                                gn2Var11 = null;
                                                dt5Var7 = dt5Var5;
                                            }
                                            if (gn2Var3 == null) {
                                                m18Var.f0 = b71Var5;
                                                m18Var.g0 = dt5Var7;
                                                m18Var.h0 = gn2Var9;
                                                m18Var.i0 = gn2Var10;
                                                m18Var.j0 = og7VarG2;
                                                m18Var.k0 = hq5Var3;
                                                m18Var.l0 = gn2Var11;
                                                m18Var.m0 = gn2Var11;
                                                m18Var.n0 = gn2Var11;
                                                m18Var.p0 = 6;
                                                objI2 = i(bz7Var3, bq5Var, m18Var);
                                                if (objI2 != c71Var) {
                                                    hq5 hq5Var12 = hq5Var3;
                                                    bm3Var4 = og7VarG2;
                                                    hq5Var6 = hq5Var12;
                                                    b71Var5 = b71Var5;
                                                    gn2Var12 = gn2Var10;
                                                    gn2Var14 = gn2Var9;
                                                    gn2Var15 = gn2Var11;
                                                    r12 = gn2Var15;
                                                    r13 = (hq5) objI2;
                                                    if (r13 != 0) {
                                                        r13.a();
                                                        f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                                                        gn2Var14.B(new z85(r13.c));
                                                        return dn8Var;
                                                    }
                                                    f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                                                    if (gn2Var12 != null) {
                                                        gn2Var12.B(new z85(hq5Var6.c));
                                                        return dn8Var;
                                                    }
                                                }
                                            } else {
                                                m18Var.f0 = bz7Var3;
                                                m18Var.g0 = b71Var5;
                                                m18Var.h0 = dt5Var7;
                                                m18Var.i0 = gn2Var9;
                                                m18Var.j0 = gn2Var3;
                                                m18Var.k0 = gn2Var10;
                                                m18Var.l0 = og7VarG2;
                                                m18Var.m0 = hq5Var3;
                                                m18Var.n0 = r26;
                                                m18Var.p0 = 7;
                                                objH2 = h(bz7Var3, bq5Var, m18Var);
                                                if (objH2 != c71Var) {
                                                    gn2 gn2Var111 = gn2Var10;
                                                    bm3Var3 = og7VarG2;
                                                    hq5Var5 = hq5Var4;
                                                    objI2 = objH2;
                                                    hq5Var6 = hq5Var3;
                                                    dt5Var8 = dt5Var7;
                                                    gn2Var12 = gn2Var111;
                                                    gn2Var13 = gn2Var9;
                                                    bz7Var4 = bz7Var3;
                                                    gn2Var16 = gn2Var11;
                                                    ki4Var2 = (ki4) objI2;
                                                    if (dh3.f(ki4Var2, ji4Var)) {
                                                        gn2Var3.B(new z85(hq5Var5.c));
                                                        m18Var.f0 = b71Var5;
                                                        m18Var.g0 = dt5Var8;
                                                        m18Var.h0 = bm3Var3;
                                                        m18Var.i0 = gn2Var16;
                                                        m18Var.j0 = gn2Var16;
                                                        m18Var.k0 = gn2Var16;
                                                        m18Var.l0 = gn2Var16;
                                                        m18Var.m0 = gn2Var16;
                                                        m18Var.n0 = gn2Var16;
                                                        m18Var.p0 = 8;
                                                        if (c(bz7Var4, m18Var) != c71Var) {
                                                            b71Var7 = b71Var5;
                                                            bm3Var5 = bm3Var3;
                                                            r14 = gn2Var16;
                                                            f(b71Var7, bm3Var5, new j18(dt5Var8, r14, (byte) 7));
                                                            return dn8Var;
                                                        }
                                                    } else {
                                                        if (ki4Var2 instanceof ii4) {
                                                            obj = ((ii4) ki4Var2).a;
                                                        } else {
                                                            if (ki4Var2 instanceof hi4) {
                                                                b61.c();
                                                                return null;
                                                            }
                                                            obj = gn2Var16;
                                                        }
                                                        dt5Var7 = dt5Var8;
                                                        bm3Var4 = bm3Var3;
                                                        gn2Var14 = gn2Var13;
                                                        r12 = gn2Var16;
                                                        r13 = obj;
                                                        if (r13 != 0) {
                                                            r13.a();
                                                            f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                                                            gn2Var14.B(new z85(r13.c));
                                                            return dn8Var;
                                                        }
                                                        f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                                                        if (gn2Var12 != null) {
                                                            gn2Var12.B(new z85(hq5Var6.c));
                                                            return dn8Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (gn2Var10 != null) {
                                            gn2Var10.B(new z85(hq5Var3.c));
                                            return dn8Var;
                                        }
                                    }
                                } else if (gn2Var7 != null) {
                                    gn2Var7.B(new z85(hq5Var2.c));
                                    return dn8Var;
                                }
                            }
                            return dn8Var;
                        }
                        gn2Var3.B(new z85(hq5Var.c));
                        m18Var.f0 = b71Var3;
                        m18Var.g0 = dt5Var4;
                        m18Var.h0 = bm3Var;
                        q51Var = null;
                        m18Var.i0 = null;
                        m18Var.j0 = null;
                        m18Var.k0 = null;
                        m18Var.l0 = null;
                        m18Var.m0 = null;
                        m18Var.n0 = null;
                        m18Var.p0 = 4;
                        if (c(bz7Var2, m18Var) != c71Var) {
                            dt5Var6 = dt5Var4;
                            b71Var6 = b71Var3;
                            f(b71Var6, bm3Var, new j18(dt5Var6, q51Var, (byte) 2));
                            return dn8Var;
                        }
                    }
                }
                return c71Var;
            case 2:
                bm3Var = (bm3) m18Var.m0;
                gn2Var7 = (gn2) m18Var.l0;
                sn2Var3 = (sn2) m18Var.k0;
                gn2Var6 = (gn2) m18Var.j0;
                gn2Var8 = m18Var.i0;
                dt5Var3 = (dt5) m18Var.h0;
                b71Var4 = (b71) m18Var.g0;
                bz7Var2 = (bz7) m18Var.f0;
                w39.n0(objI2);
                hq5Var2 = (hq5) objI2;
                dt5 dt5Var110 = dt5Var3;
                sn2Var4 = sn2Var3;
                b71Var5 = b71Var4;
                gn2Var3 = gn2Var6;
                dt5Var5 = dt5Var110;
                if (hq5Var2 == null) {
                    og7VarF = f(b71Var5, bm3Var, new j18(dt5Var5, null, (byte) 3));
                } else {
                    hq5Var2.a();
                    og7VarF = f(b71Var5, bm3Var, new j18(dt5Var5, null, (byte) 4));
                }
                if (hq5Var2 != null) {
                    if (gn2Var8 == null) {
                        m18Var.f0 = bz7Var2;
                        m18Var.g0 = b71Var5;
                        m18Var.h0 = dt5Var5;
                        m18Var.i0 = gn2Var8;
                        m18Var.j0 = gn2Var3;
                        m18Var.k0 = sn2Var4;
                        m18Var.l0 = gn2Var7;
                        m18Var.m0 = hq5Var2;
                        m18Var.n0 = og7VarF;
                        m18Var.p0 = 5;
                        og7Var = og7VarF;
                        objG = bz7Var2.g(bz7Var2.c().a(), new j07(hq5Var2, null), m18Var);
                        if (objG != c71Var) {
                            bz7Var3 = bz7Var2;
                            gn2Var9 = gn2Var8;
                            gn2Var10 = gn2Var7;
                            hq5Var3 = hq5Var2;
                            objI2 = objG;
                            bm3Var2 = og7Var;
                            hq5Var4 = (hq5) objI2;
                            if (hq5Var4 != null) {
                                q51Var2 = null;
                                og7VarG2 = w51.G(b71Var5, null, e71Var, new y9(bm3Var2, dt5Var5, q51Var2, (byte) 17), 1);
                                if (sn2Var4 != iv1Var) {
                                    dt5 dt5Var111 = dt5Var5;
                                    n18 n18Var5 = new n18(sn2Var4, dt5Var111, hq5Var4, q51Var2, (byte) 1);
                                    dt5Var7 = dt5Var111;
                                    gn2Var11 = null;
                                    f(b71Var5, og7VarG2, n18Var5);
                                } else {
                                    gn2Var11 = null;
                                    dt5Var7 = dt5Var5;
                                }
                                if (gn2Var3 == null) {
                                    m18Var.f0 = b71Var5;
                                    m18Var.g0 = dt5Var7;
                                    m18Var.h0 = gn2Var9;
                                    m18Var.i0 = gn2Var10;
                                    m18Var.j0 = og7VarG2;
                                    m18Var.k0 = hq5Var3;
                                    m18Var.l0 = gn2Var11;
                                    m18Var.m0 = gn2Var11;
                                    m18Var.n0 = gn2Var11;
                                    m18Var.p0 = 6;
                                    objI2 = i(bz7Var3, bq5Var, m18Var);
                                    if (objI2 != c71Var) {
                                        hq5 hq5Var13 = hq5Var3;
                                        bm3Var4 = og7VarG2;
                                        hq5Var6 = hq5Var13;
                                        b71Var5 = b71Var5;
                                        gn2Var12 = gn2Var10;
                                        gn2Var14 = gn2Var9;
                                        gn2Var15 = gn2Var11;
                                        r12 = gn2Var15;
                                        r13 = (hq5) objI2;
                                        if (r13 != 0) {
                                            r13.a();
                                            f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                                            gn2Var14.B(new z85(r13.c));
                                            return dn8Var;
                                        }
                                        f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                                        if (gn2Var12 != null) {
                                            gn2Var12.B(new z85(hq5Var6.c));
                                            return dn8Var;
                                        }
                                    }
                                } else {
                                    m18Var.f0 = bz7Var3;
                                    m18Var.g0 = b71Var5;
                                    m18Var.h0 = dt5Var7;
                                    m18Var.i0 = gn2Var9;
                                    m18Var.j0 = gn2Var3;
                                    m18Var.k0 = gn2Var10;
                                    m18Var.l0 = og7VarG2;
                                    m18Var.m0 = hq5Var3;
                                    m18Var.n0 = r26;
                                    m18Var.p0 = 7;
                                    objH2 = h(bz7Var3, bq5Var, m18Var);
                                    if (objH2 != c71Var) {
                                        gn2 gn2Var112 = gn2Var10;
                                        bm3Var3 = og7VarG2;
                                        hq5Var5 = hq5Var4;
                                        objI2 = objH2;
                                        hq5Var6 = hq5Var3;
                                        dt5Var8 = dt5Var7;
                                        gn2Var12 = gn2Var112;
                                        gn2Var13 = gn2Var9;
                                        bz7Var4 = bz7Var3;
                                        gn2Var16 = gn2Var11;
                                        ki4Var2 = (ki4) objI2;
                                        if (dh3.f(ki4Var2, ji4Var)) {
                                            gn2Var3.B(new z85(hq5Var5.c));
                                            m18Var.f0 = b71Var5;
                                            m18Var.g0 = dt5Var8;
                                            m18Var.h0 = bm3Var3;
                                            m18Var.i0 = gn2Var16;
                                            m18Var.j0 = gn2Var16;
                                            m18Var.k0 = gn2Var16;
                                            m18Var.l0 = gn2Var16;
                                            m18Var.m0 = gn2Var16;
                                            m18Var.n0 = gn2Var16;
                                            m18Var.p0 = 8;
                                            if (c(bz7Var4, m18Var) != c71Var) {
                                                b71Var7 = b71Var5;
                                                bm3Var5 = bm3Var3;
                                                r14 = gn2Var16;
                                                f(b71Var7, bm3Var5, new j18(dt5Var8, r14, (byte) 7));
                                                return dn8Var;
                                            }
                                        } else {
                                            if (ki4Var2 instanceof ii4) {
                                                obj = ((ii4) ki4Var2).a;
                                            } else {
                                                if (ki4Var2 instanceof hi4) {
                                                    b61.c();
                                                    return null;
                                                }
                                                obj = gn2Var16;
                                            }
                                            dt5Var7 = dt5Var8;
                                            bm3Var4 = bm3Var3;
                                            gn2Var14 = gn2Var13;
                                            r12 = gn2Var16;
                                            r13 = obj;
                                            if (r13 != 0) {
                                                r13.a();
                                                f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                                                gn2Var14.B(new z85(r13.c));
                                                return dn8Var;
                                            }
                                            f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                                            if (gn2Var12 != null) {
                                                gn2Var12.B(new z85(hq5Var6.c));
                                                return dn8Var;
                                            }
                                        }
                                    }
                                }
                            } else if (gn2Var10 != null) {
                                gn2Var10.B(new z85(hq5Var3.c));
                                return dn8Var;
                            }
                        }
                        return c71Var;
                    }
                    if (gn2Var7 != null) {
                        gn2Var7.B(new z85(hq5Var2.c));
                        return dn8Var;
                    }
                }
                return dn8Var;
            case 3:
                bm3Var = (bm3) m18Var.n0;
                hq5Var = (hq5) m18Var.m0;
                gn2Var5 = (gn2) m18Var.l0;
                sn2Var2 = (sn2) m18Var.k0;
                gn2Var3 = (gn2) m18Var.j0;
                gn2Var4 = m18Var.i0;
                dt5Var4 = (dt5) m18Var.h0;
                b71Var3 = (b71) m18Var.g0;
                bz7Var2 = (bz7) m18Var.f0;
                w39.n0(objI2);
                ki4Var = (ki4) objI2;
                if (!dh3.f(ki4Var, ji4Var)) {
                    if (ki4Var instanceof ii4) {
                        hq5Var2 = ((ii4) ki4Var).a;
                    } else {
                        if (!(ki4Var instanceof hi4)) {
                            b61.c();
                            return null;
                        }
                        hq5Var2 = null;
                    }
                    gn2Var7 = gn2Var5;
                    b71Var5 = b71Var3;
                    sn2Var4 = sn2Var2;
                    dt5Var5 = dt5Var4;
                    gn2Var8 = gn2Var4;
                    if (hq5Var2 == null) {
                        og7VarF = f(b71Var5, bm3Var, new j18(dt5Var5, null, (byte) 3));
                    } else {
                        hq5Var2.a();
                        og7VarF = f(b71Var5, bm3Var, new j18(dt5Var5, null, (byte) 4));
                    }
                    if (hq5Var2 != null) {
                        if (gn2Var8 == null) {
                            m18Var.f0 = bz7Var2;
                            m18Var.g0 = b71Var5;
                            m18Var.h0 = dt5Var5;
                            m18Var.i0 = gn2Var8;
                            m18Var.j0 = gn2Var3;
                            m18Var.k0 = sn2Var4;
                            m18Var.l0 = gn2Var7;
                            m18Var.m0 = hq5Var2;
                            m18Var.n0 = og7VarF;
                            m18Var.p0 = 5;
                            og7Var = og7VarF;
                            objG = bz7Var2.g(bz7Var2.c().a(), new j07(hq5Var2, null), m18Var);
                            if (objG != c71Var) {
                                bz7Var3 = bz7Var2;
                                gn2Var9 = gn2Var8;
                                gn2Var10 = gn2Var7;
                                hq5Var3 = hq5Var2;
                                objI2 = objG;
                                bm3Var2 = og7Var;
                                hq5Var4 = (hq5) objI2;
                                if (hq5Var4 != null) {
                                    q51Var2 = null;
                                    og7VarG2 = w51.G(b71Var5, null, e71Var, new y9(bm3Var2, dt5Var5, q51Var2, (byte) 17), 1);
                                    if (sn2Var4 != iv1Var) {
                                        dt5 dt5Var112 = dt5Var5;
                                        n18 n18Var6 = new n18(sn2Var4, dt5Var112, hq5Var4, q51Var2, (byte) 1);
                                        dt5Var7 = dt5Var112;
                                        gn2Var11 = null;
                                        f(b71Var5, og7VarG2, n18Var6);
                                    } else {
                                        gn2Var11 = null;
                                        dt5Var7 = dt5Var5;
                                    }
                                    if (gn2Var3 == null) {
                                        m18Var.f0 = b71Var5;
                                        m18Var.g0 = dt5Var7;
                                        m18Var.h0 = gn2Var9;
                                        m18Var.i0 = gn2Var10;
                                        m18Var.j0 = og7VarG2;
                                        m18Var.k0 = hq5Var3;
                                        m18Var.l0 = gn2Var11;
                                        m18Var.m0 = gn2Var11;
                                        m18Var.n0 = gn2Var11;
                                        m18Var.p0 = 6;
                                        objI2 = i(bz7Var3, bq5Var, m18Var);
                                        if (objI2 != c71Var) {
                                            hq5 hq5Var14 = hq5Var3;
                                            bm3Var4 = og7VarG2;
                                            hq5Var6 = hq5Var14;
                                            b71Var5 = b71Var5;
                                            gn2Var12 = gn2Var10;
                                            gn2Var14 = gn2Var9;
                                            gn2Var15 = gn2Var11;
                                            r12 = gn2Var15;
                                            r13 = (hq5) objI2;
                                            if (r13 != 0) {
                                                r13.a();
                                                f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                                                gn2Var14.B(new z85(r13.c));
                                                return dn8Var;
                                            }
                                            f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                                            if (gn2Var12 != null) {
                                                gn2Var12.B(new z85(hq5Var6.c));
                                                return dn8Var;
                                            }
                                        }
                                    } else {
                                        m18Var.f0 = bz7Var3;
                                        m18Var.g0 = b71Var5;
                                        m18Var.h0 = dt5Var7;
                                        m18Var.i0 = gn2Var9;
                                        m18Var.j0 = gn2Var3;
                                        m18Var.k0 = gn2Var10;
                                        m18Var.l0 = og7VarG2;
                                        m18Var.m0 = hq5Var3;
                                        m18Var.n0 = r26;
                                        m18Var.p0 = 7;
                                        objH2 = h(bz7Var3, bq5Var, m18Var);
                                        if (objH2 != c71Var) {
                                            gn2 gn2Var113 = gn2Var10;
                                            bm3Var3 = og7VarG2;
                                            hq5Var5 = hq5Var4;
                                            objI2 = objH2;
                                            hq5Var6 = hq5Var3;
                                            dt5Var8 = dt5Var7;
                                            gn2Var12 = gn2Var113;
                                            gn2Var13 = gn2Var9;
                                            bz7Var4 = bz7Var3;
                                            gn2Var16 = gn2Var11;
                                            ki4Var2 = (ki4) objI2;
                                            if (dh3.f(ki4Var2, ji4Var)) {
                                                gn2Var3.B(new z85(hq5Var5.c));
                                                m18Var.f0 = b71Var5;
                                                m18Var.g0 = dt5Var8;
                                                m18Var.h0 = bm3Var3;
                                                m18Var.i0 = gn2Var16;
                                                m18Var.j0 = gn2Var16;
                                                m18Var.k0 = gn2Var16;
                                                m18Var.l0 = gn2Var16;
                                                m18Var.m0 = gn2Var16;
                                                m18Var.n0 = gn2Var16;
                                                m18Var.p0 = 8;
                                                if (c(bz7Var4, m18Var) != c71Var) {
                                                    b71Var7 = b71Var5;
                                                    bm3Var5 = bm3Var3;
                                                    r14 = gn2Var16;
                                                    f(b71Var7, bm3Var5, new j18(dt5Var8, r14, (byte) 7));
                                                    return dn8Var;
                                                }
                                            } else {
                                                if (ki4Var2 instanceof ii4) {
                                                    obj = ((ii4) ki4Var2).a;
                                                } else {
                                                    if (ki4Var2 instanceof hi4) {
                                                        b61.c();
                                                        return null;
                                                    }
                                                    obj = gn2Var16;
                                                }
                                                dt5Var7 = dt5Var8;
                                                bm3Var4 = bm3Var3;
                                                gn2Var14 = gn2Var13;
                                                r12 = gn2Var16;
                                                r13 = obj;
                                                if (r13 != 0) {
                                                    r13.a();
                                                    f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                                                    gn2Var14.B(new z85(r13.c));
                                                    return dn8Var;
                                                }
                                                f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                                                if (gn2Var12 != null) {
                                                    gn2Var12.B(new z85(hq5Var6.c));
                                                    return dn8Var;
                                                }
                                            }
                                        }
                                    }
                                } else if (gn2Var10 != null) {
                                    gn2Var10.B(new z85(hq5Var3.c));
                                    return dn8Var;
                                }
                            }
                        } else if (gn2Var7 != null) {
                            gn2Var7.B(new z85(hq5Var2.c));
                            return dn8Var;
                        }
                    }
                    return dn8Var;
                }
                gn2Var3.B(new z85(hq5Var.c));
                m18Var.f0 = b71Var3;
                m18Var.g0 = dt5Var4;
                m18Var.h0 = bm3Var;
                q51Var = null;
                m18Var.i0 = null;
                m18Var.j0 = null;
                m18Var.k0 = null;
                m18Var.l0 = null;
                m18Var.m0 = null;
                m18Var.n0 = null;
                m18Var.p0 = 4;
                if (c(bz7Var2, m18Var) != c71Var) {
                    dt5Var6 = dt5Var4;
                    b71Var6 = b71Var3;
                    f(b71Var6, bm3Var, new j18(dt5Var6, q51Var, (byte) 2));
                    return dn8Var;
                }
                return c71Var;
            case 4:
                bm3Var = (bm3) m18Var.h0;
                dt5Var6 = (dt5) m18Var.g0;
                b71Var6 = (b71) m18Var.f0;
                w39.n0(objI2);
                q51Var = null;
                f(b71Var6, bm3Var, new j18(dt5Var6, q51Var, (byte) 2));
                return dn8Var;
            case 5:
                bm3Var2 = (bm3) m18Var.n0;
                hq5Var3 = (hq5) m18Var.m0;
                gn2Var10 = (gn2) m18Var.l0;
                sn2Var4 = (sn2) m18Var.k0;
                gn2 gn2Var22 = (gn2) m18Var.j0;
                gn2 gn2Var23 = m18Var.i0;
                dt5Var5 = (dt5) m18Var.h0;
                b71 b71Var9 = (b71) m18Var.g0;
                bz7Var3 = (bz7) m18Var.f0;
                w39.n0(objI2);
                gn2Var9 = gn2Var23;
                b71Var5 = b71Var9;
                gn2Var3 = gn2Var22;
                bq5Var = bq5Var;
                ji4Var = ji4Var;
                hq5Var4 = (hq5) objI2;
                if (hq5Var4 != null) {
                    q51Var2 = null;
                    og7VarG2 = w51.G(b71Var5, null, e71Var, new y9(bm3Var2, dt5Var5, q51Var2, (byte) 17), 1);
                    if (sn2Var4 != iv1Var) {
                        dt5 dt5Var113 = dt5Var5;
                        n18 n18Var7 = new n18(sn2Var4, dt5Var113, hq5Var4, q51Var2, (byte) 1);
                        dt5Var7 = dt5Var113;
                        gn2Var11 = null;
                        f(b71Var5, og7VarG2, n18Var7);
                    } else {
                        gn2Var11 = null;
                        dt5Var7 = dt5Var5;
                    }
                    if (gn2Var3 == null) {
                        m18Var.f0 = b71Var5;
                        m18Var.g0 = dt5Var7;
                        m18Var.h0 = gn2Var9;
                        m18Var.i0 = gn2Var10;
                        m18Var.j0 = og7VarG2;
                        m18Var.k0 = hq5Var3;
                        m18Var.l0 = gn2Var11;
                        m18Var.m0 = gn2Var11;
                        m18Var.n0 = gn2Var11;
                        m18Var.p0 = 6;
                        objI2 = i(bz7Var3, bq5Var, m18Var);
                        if (objI2 != c71Var) {
                            hq5 hq5Var15 = hq5Var3;
                            bm3Var4 = og7VarG2;
                            hq5Var6 = hq5Var15;
                            b71Var5 = b71Var5;
                            gn2Var12 = gn2Var10;
                            gn2Var14 = gn2Var9;
                            gn2Var15 = gn2Var11;
                            r12 = gn2Var15;
                            r13 = (hq5) objI2;
                            if (r13 != 0) {
                                r13.a();
                                f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                                gn2Var14.B(new z85(r13.c));
                                return dn8Var;
                            }
                            f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                            if (gn2Var12 != null) {
                                gn2Var12.B(new z85(hq5Var6.c));
                                return dn8Var;
                            }
                        }
                    } else {
                        m18Var.f0 = bz7Var3;
                        m18Var.g0 = b71Var5;
                        m18Var.h0 = dt5Var7;
                        m18Var.i0 = gn2Var9;
                        m18Var.j0 = gn2Var3;
                        m18Var.k0 = gn2Var10;
                        m18Var.l0 = og7VarG2;
                        m18Var.m0 = hq5Var3;
                        m18Var.n0 = r26;
                        m18Var.p0 = 7;
                        objH2 = h(bz7Var3, bq5Var, m18Var);
                        if (objH2 != c71Var) {
                            gn2 gn2Var114 = gn2Var10;
                            bm3Var3 = og7VarG2;
                            hq5Var5 = hq5Var4;
                            objI2 = objH2;
                            hq5Var6 = hq5Var3;
                            dt5Var8 = dt5Var7;
                            gn2Var12 = gn2Var114;
                            gn2Var13 = gn2Var9;
                            bz7Var4 = bz7Var3;
                            gn2Var16 = gn2Var11;
                            ki4Var2 = (ki4) objI2;
                            if (dh3.f(ki4Var2, ji4Var)) {
                                gn2Var3.B(new z85(hq5Var5.c));
                                m18Var.f0 = b71Var5;
                                m18Var.g0 = dt5Var8;
                                m18Var.h0 = bm3Var3;
                                m18Var.i0 = gn2Var16;
                                m18Var.j0 = gn2Var16;
                                m18Var.k0 = gn2Var16;
                                m18Var.l0 = gn2Var16;
                                m18Var.m0 = gn2Var16;
                                m18Var.n0 = gn2Var16;
                                m18Var.p0 = 8;
                                if (c(bz7Var4, m18Var) != c71Var) {
                                    b71Var7 = b71Var5;
                                    bm3Var5 = bm3Var3;
                                    r14 = gn2Var16;
                                    f(b71Var7, bm3Var5, new j18(dt5Var8, r14, (byte) 7));
                                    return dn8Var;
                                }
                            } else {
                                if (ki4Var2 instanceof ii4) {
                                    obj = ((ii4) ki4Var2).a;
                                } else {
                                    if (ki4Var2 instanceof hi4) {
                                        b61.c();
                                        return null;
                                    }
                                    obj = gn2Var16;
                                }
                                dt5Var7 = dt5Var8;
                                bm3Var4 = bm3Var3;
                                gn2Var14 = gn2Var13;
                                r12 = gn2Var16;
                                r13 = obj;
                                if (r13 != 0) {
                                    r13.a();
                                    f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                                    gn2Var14.B(new z85(r13.c));
                                    return dn8Var;
                                }
                                f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                                if (gn2Var12 != null) {
                                    gn2Var12.B(new z85(hq5Var6.c));
                                    return dn8Var;
                                }
                            }
                        }
                    }
                    return c71Var;
                }
                if (gn2Var10 != null) {
                    gn2Var10.B(new z85(hq5Var3.c));
                    return dn8Var;
                }
                return dn8Var;
            case 6:
                hq5Var6 = (hq5) m18Var.k0;
                bm3Var4 = (bm3) m18Var.j0;
                gn2Var12 = m18Var.i0;
                gn2Var14 = (gn2) m18Var.h0;
                dt5Var7 = (dt5) m18Var.g0;
                b71Var5 = (b71) m18Var.f0;
                w39.n0(objI2);
                gn2Var15 = null;
                r12 = gn2Var15;
                r13 = (hq5) objI2;
                if (r13 != 0) {
                    r13.a();
                    f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                    gn2Var14.B(new z85(r13.c));
                    return dn8Var;
                }
                f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                if (gn2Var12 != null) {
                    gn2Var12.B(new z85(hq5Var6.c));
                    return dn8Var;
                }
                return dn8Var;
            case 7:
                hq5Var5 = (hq5) m18Var.n0;
                hq5 hq5Var16 = (hq5) m18Var.m0;
                bm3Var3 = (bm3) m18Var.l0;
                gn2Var12 = (gn2) m18Var.k0;
                gn2Var3 = (gn2) m18Var.j0;
                gn2Var13 = m18Var.i0;
                dt5 dt5Var20 = (dt5) m18Var.h0;
                b71 b71Var10 = (b71) m18Var.g0;
                bz7Var4 = (bz7) m18Var.f0;
                w39.n0(objI2);
                hq5Var6 = hq5Var16;
                dt5Var8 = dt5Var20;
                b71Var5 = b71Var10;
                ji4Var = ji4Var;
                gn2Var16 = null;
                ki4Var2 = (ki4) objI2;
                if (dh3.f(ki4Var2, ji4Var)) {
                    gn2Var3.B(new z85(hq5Var5.c));
                    m18Var.f0 = b71Var5;
                    m18Var.g0 = dt5Var8;
                    m18Var.h0 = bm3Var3;
                    m18Var.i0 = gn2Var16;
                    m18Var.j0 = gn2Var16;
                    m18Var.k0 = gn2Var16;
                    m18Var.l0 = gn2Var16;
                    m18Var.m0 = gn2Var16;
                    m18Var.n0 = gn2Var16;
                    m18Var.p0 = 8;
                    if (c(bz7Var4, m18Var) != c71Var) {
                        b71Var7 = b71Var5;
                        bm3Var5 = bm3Var3;
                        r14 = gn2Var16;
                        f(b71Var7, bm3Var5, new j18(dt5Var8, r14, (byte) 7));
                        return dn8Var;
                    }
                    return c71Var;
                }
                if (ki4Var2 instanceof ii4) {
                    obj = ((ii4) ki4Var2).a;
                } else {
                    if (ki4Var2 instanceof hi4) {
                        b61.c();
                        return null;
                    }
                    obj = gn2Var16;
                }
                dt5Var7 = dt5Var8;
                bm3Var4 = bm3Var3;
                gn2Var14 = gn2Var13;
                r12 = gn2Var16;
                r13 = obj;
                if (r13 != 0) {
                    r13.a();
                    f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 5));
                    gn2Var14.B(new z85(r13.c));
                    return dn8Var;
                }
                f(b71Var5, bm3Var4, new j18(dt5Var7, r12, (byte) 6));
                if (gn2Var12 != null) {
                    gn2Var12.B(new z85(hq5Var6.c));
                    return dn8Var;
                }
                return dn8Var;
            case 8:
                bm3Var5 = (bm3) m18Var.h0;
                dt5Var8 = (dt5) m18Var.g0;
                b71Var7 = (b71) m18Var.f0;
                w39.n0(objI2);
                r14 = 0;
                f(b71Var7, bm3Var5, new j18(dt5Var8, r14, (byte) 7));
                return dn8Var;
            default:
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(bz7 bz7Var, bq5 bq5Var, s51 s51Var) throws Throwable {
        o18 o18Var;
        ea6 ea6Var;
        if (s51Var instanceof o18) {
            o18Var = (o18) s51Var;
            int i = o18Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o18Var.h0 = i - Integer.MIN_VALUE;
            } else {
                o18Var = new o18(s51Var);
            }
        } else {
            o18Var = new o18(s51Var);
        }
        Object obj = o18Var.g0;
        int i2 = o18Var.h0;
        q51 q51Var = null;
        byte b = 1;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                ea6 ea6Var2 = new ea6();
                ea6Var2.X = hi4.a;
                long jB = bz7Var.c().b();
                rn2 ij2Var = new ij2(bq5Var, ea6Var2, q51Var, b);
                o18Var.f0 = ea6Var2;
                o18Var.h0 = 1;
                Object objD = bz7Var.d(jB, ij2Var, o18Var);
                Object obj2 = c71.X;
                if (objD == obj2) {
                    return obj2;
                }
                ea6Var = ea6Var2;
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ea6Var = o18Var.f0;
                w39.n0(obj);
            }
            return ea6Var.X;
        } catch (cq5 unused) {
            return ji4.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd A[LOOP:1: B:23:0x006e->B:44:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object i(defpackage.bz7 r17, defpackage.bq5 r18, defpackage.r10 r19) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q18.i(bz7, bq5, r10):java.lang.Object");
    }
}
