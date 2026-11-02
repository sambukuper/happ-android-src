package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ax8 extends cx8 {
    public static ax8 c;
    public static final f08 d = new f08((byte) 12);
    public final Application b;

    public ax8(Application application) {
        this.b = application;
    }

    @Override // defpackage.cx8, defpackage.bx8
    public final xw8 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        u52.k("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.cx8, defpackage.bx8
    public final xw8 b(Class cls, sz4 sz4Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) sz4Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!fi.class.isAssignableFrom(cls)) {
            return km4.v(cls);
        }
        bt.q("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final xw8 d(Class cls, Application application) {
        if (!fi.class.isAssignableFrom(cls)) {
            return km4.v(cls);
        }
        try {
            xw8 xw8Var = (xw8) cls.getConstructor(Application.class).newInstance(application);
            xw8Var.getClass();
            return xw8Var;
        } catch (IllegalAccessException e) {
            xw3.o(pc6.l(cls, "Cannot create an instance of "), e);
            return null;
        } catch (InstantiationException e2) {
            xw3.o(pc6.l(cls, "Cannot create an instance of "), e2);
            return null;
        } catch (NoSuchMethodException e3) {
            xw3.o(pc6.l(cls, "Cannot create an instance of "), e3);
            return null;
        } catch (InvocationTargetException e4) {
            xw3.o(pc6.l(cls, "Cannot create an instance of "), e4);
            return null;
        }
    }
}
