package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kp3 extends hq3 {
    public final boolean X;
    public final String Y;

    public kp3(String str, boolean z) {
        str.getClass();
        this.X = z;
        this.Y = str.toString();
    }

    @Override // defpackage.hq3
    public final String a() {
        return this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kp3.class != obj.getClass()) {
            return false;
        }
        kp3 kp3Var = (kp3) obj;
        return this.X == kp3Var.X && dh3.f(this.Y, kp3Var.Y);
    }

    public final int hashCode() {
        return this.Y.hashCode() + (Boolean.hashCode(this.X) * 31);
    }

    @Override // defpackage.hq3
    public final String toString() {
        boolean z = this.X;
        String str = this.Y;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        xl7.a(sb, str);
        return sb.toString();
    }
}
