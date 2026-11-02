package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tp2 implements nu4 {
    public static final tp2 b = new tp2(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ tp2(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.nu4
    public final p66 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!cq2.class.isAssignableFrom(cls)) {
                    bt.q("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (p66) cq2.d(cls.asSubclass(cq2.class)).c(3);
                } catch (Exception e) {
                    xw3.o("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.nu4
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return cq2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
