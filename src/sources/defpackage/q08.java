package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q08 {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
        Object rj6Var;
        Object rj6Var2;
        Object rj6Var3;
        try {
            rj6Var = System.getProperty("kotlin.reflect.jvm.useK1Implementation");
        } catch (Throwable th) {
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            rj6Var = null;
        }
        String str = (String) rj6Var;
        boolean z = false;
        a = str != null && Boolean.parseBoolean(str);
        try {
            rj6Var2 = System.getProperty("kotlin.reflect.jvm.newFakeOverridesImplementation");
        } catch (Throwable th2) {
            rj6Var2 = new rj6(th2);
        }
        if (rj6Var2 instanceof rj6) {
            rj6Var2 = null;
        }
        String str2 = (String) rj6Var2;
        b = str2 != null && Boolean.parseBoolean(str2);
        try {
            rj6Var3 = System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly");
        } catch (Throwable th3) {
            rj6Var3 = new rj6(th3);
        }
        String str3 = (String) (rj6Var3 instanceof rj6 ? null : rj6Var3);
        if (str3 != null && Boolean.parseBoolean(str3)) {
            z = true;
        }
        c = z;
    }
}
