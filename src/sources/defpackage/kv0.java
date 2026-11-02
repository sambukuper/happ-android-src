package defpackage;

import java.nio.charset.Charset;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kv0 {
    public final jv0 a;
    public int b;
    public int c;
    public int d = 0;

    public kv0(jv0 jv0Var) {
        Charset charset = eg3.a;
        this.a = jv0Var;
        jv0Var.Y = this;
    }

    public final int a() {
        int iY = this.d;
        if (iY != 0) {
            this.b = iY;
            this.d = 0;
        } else {
            iY = this.a.y();
            this.b = iY;
        }
        if (iY == 0 || iY == this.c) {
            return Integer.MAX_VALUE;
        }
        return iY >>> 3;
    }

    public final void b(Object obj, bx6 bx6Var, s62 s62Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            bx6Var.e(obj, this, s62Var);
            if (this.b != this.c) {
                throw new qh3("Failed to parse the message.");
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public final void c(Object obj, bx6 bx6Var, s62 s62Var) throws qh3 {
        jv0 jv0Var = this.a;
        int iZ = jv0Var.z();
        if (jv0Var.X >= 100) {
            throw new qh3("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i = jv0Var.i(iZ);
        jv0Var.X++;
        bx6Var.e(obj, this, s62Var);
        jv0Var.a(0);
        jv0Var.X--;
        jv0Var.h(i);
    }

    public final void d(cg3 cg3Var) throws qh3 {
        int iY;
        int i = this.b & 7;
        jv0 jv0Var = this.a;
        if (i == 0) {
            do {
                ((m06) cg3Var).add(Boolean.valueOf(jv0Var.j()));
                if (jv0Var.c()) {
                    return;
                } else {
                    iY = jv0Var.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw qh3.b();
        }
        int iB = jv0Var.b() + jv0Var.z();
        do {
            ((m06) cg3Var).add(Boolean.valueOf(jv0Var.j()));
        } while (jv0Var.b() < iB);
        v(iB);
    }

    public final hb0 e() throws qh3.a {
        w(2);
        return this.a.k();
    }

    public final void f(cg3 cg3Var) throws qh3.a {
        int iY;
        if ((this.b & 7) != 2) {
            throw qh3.b();
        }
        do {
            ((m06) cg3Var).add(e());
            jv0 jv0Var = this.a;
            if (jv0Var.c()) {
                return;
            } else {
                iY = jv0Var.y();
            }
        } while (iY == this.b);
        this.d = iY;
    }

    public final void g(cg3 cg3Var) throws qh3 {
        int iY;
        int i = this.b & 7;
        jv0 jv0Var = this.a;
        if (i == 1) {
            do {
                ((m06) cg3Var).add(Double.valueOf(jv0Var.l()));
                if (jv0Var.c()) {
                    return;
                } else {
                    iY = jv0Var.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw qh3.b();
        }
        int iZ = jv0Var.z();
        if ((iZ & 7) != 0) {
            throw new qh3("Failed to parse the message.");
        }
        int iB = jv0Var.b() + iZ;
        do {
            ((m06) cg3Var).add(Double.valueOf(jv0Var.l()));
        } while (jv0Var.b() < iB);
    }

    public final void h(cg3 cg3Var) throws qh3 {
        int iY;
        int i = this.b & 7;
        jv0 jv0Var = this.a;
        if (i == 0) {
            do {
                ((m06) cg3Var).add(Integer.valueOf(jv0Var.m()));
                if (jv0Var.c()) {
                    return;
                } else {
                    iY = jv0Var.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw qh3.b();
        }
        int iB = jv0Var.b() + jv0Var.z();
        do {
            ((m06) cg3Var).add(Integer.valueOf(jv0Var.m()));
        } while (jv0Var.b() < iB);
        v(iB);
    }

    public final Object i(b39 b39Var, Class cls, s62 s62Var) throws qh3 {
        int iOrdinal = b39Var.ordinal();
        jv0 jv0Var = this.a;
        switch (iOrdinal) {
            case 0:
                w(1);
                return Double.valueOf(jv0Var.l());
            case 1:
                w(5);
                return Float.valueOf(jv0Var.p());
            case 2:
                w(0);
                return Long.valueOf(jv0Var.r());
            case 3:
                w(0);
                return Long.valueOf(jv0Var.A());
            case 4:
                w(0);
                return Integer.valueOf(jv0Var.q());
            case 5:
                w(1);
                return Long.valueOf(jv0Var.o());
            case 6:
                w(5);
                return Integer.valueOf(jv0Var.n());
            case 7:
                w(0);
                return Boolean.valueOf(jv0Var.j());
            case 8:
                w(2);
                return jv0Var.x();
            case 9:
            default:
                bt.q("unsupported field type.");
                return null;
            case 10:
                w(2);
                bx6 bx6VarA = l06.c.a(cls);
                cq2 cq2VarI = bx6VarA.i();
                c(cq2VarI, bx6VarA, s62Var);
                bx6VarA.b(cq2VarI);
                return cq2VarI;
            case 11:
                return e();
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                w(0);
                return Integer.valueOf(jv0Var.z());
            case 13:
                w(0);
                return Integer.valueOf(jv0Var.m());
            case 14:
                w(5);
                return Integer.valueOf(jv0Var.s());
            case 15:
                w(1);
                return Long.valueOf(jv0Var.t());
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                w(0);
                return Integer.valueOf(jv0Var.u());
            case 17:
                w(0);
                return Long.valueOf(jv0Var.v());
        }
    }

    public final void j(cg3 cg3Var) throws qh3 {
        int iY;
        int i = this.b & 7;
        jv0 jv0Var = this.a;
        if (i == 2) {
            int iZ = jv0Var.z();
            if ((iZ & 3) != 0) {
                throw new qh3("Failed to parse the message.");
            }
            int iB = jv0Var.b() + iZ;
            do {
                ((m06) cg3Var).add(Integer.valueOf(jv0Var.n()));
            } while (jv0Var.b() < iB);
            return;
        }
        if (i != 5) {
            throw qh3.b();
        }
        do {
            ((m06) cg3Var).add(Integer.valueOf(jv0Var.n()));
            if (jv0Var.c()) {
                return;
            } else {
                iY = jv0Var.y();
            }
        } while (iY == this.b);
        this.d = iY;
    }

    public final void k(cg3 cg3Var) throws qh3 {
        int iY;
        int i = this.b & 7;
        jv0 jv0Var = this.a;
        if (i == 1) {
            do {
                ((m06) cg3Var).add(Long.valueOf(jv0Var.o()));
                if (jv0Var.c()) {
                    return;
                } else {
                    iY = jv0Var.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw qh3.b();
        }
        int iZ = jv0Var.z();
        if ((iZ & 7) != 0) {
            throw new qh3("Failed to parse the message.");
        }
        int iB = jv0Var.b() + iZ;
        do {
            ((m06) cg3Var).add(Long.valueOf(jv0Var.o()));
        } while (jv0Var.b() < iB);
    }

    public final void l(cg3 cg3Var) throws qh3 {
        int iY;
        int i = this.b & 7;
        jv0 jv0Var = this.a;
        if (i == 2) {
            int iZ = jv0Var.z();
            if ((iZ & 3) != 0) {
                throw new qh3("Failed to parse the message.");
            }
            int iB = jv0Var.b() + iZ;
            do {
                ((m06) cg3Var).add(Float.valueOf(jv0Var.p()));
            } while (jv0Var.b() < iB);
            return;
        }
        if (i != 5) {
            throw qh3.b();
        }
        do {
            ((m06) cg3Var).add(Float.valueOf(jv0Var.p()));
            if (jv0Var.c()) {
                return;
            } else {
                iY = jv0Var.y();
            }
        } while (iY == this.b);
        this.d = iY;
    }

    public final void m(cg3 cg3Var) throws qh3 {
        int iY;
        int i = this.b & 7;
        jv0 jv0Var = this.a;
        if (i == 0) {
            do {
                ((m06) cg3Var).add(Integer.valueOf(jv0Var.q()));
                if (jv0Var.c()) {
                    return;
                } else {
                    iY = jv0Var.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw qh3.b();
        }
        int iB = jv0Var.b() + jv0Var.z();
        do {
            ((m06) cg3Var).add(Integer.valueOf(jv0Var.q()));
        } while (jv0Var.b() < iB);
        v(iB);
    }

    public final void n(cg3 cg3Var) throws qh3 {
        int iY;
        int i = this.b & 7;
        jv0 jv0Var = this.a;
        if (i == 0) {
            do {
                ((m06) cg3Var).add(Long.valueOf(jv0Var.r()));
                if (jv0Var.c()) {
                    return;
                } else {
                    iY = jv0Var.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw qh3.b();
        }
        int iB = jv0Var.b() + jv0Var.z();
        do {
            ((m06) cg3Var).add(Long.valueOf(jv0Var.r()));
        } while (jv0Var.b() < iB);
        v(iB);
    }

    public final void o(cg3 cg3Var) throws qh3 {
        int iY;
        int i = this.b & 7;
        jv0 jv0Var = this.a;
        if (i == 2) {
            int iZ = jv0Var.z();
            if ((iZ & 3) != 0) {
                throw new qh3("Failed to parse the message.");
            }
            int iB = jv0Var.b() + iZ;
            do {
                ((m06) cg3Var).add(Integer.valueOf(jv0Var.s()));
            } while (jv0Var.b() < iB);
            return;
        }
        if (i != 5) {
            throw qh3.b();
        }
        do {
            ((m06) cg3Var).add(Integer.valueOf(jv0Var.s()));
            if (jv0Var.c()) {
                return;
            } else {
                iY = jv0Var.y();
            }
        } while (iY == this.b);
        this.d = iY;
    }

    public final void p(cg3 cg3Var) throws qh3 {
        int iY;
        int i = this.b & 7;
        jv0 jv0Var = this.a;
        if (i == 1) {
            do {
                ((m06) cg3Var).add(Long.valueOf(jv0Var.t()));
                if (jv0Var.c()) {
                    return;
                } else {
                    iY = jv0Var.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw qh3.b();
        }
        int iZ = jv0Var.z();
        if ((iZ & 7) != 0) {
            throw new qh3("Failed to parse the message.");
        }
        int iB = jv0Var.b() + iZ;
        do {
            ((m06) cg3Var).add(Long.valueOf(jv0Var.t()));
        } while (jv0Var.b() < iB);
    }

    public final void q(cg3 cg3Var) throws qh3 {
        int iY;
        int i = this.b & 7;
        jv0 jv0Var = this.a;
        if (i == 0) {
            do {
                ((m06) cg3Var).add(Integer.valueOf(jv0Var.u()));
                if (jv0Var.c()) {
                    return;
                } else {
                    iY = jv0Var.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw qh3.b();
        }
        int iB = jv0Var.b() + jv0Var.z();
        do {
            ((m06) cg3Var).add(Integer.valueOf(jv0Var.u()));
        } while (jv0Var.b() < iB);
        v(iB);
    }

    public final void r(cg3 cg3Var) throws qh3 {
        int iY;
        int i = this.b & 7;
        jv0 jv0Var = this.a;
        if (i == 0) {
            do {
                ((m06) cg3Var).add(Long.valueOf(jv0Var.v()));
                if (jv0Var.c()) {
                    return;
                } else {
                    iY = jv0Var.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw qh3.b();
        }
        int iB = jv0Var.b() + jv0Var.z();
        do {
            ((m06) cg3Var).add(Long.valueOf(jv0Var.v()));
        } while (jv0Var.b() < iB);
        v(iB);
    }

    public final void s(cg3 cg3Var, boolean z) throws qh3.a {
        String strW;
        int iY;
        if ((this.b & 7) != 2) {
            throw qh3.b();
        }
        do {
            jv0 jv0Var = this.a;
            if (z) {
                w(2);
                strW = jv0Var.x();
            } else {
                w(2);
                strW = jv0Var.w();
            }
            ((m06) cg3Var).add(strW);
            if (jv0Var.c()) {
                return;
            } else {
                iY = jv0Var.y();
            }
        } while (iY == this.b);
        this.d = iY;
    }

    public final void t(cg3 cg3Var) throws qh3 {
        int iY;
        int i = this.b & 7;
        jv0 jv0Var = this.a;
        if (i == 0) {
            do {
                ((m06) cg3Var).add(Integer.valueOf(jv0Var.z()));
                if (jv0Var.c()) {
                    return;
                } else {
                    iY = jv0Var.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw qh3.b();
        }
        int iB = jv0Var.b() + jv0Var.z();
        do {
            ((m06) cg3Var).add(Integer.valueOf(jv0Var.z()));
        } while (jv0Var.b() < iB);
        v(iB);
    }

    public final void u(cg3 cg3Var) throws qh3 {
        int iY;
        int i = this.b & 7;
        jv0 jv0Var = this.a;
        if (i == 0) {
            do {
                ((m06) cg3Var).add(Long.valueOf(jv0Var.A()));
                if (jv0Var.c()) {
                    return;
                } else {
                    iY = jv0Var.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw qh3.b();
        }
        int iB = jv0Var.b() + jv0Var.z();
        do {
            ((m06) cg3Var).add(Long.valueOf(jv0Var.A()));
        } while (jv0Var.b() < iB);
        v(iB);
    }

    public final void v(int i) throws qh3 {
        if (this.a.b() != i) {
            throw qh3.e();
        }
    }

    public final void w(int i) throws qh3.a {
        if ((this.b & 7) != i) {
            throw qh3.b();
        }
    }

    public final boolean x() {
        int i;
        jv0 jv0Var = this.a;
        if (jv0Var.c() || (i = this.b) == this.c) {
            return false;
        }
        return jv0Var.B(i);
    }
}
