package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v62 {
    public static final u62 a = new u62();
    public static final u62 b;

    static {
        l06 l06Var = l06.c;
        u62 u62Var = null;
        try {
            u62Var = (u62) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = u62Var;
    }
}
