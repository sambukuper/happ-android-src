package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface h1 extends cc1 {
    @Override // defpackage.cc1
    default void a(String str) {
        str.getClass();
        i().a(new q21(str));
    }

    default sc0 build() {
        return new sc0(i().b);
    }

    ps i();

    h1 o();
}
