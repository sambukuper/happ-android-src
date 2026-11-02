package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qu1 {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[LOOP:0: B:23:0x0067->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007f A[EDGE_INSN: B:54:0x007f->B:29:0x007f BREAK  A[LOOP:0: B:23:0x0067->B:27:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:22:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.bz7 r12, long r13, defpackage.s51 r15) {
        /*
            boolean r0 = r15 instanceof defpackage.ju1
            if (r0 == 0) goto L13
            r0 = r15
            ju1 r0 = (defpackage.ju1) r0
            int r1 = r0.i0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i0 = r1
            goto L18
        L13:
            ju1 r0 = new ju1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.h0
            int r1 = r0.i0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2d
            da6 r12 = r0.g0
            bz7 r13 = r0.f0
            defpackage.w39.n0(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5d
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r12)
            return r3
        L33:
            defpackage.w39.n0(r15)
            cz7 r15 = r12.g0
            aq5 r15 = r15.u0
            boolean r15 = f(r15, r13)
            if (r15 == 0) goto L42
            goto Lc2
        L42:
            da6 r15 = new da6
            r15.<init>()
            r15.X = r13
        L49:
            r0.f0 = r12
            r0.g0 = r15
            r0.i0 = r2
            bq5 r13 = defpackage.bq5.Y
            java.lang.Object r13 = r12.a(r13, r0)
            c71 r14 = defpackage.c71.X
            if (r13 != r14) goto L5a
            return r14
        L5a:
            r11 = r15
            r15 = r13
            r13 = r11
        L5d:
            aq5 r15 = (defpackage.aq5) r15
            java.util.List r14 = r15.a
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L67:
            if (r5 >= r1) goto L7e
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            hq5 r7 = (defpackage.hq5) r7
            long r7 = r7.a
            long r9 = r13.X
            boolean r7 = defpackage.jm4.w(r7, r9)
            if (r7 == 0) goto L7b
            goto L7f
        L7b:
            int r5 = r5 + 1
            goto L67
        L7e:
            r6 = r3
        L7f:
            hq5 r6 = (defpackage.hq5) r6
            if (r6 != 0) goto L85
            r6 = r3
            goto Lb9
        L85:
            boolean r14 = defpackage.vr3.m(r6)
            if (r14 == 0) goto Lad
            java.util.List r14 = r15.a
            int r15 = r14.size()
        L91:
            if (r4 >= r15) goto La2
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            hq5 r5 = (defpackage.hq5) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L9f
            goto La3
        L9f:
            int r4 = r4 + 1
            goto L91
        La2:
            r1 = r3
        La3:
            hq5 r1 = (defpackage.hq5) r1
            if (r1 != 0) goto La8
            goto Lb9
        La8:
            long r14 = r1.a
            r13.X = r14
            goto Lc3
        Lad:
            long r14 = defpackage.vr3.S(r6, r2)
            r4 = 0
            boolean r14 = defpackage.z85.b(r14, r4)
            if (r14 != 0) goto Lc3
        Lb9:
            if (r6 == 0) goto Lc2
            boolean r12 = r6.c()
            if (r12 != 0) goto Lc2
            return r6
        Lc2:
            return r3
        Lc3:
            r15 = r13
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu1.a(bz7, long, s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [ea6] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static final Object b(bz7 bz7Var, long j, s51 s51Var) {
        ku1 ku1Var;
        Object obj;
        hq5 hq5Var;
        aa6 aa6Var;
        if (s51Var instanceof ku1) {
            ku1Var = (ku1) s51Var;
            int i = ku1Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ku1Var.j0 = i - Integer.MIN_VALUE;
            } else {
                ku1Var = new ku1(s51Var);
            }
        } else {
            ku1Var = new ku1(s51Var);
        }
        Object obj2 = ku1Var.i0;
        int i2 = ku1Var.j0;
        try {
            if (i2 == 0) {
                w39.n0(obj2);
                if (!f(bz7Var.g0.u0, j)) {
                    List list = bz7Var.g0.u0.a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i3);
                        if (jm4.w(((hq5) obj).a, j)) {
                            break;
                        }
                        i3++;
                    }
                    hq5Var = (hq5) obj;
                    if (hq5Var != null) {
                        ea6 ea6Var = new ea6();
                        ea6 ea6Var2 = new ea6();
                        ea6Var2.X = hq5Var;
                        long jB = bz7Var.c().b();
                        aa6 aa6Var2 = new aa6();
                        rn2 lu1Var = new lu1(aa6Var2, ea6Var2, ea6Var, null);
                        ku1Var.f0 = hq5Var;
                        ku1Var.g0 = ea6Var;
                        ku1Var.h0 = aa6Var2;
                        ku1Var.j0 = 1;
                        Object objD = bz7Var.d(jB, lu1Var, ku1Var);
                        Object obj3 = c71.X;
                        if (objD == obj3) {
                            return obj3;
                        }
                        aa6Var = aa6Var2;
                        j = ea6Var;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aa6Var = ku1Var.h0;
            ea6 ea6Var3 = ku1Var.g0;
            hq5Var = ku1Var.f0;
            w39.n0(obj2);
            j = ea6Var3;
            if (aa6Var.X) {
                hq5 hq5Var2 = (hq5) j.X;
                return hq5Var2 == null ? hq5Var : hq5Var2;
            }
            return null;
        } catch (cq5 unused) {
            hq5 hq5Var3 = (hq5) j.X;
            return hq5Var3 == null ? hq5Var : hq5Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cb A[LOOP:0: B:26:0x00b6->B:30:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4 A[EDGE_INSN: B:68:0x00d4->B:32:0x00d4 BREAK  A[LOOP:0: B:26:0x00b6->B:30:0x00cb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x015f -> B:62:0x0165). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.bz7 r18, long r19, defpackage.b1 r21, defpackage.r10 r22) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu1.c(bz7, long, b1, r10):java.lang.Object");
    }

    public static final Object d(mq5 mq5Var, gn2 gn2Var, dn2 dn2Var, dn2 dn2Var2, rn2 rn2Var, s51 s51Var) {
        Object objI = mb6.i(mq5Var, new nu1(new w01((byte) 22), new m30(gn2Var, (byte) 3), rn2Var, dn2Var2, new xo(dn2Var, (byte) 1), null), s51Var);
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        if (objI != c71Var) {
            objI = dn8Var;
        }
        return objI == c71Var ? objI : dn8Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(defpackage.bz7 r4, long r5, defpackage.gn2 r7, defpackage.s51 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ou1
            if (r0 == 0) goto L13
            r0 = r8
            ou1 r0 = (defpackage.ou1) r0
            int r1 = r0.i0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i0 = r1
            goto L18
        L13:
            ou1 r0 = new ou1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.h0
            int r1 = r0.i0
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            gn2 r4 = r0.g0
            bz7 r5 = r0.f0
            defpackage.w39.n0(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r4)
            r4 = 0
            return r4
        L32:
            defpackage.w39.n0(r8)
        L35:
            r0.f0 = r4
            r0.g0 = r7
            r0.i0 = r2
            java.lang.Object r8 = a(r4, r5, r0)
            c71 r5 = defpackage.c71.X
            if (r8 != r5) goto L44
            return r5
        L44:
            hq5 r8 = (defpackage.hq5) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = defpackage.vr3.m(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.B(r8)
            long r5 = r8.a
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu1.e(bz7, long, gn2, s51):java.lang.Object");
    }

    public static final boolean f(aq5 aq5Var, long j) {
        Object obj;
        List list = aq5Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (jm4.w(((hq5) obj).a, j)) {
                break;
            }
            i++;
        }
        hq5 hq5Var = (hq5) obj;
        if (hq5Var != null && hq5Var.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float g(fw8 fw8Var, int i) {
        return i == 2 ? fw8Var.f() * a : fw8Var.f();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x0453 -> B:92:0x0401). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x0491 -> B:165:0x0600). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x05ea -> B:162:0x05f1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x061a -> B:86:0x03da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x0688 -> B:179:0x0691). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x024c -> B:32:0x0250). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x02ef -> B:32:0x0250). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0347 -> B:78:0x03b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x03a1 -> B:75:0x03a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final java.lang.Object h(defpackage.bz7 r28, defpackage.hq5 r29, defpackage.w01 r30, defpackage.m30 r31, defpackage.rn2 r32, defpackage.dn2 r33, defpackage.xo r34, defpackage.r10 r35) {
        /*
            Method dump skipped, instruction units count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu1.h(bz7, hq5, w01, m30, rn2, dn2, xo, r10):java.lang.Object");
    }
}
