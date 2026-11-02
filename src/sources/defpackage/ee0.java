package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ee0 extends ne0 {
    public final boolean e;

    public ee0(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        genericReturnType.getClass();
        if (z) {
            ps psVar = new ps(2);
            psVar.b(method.getDeclaringClass());
            psVar.c(typeArr);
            ArrayList arrayList = psVar.b;
            typeArr = (Type[]) arrayList.toArray(new Type[arrayList.size()]);
        }
        super(method, genericReturnType, typeArr);
        this.e = genericReturnType.equals(Void.TYPE);
    }

    @Override // defpackage.wd0
    public Object d(Object[] objArr) {
        f(objArr);
        return ((Field) this.c).get(this.e ? eu.r0(objArr) : null);
    }

    public Object h(Object obj, Object[] objArr) {
        objArr.getClass();
        return this.e ? dn8.a : ((Method) this.c).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ee0(Method method, boolean z, int i) {
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        this(method, z, genericParameterTypes);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ee0(Field field, boolean z) {
        Type genericType = field.getGenericType();
        genericType.getClass();
        super(field, genericType, z ? new Type[]{field.getDeclaringClass()} : new Type[0]);
        this.e = z;
    }
}
