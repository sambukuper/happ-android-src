package defpackage;

import io.sentry.c2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cq2 extends e2 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, cq2> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected hn8 unknownFields;

    public cq2() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = hn8.f;
    }

    public static cq2 d(Class cls) {
        cq2 cq2Var = defaultInstanceMap.get(cls);
        if (cq2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                cq2Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (cq2Var != null) {
            return cq2Var;
        }
        try {
            cq2 cq2Var2 = (cq2) ((cq2) ao8.a.allocateInstance(cls)).c(6);
            if (cq2Var2 != null) {
                defaultInstanceMap.put(cls, cq2Var2);
                return cq2Var2;
            }
            c2.g();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object e(Method method, cq2 cq2Var, Object... objArr) {
        try {
            return method.invoke(cq2Var, objArr);
        } catch (IllegalAccessException e) {
            xw3.o("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            xw3.o("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean f(cq2 cq2Var, boolean z) {
        byte bByteValue = ((Byte) cq2Var.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        l06 l06Var = l06.c;
        l06Var.getClass();
        boolean zC = l06Var.a(cq2Var.getClass()).c(cq2Var);
        if (z) {
            cq2Var.c(2);
        }
        return zC;
    }

    public static void j(Class cls, cq2 cq2Var) {
        cq2Var.h();
        defaultInstanceMap.put(cls, cq2Var);
    }

    @Override // defpackage.e2
    public final int a(bx6 bx6Var) {
        int iG;
        int iG2;
        if (g()) {
            if (bx6Var == null) {
                l06 l06Var = l06.c;
                l06Var.getClass();
                iG2 = l06Var.a(getClass()).g(this);
            } else {
                iG2 = bx6Var.g(this);
            }
            if (iG2 >= 0) {
                return iG2;
            }
            bt.i(pc6.j(iG2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (bx6Var == null) {
            l06 l06Var2 = l06.c;
            l06Var2.getClass();
            iG = l06Var2.a(getClass()).g(this);
        } else {
            iG = bx6Var.g(this);
        }
        k(iG);
        return iG;
    }

    @Override // defpackage.e2
    public final void b(mv0 mv0Var) {
        l06 l06Var = l06.c;
        l06Var.getClass();
        bx6 bx6VarA = l06Var.a(getClass());
        yr2 yr2Var = mv0Var.a;
        if (yr2Var == null) {
            yr2Var = new yr2(mv0Var);
        }
        bx6VarA.h(this, yr2Var);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l06 l06Var = l06.c;
        l06Var.getClass();
        return l06Var.a(getClass()).d(this, (cq2) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            l06 l06Var = l06.c;
            l06Var.getClass();
            return l06Var.a(getClass()).f(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        l06 l06Var2 = l06.c;
        l06Var2.getClass();
        int iF = l06Var2.a(getClass()).f(this);
        this.memoizedHashCode = iF;
        return iF;
    }

    public final cq2 i() {
        return (cq2) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            bt.i(pc6.j(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = pu4.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        pu4.c(this, sb, 0);
        return sb.toString();
    }
}
