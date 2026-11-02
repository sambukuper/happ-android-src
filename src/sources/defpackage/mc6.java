package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mc6 implements Comparable {
    public static boolean g0 = false;
    public static HashMap h0;
    public static HashMap i0;
    public static HashMap j0;
    public static ArrayList k0;
    public static ArrayList l0;
    public String X;
    public int Y;
    public final TreeSet Z = new TreeSet();
    public ArrayList f0 = null;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.X.compareTo(((mc6) obj).X);
    }

    public final String toString() {
        return this.X;
    }
}
