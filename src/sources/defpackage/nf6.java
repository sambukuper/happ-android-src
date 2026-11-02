package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nf6 extends al8 {
    public static final yc0 f = new yc0(3);
    public static final boolean g = h33.a("resourceBundleWrapper");
    public final ResourceBundle b;
    public String c = null;
    public String d = null;
    public ArrayList e = null;

    public nf6(ResourceBundle resourceBundle) {
        this.b = resourceBundle;
    }

    public static nf6 B(String str, String str2, String str3, ClassLoader classLoader, boolean z) {
        String str4;
        String str5;
        if (str2.isEmpty()) {
            str4 = str;
        } else {
            str4 = str + '_' + str2;
        }
        if (z) {
            str5 = str4;
        } else {
            str5 = str4 + '#' + str3;
        }
        return (nf6) f.v0(str5, new mf6(str2, str, str3, classLoader, z, str4));
    }

    public static nf6 z(ClassLoader classLoader, String str, String str2, boolean z) {
        if (classLoader == null) {
            classLoader = ys0.v();
        }
        nf6 nf6VarB = z ? B(str, str2, null, classLoader, z) : B(str, str2, sk8.c(sk8.d().Y), classLoader, z);
        if (nf6VarB == null) {
            throw new MissingResourceException(oi0.m("Could not find the bundle ", str, str.indexOf(47) >= 0 ? "/" : "_", str2), _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET);
        }
        return nf6VarB;
    }

    public final void A() {
        this.e = new ArrayList();
        for (nf6 nf6Var = this; nf6Var != null; nf6Var = (nf6) ((al8) ((ResourceBundle) nf6Var).parent)) {
            Enumeration<String> keys = nf6Var.b.getKeys();
            while (keys.hasMoreElements()) {
                String strNextElement = keys.nextElement();
                if (!this.e.contains(strNextElement)) {
                    this.e.add(strNextElement);
                }
            }
        }
    }

    @Override // defpackage.al8
    public final String d() {
        return this.b.getClass().getName().replace('.', '/');
    }

    @Override // defpackage.al8, java.util.ResourceBundle
    public final Enumeration getKeys() {
        return Collections.enumeration(this.e);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014 A[RETURN] */
    @Override // defpackage.al8, java.util.ResourceBundle
    public final Object handleGetObject(String str) {
        Object object;
        for (nf6 nf6Var = this; nf6Var != null; nf6Var = (nf6) ((al8) ((ResourceBundle) nf6Var).parent)) {
            try {
                object = nf6Var.b.getObject(str);
                if (object != null) {
                    return object;
                }
                throw new MissingResourceException(p61.n(new StringBuilder("Can't find resource for bundle "), this.d, ", key ", str), nf6.class.getName(), str);
            } catch (MissingResourceException unused) {
            }
        }
        object = null;
        if (object != null) {
            return object;
        }
        throw new MissingResourceException(p61.n(new StringBuilder("Can't find resource for bundle "), this.d, ", key ", str), nf6.class.getName(), str);
    }

    @Override // defpackage.al8
    public final String j() {
        return this.c;
    }

    @Override // defpackage.al8
    public final al8 k() {
        return (al8) ((ResourceBundle) this).parent;
    }

    @Override // defpackage.al8
    public final sk8 q() {
        return new sk8(this.c);
    }
}
