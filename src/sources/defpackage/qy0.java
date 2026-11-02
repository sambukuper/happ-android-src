package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qy0 implements w06 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qy0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.w06
    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new sh3("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e) {
                    throw new sh3(pc6.p("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new sh3(pc6.p("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new sh3(oi0.l("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new sh3(oi0.l("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new z43((xa2) obj);
        }
    }
}
