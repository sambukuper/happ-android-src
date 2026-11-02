package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface e37 {
    String a();

    default boolean c() {
        return false;
    }

    int d(String str);

    int e();

    String f(int i);

    List g(int i);

    default List getAnnotations() {
        return d02.X;
    }

    e37 h(int i);

    default boolean i() {
        return false;
    }

    boolean j(int i);

    nr4 r();
}
