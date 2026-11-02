package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ne1 {
    public static final kh1 a;

    static {
        String property;
        hv2 hv2Var;
        kh1 kh1Var;
        int i = r08.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            nf1 nf1Var = tp1.a;
            hv2Var = dm4.a;
            hv2 hv2Var2 = hv2Var.h0;
            if (hv2Var == null) {
                kh1Var = hv2Var;
                kh1Var = me1.m0;
            }
        } else {
            kh1Var = me1.m0;
        }
        kh1Var = hv2Var;
        a = kh1Var;
    }
}
