package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.util.dnsttv.dto.DnsQuestion;
import su.happ.proxyutility.util.dnsttv.dto.DnsRR;
import su.happ.proxyutility.util.dnsttv.dto.enums.DnsTTLogType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class is1 {
    public final byte[] a;
    public final vk1 b;
    public final br1 c;
    public final List d;
    public final int e;
    public final int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public is1(String str, byte[] bArr, List list, vk1 vk1Var) {
        bArr.getClass();
        this.a = bArr;
        this.b = vk1Var;
        br1 br1Var = br1.b;
        this.c = ar1.a(str);
        this.e = Math.max(1, 1);
        this.f = Math.max(1, Math.min(255, 16));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.length() > 0) {
                linkedHashSet.add(str2);
            }
        }
        if (linkedHashSet.isEmpty()) {
            linkedHashSet.add(RouteSettings.DEFAULT_DOMESTIC_DNS_IP);
        }
        this.d = wv0.Y0(linkedHashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] a(br1 br1Var) {
        byte[] bArr = new byte[2];
        js1.a.nextBytes(bArr);
        yq1 yq1Var = new yq1((short) ((bArr[1] & 255) | ((bArr[0] & 255) << 8)), 60);
        yq1Var.c.add(new DnsQuestion(br1Var, (short) 16, (short) 1));
        yq1Var.f.add(new DnsRR(br1.b, (short) 41, (short) 4096, 0, new byte[0]));
        return yq1Var.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x020d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0213  */
    /* JADX WARN: Code duplicated, block: B:45:0x0217  */
    /* JADX WARN: Code duplicated, block: B:48:0x0262  */
    /* JADX WARN: Code duplicated, block: B:50:0x0296  */
    /* JADX WARN: Code duplicated, block: B:51:0x0299  */
    /* JADX WARN: Code duplicated, block: B:54:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x030c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0331  */
    /* JADX WARN: Code duplicated, block: B:64:0x033a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0355  */
    /* JADX WARN: Code duplicated, block: B:70:0x035a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0395  */
    /* JADX WARN: Code duplicated, block: B:74:0x0399  */
    /* JADX WARN: Code duplicated, block: B:76:0x039f  */
    /* JADX WARN: Code duplicated, block: B:78:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:82:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:85:0x0415  */
    /* JADX WARN: Type inference failed for: r6v6, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x030c -> B:60:0x031a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable b(byte[] r34, sn2 r35, java.lang.String r36, s51 r37) {
        /*
            r33 = this;
            r0 = r33
            r1 = r35
            r2 = r37
            boolean r3 = r2 instanceof defpackage.es1
            if (r3 == 0) goto L19
            r3 = r2
            es1 r3 = (defpackage.es1) r3
            int r4 = r3.s0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.s0 = r4
            goto L1e
        L19:
            es1 r3 = new es1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.q0
            int r4 = r3.s0
            java.lang.String r7 = "/"
            java.lang.String r10 = "ms"
            java.lang.String r11 = " time:"
            br1 r13 = r0.c
            r14 = 32
            r37 = 3
            r8 = 2
            r16 = 1
            vk1 r15 = r0.b
            r18 = 0
            r6 = 1
            c71 r9 = c71.X
            if (r4 == 0) goto La4
            if (r4 == r6) goto L87
            if (r4 != r8) goto L81
            long r0 = r3.l0
            int r4 = r3.p0
            int r14 = r3.o0
            r20 = r8
            int r8 = r3.n0
            int r12 = r3.m0
            r21 = r7
            long r6 = r3.k0
            o55 r5 = r3.j0
            r33 = r0
            byte[] r0 = r3.i0
            java.lang.String r1 = r3.h0
            r35 = r0
            sn2 r0 = r3.g0
            r36 = r0
            byte[] r0 = r3.f0
            w39.n0(r2)
            r24 = r21
            r21 = r13
            r13 = r24
            r24 = r10
            r26 = r11
            r25 = r12
            r27 = r14
            r11 = r33
            r10 = r1
            r1 = r9
            r9 = r5
            r5 = r36
            r31 = r6
            r7 = r35
            r6 = r4
            r4 = r8
            r8 = r15
            r14 = r31
            goto L31a
        L81:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            bt.i(r0)
            return r18
        L87:
            r21 = r7
            r20 = r8
            long r4 = r3.k0
            o55 r1 = r3.j0
            byte[] r6 = r3.i0
            java.lang.String r7 = r3.h0
            sn2 r8 = r3.g0
            byte[] r12 = r3.f0
            w39.n0(r2)
            r0 = r2
            r26 = r11
            r25 = r15
            r2 = r1
            r1 = r8
            r15 = r10
            goto L137
        La4:
            r21 = r7
            r20 = r8
            w39.n0(r2)
            r2 = 8
            byte[] r6 = new byte[r2]
            java.security.SecureRandom r2 = defpackage.js1.a
            r2.nextBytes(r6)
            o55 r2 = new o55
            byte[] r4 = r0.a
            r2.<init>(r4)
            long r4 = java.lang.System.currentTimeMillis()
            byte[] r7 = new byte[r14]
            v59 r8 = r2.b
            v59 r12 = r8.e0()
            byte[] r12 = r12.m0
            r0 = 0
            java.lang.System.arraycopy(r12, r0, r7, r0, r14)
            qz7 r12 = r2.a
            r12.a(r7)
            v59 r14 = r2.c
            byte[] r8 = defpackage.q55.b(r8, r14)
            r12.b(r8)
            byte[] r8 = new byte[r0]
            byte[] r0 = r12.c
            if (r0 != 0) goto Lea
            r12.a(r8)
            r26 = r11
            r25 = r15
            r15 = r10
            goto L104
        Lea:
            r25 = r15
            long r14 = r12.d
            byte[] r14 = ci8.H(r14)
            r15 = r10
            r26 = r11
            long r10 = r12.d
            long r10 = r10 + r16
            r12.d = r10
            byte[] r10 = r12.b
            byte[] r8 = ci8.l(r0, r14, r10, r8)
            r12.a(r8)
        L104:
            byte[] r0 = eu.B0(r7, r8)
            java.security.SecureRandom r7 = defpackage.vq1.a
            br1 r0 = defpackage.vq1.b(r6, r0, r13)
            byte[] r0 = a(r0)
            java.lang.Long r7 = new java.lang.Long
            r10 = 2000(0x7d0, double:9.88E-321)
            r7.<init>(r10)
            r8 = r34
            r3.f0 = r8
            r3.g0 = r1
            r10 = r36
            r3.h0 = r10
            r3.i0 = r6
            r3.j0 = r2
            r3.k0 = r4
            r11 = 1
            r3.s0 = r11
            java.lang.Object r0 = r1.x(r0, r7, r3)
            if (r0 != r9) goto L135
            r1 = r9
            goto L30b
        L135:
            r12 = r8
            r7 = r10
        L137:
            byte[] r0 = (byte[]) r0
            java.security.SecureRandom r8 = defpackage.vq1.a
            yq1 r0 = defpackage.cs1.a(r0)
            byte[] r0 = defpackage.vq1.a(r0, r13)
            qz7 r8 = r2.a
            int r10 = r0.length
            r11 = 48
            if (r10 < r11) goto L466
            r10 = 32
            r14 = 0
            byte[] r11 = eu.j0(r14, r10, r0)
            v59 r14 = defpackage.q55.a(r11)
            r8.a(r11)
            v59 r11 = r2.b
            byte[] r11 = defpackage.q55.b(r11, r14)
            r8.b(r11)
            int r11 = r0.length
            byte[] r0 = eu.j0(r10, r11, r0)
            byte[] r10 = r8.c
            if (r10 != 0) goto L171
            r8.a(r0)
            r14 = r3
            r34 = r4
            goto L18f
        L171:
            int r11 = r0.length
            r14 = 16
            if (r11 < r14) goto L45d
            r14 = r3
            r34 = r4
            long r3 = r8.d
            byte[] r3 = ci8.H(r3)
            long r4 = r8.d
            long r4 = r4 + r16
            r8.d = r4
            byte[] r4 = r8.b     // Catch: java.lang.Throwable -> L456
            byte[] r3 = ci8.k(r10, r3, r4, r0)     // Catch: java.lang.Throwable -> L456
            r8.a(r0)
            r0 = r3
        L18f:
            int r0 = r0.length
            if (r0 != 0) goto L44e
            byte[] r0 = r8.a
            r3 = 0
            byte[] r4 = new byte[r3]
            java.util.List r0 = ci8.I(r0, r4)
            java.lang.Object r4 = r0.get(r3)
            byte[] r4 = (byte[]) r4
            r2.d = r4
            r11 = 1
            java.lang.Object r0 = r0.get(r11)
            byte[] r0 = (byte[]) r0
            r2.e = r0
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "handshake:success resolver:"
            r0.<init>(r5)
            r0.append(r7)
            r5 = r26
            r0.append(r5)
            r0.append(r3)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            su.happ.proxyutility.util.dnsttv.dto.enums.DnsTTLogType r3 = su.happ.proxyutility.util.dnsttv.dto.enums.DnsTTLogType.INFO
            r8 = r25
            r4 = 4
            defpackage.jh4.v(r8, r0, r3, r4)
            int r0 = r33.e()
            int r3 = r12.length
            int r3 = r3 + r0
            r11 = 1
            int r3 = r3 - r11
            int r3 = r3 / r0
            int r3 = java.lang.Math.max(r11, r3)
            r4 = r33
            int r4 = r4.f
            if (r3 > r4) goto L446
            long r10 = java.lang.System.currentTimeMillis()
            int r4 = r12.length
            r34 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r35 = r1
            java.lang.String r1 = "data payload:"
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r4 = r18
            r1 = 6
            defpackage.jh4.v(r8, r0, r4, r1)
            r4 = r3
            r0 = r12
            r3 = r14
            r14 = 0
            r12 = r34
        L209:
            r1 = r35
            if (r14 >= r4) goto L440
            r24 = r15
            int r15 = r4 + (-1)
            if (r14 != r15) goto L217
            r15 = 1
        L214:
            r26 = r5
            goto L219
        L217:
            r15 = 0
            goto L214
        L219:
            int r5 = r14 * r12
            r25 = r9
            int r9 = r5 + r12
            r33 = r12
            int r12 = r0.length
            int r9 = java.lang.Math.min(r9, r12)
            byte[] r5 = eu.j0(r5, r9, r0)
            byte r9 = (byte) r15
            byte r12 = (byte) r14
            r34 = r9
            byte r9 = (byte) r4
            r35 = r9
            int r9 = r5.length
            r36 = r9
            r19 = 4
            int r9 = r36 + 4
            r36 = r12
            byte[] r12 = new byte[r9]
            r27 = r15
            r15 = 0
            r22 = 1
            r12[r15] = r22
            r12[r22] = r34
            r12[r20] = r36
            r12[r37] = r35
            r34 = r10
            int r10 = r5.length
            r11 = r19
            java.lang.System.arraycopy(r5, r15, r12, r11, r10)
            java.lang.String r10 = "payloadElement["
            java.lang.String r11 = "]:"
            java.lang.String r9 = pc6.m(r10, r14, r9, r11)
            r10 = 6
            r15 = 0
            defpackage.jh4.v(r8, r9, r15, r10)
            byte[] r9 = r2.d
            if (r9 == 0) goto L43a
            r10 = r0
            r15 = r1
            long r0 = r2.f
            byte[] r0 = ci8.H(r0)
            r1 = r3
            r36 = r4
            long r3 = r2.f
            long r3 = r3 + r16
            r2.f = r3
            r3 = 0
            byte[] r4 = new byte[r3]
            byte[] r0 = ci8.l(r9, r0, r4, r12)
            java.security.SecureRandom r3 = defpackage.vq1.a
            br1 r3 = defpackage.vq1.b(r6, r0, r13)
            byte[] r3 = a(r3)
            int r4 = r3.length
            java.lang.String r9 = "queryData["
            java.lang.String r4 = pc6.m(r9, r14, r4, r11)
            r9 = 6
            r11 = 0
            defpackage.jh4.v(r8, r4, r11, r9)
            long r11 = java.lang.System.currentTimeMillis()
            if (r27 == 0) goto L299
            java.lang.String r4 = "FINAL"
            goto L29b
        L299:
            java.lang.String r4 = "ack"
        L29b:
            int r9 = r14 + 1
            int r5 = r5.length
            int r0 = r0.length
            r28 = r1
            java.lang.String r1 = "  → chunk "
            r29 = r10
            java.lang.String r10 = " ["
            r30 = r21
            r21 = r13
            r13 = r30
            r30 = r15
            r15 = r36
            java.lang.StringBuilder r1 = oi0.r(r9, r1, r15, r13, r10)
            r1.append(r4)
            java.lang.String r4 = "] payload="
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = "B enc="
            r1.append(r4)
            java.lang.String r4 = "B"
            java.lang.String r0 = oi0.n(r1, r0, r4)
            r1 = 6
            r4 = 0
            defpackage.jh4.v(r8, r0, r4, r1)
            if (r27 == 0) goto L2d5
            r4 = 9000(0x2328, double:4.4466E-320)
            goto L2d7
        L2d5:
            r4 = 4000(0xfa0, double:1.9763E-320)
        L2d7:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            r4 = r28
            r10 = r29
            r4.f0 = r10
            r5 = r30
            r4.g0 = r5
            r4.h0 = r7
            r4.i0 = r6
            r4.j0 = r2
            r9 = r2
            r1 = r34
            r4.k0 = r1
            r1 = r33
            r4.m0 = r1
            r4.n0 = r15
            r4.o0 = r14
            r2 = r27
            r4.p0 = r2
            r4.l0 = r11
            r1 = r20
            r4.s0 = r1
            java.lang.Object r0 = r5.x(r3, r0, r4)
            r1 = r25
            if (r0 != r1) goto L30c
        L30b:
            return r1
        L30c:
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r7
            r7 = r6
            r6 = r3
            r25 = r33
            r3 = r4
            r27 = r14
            r4 = r15
            r14 = r34
        L31a:
            byte[] r2 = (byte[]) r2
            java.security.SecureRandom r28 = defpackage.vq1.a
            yq1 r2 = defpackage.cs1.a(r2)
            r33 = r0
            r0 = r21
            byte[] r2 = defpackage.vq1.a(r2, r0)
            r9.getClass()
            byte[] r0 = r9.e
            if (r0 == 0) goto L434
            r28 = r1
            int r1 = r2.length
            r34 = r3
            r3 = 16
            if (r1 < r3) goto L42b
            r35 = r5
            r36 = r6
            long r5 = r9.g
            byte[] r1 = ci8.H(r5)
            long r5 = r9.g
            long r5 = r5 + r16
            r9.g = r5
            r3 = 0
            byte[] r5 = new byte[r3]     // Catch: java.lang.Throwable -> L424
            byte[] r0 = ci8.k(r0, r1, r5, r2)     // Catch: java.lang.Throwable -> L424
            int r1 = r0.length
            r2 = 4
            if (r1 < r2) goto L415
            r1 = r0[r3]
            r5 = 1
            if (r1 != r5) goto L3f0
            int r1 = r0.length
            int r1 = r1 - r2
            byte[] r6 = new byte[r1]
            java.lang.System.arraycopy(r0, r2, r6, r3, r1)
            r2 = r0[r5]
            r20 = 2
            r3 = r0[r20]
            r0 = r0[r37]
            int r0 = r27 + 1
            long r29 = java.lang.System.currentTimeMillis()
            long r11 = r29 - r11
            java.lang.String r3 = "  ← chunk "
            java.lang.String r5 = " reply="
            java.lang.StringBuilder r0 = oi0.r(r0, r3, r4, r13, r5)
            r0.append(r1)
            java.lang.String r1 = "B ("
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = "ms)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            su.happ.proxyutility.util.dnsttv.dto.enums.DnsTTLogType r1 = su.happ.proxyutility.util.dnsttv.dto.enums.DnsTTLogType.INFO
            r11 = 4
            defpackage.jh4.v(r8, r0, r1, r11)
            if (r36 == 0) goto L3d4
            r0 = r2 & 2
            if (r0 == 0) goto L3cc
            r22 = 1
            r0 = r2 & 1
            if (r0 == 0) goto L3c4
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "send data:success resolver:"
            r0.<init>(r4)
            r0.append(r10)
            r5 = r26
            r0.append(r5)
            r0.append(r2)
            r2 = r24
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11 = 4
            defpackage.jh4.v(r8, r0, r1, r11)
            return r6
        L3c4:
            vr0$c r0 = new vr0$c
            java.lang.String r1 = "multi-chunk responses not supported yet"
            r0.<init>(r1)
            throw r0
        L3cc:
            vr0$b r0 = new vr0$b
            java.lang.String r1 = "response chunk missing is_response flag"
            r0.<init>(r1)
            throw r0
        L3d4:
            r2 = r24
            r5 = r26
            r11 = 4
            int r0 = r27 + 1
            r1 = r21
            r21 = r13
            r13 = r1
            r3 = r34
            r6 = r7
            r7 = r10
            r10 = r14
            r12 = r25
            r14 = r0
            r15 = r2
            r2 = r9
            r9 = r28
            r0 = r33
            goto L209
        L3f0:
            vr0$a r1 = new vr0$a
            r23 = 0
            r0 = r0[r23]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r11 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r11)
            java.lang.String r2 = "%02x"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r2 = "chunk has unknown version 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L415:
            vr0$d r1 = new vr0$d
            int r0 = r0.length
            java.lang.String r2 = "chunk too short (got "
            java.lang.String r3 = " bytes, need 4)"
            java.lang.String r0 = ie2.h(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        L424:
            r0 = move-exception
            p55$a r1 = new p55$a
            r1.<init>(r0)
            throw r1
        L42b:
            p55$c r0 = new p55$c
            int r1 = r2.length
            r14 = 16
            r0.<init>(r1, r14)
            throw r0
        L434:
            p55$b r0 = new p55$b
            r0.<init>()
            throw r0
        L43a:
            p55$b r0 = new p55$b
            r0.<init>()
            throw r0
        L440:
            te8$c r0 = new te8$c
            r0.<init>()
            throw r0
        L446:
            java.lang.String r0 = "size pre-check should have caught oversized payload"
            bt.q(r0)
            r18 = 0
            return r18
        L44e:
            p55$e r0 = new p55$e
            java.lang.String r1 = "unexpected non-empty handshake payload"
            r0.<init>(r1)
            throw r0
        L456:
            r0 = move-exception
            p55$a r1 = new p55$a
            r1.<init>(r0)
            throw r1
        L45d:
            p55$c r1 = new p55$c
            int r0 = r0.length
            r14 = 16
            r1.<init>(r0, r14)
            throw r1
        L466:
            p55$c r1 = new p55$c
            int r0 = r0.length
            r1.<init>(r0, r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is1.b(byte[], sn2, java.lang.String, s51):java.io.Serializable");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:86:0x026a) to fix multi-entry loop: BACK_EDGE: B:86:0x026a -> B:94:0x029b */
    /* JADX WARN: Can't wrap try/catch for region: R(15:31|(1:33)(1:34)|126|35|36|118|37|38|136|39|40|114|41|42|(1:44)(1:45)) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:0|2|(2:4|(1:6)(1:7))(1:7)|8|(1:(4:11|138|12|13)(2:16|17))(2:18|(2:20|21)(2:22|(2:24|25)(3:26|27|(2:29|(15:31|(1:33)(1:34)|126|35|36|118|37|38|136|39|40|114|41|42|(1:44)(1:45))(2:110|111))(2:112|113))))|134|46|47|130|48|49|124|50|51|116|52|53|132|54|55|128|56|57|122|58|59|120|60|61|140|62|63|(1:(0))) */
    /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:110:0x0302  */
    /* JADX WARN: Code duplicated, block: B:112:0x0307  */
    /* JADX WARN: Code duplicated, block: B:29:0x014f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0159  */
    /* JADX WARN: Code duplicated, block: B:33:0x0185  */
    /* JADX WARN: Code duplicated, block: B:34:0x0187  */
    /* JADX WARN: Code duplicated, block: B:44:0x01bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:96:0x029f  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b4  */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02c1, code lost:
    
        r0 = sj6.a(new rj6(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02ca, code lost:
    
        if (r0 != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02cc, code lost:
    
        r5 = java.lang.System.currentTimeMillis() - r10;
        r0 = r0.getMessage();
        r10 = oi0.r(r12, "onFailure[", r13, r3, r4);
        oi0.y(r10, r2, " t:", r0, " in ");
        defpackage.jh4.v(r1, ie2.g(r5, r7, r10), su.happ.proxyutility.util.dnsttv.dto.enums.DnsTTLogType.INFO, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ee, code lost:
    
        r11 = r3;
        r10 = r4;
        r8 = r7;
        r4 = r13;
        r6 = r16;
        r12 = r18;
        r3 = r19;
        r7 = r22;
        r5 = r23;
        r13 = r1;
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x029b, code lost:
    
        r5 = r2;
        r2 = r8;
        r19 = r12;
        r12 = r8;
        r8 = r19;
        r19 = r29;
        r20 = r13;
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x021f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0220, code lost:
    
        r2 = r5;
        r1 = r8;
        r8 = r12;
        r12 = r16;
        r6 = r24;
        r5 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x022b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x022c, code lost:
    
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0230, code lost:
    
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0233, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0234, code lost:
    
        r19 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0237, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0240, code lost:
    
        r19 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0243, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0244, code lost:
    
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0246, code lost:
    
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0251, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0252, code lost:
    
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0255, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0256, code lost:
    
        r29 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0259, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x025a, code lost:
    
        r29 = r1;
        r24 = r3;
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0261, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0262, code lost:
    
        r7 = r18;
        r4 = r19;
        r3 = r20;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x026a, code lost:
    
        r5 = r2;
        r2 = r5;
        r19 = r12;
        r12 = r8;
        r8 = r19;
        r19 = r29;
        r20 = r13;
        r13 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x027b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0280, code lost:
    
        r7 = r18;
        r4 = r19;
        r1 = r21;
        r8 = r3;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x028b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x028c, code lost:
    
        r29 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0293, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0294, code lost:
    
        r22 = r7;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01bd -> B:134:0x01c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(byte[] bArr, DnsTTLogType dnsTTLogType, s51 s51Var) throws Throwable {
        fs1 fs1Var;
        int i;
        int i2;
        Iterator it;
        int i3;
        fs1 fs1Var2;
        String str;
        String str2;
        String str3;
        long jCurrentTimeMillis;
        jh4 jh4Var;
        int i4;
        DnsTTLogType dnsTTLogType2;
        String str4;
        int i5;
        int i6;
        int i7;
        String str5;
        int i8;
        byte[] bArr2;
        int i9;
        Object obj;
        fs1 fs1Var3;
        Iterator it2;
        is1 is1Var = this;
        if (s51Var instanceof fs1) {
            fs1Var = (fs1) s51Var;
            int i10 = fs1Var.t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fs1Var.t0 = i10 - Integer.MIN_VALUE;
            } else {
                fs1Var = new fs1(is1Var, s51Var);
            }
        } else {
            fs1Var = new fs1(is1Var, s51Var);
        }
        Object obj2 = fs1Var.r0;
        int i11 = fs1Var.t0;
        String str6 = "ms";
        String str7 = "]:";
        String str8 = "/";
        jh4 jh4Var2 = is1Var.b;
        if (i11 == 0) {
            w39.n0(obj2);
            int iE = is1Var.e() * is1Var.f;
            if (bArr.length > iE) {
                jh4.v(jh4Var2, "PRECHECK FAIL " + new ds1.a(pc6.m("payload too large: ", bArr.length, iE, " bytes > max ")) + " — no resolver work performed", null, 6);
                return new t82(null, null, new Integer(900));
            }
            int iE2 = is1Var.e();
            int iMax = Math.max(1, ((bArr.length + iE2) - 1) / iE2);
            int length = bArr.length;
            List list = is1Var.d;
            int size = list.size();
            StringBuilder sbR = oi0.r(length, "fetch start: payload=", iE2, "B, perChunk=", "B, chunks=");
            sbR.append(iMax);
            sbR.append(", resolvers=");
            sbR.append(size);
            jh4.v(jh4Var2, sbR.toString(), null, 6);
            if (list.isEmpty()) {
                return new t82(null, null, new Integer(901));
            }
            int size2 = list.size() - 1;
            DnsTTLogType dnsTTLogType3 = dnsTTLogType;
            i = iE;
            i2 = iE2;
            it = list.iterator();
            i3 = iMax;
            int i12 = size2;
            fs1Var2 = fs1Var;
            int i13 = 0;
            byte[] bArr3 = bArr;
            if (!it.hasNext()) {
                return new t82(null, null, new Integer(902));
            }
            Object next = it.next();
            str = str6;
            int i14 = i13 + 1;
            if (i13 < 0) {
                i21.X();
                throw null;
            }
            int i15 = i14;
            String str9 = (String) next;
            str2 = str7;
            str3 = str8;
            jh4.v(jh4Var2, oi0.p(oi0.r(i13, "resolver[", i12, str8, str7), str9, " start"), DnsTTLogType.INFO, 4);
            gs1 gs1Var = new gs1(str9, is1Var, (q51) null, (byte) 0);
            jCurrentTimeMillis = System.currentTimeMillis();
            jh4Var = jh4Var2;
            if (dnsTTLogType3 == DnsTTLogType.DEBUG) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i16 = is1Var.e;
            fs1Var2.f0 = bArr3;
            fs1Var2.g0 = dnsTTLogType3;
            fs1Var2.h0 = it;
            fs1Var2.i0 = str9;
            fs1Var2.j0 = i;
            fs1Var2.k0 = i2;
            fs1Var2.l0 = i3;
            fs1Var2.m0 = i12;
            dnsTTLogType2 = dnsTTLogType3;
            fs1Var2.n0 = i15;
            fs1Var2.o0 = i13;
            fs1Var2.q0 = jCurrentTimeMillis;
            fs1Var2.p0 = i4;
            i15 = i15;
            fs1Var2.t0 = 1;
            int i17 = i12;
            i3 = i3;
            str5 = str9;
            i8 = i13;
            Object objD = is1Var.d(bArr3, gs1Var, i16, str5, fs1Var2);
            c71 c71Var = c71.X;
            if (objD == c71Var) {
                return c71Var;
            }
            bArr2 = bArr3;
            fs1Var = fs1Var2;
            i6 = i4;
            i7 = i17;
            i9 = i15;
            obj = objD;
        } else {
            if (i11 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i6 = fs1Var.p0;
            long j = fs1Var.q0;
            int i18 = fs1Var.o0;
            int i19 = fs1Var.n0;
            int i20 = fs1Var.m0;
            int i21 = fs1Var.l0;
            int i22 = fs1Var.k0;
            int i23 = fs1Var.j0;
            String str10 = fs1Var.i0;
            Iterator it3 = fs1Var.h0;
            DnsTTLogType dnsTTLogType4 = fs1Var.g0;
            byte[] bArr4 = fs1Var.f0;
            try {
                w39.n0(obj2);
                bArr2 = bArr4;
                i3 = i21;
                obj = obj2;
                dnsTTLogType2 = dnsTTLogType4;
                i2 = i22;
                str = "ms";
                i8 = i18;
                jh4Var = jh4Var2;
                i7 = i20;
                it = it3;
                i = i23;
                str3 = "/";
                i9 = i19;
                str5 = str10;
                str2 = "]:";
                jCurrentTimeMillis = j;
            } catch (Throwable th) {
                th = th;
                jh4 jh4Var3 = jh4Var2;
                i7 = i20;
                i3 = i21;
                dnsTTLogType2 = dnsTTLogType4;
                i2 = i22;
                i = i23;
                byte[] bArr5 = bArr4;
                fs1Var2 = fs1Var;
                str4 = "/";
                String str11 = str10;
                i5 = i19;
                str = "ms";
                Iterator it4 = it3;
                i6 = i6;
                str2 = "]:";
                jCurrentTimeMillis = j;
                bArr = bArr5;
                if (i6 != 0) {
                    fs1Var3 = fs1Var2;
                    it2 = it4;
                    if (!fm7.d0(gv3.W(th), "util.protection", false)) {
                        th.printStackTrace();
                    }
                } else {
                    fs1Var3 = fs1Var2;
                    it2 = it4;
                }
                if (!(th instanceof InterruptedException)) {
                }
                throw th;
            }
        }
        byte[] bArr6 = (byte[]) obj;
        int i24 = i8;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        int length2 = bArr6.length;
        byte[] bArr7 = bArr2;
        StringBuilder sb = new StringBuilder();
        sb.append("resolver[");
        fs1 fs1Var4 = fs1Var;
        sb.append(i24);
        i24 = i24;
        str4 = str3;
        sb.append(str4);
        sb.append(i7);
        i6 = i6;
        str2 = str2;
        sb.append(str2);
        sb.append(str5);
        i5 = i9;
        sb.append(" SUCCESS — response=");
        sb.append(length2);
        sb.append("B in ");
        sb.append(jCurrentTimeMillis2);
        str = str;
        sb.append(str);
        jh4Var = jh4Var;
        jh4.v(jh4Var, sb.toString(), DnsTTLogType.INFO, 4);
        return new t82(bArr6, str5, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:29:0x0079) to fix multi-entry loop: BACK_EDGE: B:29:0x0079 -> B:33:0x0092 */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(1:7)|8|(3:(1:(1:12)(2:13|14))(4:15|39|16|17)|33|(1:35)(1:42))(2:20|(1:22)(1:36))|37|23|(1:32)(1:26)) */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        r1 = r11;
        r11 = r12;
        r12 = r1;
        r6 = r10;
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r10 < r11) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (u70.F(500, r0) == r5) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008f -> B:33:0x0092). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(byte[] bArr, gs1 gs1Var, int i, String str, s51 s51Var) throws Throwable {
        hs1 hs1Var;
        int i2;
        gs1 gs1Var2;
        int i3;
        Throwable th;
        byte[] bArr2;
        int i4;
        if (s51Var instanceof hs1) {
            hs1Var = (hs1) s51Var;
            int i5 = hs1Var.n0;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                hs1Var.n0 = i5 - Integer.MIN_VALUE;
            } else {
                hs1Var = new hs1(this, s51Var);
            }
        } else {
            hs1Var = new hs1(this, s51Var);
        }
        Object obj = hs1Var.l0;
        int i6 = hs1Var.n0;
        Serializable serializable = c71.X;
        if (i6 != 0) {
            if (i6 == 1) {
                i4 = hs1Var.k0;
                i3 = hs1Var.j0;
                String str2 = hs1Var.h0;
                gs1 gs1Var3 = hs1Var.g0;
                byte[] bArr3 = hs1Var.f0;
                try {
                    w39.n0(obj);
                    return obj;
                } catch (Throwable th2) {
                    bArr2 = bArr3;
                    gs1Var2 = gs1Var3;
                    str = str2;
                    th = th2;
                    if (i4 < i3) {
                        hs1Var.f0 = bArr2;
                        hs1Var.g0 = gs1Var2;
                        hs1Var.h0 = str;
                        hs1Var.i0 = th;
                        hs1Var.j0 = i3;
                        hs1Var.k0 = i4;
                        hs1Var.n0 = 2;
                    }
                }
            } else {
                if (i6 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i4 = hs1Var.k0;
                i3 = hs1Var.j0;
                th = hs1Var.i0;
                str = hs1Var.h0;
                gs1Var2 = hs1Var.g0;
                bArr2 = hs1Var.f0;
                w39.n0(obj);
            }
            Throwable th3 = th;
            i = i3;
            gs1Var = gs1Var2;
            if (i4 == i) {
                throw th3;
            }
            i2 = i4 + 1;
            bArr = bArr2;
        } else {
            w39.n0(obj);
            te8.d dVar = new te8.d();
            if (1 > i) {
                throw dVar;
            }
            i2 = 1;
        }
        hs1Var.f0 = bArr;
        hs1Var.g0 = gs1Var;
        hs1Var.h0 = str;
        hs1Var.i0 = null;
        hs1Var.j0 = i;
        hs1Var.k0 = i2;
        hs1Var.n0 = 1;
        Serializable serializableB = this.b(bArr, gs1Var, str, hs1Var);
        return serializableB == serializable ? serializable : serializableB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e() {
        Iterator it = this.c.a.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length + 1;
        }
        int iMax = Math.max(0, 255 - (length + 1));
        int i = iMax / 64;
        return Math.max(0, Math.max(0, ((((i * 63) + Math.max(0, (iMax - (i * 64)) - 1)) * 5) / 8) - 28) - 4);
    }
}
