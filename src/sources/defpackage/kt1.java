package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kt1 implements Comparable {
    public final float X;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.X, ((kt1) obj).X);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kt1) {
            return Float.compare(this.X, ((kt1) obj).X) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.X);
    }

    public final String toString() {
        return c(this.X);
    }
}
