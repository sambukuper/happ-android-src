package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qo8 {
    public static final sk f = new sk(0.0f);
    public final ju8 a;
    public long b = Long.MIN_VALUE;
    public sk c = f;
    public boolean d;
    public float e;

    public qo8(pk pkVar) {
        this.a = pkVar.a(ys0.j0);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e A[Catch: all -> 0x003a, PHI: r0 r2 r3 r13
  0x007e: PHI (r0v16 gn2) = (r0v9 gn2), (r0v17 gn2) binds: [B:29:0x0076, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r2v5 dn2) = (r2v3 dn2), (r2v6 dn2) binds: [B:29:0x0076, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r3v4 po8) = (r3v2 po8), (r3v5 po8) binds: [B:29:0x0076, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r13v1 float) = (r13v0 float), (r13v2 float) binds: [B:29:0x0076, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d9, B:20:0x004b, B:36:0x00aa, B:30:0x007e, B:33:0x008c, B:38:0x00b1, B:41:0x00bc), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d9, B:20:0x004b, B:36:0x00aa, B:30:0x007e, B:33:0x008c, B:38:0x00b1, B:41:0x00bc), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa A[Catch: all -> 0x003a, PHI: r0 r2 r3 r13
  0x00aa: PHI (r0v17 gn2) = (r0v16 gn2), (r0v20 gn2) binds: [B:34:0x00a7, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r2v6 dn2) = (r2v5 dn2), (r2v8 dn2) binds: [B:34:0x00a7, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r3v5 po8) = (r3v4 po8), (r3v7 po8) binds: [B:34:0x00a7, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r13v2 float) = (r13v1 float), (r13v4 float) binds: [B:34:0x00a7, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d9, B:20:0x004b, B:36:0x00aa, B:30:0x007e, B:33:0x008c, B:38:0x00b1, B:41:0x00bc), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[Catch: all -> 0x003a, PHI: r0 r2 r3
  0x00b1: PHI (r0v12 gn2) = (r0v16 gn2), (r0v17 gn2) binds: [B:32:0x008b, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x00b1: PHI (r2v4 dn2) = (r2v5 dn2), (r2v6 dn2) binds: [B:32:0x008b, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x00b1: PHI (r3v3 po8) = (r3v4 po8), (r3v5 po8) binds: [B:32:0x008b, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d9, B:20:0x004b, B:36:0x00aa, B:30:0x007e, B:33:0x008c, B:38:0x00b1, B:41:0x00bc), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d9, B:20:0x004b, B:36:0x00aa, B:30:0x007e, B:33:0x008c, B:38:0x00b1, B:41:0x00bc), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a7 -> B:36:0x00aa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.sn r17, defpackage.g00 r18, defpackage.s51 r19) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo8.a(sn, g00, s51):java.lang.Object");
    }
}
