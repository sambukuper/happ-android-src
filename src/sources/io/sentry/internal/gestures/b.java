package io.sentry.internal.gestures;

import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final WeakReference a;
    public final String b;
    public final String c;

    public b(Object obj, String str, String str2) {
        this.a = new WeakReference(obj);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return io.sentry.util.b.i(this.b, bVar.b) && io.sentry.util.b.i(this.c, bVar.c) && io.sentry.util.b.i(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, null});
    }
}
