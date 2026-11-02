package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bm implements tm, Serializable {
    public final Class X;
    public final Class Y;
    public final Annotation Z;
    public final Annotation f0;

    public bm(Class cls, Annotation annotation, Class cls2, Annotation annotation2) {
        this.X = cls;
        this.Z = annotation;
        this.Y = cls2;
        this.f0 = annotation2;
    }

    @Override // defpackage.tm
    public final Annotation a(Class cls) {
        if (this.X == cls) {
            return this.Z;
        }
        if (this.Y == cls) {
            return this.f0;
        }
        return null;
    }

    @Override // defpackage.tm
    public final int size() {
        return 2;
    }
}
