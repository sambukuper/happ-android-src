package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class we1 extends m85 {
    public static final we1 f0;
    public final String Z;
    public final int Y = 2;
    public final char[] X = new char[32];

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = "\n";
        }
        f0 = new we1(property);
    }

    public we1(String str) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            "  ".getChars(0, 2, this.X, i);
            i += 2;
        }
        this.Z = str;
    }

    @Override // defpackage.m85
    public final void c0(r59 r59Var, int i) {
        r59Var.C0(this.Z);
        if (i <= 0) {
            return;
        }
        int length = i * this.Y;
        while (true) {
            char[] cArr = this.X;
            if (length <= cArr.length) {
                r59Var.w1(cArr, length);
                return;
            } else {
                r59Var.w1(cArr, cArr.length);
                length -= cArr.length;
            }
        }
    }
}
