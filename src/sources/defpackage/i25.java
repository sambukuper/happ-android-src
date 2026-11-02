package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i25 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public i25(float f, float f2, float f3, int i, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i25.class == obj.getClass()) {
            i25 i25Var = (i25) obj;
            return this.c == i25Var.c && this.d == i25Var.d && this.b == i25Var.b && this.a == i25Var.a && this.e == i25Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + oi0.e(this.a, pc6.d(pc6.d(Float.hashCode(this.c) * 31, this.d, 31), this.b, 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
