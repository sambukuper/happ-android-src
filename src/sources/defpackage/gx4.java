package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum gx4 {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);

    public final int[] X;
    public final byte Y;

    /* JADX WARN: Multi-variable type inference failed */
    gx4(int[] iArr, int i) {
        this.X = iArr;
        this.Y = i;
    }

    public final int a(av8 av8Var) {
        char c;
        byte b = av8Var.a;
        if (b <= 9) {
            c = 0;
        } else {
            c = b <= 26 ? (char) 1 : (char) 2;
        }
        return this.X[c];
    }
}
