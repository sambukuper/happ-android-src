package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fp5 {
    public static final fp5 c = new fp5(0, false);
    public final boolean a;
    public final int b;

    public fp5() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp5)) {
            return false;
        }
        fp5 fp5Var = (fp5) obj;
        return this.a == fp5Var.a && this.b == fp5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + nz1.a(this.b) + ")";
    }

    public fp5(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
