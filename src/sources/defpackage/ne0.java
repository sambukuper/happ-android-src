package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ne0 implements wd0 {
    public final /* synthetic */ byte a = 0;
    public final List b;
    public final Member c;
    public final Type d;

    public ne0(Method method, List list) {
        this.c = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.d = returnType;
    }

    @Override // defpackage.wd0
    public final List a() {
        byte b = this.a;
        return this.b;
    }

    @Override // defpackage.wd0
    public final Member b() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return null;
        }
    }

    @Override // defpackage.wd0
    public final boolean c() {
        switch (this.a) {
        }
        return false;
    }

    public final void e(int i) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                if (list.size() != i) {
                    bt.d(list.size(), i);
                    break;
                }
                break;
            default:
                if (list.size() != i) {
                    bt.d(list.size(), i);
                    break;
                }
                break;
        }
    }

    public void f(Object[] objArr) {
        e(objArr.length);
    }

    public void g(Object obj) {
        if (obj == null || !this.c.getDeclaringClass().isInstance(obj)) {
            bt.q("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // defpackage.wd0
    public final Type j() {
        byte b = this.a;
        Type type = this.d;
        switch (b) {
            case 0:
                return type;
            default:
                return (Class) type;
        }
    }

    public ne0(Member member, Type type, Type[] typeArr) {
        this.c = member;
        this.d = type;
        this.b = eu.K0(typeArr);
    }
}
