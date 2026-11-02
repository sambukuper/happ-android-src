package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class me0 extends ee0 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ me0(Method method, boolean z, int i, byte b) {
        super(method, z, i);
        this.f = b;
    }

    @Override // defpackage.ee0, defpackage.wd0
    public final Object d(Object[] objArr) {
        switch (this.f) {
            case 0:
                e(objArr.length);
                return h(objArr[0], objArr.length <= 1 ? new Object[0] : eu.k0(objArr, 1, objArr.length));
            case 1:
                e(objArr.length);
                g(objArr.length == 0 ? null : objArr[0]);
                return h(null, objArr.length <= 1 ? new Object[0] : eu.k0(objArr, 1, objArr.length));
            default:
                e(objArr.length);
                return h(null, objArr);
        }
    }
}
