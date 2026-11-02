package defpackage;

import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pa6 extends no2 implements gn2 {
    public static final pa6 X = new pa6(1, wa6.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        Constructor constructor = (Constructor) obj;
        constructor.getClass();
        return new wa6(constructor);
    }
}
