package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k63 implements m63 {
    public final /* synthetic */ byte X = 0;
    public final ByteBuffer Y;
    public final int Z;

    public k63(int i, ByteBuffer byteBuffer) {
        this.Z = i;
        this.Y = byteBuffer;
    }

    @Override // defpackage.m63
    public final ByteBuffer c() {
        switch (this.X) {
            case 0:
                break;
        }
        return this.Y;
    }

    @Override // defpackage.m63
    public final int j() {
        switch (this.X) {
            case 0:
                break;
        }
        return this.Z;
    }

    @Override // defpackage.m63
    public final int z() {
        switch (this.X) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }

    public k63(ByteBuffer byteBuffer, int i) {
        this.Y = byteBuffer;
        this.Z = i;
    }
}
