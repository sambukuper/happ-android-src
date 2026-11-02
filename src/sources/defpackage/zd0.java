package defpackage;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zd0 extends ne0 implements y70 {
    public final Object e;

    /* JADX WARN: Illegal instructions before constructor call */
    public zd0(Constructor constructor, Object obj) {
        Class declaringClass = constructor.getDeclaringClass();
        declaringClass.getClass();
        super(constructor, declaringClass, vr3.y(constructor));
        this.e = obj;
    }

    @Override // defpackage.wd0
    public final Object d(Object[] objArr) {
        e(objArr.length + 1);
        Constructor constructor = (Constructor) this.c;
        ps psVar = new ps(2);
        psVar.b(this.e);
        psVar.c(objArr);
        ArrayList arrayList = psVar.b;
        return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
    }
}
