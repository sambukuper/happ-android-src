package io.sentry.protocol;

import defpackage.bt;
import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements n2 {
    public static final w Y = new w("00000000-0000-0000-0000-000000000000".replace("-", _UrlKt.FRAGMENT_ENCODE_SET));
    public volatile String X;

    public w(String str) {
        String str2 = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        if (str2.length() == 32 || str2.length() == 36) {
            this.X = str2.length() == 36 ? str2.replace("-", _UrlKt.FRAGMENT_ENCODE_SET) : str2;
        } else {
            bt.q("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
            throw null;
        }
    }

    public final String a() {
        String strF;
        String str = this.X;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            try {
                strF = this.X;
                if (strF == null) {
                    strF = io.sentry.config.a.f();
                    this.X = strF;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        return a().equals(((w) obj).a());
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
