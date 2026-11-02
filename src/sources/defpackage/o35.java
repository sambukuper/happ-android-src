package defpackage;

import android.webkit.MimeTypeMap;
import io.sentry.c2;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o35 implements w82 {
    public final String a;
    public final pd5 b;
    public final vz7 c;
    public final vz7 d;
    public final vz7 e;
    public final qc3 f;
    public final vz7 g;

    public o35(String str, pd5 pd5Var, vz7 vz7Var, vz7 vz7Var2, vz7 vz7Var3, qc3 qc3Var, vz7 vz7Var4) {
        this.a = str;
        this.b = pd5Var;
        this.c = vz7Var;
        this.d = vz7Var2;
        this.e = vz7Var3;
        this.f = qc3Var;
        this.g = vz7Var4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    public static String d(String str, String str2) {
        String mimeTypeFromExtension;
        if (str2 == null || mm7.Z(str2, false, "text/plain")) {
            if (fm7.o0(str)) {
                mimeTypeFromExtension = null;
            } else {
                String strO0 = fm7.O0('?', fm7.O0('#', str));
                String strK0 = fm7.K0('.', fm7.K0('/', strO0, strO0), _UrlKt.FRAGMENT_ENCODE_SET);
                if (fm7.o0(strK0)) {
                    mimeTypeFromExtension = null;
                } else {
                    String lowerCase = strK0.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    mimeTypeFromExtension = (String) rv4.a.get(lowerCase);
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    }
                }
            }
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        if (str2 != null) {
            return fm7.M0(';', str2);
        }
        return null;
    }

    public static void f(w35 w35Var) {
        int i = w35Var.a;
        if ((200 > i || i >= 300) && i != 304) {
            throw new r23(pc6.j(i, "HTTP "));
        }
    }

    @Override // defpackage.w82
    public final Object a(l12 l12Var) {
        wl8 wl8Var = (wl8) this.g.getValue();
        String str = this.b.e;
        d0 d0Var = new d0(1, this, o35.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 25);
        wl8Var.getClass();
        return d0Var.B(l12Var);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a  */
    /* JADX WARN: Code duplicated, block: B:76:0x018b A[Catch: Exception -> 0x0043, PHI: r0 r1
  0x018b: PHI (r0v30 java.lang.Object) = (r0v20 java.lang.Object), (r0v1 java.lang.Object) binds: [B:74:0x0188, B:22:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x018b: PHI (r1v10 ea6) = (r1v8 ea6), (r1v16 ea6) binds: [B:74:0x0188, B:22:0x0052] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x0043, blocks: (B:15:0x003e, B:81:0x01b1, B:22:0x0052, B:76:0x018b, B:78:0x018f, B:58:0x0120, B:60:0x0126, B:66:0x014e, B:68:0x0154, B:71:0x0163, B:72:0x0168, B:73:0x0169, B:41:0x00a7, B:43:0x00ae, B:45:0x00bc, B:52:0x00ec, B:54:0x00f8, B:48:0x00d0, B:50:0x00da, B:63:0x0145, B:64:0x014c), top: B:93:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x018f A[Catch: Exception -> 0x0043, TryCatch #3 {Exception -> 0x0043, blocks: (B:15:0x003e, B:81:0x01b1, B:22:0x0052, B:76:0x018b, B:78:0x018f, B:58:0x0120, B:60:0x0126, B:66:0x014e, B:68:0x0154, B:71:0x0163, B:72:0x0168, B:73:0x0169, B:41:0x00a7, B:43:0x00ae, B:45:0x00bc, B:52:0x00ec, B:54:0x00f8, B:48:0x00d0, B:50:0x00da, B:63:0x0145, B:64:0x014c), top: B:93:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ae, code lost:
    
        if (r0 == r12) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.q51 r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o35.b(q51):java.lang.Object");
    }

    public final s92 c() {
        s92 s92Var;
        r76 r76Var = (r76) this.d.getValue();
        return (r76Var == null || (s92Var = r76Var.a) == null) ? this.b.f : s92Var;
    }

    public final t35 e() {
        f4 f4Var = x63.b;
        pd5 pd5Var = this.b;
        q35 q35Var = (q35) z68.G(pd5Var, f4Var);
        q35Var.getClass();
        t91 t91Var = new t91(q35Var);
        kc0 kc0Var = pd5Var.h;
        boolean z = kc0Var.X;
        boolean z2 = pd5Var.i.X && ((g21) this.f.X).a();
        if (!z2 && z) {
            t91Var.c("only-if-cached, max-stale=2147483647");
        } else if (!z2 || z) {
            if (!z2 && !z) {
                t91Var.c("no-cache, only-if-cached");
            }
        } else if (kc0Var.Y) {
            t91Var.c("no-cache");
        } else {
            t91Var.c("no-cache, no-store");
        }
        String str = (String) z68.G(pd5Var, x63.a);
        q35 q35Var2 = new q35(zp4.Q(t91Var.a));
        if (z68.G(pd5Var, x63.c) == null) {
            return new t35(this.a, str, q35Var2, pd5Var.j);
        }
        c2.m();
        return null;
    }

    public final h92 g(q76 q76Var) {
        jp1 jp1Var = q76Var.X;
        if (jp1Var.Y) {
            bt.i("snapshot is closed");
            return null;
        }
        oi5 oi5Var = (oi5) jp1Var.X.c.get(1);
        s92 s92VarC = c();
        String str = this.b.e;
        if (str == null) {
            str = this.a;
        }
        return vj8.i(oi5Var, s92VarC, str, q76Var, 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(pe7 pe7Var, s51 s51Var) {
        m35 m35Var;
        i90 i90Var;
        if (s51Var instanceof m35) {
            m35Var = (m35) s51Var;
            int i = m35Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                m35Var.i0 = i - Integer.MIN_VALUE;
            } else {
                m35Var = new m35(this, s51Var);
            }
        } else {
            m35Var = new m35(this, s51Var);
        }
        Object obj = m35Var.g0;
        int i2 = m35Var.i0;
        if (i2 == 0) {
            w39.n0(obj);
            i90 i90Var2 = new i90();
            m35Var.f0 = i90Var2;
            m35Var.i0 = 1;
            pe7Var.X.Z(i90Var2);
            dn8 dn8Var = dn8.a;
            c71 c71Var = c71.X;
            if (dn8Var == c71Var) {
                return c71Var;
            }
            i90Var = i90Var2;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i90Var = m35Var.f0;
            w39.n0(obj);
        }
        return vj8.j(i90Var, c());
    }

    public final w35 i(q76 q76Var) throws Throwable {
        Throwable th;
        w35 w35VarK;
        try {
            s92 s92VarC = c();
            jp1 jp1Var = q76Var.X;
            if (jp1Var.Y) {
                throw new IllegalStateException("snapshot is closed");
            }
            j76 j76VarI = vr3.i(s92VarC.source((oi5) jp1Var.X.c.get(0)));
            try {
                w35VarK = nr4.K(j76VarI);
                try {
                    j76VarI.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    j76VarI.close();
                } catch (Throwable th4) {
                    gv3.g(th3, th4);
                }
                th = th3;
                w35VarK = null;
            }
            if (th == null) {
                return w35VarK;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0234 A[Catch: Exception -> 0x003d, TryCatch #7 {Exception -> 0x003d, blocks: (B:13:0x0038, B:110:0x020e, B:117:0x0219, B:118:0x0223, B:120:0x0231, B:122:0x0234, B:125:0x023b, B:126:0x023c, B:119:0x0224), top: B:151:0x0038, inners: #12 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0259  */
    /* JADX WARN: Code duplicated, block: B:158:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0249 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0253 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0191  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [y45] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [y45] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [y45] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [y45] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    public final Object j(q76 q76Var, w35 w35Var, w35 w35Var2, s51 s51Var) throws Exception {
        n35 n35Var;
        w35 w35Var3;
        y45 y45Var;
        ?? r4;
        ?? r1;
        ?? th;
        ?? th2;
        ?? r2;
        sa2 sa2VarK;
        y45 y45Var2;
        pe7 pe7Var;
        pe7 pe7Var2;
        sa2 sa2Var;
        lp1 lp1Var;
        jp1 jp1VarM;
        q76 q76Var2 = q76Var;
        w35 w35Var4 = w35Var2;
        if (s51Var instanceof n35) {
            n35Var = (n35) s51Var;
            int i = n35Var.l0;
            if ((i & Integer.MIN_VALUE) != 0) {
                n35Var.l0 = i - Integer.MIN_VALUE;
            } else {
                n35Var = new n35(this, s51Var);
            }
        } else {
            n35Var = new n35(this, s51Var);
        }
        Object mc0Var = n35Var.j0;
        c71 c71Var = c71.X;
        int i2 = n35Var.l0;
        q76 q76Var3 = null;
        if (i2 == 0) {
            w39.n0(mc0Var);
            if (!this.b.h.Y) {
                if (q76Var2 != null) {
                    try {
                        pc6.w(q76Var2);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
            nc0 nc0Var = (nc0) this.e.getValue();
            n35Var.f0 = q76Var2;
            n35Var.g0 = w35Var4;
            n35Var.l0 = 1;
            ((fe1) nc0Var).getClass();
            int i3 = w35Var4.a;
            if (i3 != 304 || w35Var == null) {
                mc0Var = ((200 > i3 || i3 >= 300) && !fe1.b.contains(new Integer(i3))) ? mc0.b : new mc0(w35Var4);
            } else {
                q35 q35Var = w35Var.d;
                q35 q35Var2 = w35Var4.d;
                q35Var.getClass();
                Map map = q35Var.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), wv0.Z0((Collection) entry.getValue()));
                }
                for (Map.Entry entry2 : q35Var2.a.entrySet()) {
                    String str = (String) entry2.getKey();
                    List list = (List) entry2.getValue();
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    linkedHashMap.put(lowerCase, wv0.Z0(list));
                }
                mc0Var = new mc0(new w35(w35Var4.a, w35Var4.b, w35Var4.c, new q35(zp4.Q(linkedHashMap)), null, w35Var4.f));
            }
            if (mc0Var != c71Var) {
            }
            return c71Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r1 = n35Var.i0;
            w35Var3 = n35Var.h0;
            w35Var4 = n35Var.g0;
            try {
                w39.n0(mc0Var);
                r2 = r1;
                r1 = r2;
                sa2Var = (sa2) r1.X;
                lp1Var = (lp1) sa2Var.d;
                synchronized (lp1Var.j0) {
                    sa2Var.b(true);
                    jp1VarM = lp1Var.m(((ip1) sa2Var.a).a);
                }
                if (jp1VarM != null) {
                    return new q76(jp1VarM);
                }
                return q76Var3;
            } catch (Exception e2) {
                e = e2;
                try {
                    ((sa2) r1.X).b(false);
                } catch (Exception unused2) {
                }
                pe7Var = w35Var4.e;
                if (pe7Var != null) {
                    try {
                        pc6.w(pe7Var);
                    } catch (RuntimeException e3) {
                        throw e3;
                    } catch (Exception unused3) {
                    }
                }
                pe7Var2 = w35Var3.e;
                if (pe7Var2 != null) {
                    throw e;
                }
                try {
                    pc6.w(pe7Var2);
                    throw e;
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception unused4) {
                    throw e;
                }
            }
        }
        w35 w35Var5 = n35Var.g0;
        q76 q76Var4 = n35Var.f0;
        w39.n0(mc0Var);
        w35Var4 = w35Var5;
        q76Var2 = q76Var4;
        q76Var3 = null;
        w35Var3 = ((mc0) mc0Var).a;
        if (w35Var3 == null) {
            return q76Var3;
        }
        if (q76Var2 != null) {
            jp1 jp1Var = q76Var2.X;
            lp1 lp1Var2 = jp1Var.Z;
            synchronized (lp1Var2.j0) {
                jp1Var.close();
                sa2VarK = lp1Var2.k(jp1Var.X.a);
            }
            if (sa2VarK != null) {
                y45Var2 = new y45(sa2VarK);
            } else {
                r4 = q76Var3;
            }
        } else {
            r76 r76Var = (r76) this.d.getValue();
            if (r76Var == null) {
                r4 = q76Var3;
            } else {
                String str2 = this.b.e;
                if (str2 == null) {
                    str2 = this.a;
                }
                lp1 lp1Var3 = r76Var.b;
                kb0 kb0Var = kb0.f0;
                sa2 sa2VarK2 = lp1Var3.k(ra.g(str2).d("SHA-256").f());
                if (sa2VarK2 != null) {
                    y45Var = new y45(sa2VarK2);
                } else {
                    r4 = q76Var3;
                }
            }
        }
        if (r4 == 0) {
            r4 = y45Var;
            r4 = y45Var2;
            return q76Var3;
        }
        try {
            r4 = y45Var;
            r4 = y45Var2;
            i76 i76VarH = vr3.h(c().sink(((sa2) r4.X).d(0), false));
            try {
                nr4.X(w35Var3, i76VarH);
                try {
                    i76VarH.close();
                    th = q76Var3;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    i76VarH.close();
                } catch (Throwable th5) {
                    gv3.g(th4, th5);
                }
                th = th4;
            }
            if (th != 0) {
                throw th;
            }
            pe7 pe7Var3 = w35Var3.e;
            if (pe7Var3 != null) {
                s92 s92VarC = c();
                oi5 oi5VarD = ((sa2) r4.X).d(1);
                q76Var3 = q76Var3;
                n35Var.f0 = q76Var3;
                n35Var.g0 = w35Var4;
                n35Var.h0 = w35Var3;
                n35Var.i0 = r4;
                n35Var.l0 = 2;
                ba0 ba0Var = pe7Var3.X;
                i76 i76VarH2 = vr3.h(s92VarC.sink(oi5VarD, false));
                try {
                    new Long(ba0Var.Z(i76VarH2));
                    try {
                        i76VarH2.close();
                        th2 = q76Var3;
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                } catch (Throwable th7) {
                    try {
                        i76VarH2.close();
                    } catch (Throwable th8) {
                        gv3.g(th7, th8);
                    }
                    th2 = th7;
                }
                if (th2 != 0) {
                    throw th2;
                }
                dn8 dn8Var = dn8.a;
                if (dn8Var != c71Var) {
                    r2 = r4;
                    mc0Var = dn8Var;
                    r1 = r2;
                }
                return c71Var;
            }
            q76Var3 = q76Var3;
            r1 = r4;
            sa2Var = (sa2) r1.X;
            lp1Var = (lp1) sa2Var.d;
            synchronized (lp1Var.j0) {
                sa2Var.b(true);
                jp1VarM = lp1Var.m(((ip1) sa2Var.a).a);
                if (jp1VarM != null) {
                    return new q76(jp1VarM);
                }
                return q76Var3;
            }
        } catch (Exception e5) {
            e = e5;
            r1 = r4;
            ((sa2) r1.X).b(false);
            pe7Var = w35Var4.e;
            if (pe7Var != null) {
                pc6.w(pe7Var);
            }
            pe7Var2 = w35Var3.e;
            if (pe7Var2 != null) {
                throw e;
            }
            pc6.w(pe7Var2);
            throw e;
        }
    }
}
