package defpackage;

import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final kb0 a;
    public static final kb0 b;
    public static final kb0 c;
    public static final kb0 d;
    public static final kb0 e;

    static {
        kb0 kb0Var = kb0.f0;
        a = ra.g("/");
        b = ra.g("\\");
        c = ra.g("/\\");
        d = ra.g(".");
        e = ra.g("..");
    }

    public static final oi5 a(oi5 oi5Var, oi5 oi5Var2, boolean z) {
        oi5Var2.getClass();
        if (c(oi5Var2) != -1 || oi5Var2.h() != null) {
            return oi5Var2;
        }
        kb0 kb0VarB = b(oi5Var);
        if (kb0VarB == null && (kb0VarB = b(oi5Var2)) == null) {
            kb0VarB = f(oi5.Y);
        }
        i90 i90Var = new i90();
        i90Var.C0(oi5Var.X);
        if (i90Var.Y > 0) {
            i90Var.C0(kb0VarB);
        }
        i90Var.C0(oi5Var2.X);
        return d(i90Var, z);
    }

    public static final kb0 b(oi5 oi5Var) {
        kb0 kb0Var = oi5Var.X;
        kb0 kb0Var2 = a;
        if (kb0.h(kb0Var, kb0Var2) != -1) {
            return kb0Var2;
        }
        kb0 kb0Var3 = oi5Var.X;
        kb0 kb0Var4 = b;
        if (kb0.h(kb0Var3, kb0Var4) != -1) {
            return kb0Var4;
        }
        return null;
    }

    public static final int c(oi5 oi5Var) {
        kb0 kb0Var = oi5Var.X;
        if (kb0Var.e() != 0) {
            if (kb0Var.j(0) != 47) {
                if (kb0Var.j(0) == 92) {
                    if (kb0Var.e() > 2 && kb0Var.j(1) == 92) {
                        kb0 kb0Var2 = b;
                        kb0Var2.getClass();
                        int iG = kb0Var.g(2, kb0Var2.i());
                        return iG == -1 ? kb0Var.e() : iG;
                    }
                } else if (kb0Var.e() > 2 && kb0Var.j(1) == 58 && kb0Var.j(2) == 92) {
                    char cJ = (char) kb0Var.j(0);
                    if ('a' <= cJ && cJ < '{') {
                        return 3;
                    }
                    if ('A' <= cJ && cJ < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:83:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0119  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110 A[EDGE_INSN: B:98:0x0110->B:81:0x0110 BREAK  A[LOOP:1: B:53:0x00ab->B:112:0x00ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00fe A[SYNTHETIC] */
    public static final oi5 d(i90 i90Var, boolean z) throws EOFException {
        kb0 kb0Var;
        long j;
        char cU;
        boolean z2;
        ArrayList arrayList;
        boolean zF;
        kb0 kb0Var2;
        int size;
        int i;
        long jD;
        kb0 kb0VarS;
        kb0 kb0Var3;
        i90 i90Var2 = new i90();
        kb0 kb0VarE = null;
        int i2 = 0;
        while (true) {
            if (!i90Var.q(0L, a)) {
                kb0Var = b;
                if (!i90Var.q(0L, kb0Var)) {
                    break;
                }
            }
            byte b2 = i90Var.readByte();
            if (kb0VarE == null) {
                kb0VarE = e(b2);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && dh3.f(kb0VarE, kb0Var);
        kb0 kb0Var4 = c;
        if (z3) {
            kb0VarE.getClass();
            i90Var2.C0(kb0VarE);
            i90Var2.C0(kb0VarE);
        } else {
            if (i2 <= 0) {
                long jD2 = i90Var.D(kb0Var4);
                if (kb0VarE == null) {
                    kb0VarE = jD2 == -1 ? f(oi5.Y) : e(i90Var.u(jD2));
                }
                if (dh3.f(kb0VarE, kb0Var) && i90Var.Y >= 2) {
                    j = -1;
                    if (i90Var.u(1L) == 58 && (('a' <= (cU = (char) i90Var.u(0L)) && cU < '{') || ('A' <= cU && cU < '['))) {
                        if (jD2 == 2) {
                            i90Var2.write(i90Var, 3L);
                        } else {
                            i90Var2.write(i90Var, 2L);
                        }
                    }
                }
                if (i90Var2.Y > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zF = i90Var.F();
                    kb0Var2 = d;
                    if (!zF) {
                        break;
                    }
                    jD = i90Var.D(kb0Var4);
                    if (jD == j) {
                        kb0VarS = i90Var.s(i90Var.Y);
                    } else {
                        kb0VarS = i90Var.s(jD);
                        i90Var.readByte();
                    }
                    kb0Var3 = e;
                    if (dh3.f(kb0VarS, kb0Var3)) {
                        if (z2 || !arrayList.isEmpty()) {
                            if (z || (!z2 && (arrayList.isEmpty() || dh3.f(wv0.A0(arrayList), kb0Var3)))) {
                                arrayList.add(kb0VarS);
                            } else if (!z3 || arrayList.size() != 1) {
                                bw0.k0(arrayList);
                            }
                        }
                    } else if (dh3.f(kb0VarS, kb0Var2) && !dh3.f(kb0VarS, kb0.f0)) {
                        arrayList.add(kb0VarS);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        i90Var2.C0(kb0VarE);
                    }
                    i90Var2.C0((kb0) arrayList.get(i));
                }
                if (i90Var2.Y == 0) {
                    i90Var2.C0(kb0Var2);
                }
                return new oi5(i90Var2.s(i90Var2.Y));
            }
            kb0VarE.getClass();
            i90Var2.C0(kb0VarE);
        }
        j = -1;
        if (i90Var2.Y > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zF = i90Var.F();
            kb0Var2 = d;
            if (!zF) {
                break;
                break;
            }
            jD = i90Var.D(kb0Var4);
            if (jD == j) {
                kb0VarS = i90Var.s(i90Var.Y);
            } else {
                kb0VarS = i90Var.s(jD);
                i90Var.readByte();
            }
            kb0Var3 = e;
            if (dh3.f(kb0VarS, kb0Var3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(kb0VarS);
            } else if (dh3.f(kb0VarS, kb0Var2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                i90Var2.C0(kb0VarE);
            }
            i90Var2.C0((kb0) arrayList.get(i));
        }
        if (i90Var2.Y == 0) {
            i90Var2.C0(kb0Var2);
        }
        return new oi5(i90Var2.s(i90Var2.Y));
    }

    public static final kb0 e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        bt.q(pc6.j(b2, "not a directory separator: "));
        return null;
    }

    public static final kb0 f(String str) {
        if (dh3.f(str, "/")) {
            return a;
        }
        if (dh3.f(str, "\\")) {
            return b;
        }
        bt.q(oi0.l("not a directory separator: ", str));
        return null;
    }
}
