package defpackage;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class al8 extends ResourceBundle {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static al8 v(String str, String str2, ClassLoader classLoader) {
        ConcurrentHashMap concurrentHashMap = a;
        zk8 zk8Var = (zk8) concurrentHashMap.get(str);
        zk8 zk8Var2 = zk8.Z;
        zk8 zk8Var3 = zk8.Y;
        if (zk8Var == null) {
            String str3 = str.indexOf(46) == -1 ? "root" : _UrlKt.FRAGMENT_ENCODE_SET;
            try {
                try {
                    r33.C(str, str3, classLoader, 4);
                    zk8Var = zk8Var3;
                } catch (MissingResourceException unused) {
                    nf6.z(classLoader, str, str3, true);
                    zk8Var = zk8Var2;
                }
            } catch (MissingResourceException unused2) {
                zk8Var = zk8.X;
            }
            concurrentHashMap.put(str, zk8Var);
        }
        int iOrdinal = zk8Var.ordinal();
        if (iOrdinal == 1) {
            return r33.C(str, str2, classLoader, 1);
        }
        if (iOrdinal == 2) {
            return nf6.z(classLoader, str, str2, false);
        }
        try {
            r33 r33VarC = r33.C(str, str2, classLoader, 1);
            concurrentHashMap.put(str, zk8Var3);
            return r33VarC;
        } catch (MissingResourceException unused3) {
            nf6 nf6VarZ = nf6.z(classLoader, str, str2, false);
            concurrentHashMap.put(str, zk8Var2);
            return nf6VarZ;
        }
    }

    public al8 a(String str) {
        for (al8 al8VarK = this; al8VarK != null; al8VarK = al8VarK.k()) {
            al8 al8VarS = al8VarK.s(str, null, this);
            if (al8VarS != null) {
                return al8VarS;
            }
        }
        return null;
    }

    public final al8 b(int i) {
        al8 al8VarR = r(i, this);
        if (al8VarR != null) {
            return al8VarR;
        }
        al8 al8VarK = k();
        if (al8VarK != null) {
            al8VarK = al8VarK.b(i);
        }
        if (al8VarK != null) {
            return al8VarK;
        }
        throw new MissingResourceException("Can't find resource for bundle " + getClass().getName() + ", key " + i(), getClass().getName(), i());
    }

    public final al8 c(String str) {
        al8 al8VarA = a(str);
        if (al8VarA != null) {
            return al8VarA;
        }
        throw new MissingResourceException(oi0.m("Can't find resource for bundle ", z33.b(d(), j()), ", key ", str), getClass().getName(), str);
    }

    public abstract String d();

    public byte[] e() {
        throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
    }

    public int f() {
        throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
    }

    public int[] g() {
        throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
    }

    @Override // java.util.ResourceBundle
    public Enumeration getKeys() {
        return Collections.enumeration(keySet());
    }

    @Override // java.util.ResourceBundle
    public Locale getLocale() {
        return q().n();
    }

    public final cb0 h() {
        cb0 cb0Var = new cb0((byte) 5);
        cb0Var.Y = 0;
        cb0Var.Z = 0;
        cb0Var.f0 = this;
        cb0Var.Z = l();
        return cb0Var;
    }

    @Override // java.util.ResourceBundle
    public Object handleGetObject(String str) {
        return t(str, this);
    }

    @Override // java.util.ResourceBundle
    public Set handleKeySet() {
        return Collections.EMPTY_SET;
    }

    public String i() {
        return null;
    }

    public abstract String j();

    public al8 k() {
        return (r33) ((ResourceBundle) this).parent;
    }

    @Override // java.util.ResourceBundle
    public final Set keySet() {
        r33 r33Var;
        Set set;
        TreeSet treeSet;
        if (w() && (this instanceof r33)) {
            r33Var = (r33) this;
            set = (Set) r33Var.b.i0;
        } else {
            r33Var = null;
            set = null;
        }
        if (set != null) {
            return set;
        }
        if (!w()) {
            return handleKeySet();
        }
        ResourceBundle resourceBundle = ((ResourceBundle) this).parent;
        if (resourceBundle == null) {
            treeSet = new TreeSet();
        } else if (resourceBundle instanceof al8) {
            treeSet = new TreeSet(((al8) ((ResourceBundle) this).parent).keySet());
        } else {
            treeSet = new TreeSet();
            Enumeration<String> keys = ((ResourceBundle) this).parent.getKeys();
            while (keys.hasMoreElements()) {
                treeSet.add(keys.nextElement());
            }
        }
        treeSet.addAll(handleKeySet());
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        if (r33Var != null) {
            r33Var.b.i0 = setUnmodifiableSet;
        }
        return setUnmodifiableSet;
    }

    public int l() {
        return 1;
    }

    public String m() {
        throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
    }

    public String n(int i) {
        r33 r33Var = (r33) b(i);
        if (r33Var.p() == 0) {
            return r33Var.m();
        }
        throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
    }

    public String[] o() {
        throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
    }

    public int p() {
        return -1;
    }

    public abstract sk8 q();

    public al8 r(int i, al8 al8Var) {
        return null;
    }

    public al8 s(String str, HashMap map, al8 al8Var) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [al8] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final Object t(String str, al8 al8Var) {
        ?? S;
        if (p() == 0) {
            S = m();
        } else {
            S = s(str, null, al8Var);
            if (S != 0) {
                if (S.p() == 0) {
                    S = S.m();
                } else {
                    try {
                        if (S.p() == 8) {
                            S = S.u();
                        }
                    } catch (bl8 unused) {
                    }
                }
            }
        }
        if (S == 0) {
            al8 al8VarK = k();
            if (al8VarK != null) {
                S = S;
                S = al8VarK.t(str, al8Var);
            }
            if (S == 0) {
                throw new MissingResourceException("Can't find resource for bundle " + getClass().getName() + ", key " + str, getClass().getName(), str);
            }
        }
        return S;
    }

    public String[] u() {
        return null;
    }

    public boolean w() {
        return true;
    }
}
