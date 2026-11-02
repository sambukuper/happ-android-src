package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import defpackage.h70;
import defpackage.oi0;
import defpackage.rl6;
import io.sentry.ILogger;
import io.sentry.f7;
import io.sentry.j5;
import io.sentry.k5;
import io.sentry.protocol.DebugImage;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.v4;
import io.sentry.w3;
import io.sentry.x3;
import io.sentry.y4;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements io.sentry.i0 {
    public final Context a;
    public final SentryAndroidOptions b;
    public final n0 c;
    public final k5 d;
    public final io.sentry.cache.g e;
    public final List f = Collections.singletonList(new h0(this));

    public j0(Context context, n0 n0Var, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = sentryAndroidOptions;
        this.c = n0Var;
        this.e = sentryAndroidOptions.findPersistingScopeObserver();
        this.d = new k5(new io.sentry.z(sentryAndroidOptions));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0246  */
    /* JADX WARN: Code duplicated, block: B:102:0x024b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0251  */
    /* JADX WARN: Code duplicated, block: B:114:0x026e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0270  */
    /* JADX WARN: Code duplicated, block: B:116:0x0273  */
    /* JADX WARN: Code duplicated, block: B:117:0x0275  */
    /* JADX WARN: Code duplicated, block: B:122:0x028c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0299  */
    /* JADX WARN: Code duplicated, block: B:127:0x029d  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:141:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:144:0x0305  */
    /* JADX WARN: Code duplicated, block: B:145:0x030e  */
    /* JADX WARN: Code duplicated, block: B:148:0x031c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0332  */
    /* JADX WARN: Code duplicated, block: B:154:0x034a  */
    /* JADX WARN: Code duplicated, block: B:157:0x0351  */
    /* JADX WARN: Code duplicated, block: B:164:0x0372  */
    /* JADX WARN: Code duplicated, block: B:166:0x0376  */
    /* JADX WARN: Code duplicated, block: B:168:0x0385  */
    /* JADX WARN: Code duplicated, block: B:171:0x0393  */
    /* JADX WARN: Code duplicated, block: B:173:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:174:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:179:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:182:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:184:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:187:0x0405  */
    /* JADX WARN: Code duplicated, block: B:192:0x0425  */
    /* JADX WARN: Code duplicated, block: B:195:0x0433  */
    /* JADX WARN: Code duplicated, block: B:198:0x0444  */
    /* JADX WARN: Code duplicated, block: B:201:0x0456 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x0469  */
    /* JADX WARN: Code duplicated, block: B:206:0x046f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0484  */
    /* JADX WARN: Code duplicated, block: B:210:0x048c  */
    /* JADX WARN: Code duplicated, block: B:211:0x048e  */
    /* JADX WARN: Code duplicated, block: B:217:0x04ae A[Catch: all -> 0x04c1, TRY_LEAVE, TryCatch #0 {all -> 0x04c1, blocks: (B:215:0x049e, B:217:0x04ae), top: B:517:0x049e }] */
    /* JADX WARN: Code duplicated, block: B:221:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:223:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:225:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:227:0x04df  */
    /* JADX WARN: Code duplicated, block: B:229:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:234:0x050f  */
    /* JADX WARN: Code duplicated, block: B:237:0x0518  */
    /* JADX WARN: Code duplicated, block: B:239:0x0526 A[DONT_INVERT, PHI: r6
  0x0526: PHI (r6v13 java.lang.String) = (r6v12 java.lang.String), (r6v25 java.lang.String), (r6v27 java.lang.String) binds: [B:207:0x0482, B:237:0x0518, B:236:0x0516] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:241:0x0529  */
    /* JADX WARN: Code duplicated, block: B:244:0x0539  */
    /* JADX WARN: Code duplicated, block: B:247:0x0549  */
    /* JADX WARN: Code duplicated, block: B:250:0x055c  */
    /* JADX WARN: Code duplicated, block: B:253:0x0565  */
    /* JADX WARN: Code duplicated, block: B:256:0x0575  */
    /* JADX WARN: Code duplicated, block: B:258:0x0581  */
    /* JADX WARN: Code duplicated, block: B:262:0x0595  */
    /* JADX WARN: Code duplicated, block: B:265:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:268:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:271:0x05cd A[Catch: all -> 0x05e2, TryCatch #2 {all -> 0x05e2, blocks: (B:269:0x05c5, B:271:0x05cd, B:273:0x05db), top: B:520:0x05c5 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x05db A[Catch: all -> 0x05e2, TRY_LEAVE, TryCatch #2 {all -> 0x05e2, blocks: (B:269:0x05c5, B:271:0x05cd, B:273:0x05db), top: B:520:0x05c5 }] */
    /* JADX WARN: Code duplicated, block: B:280:0x0605  */
    /* JADX WARN: Code duplicated, block: B:282:0x0609  */
    /* JADX WARN: Code duplicated, block: B:283:0x0612  */
    /* JADX WARN: Code duplicated, block: B:286:0x0620  */
    /* JADX WARN: Code duplicated, block: B:291:0x0646  */
    /* JADX WARN: Code duplicated, block: B:301:0x066a  */
    /* JADX WARN: Code duplicated, block: B:306:0x0680 A[Catch: all -> 0x06bd, TryCatch #13 {all -> 0x06bd, blocks: (B:304:0x0678, B:306:0x0680, B:308:0x0694, B:309:0x0699, B:310:0x06a1, B:312:0x06a7), top: B:542:0x0678 }] */
    /* JADX WARN: Code duplicated, block: B:308:0x0694 A[Catch: all -> 0x06bd, TryCatch #13 {all -> 0x06bd, blocks: (B:304:0x0678, B:306:0x0680, B:308:0x0694, B:309:0x0699, B:310:0x06a1, B:312:0x06a7), top: B:542:0x0678 }] */
    /* JADX WARN: Code duplicated, block: B:312:0x06a7 A[Catch: all -> 0x06bd, LOOP:5: B:310:0x06a1->B:312:0x06a7, LOOP_END, TRY_LEAVE, TryCatch #13 {all -> 0x06bd, blocks: (B:304:0x0678, B:306:0x0680, B:308:0x0694, B:309:0x0699, B:310:0x06a1, B:312:0x06a7), top: B:542:0x0678 }] */
    /* JADX WARN: Code duplicated, block: B:317:0x06cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:318:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:320:0x06df  */
    /* JADX WARN: Code duplicated, block: B:323:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:375:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:377:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:379:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:381:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:383:0x07da  */
    /* JADX WARN: Code duplicated, block: B:416:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:419:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:421:0x0907  */
    /* JADX WARN: Code duplicated, block: B:423:0x0947  */
    /* JADX WARN: Code duplicated, block: B:425:0x096e  */
    /* JADX WARN: Code duplicated, block: B:426:0x0977  */
    /* JADX WARN: Code duplicated, block: B:429:0x0980  */
    /* JADX WARN: Code duplicated, block: B:431:0x098b  */
    /* JADX WARN: Code duplicated, block: B:436:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:438:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:442:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:449:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:450:0x0a95  */
    /* JADX WARN: Code duplicated, block: B:453:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:455:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:458:0x0ada  */
    /* JADX WARN: Code duplicated, block: B:460:0x0b37  */
    /* JADX WARN: Code duplicated, block: B:461:0x0b44  */
    /* JADX WARN: Code duplicated, block: B:468:0x0b6d  */
    /* JADX WARN: Code duplicated, block: B:472:0x0b7a  */
    /* JADX WARN: Code duplicated, block: B:474:0x0b84  */
    /* JADX WARN: Code duplicated, block: B:507:0x0bf9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:508:0x0bfb  */
    /* JADX WARN: Code duplicated, block: B:512:0x0c13  */
    /* JADX WARN: Code duplicated, block: B:515:0x0c1f  */
    /* JADX WARN: Code duplicated, block: B:517:0x049e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x0219 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x0652 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:0x0632 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:0x061a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x0a0a A[EDGE_INSN: B:582:0x0a0a->B:444:0x0a0a BREAK  A[LOOP:9: B:417:0x08e1->B:443:0x09e1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x09e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x09be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x0511 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x020d  */
    /* JADX WARN: Instruction removed from duplicated block: B:458:0x0ada, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:472:0x0b7a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2, types: [io.sentry.hints.b] */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r35v0, types: [io.sentry.android.core.j0] */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r35v14 */
    /* JADX WARN: Type inference failed for: r35v15, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r35v16 */
    /* JADX WARN: Type inference failed for: r35v17 */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v10, types: [io.sentry.protocol.e] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v42, types: [io.sentry.protocol.e] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v49, types: [io.sentry.hints.b] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v47, types: [java.io.File] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // io.sentry.i0
    public final j5 b(j5 j5Var, io.sentry.n0 n0Var) {
        h0 h0Var;
        Context context;
        Long l;
        Long lValueOf;
        String str;
        Long lValueOf2;
        ?? r19;
        ?? r20;
        PackageInfo packageInfoD;
        long j;
        long j2;
        i0 i0Var;
        i0 i0Var2;
        Map map;
        h0 h0Var2;
        Iterator it;
        Map.Entry entry;
        List list;
        List list2;
        Map map2;
        io.sentry.protocol.e eVar;
        String str2;
        List list3;
        s5 s5Var;
        f7 f7Var;
        String str3;
        String cacheDirPath;
        Class cls;
        String str4;
        Double d;
        String string;
        String str5;
        File[] fileArrListFiles;
        int length;
        int i;
        File file;
        File[] fileArr;
        io.sentry.protocol.f fVar;
        List list4;
        io.sentry.protocol.a aVarE;
        io.sentry.protocol.a aVar;
        PackageInfo packageInfoD2;
        Map map3;
        io.sentry.protocol.i0 i0Var3;
        io.sentry.protocol.i0 i0Var4;
        String strA;
        boolean zEquals;
        SentryAndroidOptions sentryAndroidOptions;
        SentryAndroidOptions sentryAndroidOptions2;
        ?? r3;
        ?? r110;
        ArrayList arrayListD;
        List list5;
        ?? r0;
        io.sentry.protocol.a aVarE2;
        String cacheDirPath2;
        long time;
        t tVar;
        s5 s5Var2;
        ?? r21;
        ?? r111;
        ArrayList arrayList;
        io.sentry.android.core.anr.a aVar2;
        SentryAndroidOptions sentryAndroidOptions3;
        int i2;
        StackTraceElement[] stackTraceElementArr;
        io.sentry.protocol.profiling.a aVar3;
        ArrayList arrayList2;
        HashMap map4;
        ArrayList arrayList3;
        HashMap map5;
        Iterator it2;
        Iterator it3;
        String str6;
        w3 w3Var;
        String str7;
        io.sentry.protocol.f fVar2;
        io.sentry.protocol.w wVar;
        StackTraceElement[] stackTraceElementArr2;
        StackTraceElement[] stackTraceElementArr3;
        ArrayList<Integer> arrayList4;
        int length2;
        int i3;
        StringBuilder sb;
        String string2;
        Integer numValueOf;
        StackTraceElement stackTraceElement;
        String string3;
        Integer numValueOf2;
        io.sentry.protocol.a0 a0Var;
        Integer numValueOf3;
        ?? r35;
        ?? r22;
        ?? r112;
        int i4;
        rl6 rl6Var;
        HashMap map6;
        String str8;
        h70 h70Var;
        String[] strArr;
        String str9;
        Iterator it4;
        Map.Entry entry2;
        Object value;
        Iterator it5;
        Map.Entry entry3;
        DisplayMetrics displayMetrics;
        String strA2;
        io.sentry.protocol.e0 e0Var;
        ArrayList arrayList5;
        j5 j5Var2 = j5Var;
        Object objB = n0Var.b("sentry:typeCheckHint");
        boolean z = objB instanceof io.sentry.hints.b;
        SentryAndroidOptions sentryAndroidOptions4 = this.b;
        if (!z) {
            sentryAndroidOptions4.getLogger().h(s5.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return j5Var2;
        }
        io.sentry.hints.b bVar = (io.sentry.hints.b) objB;
        Iterator it6 = this.f.iterator();
        do {
            if (!it6.hasNext()) {
                h0Var = null;
                break;
            }
            h0Var = (h0) it6.next();
            h0Var.getClass();
        } while (!(objB instanceof z));
        String str10 = "ANR";
        if (h0Var != null) {
            boolean zEquals2 = bVar instanceof io.sentry.hints.a ? "anr_background".equals(((io.sentry.hints.a) bVar).e()) : false;
            j0 j0Var = h0Var.a;
            if (j5Var2.j0 == null) {
                j5Var2.j0 = "java";
            }
            if (j5Var2.d() == null) {
                io.sentry.protocol.o oVar = new io.sentry.protocol.o();
                if (bVar.a()) {
                    oVar.X = "AppExitInfo";
                } else {
                    oVar.X = "HistoricalAppExitInfo";
                }
                ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(zEquals2 ? "Background ANR" : "ANR", Thread.currentThread());
                ArrayList arrayListE = j5Var2.e();
                if (arrayListE == null) {
                    e0Var = null;
                    break;
                }
                Iterator it7 = arrayListE.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        e0Var = null;
                        break;
                    }
                    e0Var = (io.sentry.protocol.e0) it7.next();
                    String str11 = e0Var.Z;
                    if (str11 != null && str11.equals("main")) {
                        break;
                    }
                }
                if (e0Var == null) {
                    e0Var = new io.sentry.protocol.e0();
                    e0Var.k0 = new io.sentry.protocol.c0();
                }
                j0Var.d.getClass();
                io.sentry.protocol.c0 c0Var = e0Var.k0;
                if (c0Var == null) {
                    arrayList5 = new ArrayList(0);
                } else {
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(k5.c(applicationNotResponding, oVar, e0Var.X, c0Var.X, true));
                    arrayList5 = arrayList6;
                }
                j5Var2.h(arrayList5);
            }
        }
        io.sentry.protocol.e eVar2 = j5Var2.Y;
        io.sentry.protocol.q qVarH = eVar2.h();
        Context context2 = this.a;
        eVar2.t(sentryAndroidOptions4.getOrCreateDeviceInfoUtil(context2).g);
        if (qVarH != null) {
            String str12 = qVarH.X;
            eVar2.l(qVarH, (str12 == null || str12.isEmpty()) ? "os_1" : "os_" + str12.trim().toLowerCase(Locale.ROOT));
        }
        io.sentry.protocol.h hVarF = eVar2.f();
        String str13 = "Error getting installationId.";
        n0 n0Var2 = this.c;
        if (hVarF == null) {
            io.sentry.protocol.h hVar = new io.sentry.protocol.h();
            hVar.Y = Build.MANUFACTURER;
            hVar.Z = Build.BRAND;
            hVar.f0 = m0.a(sentryAndroidOptions4.getLogger());
            hVar.g0 = Build.MODEL;
            hVar.h0 = Build.ID;
            hVar.i0 = Build.SUPPORTED_ABIS;
            ActivityManager.MemoryInfo memoryInfoB = m0.b(context2, sentryAndroidOptions4.getLogger());
            context = context2;
            if (memoryInfoB != null) {
                hVar.o0 = Long.valueOf(memoryInfoB.totalMem);
            }
            hVar.n0 = n0Var2.b();
            ILogger logger = sentryAndroidOptions4.getLogger();
            try {
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th) {
                logger.e(s5.ERROR, "Error getting DisplayMetrics.", th);
                displayMetrics = null;
            }
            if (displayMetrics != null) {
                hVar.w0 = Integer.valueOf(displayMetrics.widthPixels);
                hVar.x0 = Integer.valueOf(displayMetrics.heightPixels);
                hVar.y0 = Float.valueOf(displayMetrics.density);
                hVar.z0 = Integer.valueOf(displayMetrics.densityDpi);
            }
            if (hVar.C0 == null) {
                try {
                    strA2 = x0.a(context);
                } catch (Throwable th2) {
                    sentryAndroidOptions4.getLogger().e(s5.ERROR, "Error getting installationId.", th2);
                    strA2 = null;
                }
                hVar.C0 = strA2;
            }
            ArrayList arrayListA = io.sentry.android.core.internal.util.g.c.a();
            if (!arrayListA.isEmpty()) {
                hVar.H0 = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
                hVar.G0 = Integer.valueOf(arrayListA.size());
            }
            eVar2.q(hVar);
        } else {
            context = context2;
        }
        boolean z2 = bVar instanceof io.sentry.hints.a;
        if (!z2) {
            if (bVar instanceof io.sentry.hints.g) {
                lValueOf = Long.valueOf(((i2) ((io.sentry.hints.g) bVar)).f0);
            } else {
                l = null;
            }
            str = (String) io.sentry.cache.a.c(sentryAndroidOptions4, ".options-cache", "app-last-update-time.json", String.class);
            if (str == null) {
                try {
                    lValueOf2 = Long.valueOf(str);
                    r19 = bVar;
                    r20 = z2 ? 1 : 0;
                    str10 = "ANR";
                    l = l;
                } catch (NumberFormatException e) {
                    sentryAndroidOptions4.getLogger().d(s5.ERROR, e, "Failed to read options cache generation.", new Object[0]);
                    lValueOf2 = null;
                    r19 = bVar;
                    r20 = z2;
                }
                packageInfoD = m0.d(context, n0Var2);
                if (packageInfoD == null) {
                    j2 = 0;
                    j = 0;
                } else {
                    j = 0;
                    j2 = packageInfoD.lastUpdateTime;
                }
                if (l == null && j2 > j && j2 <= l.longValue()) {
                    i0Var = (lValueOf2 == null || lValueOf2.longValue() != j2) ? i0.CURRENT : i0.PERSISTED_WITH_CURRENT_FALLBACK;
                } else if (lValueOf2 == null) {
                    i0Var = i0.PERSISTED;
                } else if (l != null || lValueOf2.longValue() <= j || lValueOf2.longValue() > l.longValue()) {
                    i0Var = i0.NONE;
                } else {
                    i0Var = i0.PERSISTED;
                }
                i0Var2 = i0Var;
                if (!r19.a()) {
                    if (j5Var2.h0 == null) {
                        j5Var2.h0 = (String) e("release.json", String.class, sentryAndroidOptions4.getRelease(), i0Var2);
                    }
                    if (j5Var2.i0 == null) {
                        j5Var2.i0 = (String) e("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), i0Var2);
                    }
                    h(j5Var2, i0Var2);
                    g(j5Var);
                    sentryAndroidOptions4.getLogger().h(s5.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
                    return j5Var2;
                }
                if (j5Var2.f0 == null) {
                    j5Var2.f0 = (io.sentry.protocol.r) f(sentryAndroidOptions4, "request.json", io.sentry.protocol.r.class);
                }
                if (j5Var2.k0 == null) {
                    j5Var2.k0 = (io.sentry.protocol.i0) f(sentryAndroidOptions4, "user.json", io.sentry.protocol.i0.class);
                }
                map = (Map) f(sentryAndroidOptions4, "tags.json", Map.class);
                if (map == null) {
                    h0Var2 = h0Var;
                } else {
                    h0Var2 = h0Var;
                    if (j5Var2.g0 == null) {
                        j5Var2.c(new HashMap(map));
                    } else {
                        it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            entry = (Map.Entry) it.next();
                            Iterator it8 = it;
                            if (!j5Var2.g0.containsKey(entry.getKey())) {
                                j5Var2.b((String) entry.getKey(), (String) entry.getValue());
                            }
                            it = it8;
                        }
                    }
                }
                list = j5Var2.o0;
                if ((list != null || list.isEmpty()) && (list2 = (List) f(sentryAndroidOptions4, "breadcrumbs.json", List.class)) != null) {
                    j5Var2.o0 = new ArrayList(list2);
                }
                map2 = (Map) f(sentryAndroidOptions4, "extras.json", Map.class);
                if (map2 != null) {
                    if (j5Var2.q0 == null) {
                        j5Var2.q0 = new HashMap(new HashMap(map2));
                    } else {
                        it5 = map2.entrySet().iterator();
                        while (it5.hasNext()) {
                            entry3 = (Map.Entry) it5.next();
                            Iterator it9 = it5;
                            if (!j5Var2.q0.containsKey(entry3.getKey())) {
                                j5Var2.q0.put((String) entry3.getKey(), entry3.getValue());
                            }
                            it5 = it9;
                            str13 = str13;
                        }
                    }
                }
                String str14 = str13;
                eVar = (io.sentry.protocol.e) f(sentryAndroidOptions4, "contexts.json", io.sentry.protocol.e.class);
                if (eVar != null) {
                    it4 = new io.sentry.protocol.e(eVar).X.entrySet().iterator();
                    while (it4.hasNext()) {
                        entry2 = (Map.Entry) it4.next();
                        value = entry2.getValue();
                        Iterator it10 = it4;
                        if (("trace".equals(entry2.getKey()) || !(value instanceof f7)) && !eVar2.b(entry2.getKey())) {
                            eVar2.l(value, (String) entry2.getKey());
                        }
                        it4 = it10;
                    }
                }
                str2 = (String) f(sentryAndroidOptions4, "transaction.json", String.class);
                if (j5Var2.x0 == null) {
                    j5Var2.x0 = str2;
                }
                list3 = (List) f(sentryAndroidOptions4, "fingerprint.json", List.class);
                if (j5Var2.y0 == null) {
                    j5Var2.i(list3);
                }
                s5Var = (s5) f(sentryAndroidOptions4, "level.json", s5.class);
                if (j5Var2.w0 == null) {
                    j5Var2.w0 = s5Var;
                }
                f7Var = (f7) f(sentryAndroidOptions4, "trace.json", f7.class);
                if (eVar2.j() == null && f7Var != null) {
                    eVar2.x(f7Var);
                }
                str3 = (String) f(sentryAndroidOptions4, "replay.json", String.class);
                cacheDirPath = sentryAndroidOptions4.getCacheDirPath();
                if (cacheDirPath == null) {
                    cls = Map.class;
                    str4 = "tags.json";
                } else {
                    cls = Map.class;
                    str4 = "tags.json";
                    if (new File(cacheDirPath, oi0.l("replay_", str3)).exists()) {
                        d = sentryAndroidOptions4.getSessionReplay().e;
                        if (d == null) {
                            string = null;
                        } else {
                            string = d.toString();
                        }
                        str5 = (String) e("replay-error-sample-rate.json", String.class, string, i0Var2);
                        if (str5 != null) {
                            try {
                                if (Double.parseDouble(str5) < io.sentry.util.o.a().c()) {
                                    sentryAndroidOptions4.getLogger().h(s5.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", j5Var2.X);
                                } else {
                                    fileArrListFiles = new File(cacheDirPath).listFiles();
                                    if (fileArrListFiles != null) {
                                        length = fileArrListFiles.length;
                                        long jLastModified = Long.MIN_VALUE;
                                        String strSubstring = null;
                                        i = 0;
                                        while (i < length) {
                                            file = fileArrListFiles[i];
                                            if (file.isDirectory()) {
                                                fileArr = fileArrListFiles;
                                                if (!file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= j5Var2.r0.getTime()) {
                                                    jLastModified = file.lastModified();
                                                    strSubstring = file.getName().substring(7);
                                                }
                                            } else {
                                                fileArr = fileArrListFiles;
                                            }
                                            i++;
                                            fileArrListFiles = fileArr;
                                        }
                                        str3 = strSubstring;
                                    } else {
                                        str3 = null;
                                    }
                                    if (str3 != null) {
                                        Charset charset = io.sentry.cache.g.f;
                                        io.sentry.cache.a.d(sentryAndroidOptions4, str3, ".scope-cache", "replay.json");
                                        eVar2.l(str3, "replay_id");
                                    }
                                }
                            } catch (Throwable th3) {
                                sentryAndroidOptions4.getLogger().e(s5.ERROR, "Error parsing replay sample rate.", th3);
                            }
                        }
                    } else if (str3 != null) {
                        Charset charset2 = io.sentry.cache.g.f;
                        io.sentry.cache.a.d(sentryAndroidOptions4, str3, ".scope-cache", "replay.json");
                        eVar2.l(str3, "replay_id");
                    }
                }
                if (j5Var2.h0 == null) {
                    j5Var2.h0 = (String) e("release.json", String.class, sentryAndroidOptions4.getRelease(), i0Var2);
                }
                if (j5Var2.i0 == null) {
                    j5Var2.i0 = (String) e("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), i0Var2);
                }
                h(j5Var2, i0Var2);
                fVar = j5Var2.p0;
                if (fVar == null) {
                    fVar = new io.sentry.protocol.f();
                }
                if (fVar.Y == null) {
                    fVar.b(new ArrayList());
                }
                list4 = fVar.Y;
                String str15 = DebugImage.PROGUARD;
                String str16 = "proguard-uuid.json";
                if (list4 != null) {
                    str9 = (String) d("proguard-uuid.json", String.class, sentryAndroidOptions4.getProguardUuid(), i0Var2);
                    if (str9 != null) {
                        DebugImage debugImage = new DebugImage();
                        debugImage.setType(DebugImage.PROGUARD);
                        debugImage.setUuid(str9);
                        list4.add(debugImage);
                    }
                    j5Var2.p0 = fVar;
                }
                if (j5Var2.Z == null) {
                    j5Var2.Z = (io.sentry.protocol.u) d("sdk-version.json", io.sentry.protocol.u.class, sentryAndroidOptions4.getSdkVersion(), i0Var2);
                }
                aVarE = eVar2.e();
                if (aVarE == null) {
                    aVarE = new io.sentry.protocol.a();
                }
                aVar = aVarE;
                aVar.g0 = (String) m0.c.a(context);
                packageInfoD2 = m0.d(context, n0Var2);
                if (packageInfoD2 != null) {
                    aVar.X = packageInfoD2.packageName;
                }
                try {
                    h70Var = sentryAndroidOptions4.getOrCreateDeviceInfoUtil(context).f;
                    if (h70Var != null) {
                        aVar.n0 = Boolean.valueOf(h70Var.Y);
                        strArr = (String[]) h70Var.Z;
                        if (strArr != null) {
                            aVar.o0 = Arrays.asList(strArr);
                        }
                    }
                } catch (Throwable th4) {
                    sentryAndroidOptions4.getLogger().e(s5.ERROR, "Error getting split apks info.", th4);
                }
                eVar2.o(aVar);
                g(j5Var);
                map3 = (Map) e(str4, cls, sentryAndroidOptions4.getTags(), i0Var2);
                if (map3 != null) {
                    if (j5Var2.g0 == null) {
                        j5Var2.c(new HashMap(map3));
                    } else {
                        for (Map.Entry entry4 : map3.entrySet()) {
                            if (!j5Var2.g0.containsKey(entry4.getKey())) {
                                j5Var2.b((String) entry4.getKey(), (String) entry4.getValue());
                            }
                        }
                    }
                }
                i0Var3 = j5Var2.k0;
                if (i0Var3 == null) {
                    i0Var3 = new io.sentry.protocol.i0();
                    j5Var2.k0 = i0Var3;
                }
                i0Var4 = i0Var3;
                if (i0Var4.Y == null) {
                    try {
                        strA = x0.a(context);
                    } catch (Throwable th5) {
                        sentryAndroidOptions4.getLogger().e(s5.ERROR, str14, th5);
                        strA = null;
                    }
                    i0Var4.Y = strA;
                }
                if (i0Var4.f0 == null && sentryAndroidOptions4.getDataCollectionResolver().a()) {
                    i0Var4.f0 = "{{auto}}";
                }
                try {
                    rl6Var = sentryAndroidOptions4.getOrCreateDeviceInfoUtil(context).e;
                    if (rl6Var != null) {
                        map6 = new HashMap();
                        map6.put("isSideLoaded", String.valueOf(rl6Var.a));
                        str8 = rl6Var.b;
                        if (str8 != null) {
                            map6.put("installerStore", str8);
                        }
                        for (Map.Entry entry5 : map6.entrySet()) {
                            j5Var2.b((String) entry5.getKey(), (String) entry5.getValue());
                        }
                    }
                } catch (Throwable th6) {
                    sentryAndroidOptions4.getLogger().e(s5.ERROR, "Error getting side loaded info.", th6);
                }
                if (h0Var2 != null) {
                    if (r20 != 0) {
                        zEquals = "anr_background".equals(((io.sentry.hints.a) r19).e());
                    } else {
                        zEquals = false;
                    }
                    j0 j0Var2 = h0Var2.a;
                    sentryAndroidOptions = j0Var2.b;
                    if (sentryAndroidOptions.isAnrProfilingEnabled() || zEquals || (cacheDirPath2 = sentryAndroidOptions.getCacheDirPath()) == null) {
                        sentryAndroidOptions2 = sentryAndroidOptions;
                        r3 = eVar2;
                        r110 = zEquals;
                        j5Var2 = j5Var2;
                    } else {
                        this = new File(cacheDirPath2);
                        if (r20 != 0) {
                            Long lB = ((io.sentry.hints.a) r19).b();
                            if (lB != null) {
                                time = lB.longValue();
                            } else {
                                Date date = j5Var2.r0;
                                if (date != null) {
                                    time = date.getTime();
                                } else {
                                    sentryAndroidOptions2 = sentryAndroidOptions;
                                    r3 = eVar2;
                                    r110 = zEquals;
                                    j5Var2 = j5Var2;
                                }
                            }
                            try {
                                io.sentry.android.core.anr.e.b(this);
                                File file2 = new File((File) this, "anr_profile_old");
                                try {
                                    try {
                                        if (file2.exists()) {
                                            this = this;
                                            r20 = eVar2;
                                            r19 = zEquals;
                                            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Reading ANR profile", new Object[0]);
                                            io.sentry.android.core.anr.d dVar = new io.sentry.android.core.anr.d(sentryAndroidOptions, file2);
                                            try {
                                                tVar = new t(dVar.X.U());
                                                try {
                                                    dVar.close();
                                                    i4 = 0;
                                                    r112 = r19;
                                                    r22 = r20;
                                                    r35 = this;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    try {
                                                        ILogger logger2 = sentryAndroidOptions.getLogger();
                                                        s5Var2 = s5.INFO;
                                                        logger2.e(s5Var2, "Could not retrieve ANR profile", th);
                                                        r111 = r19;
                                                        r21 = r20;
                                                        if (!io.sentry.android.core.anr.e.a(this)) {
                                                            sentryAndroidOptions.getLogger().h(s5Var2, "Could not delete ANR profile file", new Object[0]);
                                                        }
                                                    } catch (Throwable th8) {
                                                        if (!io.sentry.android.core.anr.e.a(this)) {
                                                            sentryAndroidOptions.getLogger().h(s5.INFO, "Could not delete ANR profile file", new Object[0]);
                                                        }
                                                        throw th8;
                                                    }
                                                }
                                            } catch (Throwable th9) {
                                                try {
                                                    dVar.close();
                                                    throw th9;
                                                } catch (Throwable th10) {
                                                    th9.addSuppressed(th10);
                                                    throw th9;
                                                }
                                            }
                                        } else {
                                            r35 = this;
                                            r22 = eVar2;
                                            r112 = zEquals;
                                            i4 = 0;
                                            sentryAndroidOptions.getLogger().h(s5.DEBUG, "No ANR profile file found", new Object[0]);
                                            tVar = null;
                                        }
                                        r111 = r112;
                                        r21 = r22;
                                        if (!io.sentry.android.core.anr.e.a(r35)) {
                                            sentryAndroidOptions.getLogger().h(s5.INFO, "Could not delete ANR profile file", new Object[i4]);
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        tVar = null;
                                        ILogger logger3 = sentryAndroidOptions.getLogger();
                                        s5Var2 = s5.INFO;
                                        logger3.e(s5Var2, "Could not retrieve ANR profile", th);
                                        r111 = r19;
                                        r21 = r20;
                                        if (!io.sentry.android.core.anr.e.a(this)) {
                                            sentryAndroidOptions.getLogger().h(s5Var2, "Could not delete ANR profile file", new Object[0]);
                                        }
                                        if (tVar == null) {
                                            r111 = r19;
                                            r21 = r20;
                                            ArrayList arrayList7 = (ArrayList) tVar.c;
                                            sentryAndroidOptions.getLogger().h(s5.INFO, "ANR profile found", new Object[0]);
                                            if (time >= tVar.a) {
                                                r111 = r112;
                                                r21 = r22;
                                                r111 = r112;
                                                r21 = r22;
                                                sentryAndroidOptions2 = sentryAndroidOptions;
                                                r3 = r21;
                                                sentryAndroidOptions2.getLogger().h(s5.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                                j5Var2 = j5Var2;
                                                r110 = r111;
                                            } else {
                                                r111 = r112;
                                                r21 = r22;
                                                r111 = r112;
                                                r21 = r22;
                                                sentryAndroidOptions2 = sentryAndroidOptions;
                                                r3 = r21;
                                                sentryAndroidOptions2.getLogger().h(s5.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                                j5Var2 = j5Var2;
                                                r110 = r111;
                                            }
                                            if (j5Var2.y0 == null) {
                                                if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                                                    j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                                                } else {
                                                    j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                                                }
                                            }
                                            r0 = r110 ^ 1;
                                            aVarE2 = r3.e();
                                            if (aVarE2 == null) {
                                                aVarE2 = new io.sentry.protocol.a();
                                                r3.o(aVarE2);
                                            }
                                            if (aVarE2.m0 == null) {
                                                aVarE2.m0 = Boolean.valueOf((boolean) r0);
                                            }
                                            return j5Var2;
                                        }
                                        r111 = r19;
                                        r21 = r20;
                                        r111 = r112;
                                        r21 = r22;
                                        sentryAndroidOptions2 = sentryAndroidOptions;
                                        r3 = r21;
                                        j5Var2 = j5Var2;
                                        r110 = r111;
                                        if (j5Var2.y0 == null) {
                                            if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                                                j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                                            } else {
                                                j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                                            }
                                        }
                                        r0 = r110 ^ 1;
                                        aVarE2 = r3.e();
                                        if (aVarE2 == null) {
                                            aVarE2 = new io.sentry.protocol.a();
                                            r3.o(aVarE2);
                                        }
                                        if (aVarE2.m0 == null) {
                                            aVarE2.m0 = Boolean.valueOf((boolean) r0);
                                        }
                                        return j5Var2;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    r20 = eVar2;
                                    r19 = zEquals;
                                    tVar = null;
                                    ILogger logger4 = sentryAndroidOptions.getLogger();
                                    s5Var2 = s5.INFO;
                                    logger4.e(s5Var2, "Could not retrieve ANR profile", th);
                                    r111 = r19;
                                    r21 = r20;
                                    if (!io.sentry.android.core.anr.e.a(this)) {
                                        sentryAndroidOptions.getLogger().h(s5Var2, "Could not delete ANR profile file", new Object[0]);
                                    }
                                    if (tVar == null) {
                                        r111 = r19;
                                        r21 = r20;
                                        ArrayList arrayList8 = (ArrayList) tVar.c;
                                        sentryAndroidOptions.getLogger().h(s5.INFO, "ANR profile found", new Object[0]);
                                        if (time >= tVar.a) {
                                            r111 = r112;
                                            r21 = r22;
                                            r111 = r112;
                                            r21 = r22;
                                            sentryAndroidOptions2 = sentryAndroidOptions;
                                            r3 = r21;
                                            sentryAndroidOptions2.getLogger().h(s5.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                            j5Var2 = j5Var2;
                                            r110 = r111;
                                        } else {
                                            r111 = r112;
                                            r21 = r22;
                                            r111 = r112;
                                            r21 = r22;
                                            sentryAndroidOptions2 = sentryAndroidOptions;
                                            r3 = r21;
                                            sentryAndroidOptions2.getLogger().h(s5.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                            j5Var2 = j5Var2;
                                            r110 = r111;
                                        }
                                        if (j5Var2.y0 == null) {
                                            if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                                                j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                                            } else {
                                                j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                                            }
                                        }
                                        r0 = r110 ^ 1;
                                        aVarE2 = r3.e();
                                        if (aVarE2 == null) {
                                            aVarE2 = new io.sentry.protocol.a();
                                            r3.o(aVarE2);
                                        }
                                        if (aVarE2.m0 == null) {
                                            aVarE2.m0 = Boolean.valueOf((boolean) r0);
                                        }
                                        return j5Var2;
                                    }
                                    r111 = r19;
                                    r21 = r20;
                                    r111 = r112;
                                    r21 = r22;
                                    sentryAndroidOptions2 = sentryAndroidOptions;
                                    r3 = r21;
                                    j5Var2 = j5Var2;
                                    r110 = r111;
                                    if (j5Var2.y0 == null) {
                                        if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                                            j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                                        } else {
                                            j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                                        }
                                    }
                                    r0 = r110 ^ 1;
                                    aVarE2 = r3.e();
                                    if (aVarE2 == null) {
                                        aVarE2 = new io.sentry.protocol.a();
                                        r3.o(aVarE2);
                                    }
                                    if (aVarE2.m0 == null) {
                                        aVarE2.m0 = Boolean.valueOf((boolean) r0);
                                    }
                                    return j5Var2;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                            }
                            if (tVar == null) {
                                r111 = r19;
                                r21 = r20;
                                r111 = r112;
                                r21 = r22;
                                sentryAndroidOptions2 = sentryAndroidOptions;
                            } else {
                                r111 = r19;
                                r21 = r20;
                                ArrayList arrayList9 = (ArrayList) tVar.c;
                                sentryAndroidOptions.getLogger().h(s5.INFO, "ANR profile found", new Object[0]);
                                if (time >= tVar.a || time > tVar.b) {
                                    r111 = r112;
                                    r21 = r22;
                                    r111 = r112;
                                    r21 = r22;
                                    sentryAndroidOptions2 = sentryAndroidOptions;
                                    r3 = r21;
                                    sentryAndroidOptions2.getLogger().h(s5.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                    j5Var2 = j5Var2;
                                    r110 = r111;
                                } else {
                                    ArrayList arrayList10 = io.sentry.android.core.anr.c.a;
                                    if (arrayList9.isEmpty()) {
                                        r111 = r112;
                                        r21 = r22;
                                        arrayList = arrayList9;
                                        sentryAndroidOptions2 = sentryAndroidOptions;
                                    } else {
                                        r111 = r112;
                                        r21 = r22;
                                        HashMap map7 = new HashMap();
                                        Iterator it11 = arrayList9.iterator();
                                        while (it11.hasNext()) {
                                            io.sentry.android.core.anr.g gVar = (io.sentry.android.core.anr.g) it11.next();
                                            StackTraceElement[] stackTraceElementArr4 = gVar.X;
                                            if (stackTraceElementArr4.length >= 2) {
                                                int length3 = stackTraceElementArr4.length - 1;
                                                int i5 = 0;
                                                while (length3 >= 0) {
                                                    ArrayList arrayList11 = arrayList9;
                                                    String className = stackTraceElementArr4[length3].getClassName();
                                                    Iterator it12 = io.sentry.android.core.anr.c.a.iterator();
                                                    while (true) {
                                                        if (!it12.hasNext()) {
                                                            sentryAndroidOptions3 = sentryAndroidOptions;
                                                            i5++;
                                                            break;
                                                        }
                                                        sentryAndroidOptions3 = sentryAndroidOptions;
                                                        if (className.startsWith((String) it12.next())) {
                                                            break;
                                                        }
                                                        sentryAndroidOptions = sentryAndroidOptions3;
                                                    }
                                                    float length4 = i5 / (stackTraceElementArr4.length - length3);
                                                    io.sentry.android.core.anr.b bVar2 = new io.sentry.android.core.anr.b(stackTraceElementArr4, length3, stackTraceElementArr4.length - 1);
                                                    io.sentry.android.core.anr.a aVar4 = (io.sentry.android.core.anr.a) map7.get(bVar2);
                                                    if (aVar4 == null) {
                                                        StackTraceElement[] stackTraceElementArr5 = gVar.X;
                                                        i2 = length3;
                                                        map7.put(bVar2, new io.sentry.android.core.anr.a(stackTraceElementArr5, i2, stackTraceElementArr5.length - 1, gVar.Y, length4));
                                                        stackTraceElementArr = stackTraceElementArr4;
                                                    } else {
                                                        StackTraceElement[] stackTraceElementArr6 = stackTraceElementArr4;
                                                        i2 = length3;
                                                        long j3 = gVar.Y;
                                                        stackTraceElementArr = stackTraceElementArr6;
                                                        aVar4.g = Math.min(aVar4.g, j3);
                                                        aVar4.h = Math.max(aVar4.h, j3);
                                                        aVar4.f++;
                                                    }
                                                    length3 = i2 - 1;
                                                    map7 = map7;
                                                    it11 = it11;
                                                    stackTraceElementArr4 = stackTraceElementArr;
                                                    sentryAndroidOptions = sentryAndroidOptions3;
                                                    arrayList9 = arrayList11;
                                                }
                                            }
                                        }
                                        arrayList = arrayList9;
                                        sentryAndroidOptions2 = sentryAndroidOptions;
                                        HashMap map8 = map7;
                                        if (!map8.isEmpty()) {
                                            aVar2 = (io.sentry.android.core.anr.a) Collections.max(map8.values(), new d2((byte) 1));
                                        }
                                        if (aVar2 == null) {
                                            aVar3 = new io.sentry.protocol.profiling.a();
                                            arrayList2 = new ArrayList();
                                            map4 = new HashMap();
                                            arrayList3 = new ArrayList();
                                            map5 = new HashMap();
                                            it2 = arrayList.iterator();
                                            while (true) {
                                                it3 = it2;
                                                if (it2.hasNext()) {
                                                    break;
                                                }
                                                io.sentry.android.core.anr.g gVar2 = (io.sentry.android.core.anr.g) it3.next();
                                                stackTraceElementArr3 = gVar2.X;
                                                io.sentry.android.core.anr.a aVar5 = aVar2;
                                                arrayList4 = new ArrayList();
                                                String str17 = str15;
                                                length2 = stackTraceElementArr3.length;
                                                i3 = 0;
                                                while (i3 < length2) {
                                                    stackTraceElement = stackTraceElementArr3[i3];
                                                    int i6 = i3;
                                                    StringBuilder sb2 = new StringBuilder();
                                                    int i7 = length2;
                                                    sb2.append(stackTraceElement.getClassName());
                                                    sb2.append("#");
                                                    i0 i0Var5 = i0Var2;
                                                    sb2.append(stackTraceElement.getMethodName());
                                                    sb2.append("#");
                                                    sb2.append(stackTraceElement.getFileName());
                                                    sb2.append("#");
                                                    sb2.append(stackTraceElement.getLineNumber());
                                                    string3 = sb2.toString();
                                                    numValueOf2 = (Integer) map4.get(string3);
                                                    if (numValueOf2 == null) {
                                                        numValueOf2 = Integer.valueOf(arrayList2.size());
                                                        a0Var = new io.sentry.protocol.a0();
                                                        a0Var.f0 = stackTraceElement.getFileName();
                                                        a0Var.g0 = stackTraceElement.getMethodName();
                                                        a0Var.h0 = stackTraceElement.getClassName();
                                                        if (stackTraceElement.getLineNumber() > 0) {
                                                            numValueOf3 = Integer.valueOf(stackTraceElement.getLineNumber());
                                                        } else {
                                                            numValueOf3 = null;
                                                        }
                                                        a0Var.i0 = numValueOf3;
                                                        if (stackTraceElement.isNativeMethod()) {
                                                            a0Var.o0 = Boolean.TRUE;
                                                        }
                                                        arrayList2.add(a0Var);
                                                        map4.put(string3, numValueOf2);
                                                    }
                                                    arrayList4.add(numValueOf2);
                                                    i3 = i6 + 1;
                                                    length2 = i7;
                                                    i0Var2 = i0Var5;
                                                    str16 = str16;
                                                }
                                                i0 i0Var6 = i0Var2;
                                                String str18 = str16;
                                                sb = new StringBuilder();
                                                for (Integer num : arrayList4) {
                                                    if (sb.length() > 0) {
                                                        sb.append(",");
                                                    }
                                                    sb.append(num);
                                                }
                                                string2 = sb.toString();
                                                numValueOf = (Integer) map5.get(string2);
                                                if (numValueOf == null) {
                                                    numValueOf = Integer.valueOf(arrayList3.size());
                                                    arrayList3.add(new ArrayList(arrayList4));
                                                    map5.put(string2, numValueOf);
                                                }
                                                io.sentry.protocol.profiling.b bVar3 = new io.sentry.protocol.profiling.b();
                                                bVar3.X = gVar2.Y / 1000.0d;
                                                bVar3.Y = numValueOf.intValue();
                                                bVar3.Z = "0";
                                                aVar3.X.add(bVar3);
                                                it2 = it3;
                                                map4 = map4;
                                                aVar2 = aVar5;
                                                str15 = str17;
                                                i0Var2 = i0Var6;
                                                str16 = str18;
                                            }
                                            io.sentry.android.core.anr.a aVar6 = aVar2;
                                            i0 i0Var7 = i0Var2;
                                            str6 = str15;
                                            String str19 = str16;
                                            if (aVar3.X.size() == 1) {
                                                io.sentry.protocol.profiling.b bVar4 = (io.sentry.protocol.profiling.b) aVar3.X.get(0);
                                                io.sentry.protocol.profiling.b bVar5 = new io.sentry.protocol.profiling.b();
                                                bVar5.X = bVar4.X;
                                                bVar5.Y = bVar4.Y;
                                                bVar5.Z = bVar4.Z;
                                                bVar5.f0 = io.sentry.util.b.p(bVar4.f0);
                                                bVar5.X = bVar4.X + 0.033d;
                                                aVar3.X.add(bVar5);
                                            }
                                            aVar3.Z = arrayList2;
                                            aVar3.Y = arrayList3;
                                            io.sentry.protocol.profiling.c cVar = new io.sentry.protocol.profiling.c();
                                            cVar.X = "main";
                                            cVar.Y = 5;
                                            aVar3.f0 = Collections.singletonMap("0", cVar);
                                            w3Var = new w3(new io.sentry.protocol.w(), new io.sentry.protocol.w(), null, new HashMap(0), Double.valueOf(time / 1000.0d), j0Var2.b);
                                            w3Var.p0 = aVar3;
                                            str7 = (String) j0Var2.d(str19, String.class, sentryAndroidOptions2.getProguardUuid(), i0Var7);
                                            if (str7 == null) {
                                                fVar2 = null;
                                            } else {
                                                fVar2 = new io.sentry.protocol.f();
                                                DebugImage debugImage2 = new DebugImage();
                                                debugImage2.setType(str6);
                                                debugImage2.setUuid(str7);
                                                fVar2.b(Collections.singletonList(debugImage2));
                                            }
                                            w3Var.X = fVar2;
                                            if (io.sentry.protocol.w.Y.equals(v4.b().h(w3Var))) {
                                                wVar = null;
                                            } else {
                                                wVar = w3Var.Y;
                                            }
                                            stackTraceElementArr2 = (StackTraceElement[]) Arrays.copyOfRange(aVar6.c, aVar6.d, aVar6.e + 1);
                                            if (stackTraceElementArr2.length > 0) {
                                                StackTraceElement stackTraceElement2 = stackTraceElementArr2[0];
                                                ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(stackTraceElement2.getClassName() + "." + stackTraceElement2.getMethodName());
                                                applicationNotResponding2.setStackTrace(stackTraceElementArr2);
                                                io.sentry.protocol.o oVar2 = new io.sentry.protocol.o();
                                                oVar2.X = str10;
                                                io.sentry.exception.a aVar7 = new io.sentry.exception.a(oVar2, applicationNotResponding2, null, false);
                                                k5 k5Var = j0Var2.d;
                                                k5Var.getClass();
                                                AtomicInteger atomicInteger = new AtomicInteger(-1);
                                                HashSet hashSet = new HashSet();
                                                ArrayDeque arrayDeque = new ArrayDeque();
                                                k5Var.a(aVar7, atomicInteger, hashSet, arrayDeque, null);
                                                j5Var2 = j5Var;
                                                j5Var2.h(new ArrayList(arrayDeque));
                                                if (wVar != null) {
                                                    ?? r4 = r21;
                                                    r4.l(new x3(wVar), "profile");
                                                    j5Var2 = j5Var2;
                                                    r3 = r4;
                                                    r110 = r111;
                                                }
                                            } else {
                                                j5Var2 = j5Var;
                                            }
                                        }
                                    }
                                    aVar2 = null;
                                    if (aVar2 == null) {
                                        aVar3 = new io.sentry.protocol.profiling.a();
                                        arrayList2 = new ArrayList();
                                        map4 = new HashMap();
                                        arrayList3 = new ArrayList();
                                        map5 = new HashMap();
                                        it2 = arrayList.iterator();
                                        while (true) {
                                            it3 = it2;
                                            if (it2.hasNext()) {
                                                break;
                                                break;
                                            }
                                            io.sentry.android.core.anr.g gVar3 = (io.sentry.android.core.anr.g) it3.next();
                                            stackTraceElementArr3 = gVar3.X;
                                            io.sentry.android.core.anr.a aVar8 = aVar2;
                                            arrayList4 = new ArrayList();
                                            String str110 = str15;
                                            length2 = stackTraceElementArr3.length;
                                            i3 = 0;
                                            while (i3 < length2) {
                                                stackTraceElement = stackTraceElementArr3[i3];
                                                int i8 = i3;
                                                StringBuilder sb3 = new StringBuilder();
                                                int i9 = length2;
                                                sb3.append(stackTraceElement.getClassName());
                                                sb3.append("#");
                                                i0 i0Var8 = i0Var2;
                                                sb3.append(stackTraceElement.getMethodName());
                                                sb3.append("#");
                                                sb3.append(stackTraceElement.getFileName());
                                                sb3.append("#");
                                                sb3.append(stackTraceElement.getLineNumber());
                                                string3 = sb3.toString();
                                                numValueOf2 = (Integer) map4.get(string3);
                                                if (numValueOf2 == null) {
                                                    numValueOf2 = Integer.valueOf(arrayList2.size());
                                                    a0Var = new io.sentry.protocol.a0();
                                                    a0Var.f0 = stackTraceElement.getFileName();
                                                    a0Var.g0 = stackTraceElement.getMethodName();
                                                    a0Var.h0 = stackTraceElement.getClassName();
                                                    if (stackTraceElement.getLineNumber() > 0) {
                                                        numValueOf3 = Integer.valueOf(stackTraceElement.getLineNumber());
                                                    } else {
                                                        numValueOf3 = null;
                                                    }
                                                    a0Var.i0 = numValueOf3;
                                                    if (stackTraceElement.isNativeMethod()) {
                                                        a0Var.o0 = Boolean.TRUE;
                                                    }
                                                    arrayList2.add(a0Var);
                                                    map4.put(string3, numValueOf2);
                                                }
                                                arrayList4.add(numValueOf2);
                                                i3 = i8 + 1;
                                                length2 = i9;
                                                i0Var2 = i0Var8;
                                                str16 = str16;
                                            }
                                            i0 i0Var9 = i0Var2;
                                            String str111 = str16;
                                            sb = new StringBuilder();
                                            while (r4.hasNext()) {
                                                if (sb.length() > 0) {
                                                    sb.append(",");
                                                }
                                                sb.append(num);
                                            }
                                            string2 = sb.toString();
                                            numValueOf = (Integer) map5.get(string2);
                                            if (numValueOf == null) {
                                                numValueOf = Integer.valueOf(arrayList3.size());
                                                arrayList3.add(new ArrayList(arrayList4));
                                                map5.put(string2, numValueOf);
                                            }
                                            io.sentry.protocol.profiling.b bVar6 = new io.sentry.protocol.profiling.b();
                                            bVar6.X = gVar3.Y / 1000.0d;
                                            bVar6.Y = numValueOf.intValue();
                                            bVar6.Z = "0";
                                            aVar3.X.add(bVar6);
                                            it2 = it3;
                                            map4 = map4;
                                            aVar2 = aVar8;
                                            str15 = str110;
                                            i0Var2 = i0Var9;
                                            str16 = str111;
                                        }
                                        io.sentry.android.core.anr.a aVar9 = aVar2;
                                        i0 i0Var10 = i0Var2;
                                        str6 = str15;
                                        String str112 = str16;
                                        if (aVar3.X.size() == 1) {
                                            io.sentry.protocol.profiling.b bVar7 = (io.sentry.protocol.profiling.b) aVar3.X.get(0);
                                            io.sentry.protocol.profiling.b bVar8 = new io.sentry.protocol.profiling.b();
                                            bVar8.X = bVar7.X;
                                            bVar8.Y = bVar7.Y;
                                            bVar8.Z = bVar7.Z;
                                            bVar8.f0 = io.sentry.util.b.p(bVar7.f0);
                                            bVar8.X = bVar7.X + 0.033d;
                                            aVar3.X.add(bVar8);
                                        }
                                        aVar3.Z = arrayList2;
                                        aVar3.Y = arrayList3;
                                        io.sentry.protocol.profiling.c cVar2 = new io.sentry.protocol.profiling.c();
                                        cVar2.X = "main";
                                        cVar2.Y = 5;
                                        aVar3.f0 = Collections.singletonMap("0", cVar2);
                                        w3Var = new w3(new io.sentry.protocol.w(), new io.sentry.protocol.w(), null, new HashMap(0), Double.valueOf(time / 1000.0d), j0Var2.b);
                                        w3Var.p0 = aVar3;
                                        str7 = (String) j0Var2.d(str112, String.class, sentryAndroidOptions2.getProguardUuid(), i0Var10);
                                        if (str7 == null) {
                                            fVar2 = null;
                                        } else {
                                            fVar2 = new io.sentry.protocol.f();
                                            DebugImage debugImage3 = new DebugImage();
                                            debugImage3.setType(str6);
                                            debugImage3.setUuid(str7);
                                            fVar2.b(Collections.singletonList(debugImage3));
                                        }
                                        w3Var.X = fVar2;
                                        if (io.sentry.protocol.w.Y.equals(v4.b().h(w3Var))) {
                                            wVar = null;
                                        } else {
                                            wVar = w3Var.Y;
                                        }
                                        stackTraceElementArr2 = (StackTraceElement[]) Arrays.copyOfRange(aVar9.c, aVar9.d, aVar9.e + 1);
                                        if (stackTraceElementArr2.length > 0) {
                                            StackTraceElement stackTraceElement3 = stackTraceElementArr2[0];
                                            ApplicationNotResponding applicationNotResponding3 = new ApplicationNotResponding(stackTraceElement3.getClassName() + "." + stackTraceElement3.getMethodName());
                                            applicationNotResponding3.setStackTrace(stackTraceElementArr2);
                                            io.sentry.protocol.o oVar3 = new io.sentry.protocol.o();
                                            oVar3.X = str10;
                                            io.sentry.exception.a aVar10 = new io.sentry.exception.a(oVar3, applicationNotResponding3, null, false);
                                            k5 k5Var2 = j0Var2.d;
                                            k5Var2.getClass();
                                            AtomicInteger atomicInteger2 = new AtomicInteger(-1);
                                            HashSet hashSet2 = new HashSet();
                                            ArrayDeque arrayDeque2 = new ArrayDeque();
                                            k5Var2.a(aVar10, atomicInteger2, hashSet2, arrayDeque2, null);
                                            j5Var2 = j5Var;
                                            j5Var2.h(new ArrayList(arrayDeque2));
                                            if (wVar != null) {
                                                ?? r5 = r21;
                                                r5.l(new x3(wVar), "profile");
                                                j5Var2 = j5Var2;
                                                r3 = r5;
                                                r110 = r111;
                                            }
                                        } else {
                                            j5Var2 = j5Var;
                                        }
                                    }
                                }
                            }
                            r3 = r21;
                            j5Var2 = j5Var2;
                            r110 = r111;
                        } else {
                            sentryAndroidOptions2 = sentryAndroidOptions;
                            r3 = eVar2;
                            r110 = zEquals;
                            j5Var2 = j5Var2;
                        }
                    }
                    if (j5Var2.y0 == null) {
                        if (sentryAndroidOptions2.isEnableAnrFingerprinting() || (arrayListD = j5Var2.d()) == null || arrayListD.isEmpty()) {
                            j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                        } else {
                            Iterator it13 = arrayListD.iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    io.sentry.protocol.c0 c0Var2 = ((io.sentry.protocol.v) it13.next()).g0;
                                    if (c0Var2 != null && (list5 = c0Var2.X) != null && !list5.isEmpty()) {
                                        Iterator it14 = list5.iterator();
                                        while (true) {
                                            if (it14.hasNext()) {
                                                io.sentry.protocol.a0 a0Var2 = (io.sentry.protocol.a0) it14.next();
                                                Boolean bool = a0Var2.m0;
                                                if (bool == null || !bool.booleanValue()) {
                                                    String str20 = a0Var2.h0;
                                                    if (str20 != null) {
                                                        Iterator it15 = io.sentry.android.core.anr.c.a.iterator();
                                                        while (true) {
                                                            if (it15.hasNext()) {
                                                                if (str20.startsWith((String) it15.next())) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                } else {
                                    j5Var2.i(Arrays.asList("system-frames-only-anr", r110 != 0 ? "background-anr" : "foreground-anr"));
                                }
                            }
                        }
                    }
                    r0 = r110 ^ 1;
                    aVarE2 = r3.e();
                    if (aVarE2 == null) {
                        aVarE2 = new io.sentry.protocol.a();
                        r3.o(aVarE2);
                    }
                    if (aVarE2.m0 == null) {
                        aVarE2.m0 = Boolean.valueOf((boolean) r0);
                    }
                }
                return j5Var2;
            }
            lValueOf2 = null;
            r19 = bVar;
            r20 = z2;
            packageInfoD = m0.d(context, n0Var2);
            if (packageInfoD == null) {
                j2 = 0;
                j = 0;
            } else {
                j = 0;
                j2 = packageInfoD.lastUpdateTime;
            }
            if (l == null) {
                if (lValueOf2 == null) {
                    i0Var = i0.PERSISTED;
                } else if (l != null) {
                    i0Var = i0.NONE;
                } else {
                    i0Var = i0.NONE;
                }
            } else if (lValueOf2 == null) {
                i0Var = i0.PERSISTED;
            } else if (l != null) {
                i0Var = i0.NONE;
            } else {
                i0Var = i0.NONE;
            }
            i0Var2 = i0Var;
            if (!r19.a()) {
                if (j5Var2.h0 == null) {
                    j5Var2.h0 = (String) e("release.json", String.class, sentryAndroidOptions4.getRelease(), i0Var2);
                }
                if (j5Var2.i0 == null) {
                    j5Var2.i0 = (String) e("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), i0Var2);
                }
                h(j5Var2, i0Var2);
                g(j5Var);
                sentryAndroidOptions4.getLogger().h(s5.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
                return j5Var2;
            }
            if (j5Var2.f0 == null) {
                j5Var2.f0 = (io.sentry.protocol.r) f(sentryAndroidOptions4, "request.json", io.sentry.protocol.r.class);
            }
            if (j5Var2.k0 == null) {
                j5Var2.k0 = (io.sentry.protocol.i0) f(sentryAndroidOptions4, "user.json", io.sentry.protocol.i0.class);
            }
            map = (Map) f(sentryAndroidOptions4, "tags.json", Map.class);
            if (map == null) {
                h0Var2 = h0Var;
            } else {
                h0Var2 = h0Var;
                if (j5Var2.g0 == null) {
                    j5Var2.c(new HashMap(map));
                } else {
                    it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        entry = (Map.Entry) it.next();
                        Iterator it16 = it;
                        if (!j5Var2.g0.containsKey(entry.getKey())) {
                            j5Var2.b((String) entry.getKey(), (String) entry.getValue());
                        }
                        it = it16;
                    }
                }
            }
            list = j5Var2.o0;
            if (list != null) {
                j5Var2.o0 = new ArrayList(list2);
            } else {
                j5Var2.o0 = new ArrayList(list2);
            }
            map2 = (Map) f(sentryAndroidOptions4, "extras.json", Map.class);
            if (map2 != null) {
                if (j5Var2.q0 == null) {
                    j5Var2.q0 = new HashMap(new HashMap(map2));
                } else {
                    it5 = map2.entrySet().iterator();
                    while (it5.hasNext()) {
                        entry3 = (Map.Entry) it5.next();
                        Iterator it17 = it5;
                        if (!j5Var2.q0.containsKey(entry3.getKey())) {
                            j5Var2.q0.put((String) entry3.getKey(), entry3.getValue());
                        }
                        it5 = it17;
                        str13 = str13;
                    }
                }
            }
            String str113 = str13;
            eVar = (io.sentry.protocol.e) f(sentryAndroidOptions4, "contexts.json", io.sentry.protocol.e.class);
            if (eVar != null) {
                it4 = new io.sentry.protocol.e(eVar).X.entrySet().iterator();
                while (it4.hasNext()) {
                    entry2 = (Map.Entry) it4.next();
                    value = entry2.getValue();
                    Iterator it18 = it4;
                    if ("trace".equals(entry2.getKey())) {
                        eVar2.l(value, (String) entry2.getKey());
                    } else {
                        eVar2.l(value, (String) entry2.getKey());
                    }
                    it4 = it18;
                }
            }
            str2 = (String) f(sentryAndroidOptions4, "transaction.json", String.class);
            if (j5Var2.x0 == null) {
                j5Var2.x0 = str2;
            }
            list3 = (List) f(sentryAndroidOptions4, "fingerprint.json", List.class);
            if (j5Var2.y0 == null) {
                j5Var2.i(list3);
            }
            s5Var = (s5) f(sentryAndroidOptions4, "level.json", s5.class);
            if (j5Var2.w0 == null) {
                j5Var2.w0 = s5Var;
            }
            f7Var = (f7) f(sentryAndroidOptions4, "trace.json", f7.class);
            if (eVar2.j() == null) {
                eVar2.x(f7Var);
            }
            str3 = (String) f(sentryAndroidOptions4, "replay.json", String.class);
            cacheDirPath = sentryAndroidOptions4.getCacheDirPath();
            if (cacheDirPath == null) {
                cls = Map.class;
                str4 = "tags.json";
            } else {
                cls = Map.class;
                str4 = "tags.json";
                if (new File(cacheDirPath, oi0.l("replay_", str3)).exists()) {
                    d = sentryAndroidOptions4.getSessionReplay().e;
                    if (d == null) {
                        string = null;
                    } else {
                        string = d.toString();
                    }
                    str5 = (String) e("replay-error-sample-rate.json", String.class, string, i0Var2);
                    if (str5 != null) {
                        if (Double.parseDouble(str5) < io.sentry.util.o.a().c()) {
                            sentryAndroidOptions4.getLogger().h(s5.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", j5Var2.X);
                        } else {
                            fileArrListFiles = new File(cacheDirPath).listFiles();
                            if (fileArrListFiles != null) {
                                length = fileArrListFiles.length;
                                long jLastModified2 = Long.MIN_VALUE;
                                String strSubstring2 = null;
                                i = 0;
                                while (i < length) {
                                    file = fileArrListFiles[i];
                                    if (file.isDirectory()) {
                                        fileArr = fileArrListFiles;
                                        if (!file.getName().startsWith("replay_")) {
                                        }
                                    } else {
                                        fileArr = fileArrListFiles;
                                    }
                                    i++;
                                    fileArrListFiles = fileArr;
                                }
                                str3 = strSubstring2;
                            } else {
                                str3 = null;
                            }
                            if (str3 != null) {
                                Charset charset3 = io.sentry.cache.g.f;
                                io.sentry.cache.a.d(sentryAndroidOptions4, str3, ".scope-cache", "replay.json");
                                eVar2.l(str3, "replay_id");
                            }
                        }
                    }
                } else if (str3 != null) {
                    Charset charset4 = io.sentry.cache.g.f;
                    io.sentry.cache.a.d(sentryAndroidOptions4, str3, ".scope-cache", "replay.json");
                    eVar2.l(str3, "replay_id");
                }
            }
            if (j5Var2.h0 == null) {
                j5Var2.h0 = (String) e("release.json", String.class, sentryAndroidOptions4.getRelease(), i0Var2);
            }
            if (j5Var2.i0 == null) {
                j5Var2.i0 = (String) e("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), i0Var2);
            }
            h(j5Var2, i0Var2);
            fVar = j5Var2.p0;
            if (fVar == null) {
                fVar = new io.sentry.protocol.f();
            }
            if (fVar.Y == null) {
                fVar.b(new ArrayList());
            }
            list4 = fVar.Y;
            String str114 = DebugImage.PROGUARD;
            String str115 = "proguard-uuid.json";
            if (list4 != null) {
                str9 = (String) d("proguard-uuid.json", String.class, sentryAndroidOptions4.getProguardUuid(), i0Var2);
                if (str9 != null) {
                    DebugImage debugImage4 = new DebugImage();
                    debugImage4.setType(DebugImage.PROGUARD);
                    debugImage4.setUuid(str9);
                    list4.add(debugImage4);
                }
                j5Var2.p0 = fVar;
            }
            if (j5Var2.Z == null) {
                j5Var2.Z = (io.sentry.protocol.u) d("sdk-version.json", io.sentry.protocol.u.class, sentryAndroidOptions4.getSdkVersion(), i0Var2);
            }
            aVarE = eVar2.e();
            if (aVarE == null) {
                aVarE = new io.sentry.protocol.a();
            }
            aVar = aVarE;
            aVar.g0 = (String) m0.c.a(context);
            packageInfoD2 = m0.d(context, n0Var2);
            if (packageInfoD2 != null) {
                aVar.X = packageInfoD2.packageName;
            }
            h70Var = sentryAndroidOptions4.getOrCreateDeviceInfoUtil(context).f;
            if (h70Var != null) {
                aVar.n0 = Boolean.valueOf(h70Var.Y);
                strArr = (String[]) h70Var.Z;
                if (strArr != null) {
                    aVar.o0 = Arrays.asList(strArr);
                }
            }
            eVar2.o(aVar);
            g(j5Var);
            map3 = (Map) e(str4, cls, sentryAndroidOptions4.getTags(), i0Var2);
            if (map3 != null) {
                if (j5Var2.g0 == null) {
                    j5Var2.c(new HashMap(map3));
                } else {
                    while (r0.hasNext()) {
                        if (!j5Var2.g0.containsKey(entry4.getKey())) {
                            j5Var2.b((String) entry4.getKey(), (String) entry4.getValue());
                        }
                    }
                }
            }
            i0Var3 = j5Var2.k0;
            if (i0Var3 == null) {
                i0Var3 = new io.sentry.protocol.i0();
                j5Var2.k0 = i0Var3;
            }
            i0Var4 = i0Var3;
            if (i0Var4.Y == null) {
                strA = x0.a(context);
                i0Var4.Y = strA;
            }
            if (i0Var4.f0 == null) {
                i0Var4.f0 = "{{auto}}";
            }
            rl6Var = sentryAndroidOptions4.getOrCreateDeviceInfoUtil(context).e;
            if (rl6Var != null) {
                map6 = new HashMap();
                map6.put("isSideLoaded", String.valueOf(rl6Var.a));
                str8 = rl6Var.b;
                if (str8 != null) {
                    map6.put("installerStore", str8);
                }
                while (r0.hasNext()) {
                    j5Var2.b((String) entry5.getKey(), (String) entry5.getValue());
                }
            }
            if (h0Var2 != null) {
                if (r20 != 0) {
                    zEquals = "anr_background".equals(((io.sentry.hints.a) r19).e());
                } else {
                    zEquals = false;
                }
                j0 j0Var3 = h0Var2.a;
                sentryAndroidOptions = j0Var3.b;
                if (sentryAndroidOptions.isAnrProfilingEnabled()) {
                    sentryAndroidOptions2 = sentryAndroidOptions;
                    r3 = eVar2;
                    r110 = zEquals;
                    j5Var2 = j5Var2;
                } else {
                    sentryAndroidOptions2 = sentryAndroidOptions;
                    r3 = eVar2;
                    r110 = zEquals;
                    j5Var2 = j5Var2;
                }
                if (j5Var2.y0 == null) {
                    if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                        j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                    } else {
                        j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                    }
                }
                r0 = r110 ^ 1;
                aVarE2 = r3.e();
                if (aVarE2 == null) {
                    aVarE2 = new io.sentry.protocol.a();
                    r3.o(aVarE2);
                }
                if (aVarE2.m0 == null) {
                    aVarE2.m0 = Boolean.valueOf((boolean) r0);
                }
            }
            return j5Var2;
        }
        lValueOf = ((io.sentry.hints.a) bVar).b();
        l = lValueOf;
        str = (String) io.sentry.cache.a.c(sentryAndroidOptions4, ".options-cache", "app-last-update-time.json", String.class);
        if (str == null) {
            lValueOf2 = Long.valueOf(str);
            r19 = bVar;
            r20 = z2 ? 1 : 0;
            str10 = "ANR";
            l = l;
            packageInfoD = m0.d(context, n0Var2);
            if (packageInfoD == null) {
                j2 = 0;
                j = 0;
            } else {
                j = 0;
                j2 = packageInfoD.lastUpdateTime;
            }
            if (l == null) {
                if (lValueOf2 == null) {
                    i0Var = i0.PERSISTED;
                } else if (l != null) {
                    i0Var = i0.NONE;
                } else {
                    i0Var = i0.NONE;
                }
            } else if (lValueOf2 == null) {
                i0Var = i0.PERSISTED;
            } else if (l != null) {
                i0Var = i0.NONE;
            } else {
                i0Var = i0.NONE;
            }
            i0Var2 = i0Var;
            if (!r19.a()) {
                if (j5Var2.h0 == null) {
                    j5Var2.h0 = (String) e("release.json", String.class, sentryAndroidOptions4.getRelease(), i0Var2);
                }
                if (j5Var2.i0 == null) {
                    j5Var2.i0 = (String) e("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), i0Var2);
                }
                h(j5Var2, i0Var2);
                g(j5Var);
                sentryAndroidOptions4.getLogger().h(s5.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
                return j5Var2;
            }
            if (j5Var2.f0 == null) {
                j5Var2.f0 = (io.sentry.protocol.r) f(sentryAndroidOptions4, "request.json", io.sentry.protocol.r.class);
            }
            if (j5Var2.k0 == null) {
                j5Var2.k0 = (io.sentry.protocol.i0) f(sentryAndroidOptions4, "user.json", io.sentry.protocol.i0.class);
            }
            map = (Map) f(sentryAndroidOptions4, "tags.json", Map.class);
            if (map == null) {
                h0Var2 = h0Var;
            } else {
                h0Var2 = h0Var;
                if (j5Var2.g0 == null) {
                    j5Var2.c(new HashMap(map));
                } else {
                    it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        entry = (Map.Entry) it.next();
                        Iterator it19 = it;
                        if (!j5Var2.g0.containsKey(entry.getKey())) {
                            j5Var2.b((String) entry.getKey(), (String) entry.getValue());
                        }
                        it = it19;
                    }
                }
            }
            list = j5Var2.o0;
            if (list != null) {
                j5Var2.o0 = new ArrayList(list2);
            } else {
                j5Var2.o0 = new ArrayList(list2);
            }
            map2 = (Map) f(sentryAndroidOptions4, "extras.json", Map.class);
            if (map2 != null) {
                if (j5Var2.q0 == null) {
                    j5Var2.q0 = new HashMap(new HashMap(map2));
                } else {
                    it5 = map2.entrySet().iterator();
                    while (it5.hasNext()) {
                        entry3 = (Map.Entry) it5.next();
                        Iterator it110 = it5;
                        if (!j5Var2.q0.containsKey(entry3.getKey())) {
                            j5Var2.q0.put((String) entry3.getKey(), entry3.getValue());
                        }
                        it5 = it110;
                        str13 = str13;
                    }
                }
            }
            String str116 = str13;
            eVar = (io.sentry.protocol.e) f(sentryAndroidOptions4, "contexts.json", io.sentry.protocol.e.class);
            if (eVar != null) {
                it4 = new io.sentry.protocol.e(eVar).X.entrySet().iterator();
                while (it4.hasNext()) {
                    entry2 = (Map.Entry) it4.next();
                    value = entry2.getValue();
                    Iterator it111 = it4;
                    if ("trace".equals(entry2.getKey())) {
                        eVar2.l(value, (String) entry2.getKey());
                    } else {
                        eVar2.l(value, (String) entry2.getKey());
                    }
                    it4 = it111;
                }
            }
            str2 = (String) f(sentryAndroidOptions4, "transaction.json", String.class);
            if (j5Var2.x0 == null) {
                j5Var2.x0 = str2;
            }
            list3 = (List) f(sentryAndroidOptions4, "fingerprint.json", List.class);
            if (j5Var2.y0 == null) {
                j5Var2.i(list3);
            }
            s5Var = (s5) f(sentryAndroidOptions4, "level.json", s5.class);
            if (j5Var2.w0 == null) {
                j5Var2.w0 = s5Var;
            }
            f7Var = (f7) f(sentryAndroidOptions4, "trace.json", f7.class);
            if (eVar2.j() == null) {
                eVar2.x(f7Var);
            }
            str3 = (String) f(sentryAndroidOptions4, "replay.json", String.class);
            cacheDirPath = sentryAndroidOptions4.getCacheDirPath();
            if (cacheDirPath == null) {
                cls = Map.class;
                str4 = "tags.json";
            } else {
                cls = Map.class;
                str4 = "tags.json";
                if (new File(cacheDirPath, oi0.l("replay_", str3)).exists()) {
                    d = sentryAndroidOptions4.getSessionReplay().e;
                    if (d == null) {
                        string = null;
                    } else {
                        string = d.toString();
                    }
                    str5 = (String) e("replay-error-sample-rate.json", String.class, string, i0Var2);
                    if (str5 != null) {
                        if (Double.parseDouble(str5) < io.sentry.util.o.a().c()) {
                            sentryAndroidOptions4.getLogger().h(s5.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", j5Var2.X);
                        } else {
                            fileArrListFiles = new File(cacheDirPath).listFiles();
                            if (fileArrListFiles != null) {
                                length = fileArrListFiles.length;
                                long jLastModified3 = Long.MIN_VALUE;
                                String strSubstring3 = null;
                                i = 0;
                                while (i < length) {
                                    file = fileArrListFiles[i];
                                    if (file.isDirectory()) {
                                        fileArr = fileArrListFiles;
                                        if (!file.getName().startsWith("replay_")) {
                                        }
                                    } else {
                                        fileArr = fileArrListFiles;
                                    }
                                    i++;
                                    fileArrListFiles = fileArr;
                                }
                                str3 = strSubstring3;
                            } else {
                                str3 = null;
                            }
                            if (str3 != null) {
                                Charset charset5 = io.sentry.cache.g.f;
                                io.sentry.cache.a.d(sentryAndroidOptions4, str3, ".scope-cache", "replay.json");
                                eVar2.l(str3, "replay_id");
                            }
                        }
                    }
                } else if (str3 != null) {
                    Charset charset6 = io.sentry.cache.g.f;
                    io.sentry.cache.a.d(sentryAndroidOptions4, str3, ".scope-cache", "replay.json");
                    eVar2.l(str3, "replay_id");
                }
            }
            if (j5Var2.h0 == null) {
                j5Var2.h0 = (String) e("release.json", String.class, sentryAndroidOptions4.getRelease(), i0Var2);
            }
            if (j5Var2.i0 == null) {
                j5Var2.i0 = (String) e("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), i0Var2);
            }
            h(j5Var2, i0Var2);
            fVar = j5Var2.p0;
            if (fVar == null) {
                fVar = new io.sentry.protocol.f();
            }
            if (fVar.Y == null) {
                fVar.b(new ArrayList());
            }
            list4 = fVar.Y;
            String str117 = DebugImage.PROGUARD;
            String str118 = "proguard-uuid.json";
            if (list4 != null) {
                str9 = (String) d("proguard-uuid.json", String.class, sentryAndroidOptions4.getProguardUuid(), i0Var2);
                if (str9 != null) {
                    DebugImage debugImage5 = new DebugImage();
                    debugImage5.setType(DebugImage.PROGUARD);
                    debugImage5.setUuid(str9);
                    list4.add(debugImage5);
                }
                j5Var2.p0 = fVar;
            }
            if (j5Var2.Z == null) {
                j5Var2.Z = (io.sentry.protocol.u) d("sdk-version.json", io.sentry.protocol.u.class, sentryAndroidOptions4.getSdkVersion(), i0Var2);
            }
            aVarE = eVar2.e();
            if (aVarE == null) {
                aVarE = new io.sentry.protocol.a();
            }
            aVar = aVarE;
            aVar.g0 = (String) m0.c.a(context);
            packageInfoD2 = m0.d(context, n0Var2);
            if (packageInfoD2 != null) {
                aVar.X = packageInfoD2.packageName;
            }
            h70Var = sentryAndroidOptions4.getOrCreateDeviceInfoUtil(context).f;
            if (h70Var != null) {
                aVar.n0 = Boolean.valueOf(h70Var.Y);
                strArr = (String[]) h70Var.Z;
                if (strArr != null) {
                    aVar.o0 = Arrays.asList(strArr);
                }
            }
            eVar2.o(aVar);
            g(j5Var);
            map3 = (Map) e(str4, cls, sentryAndroidOptions4.getTags(), i0Var2);
            if (map3 != null) {
                if (j5Var2.g0 == null) {
                    j5Var2.c(new HashMap(map3));
                } else {
                    while (r0.hasNext()) {
                        if (!j5Var2.g0.containsKey(entry4.getKey())) {
                            j5Var2.b((String) entry4.getKey(), (String) entry4.getValue());
                        }
                    }
                }
            }
            i0Var3 = j5Var2.k0;
            if (i0Var3 == null) {
                i0Var3 = new io.sentry.protocol.i0();
                j5Var2.k0 = i0Var3;
            }
            i0Var4 = i0Var3;
            if (i0Var4.Y == null) {
                strA = x0.a(context);
                i0Var4.Y = strA;
            }
            if (i0Var4.f0 == null) {
                i0Var4.f0 = "{{auto}}";
            }
            rl6Var = sentryAndroidOptions4.getOrCreateDeviceInfoUtil(context).e;
            if (rl6Var != null) {
                map6 = new HashMap();
                map6.put("isSideLoaded", String.valueOf(rl6Var.a));
                str8 = rl6Var.b;
                if (str8 != null) {
                    map6.put("installerStore", str8);
                }
                while (r0.hasNext()) {
                    j5Var2.b((String) entry5.getKey(), (String) entry5.getValue());
                }
            }
            if (h0Var2 != null) {
                if (r20 != 0) {
                    zEquals = "anr_background".equals(((io.sentry.hints.a) r19).e());
                } else {
                    zEquals = false;
                }
                j0 j0Var4 = h0Var2.a;
                sentryAndroidOptions = j0Var4.b;
                if (sentryAndroidOptions.isAnrProfilingEnabled()) {
                    sentryAndroidOptions2 = sentryAndroidOptions;
                    r3 = eVar2;
                    r110 = zEquals;
                    j5Var2 = j5Var2;
                } else {
                    sentryAndroidOptions2 = sentryAndroidOptions;
                    r3 = eVar2;
                    r110 = zEquals;
                    j5Var2 = j5Var2;
                }
                if (j5Var2.y0 == null) {
                    if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                        j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                    } else {
                        j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                    }
                }
                r0 = r110 ^ 1;
                aVarE2 = r3.e();
                if (aVarE2 == null) {
                    aVarE2 = new io.sentry.protocol.a();
                    r3.o(aVarE2);
                }
                if (aVarE2.m0 == null) {
                    aVarE2.m0 = Boolean.valueOf((boolean) r0);
                }
            }
            return j5Var2;
        }
        lValueOf2 = null;
        r19 = bVar;
        r20 = z2;
        packageInfoD = m0.d(context, n0Var2);
        if (packageInfoD == null) {
            j2 = 0;
            j = 0;
        } else {
            j = 0;
            j2 = packageInfoD.lastUpdateTime;
        }
        if (l == null) {
            if (lValueOf2 == null) {
                i0Var = i0.PERSISTED;
            } else if (l != null) {
                i0Var = i0.NONE;
            } else {
                i0Var = i0.NONE;
            }
        } else if (lValueOf2 == null) {
            i0Var = i0.PERSISTED;
        } else if (l != null) {
            i0Var = i0.NONE;
        } else {
            i0Var = i0.NONE;
        }
        i0Var2 = i0Var;
        if (!r19.a()) {
            if (j5Var2.h0 == null) {
                j5Var2.h0 = (String) e("release.json", String.class, sentryAndroidOptions4.getRelease(), i0Var2);
            }
            if (j5Var2.i0 == null) {
                j5Var2.i0 = (String) e("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), i0Var2);
            }
            h(j5Var2, i0Var2);
            g(j5Var);
            sentryAndroidOptions4.getLogger().h(s5.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return j5Var2;
        }
        if (j5Var2.f0 == null) {
            j5Var2.f0 = (io.sentry.protocol.r) f(sentryAndroidOptions4, "request.json", io.sentry.protocol.r.class);
        }
        if (j5Var2.k0 == null) {
            j5Var2.k0 = (io.sentry.protocol.i0) f(sentryAndroidOptions4, "user.json", io.sentry.protocol.i0.class);
        }
        map = (Map) f(sentryAndroidOptions4, "tags.json", Map.class);
        if (map == null) {
            h0Var2 = h0Var;
        } else {
            h0Var2 = h0Var;
            if (j5Var2.g0 == null) {
                j5Var2.c(new HashMap(map));
            } else {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    entry = (Map.Entry) it.next();
                    Iterator it112 = it;
                    if (!j5Var2.g0.containsKey(entry.getKey())) {
                        j5Var2.b((String) entry.getKey(), (String) entry.getValue());
                    }
                    it = it112;
                }
            }
        }
        list = j5Var2.o0;
        if (list != null) {
            j5Var2.o0 = new ArrayList(list2);
        } else {
            j5Var2.o0 = new ArrayList(list2);
        }
        map2 = (Map) f(sentryAndroidOptions4, "extras.json", Map.class);
        if (map2 != null) {
            if (j5Var2.q0 == null) {
                j5Var2.q0 = new HashMap(new HashMap(map2));
            } else {
                it5 = map2.entrySet().iterator();
                while (it5.hasNext()) {
                    entry3 = (Map.Entry) it5.next();
                    Iterator it113 = it5;
                    if (!j5Var2.q0.containsKey(entry3.getKey())) {
                        j5Var2.q0.put((String) entry3.getKey(), entry3.getValue());
                    }
                    it5 = it113;
                    str13 = str13;
                }
            }
        }
        String str119 = str13;
        eVar = (io.sentry.protocol.e) f(sentryAndroidOptions4, "contexts.json", io.sentry.protocol.e.class);
        if (eVar != null) {
            it4 = new io.sentry.protocol.e(eVar).X.entrySet().iterator();
            while (it4.hasNext()) {
                entry2 = (Map.Entry) it4.next();
                value = entry2.getValue();
                Iterator it114 = it4;
                if ("trace".equals(entry2.getKey())) {
                    eVar2.l(value, (String) entry2.getKey());
                } else {
                    eVar2.l(value, (String) entry2.getKey());
                }
                it4 = it114;
            }
        }
        str2 = (String) f(sentryAndroidOptions4, "transaction.json", String.class);
        if (j5Var2.x0 == null) {
            j5Var2.x0 = str2;
        }
        list3 = (List) f(sentryAndroidOptions4, "fingerprint.json", List.class);
        if (j5Var2.y0 == null) {
            j5Var2.i(list3);
        }
        s5Var = (s5) f(sentryAndroidOptions4, "level.json", s5.class);
        if (j5Var2.w0 == null) {
            j5Var2.w0 = s5Var;
        }
        f7Var = (f7) f(sentryAndroidOptions4, "trace.json", f7.class);
        if (eVar2.j() == null) {
            eVar2.x(f7Var);
        }
        str3 = (String) f(sentryAndroidOptions4, "replay.json", String.class);
        cacheDirPath = sentryAndroidOptions4.getCacheDirPath();
        if (cacheDirPath == null) {
            cls = Map.class;
            str4 = "tags.json";
        } else {
            cls = Map.class;
            str4 = "tags.json";
            if (new File(cacheDirPath, oi0.l("replay_", str3)).exists()) {
                d = sentryAndroidOptions4.getSessionReplay().e;
                if (d == null) {
                    string = null;
                } else {
                    string = d.toString();
                }
                str5 = (String) e("replay-error-sample-rate.json", String.class, string, i0Var2);
                if (str5 != null) {
                    if (Double.parseDouble(str5) < io.sentry.util.o.a().c()) {
                        sentryAndroidOptions4.getLogger().h(s5.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", j5Var2.X);
                    } else {
                        fileArrListFiles = new File(cacheDirPath).listFiles();
                        if (fileArrListFiles != null) {
                            length = fileArrListFiles.length;
                            long jLastModified4 = Long.MIN_VALUE;
                            String strSubstring4 = null;
                            i = 0;
                            while (i < length) {
                                file = fileArrListFiles[i];
                                if (file.isDirectory()) {
                                    fileArr = fileArrListFiles;
                                    if (!file.getName().startsWith("replay_")) {
                                    }
                                } else {
                                    fileArr = fileArrListFiles;
                                }
                                i++;
                                fileArrListFiles = fileArr;
                            }
                            str3 = strSubstring4;
                        } else {
                            str3 = null;
                        }
                        if (str3 != null) {
                            Charset charset7 = io.sentry.cache.g.f;
                            io.sentry.cache.a.d(sentryAndroidOptions4, str3, ".scope-cache", "replay.json");
                            eVar2.l(str3, "replay_id");
                        }
                    }
                }
            } else if (str3 != null) {
                Charset charset8 = io.sentry.cache.g.f;
                io.sentry.cache.a.d(sentryAndroidOptions4, str3, ".scope-cache", "replay.json");
                eVar2.l(str3, "replay_id");
            }
        }
        if (j5Var2.h0 == null) {
            j5Var2.h0 = (String) e("release.json", String.class, sentryAndroidOptions4.getRelease(), i0Var2);
        }
        if (j5Var2.i0 == null) {
            j5Var2.i0 = (String) e("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), i0Var2);
        }
        h(j5Var2, i0Var2);
        fVar = j5Var2.p0;
        if (fVar == null) {
            fVar = new io.sentry.protocol.f();
        }
        if (fVar.Y == null) {
            fVar.b(new ArrayList());
        }
        list4 = fVar.Y;
        String str1110 = DebugImage.PROGUARD;
        String str1111 = "proguard-uuid.json";
        if (list4 != null) {
            str9 = (String) d("proguard-uuid.json", String.class, sentryAndroidOptions4.getProguardUuid(), i0Var2);
            if (str9 != null) {
                DebugImage debugImage6 = new DebugImage();
                debugImage6.setType(DebugImage.PROGUARD);
                debugImage6.setUuid(str9);
                list4.add(debugImage6);
            }
            j5Var2.p0 = fVar;
        }
        if (j5Var2.Z == null) {
            j5Var2.Z = (io.sentry.protocol.u) d("sdk-version.json", io.sentry.protocol.u.class, sentryAndroidOptions4.getSdkVersion(), i0Var2);
        }
        aVarE = eVar2.e();
        if (aVarE == null) {
            aVarE = new io.sentry.protocol.a();
        }
        aVar = aVarE;
        aVar.g0 = (String) m0.c.a(context);
        packageInfoD2 = m0.d(context, n0Var2);
        if (packageInfoD2 != null) {
            aVar.X = packageInfoD2.packageName;
        }
        h70Var = sentryAndroidOptions4.getOrCreateDeviceInfoUtil(context).f;
        if (h70Var != null) {
            aVar.n0 = Boolean.valueOf(h70Var.Y);
            strArr = (String[]) h70Var.Z;
            if (strArr != null) {
                aVar.o0 = Arrays.asList(strArr);
            }
        }
        eVar2.o(aVar);
        g(j5Var);
        map3 = (Map) e(str4, cls, sentryAndroidOptions4.getTags(), i0Var2);
        if (map3 != null) {
            if (j5Var2.g0 == null) {
                j5Var2.c(new HashMap(map3));
            } else {
                while (r0.hasNext()) {
                    if (!j5Var2.g0.containsKey(entry4.getKey())) {
                        j5Var2.b((String) entry4.getKey(), (String) entry4.getValue());
                    }
                }
            }
        }
        i0Var3 = j5Var2.k0;
        if (i0Var3 == null) {
            i0Var3 = new io.sentry.protocol.i0();
            j5Var2.k0 = i0Var3;
        }
        i0Var4 = i0Var3;
        if (i0Var4.Y == null) {
            strA = x0.a(context);
            i0Var4.Y = strA;
        }
        if (i0Var4.f0 == null) {
            i0Var4.f0 = "{{auto}}";
        }
        rl6Var = sentryAndroidOptions4.getOrCreateDeviceInfoUtil(context).e;
        if (rl6Var != null) {
            map6 = new HashMap();
            map6.put("isSideLoaded", String.valueOf(rl6Var.a));
            str8 = rl6Var.b;
            if (str8 != null) {
                map6.put("installerStore", str8);
            }
            while (r0.hasNext()) {
                j5Var2.b((String) entry5.getKey(), (String) entry5.getValue());
            }
        }
        if (h0Var2 != null) {
            if (r20 != 0) {
                zEquals = "anr_background".equals(((io.sentry.hints.a) r19).e());
            } else {
                zEquals = false;
            }
            j0 j0Var5 = h0Var2.a;
            sentryAndroidOptions = j0Var5.b;
            if (sentryAndroidOptions.isAnrProfilingEnabled()) {
                sentryAndroidOptions2 = sentryAndroidOptions;
                r3 = eVar2;
                r110 = zEquals;
                j5Var2 = j5Var2;
            } else {
                sentryAndroidOptions2 = sentryAndroidOptions;
                r3 = eVar2;
                r110 = zEquals;
                j5Var2 = j5Var2;
            }
            if (j5Var2.y0 == null) {
                if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                    j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                } else {
                    j5Var2.i(Arrays.asList("{{ default }}", r110 != 0 ? "background-anr" : "foreground-anr"));
                }
            }
            r0 = r110 ^ 1;
            aVarE2 = r3.e();
            if (aVarE2 == null) {
                aVarE2 = new io.sentry.protocol.a();
                r3.o(aVarE2);
            }
            if (aVarE2.m0 == null) {
                aVarE2.m0 = Boolean.valueOf((boolean) r0);
            }
        }
        return j5Var2;
    }

    public final Object d(String str, Class cls, Object obj, i0 i0Var) {
        if (i0Var == i0.CURRENT || i0Var == i0.PERSISTED_WITH_CURRENT_FALLBACK) {
            return obj;
        }
        if (i0Var == i0.NONE) {
            return null;
        }
        return io.sentry.cache.a.c(this.b, ".options-cache", str, cls);
    }

    public final Object e(String str, Class cls, Object obj, i0 i0Var) {
        if (i0Var != i0.CURRENT) {
            if (i0Var == i0.NONE) {
                return null;
            }
            Object objC = io.sentry.cache.a.c(this.b, ".options-cache", str, cls);
            if (objC != null || i0Var == i0.PERSISTED) {
                return objC;
            }
        }
        return obj;
    }

    public final Object f(s6 s6Var, String str, Class cls) {
        io.sentry.cache.g gVar = this.e;
        if (gVar == null) {
            return null;
        }
        return gVar.j(s6Var, str, cls);
    }

    public final void g(y4 y4Var) {
        String str = y4Var.h0;
        io.sentry.protocol.e eVar = y4Var.Y;
        if (str != null) {
            try {
                io.sentry.protocol.a aVarE = eVar.e();
                if (aVarE == null) {
                    aVarE = new io.sentry.protocol.a();
                }
                String strSubstring = str.substring(str.indexOf(64) + 1, str.indexOf(43));
                String strSubstring2 = str.substring(str.indexOf(43) + 1);
                aVarE.h0 = strSubstring;
                aVarE.i0 = strSubstring2;
                eVar.o(aVarE);
            } catch (Throwable unused) {
                this.b.getLogger().h(s5.WARNING, "Failed to parse release from scope cache: %s", str);
            }
        }
    }

    public final void h(y4 y4Var, i0 i0Var) {
        String str;
        String str2 = y4Var.n0;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (str2 == null) {
            str2 = (String) e("dist.json", String.class, sentryAndroidOptions.getDist(), i0Var);
            y4Var.n0 = str2;
        }
        if (str2 != null || (str = y4Var.h0) == null) {
            return;
        }
        try {
            y4Var.n0 = str.substring(str.indexOf(43) + 1);
        } catch (Throwable unused) {
            sentryAndroidOptions.getLogger().h(s5.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    @Override // io.sentry.i0
    public final io.sentry.protocol.f0 c(io.sentry.protocol.f0 f0Var, io.sentry.n0 n0Var) {
        return f0Var;
    }
}
