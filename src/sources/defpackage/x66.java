package defpackage;

import java.security.AccessControlException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x66 implements k04 {
    public static final boolean j0;
    public static final HashMap k0;
    public int[] X;
    public String Y;
    public int Z;
    public String[] f0;
    public String[] g0;
    public String[] h0;
    public a04 i0;

    static {
        try {
            j0 = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            j0 = false;
        }
        HashMap map = new HashMap();
        k0 = map;
        map.put(jb5.S(new fk2("kotlin.jvm.internal.KotlinClass")), a04.CLASS);
        map.put(jb5.S(new fk2("kotlin.jvm.internal.KotlinFileFacade")), a04.FILE_FACADE);
        map.put(jb5.S(new fk2("kotlin.jvm.internal.KotlinMultifileClass")), a04.MULTIFILE_CLASS);
        map.put(jb5.S(new fk2("kotlin.jvm.internal.KotlinMultifileClassPart")), a04.MULTIFILE_CLASS_PART);
        map.put(jb5.S(new fk2("kotlin.jvm.internal.KotlinSyntheticClass")), a04.SYNTHETIC_CLASS);
    }

    @Override // defpackage.k04
    public final i04 f(qs0 qs0Var, ga6 ga6Var) {
        a04 a04Var;
        if (qs0Var.a().equals(ks3.a)) {
            return new y45(this);
        }
        if (j0 || this.i0 != null || (a04Var = (a04) k0.get(qs0Var)) == null) {
            return null;
        }
        this.i0 = a04Var;
        return new lr5((Object) this, (byte) 4);
    }
}
