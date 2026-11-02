package io.sentry.rrweb;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public c X;
    public long Y = System.currentTimeMillis();

    public b(c cVar) {
        this.X = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.Y == bVar.Y && this.X == bVar.X;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, Long.valueOf(this.Y)});
    }
}
