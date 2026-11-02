package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s16 {
    public final hk6 a;
    public final bg0 b;
    public final eg0 c;
    public final b71 d;
    public final fu6 e;
    public final LinkedHashSet f;
    public final ArrayList g;

    public s16(hl5 hl5Var, hk6 hk6Var, bg0 bg0Var, eg0 eg0Var, s98 s98Var) {
        hl5Var.getClass();
        hk6Var.getClass();
        bg0Var.getClass();
        eg0Var.getClass();
        s98Var.getClass();
        this.a = hk6Var;
        this.b = bg0Var;
        this.c = eg0Var;
        b71 b71Var = s98Var.a;
        this.d = b71Var;
        q51 q51Var = null;
        fu6 fu6Var = new fu6(new al5(1, this, s16.class, "prune", "prune$camera_camera2_pipe(Ljava/util/List;)V", 0, (byte) 4), new jy2((Object) this, q51Var, (byte) 22));
        b71Var.getClass();
        if (!((pv) fu6Var.g0).a()) {
            bt.i("PruningProcessingQueue cannot be re-started!");
            throw null;
        }
        if (w51.G(b71Var, null, null, new r5((Object) fu6Var, q51Var, (byte) 26), 3).isCancelled()) {
            fu6Var.D(null);
        }
        this.e = fu6Var;
        this.f = new LinkedHashSet();
        this.g = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00dc -> B:44:0x00df). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:29:0x009a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.Set r11, defpackage.s51 r12) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s16.a(java.util.Set, s51):java.lang.Object");
    }

    public final void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h16 h16Var = (h16) it.next();
            h16Var.c.b();
            this.g.remove(h16Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, List list, ze0 ze0Var, b71 b71Var, s51 s51Var) {
        m16 m16Var;
        if (s51Var instanceof m16) {
            m16Var = (m16) s51Var;
            int i = m16Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                m16Var.k0 = i - Integer.MIN_VALUE;
            } else {
                m16Var = new m16(this, s51Var);
            }
        } else {
            m16Var = new m16(this, s51Var);
        }
        Object objA = m16Var.i0;
        int i2 = m16Var.k0;
        if (i2 == 0) {
            w39.n0(objA);
            vi0.b(str);
            m16Var.f0 = str;
            m16Var.g0 = list;
            m16Var.h0 = b71Var;
            m16Var.k0 = 1;
            objA = this.a.a(str, this.b, ze0Var, m16Var);
            c71 c71Var = c71.X;
            if (objA == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b71Var = m16Var.h0;
            list = m16Var.g0;
            str = m16Var.f0;
            w39.n0(objA);
        }
        hb5 hb5Var = (hb5) objA;
        db dbVar = hb5Var.a;
        return dbVar == null ? new e16(hb5Var.b) : new f16(new s5(dbVar, wv0.c1(wv0.I0(list, new vi0(str))), b71Var, new vj2((Object) this, (byte) 29)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(oe6 oe6Var, s51 s51Var) {
        n16 n16Var;
        if (s51Var instanceof n16) {
            n16Var = (n16) s51Var;
            int i = n16Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                n16Var.i0 = i - Integer.MIN_VALUE;
            } else {
                n16Var = new n16(this, s51Var);
            }
        } else {
            n16Var = new n16(this, s51Var);
        }
        Object obj = n16Var.g0;
        int i2 = n16Var.i0;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(obj);
            s5 s5Var = oe6Var.a;
            vi0.b(s5Var.a.a);
            LinkedHashSet linkedHashSet = this.f;
            if (linkedHashSet.contains(s5Var)) {
                linkedHashSet.remove(s5Var);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : this.g) {
                if (((h16) obj2).b == s5Var) {
                    arrayList.add(obj2);
                }
            }
            n16Var.f0 = oe6Var;
            n16Var.i0 = 1;
            b(arrayList);
            if (dn8Var != c71Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                w39.n0(obj);
                return dn8Var;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oe6Var = n16Var.f0;
        w39.n0(obj);
        oe6Var.a.c();
        s5 s5Var2 = oe6Var.a;
        n16Var.f0 = null;
        n16Var.i0 = 2;
        return s5Var2.b(n16Var) == c71Var ? c71Var : dn8Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:24:0x0066->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r2 == r6) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.pe6 r8, defpackage.s51 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.o16
            if (r0 == 0) goto L13
            r0 = r9
            o16 r0 = (defpackage.o16) r0
            int r1 = r0.j0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j0 = r1
            goto L18
        L13:
            o16 r0 = new o16
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.h0
            int r1 = r0.j0
            dn8 r2 = defpackage.dn8.a
            r3 = 2
            r4 = 1
            java.util.LinkedHashSet r5 = r7.f
            c71 r6 = defpackage.c71.X
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L39
            if (r1 != r3) goto L32
            java.util.Iterator r7 = r0.g0
            pe6 r8 = r0.f0
            defpackage.w39.n0(r9)
            goto L66
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r7)
            r7 = 0
            return r7
        L39:
            pe6 r8 = r0.f0
            defpackage.w39.n0(r9)
            goto L4e
        L3f:
            defpackage.w39.n0(r9)
            r0.f0 = r8
            r0.j0 = r4
            java.util.ArrayList r9 = r7.g
            r7.b(r9)
            if (r2 != r6) goto L4e
            goto L7e
        L4e:
            java.util.Iterator r7 = r5.iterator()
        L52:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L62
            java.lang.Object r9 = r7.next()
            s5 r9 = (defpackage.s5) r9
            r9.c()
            goto L52
        L62:
            java.util.Iterator r7 = r5.iterator()
        L66:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L7f
            java.lang.Object r9 = r7.next()
            s5 r9 = (defpackage.s5) r9
            r0.f0 = r8
            r0.g0 = r7
            r0.j0 = r3
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r6) goto L66
        L7e:
            return r6
        L7f:
            r5.clear()
            ux0 r7 = r8.a
            r7.V(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s16.e(pe6, s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(qe6 qe6Var, s51 s51Var) {
        p16 p16Var;
        qe6 qe6Var2;
        String str;
        Object next;
        qe6 qe6Var3;
        if (s51Var instanceof p16) {
            p16Var = (p16) s51Var;
            int i = p16Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                p16Var.j0 = i - Integer.MIN_VALUE;
            } else {
                p16Var = new p16(this, s51Var);
            }
        } else {
            p16Var = new p16(this, s51Var);
        }
        Object obj = p16Var.h0;
        int i2 = p16Var.j0;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        if (i2 != 0) {
            if (i2 == 1) {
                str = p16Var.g0;
                qe6Var2 = p16Var.f0;
                w39.n0(obj);
            } else {
                if (i2 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qe6Var3 = p16Var.f0;
                w39.n0(obj);
            }
            qe6Var2 = qe6Var3;
            qe6Var2.b.V(dn8Var);
            return dn8Var;
        }
        w39.n0(obj);
        String str2 = qe6Var.a;
        vi0.b(str2);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.g) {
            if (dh3.f(((h16) obj2).a.a.a, str2)) {
                arrayList.add(obj2);
            }
        }
        p16Var.f0 = qe6Var;
        p16Var.g0 = str2;
        p16Var.j0 = 1;
        b(arrayList);
        if (dn8Var != c71Var) {
            qe6Var2 = qe6Var;
            str = str2;
        }
        return c71Var;
        LinkedHashSet linkedHashSet = this.f;
        Iterator it = linkedHashSet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!dh3.f(((s5) next).a.a, str));
        s5 s5Var = (s5) next;
        if (s5Var != null) {
            linkedHashSet.remove(s5Var);
            s5Var.c();
            p16Var.f0 = qe6Var2;
            p16Var.g0 = null;
            p16Var.j0 = 2;
            if (s5Var.b(p16Var) != c71Var) {
                qe6Var3 = qe6Var2;
                qe6Var2 = qe6Var3;
            }
            return c71Var;
        }
        qe6Var2.b.V(dn8Var);
        return dn8Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0221  */
    /* JADX WARN: Code duplicated, block: B:110:0x0235  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[LOOP:2: B:50:0x012d->B:125:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x011f A[LOOP:3: B:46:0x0119->B:48:0x011f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0133  */
    /* JADX WARN: Code duplicated, block: B:64:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:0x0181  */
    /* JADX WARN: Code duplicated, block: B:69:0x0187  */
    /* JADX WARN: Code duplicated, block: B:70:0x0192  */
    /* JADX WARN: Code duplicated, block: B:73:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01da  */
    /* JADX WARN: Code duplicated, block: B:99:0x020b  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x021b, code lost:
    
        if (a(r10, r0) == r1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x022f, code lost:
    
        if (defpackage.dn8.a == r1) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ve6 r10, defpackage.s51 r11) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s16.g(ve6, s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:55:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[LOOP:0: B:17:0x004f->B:57:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0082 -> B:28:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(java.lang.String r13, defpackage.ve6 r14, defpackage.s51 r15) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s16.h(java.lang.String, ve6, s51):java.lang.Object");
    }
}
