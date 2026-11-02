package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f44 extends Number {
    public final String X;

    public f44(String str) {
        this.X = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.X);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f44) {
            return this.X.equals(((f44) obj).X);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.X);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.X;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return z91.K(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.X;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return z91.K(str).longValue();
        }
    }

    public final String toString() {
        return this.X;
    }
}
