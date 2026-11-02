package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vi0 {
    public final String a;

    public static void a(String str) {
        str.getClass();
        if (fm7.o0(str)) {
            bt.q("CameraId cannot be null or blank!");
        }
    }

    public static String b(String str) {
        return oi0.l("CameraId-", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vi0) {
            return dh3.f(this.a, ((vi0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b(this.a);
    }
}
