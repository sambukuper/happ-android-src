package defpackage;

import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oy implements d63 {
    public final d18 a;
    public final long b;
    public final int c;
    public final Matrix d;
    public final int e;

    public oy(d18 d18Var, long j, int i, Matrix matrix, int i2) {
        if (d18Var == null) {
            b61.i("Null tagBundle");
            throw null;
        }
        this.a = d18Var;
        this.b = j;
        this.c = i;
        this.d = matrix;
        this.e = i2;
    }

    @Override // defpackage.d63
    public final d18 a() {
        return this.a;
    }

    @Override // defpackage.d63
    public final int b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oy)) {
            return false;
        }
        oy oyVar = (oy) obj;
        return this.a.equals(oyVar.a) && this.b == oyVar.b && this.c == oyVar.c && this.d.equals(oyVar.d) && this.e == oyVar.e;
    }

    @Override // defpackage.d63
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return this.e ^ ((((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", rotationDegrees=");
        sb.append(this.c);
        sb.append(", sensorToBufferTransformMatrix=");
        sb.append(this.d);
        sb.append(", flashState=");
        return oi0.n(sb, this.e, "}");
    }
}
