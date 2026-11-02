package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface xr6 extends AutoCloseable {
    boolean S0();

    void T(int i, String str);

    default boolean W() {
        return getLong(0) != 0;
    }

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    void h(int i, double d);

    void i(int i, long j);

    boolean isNull(int i);

    void j(int i, byte[] bArr);

    void l(int i);

    String p0(int i);

    void reset();
}
