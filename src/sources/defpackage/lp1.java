package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lp1 implements AutoCloseable {
    public static final kc6 t0 = new kc6("[a-z0-9_-]{1,120}");
    public final oi5 X;
    public final long Y;
    public final oi5 Z;
    public final oi5 f0;
    public final oi5 g0;
    public final LinkedHashMap h0;
    public final m51 i0;
    public final Object j0;
    public long k0;
    public int l0;
    public i76 m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public final kp1 s0;

    public lp1(s92 s92Var, oi5 oi5Var, long j) {
        this.X = oi5Var;
        this.Y = j;
        if (j <= 0) {
            bt.q("maxSize <= 0");
            throw null;
        }
        this.Z = oi5Var.f("journal");
        this.f0 = oi5Var.f("journal.tmp");
        this.g0 = oi5Var.f("journal.bkp");
        this.h0 = new LinkedHashMap(0, 0.75f, true);
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        ye1 ye1Var = ye1.Z;
        t61 t61Var = u61.Y;
        this.i0 = gv3.c(g33.K(ow7VarB, ye1Var.c1(1)));
        this.j0 = new Object();
        this.s0 = new kp1(s92Var);
    }

    public static void X(String str) {
        if (t0.d(str)) {
            return;
        }
        em7.c(pc6.p("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    public final void C() throws IOException {
        Iterator it = this.h0.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            ip1 ip1Var = (ip1) it.next();
            int i = 0;
            if (ip1Var.g == null) {
                while (i < 2) {
                    j += ip1Var.b[i];
                    i++;
                }
            } else {
                ip1Var.g = null;
                while (i < 2) {
                    oi5 oi5Var = (oi5) ip1Var.c.get(i);
                    kp1 kp1Var = this.s0;
                    kp1Var.delete(oi5Var);
                    kp1Var.delete((oi5) ip1Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.k0 = j;
    }

    public final void D() throws Throwable {
        kp1 kp1Var = this.s0;
        oi5 oi5Var = this.Z;
        j76 j76VarI = vr3.i(kp1Var.source(oi5Var));
        try {
            String strV = j76VarI.V(Long.MAX_VALUE);
            String strV2 = j76VarI.V(Long.MAX_VALUE);
            String strV3 = j76VarI.V(Long.MAX_VALUE);
            String strV4 = j76VarI.V(Long.MAX_VALUE);
            String strV5 = j76VarI.V(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strV) || !"1".equals(strV2) || !dh3.f(String.valueOf(3), strV3) || !dh3.f(String.valueOf(2), strV4) || strV5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strV + ", " + strV2 + ", " + strV3 + ", " + strV4 + ", " + strV5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    J(j76VarI.V(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.l0 = i - this.h0.size();
                    if (j76VarI.F()) {
                        this.m0 = new i76(new h82(kp1Var.appendingSink(oi5Var), new y0((Object) this, (byte) 23)));
                    } else {
                        Y();
                    }
                    try {
                        j76VarI.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                j76VarI.close();
            } catch (Throwable th3) {
                gv3.g(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void J(String str) throws IOException {
        String strSubstring;
        int iL0 = fm7.l0(str, ' ', 0, 6);
        if (iL0 == -1) {
            u52.s("unexpected journal line: ".concat(str));
            return;
        }
        int i = iL0 + 1;
        int iL1 = fm7.l0(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.h0;
        if (iL1 == -1) {
            strSubstring = str.substring(i);
            if (iL0 == 6 && mm7.Z(str, false, "REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iL1);
        }
        Object ip1Var = linkedHashMap.get(strSubstring);
        if (ip1Var == null) {
            ip1Var = new ip1(this, strSubstring);
            linkedHashMap.put(strSubstring, ip1Var);
        }
        ip1 ip1Var2 = (ip1) ip1Var;
        if (iL1 == -1 || iL0 != 5 || !mm7.Z(str, false, "CLEAN")) {
            if (iL1 == -1 && iL0 == 5 && mm7.Z(str, false, "DIRTY")) {
                ip1Var2.g = new sa2(this, ip1Var2);
                return;
            } else {
                if (iL1 == -1 && iL0 == 4 && mm7.Z(str, false, "READ")) {
                    return;
                }
                u52.s("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listE0 = fm7.E0(str.substring(iL1 + 1), new char[]{' '});
        ip1Var2.e = true;
        ip1Var2.g = null;
        if (listE0.size() != 2) {
            b61.h(listE0, "unexpected journal line: ");
            return;
        }
        try {
            int size = listE0.size();
            for (int i2 = 0; i2 < size; i2++) {
                ip1Var2.b[i2] = Long.parseLong((String) listE0.get(i2));
            }
        } catch (NumberFormatException unused) {
            b61.h(listE0, "unexpected journal line: ");
        }
    }

    public final void R(ip1 ip1Var) {
        i76 i76Var;
        int i = ip1Var.h;
        String str = ip1Var.a;
        if (i > 0 && (i76Var = this.m0) != null) {
            i76Var.f0("DIRTY");
            i76Var.writeByte(32);
            i76Var.f0(str);
            i76Var.writeByte(10);
            i76Var.flush();
        }
        if (ip1Var.h > 0 || ip1Var.g != null) {
            ip1Var.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.s0.delete((oi5) ip1Var.c.get(i2));
            long j = this.k0;
            long[] jArr = ip1Var.b;
            this.k0 = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.l0++;
        i76 i76Var2 = this.m0;
        if (i76Var2 != null) {
            i76Var2.f0("REMOVE");
            i76Var2.writeByte(32);
            i76Var2.f0(str);
            i76Var2.writeByte(10);
            i76Var2.flush();
        }
        this.h0.remove(str);
        if (this.l0 >= 2000) {
            u();
        }
    }

    public final void U() {
        while (this.k0 > this.Y) {
            for (ip1 ip1Var : this.h0.values()) {
                if (!ip1Var.f) {
                    R(ip1Var);
                }
            }
            return;
        }
        this.q0 = false;
    }

    public final void Y() {
        Throwable th;
        synchronized (this.j0) {
            try {
                i76 i76Var = this.m0;
                if (i76Var != null) {
                    i76Var.close();
                }
                i76 i76VarH = vr3.h(this.s0.sink(this.f0, false));
                try {
                    i76VarH.f0("libcore.io.DiskLruCache");
                    i76VarH.writeByte(10);
                    i76VarH.f0("1");
                    i76VarH.writeByte(10);
                    i76VarH.U0(3L);
                    i76VarH.writeByte(10);
                    i76VarH.U0(2L);
                    i76VarH.writeByte(10);
                    i76VarH.writeByte(10);
                    for (ip1 ip1Var : this.h0.values()) {
                        if (ip1Var.g != null) {
                            i76VarH.f0("DIRTY");
                            i76VarH.writeByte(32);
                            i76VarH.f0(ip1Var.a);
                            i76VarH.writeByte(10);
                        } else {
                            i76VarH.f0("CLEAN");
                            i76VarH.writeByte(32);
                            i76VarH.f0(ip1Var.a);
                            for (long j : ip1Var.b) {
                                i76VarH.writeByte(32);
                                i76VarH.U0(j);
                            }
                            i76VarH.writeByte(10);
                        }
                    }
                    try {
                        i76VarH.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        i76VarH.close();
                    } catch (Throwable th4) {
                        gv3.g(th3, th4);
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                boolean zExists = this.s0.exists(this.Z);
                kp1 kp1Var = this.s0;
                if (zExists) {
                    kp1Var.atomicMove(this.Z, this.g0);
                    this.s0.atomicMove(this.f0, this.Z);
                    this.s0.delete(this.g0);
                } else {
                    kp1Var.atomicMove(this.f0, this.Z);
                }
                this.m0 = new i76(new h82(this.s0.appendingSink(this.Z), new y0((Object) this, (byte) 23)));
                this.l0 = 0;
                this.n0 = false;
                this.r0 = false;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.j0) {
            try {
                if (this.o0 && !this.p0) {
                    for (ip1 ip1Var : (ip1[]) this.h0.values().toArray(new ip1[0])) {
                        sa2 sa2Var = ip1Var.g;
                        if (sa2Var != null) {
                            ip1 ip1Var2 = (ip1) sa2Var.a;
                            if (dh3.f(ip1Var2.g, sa2Var)) {
                                ip1Var2.f = true;
                            }
                        }
                    }
                    U();
                    gv3.i(this.i0, null);
                    i76 i76Var = this.m0;
                    i76Var.getClass();
                    i76Var.close();
                    this.m0 = null;
                    this.p0 = true;
                    return;
                }
                this.p0 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x010f A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:27:0x005a, B:29:0x0069, B:31:0x0077, B:33:0x007e, B:28:0x005e, B:37:0x009e, B:39:0x00a5, B:42:0x00aa, B:44:0x00bb, B:47:0x00c0, B:52:0x00fb, B:54:0x0106, B:58:0x010f, B:48:0x00d8, B:50:0x00ed, B:51:0x00f8, B:36:0x008e, B:61:0x0114, B:62:0x011b), top: B:65:0x0003 }] */
    public final void g(sa2 sa2Var, boolean z) {
        synchronized (this.j0) {
            ip1 ip1Var = (ip1) sa2Var.a;
            if (!dh3.f(ip1Var.g, sa2Var)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || ip1Var.f) {
                for (int i = 0; i < 2; i++) {
                    this.s0.delete((oi5) ip1Var.d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) sa2Var.c)[i2] && !this.s0.exists((oi5) ip1Var.d.get(i2))) {
                        sa2Var.b(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    oi5 oi5Var = (oi5) ip1Var.d.get(i3);
                    oi5 oi5Var2 = (oi5) ip1Var.c.get(i3);
                    boolean zExists = this.s0.exists(oi5Var);
                    kp1 kp1Var = this.s0;
                    if (zExists) {
                        kp1Var.atomicMove(oi5Var, oi5Var2);
                    } else {
                        z39.p(kp1Var, (oi5) ip1Var.c.get(i3));
                    }
                    long j = ip1Var.b[i3];
                    Long l = this.s0.metadata(oi5Var2).d;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    ip1Var.b[i3] = jLongValue;
                    this.k0 = (this.k0 - j) + jLongValue;
                }
            }
            ip1Var.g = null;
            if (ip1Var.f) {
                R(ip1Var);
                return;
            }
            this.l0++;
            i76 i76Var = this.m0;
            i76Var.getClass();
            if (z || ip1Var.e) {
                ip1Var.e = true;
                i76Var.f0("CLEAN");
                i76Var.writeByte(32);
                i76Var.f0(ip1Var.a);
                for (long j2 : ip1Var.b) {
                    i76Var.writeByte(32);
                    i76Var.U0(j2);
                }
                i76Var.writeByte(10);
            } else {
                this.h0.remove(ip1Var.a);
                i76Var.f0("REMOVE");
                i76Var.writeByte(32);
                i76Var.f0(ip1Var.a);
                i76Var.writeByte(10);
            }
            i76Var.flush();
            if (this.k0 > this.Y) {
                u();
            } else if (this.l0 >= 2000) {
                u();
            }
        }
    }

    public final sa2 k(String str) {
        synchronized (this.j0) {
            if (this.p0) {
                throw new IllegalStateException("cache is closed");
            }
            X(str);
            p();
            ip1 ip1Var = (ip1) this.h0.get(str);
            if ((ip1Var != null ? ip1Var.g : null) != null) {
                return null;
            }
            if (ip1Var != null && ip1Var.h != 0) {
                return null;
            }
            if (!this.q0 && !this.r0) {
                i76 i76Var = this.m0;
                i76Var.getClass();
                i76Var.f0("DIRTY");
                i76Var.writeByte(32);
                i76Var.f0(str);
                i76Var.writeByte(10);
                i76Var.flush();
                if (this.n0) {
                    return null;
                }
                if (ip1Var == null) {
                    ip1Var = new ip1(this, str);
                    this.h0.put(str, ip1Var);
                }
                sa2 sa2Var = new sa2(this, ip1Var);
                ip1Var.g = sa2Var;
                return sa2Var;
            }
            u();
            return null;
        }
    }

    public final jp1 m(String str) {
        jp1 jp1VarA;
        synchronized (this.j0) {
            if (this.p0) {
                throw new IllegalStateException("cache is closed");
            }
            X(str);
            p();
            ip1 ip1Var = (ip1) this.h0.get(str);
            if (ip1Var != null && (jp1VarA = ip1Var.a()) != null) {
                boolean z = true;
                this.l0++;
                i76 i76Var = this.m0;
                i76Var.getClass();
                i76Var.f0("READ");
                i76Var.writeByte(32);
                i76Var.f0(str);
                i76Var.writeByte(10);
                i76Var.flush();
                if (this.l0 < 2000) {
                    z = false;
                }
                if (z) {
                    u();
                }
                return jp1VarA;
            }
            return null;
        }
    }

    public final void p() {
        synchronized (this.j0) {
            try {
                if (this.o0) {
                    return;
                }
                this.s0.delete(this.f0);
                if (this.s0.exists(this.g0)) {
                    boolean zExists = this.s0.exists(this.Z);
                    kp1 kp1Var = this.s0;
                    oi5 oi5Var = this.g0;
                    if (zExists) {
                        kp1Var.delete(oi5Var);
                    } else {
                        kp1Var.atomicMove(oi5Var, this.Z);
                    }
                }
                if (this.s0.exists(this.Z)) {
                    try {
                        D();
                        C();
                        this.o0 = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            z39.s(this.s0, this.X);
                            this.p0 = false;
                            Y();
                            this.o0 = true;
                        } catch (Throwable th) {
                            this.p0 = false;
                            throw th;
                        }
                    }
                }
                Y();
                this.o0 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u() {
        w51.G(this.i0, null, null, new l40((Object) this, (q51) null, (byte) 4), 3);
    }
}
