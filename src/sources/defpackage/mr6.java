package defpackage;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mr6 {
    public static final mr6 c = new mr6();
    public static final lr6 d = new lr6();
    public final AtomicReference a = new AtomicReference();
    public final AtomicReference b = new AtomicReference();

    public mr6() {
        new AtomicReference();
        new AtomicReference();
        new AtomicReference();
    }

    public static Object c(Class cls, Properties properties) {
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String property = properties2.getProperty("rxjava.plugin." + simpleName + ".implementation");
        if (property == null) {
            try {
                for (Map.Entry entry : properties2.entrySet()) {
                    String string = entry.getKey().toString();
                    if (string.startsWith("rxjava.plugin.") && string.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                        String str = "rxjava.plugin." + string.substring(0, string.length() - 6).substring(14) + ".impl";
                        property = properties2.getProperty(str);
                        if (property != null) {
                            break;
                        }
                        throw new IllegalStateException("Implementing class declaration for " + simpleName + " missing: " + str);
                    }
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return Class.forName(property).asSubclass(cls).newInstance();
        } catch (ClassCastException e2) {
            throw new IllegalStateException(pc6.q(simpleName, " implementation is not an instance of ", simpleName, ": ", property), e2);
        } catch (ClassNotFoundException e3) {
            throw new IllegalStateException(pc6.p(simpleName, " implementation class not found: ", property), e3);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException(pc6.p(simpleName, " implementation not able to be accessed: ", property), e4);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(pc6.p(simpleName, " implementation not able to be instantiated: ", property), e5);
        }
    }

    public final lr6 a() {
        Properties properties;
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() == null) {
            try {
                properties = System.getProperties();
            } catch (SecurityException unused) {
                properties = new Properties();
            }
            Object objC = c(lr6.class, properties);
            if (objC == null) {
                while (!atomicReference.compareAndSet(null, d) && atomicReference.get() == null) {
                }
            } else {
                lr6 lr6Var = (lr6) objC;
                while (!atomicReference.compareAndSet(null, lr6Var) && atomicReference.get() == null) {
                }
            }
        }
        return (lr6) atomicReference.get();
    }

    public final kr6 b() {
        Properties properties;
        AtomicReference atomicReference = this.b;
        if (atomicReference.get() == null) {
            try {
                properties = System.getProperties();
            } catch (SecurityException unused) {
                properties = new Properties();
            }
            Object objC = c(kr6.class, properties);
            if (objC == null) {
                while (!atomicReference.compareAndSet(null, kr6.a) && atomicReference.get() == null) {
                }
            } else {
                kr6 kr6Var = (kr6) objC;
                while (!atomicReference.compareAndSet(null, kr6Var) && atomicReference.get() == null) {
                }
            }
        }
        return (kr6) atomicReference.get();
    }
}
