package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b24 implements Comparable {
    public static final b24 g0 = new b24(2, 4, 20);
    public final byte X;
    public final byte Y;
    public final byte Z;
    public final int f0;

    /* JADX WARN: Multi-variable type inference failed */
    public b24(int i, int i2, int i3) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.f0 = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b24 b24Var = (b24) obj;
        b24Var.getClass();
        return this.f0 - b24Var.f0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b24 b24Var = obj instanceof b24 ? (b24) obj : null;
        return b24Var != null && this.f0 == b24Var.f0;
    }

    public final int hashCode() {
        return this.f0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((int) this.X);
        sb.append('.');
        sb.append((int) this.Y);
        sb.append('.');
        sb.append((int) this.Z);
        return sb.toString();
    }
}
