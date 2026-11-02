package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ce1 {
    public final boolean a;
    public final boolean b;
    public final String c;

    public ce1(l37 l37Var, String str) {
        this.a = l37Var.f(xp4.B0);
        this.b = l37Var.f(xp4.o0);
        this.c = str;
    }

    public static String d(int i, String str) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb.append((CharSequence) str, i, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    public static String e(int i, String str) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        int i2 = i + 1;
        if (i2 < length && Character.isUpperCase(str.charAt(i2))) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        sb.append((CharSequence) str, i2, length);
        return sb.toString();
    }

    public final String a(hl hlVar, String str) {
        if (!this.b) {
            dh8 dh8VarQ = hlVar.Q();
            if (dh8VarQ.M()) {
                dh8VarQ = dh8VarQ.E();
            }
            if (!dh8VarQ.H0(Boolean.TYPE) && !dh8VarQ.H0(Boolean.class) && !dh8VarQ.H0(AtomicBoolean.class)) {
                return null;
            }
        }
        if (str.startsWith("is")) {
            return this.a ? e(2, str) : d(2, str);
        }
        return null;
    }

    public final String b(String str) {
        String str2 = this.c;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        return this.a ? e(str2.length(), str) : d(str2.length(), str);
    }

    public String c(hl hlVar, String str) {
        Method method = hlVar.E0;
        if (!str.startsWith("get")) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            Class<?> returnType = method.getReturnType();
            if (returnType.isArray()) {
                String name = returnType.getComponentType().getName();
                if (name.contains(".cglib") && (name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib"))) {
                    return null;
                }
            }
        } else if ("getMetaClass".equals(str) && method.getReturnType().getName().startsWith("groovy.lang")) {
            return null;
        }
        return this.a ? e(3, str) : d(3, str);
    }
}
