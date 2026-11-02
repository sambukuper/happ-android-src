package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ui5 extends jj5 {
    public final float c;
    public final float d;

    public ui5(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui5)) {
            return false;
        }
        ui5 ui5Var = (ui5) obj;
        return Float.compare(this.c, ui5Var.c) == 0 && Float.compare(this.d, ui5Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "LineTo(x=" + this.c + ", y=" + this.d + ")";
    }
}
