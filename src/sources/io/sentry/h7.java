package io.sentry;

import java.util.Objects;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h7 implements n2 {
    public static final h7 Y = new h7("00000000-0000-0000-0000-000000000000".replace("-", _UrlKt.FRAGMENT_ENCODE_SET).substring(0, 16));
    public volatile String X;

    public h7(String str) {
        Objects.requireNonNull(str, "value is required");
        this.X = str;
    }

    public final String a() {
        String str;
        String str2 = this.X;
        if (str2 != null) {
            return str2;
        }
        synchronized (this) {
            try {
                str = this.X;
                if (str == null) {
                    byte[] bArr = new byte[8];
                    io.sentry.util.o.a().b(bArr);
                    byte b = (byte) (bArr[6] & 15);
                    bArr[6] = b;
                    bArr[6] = (byte) (b | 64);
                    long j = 0;
                    for (int i = 0; i < 8; i++) {
                        j = (j << 8) | ((long) (bArr[i] & 255));
                    }
                    char[] cArr = new char[16];
                    io.sentry.util.r.a(cArr, j);
                    String str3 = new String(cArr);
                    this.X = str3;
                    str = str3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h7.class != obj.getClass()) {
            return false;
        }
        return a().equals(((h7) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) {
        ((io.sentry.internal.debugmeta.c) r3Var).y(a());
    }

    public final String toString() {
        return a();
    }
}
