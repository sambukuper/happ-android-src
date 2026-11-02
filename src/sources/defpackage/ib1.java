package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ib1 implements na1 {
    public final m92 X;
    public final k71 Y;
    public final b71 Z;
    public final j31 f0;
    public int h0;
    public og7 i0;
    public final z47 k0;
    public final vz7 l0;
    public final vz7 m0;
    public final yr6 n0;
    public final q15 g0 = r15.a();
    public final jb1 j0 = new jb1();

    public ib1(m92 m92Var, List list, k71 k71Var, b71 b71Var) {
        this.X = m92Var;
        this.Y = k71Var;
        this.Z = b71Var;
        q51 q51Var = null;
        this.f0 = new j31(new bv(this, q51Var, (byte) 3), (byte) 7);
        this.k0 = new z47(this, list);
        final byte b = 0;
        this.l0 = new vz7(new dn2(this) { // from class: oa1
            public final /* synthetic */ ib1 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() throws IOException {
                byte b2 = b;
                ib1 ib1Var = this.Y;
                switch (b2) {
                    case 0:
                        m92 m92Var2 = ib1Var.X;
                        File canonicalFile = ((File) m92Var2.b.invoke()).getCanonicalFile();
                        synchronized (m92.d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = m92.c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new p92(canonicalFile, (ja7) m92Var2.a.B(canonicalFile), new o7((Object) canonicalFile, (byte) 29));
                    default:
                        return ((p92) ib1Var.l0.getValue()).b;
                }
            }
        });
        final byte b2 = 1;
        this.m0 = new vz7(new dn2(this) { // from class: oa1
            public final /* synthetic */ ib1 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() throws IOException {
                byte b3 = b2;
                ib1 ib1Var = this.Y;
                switch (b3) {
                    case 0:
                        m92 m92Var2 = ib1Var.X;
                        File canonicalFile = ((File) m92Var2.b.invoke()).getCanonicalFile();
                        synchronized (m92.d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = m92.c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new p92(canonicalFile, (ja7) m92Var2.a.B(canonicalFile), new o7((Object) canonicalFile, (byte) 29));
                    default:
                        return ((p92) ib1Var.l0.getValue()).b;
                }
            }
        });
        this.n0 = new yr6(b71Var, new y0((Object) this, (byte) 20), new dx0((byte) 26), new q0((Object) this, q51Var, (byte) 19));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(s51 s51Var) {
        wa1 wa1Var;
        q15 q15Var;
        if (s51Var instanceof wa1) {
            wa1Var = (wa1) s51Var;
            int i = wa1Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                wa1Var.i0 = i - Integer.MIN_VALUE;
            } else {
                wa1Var = new wa1(this, s51Var);
            }
        } else {
            wa1Var = new wa1(this, s51Var);
        }
        Object obj = wa1Var.g0;
        int i2 = wa1Var.i0;
        if (i2 == 0) {
            w39.n0(obj);
            q15 q15Var2 = this.g0;
            wa1Var.f0 = q15Var2;
            wa1Var.i0 = 1;
            Object objG = q15Var2.g(wa1Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
            q15Var = q15Var2;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q15Var = wa1Var.f0;
            w39.n0(obj);
        }
        try {
            int i3 = this.h0 - 1;
            this.h0 = i3;
            if (i3 == 0) {
                og7 og7Var = this.i0;
                if (og7Var != null) {
                    og7Var.m(null);
                }
                this.i0 = null;
            }
            return dn8.a;
        } finally {
            q15Var.m(null);
        }
    }

    public final ja7 b() {
        return (ja7) this.m0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(mu4 mu4Var, s51 s51Var) {
        xa1 xa1Var;
        ux0 ux0Var;
        if (s51Var instanceof xa1) {
            xa1Var = (xa1) s51Var;
            int i = xa1Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                xa1Var.i0 = i - Integer.MIN_VALUE;
            } else {
                xa1Var = new xa1(this, s51Var);
            }
        } else {
            xa1Var = new xa1(this, s51Var);
        }
        Object rj6Var = xa1Var.g0;
        int i2 = xa1Var.i0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(rj6Var);
            ux0 ux0Var2 = mu4Var.b;
            try {
                s61 s61Var = mu4Var.d;
                try {
                    s61 s61Var2 = xa1Var.Y;
                    s61Var2.getClass();
                    s61 s61VarB0 = s61Var.B0(s61Var2);
                    y9 y9Var = new y9(this, mu4Var, q51Var, (byte) 3);
                    xa1Var.f0 = ux0Var2;
                    xa1Var.i0 = 1;
                    Object objW = w51.W(s61VarB0, y9Var, xa1Var);
                    c71 c71Var = c71.X;
                    if (objW == c71Var) {
                        return c71Var;
                    }
                    rj6Var = objW;
                    ux0Var = ux0Var2;
                } catch (Throwable th) {
                    th = th;
                    ux0Var = ux0Var2;
                    rj6Var = new rj6(th);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ux0Var = xa1Var.f0;
            try {
                w39.n0(rj6Var);
            } catch (Throwable th3) {
                th = th3;
                rj6Var = new rj6(th);
            }
        }
        Throwable thA = sj6.a(rj6Var);
        if (thA == null) {
            ux0Var.V(rj6Var);
        } else {
            ux0Var.l0(thA);
        }
        return dn8.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(s51 s51Var) {
        ya1 ya1Var;
        q15 q15Var;
        if (s51Var instanceof ya1) {
            ya1Var = (ya1) s51Var;
            int i = ya1Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ya1Var.i0 = i - Integer.MIN_VALUE;
            } else {
                ya1Var = new ya1(this, s51Var);
            }
        } else {
            ya1Var = new ya1(this, s51Var);
        }
        Object obj = ya1Var.g0;
        int i2 = ya1Var.i0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(obj);
            q15 q15Var2 = this.g0;
            ya1Var.f0 = q15Var2;
            ya1Var.i0 = 1;
            Object objG = q15Var2.g(ya1Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
            q15Var = q15Var2;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q15Var = ya1Var.f0;
            w39.n0(obj);
        }
        try {
            int i3 = this.h0 + 1;
            this.h0 = i3;
            if (i3 == 1) {
                this.i0 = w51.G(this.Z, null, null, new za1(this, q51Var, (byte) 0), 3);
            }
            return dn8.a;
        } finally {
            q15Var.m(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r1.Q(r0) == r4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.s51 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ab1
            if (r0 == 0) goto L13
            r0 = r7
            ab1 r0 = (defpackage.ab1) r0
            int r1 = r0.i0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i0 = r1
            goto L18
        L13:
            ab1 r0 = new ab1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.g0
            int r1 = r0.i0
            r2 = 2
            r3 = 1
            c71 r4 = defpackage.c71.X
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            int r0 = r0.f0
            defpackage.w39.n0(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r7 = move-exception
            goto L63
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r6)
            r6 = 0
            return r6
        L35:
            defpackage.w39.n0(r7)
            goto L49
        L39:
            defpackage.w39.n0(r7)
            ja7 r7 = r6.b()
            r0.i0 = r3
            java.lang.Integer r7 = r7.a()
            if (r7 != r4) goto L49
            goto L5b
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            z47 r1 = r6.k0     // Catch: java.lang.Throwable -> L5f
            r0.f0 = r7     // Catch: java.lang.Throwable -> L5f
            r0.i0 = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r1.Q(r0)     // Catch: java.lang.Throwable -> L5f
            if (r6 != r4) goto L5c
        L5b:
            return r4
        L5c:
            dn8 r6 = defpackage.dn8.a
            return r6
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            u66 r1 = new u66
            r1.<init>(r7, r0)
            jb1 r6 = r6.j0
            r6.c(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib1.e(s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (r11 == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        if (r11 == r7) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r10, defpackage.q51 r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.bb1
            if (r0 == 0) goto L13
            r0 = r11
            bb1 r0 = (defpackage.bb1) r0
            int r1 = r0.j0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j0 = r1
            goto L18
        L13:
            bb1 r0 = new bb1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.h0
            int r1 = r0.j0
            jb1 r2 = r9.j0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            c71 r7 = defpackage.c71.X
            if (r1 == 0) goto L43
            if (r1 == r5) goto L3b
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            defpackage.w39.n0(r11)
            goto La3
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r9)
            return r6
        L37:
            defpackage.w39.n0(r11)
            goto L8c
        L3b:
            boolean r10 = r0.f0
            hh7 r1 = r0.g0
            defpackage.w39.n0(r11)
            goto L5f
        L43:
            defpackage.w39.n0(r11)
            hh7 r1 = r2.b()
            boolean r11 = r1 instanceof defpackage.sl8
            if (r11 != 0) goto Lb7
            ja7 r11 = r9.b()
            r0.g0 = r1
            r0.f0 = r10
            r0.j0 = r5
            java.lang.Integer r11 = r11.a()
            if (r11 != r7) goto L5f
            goto La2
        L5f:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            boolean r5 = r1 instanceof defpackage.v91
            if (r5 == 0) goto L6f
            r8 = r1
            v91 r8 = (defpackage.v91) r8
            int r8 = r8.a
            goto L70
        L6f:
            r8 = -1
        L70:
            if (r5 == 0) goto L75
            if (r11 != r8) goto L75
            return r1
        L75:
            r11 = 0
            if (r10 == 0) goto L8f
            ja7 r10 = r9.b()
            cb1 r1 = new cb1
            r1.<init>(r9, r6, r11)
            r0.g0 = r6
            r0.j0 = r4
            java.lang.Object r11 = r10.b(r1, r0)
            if (r11 != r7) goto L8c
            goto La2
        L8c:
            qg5 r11 = (defpackage.qg5) r11
            goto La5
        L8f:
            ja7 r10 = r9.b()
            db1 r1 = new db1
            r1.<init>(r9, r8, r6, r11)
            r0.g0 = r6
            r0.j0 = r3
            java.lang.Object r11 = r10.c(r1, r0)
            if (r11 != r7) goto La3
        La2:
            return r7
        La3:
            qg5 r11 = (defpackage.qg5) r11
        La5:
            java.lang.Object r9 = r11.X
            hh7 r9 = (defpackage.hh7) r9
            java.lang.Object r10 = r11.Y
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lb6
            r2.c(r9)
        Lb6:
            return r9
        Lb7:
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.bt.i(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib1.f(boolean, q51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0097 A[Catch: j71 -> 0x0058, TryCatch #0 {j71 -> 0x0058, blocks: (B:19:0x0053, B:54:0x00ed, B:24:0x005d, B:51:0x00d2, B:32:0x0072, B:40:0x0097, B:42:0x009d, B:36:0x007c, B:48:0x00c3), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:63:0x0123 A[Catch: all -> 0x014c, TryCatch #3 {all -> 0x014c, blocks: (B:61:0x0113, B:63:0x0123, B:64:0x0128), top: B:83:0x0113 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0128 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #3 {all -> 0x014c, blocks: (B:61:0x0113, B:63:0x0123, B:64:0x0128), top: B:83:0x0113 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:70:0x0140  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(boolean z, s51 s51Var) {
        eb1 eb1Var;
        ea6 ea6Var;
        j71 j71Var;
        ea6 ea6Var2;
        ca6 ca6Var;
        j71 j71Var2;
        fb1 fb1Var;
        Object objB;
        ca6 ca6Var2;
        ea6 ea6Var3;
        int iHashCode;
        Integer numA;
        boolean z2;
        int i;
        Object obj;
        if (s51Var instanceof eb1) {
            eb1Var = (eb1) s51Var;
            int i2 = eb1Var.m0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eb1Var.m0 = i2 - Integer.MIN_VALUE;
            } else {
                eb1Var = new eb1(this, s51Var);
            }
        } else {
            eb1Var = new eb1(this, s51Var);
        }
        Object objA = eb1Var.k0;
        int i3 = eb1Var.m0;
        byte b = 2;
        byte b2 = 1;
        q51 q51Var = null;
        c71 c71Var = c71.X;
        try {
            switch (i3) {
                case 0:
                    w39.n0(objA);
                    if (z) {
                        eb1Var.f0 = z;
                        eb1Var.m0 = 1;
                        objA = ((p92) this.l0.getValue()).a(new ta1(3, (q51) null), eb1Var);
                        if (objA != c71Var) {
                            if (objA != null) {
                                iHashCode = objA.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            ja7 ja7VarB = b();
                            eb1Var.g0 = objA;
                            eb1Var.f0 = z;
                            eb1Var.j0 = iHashCode;
                            eb1Var.m0 = 2;
                            numA = ja7VarB.a();
                            if (numA != c71Var) {
                                int i4 = iHashCode;
                                z2 = z;
                                i = i4;
                                obj = objA;
                                objA = numA;
                                return new v91(i, ((Number) objA).intValue(), obj);
                            }
                        }
                    } else {
                        ja7 ja7VarB2 = b();
                        eb1Var.f0 = z;
                        eb1Var.m0 = 3;
                        objA = ja7VarB2.a();
                        if (objA != c71Var) {
                            int iIntValue = ((Number) objA).intValue();
                            ja7 ja7VarB3 = b();
                            db1 db1Var = new db1(this, iIntValue, q51Var, b2);
                            eb1Var.f0 = z;
                            eb1Var.m0 = 4;
                            objA = ja7VarB3.c(db1Var, eb1Var);
                            if (objA == c71Var) {
                            }
                            return (v91) objA;
                        }
                    }
                    return c71Var;
                case 1:
                    z = eb1Var.f0;
                    w39.n0(objA);
                    if (objA != null) {
                        iHashCode = objA.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    ja7 ja7VarB4 = b();
                    eb1Var.g0 = objA;
                    eb1Var.f0 = z;
                    eb1Var.j0 = iHashCode;
                    eb1Var.m0 = 2;
                    numA = ja7VarB4.a();
                    if (numA != c71Var) {
                        int i5 = iHashCode;
                        z2 = z;
                        i = i5;
                        obj = objA;
                        objA = numA;
                        return new v91(i, ((Number) objA).intValue(), obj);
                    }
                    return c71Var;
                case 2:
                    i = eb1Var.j0;
                    z2 = eb1Var.f0;
                    obj = eb1Var.g0;
                    try {
                        w39.n0(objA);
                        return new v91(i, ((Number) objA).intValue(), obj);
                    } catch (j71 e) {
                        e = e;
                        z = z2;
                        ea6Var = new ea6();
                        eb1Var.g0 = e;
                        eb1Var.h0 = ea6Var;
                        eb1Var.i0 = ea6Var;
                        eb1Var.f0 = z;
                        eb1Var.m0 = 5;
                        Object objJ = this.Y.j(e);
                        if (objJ != c71Var) {
                            j71Var = e;
                            objA = objJ;
                            ea6Var2 = ea6Var;
                            ea6Var2.X = objA;
                            ca6Var = new ca6();
                            try {
                                fb1Var = new fb1(ea6Var, this, ca6Var, (q51) null);
                                eb1Var.g0 = j71Var;
                                eb1Var.h0 = ea6Var;
                                eb1Var.i0 = ca6Var;
                                eb1Var.m0 = 6;
                                if (z) {
                                    objB = fb1Var.B(eb1Var);
                                } else {
                                    objB = b().b(new rf0(fb1Var, q51Var, b), eb1Var);
                                }
                                if (objB != c71Var) {
                                    ca6Var2 = ca6Var;
                                    ea6Var3 = ea6Var;
                                    Object obj2 = ea6Var3.X;
                                    return new v91(obj2 != null ? obj2.hashCode() : 0, ca6Var2.X, obj2);
                                }
                            } catch (Throwable th) {
                                th = th;
                                j71Var2 = j71Var;
                                gv3.g(j71Var2, th);
                                throw j71Var2;
                            }
                        }
                        return c71Var;
                    }
                case 3:
                    z = eb1Var.f0;
                    w39.n0(objA);
                    int iIntValue2 = ((Number) objA).intValue();
                    ja7 ja7VarB5 = b();
                    db1 db1Var2 = new db1(this, iIntValue2, q51Var, b2);
                    eb1Var.f0 = z;
                    eb1Var.m0 = 4;
                    objA = ja7VarB5.c(db1Var2, eb1Var);
                    if (objA == c71Var) {
                        return c71Var;
                    }
                    return (v91) objA;
                case 4:
                    boolean z3 = eb1Var.f0;
                    w39.n0(objA);
                    return (v91) objA;
                case 5:
                    z = eb1Var.f0;
                    ea6 ea6Var4 = (ea6) eb1Var.i0;
                    ea6 ea6Var5 = eb1Var.h0;
                    j71Var = (j71) eb1Var.g0;
                    w39.n0(objA);
                    ea6Var2 = ea6Var4;
                    ea6Var = ea6Var5;
                    ea6Var2.X = objA;
                    ca6Var = new ca6();
                    fb1Var = new fb1(ea6Var, this, ca6Var, (q51) null);
                    eb1Var.g0 = j71Var;
                    eb1Var.h0 = ea6Var;
                    eb1Var.i0 = ca6Var;
                    eb1Var.m0 = 6;
                    if (z) {
                        objB = fb1Var.B(eb1Var);
                    } else {
                        objB = b().b(new rf0(fb1Var, q51Var, b), eb1Var);
                    }
                    if (objB != c71Var) {
                        ca6Var2 = ca6Var;
                        ea6Var3 = ea6Var;
                        Object obj3 = ea6Var3.X;
                        return new v91(obj3 != null ? obj3.hashCode() : 0, ca6Var2.X, obj3);
                    }
                    return c71Var;
                case 6:
                    ca6Var2 = (ca6) eb1Var.i0;
                    ea6Var3 = eb1Var.h0;
                    j71Var2 = (j71) eb1Var.g0;
                    try {
                        w39.n0(objA);
                        Object obj4 = ea6Var3.X;
                        return new v91(obj4 != null ? obj4.hashCode() : 0, ca6Var2.X, obj4);
                    } catch (Throwable th2) {
                        th = th2;
                        gv3.g(j71Var2, th);
                        throw j71Var2;
                    }
                default:
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (j71 e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Object obj, boolean z, s51 s51Var) throws Throwable {
        gb1 gb1Var;
        ca6 ca6Var;
        if (s51Var instanceof gb1) {
            gb1Var = (gb1) s51Var;
            int i = gb1Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                gb1Var.i0 = i - Integer.MIN_VALUE;
            } else {
                gb1Var = new gb1(this, s51Var);
            }
        } else {
            gb1Var = new gb1(this, s51Var);
        }
        Object obj2 = gb1Var.g0;
        int i2 = gb1Var.i0;
        if (i2 == 0) {
            w39.n0(obj2);
            ca6 ca6Var2 = new ca6();
            p92 p92Var = (p92) this.l0.getValue();
            hb1 hb1Var = new hb1(ca6Var2, this, obj, z, null);
            gb1Var.f0 = ca6Var2;
            gb1Var.i0 = 1;
            Object objB = p92Var.b(hb1Var, gb1Var);
            c71 c71Var = c71.X;
            if (objB == c71Var) {
                return c71Var;
            }
            ca6Var = ca6Var2;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca6Var = gb1Var.f0;
            w39.n0(obj2);
        }
        return new Integer(ca6Var.X);
    }

    @Override // defpackage.na1
    public final xe2 j() {
        return this.f0;
    }

    @Override // defpackage.na1
    public final Object u(rn2 rn2Var, s51 s51Var) {
        zp8 zp8Var = (zp8) s51Var.w().H0(qe4.C0);
        if (zp8Var != null) {
            zp8Var.a(this);
        }
        return w51.W(new zp8(zp8Var, this), new r0(this, rn2Var, null, (byte) 12), s51Var);
    }
}
