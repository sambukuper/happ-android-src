package defpackage;

import android.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cc extends wl6 {
    public final /* synthetic */ byte j0;
    public final /* synthetic */ t3 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc(t3 t3Var, byte b) {
        super((byte) 3);
        this.j0 = b;
        this.k0 = t3Var;
    }

    @Override // defpackage.wl6
    public void J(int i, h4 h4Var, String str, Bundle bundle) {
        switch (this.j0) {
            case 0:
                ((gc) this.k0).j(i, h4Var, str, bundle);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x020e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0213  */
    /* JADX WARN: Code duplicated, block: B:113:0x022e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0238  */
    /* JADX WARN: Code duplicated, block: B:117:0x0247  */
    /* JADX WARN: Code duplicated, block: B:119:0x0263  */
    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    /* JADX WARN: Code duplicated, block: B:121:0x026c  */
    /* JADX WARN: Code duplicated, block: B:123:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:124:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:138:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:141:0x0306  */
    /* JADX WARN: Code duplicated, block: B:143:0x030c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0318  */
    /* JADX WARN: Code duplicated, block: B:148:0x0322  */
    /* JADX WARN: Code duplicated, block: B:151:0x0333  */
    /* JADX WARN: Code duplicated, block: B:154:0x0366  */
    /* JADX WARN: Code duplicated, block: B:157:0x0371  */
    /* JADX WARN: Code duplicated, block: B:159:0x0381  */
    /* JADX WARN: Code duplicated, block: B:165:0x039f  */
    /* JADX WARN: Code duplicated, block: B:168:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:170:0x03b9 A[LOOP:3: B:167:0x03a5->B:170:0x03b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:176:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:184:0x040c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0424  */
    /* JADX WARN: Code duplicated, block: B:190:0x0447  */
    /* JADX WARN: Code duplicated, block: B:192:0x0455  */
    /* JADX WARN: Code duplicated, block: B:194:0x045c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0470  */
    /* JADX WARN: Code duplicated, block: B:198:0x0482  */
    /* JADX WARN: Code duplicated, block: B:200:0x048c  */
    /* JADX WARN: Code duplicated, block: B:202:0x049c  */
    /* JADX WARN: Code duplicated, block: B:206:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:209:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:211:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:213:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:216:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:219:0x0503  */
    /* JADX WARN: Code duplicated, block: B:221:0x0507  */
    /* JADX WARN: Code duplicated, block: B:222:0x050c  */
    /* JADX WARN: Code duplicated, block: B:224:0x0510  */
    /* JADX WARN: Code duplicated, block: B:227:0x051c  */
    /* JADX WARN: Code duplicated, block: B:230:0x0522  */
    /* JADX WARN: Code duplicated, block: B:232:0x0528  */
    /* JADX WARN: Code duplicated, block: B:233:0x052c  */
    /* JADX WARN: Code duplicated, block: B:235:0x0533  */
    /* JADX WARN: Code duplicated, block: B:238:0x053d  */
    /* JADX WARN: Code duplicated, block: B:243:0x054f  */
    /* JADX WARN: Code duplicated, block: B:245:0x0557  */
    /* JADX WARN: Code duplicated, block: B:248:0x055d  */
    /* JADX WARN: Code duplicated, block: B:249:0x0564  */
    /* JADX WARN: Code duplicated, block: B:253:0x0571  */
    /* JADX WARN: Code duplicated, block: B:256:0x0577  */
    /* JADX WARN: Code duplicated, block: B:258:0x057a  */
    /* JADX WARN: Code duplicated, block: B:261:0x0591 A[LOOP:7: B:257:0x0578->B:261:0x0591, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:264:0x0599  */
    /* JADX WARN: Code duplicated, block: B:267:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:270:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:273:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:276:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:279:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:281:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:284:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:287:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:290:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:291:0x0600  */
    /* JADX WARN: Code duplicated, block: B:294:0x061a  */
    /* JADX WARN: Code duplicated, block: B:296:0x062d  */
    /* JADX WARN: Code duplicated, block: B:298:0x0637  */
    /* JADX WARN: Code duplicated, block: B:299:0x063e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:302:0x064f  */
    /* JADX WARN: Code duplicated, block: B:303:0x0657  */
    /* JADX WARN: Code duplicated, block: B:306:0x0662  */
    /* JADX WARN: Code duplicated, block: B:309:0x066e  */
    /* JADX WARN: Code duplicated, block: B:312:0x0674  */
    /* JADX WARN: Code duplicated, block: B:315:0x0684  */
    /* JADX WARN: Code duplicated, block: B:318:0x068a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:320:0x0692  */
    /* JADX WARN: Code duplicated, block: B:324:0x069b  */
    /* JADX WARN: Code duplicated, block: B:327:0x06a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:334:0x06ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:338:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:341:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:346:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:349:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:351:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:354:0x0701  */
    /* JADX WARN: Code duplicated, block: B:357:0x0707  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:360:0x0719  */
    /* JADX WARN: Code duplicated, block: B:362:0x0721  */
    /* JADX WARN: Code duplicated, block: B:365:0x0727  */
    /* JADX WARN: Code duplicated, block: B:368:0x073b  */
    /* JADX WARN: Code duplicated, block: B:371:0x0741  */
    /* JADX WARN: Code duplicated, block: B:374:0x0756  */
    /* JADX WARN: Code duplicated, block: B:377:0x075c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:380:0x0770  */
    /* JADX WARN: Code duplicated, block: B:383:0x0776  */
    /* JADX WARN: Code duplicated, block: B:387:0x078c  */
    /* JADX WARN: Code duplicated, block: B:388:0x0793  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:390:0x0796  */
    /* JADX WARN: Code duplicated, block: B:393:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:398:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:401:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:402:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:405:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:408:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:410:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:419:0x081d  */
    /* JADX WARN: Code duplicated, block: B:421:0x0823  */
    /* JADX WARN: Code duplicated, block: B:429:0x083c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:431:0x0842  */
    /* JADX WARN: Code duplicated, block: B:433:0x084c  */
    /* JADX WARN: Code duplicated, block: B:435:0x0855  */
    /* JADX WARN: Code duplicated, block: B:438:0x0859  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:441:0x0868  */
    /* JADX WARN: Code duplicated, block: B:443:0x0878  */
    /* JADX WARN: Code duplicated, block: B:451:0x0894  */
    /* JADX WARN: Code duplicated, block: B:454:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:458:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:460:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:461:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:464:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:467:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:471:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:474:0x0902  */
    /* JADX WARN: Code duplicated, block: B:477:0x090d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:480:0x0912  */
    /* JADX WARN: Code duplicated, block: B:483:0x091d  */
    /* JADX WARN: Code duplicated, block: B:488:0x0945  */
    /* JADX WARN: Code duplicated, block: B:490:0x0949  */
    /* JADX WARN: Code duplicated, block: B:493:0x0951  */
    /* JADX WARN: Code duplicated, block: B:495:0x095f  */
    /* JADX WARN: Code duplicated, block: B:497:0x0963  */
    /* JADX WARN: Code duplicated, block: B:499:0x0971  */
    /* JADX WARN: Code duplicated, block: B:502:0x0977  */
    /* JADX WARN: Code duplicated, block: B:507:0x0981  */
    /* JADX WARN: Code duplicated, block: B:510:0x0991  */
    /* JADX WARN: Code duplicated, block: B:512:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:514:0x09b7  */
    /* JADX WARN: Code duplicated, block: B:516:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:520:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:522:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:523:0x09db  */
    /* JADX WARN: Code duplicated, block: B:526:0x09df  */
    /* JADX WARN: Code duplicated, block: B:529:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:531:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:534:0x0a15 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:537:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:539:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:541:0x0a37  */
    /* JADX WARN: Code duplicated, block: B:544:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:547:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:54:0x011d  */
    /* JADX WARN: Code duplicated, block: B:550:0x0a5b  */
    /* JADX WARN: Code duplicated, block: B:552:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:554:0x0a6e  */
    /* JADX WARN: Code duplicated, block: B:555:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:557:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:560:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:562:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:563:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:567:0x0a9a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:570:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:572:0x0aae  */
    /* JADX WARN: Code duplicated, block: B:574:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:577:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:57:0x012a  */
    /* JADX WARN: Code duplicated, block: B:580:0x0ad6  */
    /* JADX WARN: Code duplicated, block: B:583:0x0ae0  */
    /* JADX WARN: Code duplicated, block: B:585:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:588:0x0af6  */
    /* JADX WARN: Code duplicated, block: B:591:0x0b06  */
    /* JADX WARN: Code duplicated, block: B:594:0x0b1a  */
    /* JADX WARN: Code duplicated, block: B:596:0x0b24  */
    /* JADX WARN: Code duplicated, block: B:599:0x0b3a  */
    /* JADX WARN: Code duplicated, block: B:602:0x0b50  */
    /* JADX WARN: Code duplicated, block: B:605:0x0b64  */
    /* JADX WARN: Code duplicated, block: B:607:0x0b74  */
    /* JADX WARN: Code duplicated, block: B:609:0x0b8a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0130  */
    /* JADX WARN: Code duplicated, block: B:611:0x0b9f  */
    /* JADX WARN: Code duplicated, block: B:613:0x0baa  */
    /* JADX WARN: Code duplicated, block: B:614:0x0bbc  */
    /* JADX WARN: Code duplicated, block: B:618:0x0bd3  */
    /* JADX WARN: Code duplicated, block: B:621:0x0bda  */
    /* JADX WARN: Code duplicated, block: B:623:0x0be4  */
    /* JADX WARN: Code duplicated, block: B:624:0x0beb  */
    /* JADX WARN: Code duplicated, block: B:626:0x0bee  */
    /* JADX WARN: Code duplicated, block: B:628:0x0bfa  */
    /* JADX WARN: Code duplicated, block: B:62:0x0138  */
    /* JADX WARN: Code duplicated, block: B:631:0x0c0a  */
    /* JADX WARN: Code duplicated, block: B:633:0x0c15  */
    /* JADX WARN: Code duplicated, block: B:636:0x0c32  */
    /* JADX WARN: Code duplicated, block: B:637:0x0c46  */
    /* JADX WARN: Code duplicated, block: B:640:0x0c50  */
    /* JADX WARN: Code duplicated, block: B:643:0x0c61  */
    /* JADX WARN: Code duplicated, block: B:653:0x0c76  */
    /* JADX WARN: Code duplicated, block: B:655:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x021c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Code duplicated, block: B:662:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x042e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x0596 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x0586 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x0838 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x0833 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x09ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0151  */
    /* JADX WARN: Code duplicated, block: B:690:0x09ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:0x0170  */
    /* JADX WARN: Code duplicated, block: B:78:0x0181  */
    /* JADX WARN: Code duplicated, block: B:79:0x0185  */
    /* JADX WARN: Code duplicated, block: B:82:0x019f  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e7  */
    /* JADX WARN: Instruction removed from duplicated block: B:653:0x0c76, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v84, types: [d02] */
    /* JADX WARN: Type inference failed for: r4v85, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v89, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.util.ArrayList] */
    @Override // defpackage.wl6
    public final h4 L(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        h4 h4Var;
        int i2;
        y07 y07VarL;
        Integer numValueOf;
        int iIntValue;
        tz4 tz4Var;
        ue7 ue7Var;
        Resources resources;
        t07 t07Var;
        s05 s05Var;
        Object objG;
        kl6 kl6Var;
        AccessibilityManager accessibilityManager;
        ue7 ue7Var2;
        boolean zU;
        List listI;
        int size;
        boolean z;
        int i3;
        int i4;
        AccessibilityNodeInfo accessibilityNodeInfo;
        ql qlVarC;
        t07 t07Var2;
        kl6 kl6Var2;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        s05 s05Var2;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        h4 h4Var2;
        y07 y07Var;
        SpannableString spannableString;
        h4 h4Var3;
        e17 e17Var;
        s05 s05Var3;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        AccessibilityNodeInfo accessibilityNodeInfo5;
        Object objG2;
        ib8 ib8Var;
        Object objG3;
        Boolean bool;
        kl6 kl6Var3;
        int i5;
        t07 t07Var3;
        Object objG4;
        List list;
        String str;
        Object objG5;
        String str2;
        Object objG6;
        Object objG7;
        int i6;
        Object objG8;
        Boolean bool2;
        Object objG9;
        Integer num;
        int iIntValue2;
        e17 e17Var2;
        gc gcVar;
        boolean z2;
        y07 y07VarL2;
        Object objG10;
        Object objG11;
        q3 q3Var;
        Object objG12;
        q3 q3Var2;
        Object objG13;
        q3 q3Var3;
        String strT;
        qw5 qw5Var;
        Object objG14;
        jx6 jx6Var;
        jx6 jx6Var2;
        int iD;
        AndroidComposeView androidComposeView;
        int iD2;
        String str3;
        h4 h4Var4;
        q3 q3Var4;
        q3 q3Var5;
        q3 q3Var6;
        e17 e17Var3;
        List list2;
        int size2;
        uz4 uz4Var;
        int i7;
        ue7 ue7Var3;
        f05 f05Var;
        int[] iArr;
        int i8;
        int[] iArrCopyOf;
        int i9;
        int i10;
        ArrayList arrayList;
        int i11;
        Object objG15;
        Object objG16;
        Object objG17;
        boolean z3;
        z24 z24Var;
        LayoutNode layoutNode;
        a4 a4Var;
        a4 a4Var2;
        Object objG18;
        y07 y07VarL3;
        Object objG19;
        Object objG20;
        sv0 sv0Var;
        ArrayList arrayList2;
        List listI2;
        int size3;
        int i12;
        int i13;
        boolean zT;
        int i14;
        Object objG21;
        y07 y07Var2;
        q3 q3Var7;
        float f;
        uu0 uu0Var;
        e17 e17Var4;
        float f2;
        float f3;
        float f4;
        ArrayList arrayList3;
        CharSequence charSequenceG;
        Object objG22;
        q3 q3Var8;
        String str4;
        Object objG23;
        List list3;
        LayoutNode layoutNodeW;
        t07 t07VarY;
        boolean zF;
        Object objG24;
        t07 t07VarY2;
        Object objG25;
        q3 q3Var9;
        Object objG26;
        q3 q3Var10;
        Object objG27;
        q3 q3Var11;
        Object objG28;
        q3 q3Var12;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        Object objG29;
        boolean z4;
        boolean z5;
        int iD3;
        y07 y07VarL4;
        boolean zBooleanValue;
        t07 t07Var4;
        e17 e17Var5;
        boolean zBooleanValue2;
        Object objG30;
        fi1 density;
        zv7 zv7Var;
        SpannableString spannableString2;
        List list4;
        ArrayList arrayList4;
        SpannableString spannableString3;
        ?? arrayList5;
        ?? arrayList6;
        int size4;
        int i15;
        int size5;
        int i16;
        List listA;
        int size6;
        int i17;
        pl plVar;
        int i18;
        Object obj;
        int i19;
        pa4 pa4Var;
        WeakHashMap weakHashMap;
        Object gz0Var;
        pl plVar2;
        oa4 oa4Var;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        fq8 fq8Var;
        WeakHashMap weakHashMap3;
        Object uRLSpan2;
        int size7;
        int i20;
        pl plVar3;
        yu8 yu8Var;
        int i21;
        int i22;
        int size8;
        int i23;
        pl plVar4;
        int size9;
        int i24;
        int i25;
        int i26;
        long jB;
        dj2 dj2Var;
        bj2 bj2Var;
        g78 g78Var;
        long j;
        x38 x38Var;
        f78 f78Var;
        long jB2;
        f78 pw0Var;
        SpannableString spannableString4;
        dj2 dj2Var2;
        int i27;
        int i28;
        int i29;
        y07 y07Var3;
        ff3 ff3VarS;
        int i30;
        a17 a17Var;
        boolean zF2;
        y07 y07Var4;
        byte b;
        byte b2;
        String strX;
        Object parentForAccessibility;
        View view;
        byte b3 = this.j0;
        t3 t3Var = this.k0;
        switch (b3) {
            case 0:
                gc gcVar2 = (gc) t3Var;
                AccessibilityManager accessibilityManager2 = gcVar2.i0;
                AndroidComposeView androidComposeView2 = gcVar2.f0;
                if (androidComposeView2.getComposeViewContext().d().getH0().i == o84.X) {
                    if (accessibilityManager2.isEnabled()) {
                        h4Var4 = null;
                    } else {
                        h4Var4 = new h4(AccessibilityNodeInfo.obtain());
                    }
                    gcVar = gcVar2;
                    i6 = i;
                } else {
                    a17 a17Var2 = (a17) gcVar2.s().b(i);
                    if (a17Var2 == null) {
                        if (accessibilityManager2.isEnabled()) {
                            h4Var4 = null;
                        } else {
                            h4Var4 = new h4(AccessibilityNodeInfo.obtain());
                        }
                        gcVar = gcVar2;
                        i6 = i;
                    } else {
                        y07 y07Var5 = a17Var2.a;
                        t07 t07VarK = y07Var5.k();
                        LayoutNode layoutNode2 = y07Var5.c;
                        Object objG31 = t07VarK.X.g(c17.o);
                        if (objG31 == null) {
                            objG31 = null;
                        }
                        boolean zF3 = dh3.f(objG31, Boolean.TRUE);
                        if (!zF3) {
                            accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            h4Var = new h4(accessibilityNodeInfoObtain);
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 34) {
                                u3.D(accessibilityNodeInfoObtain, zF3);
                            } else {
                                h4Var.j(64, zF3);
                            }
                            if (i == -1) {
                                parentForAccessibility = androidComposeView2.getParentForAccessibility();
                                if (parentForAccessibility instanceof View) {
                                    view = (View) parentForAccessibility;
                                } else {
                                    view = null;
                                }
                                h4Var.b = -1;
                                accessibilityNodeInfoObtain.setParent(view);
                            } else {
                                y07VarL = y07Var5.l();
                                if (y07VarL != null) {
                                    numValueOf = Integer.valueOf(y07VarL.f);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    wc3.c("semanticsNode " + i + " has null parent");
                                    b61.n();
                                    return null;
                                }
                                iIntValue = numValueOf.intValue();
                                if (iIntValue == androidComposeView2.getSemanticsOwner().a().f) {
                                    iIntValue = -1;
                                }
                                h4Var.b = iIntValue;
                                accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                            }
                            h4Var.c = i;
                            accessibilityNodeInfoObtain.setSource(androidComposeView2, i);
                            h4Var.l(gcVar2.k(a17Var2));
                            tz4Var = gcVar2.L0;
                            ue7Var = gcVar2.u0;
                            resources = androidComposeView2.getContext().getResources();
                            h4Var.m("android.view.View");
                            t07Var = y07Var5.d;
                            s05Var = t07Var.X;
                            if (s05Var.c(c17.G)) {
                                h4Var.m("android.widget.EditText");
                            }
                            if (s05Var.c(c17.C)) {
                                h4Var.m("android.widget.TextView");
                            }
                            objG = s05Var.g(c17.z);
                            if (objG == null) {
                                objG = null;
                            }
                            kl6Var = (kl6) objG;
                            if (kl6Var != null) {
                                b = kl6Var.a;
                                if (y07Var5.n()) {
                                    accessibilityManager = accessibilityManager2;
                                    b2 = 4;
                                    ue7Var2 = ue7Var;
                                } else {
                                    accessibilityManager = accessibilityManager2;
                                    b2 = 4;
                                    ue7Var2 = ue7Var;
                                    if (y07Var5.i((4 & 1) != 0 ? !y07Var5.b : false, (4 & 2) == 0).isEmpty()) {
                                    }
                                }
                                if (b == b2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(b56.tab));
                                } else if (b == 2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(b56.switch_role));
                                } else {
                                    strX = gv3.X(b);
                                    if (b == 5 || vr3.M(y07Var5) || t07Var.Z) {
                                        h4Var.m(strX);
                                    }
                                }
                            } else {
                                accessibilityManager = accessibilityManager2;
                                ue7Var2 = ue7Var;
                            }
                            accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                            accessibilityNodeInfoObtain.setImportantForAccessibility(jm4.M(y07Var5));
                            if (i2 >= 34) {
                                zU = u3.u(accessibilityManager);
                            } else {
                                zU = true;
                            }
                            listI = y07Var5.i((4 & 1) != 0 ? !y07Var5.b : false, (4 & 2) == 0);
                            size = listI.size();
                            z = zU;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                accessibilityNodeInfo = h4Var.a;
                                if (i4 < size) {
                                    int i31 = size;
                                    y07Var3 = (y07) listI.get(i4);
                                    List list5 = listI;
                                    ff3VarS = gcVar2.s();
                                    int i32 = i4;
                                    i30 = y07Var3.f;
                                    if (!ff3VarS.a(i30)) {
                                        if (androidComposeView2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(y07Var3.c) == null) {
                                            c2.m();
                                        } else if (i30 != -1) {
                                            a17Var = (a17) gcVar2.s().b(i30);
                                            if (a17Var != null || (y07Var4 = a17Var.a) == null) {
                                                zF2 = false;
                                            } else {
                                                Object objG32 = y07Var4.k().X.g(c17.o);
                                                if (objG32 == null) {
                                                    objG32 = null;
                                                }
                                                zF2 = dh3.f(objG32, Boolean.TRUE);
                                            }
                                            if (z || !zF2) {
                                                accessibilityNodeInfo.addChild(androidComposeView2, i30);
                                            }
                                            tz4Var.f(i30, i3);
                                            i3++;
                                        }
                                    }
                                    i4 = i32 + 1;
                                    listI = list5;
                                    size = i31;
                                } else {
                                    if (i == gcVar2.m0) {
                                        accessibilityNodeInfo.setAccessibilityFocused(true);
                                        h4Var.b(a4.i);
                                    } else {
                                        accessibilityNodeInfo.setAccessibilityFocused(false);
                                        h4Var.b(a4.h);
                                    }
                                    qlVarC = vr3.C(y07Var5);
                                    if (qlVarC != null) {
                                        androidComposeView2.getFontFamilyResolver();
                                        density = androidComposeView2.getDensity();
                                        zv7Var = gcVar2.H0;
                                        String str5 = qlVarC.Y;
                                        list4 = qlVarC.X;
                                        spannableString2 = new SpannableString(str5);
                                        arrayList4 = qlVarC.Z;
                                        if (arrayList4 != null) {
                                            size9 = arrayList4.size();
                                            i24 = 0;
                                            while (i24 < size9) {
                                                int i33 = size9;
                                                pl plVar5 = (pl) arrayList4.get(i24);
                                                int i34 = i24;
                                                qe7 qe7Var = (qe7) plVar5.a;
                                                ArrayList arrayList7 = arrayList4;
                                                i25 = plVar5.b;
                                                i26 = plVar5.c;
                                                t07 t07Var5 = t07Var;
                                                kl6 kl6Var4 = kl6Var;
                                                jB = qe7Var.a.b();
                                                AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo;
                                                s05 s05Var4 = s05Var;
                                                long j2 = qe7Var.b;
                                                dj2Var = qe7Var.c;
                                                bj2Var = qe7Var.d;
                                                g78Var = qe7Var.j;
                                                ge4 ge4Var = qe7Var.k;
                                                AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfoObtain;
                                                h4 h4Var5 = h4Var;
                                                j = qe7Var.l;
                                                x38Var = qe7Var.m;
                                                f78Var = qe7Var.a;
                                                y07 y07Var6 = y07Var5;
                                                jB2 = f78Var.b();
                                                int i35 = dw0.h;
                                                if (tk8.a(jB, jB2)) {
                                                    pw0Var = f78Var;
                                                } else if (jB != 16) {
                                                    pw0Var = new pw0(jB);
                                                } else {
                                                    pw0Var = e78.a;
                                                }
                                                dh3.J(spannableString2, pw0Var.b(), i25, i26);
                                                spannableString4 = spannableString2;
                                                dh3.K(spannableString4, j2, density, i25, i26);
                                                if (dj2Var == null || bj2Var != null) {
                                                    if (dj2Var == null) {
                                                        dj2Var2 = dj2.g0;
                                                    } else {
                                                        dj2Var2 = dj2Var;
                                                    }
                                                    if (bj2Var != null) {
                                                        i27 = bj2Var.a;
                                                    } else {
                                                        i27 = 0;
                                                    }
                                                    StyleSpan styleSpan = new StyleSpan(km4.H(dj2Var2, i27));
                                                    i28 = 33;
                                                    spannableString4.setSpan(styleSpan, i25, i26, 33);
                                                } else {
                                                    i28 = 33;
                                                }
                                                if (x38Var != null) {
                                                    i29 = x38Var.a;
                                                    if ((i29 | 1) == i29) {
                                                        spannableString4.setSpan(new UnderlineSpan(), i25, i26, i28);
                                                    }
                                                    if ((i29 | 2) == i29) {
                                                        spannableString4.setSpan(new StrikethroughSpan(), i25, i26, i28);
                                                    }
                                                }
                                                if (g78Var != null) {
                                                    spannableString4.setSpan(new ScaleXSpan(g78Var.a), i25, i26, i28);
                                                }
                                                dh3.L(spannableString4, ge4Var, i25, i26);
                                                if (j != 16) {
                                                    spannableString4.setSpan(new BackgroundColorSpan(z51.U(j)), i25, i26, i28);
                                                }
                                                i24 = i34 + 1;
                                                spannableString2 = spannableString4;
                                                y07Var5 = y07Var6;
                                                size9 = i33;
                                                arrayList4 = arrayList7;
                                                t07Var = t07Var5;
                                                kl6Var = kl6Var4;
                                                accessibilityNodeInfo = accessibilityNodeInfo6;
                                                s05Var = s05Var4;
                                                accessibilityNodeInfoObtain = accessibilityNodeInfo7;
                                                h4Var = h4Var5;
                                            }
                                        }
                                        t07Var2 = t07Var;
                                        kl6Var2 = kl6Var;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        s05Var2 = s05Var;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        h4Var2 = h4Var;
                                        spannableString3 = spannableString2;
                                        y07Var = y07Var5;
                                        int length = str5.length();
                                        arrayList5 = d02.X;
                                        if (list4 != null) {
                                            arrayList6 = new ArrayList(list4.size());
                                            size8 = list4.size();
                                            for (i23 = 0; i23 < size8; i23++) {
                                                Object obj2 = list4.get(i23);
                                                plVar4 = (pl) obj2;
                                                if (!(plVar4.a instanceof yu8) && rl.b(0, length, plVar4.b, plVar4.c)) {
                                                    arrayList6.add(obj2);
                                                }
                                            }
                                        } else {
                                            arrayList6 = arrayList5;
                                        }
                                        size4 = arrayList6.size();
                                        for (i15 = 0; i15 < size4; i15++) {
                                            pl plVar6 = (pl) arrayList6.get(i15);
                                            yu8Var = (yu8) plVar6.a;
                                            i21 = plVar6.b;
                                            i22 = plVar6.c;
                                            if (yu8Var instanceof yu8) {
                                                spannableString3.setSpan(new TtsSpan.VerbatimBuilder(yu8Var.a).build(), i21, i22, 33);
                                            } else {
                                                b61.c();
                                            }
                                        }
                                        int length2 = str5.length();
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size7 = list4.size();
                                            for (i20 = 0; i20 < size7; i20++) {
                                                Object obj3 = list4.get(i20);
                                                plVar3 = (pl) obj3;
                                                if (!(plVar3.a instanceof fq8) && rl.b(0, length2, plVar3.b, plVar3.c)) {
                                                    arrayList5.add(obj3);
                                                }
                                            }
                                        }
                                        size5 = arrayList5.size();
                                        for (i16 = 0; i16 < size5; i16++) {
                                            pl plVar7 = (pl) arrayList5.get(i16);
                                            fq8Var = (fq8) plVar7.a;
                                            int i36 = plVar7.b;
                                            int i37 = plVar7.c;
                                            weakHashMap3 = (WeakHashMap) zv7Var.X;
                                            uRLSpan2 = weakHashMap3.get(fq8Var);
                                            if (uRLSpan2 == null) {
                                                uRLSpan2 = new URLSpan(fq8Var.a);
                                                weakHashMap3.put(fq8Var, uRLSpan2);
                                            }
                                            spannableString3.setSpan((URLSpan) uRLSpan2, i36, i37, 33);
                                        }
                                        listA = qlVarC.a(str5.length());
                                        size6 = listA.size();
                                        for (i17 = 0; i17 < size6; i17++) {
                                            plVar = (pl) listA.get(i17);
                                            i18 = plVar.b;
                                            obj = plVar.a;
                                            i19 = plVar.c;
                                            if (i18 != i19) {
                                                pa4Var = (pa4) obj;
                                                if (pa4Var instanceof oa4) {
                                                    obj.getClass();
                                                    oa4Var = (oa4) obj;
                                                    plVar2 = new pl(i18, i19, oa4Var);
                                                    weakHashMap2 = (WeakHashMap) zv7Var.Y;
                                                    uRLSpan = weakHashMap2.get(plVar2);
                                                    if (uRLSpan == null) {
                                                        uRLSpan = new URLSpan(oa4Var.a);
                                                        weakHashMap2.put(plVar2, uRLSpan);
                                                    }
                                                    spannableString3.setSpan((URLSpan) uRLSpan, i18, i19, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) zv7Var.Z;
                                                    gz0Var = weakHashMap.get(plVar);
                                                    if (gz0Var == null) {
                                                        gz0Var = new gz0(pa4Var);
                                                        weakHashMap.put(plVar, gz0Var);
                                                    }
                                                    spannableString3.setSpan((ClickableSpan) gz0Var, i18, i19, 33);
                                                }
                                            }
                                        }
                                        spannableString = (SpannableString) gc.P(spannableString3);
                                    } else {
                                        tz4Var = tz4Var;
                                        t07Var2 = t07Var;
                                        kl6Var2 = kl6Var;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        s05Var2 = s05Var;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        h4Var2 = h4Var;
                                        y07Var = y07Var5;
                                        spannableString = null;
                                    }
                                    h4Var3 = h4Var2;
                                    h4Var3.x(spannableString);
                                    e17Var = c17.O;
                                    s05Var3 = s05Var2;
                                    if (s05Var3.c(e17Var)) {
                                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                                        accessibilityNodeInfo5.setContentInvalid(true);
                                        objG30 = s05Var3.g(e17Var);
                                        if (objG30 == null) {
                                            objG30 = null;
                                        }
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo4.setError((CharSequence) objG30);
                                    } else {
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                                    }
                                    h4Var3.w(vr3.B(y07Var, resources));
                                    accessibilityNodeInfo4.setCheckable(vr3.A(y07Var));
                                    objG2 = s05Var3.g(c17.L);
                                    if (objG2 == null) {
                                        objG2 = null;
                                    }
                                    ib8Var = (ib8) objG2;
                                    if (ib8Var != null) {
                                        if (ib8Var == ib8.X) {
                                            accessibilityNodeInfo4.setChecked(true);
                                        } else if (ib8Var == ib8.Y) {
                                            accessibilityNodeInfo4.setChecked(false);
                                        }
                                    }
                                    objG3 = s05Var3.g(c17.K);
                                    if (objG3 == null) {
                                        objG3 = null;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (kl6Var2 == null) {
                                            kl6Var3 = kl6Var2;
                                            i5 = 4;
                                        } else {
                                            kl6Var3 = kl6Var2;
                                            i5 = 4;
                                            if (kl6Var3.a == 4) {
                                                accessibilityNodeInfo4.setSelected(zBooleanValue2);
                                            }
                                        }
                                        accessibilityNodeInfo4.setChecked(zBooleanValue2);
                                    } else {
                                        kl6Var3 = kl6Var2;
                                        i5 = 4;
                                    }
                                    t07Var3 = t07Var2;
                                    if (t07Var3.Z || y07Var.i((4 & 1) != 0 ? !y07Var.b : false, (4 & 2) == 0).isEmpty()) {
                                        objG4 = s05Var3.g(c17.a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) wv0.t0(list);
                                        } else {
                                            str = null;
                                        }
                                        h4Var3.p(str);
                                    }
                                    objG5 = s05Var3.g(c17.A);
                                    if (objG5 == null) {
                                        objG5 = null;
                                    }
                                    str2 = (String) objG5;
                                    if (str2 != null) {
                                        y07VarL4 = y07Var;
                                        while (true) {
                                            if (y07VarL4 != null) {
                                                t07Var4 = y07VarL4.d;
                                                e17Var5 = km4.i;
                                                if (t07Var4.X.c(e17Var5)) {
                                                    zBooleanValue = ((Boolean) t07Var4.c(e17Var5)).booleanValue();
                                                } else {
                                                    y07VarL4 = y07VarL4.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            accessibilityNodeInfo5.setViewIdResourceName(str2);
                                        }
                                    }
                                    objG6 = s05Var3.g(c17.h);
                                    if (objG6 == null) {
                                        objG6 = null;
                                    }
                                    if (((dn8) objG6) != null) {
                                        h4Var3.q(true);
                                    }
                                    objG7 = s05Var3.g(c17.i);
                                    if (objG7 == null) {
                                        objG7 = null;
                                    }
                                    if (((dn8) objG7) != null) {
                                        h4Var3.y();
                                    }
                                    i6 = i;
                                    if (i6 != -1) {
                                        iD3 = tz4Var.d(y07Var.f);
                                        if (iD3 != -1) {
                                            accessibilityNodeInfo5.setDrawingOrder(iD3);
                                        }
                                    }
                                    accessibilityNodeInfo5.setPassword(s05Var3.c(c17.N));
                                    objG8 = s05Var3.g(c17.Q);
                                    if (objG8 == null) {
                                        objG8 = null;
                                    }
                                    bool2 = Boolean.TRUE;
                                    accessibilityNodeInfo5.setEditable(dh3.f(objG8, bool2));
                                    objG9 = s05Var3.g(c17.R);
                                    if (objG9 == null) {
                                        objG9 = null;
                                    }
                                    num = (Integer) objG9;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                                    accessibilityNodeInfo4.setEnabled(vr3.t(y07Var));
                                    e17Var2 = c17.l;
                                    accessibilityNodeInfo4.setFocusable(s05Var3.c(e17Var2));
                                    if (accessibilityNodeInfo5.isFocusable()) {
                                        accessibilityNodeInfo4.setFocused(((Boolean) t07Var3.c(e17Var2)).booleanValue());
                                        if (accessibilityNodeInfo5.isFocused()) {
                                            h4Var3.a(2);
                                            gcVar = gcVar2;
                                            gcVar.n0 = i6;
                                        } else {
                                            gcVar = gcVar2;
                                            z2 = true;
                                            h4Var3.a(1);
                                        }
                                        accessibilityNodeInfo4.setVisibleToUser(jm4.L(y07Var) ^ z2);
                                        if (y07Var.n()) {
                                            y07VarL2 = y07Var.l();
                                            y07VarL2.getClass();
                                        } else {
                                            y07VarL2 = y07Var;
                                        }
                                        if (y07VarL2.m().h()) {
                                            accessibilityNodeInfo4.setVisibleToUser(false);
                                        }
                                        objG10 = s05Var3.g(c17.k);
                                        if (objG10 == null) {
                                            objG10 = null;
                                        }
                                        if (((uc4) objG10) != null) {
                                            accessibilityNodeInfo5.setLiveRegion(2);
                                        }
                                        accessibilityNodeInfo4.setClickable(false);
                                        objG11 = s05Var3.g(s07.b);
                                        if (objG11 == null) {
                                            objG11 = null;
                                        }
                                        q3Var = (q3) objG11;
                                        if (q3Var != null) {
                                            objG29 = s05Var3.g(c17.K);
                                            if (objG29 == null) {
                                                objG29 = null;
                                            }
                                            boolean zF4 = dh3.f(objG29, bool2);
                                            z4 = (kl6Var3 == null && kl6Var3.a == 4) || (kl6Var3 != null && kl6Var3.a == 3);
                                            if (z4 || (z4 && !zF4)) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            accessibilityNodeInfo4.setClickable(z5);
                                            if (vr3.t(y07Var) && accessibilityNodeInfo5.isClickable()) {
                                                h4Var3.b(new a4(16, q3Var.a));
                                            }
                                        }
                                        accessibilityNodeInfo4.setLongClickable(false);
                                        objG12 = s05Var3.g(s07.c);
                                        if (objG12 == null) {
                                            objG12 = null;
                                        }
                                        q3Var2 = (q3) objG12;
                                        if (q3Var2 != null) {
                                            accessibilityNodeInfo4.setLongClickable(true);
                                            if (vr3.t(y07Var)) {
                                                h4Var3.b(new a4(32, q3Var2.a));
                                            }
                                        }
                                        objG13 = s05Var3.g(s07.q);
                                        if (objG13 == null) {
                                            objG13 = null;
                                        }
                                        q3Var3 = (q3) objG13;
                                        if (q3Var3 != null) {
                                            h4Var3.b(new a4(Http2.INITIAL_MAX_FRAME_SIZE, q3Var3.a));
                                        }
                                        if (vr3.t(y07Var)) {
                                            objG25 = s05Var3.g(s07.k);
                                            if (objG25 == null) {
                                                objG25 = null;
                                            }
                                            q3Var9 = (q3) objG25;
                                            if (q3Var9 != null) {
                                                h4Var3.b(new a4(2097152, q3Var9.a));
                                            }
                                            objG26 = s05Var3.g(s07.p);
                                            if (objG26 == null) {
                                                objG26 = null;
                                            }
                                            q3Var10 = (q3) objG26;
                                            if (q3Var10 != null) {
                                                h4Var3.b(new a4(R.id.accessibilityActionImeEnter, q3Var10.a));
                                            }
                                            objG27 = s05Var3.g(s07.r);
                                            if (objG27 == null) {
                                                objG27 = null;
                                            }
                                            q3Var11 = (q3) objG27;
                                            if (q3Var11 != null) {
                                                h4Var3.b(new a4(DnsOverHttps.MAX_RESPONSE_SIZE, q3Var11.a));
                                            }
                                            objG28 = s05Var3.g(s07.s);
                                            if (objG28 == null) {
                                                objG28 = null;
                                            }
                                            q3Var12 = (q3) objG28;
                                            if (q3Var12 != null && accessibilityNodeInfo5.isFocused()) {
                                                primaryClipDescription = ((dq) androidComposeView2.getClipboardManager()).v().getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    h4Var3.b(new a4(32768, q3Var12.a));
                                                }
                                            }
                                        }
                                        strT = gc.t(y07Var);
                                        if (strT != null && strT.length() != 0) {
                                            accessibilityNodeInfo5.setTextSelection(gcVar.r(y07Var), gcVar.q(y07Var));
                                            objG22 = s05Var3.g(s07.j);
                                            if (objG22 == null) {
                                                objG22 = null;
                                            }
                                            q3Var8 = (q3) objG22;
                                            if (q3Var8 != null) {
                                                str4 = q3Var8.a;
                                            } else {
                                                str4 = null;
                                            }
                                            h4Var3.b(new a4(131072, str4));
                                            h4Var3.a(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                                            h4Var3.a(512);
                                            accessibilityNodeInfo4.setMovementGranularities(11);
                                            objG23 = s05Var3.g(c17.a);
                                            if (objG23 == null) {
                                                objG23 = null;
                                            }
                                            list3 = (List) objG23;
                                            if ((list3 != null || list3.isEmpty()) && s05Var3.c(s07.a) && (!s05Var3.c(c17.G) || dh3.f(g33.x(t07Var3, e17Var2), bool2))) {
                                                layoutNodeW = layoutNode2.w();
                                                while (true) {
                                                    if (layoutNodeW == null) {
                                                        layoutNodeW = null;
                                                    } else {
                                                        t07VarY2 = layoutNodeW.y();
                                                        if (t07VarY2 == null && t07VarY2.Z) {
                                                            if (t07VarY2.X.c(c17.G)) {
                                                            }
                                                        }
                                                        layoutNodeW = layoutNodeW.w();
                                                    }
                                                }
                                                if (layoutNodeW == null) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                } else {
                                                    t07VarY = layoutNodeW.y();
                                                    if (t07VarY != null) {
                                                        objG24 = t07VarY.X.g(c17.l);
                                                        if (objG24 == null) {
                                                            objG24 = null;
                                                        }
                                                        zF = dh3.f(objG24, Boolean.TRUE);
                                                    } else {
                                                        zF = false;
                                                    }
                                                    if (zF) {
                                                        accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                    }
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            arrayList3 = new ArrayList();
                                            arrayList3.add("androidx.compose.ui.semantics.id");
                                            charSequenceG = h4Var3.g();
                                            if (charSequenceG != null && charSequenceG.length() != 0 && s05Var3.c(s07.a)) {
                                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (s05Var3.c(c17.A)) {
                                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (s05Var3.c(c17.S)) {
                                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            h4Var3.i(arrayList3);
                                        }
                                        qw5Var = (qw5) g33.x(t07Var3, c17.c);
                                        if (qw5Var != null) {
                                            f = qw5Var.a;
                                            uu0Var = qw5Var.b;
                                            e17Var4 = s07.i;
                                            if (s05Var3.c(e17Var4)) {
                                                h4Var3.m("android.widget.SeekBar");
                                            } else {
                                                h4Var3.m("android.widget.ProgressBar");
                                            }
                                            if (qw5Var != qw5.d) {
                                                accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, uu0Var.X, uu0Var.Y, f));
                                            }
                                            if (s05Var3.c(e17Var4) && vr3.t(y07Var)) {
                                                f2 = uu0Var.Y;
                                                f3 = uu0Var.X;
                                                if (f2 < f3) {
                                                    f2 = f3;
                                                }
                                                if (f < f2) {
                                                    h4Var3.b(a4.j);
                                                }
                                                f4 = uu0Var.Y;
                                                if (f3 > f4) {
                                                    f3 = f4;
                                                }
                                                if (f > f3) {
                                                    h4Var3.b(a4.k);
                                                }
                                            }
                                        }
                                        if (vr3.t(y07Var) && (q3Var7 = (q3) g33.x(t07Var3, s07.i)) != null) {
                                            h4Var3.b(new a4(R.id.accessibilityActionSetProgress, q3Var7.a));
                                        }
                                        yn0.e0(h4Var3, y07Var);
                                        objG14 = y07Var.k().X.g(c17.g);
                                        if (objG14 == null) {
                                            objG14 = null;
                                        }
                                        if (objG14 == null) {
                                            y07VarL3 = y07Var.l();
                                            if (y07VarL3 != null) {
                                                objG19 = y07VarL3.k().X.g(c17.e);
                                                if (objG19 == null) {
                                                    objG19 = null;
                                                }
                                                if (objG19 != null) {
                                                    objG20 = y07VarL3.k().X.g(c17.f);
                                                    if (objG20 == null) {
                                                        objG20 = null;
                                                    }
                                                    sv0Var = (sv0) objG20;
                                                    if (sv0Var != null || (sv0Var.a >= 0 && sv0Var.b >= 0)) {
                                                        if (y07Var.k().X.c(c17.K)) {
                                                            arrayList2 = new ArrayList();
                                                            listI2 = y07VarL3.i((4 & 1) != 0 ? !y07VarL3.b : false, (4 & 2) == 0);
                                                            size3 = listI2.size();
                                                            i13 = 0;
                                                            for (i12 = 0; i12 < size3; i12++) {
                                                                y07Var2 = (y07) listI2.get(i12);
                                                                if (y07Var2.k().X.c(c17.K)) {
                                                                    arrayList2.add(y07Var2);
                                                                    if (y07Var2.c.x() < y07Var.c.x()) {
                                                                        i13++;
                                                                    }
                                                                }
                                                            }
                                                            if (!arrayList2.isEmpty()) {
                                                                zT = yn0.t(arrayList2);
                                                                if (zT) {
                                                                    i14 = 0;
                                                                } else {
                                                                    i14 = i13;
                                                                }
                                                                if (!zT) {
                                                                    i13 = 0;
                                                                }
                                                                objG21 = y07Var.k().X.g(c17.K);
                                                                if (objG21 == null) {
                                                                    objG21 = Boolean.FALSE;
                                                                }
                                                                h4Var3.o(g4.a(i14, ((Boolean) objG21).booleanValue(), 1, i13, 1));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            c2.m();
                                        }
                                        jx6Var = (jx6) g33.x(t07Var3, c17.v);
                                        q3 q3Var13 = (q3) g33.x(t07Var3, s07.d);
                                        if (jx6Var != null && q3Var13 != null) {
                                            objG17 = y07Var.k().X.g(c17.f);
                                            if (objG17 == null) {
                                                objG17 = null;
                                            }
                                            if (objG17 == null) {
                                                objG18 = y07Var.k().X.g(c17.e);
                                                if (objG18 == null) {
                                                    objG18 = null;
                                                }
                                                if (objG18 == null) {
                                                    h4Var3.m("android.widget.HorizontalScrollView");
                                                }
                                            }
                                            if (((Number) jx6Var.b.invoke()).floatValue() > 0.0f) {
                                                h4Var3.u(true);
                                            }
                                            if (vr3.t(y07Var)) {
                                                z3 = gc.z(jx6Var);
                                                z24Var = z24.Y;
                                                if (z3) {
                                                    h4Var3.b(a4.j);
                                                    if (layoutNode.B0 == z24Var) {
                                                        layoutNode = layoutNode2;
                                                        a4Var2 = a4.p;
                                                    } else {
                                                        layoutNode = layoutNode2;
                                                        a4Var2 = a4.r;
                                                    }
                                                    h4Var3.b(a4Var2);
                                                } else {
                                                    layoutNode = layoutNode2;
                                                }
                                                if (gc.y(jx6Var)) {
                                                    h4Var3.b(a4.k);
                                                    if (layoutNode.B0 == z24Var) {
                                                        a4Var = a4.r;
                                                    } else {
                                                        a4Var = a4.p;
                                                    }
                                                    h4Var3.b(a4Var);
                                                }
                                            }
                                        }
                                        jx6Var2 = (jx6) g33.x(t07Var3, c17.w);
                                        if (jx6Var2 != null && q3Var13 != null) {
                                            objG15 = y07Var.k().X.g(c17.f);
                                            if (objG15 == null) {
                                                objG15 = null;
                                            }
                                            if (objG15 == null) {
                                                objG16 = y07Var.k().X.g(c17.e);
                                                if (objG16 == null) {
                                                    objG16 = null;
                                                }
                                                if (objG16 == null) {
                                                    h4Var3.m("android.widget.ScrollView");
                                                }
                                            }
                                            if (((Number) jx6Var2.b.invoke()).floatValue() > 0.0f) {
                                                h4Var3.u(true);
                                            }
                                            if (vr3.t(y07Var)) {
                                                if (gc.z(jx6Var2)) {
                                                    h4Var3.b(a4.j);
                                                    h4Var3.b(a4.q);
                                                }
                                                if (gc.y(jx6Var2)) {
                                                    h4Var3.b(a4.k);
                                                    h4Var3.b(a4.o);
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            dh3.d(h4Var3, y07Var);
                                        }
                                        h4Var3.s((CharSequence) g33.x(t07Var3, c17.d));
                                        if (vr3.t(y07Var)) {
                                            q3Var4 = (q3) g33.x(t07Var3, s07.t);
                                            if (q3Var4 != null) {
                                                h4Var3.b(new a4(262144, q3Var4.a));
                                            }
                                            q3Var5 = (q3) g33.x(t07Var3, s07.u);
                                            if (q3Var5 != null) {
                                                h4Var3.b(new a4(524288, q3Var5.a));
                                            }
                                            q3Var6 = (q3) g33.x(t07Var3, s07.v);
                                            if (q3Var6 != null) {
                                                h4Var3.b(new a4(1048576, q3Var6.a));
                                            }
                                            e17Var3 = s07.x;
                                            if (s05Var3.c(e17Var3)) {
                                                list2 = (List) t07Var3.c(e17Var3);
                                                size2 = list2.size();
                                                uz4Var = gc.P0;
                                                i7 = uz4Var.b;
                                                if (size2 < i7) {
                                                    ue7 ue7Var4 = new ue7(0);
                                                    f05 f05VarA = g85.a();
                                                    ue7Var3 = ue7Var2;
                                                    if (w45.k(ue7Var3.Z, i6, ue7Var3.X) >= 0) {
                                                        f05Var = (f05) x97.t(ue7Var3, i6);
                                                        iArr = uz4Var.a;
                                                        i8 = uz4Var.b;
                                                        iArrCopyOf = new int[16];
                                                        i9 = 0;
                                                        i10 = 0;
                                                        while (i9 < i8) {
                                                            int i38 = iArr[i9];
                                                            int i39 = i8;
                                                            i11 = i10 + 1;
                                                            int i40 = i9;
                                                            if (iArrCopyOf.length < i11) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                            }
                                                            iArrCopyOf[i10] = i38;
                                                            i9 = i40 + 1;
                                                            i10 = i11;
                                                            i8 = i39;
                                                        }
                                                        arrayList = new ArrayList();
                                                        if (list2.size() <= 0) {
                                                            p61.x(list2.get(0));
                                                            f05Var.getClass();
                                                            throw null;
                                                        }
                                                        if (arrayList.size() > 0) {
                                                            p61.x(arrayList.get(0));
                                                            if (i10 <= 0) {
                                                                int i41 = iArrCopyOf[0];
                                                                throw null;
                                                            }
                                                            kp5.k("Index must be between 0 and size");
                                                        }
                                                    } else if (list2.size() > 0) {
                                                        p61.x(list2.get(0));
                                                        uz4Var.c(0);
                                                        throw null;
                                                    }
                                                    gcVar.t0.d(i6, ue7Var4);
                                                    ue7Var3.d(i6, f05VarA);
                                                } else {
                                                    bt.i(ie2.h("Can't have more than ", i7, " custom actions for one widget"));
                                                }
                                            }
                                        }
                                        h4Var3.t(vr3.L(y07Var, resources));
                                        iD = gcVar.D0.d(i6);
                                        if (iD != -1) {
                                            gv3.V(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                            androidComposeView = androidComposeView2;
                                            accessibilityNodeInfo5.setTraversalBefore(androidComposeView, iD);
                                            gcVar.j(i6, h4Var3, gcVar.F0, null);
                                        } else {
                                            androidComposeView = androidComposeView2;
                                        }
                                        iD2 = gcVar.E0.d(i6);
                                        if (iD2 != -1) {
                                            gv3.V(androidComposeView.getAndroidViewsHandler$ui(), iD2);
                                        }
                                        str3 = (String) g33.x(t07Var3, km4.j);
                                        if (str3 != null) {
                                            h4Var3.m(str3);
                                        }
                                        h4Var4 = h4Var3;
                                    } else {
                                        gcVar = gcVar2;
                                    }
                                    z2 = true;
                                    accessibilityNodeInfo4.setVisibleToUser(jm4.L(y07Var) ^ z2);
                                    if (y07Var.n()) {
                                        y07VarL2 = y07Var.l();
                                        y07VarL2.getClass();
                                    } else {
                                        y07VarL2 = y07Var;
                                    }
                                    if (y07VarL2.m().h()) {
                                        accessibilityNodeInfo4.setVisibleToUser(false);
                                    }
                                    objG10 = s05Var3.g(c17.k);
                                    if (objG10 == null) {
                                        objG10 = null;
                                    }
                                    if (((uc4) objG10) != null) {
                                        accessibilityNodeInfo5.setLiveRegion(2);
                                    }
                                    accessibilityNodeInfo4.setClickable(false);
                                    objG11 = s05Var3.g(s07.b);
                                    if (objG11 == null) {
                                        objG11 = null;
                                    }
                                    q3Var = (q3) objG11;
                                    if (q3Var != null) {
                                        objG29 = s05Var3.g(c17.K);
                                        if (objG29 == null) {
                                            objG29 = null;
                                        }
                                        boolean zF5 = dh3.f(objG29, bool2);
                                        if (kl6Var3 == null) {
                                        }
                                        if (z4) {
                                            z5 = true;
                                        } else {
                                            z5 = true;
                                        }
                                        accessibilityNodeInfo4.setClickable(z5);
                                        if (vr3.t(y07Var)) {
                                            h4Var3.b(new a4(16, q3Var.a));
                                        }
                                    }
                                    accessibilityNodeInfo4.setLongClickable(false);
                                    objG12 = s05Var3.g(s07.c);
                                    if (objG12 == null) {
                                        objG12 = null;
                                    }
                                    q3Var2 = (q3) objG12;
                                    if (q3Var2 != null) {
                                        accessibilityNodeInfo4.setLongClickable(true);
                                        if (vr3.t(y07Var)) {
                                            h4Var3.b(new a4(32, q3Var2.a));
                                        }
                                    }
                                    objG13 = s05Var3.g(s07.q);
                                    if (objG13 == null) {
                                        objG13 = null;
                                    }
                                    q3Var3 = (q3) objG13;
                                    if (q3Var3 != null) {
                                        h4Var3.b(new a4(Http2.INITIAL_MAX_FRAME_SIZE, q3Var3.a));
                                    }
                                    if (vr3.t(y07Var)) {
                                        objG25 = s05Var3.g(s07.k);
                                        if (objG25 == null) {
                                            objG25 = null;
                                        }
                                        q3Var9 = (q3) objG25;
                                        if (q3Var9 != null) {
                                            h4Var3.b(new a4(2097152, q3Var9.a));
                                        }
                                        objG26 = s05Var3.g(s07.p);
                                        if (objG26 == null) {
                                            objG26 = null;
                                        }
                                        q3Var10 = (q3) objG26;
                                        if (q3Var10 != null) {
                                            h4Var3.b(new a4(R.id.accessibilityActionImeEnter, q3Var10.a));
                                        }
                                        objG27 = s05Var3.g(s07.r);
                                        if (objG27 == null) {
                                            objG27 = null;
                                        }
                                        q3Var11 = (q3) objG27;
                                        if (q3Var11 != null) {
                                            h4Var3.b(new a4(DnsOverHttps.MAX_RESPONSE_SIZE, q3Var11.a));
                                        }
                                        objG28 = s05Var3.g(s07.s);
                                        if (objG28 == null) {
                                            objG28 = null;
                                        }
                                        q3Var12 = (q3) objG28;
                                        if (q3Var12 != null) {
                                            primaryClipDescription = ((dq) androidComposeView2.getClipboardManager()).v().getPrimaryClipDescription();
                                            if (primaryClipDescription != null) {
                                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                            } else {
                                                zHasMimeType = false;
                                            }
                                            if (zHasMimeType) {
                                                h4Var3.b(new a4(32768, q3Var12.a));
                                            }
                                        }
                                    }
                                    strT = gc.t(y07Var);
                                    if (strT != null) {
                                        accessibilityNodeInfo5.setTextSelection(gcVar.r(y07Var), gcVar.q(y07Var));
                                        objG22 = s05Var3.g(s07.j);
                                        if (objG22 == null) {
                                            objG22 = null;
                                        }
                                        q3Var8 = (q3) objG22;
                                        if (q3Var8 != null) {
                                            str4 = q3Var8.a;
                                        } else {
                                            str4 = null;
                                        }
                                        h4Var3.b(new a4(131072, str4));
                                        h4Var3.a(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                                        h4Var3.a(512);
                                        accessibilityNodeInfo4.setMovementGranularities(11);
                                        objG23 = s05Var3.g(c17.a);
                                        if (objG23 == null) {
                                            objG23 = null;
                                        }
                                        list3 = (List) objG23;
                                        if (list3 != null) {
                                            layoutNodeW = layoutNode2.w();
                                            while (true) {
                                                if (layoutNodeW == null) {
                                                    layoutNodeW = null;
                                                } else {
                                                    t07VarY2 = layoutNodeW.y();
                                                    if (t07VarY2 == null) {
                                                    }
                                                    layoutNodeW = layoutNodeW.w();
                                                }
                                            }
                                            if (layoutNodeW == null) {
                                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                            } else {
                                                t07VarY = layoutNodeW.y();
                                                if (t07VarY != null) {
                                                    objG24 = t07VarY.X.g(c17.l);
                                                    if (objG24 == null) {
                                                        objG24 = null;
                                                    }
                                                    zF = dh3.f(objG24, Boolean.TRUE);
                                                } else {
                                                    zF = false;
                                                }
                                                if (zF) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                }
                                            }
                                        } else {
                                            layoutNodeW = layoutNode2.w();
                                            while (true) {
                                                if (layoutNodeW == null) {
                                                    layoutNodeW = null;
                                                } else {
                                                    t07VarY2 = layoutNodeW.y();
                                                    if (t07VarY2 == null) {
                                                    }
                                                    layoutNodeW = layoutNodeW.w();
                                                }
                                            }
                                            if (layoutNodeW == null) {
                                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                            } else {
                                                t07VarY = layoutNodeW.y();
                                                if (t07VarY != null) {
                                                    objG24 = t07VarY.X.g(c17.l);
                                                    if (objG24 == null) {
                                                        objG24 = null;
                                                    }
                                                    zF = dh3.f(objG24, Boolean.TRUE);
                                                } else {
                                                    zF = false;
                                                }
                                                if (zF) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        arrayList3 = new ArrayList();
                                        arrayList3.add("androidx.compose.ui.semantics.id");
                                        charSequenceG = h4Var3.g();
                                        if (charSequenceG != null) {
                                            arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (s05Var3.c(c17.A)) {
                                            arrayList3.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (s05Var3.c(c17.S)) {
                                            arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        h4Var3.i(arrayList3);
                                    }
                                    qw5Var = (qw5) g33.x(t07Var3, c17.c);
                                    if (qw5Var != null) {
                                        f = qw5Var.a;
                                        uu0Var = qw5Var.b;
                                        e17Var4 = s07.i;
                                        if (s05Var3.c(e17Var4)) {
                                            h4Var3.m("android.widget.SeekBar");
                                        } else {
                                            h4Var3.m("android.widget.ProgressBar");
                                        }
                                        if (qw5Var != qw5.d) {
                                            accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, uu0Var.X, uu0Var.Y, f));
                                        }
                                        if (s05Var3.c(e17Var4)) {
                                            f2 = uu0Var.Y;
                                            f3 = uu0Var.X;
                                            if (f2 < f3) {
                                                f2 = f3;
                                            }
                                            if (f < f2) {
                                                h4Var3.b(a4.j);
                                            }
                                            f4 = uu0Var.Y;
                                            if (f3 > f4) {
                                                f3 = f4;
                                            }
                                            if (f > f3) {
                                                h4Var3.b(a4.k);
                                            }
                                        }
                                    }
                                    if (vr3.t(y07Var)) {
                                        h4Var3.b(new a4(R.id.accessibilityActionSetProgress, q3Var7.a));
                                    }
                                    yn0.e0(h4Var3, y07Var);
                                    objG14 = y07Var.k().X.g(c17.g);
                                    if (objG14 == null) {
                                        objG14 = null;
                                    }
                                    if (objG14 == null) {
                                        y07VarL3 = y07Var.l();
                                        if (y07VarL3 != null) {
                                            objG19 = y07VarL3.k().X.g(c17.e);
                                            if (objG19 == null) {
                                                objG19 = null;
                                            }
                                            if (objG19 != null) {
                                                objG20 = y07VarL3.k().X.g(c17.f);
                                                if (objG20 == null) {
                                                    objG20 = null;
                                                }
                                                sv0Var = (sv0) objG20;
                                                if (sv0Var != null) {
                                                    if (y07Var.k().X.c(c17.K)) {
                                                        arrayList2 = new ArrayList();
                                                        listI2 = y07VarL3.i((4 & 1) != 0 ? !y07VarL3.b : false, (4 & 2) == 0);
                                                        size3 = listI2.size();
                                                        i13 = 0;
                                                        while (i12 < size3) {
                                                            y07Var2 = (y07) listI2.get(i12);
                                                            if (y07Var2.k().X.c(c17.K)) {
                                                                arrayList2.add(y07Var2);
                                                                if (y07Var2.c.x() < y07Var.c.x()) {
                                                                    i13++;
                                                                }
                                                            }
                                                        }
                                                        if (!arrayList2.isEmpty()) {
                                                            zT = yn0.t(arrayList2);
                                                            if (zT) {
                                                                i14 = 0;
                                                            } else {
                                                                i14 = i13;
                                                            }
                                                            if (!zT) {
                                                                i13 = 0;
                                                            }
                                                            objG21 = y07Var.k().X.g(c17.K);
                                                            if (objG21 == null) {
                                                                objG21 = Boolean.FALSE;
                                                            }
                                                            h4Var3.o(g4.a(i14, ((Boolean) objG21).booleanValue(), 1, i13, 1));
                                                        }
                                                    }
                                                } else if (y07Var.k().X.c(c17.K)) {
                                                    arrayList2 = new ArrayList();
                                                    listI2 = y07VarL3.i((4 & 1) != 0 ? !y07VarL3.b : false, (4 & 2) == 0);
                                                    size3 = listI2.size();
                                                    i13 = 0;
                                                    while (i12 < size3) {
                                                        y07Var2 = (y07) listI2.get(i12);
                                                        if (y07Var2.k().X.c(c17.K)) {
                                                            arrayList2.add(y07Var2);
                                                            if (y07Var2.c.x() < y07Var.c.x()) {
                                                                i13++;
                                                            }
                                                        }
                                                    }
                                                    if (!arrayList2.isEmpty()) {
                                                        zT = yn0.t(arrayList2);
                                                        if (zT) {
                                                            i14 = 0;
                                                        } else {
                                                            i14 = i13;
                                                        }
                                                        if (!zT) {
                                                            i13 = 0;
                                                        }
                                                        objG21 = y07Var.k().X.g(c17.K);
                                                        if (objG21 == null) {
                                                            objG21 = Boolean.FALSE;
                                                        }
                                                        h4Var3.o(g4.a(i14, ((Boolean) objG21).booleanValue(), 1, i13, 1));
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        c2.m();
                                    }
                                    jx6Var = (jx6) g33.x(t07Var3, c17.v);
                                    q3 q3Var14 = (q3) g33.x(t07Var3, s07.d);
                                    if (jx6Var != null) {
                                        objG17 = y07Var.k().X.g(c17.f);
                                        if (objG17 == null) {
                                            objG17 = null;
                                        }
                                        if (objG17 == null) {
                                            objG18 = y07Var.k().X.g(c17.e);
                                            if (objG18 == null) {
                                                objG18 = null;
                                            }
                                            if (objG18 == null) {
                                                h4Var3.m("android.widget.HorizontalScrollView");
                                            }
                                        }
                                        if (((Number) jx6Var.b.invoke()).floatValue() > 0.0f) {
                                            h4Var3.u(true);
                                        }
                                        if (vr3.t(y07Var)) {
                                            z3 = gc.z(jx6Var);
                                            z24Var = z24.Y;
                                            if (z3) {
                                                h4Var3.b(a4.j);
                                                if (layoutNode.B0 == z24Var) {
                                                    layoutNode = layoutNode2;
                                                    a4Var2 = a4.p;
                                                } else {
                                                    layoutNode = layoutNode2;
                                                    a4Var2 = a4.r;
                                                }
                                                h4Var3.b(a4Var2);
                                            } else {
                                                layoutNode = layoutNode2;
                                            }
                                            if (gc.y(jx6Var)) {
                                                h4Var3.b(a4.k);
                                                if (layoutNode.B0 == z24Var) {
                                                    a4Var = a4.r;
                                                } else {
                                                    a4Var = a4.p;
                                                }
                                                h4Var3.b(a4Var);
                                            }
                                        }
                                    }
                                    jx6Var2 = (jx6) g33.x(t07Var3, c17.w);
                                    if (jx6Var2 != null) {
                                        objG15 = y07Var.k().X.g(c17.f);
                                        if (objG15 == null) {
                                            objG15 = null;
                                        }
                                        if (objG15 == null) {
                                            objG16 = y07Var.k().X.g(c17.e);
                                            if (objG16 == null) {
                                                objG16 = null;
                                            }
                                            if (objG16 == null) {
                                                h4Var3.m("android.widget.ScrollView");
                                            }
                                        }
                                        if (((Number) jx6Var2.b.invoke()).floatValue() > 0.0f) {
                                            h4Var3.u(true);
                                        }
                                        if (vr3.t(y07Var)) {
                                            if (gc.z(jx6Var2)) {
                                                h4Var3.b(a4.j);
                                                h4Var3.b(a4.q);
                                            }
                                            if (gc.y(jx6Var2)) {
                                                h4Var3.b(a4.k);
                                                h4Var3.b(a4.o);
                                            }
                                        }
                                    }
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        dh3.d(h4Var3, y07Var);
                                    }
                                    h4Var3.s((CharSequence) g33.x(t07Var3, c17.d));
                                    if (vr3.t(y07Var)) {
                                        q3Var4 = (q3) g33.x(t07Var3, s07.t);
                                        if (q3Var4 != null) {
                                            h4Var3.b(new a4(262144, q3Var4.a));
                                        }
                                        q3Var5 = (q3) g33.x(t07Var3, s07.u);
                                        if (q3Var5 != null) {
                                            h4Var3.b(new a4(524288, q3Var5.a));
                                        }
                                        q3Var6 = (q3) g33.x(t07Var3, s07.v);
                                        if (q3Var6 != null) {
                                            h4Var3.b(new a4(1048576, q3Var6.a));
                                        }
                                        e17Var3 = s07.x;
                                        if (s05Var3.c(e17Var3)) {
                                            list2 = (List) t07Var3.c(e17Var3);
                                            size2 = list2.size();
                                            uz4Var = gc.P0;
                                            i7 = uz4Var.b;
                                            if (size2 < i7) {
                                                ue7 ue7Var5 = new ue7(0);
                                                f05 f05VarA2 = g85.a();
                                                ue7Var3 = ue7Var2;
                                                if (w45.k(ue7Var3.Z, i6, ue7Var3.X) >= 0) {
                                                    f05Var = (f05) x97.t(ue7Var3, i6);
                                                    iArr = uz4Var.a;
                                                    i8 = uz4Var.b;
                                                    iArrCopyOf = new int[16];
                                                    i9 = 0;
                                                    i10 = 0;
                                                    while (i9 < i8) {
                                                        int i310 = iArr[i9];
                                                        int i311 = i8;
                                                        i11 = i10 + 1;
                                                        int i42 = i9;
                                                        if (iArrCopyOf.length < i11) {
                                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                        }
                                                        iArrCopyOf[i10] = i310;
                                                        i9 = i42 + 1;
                                                        i10 = i11;
                                                        i8 = i311;
                                                    }
                                                    arrayList = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        p61.x(list2.get(0));
                                                        f05Var.getClass();
                                                        throw null;
                                                    }
                                                    if (arrayList.size() > 0) {
                                                        p61.x(arrayList.get(0));
                                                        if (i10 <= 0) {
                                                            int i43 = iArrCopyOf[0];
                                                            throw null;
                                                        }
                                                        kp5.k("Index must be between 0 and size");
                                                    }
                                                } else if (list2.size() > 0) {
                                                    p61.x(list2.get(0));
                                                    uz4Var.c(0);
                                                    throw null;
                                                }
                                                gcVar.t0.d(i6, ue7Var5);
                                                ue7Var3.d(i6, f05VarA2);
                                            } else {
                                                bt.i(ie2.h("Can't have more than ", i7, " custom actions for one widget"));
                                            }
                                        }
                                    }
                                    h4Var3.t(vr3.L(y07Var, resources));
                                    iD = gcVar.D0.d(i6);
                                    if (iD != -1) {
                                        gv3.V(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                        androidComposeView = androidComposeView2;
                                        accessibilityNodeInfo5.setTraversalBefore(androidComposeView, iD);
                                        gcVar.j(i6, h4Var3, gcVar.F0, null);
                                    } else {
                                        androidComposeView = androidComposeView2;
                                    }
                                    iD2 = gcVar.E0.d(i6);
                                    if (iD2 != -1) {
                                        gv3.V(androidComposeView.getAndroidViewsHandler$ui(), iD2);
                                    }
                                    str3 = (String) g33.x(t07Var3, km4.j);
                                    if (str3 != null) {
                                        h4Var3.m(str3);
                                    }
                                    h4Var4 = h4Var3;
                                }
                                return null;
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 34 ? u3.u(accessibilityManager2) : true) {
                            accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            h4Var = new h4(accessibilityNodeInfoObtain);
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 34) {
                                u3.D(accessibilityNodeInfoObtain, zF3);
                            } else {
                                h4Var.j(64, zF3);
                            }
                            if (i == -1) {
                                parentForAccessibility = androidComposeView2.getParentForAccessibility();
                                if (parentForAccessibility instanceof View) {
                                    view = (View) parentForAccessibility;
                                } else {
                                    view = null;
                                }
                                h4Var.b = -1;
                                accessibilityNodeInfoObtain.setParent(view);
                            } else {
                                y07VarL = y07Var5.l();
                                if (y07VarL != null) {
                                    numValueOf = Integer.valueOf(y07VarL.f);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    wc3.c("semanticsNode " + i + " has null parent");
                                    b61.n();
                                    return null;
                                }
                                iIntValue = numValueOf.intValue();
                                if (iIntValue == androidComposeView2.getSemanticsOwner().a().f) {
                                    iIntValue = -1;
                                }
                                h4Var.b = iIntValue;
                                accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                            }
                            h4Var.c = i;
                            accessibilityNodeInfoObtain.setSource(androidComposeView2, i);
                            h4Var.l(gcVar2.k(a17Var2));
                            tz4Var = gcVar2.L0;
                            ue7Var = gcVar2.u0;
                            resources = androidComposeView2.getContext().getResources();
                            h4Var.m("android.view.View");
                            t07Var = y07Var5.d;
                            s05Var = t07Var.X;
                            if (s05Var.c(c17.G)) {
                                h4Var.m("android.widget.EditText");
                            }
                            if (s05Var.c(c17.C)) {
                                h4Var.m("android.widget.TextView");
                            }
                            objG = s05Var.g(c17.z);
                            if (objG == null) {
                                objG = null;
                            }
                            kl6Var = (kl6) objG;
                            if (kl6Var != null) {
                                b = kl6Var.a;
                                if (y07Var5.n()) {
                                    accessibilityManager = accessibilityManager2;
                                    b2 = 4;
                                    ue7Var2 = ue7Var;
                                    if (y07Var5.i((4 & 1) != 0 ? !y07Var5.b : false, (4 & 2) == 0).isEmpty()) {
                                    }
                                } else {
                                    accessibilityManager = accessibilityManager2;
                                    b2 = 4;
                                    ue7Var2 = ue7Var;
                                }
                                if (b == b2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(b56.tab));
                                } else if (b == 2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(b56.switch_role));
                                } else {
                                    strX = gv3.X(b);
                                    if (b == 5) {
                                        h4Var.m(strX);
                                    } else {
                                        h4Var.m(strX);
                                    }
                                }
                            } else {
                                accessibilityManager = accessibilityManager2;
                                ue7Var2 = ue7Var;
                            }
                            accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                            accessibilityNodeInfoObtain.setImportantForAccessibility(jm4.M(y07Var5));
                            if (i2 >= 34) {
                                zU = u3.u(accessibilityManager);
                            } else {
                                zU = true;
                            }
                            listI = y07Var5.i((4 & 1) != 0 ? !y07Var5.b : false, (4 & 2) == 0);
                            size = listI.size();
                            z = zU;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                accessibilityNodeInfo = h4Var.a;
                                if (i4 < size) {
                                    int i312 = size;
                                    y07Var3 = (y07) listI.get(i4);
                                    List list6 = listI;
                                    ff3VarS = gcVar2.s();
                                    int i313 = i4;
                                    i30 = y07Var3.f;
                                    if (!ff3VarS.a(i30)) {
                                        if (androidComposeView2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(y07Var3.c) == null) {
                                            c2.m();
                                        } else if (i30 != -1) {
                                            a17Var = (a17) gcVar2.s().b(i30);
                                            if (a17Var != null) {
                                                zF2 = false;
                                            } else {
                                                zF2 = false;
                                            }
                                            if (z) {
                                                accessibilityNodeInfo.addChild(androidComposeView2, i30);
                                            } else {
                                                accessibilityNodeInfo.addChild(androidComposeView2, i30);
                                            }
                                            tz4Var.f(i30, i3);
                                            i3++;
                                        }
                                    }
                                    i4 = i313 + 1;
                                    listI = list6;
                                    size = i312;
                                } else {
                                    if (i == gcVar2.m0) {
                                        accessibilityNodeInfo.setAccessibilityFocused(true);
                                        h4Var.b(a4.i);
                                    } else {
                                        accessibilityNodeInfo.setAccessibilityFocused(false);
                                        h4Var.b(a4.h);
                                    }
                                    qlVarC = vr3.C(y07Var5);
                                    if (qlVarC != null) {
                                        androidComposeView2.getFontFamilyResolver();
                                        density = androidComposeView2.getDensity();
                                        zv7Var = gcVar2.H0;
                                        String str6 = qlVarC.Y;
                                        list4 = qlVarC.X;
                                        spannableString2 = new SpannableString(str6);
                                        arrayList4 = qlVarC.Z;
                                        if (arrayList4 != null) {
                                            size9 = arrayList4.size();
                                            i24 = 0;
                                            while (i24 < size9) {
                                                int i314 = size9;
                                                pl plVar8 = (pl) arrayList4.get(i24);
                                                int i315 = i24;
                                                qe7 qe7Var2 = (qe7) plVar8.a;
                                                ArrayList arrayList8 = arrayList4;
                                                i25 = plVar8.b;
                                                i26 = plVar8.c;
                                                t07 t07Var6 = t07Var;
                                                kl6 kl6Var5 = kl6Var;
                                                jB = qe7Var2.a.b();
                                                AccessibilityNodeInfo accessibilityNodeInfo8 = accessibilityNodeInfo;
                                                s05 s05Var5 = s05Var;
                                                long j3 = qe7Var2.b;
                                                dj2Var = qe7Var2.c;
                                                bj2Var = qe7Var2.d;
                                                g78Var = qe7Var2.j;
                                                ge4 ge4Var2 = qe7Var2.k;
                                                AccessibilityNodeInfo accessibilityNodeInfo9 = accessibilityNodeInfoObtain;
                                                h4 h4Var6 = h4Var;
                                                j = qe7Var2.l;
                                                x38Var = qe7Var2.m;
                                                f78Var = qe7Var2.a;
                                                y07 y07Var7 = y07Var5;
                                                jB2 = f78Var.b();
                                                int i316 = dw0.h;
                                                if (tk8.a(jB, jB2)) {
                                                    pw0Var = f78Var;
                                                } else if (jB != 16) {
                                                    pw0Var = new pw0(jB);
                                                } else {
                                                    pw0Var = e78.a;
                                                }
                                                dh3.J(spannableString2, pw0Var.b(), i25, i26);
                                                spannableString4 = spannableString2;
                                                dh3.K(spannableString4, j3, density, i25, i26);
                                                if (dj2Var == null) {
                                                    if (dj2Var == null) {
                                                        dj2Var2 = dj2.g0;
                                                    } else {
                                                        dj2Var2 = dj2Var;
                                                    }
                                                    if (bj2Var != null) {
                                                        i27 = bj2Var.a;
                                                    } else {
                                                        i27 = 0;
                                                    }
                                                    StyleSpan styleSpan2 = new StyleSpan(km4.H(dj2Var2, i27));
                                                    i28 = 33;
                                                    spannableString4.setSpan(styleSpan2, i25, i26, 33);
                                                } else {
                                                    if (dj2Var == null) {
                                                        dj2Var2 = dj2.g0;
                                                    } else {
                                                        dj2Var2 = dj2Var;
                                                    }
                                                    if (bj2Var != null) {
                                                        i27 = bj2Var.a;
                                                    } else {
                                                        i27 = 0;
                                                    }
                                                    StyleSpan styleSpan3 = new StyleSpan(km4.H(dj2Var2, i27));
                                                    i28 = 33;
                                                    spannableString4.setSpan(styleSpan3, i25, i26, 33);
                                                }
                                                if (x38Var != null) {
                                                    i29 = x38Var.a;
                                                    if ((i29 | 1) == i29) {
                                                        spannableString4.setSpan(new UnderlineSpan(), i25, i26, i28);
                                                    }
                                                    if ((i29 | 2) == i29) {
                                                        spannableString4.setSpan(new StrikethroughSpan(), i25, i26, i28);
                                                    }
                                                }
                                                if (g78Var != null) {
                                                    spannableString4.setSpan(new ScaleXSpan(g78Var.a), i25, i26, i28);
                                                }
                                                dh3.L(spannableString4, ge4Var2, i25, i26);
                                                if (j != 16) {
                                                    spannableString4.setSpan(new BackgroundColorSpan(z51.U(j)), i25, i26, i28);
                                                }
                                                i24 = i315 + 1;
                                                spannableString2 = spannableString4;
                                                y07Var5 = y07Var7;
                                                size9 = i314;
                                                arrayList4 = arrayList8;
                                                t07Var = t07Var6;
                                                kl6Var = kl6Var5;
                                                accessibilityNodeInfo = accessibilityNodeInfo8;
                                                s05Var = s05Var5;
                                                accessibilityNodeInfoObtain = accessibilityNodeInfo9;
                                                h4Var = h4Var6;
                                            }
                                        }
                                        t07Var2 = t07Var;
                                        kl6Var2 = kl6Var;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        s05Var2 = s05Var;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        h4Var2 = h4Var;
                                        spannableString3 = spannableString2;
                                        y07Var = y07Var5;
                                        int length3 = str6.length();
                                        arrayList5 = d02.X;
                                        if (list4 != null) {
                                            arrayList6 = new ArrayList(list4.size());
                                            size8 = list4.size();
                                            while (i23 < size8) {
                                                Object obj4 = list4.get(i23);
                                                plVar4 = (pl) obj4;
                                                if (!(plVar4.a instanceof yu8)) {
                                                }
                                            }
                                        } else {
                                            arrayList6 = arrayList5;
                                        }
                                        size4 = arrayList6.size();
                                        while (i15 < size4) {
                                            pl plVar9 = (pl) arrayList6.get(i15);
                                            yu8Var = (yu8) plVar9.a;
                                            i21 = plVar9.b;
                                            i22 = plVar9.c;
                                            if (yu8Var instanceof yu8) {
                                                spannableString3.setSpan(new TtsSpan.VerbatimBuilder(yu8Var.a).build(), i21, i22, 33);
                                            } else {
                                                b61.c();
                                            }
                                        }
                                        int length4 = str6.length();
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size7 = list4.size();
                                            while (i20 < size7) {
                                                Object obj5 = list4.get(i20);
                                                plVar3 = (pl) obj5;
                                                if (!(plVar3.a instanceof fq8)) {
                                                }
                                            }
                                        }
                                        size5 = arrayList5.size();
                                        while (i16 < size5) {
                                            pl plVar10 = (pl) arrayList5.get(i16);
                                            fq8Var = (fq8) plVar10.a;
                                            int i317 = plVar10.b;
                                            int i318 = plVar10.c;
                                            weakHashMap3 = (WeakHashMap) zv7Var.X;
                                            uRLSpan2 = weakHashMap3.get(fq8Var);
                                            if (uRLSpan2 == null) {
                                                uRLSpan2 = new URLSpan(fq8Var.a);
                                                weakHashMap3.put(fq8Var, uRLSpan2);
                                            }
                                            spannableString3.setSpan((URLSpan) uRLSpan2, i317, i318, 33);
                                        }
                                        listA = qlVarC.a(str6.length());
                                        size6 = listA.size();
                                        while (i17 < size6) {
                                            plVar = (pl) listA.get(i17);
                                            i18 = plVar.b;
                                            obj = plVar.a;
                                            i19 = plVar.c;
                                            if (i18 != i19) {
                                                pa4Var = (pa4) obj;
                                                if (pa4Var instanceof oa4) {
                                                    obj.getClass();
                                                    oa4Var = (oa4) obj;
                                                    plVar2 = new pl(i18, i19, oa4Var);
                                                    weakHashMap2 = (WeakHashMap) zv7Var.Y;
                                                    uRLSpan = weakHashMap2.get(plVar2);
                                                    if (uRLSpan == null) {
                                                        uRLSpan = new URLSpan(oa4Var.a);
                                                        weakHashMap2.put(plVar2, uRLSpan);
                                                    }
                                                    spannableString3.setSpan((URLSpan) uRLSpan, i18, i19, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) zv7Var.Z;
                                                    gz0Var = weakHashMap.get(plVar);
                                                    if (gz0Var == null) {
                                                        gz0Var = new gz0(pa4Var);
                                                        weakHashMap.put(plVar, gz0Var);
                                                    }
                                                    spannableString3.setSpan((ClickableSpan) gz0Var, i18, i19, 33);
                                                }
                                            }
                                        }
                                        spannableString = (SpannableString) gc.P(spannableString3);
                                    } else {
                                        tz4Var = tz4Var;
                                        t07Var2 = t07Var;
                                        kl6Var2 = kl6Var;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        s05Var2 = s05Var;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        h4Var2 = h4Var;
                                        y07Var = y07Var5;
                                        spannableString = null;
                                    }
                                    h4Var3 = h4Var2;
                                    h4Var3.x(spannableString);
                                    e17Var = c17.O;
                                    s05Var3 = s05Var2;
                                    if (s05Var3.c(e17Var)) {
                                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                                        accessibilityNodeInfo5.setContentInvalid(true);
                                        objG30 = s05Var3.g(e17Var);
                                        if (objG30 == null) {
                                            objG30 = null;
                                        }
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo4.setError((CharSequence) objG30);
                                    } else {
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                                    }
                                    h4Var3.w(vr3.B(y07Var, resources));
                                    accessibilityNodeInfo4.setCheckable(vr3.A(y07Var));
                                    objG2 = s05Var3.g(c17.L);
                                    if (objG2 == null) {
                                        objG2 = null;
                                    }
                                    ib8Var = (ib8) objG2;
                                    if (ib8Var != null) {
                                        if (ib8Var == ib8.X) {
                                            accessibilityNodeInfo4.setChecked(true);
                                        } else if (ib8Var == ib8.Y) {
                                            accessibilityNodeInfo4.setChecked(false);
                                        }
                                    }
                                    objG3 = s05Var3.g(c17.K);
                                    if (objG3 == null) {
                                        objG3 = null;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (kl6Var2 == null) {
                                            kl6Var3 = kl6Var2;
                                            i5 = 4;
                                        } else {
                                            kl6Var3 = kl6Var2;
                                            i5 = 4;
                                            if (kl6Var3.a == 4) {
                                                accessibilityNodeInfo4.setSelected(zBooleanValue2);
                                            }
                                        }
                                        accessibilityNodeInfo4.setChecked(zBooleanValue2);
                                    } else {
                                        kl6Var3 = kl6Var2;
                                        i5 = 4;
                                    }
                                    t07Var3 = t07Var2;
                                    if (t07Var3.Z) {
                                        objG4 = s05Var3.g(c17.a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) wv0.t0(list);
                                        } else {
                                            str = null;
                                        }
                                        h4Var3.p(str);
                                    } else {
                                        objG4 = s05Var3.g(c17.a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) wv0.t0(list);
                                        } else {
                                            str = null;
                                        }
                                        h4Var3.p(str);
                                    }
                                    objG5 = s05Var3.g(c17.A);
                                    if (objG5 == null) {
                                        objG5 = null;
                                    }
                                    str2 = (String) objG5;
                                    if (str2 != null) {
                                        y07VarL4 = y07Var;
                                        while (true) {
                                            if (y07VarL4 != null) {
                                                t07Var4 = y07VarL4.d;
                                                e17Var5 = km4.i;
                                                if (t07Var4.X.c(e17Var5)) {
                                                    zBooleanValue = ((Boolean) t07Var4.c(e17Var5)).booleanValue();
                                                } else {
                                                    y07VarL4 = y07VarL4.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            accessibilityNodeInfo5.setViewIdResourceName(str2);
                                        }
                                    }
                                    objG6 = s05Var3.g(c17.h);
                                    if (objG6 == null) {
                                        objG6 = null;
                                    }
                                    if (((dn8) objG6) != null) {
                                        h4Var3.q(true);
                                    }
                                    objG7 = s05Var3.g(c17.i);
                                    if (objG7 == null) {
                                        objG7 = null;
                                    }
                                    if (((dn8) objG7) != null) {
                                        h4Var3.y();
                                    }
                                    i6 = i;
                                    if (i6 != -1) {
                                        iD3 = tz4Var.d(y07Var.f);
                                        if (iD3 != -1) {
                                            accessibilityNodeInfo5.setDrawingOrder(iD3);
                                        }
                                    }
                                    accessibilityNodeInfo5.setPassword(s05Var3.c(c17.N));
                                    objG8 = s05Var3.g(c17.Q);
                                    if (objG8 == null) {
                                        objG8 = null;
                                    }
                                    bool2 = Boolean.TRUE;
                                    accessibilityNodeInfo5.setEditable(dh3.f(objG8, bool2));
                                    objG9 = s05Var3.g(c17.R);
                                    if (objG9 == null) {
                                        objG9 = null;
                                    }
                                    num = (Integer) objG9;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                                    accessibilityNodeInfo4.setEnabled(vr3.t(y07Var));
                                    e17Var2 = c17.l;
                                    accessibilityNodeInfo4.setFocusable(s05Var3.c(e17Var2));
                                    if (accessibilityNodeInfo5.isFocusable()) {
                                        accessibilityNodeInfo4.setFocused(((Boolean) t07Var3.c(e17Var2)).booleanValue());
                                        if (accessibilityNodeInfo5.isFocused()) {
                                            h4Var3.a(2);
                                            gcVar = gcVar2;
                                            gcVar.n0 = i6;
                                        } else {
                                            gcVar = gcVar2;
                                            z2 = true;
                                            h4Var3.a(1);
                                        }
                                        accessibilityNodeInfo4.setVisibleToUser(jm4.L(y07Var) ^ z2);
                                        if (y07Var.n()) {
                                            y07VarL2 = y07Var.l();
                                            y07VarL2.getClass();
                                        } else {
                                            y07VarL2 = y07Var;
                                        }
                                        if (y07VarL2.m().h()) {
                                            accessibilityNodeInfo4.setVisibleToUser(false);
                                        }
                                        objG10 = s05Var3.g(c17.k);
                                        if (objG10 == null) {
                                            objG10 = null;
                                        }
                                        if (((uc4) objG10) != null) {
                                            accessibilityNodeInfo5.setLiveRegion(2);
                                        }
                                        accessibilityNodeInfo4.setClickable(false);
                                        objG11 = s05Var3.g(s07.b);
                                        if (objG11 == null) {
                                            objG11 = null;
                                        }
                                        q3Var = (q3) objG11;
                                        if (q3Var != null) {
                                            objG29 = s05Var3.g(c17.K);
                                            if (objG29 == null) {
                                                objG29 = null;
                                            }
                                            boolean zF6 = dh3.f(objG29, bool2);
                                            if (kl6Var3 == null) {
                                            }
                                            if (z4) {
                                                z5 = true;
                                            } else {
                                                z5 = true;
                                            }
                                            accessibilityNodeInfo4.setClickable(z5);
                                            if (vr3.t(y07Var)) {
                                                h4Var3.b(new a4(16, q3Var.a));
                                            }
                                        }
                                        accessibilityNodeInfo4.setLongClickable(false);
                                        objG12 = s05Var3.g(s07.c);
                                        if (objG12 == null) {
                                            objG12 = null;
                                        }
                                        q3Var2 = (q3) objG12;
                                        if (q3Var2 != null) {
                                            accessibilityNodeInfo4.setLongClickable(true);
                                            if (vr3.t(y07Var)) {
                                                h4Var3.b(new a4(32, q3Var2.a));
                                            }
                                        }
                                        objG13 = s05Var3.g(s07.q);
                                        if (objG13 == null) {
                                            objG13 = null;
                                        }
                                        q3Var3 = (q3) objG13;
                                        if (q3Var3 != null) {
                                            h4Var3.b(new a4(Http2.INITIAL_MAX_FRAME_SIZE, q3Var3.a));
                                        }
                                        if (vr3.t(y07Var)) {
                                            objG25 = s05Var3.g(s07.k);
                                            if (objG25 == null) {
                                                objG25 = null;
                                            }
                                            q3Var9 = (q3) objG25;
                                            if (q3Var9 != null) {
                                                h4Var3.b(new a4(2097152, q3Var9.a));
                                            }
                                            objG26 = s05Var3.g(s07.p);
                                            if (objG26 == null) {
                                                objG26 = null;
                                            }
                                            q3Var10 = (q3) objG26;
                                            if (q3Var10 != null) {
                                                h4Var3.b(new a4(R.id.accessibilityActionImeEnter, q3Var10.a));
                                            }
                                            objG27 = s05Var3.g(s07.r);
                                            if (objG27 == null) {
                                                objG27 = null;
                                            }
                                            q3Var11 = (q3) objG27;
                                            if (q3Var11 != null) {
                                                h4Var3.b(new a4(DnsOverHttps.MAX_RESPONSE_SIZE, q3Var11.a));
                                            }
                                            objG28 = s05Var3.g(s07.s);
                                            if (objG28 == null) {
                                                objG28 = null;
                                            }
                                            q3Var12 = (q3) objG28;
                                            if (q3Var12 != null) {
                                                primaryClipDescription = ((dq) androidComposeView2.getClipboardManager()).v().getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    h4Var3.b(new a4(32768, q3Var12.a));
                                                }
                                            }
                                        }
                                        strT = gc.t(y07Var);
                                        if (strT != null) {
                                            accessibilityNodeInfo5.setTextSelection(gcVar.r(y07Var), gcVar.q(y07Var));
                                            objG22 = s05Var3.g(s07.j);
                                            if (objG22 == null) {
                                                objG22 = null;
                                            }
                                            q3Var8 = (q3) objG22;
                                            if (q3Var8 != null) {
                                                str4 = q3Var8.a;
                                            } else {
                                                str4 = null;
                                            }
                                            h4Var3.b(new a4(131072, str4));
                                            h4Var3.a(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                                            h4Var3.a(512);
                                            accessibilityNodeInfo4.setMovementGranularities(11);
                                            objG23 = s05Var3.g(c17.a);
                                            if (objG23 == null) {
                                                objG23 = null;
                                            }
                                            list3 = (List) objG23;
                                            if (list3 != null) {
                                                layoutNodeW = layoutNode2.w();
                                                while (true) {
                                                    if (layoutNodeW == null) {
                                                        layoutNodeW = null;
                                                    } else {
                                                        t07VarY2 = layoutNodeW.y();
                                                        if (t07VarY2 == null) {
                                                        }
                                                        layoutNodeW = layoutNodeW.w();
                                                    }
                                                }
                                                if (layoutNodeW == null) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                } else {
                                                    t07VarY = layoutNodeW.y();
                                                    if (t07VarY != null) {
                                                        objG24 = t07VarY.X.g(c17.l);
                                                        if (objG24 == null) {
                                                            objG24 = null;
                                                        }
                                                        zF = dh3.f(objG24, Boolean.TRUE);
                                                    } else {
                                                        zF = false;
                                                    }
                                                    if (zF) {
                                                        accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                    }
                                                }
                                            } else {
                                                layoutNodeW = layoutNode2.w();
                                                while (true) {
                                                    if (layoutNodeW == null) {
                                                        layoutNodeW = null;
                                                    } else {
                                                        t07VarY2 = layoutNodeW.y();
                                                        if (t07VarY2 == null) {
                                                        }
                                                        layoutNodeW = layoutNodeW.w();
                                                    }
                                                }
                                                if (layoutNodeW == null) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                } else {
                                                    t07VarY = layoutNodeW.y();
                                                    if (t07VarY != null) {
                                                        objG24 = t07VarY.X.g(c17.l);
                                                        if (objG24 == null) {
                                                            objG24 = null;
                                                        }
                                                        zF = dh3.f(objG24, Boolean.TRUE);
                                                    } else {
                                                        zF = false;
                                                    }
                                                    if (zF) {
                                                        accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                    }
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            arrayList3 = new ArrayList();
                                            arrayList3.add("androidx.compose.ui.semantics.id");
                                            charSequenceG = h4Var3.g();
                                            if (charSequenceG != null) {
                                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (s05Var3.c(c17.A)) {
                                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (s05Var3.c(c17.S)) {
                                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            h4Var3.i(arrayList3);
                                        }
                                        qw5Var = (qw5) g33.x(t07Var3, c17.c);
                                        if (qw5Var != null) {
                                            f = qw5Var.a;
                                            uu0Var = qw5Var.b;
                                            e17Var4 = s07.i;
                                            if (s05Var3.c(e17Var4)) {
                                                h4Var3.m("android.widget.SeekBar");
                                            } else {
                                                h4Var3.m("android.widget.ProgressBar");
                                            }
                                            if (qw5Var != qw5.d) {
                                                accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, uu0Var.X, uu0Var.Y, f));
                                            }
                                            if (s05Var3.c(e17Var4)) {
                                                f2 = uu0Var.Y;
                                                f3 = uu0Var.X;
                                                if (f2 < f3) {
                                                    f2 = f3;
                                                }
                                                if (f < f2) {
                                                    h4Var3.b(a4.j);
                                                }
                                                f4 = uu0Var.Y;
                                                if (f3 > f4) {
                                                    f3 = f4;
                                                }
                                                if (f > f3) {
                                                    h4Var3.b(a4.k);
                                                }
                                            }
                                        }
                                        if (vr3.t(y07Var)) {
                                            h4Var3.b(new a4(R.id.accessibilityActionSetProgress, q3Var7.a));
                                        }
                                        yn0.e0(h4Var3, y07Var);
                                        objG14 = y07Var.k().X.g(c17.g);
                                        if (objG14 == null) {
                                            objG14 = null;
                                        }
                                        if (objG14 == null) {
                                            y07VarL3 = y07Var.l();
                                            if (y07VarL3 != null) {
                                                objG19 = y07VarL3.k().X.g(c17.e);
                                                if (objG19 == null) {
                                                    objG19 = null;
                                                }
                                                if (objG19 != null) {
                                                    objG20 = y07VarL3.k().X.g(c17.f);
                                                    if (objG20 == null) {
                                                        objG20 = null;
                                                    }
                                                    sv0Var = (sv0) objG20;
                                                    if (sv0Var != null) {
                                                        if (y07Var.k().X.c(c17.K)) {
                                                            arrayList2 = new ArrayList();
                                                            listI2 = y07VarL3.i((4 & 1) != 0 ? !y07VarL3.b : false, (4 & 2) == 0);
                                                            size3 = listI2.size();
                                                            i13 = 0;
                                                            while (i12 < size3) {
                                                                y07Var2 = (y07) listI2.get(i12);
                                                                if (y07Var2.k().X.c(c17.K)) {
                                                                    arrayList2.add(y07Var2);
                                                                    if (y07Var2.c.x() < y07Var.c.x()) {
                                                                        i13++;
                                                                    }
                                                                }
                                                            }
                                                            if (!arrayList2.isEmpty()) {
                                                                zT = yn0.t(arrayList2);
                                                                if (zT) {
                                                                    i14 = 0;
                                                                } else {
                                                                    i14 = i13;
                                                                }
                                                                if (!zT) {
                                                                    i13 = 0;
                                                                }
                                                                objG21 = y07Var.k().X.g(c17.K);
                                                                if (objG21 == null) {
                                                                    objG21 = Boolean.FALSE;
                                                                }
                                                                h4Var3.o(g4.a(i14, ((Boolean) objG21).booleanValue(), 1, i13, 1));
                                                            }
                                                        }
                                                    } else if (y07Var.k().X.c(c17.K)) {
                                                        arrayList2 = new ArrayList();
                                                        listI2 = y07VarL3.i((4 & 1) != 0 ? !y07VarL3.b : false, (4 & 2) == 0);
                                                        size3 = listI2.size();
                                                        i13 = 0;
                                                        while (i12 < size3) {
                                                            y07Var2 = (y07) listI2.get(i12);
                                                            if (y07Var2.k().X.c(c17.K)) {
                                                                arrayList2.add(y07Var2);
                                                                if (y07Var2.c.x() < y07Var.c.x()) {
                                                                    i13++;
                                                                }
                                                            }
                                                        }
                                                        if (!arrayList2.isEmpty()) {
                                                            zT = yn0.t(arrayList2);
                                                            if (zT) {
                                                                i14 = 0;
                                                            } else {
                                                                i14 = i13;
                                                            }
                                                            if (!zT) {
                                                                i13 = 0;
                                                            }
                                                            objG21 = y07Var.k().X.g(c17.K);
                                                            if (objG21 == null) {
                                                                objG21 = Boolean.FALSE;
                                                            }
                                                            h4Var3.o(g4.a(i14, ((Boolean) objG21).booleanValue(), 1, i13, 1));
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            c2.m();
                                        }
                                        jx6Var = (jx6) g33.x(t07Var3, c17.v);
                                        q3 q3Var15 = (q3) g33.x(t07Var3, s07.d);
                                        if (jx6Var != null) {
                                            objG17 = y07Var.k().X.g(c17.f);
                                            if (objG17 == null) {
                                                objG17 = null;
                                            }
                                            if (objG17 == null) {
                                                objG18 = y07Var.k().X.g(c17.e);
                                                if (objG18 == null) {
                                                    objG18 = null;
                                                }
                                                if (objG18 == null) {
                                                    h4Var3.m("android.widget.HorizontalScrollView");
                                                }
                                            }
                                            if (((Number) jx6Var.b.invoke()).floatValue() > 0.0f) {
                                                h4Var3.u(true);
                                            }
                                            if (vr3.t(y07Var)) {
                                                z3 = gc.z(jx6Var);
                                                z24Var = z24.Y;
                                                if (z3) {
                                                    h4Var3.b(a4.j);
                                                    if (layoutNode.B0 == z24Var) {
                                                        layoutNode = layoutNode2;
                                                        a4Var2 = a4.p;
                                                    } else {
                                                        layoutNode = layoutNode2;
                                                        a4Var2 = a4.r;
                                                    }
                                                    h4Var3.b(a4Var2);
                                                } else {
                                                    layoutNode = layoutNode2;
                                                }
                                                if (gc.y(jx6Var)) {
                                                    h4Var3.b(a4.k);
                                                    if (layoutNode.B0 == z24Var) {
                                                        a4Var = a4.r;
                                                    } else {
                                                        a4Var = a4.p;
                                                    }
                                                    h4Var3.b(a4Var);
                                                }
                                            }
                                        }
                                        jx6Var2 = (jx6) g33.x(t07Var3, c17.w);
                                        if (jx6Var2 != null) {
                                            objG15 = y07Var.k().X.g(c17.f);
                                            if (objG15 == null) {
                                                objG15 = null;
                                            }
                                            if (objG15 == null) {
                                                objG16 = y07Var.k().X.g(c17.e);
                                                if (objG16 == null) {
                                                    objG16 = null;
                                                }
                                                if (objG16 == null) {
                                                    h4Var3.m("android.widget.ScrollView");
                                                }
                                            }
                                            if (((Number) jx6Var2.b.invoke()).floatValue() > 0.0f) {
                                                h4Var3.u(true);
                                            }
                                            if (vr3.t(y07Var)) {
                                                if (gc.z(jx6Var2)) {
                                                    h4Var3.b(a4.j);
                                                    h4Var3.b(a4.q);
                                                }
                                                if (gc.y(jx6Var2)) {
                                                    h4Var3.b(a4.k);
                                                    h4Var3.b(a4.o);
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            dh3.d(h4Var3, y07Var);
                                        }
                                        h4Var3.s((CharSequence) g33.x(t07Var3, c17.d));
                                        if (vr3.t(y07Var)) {
                                            q3Var4 = (q3) g33.x(t07Var3, s07.t);
                                            if (q3Var4 != null) {
                                                h4Var3.b(new a4(262144, q3Var4.a));
                                            }
                                            q3Var5 = (q3) g33.x(t07Var3, s07.u);
                                            if (q3Var5 != null) {
                                                h4Var3.b(new a4(524288, q3Var5.a));
                                            }
                                            q3Var6 = (q3) g33.x(t07Var3, s07.v);
                                            if (q3Var6 != null) {
                                                h4Var3.b(new a4(1048576, q3Var6.a));
                                            }
                                            e17Var3 = s07.x;
                                            if (s05Var3.c(e17Var3)) {
                                                list2 = (List) t07Var3.c(e17Var3);
                                                size2 = list2.size();
                                                uz4Var = gc.P0;
                                                i7 = uz4Var.b;
                                                if (size2 < i7) {
                                                    ue7 ue7Var6 = new ue7(0);
                                                    f05 f05VarA3 = g85.a();
                                                    ue7Var3 = ue7Var2;
                                                    if (w45.k(ue7Var3.Z, i6, ue7Var3.X) >= 0) {
                                                        f05Var = (f05) x97.t(ue7Var3, i6);
                                                        iArr = uz4Var.a;
                                                        i8 = uz4Var.b;
                                                        iArrCopyOf = new int[16];
                                                        i9 = 0;
                                                        i10 = 0;
                                                        while (i9 < i8) {
                                                            int i319 = iArr[i9];
                                                            int i3110 = i8;
                                                            i11 = i10 + 1;
                                                            int i44 = i9;
                                                            if (iArrCopyOf.length < i11) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                            }
                                                            iArrCopyOf[i10] = i319;
                                                            i9 = i44 + 1;
                                                            i10 = i11;
                                                            i8 = i3110;
                                                        }
                                                        arrayList = new ArrayList();
                                                        if (list2.size() <= 0) {
                                                            p61.x(list2.get(0));
                                                            f05Var.getClass();
                                                            throw null;
                                                        }
                                                        if (arrayList.size() > 0) {
                                                            p61.x(arrayList.get(0));
                                                            if (i10 <= 0) {
                                                                int i45 = iArrCopyOf[0];
                                                                throw null;
                                                            }
                                                            kp5.k("Index must be between 0 and size");
                                                        }
                                                    } else if (list2.size() > 0) {
                                                        p61.x(list2.get(0));
                                                        uz4Var.c(0);
                                                        throw null;
                                                    }
                                                    gcVar.t0.d(i6, ue7Var6);
                                                    ue7Var3.d(i6, f05VarA3);
                                                } else {
                                                    bt.i(ie2.h("Can't have more than ", i7, " custom actions for one widget"));
                                                }
                                            }
                                        }
                                        h4Var3.t(vr3.L(y07Var, resources));
                                        iD = gcVar.D0.d(i6);
                                        if (iD != -1) {
                                            gv3.V(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                            androidComposeView = androidComposeView2;
                                            accessibilityNodeInfo5.setTraversalBefore(androidComposeView, iD);
                                            gcVar.j(i6, h4Var3, gcVar.F0, null);
                                        } else {
                                            androidComposeView = androidComposeView2;
                                        }
                                        iD2 = gcVar.E0.d(i6);
                                        if (iD2 != -1) {
                                            gv3.V(androidComposeView.getAndroidViewsHandler$ui(), iD2);
                                        }
                                        str3 = (String) g33.x(t07Var3, km4.j);
                                        if (str3 != null) {
                                            h4Var3.m(str3);
                                        }
                                        h4Var4 = h4Var3;
                                    } else {
                                        gcVar = gcVar2;
                                    }
                                    z2 = true;
                                    accessibilityNodeInfo4.setVisibleToUser(jm4.L(y07Var) ^ z2);
                                    if (y07Var.n()) {
                                        y07VarL2 = y07Var.l();
                                        y07VarL2.getClass();
                                    } else {
                                        y07VarL2 = y07Var;
                                    }
                                    if (y07VarL2.m().h()) {
                                        accessibilityNodeInfo4.setVisibleToUser(false);
                                    }
                                    objG10 = s05Var3.g(c17.k);
                                    if (objG10 == null) {
                                        objG10 = null;
                                    }
                                    if (((uc4) objG10) != null) {
                                        accessibilityNodeInfo5.setLiveRegion(2);
                                    }
                                    accessibilityNodeInfo4.setClickable(false);
                                    objG11 = s05Var3.g(s07.b);
                                    if (objG11 == null) {
                                        objG11 = null;
                                    }
                                    q3Var = (q3) objG11;
                                    if (q3Var != null) {
                                        objG29 = s05Var3.g(c17.K);
                                        if (objG29 == null) {
                                            objG29 = null;
                                        }
                                        boolean zF7 = dh3.f(objG29, bool2);
                                        if (kl6Var3 == null) {
                                        }
                                        if (z4) {
                                            z5 = true;
                                        } else {
                                            z5 = true;
                                        }
                                        accessibilityNodeInfo4.setClickable(z5);
                                        if (vr3.t(y07Var)) {
                                            h4Var3.b(new a4(16, q3Var.a));
                                        }
                                    }
                                    accessibilityNodeInfo4.setLongClickable(false);
                                    objG12 = s05Var3.g(s07.c);
                                    if (objG12 == null) {
                                        objG12 = null;
                                    }
                                    q3Var2 = (q3) objG12;
                                    if (q3Var2 != null) {
                                        accessibilityNodeInfo4.setLongClickable(true);
                                        if (vr3.t(y07Var)) {
                                            h4Var3.b(new a4(32, q3Var2.a));
                                        }
                                    }
                                    objG13 = s05Var3.g(s07.q);
                                    if (objG13 == null) {
                                        objG13 = null;
                                    }
                                    q3Var3 = (q3) objG13;
                                    if (q3Var3 != null) {
                                        h4Var3.b(new a4(Http2.INITIAL_MAX_FRAME_SIZE, q3Var3.a));
                                    }
                                    if (vr3.t(y07Var)) {
                                        objG25 = s05Var3.g(s07.k);
                                        if (objG25 == null) {
                                            objG25 = null;
                                        }
                                        q3Var9 = (q3) objG25;
                                        if (q3Var9 != null) {
                                            h4Var3.b(new a4(2097152, q3Var9.a));
                                        }
                                        objG26 = s05Var3.g(s07.p);
                                        if (objG26 == null) {
                                            objG26 = null;
                                        }
                                        q3Var10 = (q3) objG26;
                                        if (q3Var10 != null) {
                                            h4Var3.b(new a4(R.id.accessibilityActionImeEnter, q3Var10.a));
                                        }
                                        objG27 = s05Var3.g(s07.r);
                                        if (objG27 == null) {
                                            objG27 = null;
                                        }
                                        q3Var11 = (q3) objG27;
                                        if (q3Var11 != null) {
                                            h4Var3.b(new a4(DnsOverHttps.MAX_RESPONSE_SIZE, q3Var11.a));
                                        }
                                        objG28 = s05Var3.g(s07.s);
                                        if (objG28 == null) {
                                            objG28 = null;
                                        }
                                        q3Var12 = (q3) objG28;
                                        if (q3Var12 != null) {
                                            primaryClipDescription = ((dq) androidComposeView2.getClipboardManager()).v().getPrimaryClipDescription();
                                            if (primaryClipDescription != null) {
                                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                            } else {
                                                zHasMimeType = false;
                                            }
                                            if (zHasMimeType) {
                                                h4Var3.b(new a4(32768, q3Var12.a));
                                            }
                                        }
                                    }
                                    strT = gc.t(y07Var);
                                    if (strT != null) {
                                        accessibilityNodeInfo5.setTextSelection(gcVar.r(y07Var), gcVar.q(y07Var));
                                        objG22 = s05Var3.g(s07.j);
                                        if (objG22 == null) {
                                            objG22 = null;
                                        }
                                        q3Var8 = (q3) objG22;
                                        if (q3Var8 != null) {
                                            str4 = q3Var8.a;
                                        } else {
                                            str4 = null;
                                        }
                                        h4Var3.b(new a4(131072, str4));
                                        h4Var3.a(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                                        h4Var3.a(512);
                                        accessibilityNodeInfo4.setMovementGranularities(11);
                                        objG23 = s05Var3.g(c17.a);
                                        if (objG23 == null) {
                                            objG23 = null;
                                        }
                                        list3 = (List) objG23;
                                        if (list3 != null) {
                                            layoutNodeW = layoutNode2.w();
                                            while (true) {
                                                if (layoutNodeW == null) {
                                                    layoutNodeW = null;
                                                } else {
                                                    t07VarY2 = layoutNodeW.y();
                                                    if (t07VarY2 == null) {
                                                    }
                                                    layoutNodeW = layoutNodeW.w();
                                                }
                                            }
                                            if (layoutNodeW == null) {
                                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                            } else {
                                                t07VarY = layoutNodeW.y();
                                                if (t07VarY != null) {
                                                    objG24 = t07VarY.X.g(c17.l);
                                                    if (objG24 == null) {
                                                        objG24 = null;
                                                    }
                                                    zF = dh3.f(objG24, Boolean.TRUE);
                                                } else {
                                                    zF = false;
                                                }
                                                if (zF) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                }
                                            }
                                        } else {
                                            layoutNodeW = layoutNode2.w();
                                            while (true) {
                                                if (layoutNodeW == null) {
                                                    layoutNodeW = null;
                                                } else {
                                                    t07VarY2 = layoutNodeW.y();
                                                    if (t07VarY2 == null) {
                                                    }
                                                    layoutNodeW = layoutNodeW.w();
                                                }
                                            }
                                            if (layoutNodeW == null) {
                                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                            } else {
                                                t07VarY = layoutNodeW.y();
                                                if (t07VarY != null) {
                                                    objG24 = t07VarY.X.g(c17.l);
                                                    if (objG24 == null) {
                                                        objG24 = null;
                                                    }
                                                    zF = dh3.f(objG24, Boolean.TRUE);
                                                } else {
                                                    zF = false;
                                                }
                                                if (zF) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        arrayList3 = new ArrayList();
                                        arrayList3.add("androidx.compose.ui.semantics.id");
                                        charSequenceG = h4Var3.g();
                                        if (charSequenceG != null) {
                                            arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (s05Var3.c(c17.A)) {
                                            arrayList3.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (s05Var3.c(c17.S)) {
                                            arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        h4Var3.i(arrayList3);
                                    }
                                    qw5Var = (qw5) g33.x(t07Var3, c17.c);
                                    if (qw5Var != null) {
                                        f = qw5Var.a;
                                        uu0Var = qw5Var.b;
                                        e17Var4 = s07.i;
                                        if (s05Var3.c(e17Var4)) {
                                            h4Var3.m("android.widget.SeekBar");
                                        } else {
                                            h4Var3.m("android.widget.ProgressBar");
                                        }
                                        if (qw5Var != qw5.d) {
                                            accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, uu0Var.X, uu0Var.Y, f));
                                        }
                                        if (s05Var3.c(e17Var4)) {
                                            f2 = uu0Var.Y;
                                            f3 = uu0Var.X;
                                            if (f2 < f3) {
                                                f2 = f3;
                                            }
                                            if (f < f2) {
                                                h4Var3.b(a4.j);
                                            }
                                            f4 = uu0Var.Y;
                                            if (f3 > f4) {
                                                f3 = f4;
                                            }
                                            if (f > f3) {
                                                h4Var3.b(a4.k);
                                            }
                                        }
                                    }
                                    if (vr3.t(y07Var)) {
                                        h4Var3.b(new a4(R.id.accessibilityActionSetProgress, q3Var7.a));
                                    }
                                    yn0.e0(h4Var3, y07Var);
                                    objG14 = y07Var.k().X.g(c17.g);
                                    if (objG14 == null) {
                                        objG14 = null;
                                    }
                                    if (objG14 == null) {
                                        y07VarL3 = y07Var.l();
                                        if (y07VarL3 != null) {
                                            objG19 = y07VarL3.k().X.g(c17.e);
                                            if (objG19 == null) {
                                                objG19 = null;
                                            }
                                            if (objG19 != null) {
                                                objG20 = y07VarL3.k().X.g(c17.f);
                                                if (objG20 == null) {
                                                    objG20 = null;
                                                }
                                                sv0Var = (sv0) objG20;
                                                if (sv0Var != null) {
                                                    if (y07Var.k().X.c(c17.K)) {
                                                        arrayList2 = new ArrayList();
                                                        listI2 = y07VarL3.i((4 & 1) != 0 ? !y07VarL3.b : false, (4 & 2) == 0);
                                                        size3 = listI2.size();
                                                        i13 = 0;
                                                        while (i12 < size3) {
                                                            y07Var2 = (y07) listI2.get(i12);
                                                            if (y07Var2.k().X.c(c17.K)) {
                                                                arrayList2.add(y07Var2);
                                                                if (y07Var2.c.x() < y07Var.c.x()) {
                                                                    i13++;
                                                                }
                                                            }
                                                        }
                                                        if (!arrayList2.isEmpty()) {
                                                            zT = yn0.t(arrayList2);
                                                            if (zT) {
                                                                i14 = 0;
                                                            } else {
                                                                i14 = i13;
                                                            }
                                                            if (!zT) {
                                                                i13 = 0;
                                                            }
                                                            objG21 = y07Var.k().X.g(c17.K);
                                                            if (objG21 == null) {
                                                                objG21 = Boolean.FALSE;
                                                            }
                                                            h4Var3.o(g4.a(i14, ((Boolean) objG21).booleanValue(), 1, i13, 1));
                                                        }
                                                    }
                                                } else if (y07Var.k().X.c(c17.K)) {
                                                    arrayList2 = new ArrayList();
                                                    listI2 = y07VarL3.i((4 & 1) != 0 ? !y07VarL3.b : false, (4 & 2) == 0);
                                                    size3 = listI2.size();
                                                    i13 = 0;
                                                    while (i12 < size3) {
                                                        y07Var2 = (y07) listI2.get(i12);
                                                        if (y07Var2.k().X.c(c17.K)) {
                                                            arrayList2.add(y07Var2);
                                                            if (y07Var2.c.x() < y07Var.c.x()) {
                                                                i13++;
                                                            }
                                                        }
                                                    }
                                                    if (!arrayList2.isEmpty()) {
                                                        zT = yn0.t(arrayList2);
                                                        if (zT) {
                                                            i14 = 0;
                                                        } else {
                                                            i14 = i13;
                                                        }
                                                        if (!zT) {
                                                            i13 = 0;
                                                        }
                                                        objG21 = y07Var.k().X.g(c17.K);
                                                        if (objG21 == null) {
                                                            objG21 = Boolean.FALSE;
                                                        }
                                                        h4Var3.o(g4.a(i14, ((Boolean) objG21).booleanValue(), 1, i13, 1));
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        c2.m();
                                    }
                                    jx6Var = (jx6) g33.x(t07Var3, c17.v);
                                    q3 q3Var16 = (q3) g33.x(t07Var3, s07.d);
                                    if (jx6Var != null) {
                                        objG17 = y07Var.k().X.g(c17.f);
                                        if (objG17 == null) {
                                            objG17 = null;
                                        }
                                        if (objG17 == null) {
                                            objG18 = y07Var.k().X.g(c17.e);
                                            if (objG18 == null) {
                                                objG18 = null;
                                            }
                                            if (objG18 == null) {
                                                h4Var3.m("android.widget.HorizontalScrollView");
                                            }
                                        }
                                        if (((Number) jx6Var.b.invoke()).floatValue() > 0.0f) {
                                            h4Var3.u(true);
                                        }
                                        if (vr3.t(y07Var)) {
                                            z3 = gc.z(jx6Var);
                                            z24Var = z24.Y;
                                            if (z3) {
                                                h4Var3.b(a4.j);
                                                if (layoutNode.B0 == z24Var) {
                                                    layoutNode = layoutNode2;
                                                    a4Var2 = a4.p;
                                                } else {
                                                    layoutNode = layoutNode2;
                                                    a4Var2 = a4.r;
                                                }
                                                h4Var3.b(a4Var2);
                                            } else {
                                                layoutNode = layoutNode2;
                                            }
                                            if (gc.y(jx6Var)) {
                                                h4Var3.b(a4.k);
                                                if (layoutNode.B0 == z24Var) {
                                                    a4Var = a4.r;
                                                } else {
                                                    a4Var = a4.p;
                                                }
                                                h4Var3.b(a4Var);
                                            }
                                        }
                                    }
                                    jx6Var2 = (jx6) g33.x(t07Var3, c17.w);
                                    if (jx6Var2 != null) {
                                        objG15 = y07Var.k().X.g(c17.f);
                                        if (objG15 == null) {
                                            objG15 = null;
                                        }
                                        if (objG15 == null) {
                                            objG16 = y07Var.k().X.g(c17.e);
                                            if (objG16 == null) {
                                                objG16 = null;
                                            }
                                            if (objG16 == null) {
                                                h4Var3.m("android.widget.ScrollView");
                                            }
                                        }
                                        if (((Number) jx6Var2.b.invoke()).floatValue() > 0.0f) {
                                            h4Var3.u(true);
                                        }
                                        if (vr3.t(y07Var)) {
                                            if (gc.z(jx6Var2)) {
                                                h4Var3.b(a4.j);
                                                h4Var3.b(a4.q);
                                            }
                                            if (gc.y(jx6Var2)) {
                                                h4Var3.b(a4.k);
                                                h4Var3.b(a4.o);
                                            }
                                        }
                                    }
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        dh3.d(h4Var3, y07Var);
                                    }
                                    h4Var3.s((CharSequence) g33.x(t07Var3, c17.d));
                                    if (vr3.t(y07Var)) {
                                        q3Var4 = (q3) g33.x(t07Var3, s07.t);
                                        if (q3Var4 != null) {
                                            h4Var3.b(new a4(262144, q3Var4.a));
                                        }
                                        q3Var5 = (q3) g33.x(t07Var3, s07.u);
                                        if (q3Var5 != null) {
                                            h4Var3.b(new a4(524288, q3Var5.a));
                                        }
                                        q3Var6 = (q3) g33.x(t07Var3, s07.v);
                                        if (q3Var6 != null) {
                                            h4Var3.b(new a4(1048576, q3Var6.a));
                                        }
                                        e17Var3 = s07.x;
                                        if (s05Var3.c(e17Var3)) {
                                            list2 = (List) t07Var3.c(e17Var3);
                                            size2 = list2.size();
                                            uz4Var = gc.P0;
                                            i7 = uz4Var.b;
                                            if (size2 < i7) {
                                                ue7 ue7Var7 = new ue7(0);
                                                f05 f05VarA4 = g85.a();
                                                ue7Var3 = ue7Var2;
                                                if (w45.k(ue7Var3.Z, i6, ue7Var3.X) >= 0) {
                                                    f05Var = (f05) x97.t(ue7Var3, i6);
                                                    iArr = uz4Var.a;
                                                    i8 = uz4Var.b;
                                                    iArrCopyOf = new int[16];
                                                    i9 = 0;
                                                    i10 = 0;
                                                    while (i9 < i8) {
                                                        int i3111 = iArr[i9];
                                                        int i3112 = i8;
                                                        i11 = i10 + 1;
                                                        int i46 = i9;
                                                        if (iArrCopyOf.length < i11) {
                                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                        }
                                                        iArrCopyOf[i10] = i3111;
                                                        i9 = i46 + 1;
                                                        i10 = i11;
                                                        i8 = i3112;
                                                    }
                                                    arrayList = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        p61.x(list2.get(0));
                                                        f05Var.getClass();
                                                        throw null;
                                                    }
                                                    if (arrayList.size() > 0) {
                                                        p61.x(arrayList.get(0));
                                                        if (i10 <= 0) {
                                                            int i47 = iArrCopyOf[0];
                                                            throw null;
                                                        }
                                                        kp5.k("Index must be between 0 and size");
                                                    }
                                                } else if (list2.size() > 0) {
                                                    p61.x(list2.get(0));
                                                    uz4Var.c(0);
                                                    throw null;
                                                }
                                                gcVar.t0.d(i6, ue7Var7);
                                                ue7Var3.d(i6, f05VarA4);
                                            } else {
                                                bt.i(ie2.h("Can't have more than ", i7, " custom actions for one widget"));
                                            }
                                        }
                                    }
                                    h4Var3.t(vr3.L(y07Var, resources));
                                    iD = gcVar.D0.d(i6);
                                    if (iD != -1) {
                                        gv3.V(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                        androidComposeView = androidComposeView2;
                                        accessibilityNodeInfo5.setTraversalBefore(androidComposeView, iD);
                                        gcVar.j(i6, h4Var3, gcVar.F0, null);
                                    } else {
                                        androidComposeView = androidComposeView2;
                                    }
                                    iD2 = gcVar.E0.d(i6);
                                    if (iD2 != -1) {
                                        gv3.V(androidComposeView.getAndroidViewsHandler$ui(), iD2);
                                    }
                                    str3 = (String) g33.x(t07Var3, km4.j);
                                    if (str3 != null) {
                                        h4Var3.m(str3);
                                    }
                                    h4Var4 = h4Var3;
                                }
                                return null;
                            }
                        }
                        gcVar = gcVar2;
                        i6 = i;
                        h4Var4 = null;
                    }
                }
                if (!gcVar.q0) {
                    return h4Var4;
                }
                if (i6 == gcVar.m0) {
                    gcVar.o0 = h4Var4;
                }
                if (i6 != gcVar.n0) {
                    return h4Var4;
                }
                gcVar.p0 = h4Var4;
                return h4Var4;
            default:
                return new h4(AccessibilityNodeInfo.obtain(((j62) t3Var).q(i).a));
        }
    }

    @Override // defpackage.wl6
    public final h4 N(int i) {
        byte b = this.j0;
        t3 t3Var = this.k0;
        switch (b) {
            case 0:
                gc gcVar = (gc) t3Var;
                if (i != 1) {
                    if (i == 2) {
                        return L(gcVar.m0);
                    }
                    bt.q(pc6.j(i, "Unknown focus type: "));
                    return null;
                }
                int i2 = gcVar.n0;
                if (i2 == Integer.MIN_VALUE) {
                    return null;
                }
                return L(i2);
            default:
                j62 j62Var = (j62) t3Var;
                int i3 = i == 2 ? j62Var.m0 : j62Var.n0;
                if (i3 == Integer.MIN_VALUE) {
                    return null;
                }
                return L(i3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:119:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:179:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:285:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:286:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:289:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:290:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:293:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:294:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:297:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:298:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:301:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:302:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:305:0x04da  */
    /* JADX WARN: Code duplicated, block: B:306:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:313:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:320:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:323:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:325:0x0501  */
    /* JADX WARN: Code duplicated, block: B:328:0x050c  */
    /* JADX WARN: Code duplicated, block: B:331:0x0511  */
    /* JADX WARN: Code duplicated, block: B:333:0x0515  */
    /* JADX WARN: Code duplicated, block: B:335:0x051d  */
    /* JADX WARN: Code duplicated, block: B:336:0x051f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:340:0x0525  */
    /* JADX WARN: Code duplicated, block: B:343:0x052a  */
    /* JADX WARN: Code duplicated, block: B:345:0x0532  */
    /* JADX WARN: Code duplicated, block: B:347:0x0538  */
    /* JADX WARN: Code duplicated, block: B:350:0x053f  */
    /* JADX WARN: Code duplicated, block: B:351:0x0552  */
    /* JADX WARN: Code duplicated, block: B:353:0x056d  */
    /* JADX WARN: Code duplicated, block: B:356:0x0572  */
    /* JADX WARN: Code duplicated, block: B:361:0x058c  */
    /* JADX WARN: Code duplicated, block: B:364:0x0595  */
    /* JADX WARN: Code duplicated, block: B:368:0x059c  */
    /* JADX WARN: Code duplicated, block: B:370:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:373:0x05ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:411:0x062d  */
    /* JADX WARN: Code duplicated, block: B:414:0x0639  */
    /* JADX WARN: Code duplicated, block: B:417:0x063e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:419:0x0642  */
    /* JADX WARN: Code duplicated, block: B:420:0x0647  */
    /* JADX WARN: Code duplicated, block: B:422:0x0650 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:423:0x0652  */
    /* JADX WARN: Code duplicated, block: B:426:0x0659  */
    /* JADX WARN: Code duplicated, block: B:428:0x0661  */
    /* JADX WARN: Code duplicated, block: B:434:0x067e  */
    /* JADX WARN: Code duplicated, block: B:436:0x0682  */
    /* JADX WARN: Code duplicated, block: B:438:0x068a  */
    /* JADX WARN: Code duplicated, block: B:439:0x068c  */
    /* JADX WARN: Code duplicated, block: B:441:0x0690  */
    /* JADX WARN: Code duplicated, block: B:443:0x0696  */
    /* JADX WARN: Code duplicated, block: B:444:0x0698  */
    /* JADX WARN: Code duplicated, block: B:447:0x069d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:509:0x078e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:510:0x0790  */
    /* JADX WARN: Code duplicated, block: B:512:0x079e  */
    /* JADX WARN: Code duplicated, block: B:513:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:516:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:517:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:523:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:528:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:540:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:545:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:552:0x0806  */
    /* JADX WARN: Code duplicated, block: B:554:0x080a  */
    /* JADX WARN: Code duplicated, block: B:556:0x0818  */
    /* JADX WARN: Code duplicated, block: B:558:0x081c  */
    /* JADX WARN: Code duplicated, block: B:570:0x087e  */
    /* JADX WARN: Code duplicated, block: B:572:0x0885 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:573:0x0887  */
    /* JADX WARN: Code duplicated, block: B:574:0x0889  */
    /* JADX WARN: Code duplicated, block: B:576:0x088f  */
    /* JADX WARN: Code duplicated, block: B:577:0x0894  */
    /* JADX WARN: Code duplicated, block: B:580:0x089c  */
    /* JADX WARN: Code duplicated, block: B:582:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:594:0x08cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:595:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:596:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:599:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:600:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:603:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:605:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:607:0x090e  */
    /* JADX WARN: Code duplicated, block: B:616:0x0929  */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0226, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Switch 'out' block B:33:0x0091 for B:65:0x00e9 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:33:0x0091 for B:66:0x00ec already processed. Defaulting to fallback option. */
    @Override // defpackage.wl6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean S(int r27, int r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 2446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc.S(int, int, android.os.Bundle):boolean");
    }
}
