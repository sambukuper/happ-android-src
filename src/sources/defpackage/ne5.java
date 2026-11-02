package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ne5 {
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final me5 f;
    public final pv g = nr4.e(false);

    public ne5(boolean z, long j, long j2, long j3, long j4, me5 me5Var) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = me5Var;
    }

    public final void a(long j, Object obj) {
        if (this.g.a()) {
            this.f.b(obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Output ");
        sb.append(this.d);
        sb.append(" at ");
        sb.append((Object) mm2.a(this.b));
        sb.append(" for ");
        kp5.h(ie2.g(j, " was completed multiple times!", sb));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ne5) {
            ne5 ne5Var = (ne5) obj;
            if (this.a == ne5Var.a && this.b == ne5Var.b && this.c == ne5Var.c && this.d == ne5Var.d && this.e == ne5Var.e && this.f.equals(ne5Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + p61.g(p61.g(p61.g(p61.g(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        return "StartedOutput(isOutOfOrder=" + this.a + ", cameraFrameNumber=" + ((Object) mm2.a(this.b)) + ", cameraTimestamp=" + ((Object) ("CameraTimestamp(value=" + this.c + ')')) + ", cameraOutputSequence=" + this.d + ", cameraOutputNumber=" + this.e + ", outputListener=" + this.f + ')';
    }
}
