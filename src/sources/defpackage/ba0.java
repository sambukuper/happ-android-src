package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface ba0 extends je7, ReadableByteChannel {
    byte[] B();

    byte[] D0(long j);

    boolean F();

    int H(od5 od5Var);

    long P();

    long S(long j, kb0 kb0Var);

    void T0(long j);

    String V(long j);

    long W0();

    InputStream Y0();

    long Z(aa0 aa0Var);

    i90 c();

    void h0(i90 i90Var, long j);

    String k0(Charset charset);

    String o(long j);

    j76 peek();

    boolean q(long j, kb0 kb0Var);

    kb0 q0();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    kb0 s(long j);

    void skip(long j);

    String z0();
}
