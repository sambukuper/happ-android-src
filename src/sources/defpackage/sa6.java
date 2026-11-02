package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sa6 extends no2 implements gn2 {
    public static final sa6 X = new sa6(1, cb6.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        Method method = (Method) obj;
        method.getClass();
        return new cb6(method);
    }
}
