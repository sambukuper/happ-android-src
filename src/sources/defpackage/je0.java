package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class je0 extends ee0 implements y70 {
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je0(Method method, Object obj) {
        super(method, false, 4);
        method.getClass();
        this.f = obj;
    }

    @Override // defpackage.ee0, defpackage.wd0
    public final Object d(Object[] objArr) {
        e(objArr.length);
        return h(this.f, objArr);
    }
}
