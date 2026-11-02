package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Header;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i23 implements o42 {
    public static final List g = ks8.j("connection", MetaParams.HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);
    public static final List h = ks8.j("connection", MetaParams.HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final p76 a;
    public final y76 b;
    public final h23 c;
    public volatile o23 d;
    public final p06 e;
    public volatile boolean f;

    public i23(l95 l95Var, p76 p76Var, y76 y76Var, h23 h23Var) {
        h23Var.getClass();
        this.a = p76Var;
        this.b = y76Var;
        this.c = h23Var;
        List list = l95Var.n0;
        p06 p06Var = p06.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(p06Var) ? p06Var : p06.HTTP_2;
    }

    @Override // defpackage.o42
    public final je7 a(zf6 zf6Var) {
        o23 o23Var = this.d;
        o23Var.getClass();
        return o23Var.i;
    }

    @Override // defpackage.o42
    public final long b(zf6 zf6Var) {
        if (s23.a(zf6Var)) {
            return ks8.i(zf6Var);
        }
        return 0L;
    }

    @Override // defpackage.o42
    public final p76 c() {
        return this.a;
    }

    @Override // defpackage.o42
    public final void cancel() {
        this.f = true;
        o23 o23Var = this.d;
        if (o23Var != null) {
            o23Var.e(9);
        }
    }

    @Override // defpackage.o42
    public final void d(y5 y5Var) throws IOException {
        int i;
        o23 o23Var;
        if (this.d != null) {
            return;
        }
        nz2 nz2Var = (nz2) y5Var.g0;
        ArrayList arrayList = new ArrayList(nz2Var.size() + 4);
        arrayList.add(new kz2(kz2.f, (String) y5Var.Z));
        kb0 kb0Var = kz2.g;
        u23 u23Var = (u23) y5Var.Y;
        u23Var.getClass();
        String strB = u23Var.b();
        String strD = u23Var.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new kz2(kb0Var, strB));
        String strA = nz2Var.a("Host");
        if (strA != null) {
            arrayList.add(new kz2(kz2.i, strA));
        }
        arrayList.add(new kz2(kz2.h, u23Var.a));
        int size = nz2Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strB2 = nz2Var.b(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strB2.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && dh3.f(nz2Var.e(i2), "trailers"))) {
                arrayList.add(new kz2(lowerCase, nz2Var.e(i2)));
            }
        }
        h23 h23Var = this.c;
        h23Var.getClass();
        boolean z = !false;
        synchronized (h23Var.y0) {
            synchronized (h23Var) {
                try {
                    if (h23Var.g0 > 1073741823) {
                        h23Var.p(8);
                    }
                    if (h23Var.h0) {
                        throw new y11();
                    }
                    i = h23Var.g0;
                    h23Var.g0 = i + 2;
                    o23Var = new o23(i, h23Var, z, false, null);
                    if (o23Var.g()) {
                        h23Var.Y.put(Integer.valueOf(i), o23Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            h23Var.y0.u(z, i, arrayList);
        }
        h23Var.y0.flush();
        this.d = o23Var;
        boolean z2 = this.f;
        o23 o23Var2 = this.d;
        if (z2) {
            o23Var2.getClass();
            o23Var2.e(9);
            u52.s("Canceled");
            return;
        }
        o23Var2.getClass();
        n23 n23Var = o23Var2.k;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        n23Var.timeout(j, timeUnit);
        o23 o23Var3 = this.d;
        o23Var3.getClass();
        o23Var3.l.timeout(this.b.h, timeUnit);
    }

    @Override // defpackage.o42
    public final void finishRequest() {
        o23 o23Var = this.d;
        o23Var.getClass();
        synchronized (o23Var) {
            if (!o23Var.h && !o23Var.f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        o23Var.j.close();
    }

    @Override // defpackage.o42
    public final void flushRequest() {
        this.c.y0.flush();
    }

    @Override // defpackage.o42
    public final yf6 readResponseHeaders(boolean z) throws IOException {
        nz2 nz2Var;
        o23 o23Var = this.d;
        if (o23Var == null) {
            u52.s("stream wasn't created");
            return null;
        }
        synchronized (o23Var) {
            o23Var.k.enter();
            while (o23Var.g.isEmpty() && o23Var.m == 0) {
                try {
                    try {
                        o23Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    o23Var.k.exitAndThrowIfTimedOut();
                    throw th;
                }
            }
            o23Var.k.exitAndThrowIfTimedOut();
            if (o23Var.g.isEmpty()) {
                IOException iOException = o23Var.n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = o23Var.m;
                if (i != 0) {
                    throw new el7(i);
                }
                throw null;
            }
            Object objRemoveFirst = o23Var.g.removeFirst();
            objRemoveFirst.getClass();
            nz2Var = (nz2) objRemoveFirst;
        }
        p06 p06Var = this.e;
        ArrayList arrayList = new ArrayList(20);
        int size = nz2Var.size();
        ne neVarD = null;
        for (int i2 = 0; i2 < size; i2++) {
            String strB = nz2Var.b(i2);
            String strE = nz2Var.e(i2);
            if (dh3.f(strB, Header.RESPONSE_STATUS_UTF8)) {
                neVarD = jb5.D("HTTP/1.1 " + strE);
            } else if (!h.contains(strB)) {
                strB.getClass();
                strE.getClass();
                arrayList.add(strB);
                arrayList.add(fm7.R0(strE).toString());
            }
        }
        if (neVarD == null) {
            xw3.k("Expected ':status' header not present");
            return null;
        }
        yf6 yf6Var = new yf6();
        yf6Var.b = p06Var;
        yf6Var.c = neVarD.b;
        yf6Var.d = (String) neVarD.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        ps psVar = new ps((byte) 1);
        bw0.e0(psVar.b, strArr);
        yf6Var.f = psVar;
        if (z && yf6Var.c == 100) {
            return null;
        }
        return yf6Var;
    }
}
