package defpackage;

import java.lang.annotation.Annotation;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class am extends ch3 {
    public Class i;
    public Annotation j;

    @Override // defpackage.ch3
    public final boolean L(Annotation annotation) {
        return annotation.annotationType() == this.i;
    }

    @Override // defpackage.ch3
    public final ch3 g(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Class<? extends Annotation> cls = this.i;
        if (cls != clsAnnotationType) {
            return new yl(cls, this.j, clsAnnotationType, annotation);
        }
        this.j = annotation;
        return this;
    }

    @Override // defpackage.ch3
    public final yr2 i() {
        Class cls = this.i;
        Annotation annotation = this.j;
        HashMap map = new HashMap(4);
        map.put(cls, annotation);
        return new yr2(map, (byte) 5);
    }

    @Override // defpackage.ch3
    public final tm j() {
        return new zl(this.i, this.j);
    }
}
