package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rp4 {
    public static final qp4 a;
    public static final qp4 b;

    static {
        l06 l06Var = l06.c;
        qp4 qp4Var = null;
        try {
            qp4Var = (qp4) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = qp4Var;
        b = new qp4();
    }
}
