package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class us5 {
    public int a;
    public int b;
    public boolean c;
    public final Object d;
    public final Serializable e;
    public Object f;

    public us5(String str, String str2) {
        this.d = str;
        this.e = str2;
        if (str.length() < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.a = 0;
        int iB = b(0);
        this.b = iB;
        this.f = str.substring(this.a, iB);
        this.c = false;
    }

    public void a() {
        int i = this.b;
        String str = (String) this.d;
        boolean z = i < str.length();
        int i2 = this.b;
        if (!z) {
            this.a = i2;
            this.f = null;
            this.c = true;
        } else {
            int i3 = i2 + 1;
            this.a = i3;
            int iB = b(i3);
            this.b = iB;
            this.f = str.substring(this.a, iB);
        }
    }

    public int b(int i) {
        String str = (String) this.e;
        String str2 = (String) this.d;
        loop0: while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (cCharAt == str.charAt(i2)) {
                    break loop0;
                }
            }
            i++;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Serializable, java.util.List[]] */
    public us5(vs5 vs5Var, List list) {
        this.f = vs5Var;
        this.d = list;
        this.e = new List[list.size()];
        if (list.isEmpty()) {
            zc3.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
