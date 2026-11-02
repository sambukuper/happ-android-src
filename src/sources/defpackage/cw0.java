package defpackage;

import android.view.View;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cw0 implements i86, zk {
    public static final yr2[] Y = new yr2[0];
    public static final Annotation[] Z = new Annotation[0];
    public final Object X;

    public cw0(byte b) {
        switch (b) {
            case 5:
                this.X = new ConcurrentHashMap();
                break;
            default:
                this.X = new Object();
                break;
        }
    }

    public static /* synthetic */ void B(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void f0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public abstract void A0(Object obj, long j, float f);

    public abstract gn2 B0(n17 n17Var);

    public abstract void C0(jp0 jp0Var);

    public boolean D0() {
        Unsafe unsafe = (Unsafe) this.X;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            ao8.i(th);
            return false;
        }
    }

    public abstract boolean E0();

    @Override // defpackage.i86
    public t14 c() {
        t14 t14Var = (t14) this.X;
        if (t14Var != null) {
            return t14Var;
        }
        B(1);
        throw null;
    }

    public abstract void g0(n17 n17Var);

    @Override // defpackage.zk
    public sm getAnnotations() {
        sm smVar = (sm) this.X;
        if (smVar != null) {
            return smVar;
        }
        f0(1);
        throw null;
    }

    public ch3 l0(ch3 ch3Var, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            ch3Var = ch3Var.g(annotation);
            if (((m85) this.X).W(annotation)) {
                ch3Var = o0(ch3Var, annotation);
            }
        }
        return ch3Var;
    }

    public ch3 m0(Annotation[] annotationArr) {
        ch3 ch3VarG = xl.i;
        for (Annotation annotation : annotationArr) {
            ch3VarG = ch3VarG.g(annotation);
            if (((m85) this.X).W(annotation)) {
                ch3VarG = o0(ch3VarG, annotation);
            }
        }
        return ch3VarG;
    }

    public ch3 n0(ch3 ch3Var, Annotation[] annotationArr) {
        m85 m85Var = (m85) this.X;
        for (Annotation annotation : annotationArr) {
            if (!ch3Var.L(annotation)) {
                ch3Var = ch3Var.g(annotation);
                if (m85Var.W(annotation)) {
                    for (Annotation annotation2 : it0.i(annotation.annotationType())) {
                        if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !ch3Var.L(annotation2)) {
                            ch3Var = ch3Var.g(annotation2);
                            if (m85Var.W(annotation2)) {
                                ch3Var = o0(ch3Var, annotation2);
                            }
                        }
                    }
                }
            }
        }
        return ch3Var;
    }

    public ch3 o0(ch3 ch3Var, Annotation annotation) {
        for (Annotation annotation2 : it0.i(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention)) {
                if (!((m85) this.X).W(annotation2)) {
                    ch3Var = ch3Var.g(annotation2);
                } else if (!ch3Var.L(annotation2)) {
                    ch3Var = o0(ch3Var.g(annotation2), annotation2);
                }
            }
        }
        return ch3Var;
    }

    public abstract void p0();

    public abstract Object q0(Object obj, Object obj2);

    public abstract void r0();

    public abstract boolean s0(long j, Object obj);

    public abstract double t0(long j, Object obj);

    public abstract float u0(long j, Object obj);

    public Object v0(Object obj, Object obj2) {
        Object obj3;
        Object obj4 = ((ConcurrentHashMap) this.X).get(obj);
        if (obj4 != null) {
            if (!(obj4 instanceof rc0)) {
                return obj4;
            }
            rc0 rc0Var = (rc0) obj4;
            if (rc0Var instanceof pc0) {
                return null;
            }
            Object objA = rc0Var.a();
            return objA != null ? objA : rc0Var.b(q0(obj, obj2));
        }
        Object objQ0 = q0(obj, obj2);
        if (objQ0 == null) {
            obj3 = rc0.a;
        } else {
            qc0 qc0Var = new qc0();
            qc0Var.b = new SoftReference(objQ0);
            obj3 = qc0Var;
        }
        Object objPutIfAbsent = ((ConcurrentHashMap) this.X).putIfAbsent(obj, obj3);
        if (objPutIfAbsent == null) {
            return objQ0;
        }
        return !(objPutIfAbsent instanceof rc0) ? objPutIfAbsent : ((rc0) objPutIfAbsent).b(objQ0);
    }

    public boolean w0() {
        ze7 ze7VarD;
        xe7 xe7Var = (xe7) this.X;
        View view = xe7Var.c.J0;
        if (view != null) {
            ze7.X.getClass();
            ze7VarD = we5.d(view);
        } else {
            ze7VarD = null;
        }
        ze7 ze7Var = xe7Var.a;
        if (ze7VarD == ze7Var) {
            return true;
        }
        ze7 ze7Var2 = ze7.Z;
        return (ze7VarD == ze7Var2 || ze7Var == ze7Var2) ? false : true;
    }

    public abstract void x0(Object obj, long j, boolean z);

    public abstract void y0(Object obj, long j, byte b);

    public abstract void z0(Object obj, long j, double d);

    public cw0(sm smVar) {
        if (smVar != null) {
            this.X = smVar;
        } else {
            f0(0);
            throw null;
        }
    }

    public cw0(t14 t14Var) {
        if (t14Var != null) {
            this.X = t14Var;
        } else {
            B(0);
            throw null;
        }
    }

    public /* synthetic */ cw0(Object obj) {
        this.X = obj;
    }

    public cw0(xe7 xe7Var) {
        xe7Var.getClass();
        this.X = xe7Var;
    }
}
