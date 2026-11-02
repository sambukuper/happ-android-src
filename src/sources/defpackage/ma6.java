package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ma6 extends ka6 {
    public final Object[] b;

    public ma6(v15 v15Var, Object[] objArr) {
        super(v15Var);
        this.b = objArr;
    }

    public final ArrayList a() {
        ka6 ua6Var;
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            Class<?> cls = obj.getClass();
            List list = ia6.a;
            if (Enum.class.isAssignableFrom(cls)) {
                ua6Var = new ya6(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                ua6Var = new la6(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                ua6Var = new ma6(null, (Object[]) obj);
            } else {
                ua6Var = obj instanceof Class ? new ua6(null, (Class) obj) : new ab6(null, obj);
            }
            arrayList.add(ua6Var);
        }
        return arrayList;
    }
}
