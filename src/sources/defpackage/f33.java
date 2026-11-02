package defpackage;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f33 implements PrivilegedAction {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f33(byte b, Object obj, String str) {
        this.a = b;
        this.c = obj;
        this.b = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        byte b = this.a;
        String str = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((ClassLoader) obj).getResourceAsStream(str);
            default:
                return ((mf6) obj).d.getResourceAsStream(str);
        }
    }
}
