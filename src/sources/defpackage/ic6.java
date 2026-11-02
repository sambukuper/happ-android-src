package defpackage;

import com.google.gson.b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ic6 {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ Method d;
    public final /* synthetic */ b e;
    public final /* synthetic */ b f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public ic6(String str, Field field, Method method, b bVar, b bVar2, boolean z, boolean z2) {
        this.d = method;
        this.e = bVar;
        this.f = bVar2;
        this.g = z;
        this.h = z2;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(hs3 hs3Var, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new uo3(pc6.p("Accessor ", ec6.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = this.b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        hs3Var.m(this.a);
        this.e.c(hs3Var, objInvoke);
    }
}
