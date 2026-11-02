package defpackage;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ae0 extends ne0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public ae0(Constructor constructor) {
        Class declaringClass = constructor.getDeclaringClass();
        declaringClass.getClass();
        super(constructor, declaringClass, vr3.y(constructor));
    }

    @Override // defpackage.wd0
    public final Object d(Object[] objArr) {
        e(objArr.length);
        return ((Constructor) this.c).newInstance(Arrays.copyOf(objArr, objArr.length));
    }
}
