package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r13 implements o42 {
    public final l95 a;
    public final p76 b;
    public final ba0 c;
    public final aa0 d;
    public byte e;
    public final kr0 f;
    public nz2 g;

    public r13(l95 l95Var, p76 p76Var, j76 j76Var, i76 i76Var) {
        j76Var.getClass();
        i76Var.getClass();
        this.a = l95Var;
        this.b = p76Var;
        this.c = j76Var;
        this.d = i76Var;
        this.f = new kr0(j76Var);
    }

    @Override // defpackage.o42
    public final je7 a(zf6 zf6Var) {
        if (!s23.a(zf6Var)) {
            return e(0L);
        }
        if ("chunked".equalsIgnoreCase(zf6.g(zf6Var, "Transfer-Encoding"))) {
            u23 u23Var = (u23) zf6Var.X.Y;
            if (this.e == 4) {
                this.e = (byte) 5;
                return new o13(this, u23Var);
            }
            kp5.p(this.e, "state: ");
            return null;
        }
        long jI = ks8.i(zf6Var);
        if (jI != -1) {
            return e(jI);
        }
        if (this.e != 4) {
            kp5.p(this.e, "state: ");
            return null;
        }
        this.e = (byte) 5;
        this.b.k();
        return new q13(this);
    }

    @Override // defpackage.o42
    public final long b(zf6 zf6Var) {
        if (!s23.a(zf6Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(zf6.g(zf6Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return ks8.i(zf6Var);
    }

    @Override // defpackage.o42
    public final p76 c() {
        return this.b;
    }

    @Override // defpackage.o42
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket != null) {
            ks8.d(socket);
        }
    }

    @Override // defpackage.o42
    public final void d(y5 y5Var) {
        Proxy.Type type = this.b.b.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((String) y5Var.Z);
        sb.append(' ');
        u23 u23Var = (u23) y5Var.Y;
        if (u23Var.i || type != Proxy.Type.HTTP) {
            String strB = u23Var.b();
            String strD = u23Var.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(u23Var);
        }
        sb.append(" HTTP/1.1");
        f((nz2) y5Var.g0, sb.toString());
    }

    public final p13 e(long j) {
        if (this.e == 4) {
            this.e = (byte) 5;
            return new p13(this, j);
        }
        kp5.p(this.e, "state: ");
        return null;
    }

    public final void f(nz2 nz2Var, String str) {
        if (this.e != 0) {
            kp5.p(this.e, "state: ");
            return;
        }
        aa0 aa0Var = this.d;
        aa0Var.f0(str).f0("\r\n");
        int size = nz2Var.size();
        for (int i = 0; i < size; i++) {
            aa0Var.f0(nz2Var.b(i)).f0(": ").f0(nz2Var.e(i)).f0("\r\n");
        }
        aa0Var.f0("\r\n");
        this.e = (byte) 1;
    }

    @Override // defpackage.o42
    public final void finishRequest() {
        this.d.flush();
    }

    @Override // defpackage.o42
    public final void flushRequest() {
        this.d.flush();
    }

    @Override // defpackage.o42
    public final yf6 readResponseHeaders(boolean z) {
        kr0 kr0Var = this.f;
        byte b = this.e;
        t23 t23Var = null;
        if (b != 1 && b != 2 && b != 3) {
            kp5.p(this.e, "state: ");
            return null;
        }
        try {
            String strV = ((ba0) kr0Var.c).V(kr0Var.b);
            kr0Var.b -= (long) strV.length();
            ne neVarD = jb5.D(strV);
            int i = neVarD.b;
            yf6 yf6Var = new yf6();
            yf6Var.b = (p06) neVarD.c;
            yf6Var.c = i;
            yf6Var.d = (String) neVarD.d;
            yf6Var.f = kr0Var.h().c();
            if (z && i == 100) {
                return null;
            }
            if (i == 100) {
                this.e = (byte) 3;
                return yf6Var;
            }
            if (102 > i || i >= 200) {
                this.e = (byte) 4;
                return yf6Var;
            }
            this.e = (byte) 3;
            return yf6Var;
        } catch (EOFException e) {
            u23 u23Var = this.b.b.a.h;
            try {
                t23 t23Var2 = new t23((byte) 0);
                t23Var2.f(u23Var, "/...");
                t23Var = t23Var2;
            } catch (IllegalArgumentException unused) {
            }
            t23Var.getClass();
            t23Var.d = k32.b(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0, 251, " \"':;<=>@[]^`{}|/\\?#");
            t23Var.e = k32.b(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0, 251, " \"':;<=>@[]^`{}|/\\?#");
            throw new IOException("unexpected end of stream on ".concat(t23Var.b().h), e);
        }
    }
}
