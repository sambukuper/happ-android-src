package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class o55 {
    public final qz7 a;
    public final v59 b;
    public final v59 c;
    public byte[] d;
    public byte[] e;
    public long f;
    public long g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o55(byte[] bArr) {
        bArr.getClass();
        qz7 qz7Var = new qz7();
        byte[] bytes = "Noise_NK_25519_ChaChaPoly_BLAKE2s".getBytes(iq0.a);
        bytes.getClass();
        byte[] bArrH = ci8.h(bytes);
        qz7Var.b = bArrH;
        qz7Var.a = bArrH;
        this.a = qz7Var;
        this.b = new v59(q55.b);
        this.c = q55.a(bArr);
        qz7Var.a(q55.a);
        qz7Var.a(bArr);
    }
}
