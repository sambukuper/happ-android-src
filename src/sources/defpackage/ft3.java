package defpackage;

import java.lang.reflect.Method;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ft3 extends dh3 {
    public final List g;

    public ft3(Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        this.g = eu.H0(declaredMethods, new l71((byte) 23));
    }

    @Override // defpackage.dh3
    public final String g() {
        return wv0.y0(this.g, _UrlKt.FRAGMENT_ENCODE_SET, "<init>(", ")V", cl1.p0, 24);
    }
}
