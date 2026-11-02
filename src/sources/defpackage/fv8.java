package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fv8 {
    public final vt a;
    public final vt b;
    public final vt c;

    public fv8(vt vtVar, vt vtVar2, vt vtVar3) {
        this.a = vtVar;
        this.b = vtVar2;
        this.c = vtVar3;
    }

    public abstract gv8 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        vt vtVar = this.c;
        Class cls2 = (Class) vtVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        vtVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        vt vtVar = this.a;
        Method method = (Method) vtVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, fv8.class.getClassLoader()).getDeclaredMethod("read", fv8.class);
        vtVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        vt vtVar = this.b;
        Method method = (Method) vtVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, fv8.class);
        vtVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((gv8) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((gv8) this).e.readParcelable(gv8.class.getClassLoader());
    }

    public final hv8 h() {
        String string = ((gv8) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (hv8) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            xw3.o("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            xw3.o("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            xw3.o("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            xw3.o("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((gv8) this).e.writeInt(i);
    }

    public final void k(hv8 hv8Var) {
        if (hv8Var == null) {
            ((gv8) this).e.writeString(null);
            return;
        }
        try {
            ((gv8) this).e.writeString(b(hv8Var.getClass()).getName());
            gv8 gv8VarA = a();
            try {
                d(hv8Var.getClass()).invoke(null, hv8Var, gv8VarA);
                Parcel parcel = gv8VarA.e;
                int i = gv8VarA.i;
                if (i >= 0) {
                    int i2 = gv8VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                xw3.o("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                xw3.o("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                xw3.o("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                xw3.o("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            xw3.o(hv8Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
