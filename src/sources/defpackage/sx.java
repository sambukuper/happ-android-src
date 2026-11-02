package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sx {
    public final int a;
    public final long b;

    public sx(int i, long j) {
        if (i == 0) {
            b61.i("Null status");
            throw null;
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sx)) {
            return false;
        }
        sx sxVar = (sx) obj;
        return p61.a(this.a, sxVar.a) && this.b == sxVar.b;
    }

    public final int hashCode() {
        int iB = (p61.B(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ iB;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(p61.C(this.a));
        sb.append(", nextRequestWaitMillis=");
        return ie2.g(this.b, "}", sb);
    }
}
