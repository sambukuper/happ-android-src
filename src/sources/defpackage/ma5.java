package defpackage;

import java.io.Serializable;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ma5 extends RuntimeException {

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class a extends RuntimeException {
        public final Serializable X;

        public a(Object obj) {
            String strConcat;
            StringBuilder sb = new StringBuilder("OnError while emitting onNext value: ");
            if (obj == null) {
                strConcat = "null";
            } else if (la5.a.contains(obj.getClass())) {
                strConcat = obj.toString();
            } else if (obj instanceof String) {
                strConcat = (String) obj;
            } else if (obj instanceof Enum) {
                strConcat = ((Enum) obj).name();
            } else {
                mr6.c.a().getClass();
                strConcat = obj.getClass().getName().concat(".class");
            }
            sb.append(strConcat);
            super(sb.toString());
            if (!(obj instanceof Serializable)) {
                try {
                    obj = String.valueOf(obj);
                } catch (Throwable th) {
                    obj = th.getMessage();
                }
            }
            this.X = (Serializable) obj;
        }
    }

    public static Throwable a(Object obj, Throwable th) {
        int i = 0;
        Throwable runtimeException = th;
        int i2 = 0;
        while (runtimeException.getCause() != null) {
            int i3 = i2 + 1;
            if (i2 >= 25) {
                runtimeException = new RuntimeException("Stack too deep to get final cause");
                break;
            }
            runtimeException = runtimeException.getCause();
            i2 = i3;
        }
        if (!(runtimeException instanceof a) || ((a) runtimeException).X != obj) {
            a aVar = new a(obj);
            HashSet hashSet = new HashSet();
            Throwable cause = th;
            while (cause.getCause() != null) {
                int i4 = i + 1;
                if (i < 25) {
                    cause = cause.getCause();
                    if (hashSet.contains(cause.getCause())) {
                        break;
                    }
                    hashSet.add(cause.getCause());
                    i = i4;
                }
            }
            try {
                cause.initCause(aVar);
            } catch (Throwable unused) {
            }
            return th;
        }
        return th;
    }
}
