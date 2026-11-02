package defpackage;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface aa0 extends sa7, WritableByteChannel {
    long M(je7 je7Var);

    aa0 N0(int i, int i2, byte[] bArr);

    aa0 O();

    aa0 P0(kb0 kb0Var);

    aa0 U0(long j);

    i90 c();

    aa0 f0(String str);

    @Override // defpackage.sa7, java.io.Flushable
    void flush();

    aa0 o0(long j);

    aa0 t0(int i, int i2, String str);

    aa0 w(int i);

    aa0 write(byte[] bArr);

    aa0 writeByte(int i);

    aa0 writeInt(int i);

    aa0 writeShort(int i);
}
