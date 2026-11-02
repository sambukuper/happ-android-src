package defpackage;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ws0 implements PrivilegedAction {
    public final /* synthetic */ byte a;

    public /* synthetic */ ws0(byte b) {
        this.a = b;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                return new xs0((byte) 0);
            case 1:
                return g33.class.getResourceAsStream("/com/ibm/icu/ICUConfig.properties");
            default:
                return System.getProperty("line.separator");
        }
    }
}
