package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mf8 extends kf8 {
    public final /* synthetic */ byte g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf8(byte b) {
        super((byte) 1);
        this.g0 = b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.g0) {
            case 0:
                int i = this.f0;
                this.f0 = i + 2;
                Object[] objArr = this.Y;
                return new mp4(objArr[i], objArr[i + 1], (byte) 0);
            case 1:
                int i2 = this.f0;
                this.f0 = i2 + 2;
                return this.Y[i2];
            default:
                int i3 = this.f0;
                this.f0 = i3 + 2;
                return this.Y[i3 + 1];
        }
    }
}
