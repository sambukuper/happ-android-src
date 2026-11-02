package defpackage;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w11 implements t11 {
    public final sq5 X;
    public final sq5 Y;
    public final ThreadLocal Z;
    public final AtomicBoolean f0;
    public final long g0;

    public w11(final dq dqVar, final String str, int i) {
        str.getClass();
        this.Z = new ThreadLocal();
        final byte b = 0;
        this.f0 = new AtomicBoolean(false);
        be beVar = gx1.Y;
        this.g0 = vj8.l0(30, lx1.SECONDS);
        if (i <= 0) {
            bt.q("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.X = new sq5(i, new dn2() { // from class: u11
            @Override // defpackage.dn2
            public final Object invoke() {
                byte b2 = b;
                String str2 = str;
                dq dqVar2 = dqVar;
                switch (b2) {
                    case 0:
                        qr6 qr6VarO = dqVar2.o(str2);
                        nr4.r(qr6VarO, "PRAGMA query_only = 1");
                        return qr6VarO;
                    default:
                        return dqVar2.o(str2);
                }
            }
        });
        final byte b2 = 1;
        this.Y = new sq5(1, new dn2() { // from class: u11
            @Override // defpackage.dn2
            public final Object invoke() {
                byte b3 = b2;
                String str2 = str;
                dq dqVar2 = dqVar;
                switch (b3) {
                    case 0:
                        qr6 qr6VarO = dqVar2.o(str2);
                        nr4.r(qr6VarO, "PRAGMA query_only = 1");
                        return qr6VarO;
                    default:
                        return dqVar2.o(str2);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cb A[Catch: all -> 0x0163, TryCatch #2 {all -> 0x0163, blocks: (B:73:0x0140, B:75:0x0146, B:80:0x015f, B:84:0x0169, B:88:0x0173, B:99:0x01c3, B:100:0x01ca, B:101:0x01cb, B:102:0x01cc, B:103:0x01cf), top: B:128:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01cc A[Catch: all -> 0x0163, TryCatch #2 {all -> 0x0163, blocks: (B:73:0x0140, B:75:0x0146, B:80:0x015f, B:84:0x0169, B:88:0x0173, B:99:0x01c3, B:100:0x01ca, B:101:0x01cb, B:102:0x01cc, B:103:0x01cf), top: B:128:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0146 A[Catch: all -> 0x0163, TryCatch #2 {all -> 0x0163, blocks: (B:73:0x0140, B:75:0x0146, B:80:0x015f, B:84:0x0169, B:88:0x0173, B:99:0x01c3, B:100:0x01ca, B:101:0x01cb, B:102:0x01cc, B:103:0x01cf), top: B:128:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0168  */
    /* JADX WARN: Code duplicated, block: B:86:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0173 A[Catch: all -> 0x0163, TRY_LEAVE, TryCatch #2 {all -> 0x0163, blocks: (B:73:0x0140, B:75:0x0146, B:80:0x015f, B:84:0x0169, B:88:0x0173, B:99:0x01c3, B:100:0x01ca, B:101:0x01cb, B:102:0x01cc, B:103:0x01cf), top: B:128:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01aa A[Catch: all -> 0x01c2, TRY_LEAVE, TryCatch #1 {all -> 0x01c2, blocks: (B:92:0x01a4, B:94:0x01aa, B:96:0x01b4, B:97:0x01b9), top: B:126:0x01a4 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c3 A[Catch: all -> 0x0163, TRY_ENTER, TryCatch #2 {all -> 0x0163, blocks: (B:73:0x0140, B:75:0x0146, B:80:0x015f, B:84:0x0169, B:88:0x0173, B:99:0x01c3, B:100:0x01ca, B:101:0x01cb, B:102:0x01cc, B:103:0x01cf), top: B:128:0x0140 }] */
    @Override // defpackage.t11
    public final Object E(boolean z, rn2 rn2Var, s51 s51Var) {
        v11 v11Var;
        sq5 sq5Var;
        ea6 ea6Var;
        Throwable th;
        sq5 sq5Var2;
        ea6 ea6Var2;
        s61 s61Var;
        rn2 rn2Var2;
        boolean z2;
        w11 w11Var;
        ea6 ea6Var3;
        e21 e21Var;
        br5 br5Var;
        boolean z3;
        br5 br5Var2;
        w11 w11Var2 = this;
        boolean z4 = z;
        rn2 rn2Var3 = rn2Var;
        if (s51Var instanceof v11) {
            v11Var = (v11) s51Var;
            int i = v11Var.o0;
            if ((i & Integer.MIN_VALUE) != 0) {
                v11Var.o0 = i - Integer.MIN_VALUE;
            } else {
                v11Var = new v11(w11Var2, s51Var);
            }
        } else {
            v11Var = new v11(w11Var2, s51Var);
        }
        s61 s61Var2 = v11Var.Y;
        Object objW = v11Var.m0;
        int i2 = v11Var.o0;
        q51 q51Var = null;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(objW);
            if (w11Var2.f0.get()) {
                nr4.T(21, "Connection pool is closed");
                throw null;
            }
            ThreadLocal threadLocal = w11Var2.Z;
            br5 br5Var3 = (br5) threadLocal.get();
            be beVar = s11.Y;
            if (br5Var3 == null) {
                s61Var2.getClass();
                s11 s11Var = (s11) s61Var2.H0(beVar);
                br5Var3 = s11Var != null ? s11Var.X : null;
            }
            if (br5Var3 == null) {
                sq5Var = z4 ? w11Var2.X : w11Var2.Y;
                ea6Var = new ea6();
                try {
                    s61Var2.getClass();
                    ea6Var2 = new ea6();
                    try {
                        long j = w11Var2.g0;
                        r0 r0Var = new r0(ea6Var2, sq5Var, q51Var, (byte) 11);
                        v11Var.f0 = w11Var2;
                        v11Var.g0 = (Serializable) rn2Var3;
                        v11Var.h0 = sq5Var;
                        v11Var.i0 = ea6Var;
                        v11Var.j0 = s61Var2;
                        v11Var.k0 = ea6Var2;
                        v11Var.l0 = z4;
                        v11Var.o0 = 3;
                        long jS0 = u70.s0(j);
                        if (jS0 <= 0) {
                            throw new ua8("Timed out immediately", null);
                        }
                        if (a28.t(new va8(jS0, v11Var), r0Var) != c71Var) {
                            th = null;
                            s61Var = s61Var2;
                            rn2Var2 = rn2Var3;
                            z2 = z4;
                            w11Var = w11Var2;
                            ea6Var3 = ea6Var;
                            e21Var = (e21) ea6Var2.X;
                            if (e21Var != null) {
                                s61Var.getClass();
                                e21Var.Z = s61Var;
                                e21Var.f0 = new Throwable();
                                if (w11Var.X == w11Var.Y) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                br5Var = new br5(e21Var, z3);
                            } else {
                                br5Var = null;
                            }
                            ea6Var3.X = br5Var;
                            if (!(th instanceof ua8)) {
                                w11Var.g(z2);
                                throw null;
                            }
                            if (th == null) {
                                throw th;
                            }
                            if (br5Var != null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            w11Var.getClass();
                            s61 s61VarK = g33.K(new s11(br5Var), new i98(br5Var, w11Var.Z));
                            q0 q0Var = new q0(rn2Var2, ea6Var3, q51Var, (byte) 16);
                            v11Var.f0 = sq5Var;
                            v11Var.g0 = ea6Var3;
                            v11Var.h0 = null;
                            v11Var.i0 = null;
                            v11Var.j0 = null;
                            v11Var.k0 = null;
                            v11Var.o0 = 4;
                            objW = w51.W(s61VarK, q0Var, v11Var);
                            if (objW != c71Var) {
                                sq5Var2 = sq5Var;
                                br5Var2 = (br5) ea6Var3.X;
                                if (br5Var2 != null) {
                                    if (br5Var2.d.compareAndSet(false, true)) {
                                        nr4.r(br5Var2.a, "ROLLBACK TRANSACTION");
                                    }
                                    e21 e21Var2 = br5Var2.a;
                                    e21Var2.Z = null;
                                    e21Var2.f0 = null;
                                    sq5Var2.d(e21Var2);
                                }
                                return objW;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sq5Var2 = sq5Var;
                }
            } else {
                if (!z4 && br5Var3.b) {
                    nr4.T(1, "Cannot upgrade connection from reader to writer");
                    throw null;
                }
                s61Var2.getClass();
                if (s61Var2.H0(beVar) == null) {
                    s61 s61VarK2 = g33.K(new s11(br5Var3), new i98(br5Var3, threadLocal));
                    q0 q0Var2 = new q0(rn2Var3, br5Var3, q51Var, (byte) 15);
                    v11Var.o0 = 1;
                    Object objW2 = w51.W(s61VarK2, q0Var2, v11Var);
                    if (objW2 != c71Var) {
                        return objW2;
                    }
                } else {
                    v11Var.o0 = 2;
                    Object objK = rn2Var3.K(br5Var3, v11Var);
                    if (objK != c71Var) {
                        return objK;
                    }
                }
            }
            return c71Var;
        }
        if (i2 == 1) {
            w39.n0(objW);
            return objW;
        }
        if (i2 == 2) {
            w39.n0(objW);
            return objW;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ea6Var3 = (ea6) v11Var.g0;
            sq5Var2 = (sq5) v11Var.f0;
            try {
                w39.n0(objW);
                try {
                    br5Var2 = (br5) ea6Var3.X;
                    if (br5Var2 != null) {
                        if (br5Var2.d.compareAndSet(false, true)) {
                            try {
                                nr4.r(br5Var2.a, "ROLLBACK TRANSACTION");
                            } catch (SQLException unused) {
                            }
                        }
                        e21 e21Var3 = br5Var2.a;
                        e21Var3.Z = null;
                        e21Var3.f0 = null;
                        sq5Var2.d(e21Var3);
                    }
                } catch (Throwable unused2) {
                }
                return objW;
            } catch (Throwable th4) {
                th = th4;
                ea6Var = ea6Var3;
                th = th;
                throw th;
            }
        }
        boolean z5 = v11Var.l0;
        ea6 ea6Var4 = v11Var.k0;
        s61Var2 = v11Var.j0;
        ea6 ea6Var5 = v11Var.i0;
        sq5Var = v11Var.h0;
        rn2 rn2Var4 = (rn2) v11Var.g0;
        w11 w11Var3 = (w11) v11Var.f0;
        try {
            w39.n0(objW);
            ea6Var2 = ea6Var4;
            z4 = z5;
            w11Var2 = w11Var3;
            ea6Var = ea6Var5;
            rn2Var3 = rn2Var4;
            th = null;
        } catch (Throwable th5) {
            th = th5;
            ea6Var2 = ea6Var4;
            z4 = z5;
            w11Var2 = w11Var3;
            ea6Var = ea6Var5;
            rn2Var3 = rn2Var4;
        }
        s61Var = s61Var2;
        rn2Var2 = rn2Var3;
        z2 = z4;
        w11Var = w11Var2;
        ea6Var3 = ea6Var;
        try {
            e21Var = (e21) ea6Var2.X;
            if (e21Var != null) {
                s61Var.getClass();
                e21Var.Z = s61Var;
                e21Var.f0 = new Throwable();
                if (w11Var.X == w11Var.Y && z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                br5Var = new br5(e21Var, z3);
            } else {
                br5Var = null;
            }
            ea6Var3.X = br5Var;
            if (!(th instanceof ua8)) {
                w11Var.g(z2);
                throw null;
            }
            if (th == null) {
                throw th;
            }
            if (br5Var != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            w11Var.getClass();
            s61 s61VarK3 = g33.K(new s11(br5Var), new i98(br5Var, w11Var.Z));
            q0 q0Var3 = new q0(rn2Var2, ea6Var3, q51Var, (byte) 16);
            v11Var.f0 = sq5Var;
            v11Var.g0 = ea6Var3;
            v11Var.h0 = null;
            v11Var.i0 = null;
            v11Var.j0 = null;
            v11Var.k0 = null;
            v11Var.o0 = 4;
            objW = w51.W(s61VarK3, q0Var3, v11Var);
            if (objW != c71Var) {
                sq5Var2 = sq5Var;
                br5Var2 = (br5) ea6Var3.X;
                if (br5Var2 != null) {
                    if (br5Var2.d.compareAndSet(false, true)) {
                        nr4.r(br5Var2.a, "ROLLBACK TRANSACTION");
                    }
                    e21 e21Var4 = br5Var2.a;
                    e21Var4.Z = null;
                    e21Var4.f0 = null;
                    sq5Var2.d(e21Var4);
                }
                return objW;
            }
            return c71Var;
        } catch (Throwable th6) {
            th = th6;
            ea6Var = ea6Var3;
            sq5Var2 = sq5Var;
            th = th;
            throw th;
        }
        try {
            throw th;
        } catch (Throwable th7) {
            try {
                br5 br5Var4 = (br5) ea6Var.X;
                if (br5Var4 == null) {
                    throw th7;
                }
                if (br5Var4.d.compareAndSet(false, true)) {
                    try {
                        nr4.r(br5Var4.a, "ROLLBACK TRANSACTION");
                    } catch (SQLException unused3) {
                    }
                }
                e21 e21Var5 = br5Var4.a;
                e21Var5.Z = null;
                e21Var5.f0 = null;
                sq5Var2.d(e21Var5);
                throw th7;
            } catch (Throwable th8) {
                gv3.g(th, th8);
                throw th7;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f0.compareAndSet(false, true)) {
            this.X.b();
            this.Y.b();
        }
    }

    public final void g(boolean z) {
        String str = z ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.Y.c(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.X.c(sb);
        nr4.T(5, sb.toString());
        throw null;
    }

    public w11(dq dqVar) {
        this.Z = new ThreadLocal();
        this.f0 = new AtomicBoolean(false);
        be beVar = gx1.Y;
        this.g0 = vj8.l0(30, lx1.SECONDS);
        sq5 sq5Var = new sq5(1, new o7((Object) dqVar, (byte) 24));
        this.X = sq5Var;
        this.Y = sq5Var;
    }
}
