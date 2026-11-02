package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bh5 extends no2 implements gn2 {
    public static final bh5 X = new bh5(1, vj8.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        Type type = (Type) obj;
        type.getClass();
        return vj8.w0(type);
    }
}
