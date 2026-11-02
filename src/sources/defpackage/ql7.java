package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ql7 implements CharSequence {
    public char[] X;
    public String Y;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.X[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.X.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.X, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.Y;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.X);
        this.Y = str2;
        return str2;
    }
}
