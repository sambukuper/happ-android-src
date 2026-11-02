package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum gr3 {
    /* JADX INFO: Fake field, exist only in values array */
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    /* JADX INFO: Fake field, exist only in values array */
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_NAME("]", 4),
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    /* JADX INFO: Fake field, exist only in values array */
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    /* JADX INFO: Fake field, exist only in values array */
    VALUE_TRUE("true", 9),
    /* JADX INFO: Fake field, exist only in values array */
    VALUE_FALSE("false", 10),
    /* JADX INFO: Fake field, exist only in values array */
    VALUE_NULL("null", 11);

    public final char[] X;
    public final byte[] Y;
    public final boolean Z;

    gr3(String str, int i) {
        if (str == null) {
            this.X = null;
            this.Y = null;
        } else {
            char[] charArray = str.toCharArray();
            this.X = charArray;
            int length = charArray.length;
            this.Y = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                this.Y[i2] = (byte) this.X[i2];
            }
        }
        if (i != 10) {
        }
        if (i != 7) {
        }
        this.Z = i == 1 || i == 3;
    }
}
