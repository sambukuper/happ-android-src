package defpackage;

import java.security.PrivilegedAction;
import java.security.Security;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d33 implements PrivilegedAction {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ d33(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                return System.getProperty(str);
            case 1:
                return Security.getProperty(str);
            default:
                return System.getProperty(str);
        }
    }
}
