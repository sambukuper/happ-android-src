package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface cj0 extends lg0, gq8 {
    xb4 a();

    r85 b();

    @Override // defpackage.lg0
    default xi0 c() {
        return s();
    }

    default boolean e() {
        return c().j() == 0;
    }

    qh0 g();

    default ih0 h() {
        return mh0.a;
    }

    default boolean m() {
        return false;
    }

    void n(ArrayList arrayList);

    void o(ArrayList arrayList);

    default boolean q() {
        return true;
    }

    aj0 s();

    default void p() {
    }

    default void j(ih0 ih0Var) {
    }

    default void l(boolean z) {
    }

    default void r(boolean z) {
    }
}
