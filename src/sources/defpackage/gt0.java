package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gt0 {
    public final Constructor a;
    public transient Annotation[] b;
    public transient Annotation[][] c;
    public int d = -1;

    public gt0(Constructor constructor) {
        this.a = constructor;
    }

    public final int a() {
        int i = this.d;
        if (i >= 0) {
            return i;
        }
        int parameterCount = this.a.getParameterCount();
        this.d = parameterCount;
        return parameterCount;
    }
}
