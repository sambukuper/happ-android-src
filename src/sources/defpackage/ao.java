package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ao extends uy7 implements rn2 {
    public String g0;
    public qo h0;
    public String i0;
    public int j0;
    public int k0;
    public int l0;
    public byte m0;
    public /* synthetic */ Object n0;
    public final /* synthetic */ String o0;
    public final /* synthetic */ qo p0;
    public final /* synthetic */ String q0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(String str, qo qoVar, String str2, q51 q51Var) {
        super(2, q51Var);
        this.o0 = str;
        this.p0 = qoVar;
        this.q0 = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (ze2) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        ao aoVar = new ao(this.o0, this.p0, this.q0, q51Var);
        aoVar.n0 = obj;
        return aoVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:13:0x005b  */
    /* JADX WARN: Code duplicated, block: B:18:0x00d0 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:16:0x009e, B:18:0x00d0, B:19:0x00d6, B:20:0x00dd), top: B:44:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:33:0x010c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0131  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0131 -> B:38:0x0134). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object q(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.Object r0 = r1.n0
            ze2 r0 = (ze2) r0
            byte r2 = r1.m0
            r3 = 0
            r4 = 2
            r5 = 1
            c71 r6 = c71.X
            if (r2 == 0) goto L47
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2a
            int r2 = r1.k0
            int r7 = r1.j0
            java.lang.String r8 = r1.i0
            qo r9 = r1.h0
            java.lang.String r10 = r1.g0
            w39.n0(r22)
            r16 = r10
            r10 = r9
            r9 = r16
            r16 = r8
            r8 = r7
            goto L134
        L2a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            bt.i(r0)
            r0 = 0
            return r0
        L31:
            int r2 = r1.l0
            int r7 = r1.k0
            int r8 = r1.j0
            java.lang.String r9 = r1.i0
            qo r10 = r1.h0
            java.lang.String r11 = r1.g0
            w39.n0(r22)
            r20 = r7
            r7 = r2
            r2 = r20
            goto L110
        L47:
            w39.n0(r22)
            r2 = 30
            java.lang.String r7 = r1.o0
            qo r8 = r1.p0
            java.lang.String r9 = r1.q0
            r10 = r8
            r16 = r9
            r8 = r2
            r9 = r7
            r7 = r3
        L58:
            r2 = r0
            if (r7 >= r8) goto L139
            java.lang.String r0 = "https://ntp2-sync.com/v1install?id="
            java.lang.String r0 = oi0.l(r0, r9)
            un r13 = defpackage.un.INSTALL
            java.lang.String r18 = "close"
            ss8 r11 = defpackage.ss8.a     // Catch: java.lang.Throwable -> Le0
            android.content.Context r11 = r10.a     // Catch: java.lang.Throwable -> Le0
            yf8 r11 = defpackage.ss8.k(r11)     // Catch: java.lang.Throwable -> Le0
            java.lang.Object r12 = r11.X     // Catch: java.lang.Throwable -> Le0
            su.happ.proxyutility.dto.HWID r12 = (su.happ.proxyutility.dto.HWID) r12     // Catch: java.lang.Throwable -> Le0
            java.lang.String r12 = r12.getValue()     // Catch: java.lang.Throwable -> Le0
            java.lang.Object r14 = r11.Y     // Catch: java.lang.Throwable -> Le0
            su.happ.proxyutility.dto.VersionOS r14 = (su.happ.proxyutility.dto.VersionOS) r14     // Catch: java.lang.Throwable -> Le0
            java.lang.String r14 = r14.getValue()     // Catch: java.lang.Throwable -> Le0
            java.lang.Object r11 = r11.Z     // Catch: java.lang.Throwable -> Le0
            su.happ.proxyutility.dto.DeviceModel r11 = (su.happ.proxyutility.dto.DeviceModel) r11     // Catch: java.lang.Throwable -> Le0
            java.lang.String r15 = r11.getValue()     // Catch: java.lang.Throwable -> Le0
            r11 = 9000(0x2328, float:1.2612E-41)
            okhttp3.OkHttpClient r11 = r10.b(r11, r5, r3)     // Catch: java.lang.Throwable -> Le0
            r17 = r11
            java.net.URL r11 = new java.net.URL     // Catch: java.lang.Throwable -> Le0
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Le0
            r0 = r17
            r17 = 0
            r19 = 0
            okhttp3.Request$Builder r11 = r10.a(r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> Le0
            r12 = r16
            okhttp3.Request r11 = r11.build()     // Catch: java.lang.Throwable -> Lde
            okhttp3.Call r0 = r0.newCall(r11)     // Catch: java.lang.Throwable -> Lde
            okhttp3.Response r0 = r0.execute()     // Catch: java.lang.Throwable -> Lde
            okhttp3.ResponseBody r11 = r0.body()     // Catch: java.lang.Throwable -> Lde
            java.lang.String r11 = r11.string()     // Catch: java.lang.Throwable -> Lde
            defpackage.ss8.t()     // Catch: java.lang.Throwable -> Lde
            int r0 = r0.code()     // Catch: java.lang.Throwable -> Lde
            java.lang.Integer r13 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lde
            r13.<init>(r0)     // Catch: java.lang.Throwable -> Lde
            com.google.gson.a r0 = yw2.b     // Catch: java.lang.Throwable -> Lde
            java.lang.Class<su.happ.proxyutility.dto.SubscriptionRestrictedStatus> r14 = su.happ.proxyutility.dto.SubscriptionRestrictedStatus.class
            r0.getClass()     // Catch: java.lang.Throwable -> Lde
            yi8 r15 = new yi8     // Catch: java.lang.Throwable -> Lde
            r15.<init>(r14)     // Catch: java.lang.Throwable -> Lde
            java.lang.Object r0 = r0.c(r11, r15)     // Catch: java.lang.Throwable -> Lde
            if (r0 == 0) goto Ld6
            qg5 r11 = new qg5     // Catch: java.lang.Throwable -> Lde
            r11.<init>(r13, r0)     // Catch: java.lang.Throwable -> Lde
            goto Lf0
        Ld6:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lde
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Lde
            throw r11     // Catch: java.lang.Throwable -> Lde
        Lde:
            r0 = move-exception
            goto Le3
        Le0:
            r0 = move-exception
            r12 = r16
        Le3:
            boolean r11 = r0 instanceof java.lang.InterruptedException
            if (r11 != 0) goto L138
            boolean r11 = r0 instanceof java.util.concurrent.CancellationException
            if (r11 != 0) goto L138
            rj6 r11 = new rj6
            r11.<init>(r0)
        Lf0:
            sj6 r0 = new sj6
            r0.<init>(r11)
            r1.n0 = r2
            r1.g0 = r9
            r1.h0 = r10
            r1.i0 = r12
            r1.j0 = r8
            r1.k0 = r7
            r1.l0 = r7
            r1.m0 = r5
            java.lang.Object r0 = r2.l(r0, r1)
            if (r0 != r6) goto L10c
            goto L130
        L10c:
            r0 = r2
            r2 = r7
            r11 = r9
            r9 = r12
        L110:
            be r12 = gx1.Y
            r12 = 15000(0x3a98, double:7.411E-320)
            lx1 r14 = lx1.Z
            long r12 = vj8.m0(r12, r14)
            r1.n0 = r0
            r1.g0 = r11
            r1.h0 = r10
            r1.i0 = r9
            r1.j0 = r8
            r1.k0 = r2
            r1.l0 = r7
            r1.m0 = r4
            java.lang.Object r7 = u70.G(r12, r1)
            if (r7 != r6) goto L131
        L130:
            return r6
        L131:
            r16 = r9
            r9 = r11
        L134:
            int r7 = r2 + 1
            goto L58
        L138:
            throw r0
        L139:
            dn8 r0 = dn8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.q(java.lang.Object):java.lang.Object");
    }
}
