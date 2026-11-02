package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cm0 implements hh2 {
    public static final cm0 a = new cm0();

    @Override // defpackage.hh2
    public final boolean b() {
        throw p61.j("canFocus is read before it is written");
    }
}
