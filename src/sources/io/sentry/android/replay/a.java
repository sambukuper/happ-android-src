package io.sentry.android.replay;

import android.os.Handler;
import android.os.Looper;
import defpackage.dn2;
import defpackage.g24;
import defpackage.kc6;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g24 implements dn2 {
    public static final a Z;
    public static final a f0;
    public static final a g0;
    public static final a h0;
    public static final a i0;
    public static final a j0;
    public static final a k0;
    public final /* synthetic */ byte Y;

    static {
        int i = 0;
        Z = new a((byte) 0, i);
        f0 = new a((byte) 1, i);
        g0 = new a((byte) 2, i);
        h0 = new a((byte) 3, i);
        i0 = new a((byte) 4, i);
        j0 = new a((byte) 5, i);
        k0 = new a((byte) 6, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(byte b, int i) {
        super(i);
        this.Y = b;
    }

    @Override // defpackage.dn2
    public final Object invoke() throws NoSuchFieldException {
        Method method;
        switch (this.Y) {
            case 0:
                return new kc6("_[a-z]");
            case 1:
                a0 a0Var = new a0();
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new io.sentry.android.core.internal.modules.a((Object) a0Var, (byte) 3));
                return a0Var;
            case 2:
                Class cls = (Class) g0.a.getValue();
                if (cls == null) {
                    return null;
                }
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            case 3:
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable unused) {
                    return null;
                }
            case 4:
                Class cls2 = (Class) g0.a.getValue();
                if (cls2 == null || (method = cls2.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            case 5:
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                Class cls3 = (Class) l0.a.getValue();
                if (cls3 == null) {
                    return null;
                }
                try {
                    Field declaredField2 = cls3.getDeclaredField("mWindow");
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException unused3) {
                    cls3.toString();
                    return null;
                }
        }
    }
}
