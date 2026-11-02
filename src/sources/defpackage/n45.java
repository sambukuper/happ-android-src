package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n45 {
    public static final m45 a;
    public static final m45 b;

    static {
        l06 l06Var = l06.c;
        m45 m45Var = null;
        try {
            m45Var = (m45) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = m45Var;
        b = new m45();
    }
}
