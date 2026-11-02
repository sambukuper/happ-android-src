package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ht2 implements Closeable {
    public final ni0 X;
    public final Map Y;
    public final Map Z;
    public final ArrayList f0;
    public final b71 g0;
    public final m51 h0;
    public final y5 i0;
    public final Object j0;
    public volatile boolean k0;
    public xm0 l0;
    public ne6 m0;
    public final Map n0;
    public final pv o0;
    public ne6 p0;
    public Map q0;
    public Map r0;
    public Map s0;
    public final List t0;
    public xm0 u0;

    public ht2(ni0 ni0Var, Map map, Map map2, ArrayList arrayList, ArrayList arrayList2, b71 b71Var, u61 u61Var) {
        b71Var.getClass();
        this.X = ni0Var;
        this.Y = map;
        this.Z = map2;
        this.f0 = arrayList2;
        this.g0 = b71Var;
        m51 m51VarC = gv3.c(g33.K(u61Var, new x61("CXCP-GraphLoop")));
        this.h0 = m51VarC;
        int i = 0;
        Class<ht2> cls = ht2.class;
        y5 y5Var = new y5(new d0(1, this, cls, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V", i, (byte) 11), new yn1(2, this, cls, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i, (byte) 2));
        q51 q51Var = null;
        if (!((pv) y5Var.g0).a()) {
            bt.i("ProcessingQueue cannot be re-started!");
            throw null;
        }
        if (w51.G(m51VarC, null, null, new r5((Object) y5Var, q51Var, (byte) 25), 3).isCancelled()) {
            y5Var.Z(null);
        }
        this.i0 = y5Var;
        this.j0 = new Object();
        e02 e02Var = e02.X;
        this.n0 = e02Var;
        this.o0 = nr4.e(true);
        this.q0 = e02Var;
        this.r0 = e02Var;
        this.s0 = map2;
        this.t0 = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00be -> B:37:0x00da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d6 -> B:36:0x00d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e7 -> B:39:0x00e8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object C(java.util.List r18, int r19, defpackage.at2 r20, defpackage.q51 r21) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht2.C(java.util.List, int, at2, q51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb A[PHI: r3 r9 r12
  0x00cb: PHI (r3v5 int) = (r3v3 int), (r3v8 int) binds: [B:32:0x0093, B:47:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r9v7 java.util.List) = (r9v6 java.util.List), (r9v8 java.util.List) binds: [B:32:0x0093, B:47:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r12v6 int) = (r12v5 int), (r12v7 int) binds: [B:32:0x0093, B:47:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0093 -> B:48:0x00cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00b7 -> B:47:0x00c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c6 -> B:47:0x00c9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object D(java.util.List r12, defpackage.q51 r13) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht2.D(java.util.List, q51):java.lang.Object");
    }

    public final void J(List list, int i, bt2 bt2Var) {
        ne6 ne6Var = this.p0;
        if (ne6Var == null && i == 0) {
            list.remove(i);
            return;
        }
        if (this.o0.b() && ne6Var != null && k(false, i21.K(ne6Var), bt2Var.a)) {
            list.remove(i);
            return;
        }
        if (i > 0) {
            int i2 = i - 1;
            if (((ct2) list.get(i2)) instanceof zs2) {
                u(i2, list, false);
            } else {
                bt.i("Check failed.");
            }
        }
    }

    public final boolean R() {
        Boolean boolValueOf;
        xm0 xm0Var = this.u0;
        if (xm0Var == null) {
            return false;
        }
        ne6 ne6Var = this.p0;
        if (ne6Var != null) {
            boolValueOf = Boolean.valueOf(xm0Var.g(true, i21.K(ne6Var), this.Y, this.q0, this.s0, this.t0));
        } else {
            boolValueOf = null;
        }
        return dh3.f(boolValueOf, Boolean.TRUE);
    }

    public final void U(boolean z) {
        this.o0.a = z ? 1 : 0;
        if (z) {
            this.i0.g0(vs2.b);
        }
    }

    public final void X(xm0 xm0Var) {
        synchronized (this.j0) {
            xm0 xm0Var2 = this.l0;
            this.l0 = xm0Var;
            if (this.k0) {
                q51 q51Var = null;
                this.l0 = null;
                if (xm0Var != null) {
                    w51.G(this.g0, null, null, new et2(xm0Var, q51Var, (byte) 1), 3);
                }
                return;
            }
            if (xm0Var2 != xm0Var) {
                this.i0.g0(new at2(xm0Var2, xm0Var));
            }
            if (xm0Var == null) {
                int size = this.f0.size();
                for (int i = 0; i < size; i++) {
                    ((dt2) this.f0.get(i)).a();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.j0) {
            try {
                if (this.k0) {
                    return;
                }
                this.k0 = true;
                xm0 xm0Var = this.l0;
                Object[] objArr = 0;
                q51 q51Var = null;
                if (xm0Var != null) {
                    w51.G(this.g0, null, null, new et2(xm0Var, q51Var, objArr == true ? 1 : 0), 3);
                }
                this.l0 = null;
                this.i0.g0(vs2.c);
                int size = this.f0.size();
                for (int i = 0; i < size; i++) {
                    ((dt2) this.f0.get(i)).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ne6 ne6Var = (ne6) arrayList.get(i);
            List list = this.t0;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((me6) list.get(i2)).a0(ne6Var);
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ne6 ne6Var2 = (ne6) arrayList.get(i3);
            int size4 = ne6Var2.d.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((me6) ne6Var2.d.get(i4)).a0(ne6Var2);
            }
        }
    }

    public final boolean k(boolean z, List list, Map map) throws Throwable {
        Map mapB;
        xm0 xm0Var = this.u0;
        if (xm0Var == null) {
            return false;
        }
        Map map2 = this.q0;
        if (map.isEmpty()) {
            mapB = this.s0;
        } else {
            ip4 ip4Var = new ip4();
            Map map3 = this.r0;
            map3.getClass();
            ip4Var.putAll(map3);
            ip4Var.putAll(map);
            ip4Var.putAll(this.Z);
            mapB = ip4Var.b();
        }
        Map map4 = mapB;
        boolean zG = xm0Var.g(z, list, this.Y, map2, map4, this.t0);
        if (!zG) {
            if (z) {
                Objects.toString(wv0.O0(list));
                return zG;
            }
            if (map.isEmpty()) {
                list.toString();
                return zG;
            }
            Objects.toString(wv0.O0(list));
            map.toString();
        }
        return zG;
    }

    public final ne6 m() {
        ne6 ne6Var;
        synchronized (this.j0) {
            ne6Var = this.m0;
        }
        return ne6Var;
    }

    public final void p(List list, int i, ws2 ws2Var, boolean z) {
        if (this.o0.b() && k(false, null, e02.X)) {
            list.remove(i);
            return;
        }
        if (!z || i <= 0) {
            return;
        }
        int i2 = i - 1;
        if (((ct2) list.get(i2)) instanceof zs2) {
            u(i2, list, false);
        } else {
            bt.i("Check failed.");
        }
    }

    public final String toString() {
        return "GraphLoop(" + this.X + ')';
    }

    public final void u(int i, List list, boolean z) {
        int i2;
        int i3 = i;
        while (true) {
            int i4 = 0;
            if (-1 >= i3) {
                if (!z || (i2 = i + 1) >= list.size()) {
                    return;
                }
                ct2 ct2Var = (ct2) list.get(i2);
                if (ct2Var instanceof ws2) {
                    p(list, i2, (ws2) ct2Var, false);
                    return;
                } else {
                    if (ct2Var instanceof bt2) {
                        J(list, i2, (bt2) ct2Var);
                        return;
                    }
                    return;
                }
            }
            ct2 ct2Var2 = (ct2) list.get(i3);
            if (ct2Var2 instanceof zs2) {
                ne6 ne6Var = ((zs2) ct2Var2).a;
                if (k(true, i21.K(ne6Var), e02.X)) {
                    this.p0 = ne6Var;
                    list.remove(i3);
                    while (i4 < i3) {
                        if (((ct2) list.get(i4)) instanceof zs2) {
                            list.remove(i4);
                            i3--;
                        } else {
                            i4++;
                        }
                    }
                    return;
                }
            }
            i3--;
        }
    }
}
