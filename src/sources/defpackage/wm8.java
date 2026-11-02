package defpackage;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wm8 extends m62 {
    public static final TreeSet e = new TreeSet();
    public static final TreeMap f = new TreeMap();
    public static final wm8 g;
    public static final wm8 h;
    public SortedSet c;
    public SortedMap d;

    static {
        wm8 wm8Var = new wm8();
        g = wm8Var;
        TreeMap treeMap = new TreeMap();
        wm8Var.d = treeMap;
        treeMap.put("ca", "japanese");
        wm8Var.b = "ca-japanese";
        wm8 wm8Var2 = new wm8();
        h = wm8Var2;
        TreeMap treeMap2 = new TreeMap();
        wm8Var2.d = treeMap2;
        treeMap2.put("nu", "thai");
        wm8Var2.b = "nu-thai";
    }

    public wm8() {
        this.a = 'u';
        this.c = e;
        this.d = f;
    }

    public static boolean a(String str) {
        return str.length() == 2 && gv3.G(str.charAt(0)) && gv3.F(str.charAt(1));
    }
}
