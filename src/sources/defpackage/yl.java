package defpackage;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yl extends ch3 {
    public final HashMap i;

    public yl(Class cls, Annotation annotation, Class cls2, Annotation annotation2) {
        HashMap map = new HashMap();
        this.i = map;
        map.put(cls, annotation);
        map.put(cls2, annotation2);
    }

    @Override // defpackage.ch3
    public final boolean L(Annotation annotation) {
        return this.i.containsKey(annotation.annotationType());
    }

    @Override // defpackage.ch3
    public final ch3 g(Annotation annotation) {
        this.i.put(annotation.annotationType(), annotation);
        return this;
    }

    @Override // defpackage.ch3
    public final yr2 i() {
        yr2 yr2Var = new yr2((byte) 5, false);
        for (Annotation annotation : this.i.values()) {
            HashMap map = (HashMap) yr2Var.Y;
            if (map == null) {
                map = new HashMap();
                yr2Var.Y = map;
            }
            Annotation annotation2 = (Annotation) map.put(annotation.annotationType(), annotation);
            if (annotation2 != null) {
                annotation2.equals(annotation);
            }
        }
        return yr2Var;
    }

    @Override // defpackage.ch3
    public final tm j() {
        HashMap map = this.i;
        if (map.size() != 2) {
            return new yr2(map, (byte) 5);
        }
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        Map.Entry entry2 = (Map.Entry) it.next();
        return new bm((Class) entry.getKey(), (Annotation) entry.getValue(), (Class) entry2.getKey(), (Annotation) entry2.getValue());
    }
}
