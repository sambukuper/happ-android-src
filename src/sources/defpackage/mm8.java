package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mm8 extends lm8 {
    public final /* synthetic */ byte a;
    public final int b;

    public /* synthetic */ mm8(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    @Override // defpackage.qm8
    public final int a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b;
    }

    @Override // defpackage.qm8
    public final char b() {
        switch (this.a) {
            case 0:
                return 'S';
            case 1:
                return 'A';
            case 2:
                return 'N';
            default:
                return 'n';
        }
    }

    @Override // defpackage.nm8
    public final void c(ac1 ac1Var) {
        switch (this.a) {
            case 0:
                int i = this.b;
                ((o3) ac1Var).k(new c30(new ik2(i, i)));
                return;
            case 1:
                vm8.f("millisecond-of-day", null);
                throw null;
            case 2:
                vm8.f("nanosecond-of-day", null);
                throw null;
            default:
                vm8.f("nano-of-second", "Maybe you meant 'S' instead of 'n'?");
                throw null;
        }
    }
}
