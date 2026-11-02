package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jb4 {
    public static final ib4 a;
    public static final ib4 b;

    static {
        l06 l06Var = l06.c;
        ib4 ib4Var = null;
        try {
            ib4Var = (ib4) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = ib4Var;
        b = new ib4();
    }
}
