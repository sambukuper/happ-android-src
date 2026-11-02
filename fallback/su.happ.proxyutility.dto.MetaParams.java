package su.happ.proxyutility.dto;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dh3;
import defpackage.dr;
import defpackage.eq8;
import defpackage.fm7;
import defpackage.gn2;
import defpackage.ie2;
import defpackage.jk5;
import defpackage.k32;
import defpackage.kf3;
import defpackage.la2;
import defpackage.m40;
import defpackage.md8;
import defpackage.mm7;
import defpackage.nm7;
import defpackage.oi0;
import defpackage.p05;
import defpackage.p61;
import defpackage.pc6;
import defpackage.qg5;
import defpackage.ss8;
import defpackage.vn5;
import defpackage.w27;
import defpackage.w39;
import defpackage.we3;
import defpackage.we5;
import defpackage.wv0;
import defpackage.x97;
import defpackage.xv0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.RealWebSocket;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.enums.EIpType;
import su.happ.proxyutility.dto.enums.EPingType;
import su.happ.proxyutility.dto.enums.FragmentationDelay;
import su.happ.proxyutility.dto.enums.FragmentationLength;
import su.happ.proxyutility.dto.enums.FragmentationPackets;
import su.happ.proxyutility.dto.enums.FragmentationType;
import su.happ.proxyutility.dto.enums.GeoUserAgent;
import su.happ.proxyutility.dto.enums.GoPingType;
import su.happ.proxyutility.dto.enums.InboundAuthMode;
import su.happ.proxyutility.dto.enums.MuxQuicType;
import su.happ.proxyutility.dto.enums.NoisesPacketType;
import su.happ.proxyutility.dto.enums.SubInfoColor;
import su.happ.proxyutility.dto.enums.SubscriptionAutoConnectType;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 ï\u00022\u00020\u0001:\u0004ð\u0002ï\u0002R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR$\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR$\u0010(\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR$\u00104\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0004\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR$\u00107\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR$\u0010:\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0004\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR$\u0010=\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR$\u0010@\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0004\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\bR$\u0010C\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010)\u001a\u0004\bD\u0010+\"\u0004\bE\u0010-R$\u0010F\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010)\u001a\u0004\bG\u0010+\"\u0004\bH\u0010-R$\u0010J\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010P\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010)\u001a\u0004\bQ\u0010+\"\u0004\bR\u0010-R$\u0010S\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010)\u001a\u0004\bT\u0010+\"\u0004\bU\u0010-R$\u0010W\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010^\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010\u0004\u001a\u0004\b_\u0010\u0006\"\u0004\b`\u0010\bR$\u0010b\u001a\u0004\u0018\u00010a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010\u0004\u001a\u0004\bc\u0010\u0006\"\u0004\bd\u0010\bR*\u0010e\u001a\u0004\u0018\u00010a8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\be\u0010\u0004\u0012\u0004\bh\u0010i\u001a\u0004\bf\u0010\u0006\"\u0004\bg\u0010\bR$\u0010k\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010q\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010\u0004\u001a\u0004\br\u0010\u0006\"\u0004\bs\u0010\bR$\u0010t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010\u0004\u001a\u0004\bu\u0010\u0006\"\u0004\bv\u0010\bR$\u0010w\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010)\u001a\u0004\bx\u0010+\"\u0004\by\u0010-R%\u0010{\u001a\u0004\u0018\u00010z8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R(\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010\u0004\u001a\u0005\b\u0082\u0001\u0010\u0006\"\u0005\b\u0083\u0001\u0010\bR(\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010\u0004\u001a\u0005\b\u0085\u0001\u0010\u0006\"\u0005\b\u0086\u0001\u0010\bR(\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010\u0004\u001a\u0005\b\u0088\u0001\u0010\u0006\"\u0005\b\u0089\u0001\u0010\bR(\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010\u0004\u001a\u0005\b\u008b\u0001\u0010\u0006\"\u0005\b\u008c\u0001\u0010\bR(\u0010\u008d\u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010)\u001a\u0005\b\u008e\u0001\u0010+\"\u0005\b\u008f\u0001\u0010-R/\u0010\u0090\u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u0090\u0001\u0010)\u0012\u0005\b\u0093\u0001\u0010i\u001a\u0005\b\u0091\u0001\u0010+\"\u0005\b\u0092\u0001\u0010-R(\u0010\u0094\u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010)\u001a\u0005\b\u0095\u0001\u0010+\"\u0005\b\u0096\u0001\u0010-R(\u0010\u0097\u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010)\u001a\u0005\b\u0098\u0001\u0010+\"\u0005\b\u0099\u0001\u0010-R(\u0010\u009a\u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010)\u001a\u0005\b\u009b\u0001\u0010+\"\u0005\b\u009c\u0001\u0010-R(\u0010\u009d\u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010)\u001a\u0005\b\u009e\u0001\u0010+\"\u0005\b\u009f\u0001\u0010-R(\u0010 \u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010)\u001a\u0005\b¡\u0001\u0010+\"\u0005\b¢\u0001\u0010-R,\u0010¤\u0001\u001a\u0005\u0018\u00010£\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R(\u0010ª\u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bª\u0001\u0010)\u001a\u0005\b«\u0001\u0010+\"\u0005\b¬\u0001\u0010-R(\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u00ad\u0001\u0010\u0004\u001a\u0005\b®\u0001\u0010\u0006\"\u0005\b¯\u0001\u0010\bR(\u0010°\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b°\u0001\u0010\u0004\u001a\u0005\b±\u0001\u0010\u0006\"\u0005\b²\u0001\u0010\bR(\u0010³\u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b³\u0001\u0010)\u001a\u0005\b´\u0001\u0010+\"\u0005\bµ\u0001\u0010-R(\u0010¶\u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¶\u0001\u0010)\u001a\u0005\b·\u0001\u0010+\"\u0005\b¸\u0001\u0010-R(\u0010¹\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¹\u0001\u0010\u0004\u001a\u0005\bº\u0001\u0010\u0006\"\u0005\b»\u0001\u0010\bR(\u0010¼\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¼\u0001\u0010\u0004\u001a\u0005\b½\u0001\u0010\u0006\"\u0005\b¾\u0001\u0010\bR,\u0010À\u0001\u001a\u0005\u0018\u00010¿\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R2\u0010Ç\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010Æ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R2\u0010Í\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010Æ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÍ\u0001\u0010È\u0001\u001a\u0006\bÎ\u0001\u0010Ê\u0001\"\u0006\bÏ\u0001\u0010Ì\u0001R2\u0010Ð\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010Æ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010È\u0001\u001a\u0006\bÑ\u0001\u0010Ê\u0001\"\u0006\bÒ\u0001\u0010Ì\u0001R(\u0010Ó\u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÓ\u0001\u0010)\u001a\u0005\bÔ\u0001\u0010+\"\u0005\bÕ\u0001\u0010-R(\u0010Ö\u0001\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÖ\u0001\u0010\u000b\u001a\u0005\b×\u0001\u0010\r\"\u0005\bØ\u0001\u0010\u000fR(\u0010Ù\u0001\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÙ\u0001\u0010\u000b\u001a\u0005\bÚ\u0001\u0010\r\"\u0005\bÛ\u0001\u0010\u000fR,\u0010Ý\u0001\u001a\u0005\u0018\u00010Ü\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R(\u0010ã\u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bã\u0001\u0010)\u001a\u0005\bä\u0001\u0010+\"\u0005\bå\u0001\u0010-R,\u0010ç\u0001\u001a\u0005\u0018\u00010æ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001\"\u0006\bë\u0001\u0010ì\u0001R(\u0010í\u0001\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bí\u0001\u0010)\u001a\u0005\bî\u0001\u0010+\"\u0005\bï\u0001\u0010-R,\u0010ñ\u0001\u001a\u0005\u0018\u00010ð\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bñ\u0001\u0010ò\u0001\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001R(\u0010÷\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b÷\u0001\u0010\u0004\u001a\u0005\bø\u0001\u0010\u0006\"\u0005\bù\u0001\u0010\bR(\u0010ú\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bú\u0001\u0010\u0004\u001a\u0005\bû\u0001\u0010\u0006\"\u0005\bü\u0001\u0010\bR,\u0010þ\u0001\u001a\u0005\u0018\u00010ý\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bþ\u0001\u0010ÿ\u0001\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002\"\u0006\b\u0082\u0002\u0010\u0083\u0002R(\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0002\u0010\u0004\u001a\u0005\b\u0085\u0002\u0010\u0006\"\u0005\b\u0086\u0002\u0010\bR(\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0087\u0002\u0010\u0004\u001a\u0005\b\u0088\u0002\u0010\u0006\"\u0005\b\u0089\u0002\u0010\bR(\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0002\u0010\u0004\u001a\u0005\b\u008b\u0002\u0010\u0006\"\u0005\b\u008c\u0002\u0010\bR(\u0010\u008d\u0002\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008d\u0002\u0010)\u001a\u0005\b\u008e\u0002\u0010+\"\u0005\b\u008f\u0002\u0010-R(\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0090\u0002\u0010\u0004\u001a\u0005\b\u0091\u0002\u0010\u0006\"\u0005\b\u0092\u0002\u0010\bR(\u0010\u0093\u0002\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0002\u0010)\u001a\u0005\b\u0094\u0002\u0010+\"\u0005\b\u0095\u0002\u0010-R(\u0010\u0096\u0002\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0096\u0002\u0010)\u001a\u0005\b\u0097\u0002\u0010+\"\u0005\b\u0098\u0002\u0010-R(\u0010\u0099\u0002\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0099\u0002\u0010)\u001a\u0005\b\u009a\u0002\u0010+\"\u0005\b\u009b\u0002\u0010-R(\u0010\u009c\u0002\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009c\u0002\u0010)\u001a\u0005\b\u009d\u0002\u0010+\"\u0005\b\u009e\u0002\u0010-R,\u0010 \u0002\u001a\u0005\u0018\u00010\u009f\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b \u0002\u0010¡\u0002\u001a\u0006\b¢\u0002\u0010£\u0002\"\u0006\b¤\u0002\u0010¥\u0002R(\u0010¦\u0002\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¦\u0002\u0010)\u001a\u0005\b§\u0002\u0010+\"\u0005\b¨\u0002\u0010-R,\u0010ª\u0002\u001a\u0005\u0018\u00010©\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bª\u0002\u0010«\u0002\u001a\u0006\b¬\u0002\u0010\u00ad\u0002\"\u0006\b®\u0002\u0010¯\u0002R(\u0010°\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b°\u0002\u0010\u0004\u001a\u0005\b±\u0002\u0010\u0006\"\u0005\b²\u0002\u0010\bR(\u0010³\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b³\u0002\u0010\u0004\u001a\u0005\b´\u0002\u0010\u0006\"\u0005\bµ\u0002\u0010\bR(\u0010¶\u0002\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¶\u0002\u0010)\u001a\u0005\b·\u0002\u0010+\"\u0005\b¸\u0002\u0010-R,\u0010¹\u0002\u001a\u0005\u0018\u00010©\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¹\u0002\u0010«\u0002\u001a\u0006\bº\u0002\u0010\u00ad\u0002\"\u0006\b»\u0002\u0010¯\u0002R(\u0010¼\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¼\u0002\u0010\u0004\u001a\u0005\b½\u0002\u0010\u0006\"\u0005\b¾\u0002\u0010\bR(\u0010¿\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¿\u0002\u0010\u0004\u001a\u0005\bÀ\u0002\u0010\u0006\"\u0005\bÁ\u0002\u0010\bR,\u0010Ã\u0002\u001a\u0005\u0018\u00010Â\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÃ\u0002\u0010Ä\u0002\u001a\u0006\bÅ\u0002\u0010Æ\u0002\"\u0006\bÇ\u0002\u0010È\u0002R(\u0010É\u0002\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÉ\u0002\u0010\u000b\u001a\u0005\bÊ\u0002\u0010\r\"\u0005\bË\u0002\u0010\u000fR(\u0010Ì\u0002\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÌ\u0002\u0010)\u001a\u0005\bÍ\u0002\u0010+\"\u0005\bÎ\u0002\u0010-R(\u0010Ï\u0002\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÏ\u0002\u0010\u000b\u001a\u0005\bÐ\u0002\u0010\r\"\u0005\bÑ\u0002\u0010\u000fR(\u0010Ò\u0002\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÒ\u0002\u0010)\u001a\u0005\bÓ\u0002\u0010+\"\u0005\bÔ\u0002\u0010-R,\u0010Ö\u0002\u001a\u0005\u0018\u00010Õ\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÖ\u0002\u0010×\u0002\u001a\u0006\bØ\u0002\u0010Ù\u0002\"\u0006\bÚ\u0002\u0010Û\u0002R(\u0010Ü\u0002\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÜ\u0002\u0010\u000b\u001a\u0005\bÝ\u0002\u0010\r\"\u0005\bÞ\u0002\u0010\u000fR(\u0010ß\u0002\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bß\u0002\u0010)\u001a\u0005\bà\u0002\u0010+\"\u0005\bá\u0002\u0010-R(\u0010â\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bâ\u0002\u0010\u0004\u001a\u0005\bã\u0002\u0010\u0006\"\u0005\bä\u0002\u0010\bR(\u0010å\u0002\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bå\u0002\u0010)\u001a\u0005\bæ\u0002\u0010+\"\u0005\bç\u0002\u0010-R,\u0010é\u0002\u001a\u0005\u0018\u00010è\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bé\u0002\u0010ê\u0002\u001a\u0006\bë\u0002\u0010ì\u0002\"\u0006\bí\u0002\u0010î\u0002¨\u0006ñ\u0002"}, d2 = {"Lsu/happ/proxyutility/dto/MetaParams;", "Landroid/os/Parcelable;", _UrlKt.FRAGMENT_ENCODE_SET, "profileTitle", "Ljava/lang/String;", "s0", "()Ljava/lang/String;", "i2", "(Ljava/lang/String;)V", _UrlKt.FRAGMENT_ENCODE_SET, "profileUpdateInterval", "Ljava/lang/Integer;", "t0", "()Ljava/lang/Integer;", "j2", "(Ljava/lang/Integer;)V", "Lsu/happ/proxyutility/dto/SubscriptionUserInfo;", "subscriptionUserInfo", "Lsu/happ/proxyutility/dto/SubscriptionUserInfo;", "Z0", "()Lsu/happ/proxyutility/dto/SubscriptionUserInfo;", "P2", "(Lsu/happ/proxyutility/dto/SubscriptionUserInfo;)V", "profileWebPageUrl", "u0", "k2", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;", "fragmentBean", "Ljava/util/Map;", "F", "()Ljava/util/Map;", "v1", "(Ljava/util/Map;)V", "resolveAddress", "A0", "q2", MetaParams.HOST, "P", "F1", _UrlKt.FRAGMENT_ENCODE_SET, MetaParams.INSECURE, "Ljava/lang/Boolean;", "U", "()Ljava/lang/Boolean;", "K1", "(Ljava/lang/Boolean;)V", MetaParams.ANNOUNCE, "d", "l1", "supportUrl", "d1", "T2", MetaParams.ROUTING, "E0", "u2", "newUrl", "d0", "T1", "newDomain", "c0", "S1", "providerId", "v0", "l2", "installId", "V", "L1", "subscriptionAutoConnect", "R0", "H2", "subscriptionPingOnOpenEnabled", "W0", "M2", "Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;", "subscriptionAutoConnectType", "Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;", "S0", "()Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;", "I2", "(Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;)V", "routingEnable", "F0", "v2", "fragmentationEnable", "I", "y1", "Lsu/happ/proxyutility/dto/enums/FragmentationPackets;", "fragmentationPackets", "Lsu/happ/proxyutility/dto/enums/FragmentationPackets;", "M", "()Lsu/happ/proxyutility/dto/enums/FragmentationPackets;", "C1", "(Lsu/happ/proxyutility/dto/enums/FragmentationPackets;)V", "Lsu/happ/proxyutility/dto/enums/FragmentationLength;", "fragmentationLength", "K", "A1", "Lsu/happ/proxyutility/dto/enums/FragmentationDelay;", "fragmentationDelay", "H", "x1", "fragmentationInterval", "J", "z1", "getFragmentationInterval-1HOOb-4$annotations", "()V", "Lsu/happ/proxyutility/dto/enums/FragmentationType;", "fragmentationType", "Lsu/happ/proxyutility/dto/enums/FragmentationType;", "N", "()Lsu/happ/proxyutility/dto/enums/FragmentationType;", "D1", "(Lsu/happ/proxyutility/dto/enums/FragmentationType;)V", "fragmentationAdvancedParam", "G", "w1", "fragmentationMaxSplit", "L", "B1", "noisesEnable", "f0", "V1", "Lsu/happ/proxyutility/dto/enums/NoisesPacketType;", "noisesPacketType", "Lsu/happ/proxyutility/dto/enums/NoisesPacketType;", "h0", "()Lsu/happ/proxyutility/dto/enums/NoisesPacketType;", "X1", "(Lsu/happ/proxyutility/dto/enums/NoisesPacketType;)V", "noisesPacket", "g0", "W1", "noisesDelay", "e0", "U1", "noisesRand", "i0", "Y1", "noisesRandRange", "j0", "Z1", "localDnsEnable", "W", "M1", "subscriptionAutoUpdateEnable", "getSubscriptionAutoUpdateEnable", "setSubscriptionAutoUpdateEnable", "getSubscriptionAutoUpdateEnable$annotations", "subscriptionAutoUpdateOpenEnable", "T0", "J2", "subscriptionSendHwidEnabled", "Y0", "O2", "subscriptionAlwaysHwidEnable", "Q0", "G2", "subscriptionHwidInCookieEnable", "U0", "K2", "notificationsSubsExpire", "k0", "a2", "Lsu/happ/proxyutility/dto/enums/EPingType;", "pingType", "Lsu/happ/proxyutility/dto/enums/EPingType;", "q0", "()Lsu/happ/proxyutility/dto/enums/EPingType;", "g2", "(Lsu/happ/proxyutility/dto/enums/EPingType;)V", "hideSettings", "O", "E1", "changeUserAgent", "k", "o1", "checkUrlViaProxy", "l", "p1", "appAutoStart", "e", "m1", "resolveAddressServerEnable", "D0", "t2", "resolveAddressServerDnsIp", "C0", "s2", "resolveAddressServerDnsDomain", "B0", "r2", "Ljk5;", "perAppProxyMode", "Ljk5;", "o0", "()Ljk5;", "e2", "(Ljk5;)V", _UrlKt.FRAGMENT_ENCODE_SET, "perAppProxyList", "Ljava/util/List;", "l0", "()Ljava/util/List;", "b2", "(Ljava/util/List;)V", "perAppProxyListSet", "n0", "d2", "perAppProxyListInvert", "m0", "c2", "muxEnable", "Y", "O1", "muxTcpConnections", "a0", "Q1", "muxXudpConnections", "b0", "R1", "Lsu/happ/proxyutility/dto/enums/MuxQuicType;", "muxQuic", "Lsu/happ/proxyutility/dto/enums/MuxQuicType;", "Z", "()Lsu/happ/proxyutility/dto/enums/MuxQuicType;", "P1", "(Lsu/happ/proxyutility/dto/enums/MuxQuicType;)V", "sniffingEnable", "G0", "w2", "Lsu/happ/proxyutility/dto/enums/EIpType;", "preferredIpType", "Lsu/happ/proxyutility/dto/enums/EIpType;", "r0", "()Lsu/happ/proxyutility/dto/enums/EIpType;", "h2", "(Lsu/happ/proxyutility/dto/enums/EIpType;)V", "subscriptionsCollapse", "a1", "Q2", "Lvn5;", "pingResult", "Lvn5;", "p0", "()Lvn5;", "f2", "(Lvn5;)V", "excludeRoutes", "u", "s1", "excludeRoutesSet", "y", "t1", "Lsu/happ/proxyutility/dto/enums/SubInfoColor;", "subInfoColor", "Lsu/happ/proxyutility/dto/enums/SubInfoColor;", "O0", "()Lsu/happ/proxyutility/dto/enums/SubInfoColor;", "E2", "(Lsu/happ/proxyutility/dto/enums/SubInfoColor;)V", "subInfoText", "P0", "F2", "subInfoButtonText", "N0", "D2", "subInfoButtonLink", "M0", "C2", "subExpire", "K0", "A2", "subExpireButtonLink", "L0", "B2", "subscriptionsExpandNow", "b1", "R2", "subscriptionPin", "V0", "L2", "dontUseFilter", "p", "r1", "manualBlockUserAgent", "X", "N1", "Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;", "subscriptionsSortType", "Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;", "c1", "()Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;", "S2", "(Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;)V", "dnsFromJsonEnable", "m", "q1", "Lsu/happ/proxyutility/dto/enums/InboundAuthMode;", "socksAuthMode", "Lsu/happ/proxyutility/dto/enums/InboundAuthMode;", "H0", "()Lsu/happ/proxyutility/dto/enums/InboundAuthMode;", "x2", "(Lsu/happ/proxyutility/dto/enums/InboundAuthMode;)V", "socksAuthUser", "J0", "z2", "socksAuthPassword", "I0", "y2", "inboundHttpEnable", "T", "J1", "httpAuthMode", "Q", "G1", "httpAuthUser", "S", "I1", "httpAuthPassword", "R", "H1", "Lsu/happ/proxyutility/dto/enums/GeoUserAgent;", "userAgentGeoFiles", "Lsu/happ/proxyutility/dto/enums/GeoUserAgent;", "f1", "()Lsu/happ/proxyutility/dto/enums/GeoUserAgent;", "V2", "(Lsu/happ/proxyutility/dto/enums/GeoUserAgent;)V", "subscriptionRequestTimeout", "X0", "N2", "xrayTunEnable", "g1", "W2", "xrayTunMtu", "h1", "X2", "blockBindToTunnelEnable", "g", "n1", "Lsu/happ/proxyutility/dto/enums/GoPingType;", "proxyPingMode", "Lsu/happ/proxyutility/dto/enums/GoPingType;", "w0", "()Lsu/happ/proxyutility/dto/enums/GoPingType;", "m2", "(Lsu/happ/proxyutility/dto/enums/GoPingType;)V", "proxyPingTimeout", "x0", "n2", "useOkhttpLegacy", "e1", "U2", "fallbackUrl", "E", "u1", MetaParams.RESET, "y0", "o2", "Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;", "resetInfo", "Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;", "z0", "()Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;", "p2", "(Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;)V", "Companion", "ResetInfo", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MetaParams implements Parcelable {
    public static final int $stable = 8;
    public static final String ANNOUNCE = "announce";
    public static final String APP_AUTO_START = "app-auto-start";
    public static final String BLOCK_BIND_TO_TUNNEL_ENABLE = "block-bind-to-tunnel-enable";
    public static final String CHANGE_USER_AGENT = "change-user-agent";
    public static final String CHECK_URL_VIA_PROXY = "check-url-via-proxy";
    public static final String DNS_FROM_JSON_ENABLE = "dns-from-json-enable";
    public static final String DONT_USE_FILTER = "dont-use-filter";
    public static final String EXCLUDE_ROUTES = "exclude-routes";
    public static final String EXCLUDE_ROUTES_SET = "exclude-routes-set";
    public static final String FALLBACK_URL = "fallback-url";
    public static final String FRAGMENT = "fragment";
    public static final String FRAGMENTATION_ADVANCED_PARAM = "fragmentation-advanced-param";
    public static final String FRAGMENTATION_DELAY = "fragmentation-delay";
    public static final String FRAGMENTATION_ENABLE = "fragmentation-enable";
    public static final String FRAGMENTATION_INTERVAL = "fragmentation-interval";
    public static final String FRAGMENTATION_LENGTH = "fragmentation-length";
    public static final String FRAGMENTATION_MAX_SPLIT = "fragmentation-maxsplit";
    public static final String FRAGMENTATION_PACKETS = "fragmentation-packets";
    public static final String FRAGMENTATION_TYPE = "fragmentation-type";
    public static final String HIDE_SETTINGS = "hide-settings";
    public static final String HOST = "host";
    public static final String HTTP_AUTH_MODE = "http-auth-mode";
    public static final String HTTP_AUTH_PASSWORD = "http-auth-password";
    public static final String HTTP_AUTH_USER = "http-auth-user";
    public static final String HWIDLINK = "hwidlink";
    public static final String INBOUND_HTTP_ENABLE = "inbound-http-enable";
    public static final String INSECURE = "insecure";
    public static final String INSTALL_ID = "installid";
    public static final String LOCAL_DNS_ENABLE = "local-dns-enable";
    public static final String MANUAL_BLOCK_USER_AGENT = "manual-block-user-agent";
    public static final int MAX_LENGTH_VISIBLE_ANNOUNCE = 200;
    public static final String MUX_ENABLE = "mux-enable";
    public static final String MUX_QUIC = "mux-quic";
    public static final String MUX_TCP_CONNECTIONS = "mux-tcp-connections";
    public static final String MUX_XUDP_CONNECTIONS = "mux-xudp-connections";
    public static final String NEW_DOMAIN = "new-domain";
    public static final String NEW_URL = "new-url";
    public static final String NOISES_DELAY = "noises-delay";
    public static final String NOISES_ENABLE = "noises-enable";
    public static final String NOISES_PACKET = "noises-packet";
    public static final String NOISES_PACKET_TYPE = "noises-packet-type";
    public static final String NOISES_RAND = "noises-rand";
    public static final String NOISES_RAND_RANGE = "noises-rand-range";
    public static final String NOTIFICATION_SUBS_EXPIRE = "notification-subs-expire";
    public static final String PER_APP_PROXY_LIST = "per-app-proxy-list";
    public static final String PER_APP_PROXY_LIST_INVERT = "per-app-proxy-list-invert";
    public static final String PER_APP_PROXY_LIST_SET = "per-app-proxy-list-set";
    public static final String PER_APP_PROXY_MODE = "per-app-proxy-mode";
    public static final String PING_RESULT = "ping-result";
    public static final String PING_TYPE = "ping-type";
    public static final String PREFERRED_IP_TYPE = "preferred-ip-type";
    public static final String PREFIX_BASE_64 = "base64:";
    public static final String PROFILE_TITLE = "profile-title";
    public static final String PROFILE_UPDATE_INTERVAL = "profile-update-interval";
    public static final String PROFILE_WEB_PAGE_URL = "profile-web-page-url";
    public static final String PROVIDER_ID = "providerid";
    public static final String PROXY_PING_MODE = "proxy-ping-mode";
    public static final String PROXY_PING_TIMEOUT = "proxy-ping-timeout";
    private static final String RESET = "reset";
    public static final String RESOLVE_ADDRESS = "resolve-address";
    public static final String RESOLVE_SERVER_ADDRESS_DNS_DOMAIN = "server-address-resolve-dns-domain";
    public static final String RESOLVE_SERVER_ADDRESS_DNS_IP = "server-address-resolve-dns-ip";
    public static final String RESOLVE_SERVER_ADDRESS_ENABLE = "server-address-resolve-enable";
    public static final String ROUTING = "routing";
    public static final String ROUTING_ENABLE = "routing-enable";
    public static final String SNIFFING_ENABLE = "sniffing-enable";
    public static final String SOCKS_AUTH_MODE = "socks-auth-mode";
    public static final String SOCKS_AUTH_PASSWORD = "socks-auth-password";
    public static final String SOCKS_AUTH_USER = "socks-auth-user";
    public static final String SUBSCRIPTIONS_COLLAPSE = "subscriptions-collapse";
    public static final String SUBSCRIPTIONS_EXPAND_NOW = "subscriptions-expand-now";
    public static final String SUBSCRIPTIONS_SORT_TYPE = "subscriptions-sort-type";
    public static final String SUBSCRIPTION_ALWAYS_HWID_ENABLE = "subscription-always-hwid-enable";
    public static final String SUBSCRIPTION_AUTOCONNECT = "subscription-autoconnect";
    public static final String SUBSCRIPTION_AUTOCONNECT_TYPE = "subscription-autoconnect-type";
    public static final String SUBSCRIPTION_AUTO_UPDATE_OPEN_ENABLE = "subscription-auto-update-open-enable";
    public static final String SUBSCRIPTION_HWID_IN_COOKIE_ENABLE = "subscription-hwid-in-cookie-enable";
    public static final String SUBSCRIPTION_PIN = "subscription-pin";
    public static final String SUBSCRIPTION_PING_ONOPEN_ENABLED = "subscription-ping-onopen-enabled";
    public static final String SUBSCRIPTION_REQUEST_TIMEOUT = "subscription-request-timeout";
    public static final String SUBSCRIPTION_SEND_HWID_ENABLED = "subscription-send-hwid-enabled";
    public static final String SUBSCRIPTION_SORT_TYPE = "subscription-sort-type";
    public static final String SUBSCRIPTION_USER_INFO = "subscription-userinfo";
    private static final String SUBSCRIPTION_USER_INFO_DOWNLOAD = "download";
    private static final String SUBSCRIPTION_USER_INFO_EXPIRE = "expire";
    private static final String SUBSCRIPTION_USER_INFO_TOTAL = "total";
    private static final String SUBSCRIPTION_USER_INFO_UPLOAD = "upload";
    public static final String SUB_EXPIRE = "sub-expire";
    public static final String SUB_EXPIRE_BUTTON_LINK = "sub-expire-button-link";
    public static final String SUB_INFO_BUTTON_LINK = "sub-info-button-link";
    public static final String SUB_INFO_BUTTON_TEXT = "sub-info-button-text";
    public static final String SUB_INFO_COLOR = "sub-info-color";
    public static final String SUB_INFO_TEXT = "sub-info-text";
    public static final String SUPPPORT_URL = "support-url";
    public static final String USER_AGENT_GEO_FILES = "user-agent-geo-files";
    public static final String USE_OKHTTP_LEGACY = "use-okhttp-legacy";
    public static final String XRAY_TUN_ENABLE = "xray-tun-enable";
    public static final String XRAY_TUN_MTU = "xray-tun-mtu";
    private String announce;
    private Boolean appAutoStart;
    private Boolean blockBindToTunnelEnable;
    private String changeUserAgent;
    private String checkUrlViaProxy;
    private Boolean dnsFromJsonEnable;
    private Boolean dontUseFilter;
    private String excludeRoutes;
    private String excludeRoutesSet;
    private String fallbackUrl;
    private Map<String, Object> fragmentBean;
    private String fragmentationAdvancedParam;
    private String fragmentationDelay;
    private Boolean fragmentationEnable;
    private String fragmentationInterval;
    private String fragmentationLength;
    private String fragmentationMaxSplit;
    private FragmentationPackets fragmentationPackets;
    private FragmentationType fragmentationType;
    private Boolean hideSettings;
    private String host;
    private InboundAuthMode httpAuthMode;
    private String httpAuthPassword;
    private String httpAuthUser;
    private Boolean inboundHttpEnable;
    private Boolean insecure;
    private String installId;
    private Boolean localDnsEnable;
    private Boolean manualBlockUserAgent;
    private Boolean muxEnable;
    private MuxQuicType muxQuic;
    private Integer muxTcpConnections;
    private Integer muxXudpConnections;
    private String newDomain;
    private String newUrl;
    private String noisesDelay;
    private Boolean noisesEnable;
    private String noisesPacket;
    private NoisesPacketType noisesPacketType;
    private String noisesRand;
    private String noisesRandRange;
    private Boolean notificationsSubsExpire;
    private List<String> perAppProxyList;
    private List<String> perAppProxyListInvert;
    private List<String> perAppProxyListSet;
    private jk5 perAppProxyMode;
    private vn5 pingResult;
    private EPingType pingType;
    private EIpType preferredIpType;
    private String profileTitle;
    private Integer profileUpdateInterval;
    private String profileWebPageUrl;
    private String providerId;
    private GoPingType proxyPingMode;
    private Integer proxyPingTimeout;
    private Boolean reset;
    private ResetInfo resetInfo;
    private String resolveAddress;
    private String resolveAddressServerDnsDomain;
    private String resolveAddressServerDnsIp;
    private Boolean resolveAddressServerEnable;
    private String routing;
    private Boolean routingEnable;
    private Boolean sniffingEnable;
    private InboundAuthMode socksAuthMode;
    private String socksAuthPassword;
    private String socksAuthUser;
    private Boolean subExpire;
    private String subExpireButtonLink;
    private String subInfoButtonLink;
    private String subInfoButtonText;
    private SubInfoColor subInfoColor;
    private String subInfoText;
    private Boolean subscriptionAlwaysHwidEnable;
    private Boolean subscriptionAutoConnect;
    private SubscriptionAutoConnectType subscriptionAutoConnectType;
    private Boolean subscriptionAutoUpdateEnable;
    private Boolean subscriptionAutoUpdateOpenEnable;
    private Boolean subscriptionHwidInCookieEnable;
    private Boolean subscriptionPin;
    private Boolean subscriptionPingOnOpenEnabled;
    private Integer subscriptionRequestTimeout;
    private Boolean subscriptionSendHwidEnabled;
    private SubscriptionUserInfo subscriptionUserInfo;
    private Boolean subscriptionsCollapse;
    private Boolean subscriptionsExpandNow;
    private SubscriptionSortType subscriptionsSortType;
    private String supportUrl;
    private Boolean useOkhttpLegacy;
    private GeoUserAgent userAgentGeoFiles;
    private Boolean xrayTunEnable;
    private Integer xrayTunMtu;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Parcelable.Creator<MetaParams> CREATOR = new Creator();

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\ba\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0014\u0010$\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0014\u0010(\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0014\u0010)\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0014\u0010*\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0004R\u0014\u0010+\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0004R\u0014\u0010,\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0004R\u0014\u0010-\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0004R\u0014\u0010.\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0004R\u0014\u0010/\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0004R\u0014\u00100\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0004R\u0014\u00101\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0004R\u0014\u00102\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0004R\u0014\u00103\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0004R\u0014\u00104\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0004R\u0014\u00105\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0004R\u0014\u00106\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0004R\u0014\u00107\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0004R\u0014\u00108\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0004R\u0014\u00109\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u0004R\u0014\u0010:\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u0004R\u0014\u0010;\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0004R\u0014\u0010<\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0004R\u0014\u0010=\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u0004R\u0014\u0010>\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0004R\u0014\u0010?\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\u0004R\u0014\u0010@\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u0004R\u0014\u0010A\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\u0004R\u0014\u0010B\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010\u0004R\u0014\u0010C\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010\u0004R\u0014\u0010D\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010\u0004R\u0014\u0010E\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010\u0004R\u0014\u0010F\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010\u0004R\u0014\u0010G\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010\u0004R\u0014\u0010H\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010\u0004R\u0014\u0010I\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010\u0004R\u0014\u0010J\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010\u0004R\u0014\u0010K\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010\u0004R\u0014\u0010L\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010\u0004R\u0014\u0010M\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010\u0004R\u0014\u0010N\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010\u0004R\u0014\u0010O\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010\u0004R\u0014\u0010P\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010\u0004R\u0014\u0010Q\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010\u0004R\u0014\u0010R\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bR\u0010\u0004R\u0014\u0010S\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010\u0004R\u0014\u0010T\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bT\u0010\u0004R\u0014\u0010U\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010\u0004R\u0014\u0010V\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bV\u0010\u0004R\u0014\u0010W\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010\u0004R\u0014\u0010X\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bX\u0010\u0004R\u0014\u0010Y\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bY\u0010\u0004R\u0014\u0010Z\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bZ\u0010\u0004R\u0014\u0010[\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b[\u0010\u0004R\u0014\u0010\\\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\\\u0010\u0004R\u0014\u0010]\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b]\u0010\u0004R\u0014\u0010^\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b^\u0010\u0004R\u0014\u0010_\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b_\u0010\u0004R\u0014\u0010`\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b`\u0010\u0004R\u0014\u0010a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\ba\u0010\u0004R\u0014\u0010b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bb\u0010\u0004R\u0014\u0010c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bc\u0010\u0004R\u0014\u0010e\u001a\u00020d8\u0006X\u0086T¢\u0006\u0006\n\u0004\be\u0010f¨\u0006g"}, d2 = {"Lsu/happ/proxyutility/dto/MetaParams$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "PROFILE_TITLE", "Ljava/lang/String;", "PROFILE_UPDATE_INTERVAL", "SUBSCRIPTION_USER_INFO", "SUBSCRIPTION_USER_INFO_UPLOAD", "SUBSCRIPTION_USER_INFO_DOWNLOAD", "SUBSCRIPTION_USER_INFO_TOTAL", "SUBSCRIPTION_USER_INFO_EXPIRE", "PROFILE_WEB_PAGE_URL", "FRAGMENT", "RESOLVE_ADDRESS", "HOST", "INSECURE", "PREFIX_BASE_64", "ANNOUNCE", "SUPPPORT_URL", "ROUTING", "NEW_URL", "NEW_DOMAIN", "PROVIDER_ID", "INSTALL_ID", "SUBSCRIPTION_AUTOCONNECT", "SUBSCRIPTION_PING_ONOPEN_ENABLED", "SUBSCRIPTION_AUTOCONNECT_TYPE", "ROUTING_ENABLE", "FRAGMENTATION_ENABLE", "FRAGMENTATION_PACKETS", "FRAGMENTATION_LENGTH", "FRAGMENTATION_DELAY", "FRAGMENTATION_TYPE", "FRAGMENTATION_ADVANCED_PARAM", "FRAGMENTATION_MAX_SPLIT", "NOISES_ENABLE", "NOISES_PACKET_TYPE", "NOISES_PACKET", "NOISES_DELAY", "NOISES_RAND", "NOISES_RAND_RANGE", "LOCAL_DNS_ENABLE", "SUBSCRIPTION_AUTO_UPDATE_OPEN_ENABLE", "SUBSCRIPTION_SEND_HWID_ENABLED", "SUBSCRIPTION_ALWAYS_HWID_ENABLE", "SUBSCRIPTION_HWID_IN_COOKIE_ENABLE", "NOTIFICATION_SUBS_EXPIRE", "PING_TYPE", "HIDE_SETTINGS", "CHANGE_USER_AGENT", "CHECK_URL_VIA_PROXY", "APP_AUTO_START", "RESOLVE_SERVER_ADDRESS_ENABLE", "RESOLVE_SERVER_ADDRESS_DNS_IP", "RESOLVE_SERVER_ADDRESS_DNS_DOMAIN", "PER_APP_PROXY_MODE", "PER_APP_PROXY_LIST", "PER_APP_PROXY_LIST_SET", "PER_APP_PROXY_LIST_INVERT", "MUX_ENABLE", "MUX_TCP_CONNECTIONS", "MUX_XUDP_CONNECTIONS", "MUX_QUIC", "SNIFFING_ENABLE", "PREFERRED_IP_TYPE", "SUBSCRIPTIONS_COLLAPSE", "PING_RESULT", "EXCLUDE_ROUTES", "EXCLUDE_ROUTES_SET", "SUB_INFO_COLOR", "SUB_INFO_TEXT", "SUB_INFO_BUTTON_TEXT", "SUB_INFO_BUTTON_LINK", "SUB_EXPIRE", "SUB_EXPIRE_BUTTON_LINK", "SUBSCRIPTIONS_EXPAND_NOW", "SUBSCRIPTION_PIN", "DONT_USE_FILTER", "MANUAL_BLOCK_USER_AGENT", "SUBSCRIPTIONS_SORT_TYPE", "SUBSCRIPTION_SORT_TYPE", "DNS_FROM_JSON_ENABLE", "SOCKS_AUTH_MODE", "SOCKS_AUTH_USER", "SOCKS_AUTH_PASSWORD", "INBOUND_HTTP_ENABLE", "HTTP_AUTH_MODE", "HTTP_AUTH_USER", "HTTP_AUTH_PASSWORD", "USER_AGENT_GEO_FILES", "SUBSCRIPTION_REQUEST_TIMEOUT", "XRAY_TUN_ENABLE", "XRAY_TUN_MTU", "BLOCK_BIND_TO_TUNNEL_ENABLE", "PROXY_PING_MODE", "PROXY_PING_TIMEOUT", "USE_OKHTTP_LEGACY", "FALLBACK_URL", "RESET", "HWIDLINK", _UrlKt.FRAGMENT_ENCODE_SET, "MAX_LENGTH_VISIBLE_ANNOUNCE", "I", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:407:0x08e9 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x002f, B:8:0x0037, B:12:0x0048, B:15:0x004f, B:17:0x0057, B:18:0x005f, B:20:0x0067, B:22:0x007a, B:24:0x0082, B:26:0x008a, B:28:0x0092, B:29:0x0097, B:32:0x00a1, B:34:0x00a9, B:36:0x00bd, B:37:0x00c2, B:39:0x00cc, B:41:0x00d7, B:43:0x00dd, B:44:0x00e2, B:46:0x00e8, B:47:0x00eb, B:48:0x00f4, B:50:0x00fc, B:52:0x0107, B:54:0x010d, B:55:0x0112, B:57:0x0118, B:58:0x011b, B:59:0x0124, B:61:0x012c, B:63:0x0137, B:65:0x013d, B:66:0x0142, B:68:0x0148, B:69:0x014b, B:70:0x0154, B:72:0x015c, B:74:0x0167, B:76:0x016d, B:77:0x0172, B:79:0x0178, B:80:0x017b, B:81:0x0188, B:84:0x0193, B:86:0x019c, B:87:0x01ae, B:91:0x01b6, B:92:0x01bb, B:94:0x01c3, B:96:0x01cb, B:98:0x01df, B:99:0x01e4, B:101:0x01ec, B:102:0x01f1, B:104:0x01f9, B:105:0x01fe, B:107:0x0206, B:108:0x020b, B:110:0x0213, B:112:0x021e, B:114:0x0224, B:116:0x022a, B:118:0x0231, B:120:0x024b, B:121:0x0250, B:123:0x0259, B:124:0x025e, B:126:0x0266, B:130:0x026e, B:131:0x0273, B:133:0x027b, B:134:0x028d, B:136:0x0295, B:137:0x02a7, B:139:0x02af, B:140:0x02bd, B:142:0x02c5, B:143:0x02d7, B:145:0x02df, B:146:0x02f1, B:148:0x02f9, B:149:0x0307, B:151:0x030f, B:152:0x031d, B:154:0x0325, B:155:0x0333, B:157:0x033b, B:158:0x0349, B:160:0x0351, B:161:0x035f, B:163:0x0367, B:167:0x036f, B:168:0x0374, B:170:0x037c, B:174:0x0384, B:175:0x0389, B:177:0x0391, B:178:0x03a3, B:180:0x03ab, B:181:0x03b9, B:183:0x03c1, B:187:0x03c9, B:188:0x03ce, B:190:0x03d6, B:194:0x03de, B:195:0x03e3, B:197:0x03eb, B:201:0x03f3, B:202:0x03f8, B:204:0x0400, B:208:0x0408, B:209:0x040d, B:211:0x0415, B:212:0x0427, B:214:0x042f, B:215:0x0441, B:217:0x0449, B:218:0x045b, B:220:0x0463, B:221:0x0475, B:223:0x047d, B:224:0x048f, B:226:0x0497, B:228:0x04a2, B:230:0x04a8, B:231:0x04ad, B:233:0x04b3, B:234:0x04b6, B:235:0x04c3, B:237:0x04cb, B:238:0x04d9, B:240:0x04e1, B:241:0x04f3, B:243:0x04fb, B:244:0x0500, B:246:0x0508, B:250:0x0510, B:251:0x0515, B:253:0x051d, B:254:0x052f, B:256:0x0537, B:257:0x0549, B:259:0x0551, B:260:0x0556, B:262:0x055e, B:263:0x0563, B:265:0x056b, B:266:0x0579, B:268:0x0581, B:269:0x058f, B:271:0x0597, B:272:0x05a5, B:274:0x05ad, B:275:0x05bb, B:277:0x05c3, B:278:0x05d5, B:280:0x05df, B:282:0x05ea, B:284:0x05f8, B:285:0x05fd, B:287:0x0605, B:289:0x0610, B:291:0x061e, B:292:0x0623, B:294:0x062b, B:295:0x0639, B:297:0x0641, B:298:0x0653, B:300:0x065b, B:301:0x0669, B:303:0x0671, B:304:0x0683, B:306:0x068b, B:307:0x0699, B:309:0x06a1, B:310:0x06a6, B:312:0x06ae, B:313:0x06b3, B:315:0x06bb, B:316:0x06c9, B:318:0x06d1, B:320:0x06da, B:321:0x06ec, B:325:0x0702, B:326:0x0707, B:328:0x070f, B:330:0x0718, B:331:0x072a, B:335:0x0740, B:336:0x0745, B:338:0x074d, B:340:0x0756, B:341:0x0768, B:345:0x0778, B:346:0x077d, B:348:0x0785, B:349:0x0797, B:351:0x079f, B:352:0x07a4, B:354:0x07ac, B:355:0x07be, B:357:0x07c6, B:358:0x07d8, B:360:0x07e0, B:361:0x07f2, B:363:0x07fa, B:364:0x080c, B:366:0x0814, B:369:0x081e, B:371:0x0826, B:372:0x0838, B:374:0x0840, B:375:0x084e, B:377:0x0856, B:378:0x085b, B:380:0x0863, B:381:0x0868, B:383:0x0870, B:384:0x0882, B:386:0x088a, B:387:0x0898, B:389:0x08a0, B:390:0x08a5, B:392:0x08ad, B:393:0x08b2, B:395:0x08ba, B:396:0x08c8, B:398:0x08d0, B:400:0x08d6, B:408:0x08ed, B:407:0x08e9, B:409:0x08f2, B:411:0x08fa, B:412:0x090c, B:414:0x0914, B:416:0x091c, B:418:0x0924, B:424:0x092d, B:425:0x0932, B:427:0x093a, B:428:0x094c, B:430:0x0954, B:431:0x0962, B:433:0x096a, B:434:0x0978, B:436:0x0980, B:437:0x0992, B:439:0x099a, B:441:0x09a5, B:443:0x09ab, B:444:0x09b0, B:446:0x09b6, B:447:0x09b9, B:448:0x09c3, B:451:0x09cd, B:452:0x09df), top: B:461:0x002f }] */
        /* JADX WARN: Code duplicated, block: B:423:0x092c  */
        public static MetaParams a(List list, boolean z) {
            MetaParams metaParams = new MetaParams(null, -1);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qg5 qg5Var = (qg5) it.next();
                String str = (String) qg5Var.X;
                String str2 = (String) qg5Var.Y;
                String string = fm7.R0(str).toString();
                String string2 = fm7.R0(str2).toString();
                try {
                    if (mm7.S(string, MetaParams.PROFILE_TITLE)) {
                        MetaParams.INSTANCE.getClass();
                        String strR = r(string2);
                        if (fm7.o0(strR)) {
                            strR = null;
                        }
                        metaParams.i2(strR);
                    } else if (mm7.S(string, MetaParams.PROFILE_UPDATE_INTERVAL)) {
                        metaParams.j2(mm7.b0(string2));
                    } else if (mm7.S(string, MetaParams.SUBSCRIPTION_USER_INFO)) {
                        MetaParams.INSTANCE.getClass();
                        SubscriptionUserInfo subscriptionUserInfoY = y(string2);
                        if (subscriptionUserInfoY.getExpire() > -1 || subscriptionUserInfoY.getUpload() > -1 || subscriptionUserInfoY.getDownload() > -1 || subscriptionUserInfoY.getTotal() > -1) {
                            metaParams.P2(subscriptionUserInfoY);
                        }
                    } else if (mm7.S(string, MetaParams.PROFILE_WEB_PAGE_URL)) {
                        ss8 ss8Var = ss8.a;
                        if (!ss8.z(string2)) {
                            string2.getClass();
                            Pattern patternCompile = Pattern.compile("([A-Za-z]+://)+\\S+");
                            patternCompile.getClass();
                            if (patternCompile.matcher(string2).find()) {
                            }
                        }
                        metaParams.k2(string2);
                    } else {
                        boolean z2 = false;
                        if (mm7.S(string, MetaParams.FRAGMENT)) {
                            MetaParams.INSTANCE.getClass();
                            if (b(string2)) {
                                ResetInfo resetInfo = metaParams.getResetInfo();
                                if (resetInfo != null) {
                                    resetInfo.u(true);
                                }
                            } else {
                                ResetInfo resetInfo2 = metaParams.getResetInfo();
                                if (resetInfo2 != null) {
                                    resetInfo2.u(false);
                                }
                                metaParams.v1(z(string2));
                            }
                        } else if (mm7.S(string, MetaParams.RESOLVE_ADDRESS)) {
                            MetaParams.INSTANCE.getClass();
                            if (b(string2)) {
                                ResetInfo resetInfo3 = metaParams.getResetInfo();
                                if (resetInfo3 != null) {
                                    resetInfo3.E(true);
                                }
                            } else {
                                ResetInfo resetInfo4 = metaParams.getResetInfo();
                                if (resetInfo4 != null) {
                                    resetInfo4.E(false);
                                }
                                metaParams.q2(Uri.decode(string2));
                            }
                        } else if (mm7.S(string, MetaParams.HOST)) {
                            MetaParams.INSTANCE.getClass();
                            if (b(string2)) {
                                ResetInfo resetInfo5 = metaParams.getResetInfo();
                                if (resetInfo5 != null) {
                                    resetInfo5.y(true);
                                }
                            } else {
                                ResetInfo resetInfo6 = metaParams.getResetInfo();
                                if (resetInfo6 != null) {
                                    resetInfo6.y(false);
                                }
                                metaParams.F1(Uri.decode(string2));
                            }
                        } else if (mm7.S(string, MetaParams.INSECURE)) {
                            MetaParams.INSTANCE.getClass();
                            if (b(string2)) {
                                ResetInfo resetInfo7 = metaParams.getResetInfo();
                                if (resetInfo7 != null) {
                                    resetInfo7.B(true);
                                }
                            } else {
                                ResetInfo resetInfo8 = metaParams.getResetInfo();
                                if (resetInfo8 != null) {
                                    resetInfo8.B(false);
                                }
                                metaParams.K1(Boolean.valueOf(f(string2)));
                            }
                        } else if (mm7.S(string, MetaParams.ANNOUNCE)) {
                            string2.getClass();
                            if (mm7.Z(string2, false, MetaParams.PREFIX_BASE_64)) {
                                ss8 ss8Var2 = ss8.a;
                                string2 = ss8.a(fm7.R0(fm7.f0(7, string2)).toString());
                            }
                            if (string2.length() <= 0) {
                                string2 = null;
                            }
                            metaParams.l1(string2);
                        } else if (mm7.S(string, MetaParams.SUPPPORT_URL)) {
                            ss8 ss8Var3 = ss8.a;
                            if (!ss8.z(string2)) {
                                string2.getClass();
                                Pattern patternCompile2 = Pattern.compile("([A-Za-z]+://)+\\S+");
                                patternCompile2.getClass();
                                if (patternCompile2.matcher(string2).find()) {
                                }
                            }
                            metaParams.T2(string2);
                        } else if (mm7.S(string, MetaParams.ROUTING)) {
                            metaParams.u2(string2);
                        } else if (mm7.S(string, MetaParams.NEW_URL)) {
                            metaParams.T1(string2);
                        } else if (mm7.S(string, MetaParams.NEW_DOMAIN)) {
                            metaParams.S1(string2);
                        } else if (mm7.S(string, MetaParams.PROVIDER_ID)) {
                            MetaParams.INSTANCE.getClass();
                            String strS = s(string2);
                            if (strS == null && b(str2)) {
                                ResetInfo resetInfo9 = metaParams.getResetInfo();
                                if (resetInfo9 != null) {
                                    resetInfo9.D(true);
                                }
                            } else if (strS == null) {
                                HappApplication happApplication = HappApplication.M0;
                                k32.i().d().h(new m40(str2, (byte) 13));
                                ResetInfo resetInfo10 = metaParams.getResetInfo();
                                if (resetInfo10 != null) {
                                    resetInfo10.D(true);
                                }
                            } else {
                                metaParams.l2(strS);
                                ResetInfo resetInfo11 = metaParams.getResetInfo();
                                if (resetInfo11 != null) {
                                    resetInfo11.D(false);
                                }
                            }
                        } else if (mm7.S(string, MetaParams.INSTALL_ID)) {
                            if (string2.length() <= 0) {
                                string2 = null;
                            }
                            metaParams.L1(string2);
                        } else if (mm7.S(string, MetaParams.SUBSCRIPTION_AUTOCONNECT)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.H2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.SUBSCRIPTION_PING_ONOPEN_ENABLED)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.M2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.SUBSCRIPTION_AUTOCONNECT_TYPE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.I2(x(string2));
                        } else if (mm7.S(string, MetaParams.ROUTING_ENABLE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.v2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.FRAGMENTATION_ENABLE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.y1(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.FRAGMENTATION_PACKETS)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.C1(j(string2));
                        } else if (mm7.S(string, MetaParams.FRAGMENTATION_LENGTH)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.A1(i(string2));
                        } else if (mm7.S(string, MetaParams.FRAGMENTATION_DELAY)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.x1(h(string2));
                        } else if (mm7.S(string, MetaParams.FRAGMENTATION_INTERVAL)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.z1(h(string2));
                        } else if (mm7.S(string, MetaParams.FRAGMENTATION_TYPE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.D1(k(string2));
                        } else if (mm7.S(string, MetaParams.FRAGMENTATION_ADVANCED_PARAM)) {
                            if (string2.length() <= 0) {
                                string2 = null;
                            }
                            metaParams.w1(string2);
                        } else if (mm7.S(string, MetaParams.FRAGMENTATION_MAX_SPLIT)) {
                            if (string2.length() <= 0) {
                                string2 = null;
                            }
                            metaParams.B1(string2);
                        } else if (mm7.S(string, MetaParams.NOISES_ENABLE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.V1(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.NOISES_PACKET_TYPE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.X1(o(string2));
                        } else if (mm7.S(string, MetaParams.NOISES_PACKET)) {
                            if (string2.length() <= 0) {
                                string2 = null;
                            }
                            metaParams.W1(string2);
                        } else if (mm7.S(string, MetaParams.NOISES_DELAY)) {
                            if (string2.length() <= 0) {
                                string2 = null;
                            }
                            metaParams.U1(string2);
                        } else if (mm7.S(string, MetaParams.NOISES_RAND)) {
                            if (string2.length() <= 0) {
                                string2 = null;
                            }
                            metaParams.Y1(string2);
                        } else if (mm7.S(string, MetaParams.NOISES_RAND_RANGE)) {
                            if (string2.length() <= 0) {
                                string2 = null;
                            }
                            metaParams.Z1(string2);
                        } else if (mm7.S(string, MetaParams.LOCAL_DNS_ENABLE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.M1(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.SUBSCRIPTION_AUTO_UPDATE_OPEN_ENABLE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.J2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.SUBSCRIPTION_SEND_HWID_ENABLED)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.O2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.SUBSCRIPTION_ALWAYS_HWID_ENABLE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.G2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.SUBSCRIPTION_HWID_IN_COOKIE_ENABLE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.K2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.NOTIFICATION_SUBS_EXPIRE)) {
                            MetaParams.INSTANCE.getClass();
                            if (b(string2)) {
                                ResetInfo resetInfo12 = metaParams.getResetInfo();
                                if (resetInfo12 != null) {
                                    resetInfo12.C(true);
                                }
                            } else {
                                ResetInfo resetInfo13 = metaParams.getResetInfo();
                                if (resetInfo13 != null) {
                                    resetInfo13.C(false);
                                }
                                metaParams.a2(Boolean.valueOf(f(string2)));
                            }
                        } else if (mm7.S(string, MetaParams.PING_TYPE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.g2(q(string2));
                        } else if (mm7.S(string, MetaParams.HIDE_SETTINGS)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.E1(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.CHANGE_USER_AGENT)) {
                            metaParams.o1(string2);
                        } else if (mm7.S(string, MetaParams.CHECK_URL_VIA_PROXY)) {
                            if (string2.length() <= 0) {
                                string2 = null;
                            }
                            metaParams.p1(string2);
                        } else if (mm7.S(string, MetaParams.APP_AUTO_START)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.m1(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.RESOLVE_SERVER_ADDRESS_ENABLE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.t2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.RESOLVE_SERVER_ADDRESS_DNS_IP)) {
                            metaParams.s2(string2);
                        } else if (mm7.S(string, MetaParams.RESOLVE_SERVER_ADDRESS_DNS_DOMAIN)) {
                            metaParams.r2(string2);
                        } else if (mm7.S(string, MetaParams.PER_APP_PROXY_MODE)) {
                            jk5.X.getClass();
                            metaParams.e2(we5.m(string2));
                        } else if (mm7.S(string, MetaParams.PER_APP_PROXY_LIST)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.b2(v(string2));
                        } else if (mm7.S(string, MetaParams.PER_APP_PROXY_LIST_SET)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.d2(v(string2));
                        } else if (mm7.S(string, MetaParams.PER_APP_PROXY_LIST_INVERT)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.c2(v(string2));
                        } else if (mm7.S(string, MetaParams.MUX_ENABLE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.O1(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.MUX_TCP_CONNECTIONS)) {
                            MetaParams.INSTANCE.getClass();
                            Integer numB0 = mm7.b0(string2);
                            metaParams.Q1(numB0 != null ? Integer.valueOf(x97.n(numB0.intValue(), -1, 1024)) : null);
                        } else if (mm7.S(string, MetaParams.MUX_XUDP_CONNECTIONS)) {
                            MetaParams.INSTANCE.getClass();
                            Integer numB1 = mm7.b0(string2);
                            metaParams.R1(numB1 != null ? Integer.valueOf(x97.n(numB1.intValue(), -1, 1024)) : null);
                        } else if (mm7.S(string, MetaParams.MUX_QUIC)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.P1(n(string2));
                        } else if (mm7.S(string, MetaParams.SNIFFING_ENABLE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.w2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.PREFERRED_IP_TYPE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.h2(g(string2));
                        } else if (mm7.S(string, MetaParams.SUBSCRIPTIONS_COLLAPSE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.Q2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.PING_RESULT)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.f2(p(string2));
                        } else if (mm7.S(string, MetaParams.EXCLUDE_ROUTES)) {
                            metaParams.s1(string2);
                        } else if (mm7.S(string, MetaParams.EXCLUDE_ROUTES_SET)) {
                            metaParams.t1(string2);
                        } else if (mm7.S(string, MetaParams.SUB_INFO_COLOR)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.E2(w(string2));
                        } else if (mm7.S(string, MetaParams.SUB_INFO_TEXT)) {
                            string2.getClass();
                            if (mm7.Z(string2, false, MetaParams.PREFIX_BASE_64)) {
                                ss8 ss8Var4 = ss8.a;
                                string2 = ss8.a(fm7.R0(fm7.f0(7, string2)).toString());
                            }
                            String string3 = fm7.R0(fm7.Q0(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE, string2)).toString();
                            if (string3.length() <= 0) {
                                string3 = null;
                            }
                            metaParams.F2(string3);
                        } else if (mm7.S(string, MetaParams.SUB_INFO_BUTTON_TEXT)) {
                            string2.getClass();
                            if (mm7.Z(string2, false, MetaParams.PREFIX_BASE_64)) {
                                ss8 ss8Var5 = ss8.a;
                                string2 = ss8.a(fm7.R0(fm7.f0(7, string2)).toString());
                            }
                            String string4 = fm7.R0(fm7.Q0(25, string2)).toString();
                            if (string4.length() <= 0) {
                                string4 = null;
                            }
                            metaParams.D2(string4);
                        } else if (mm7.S(string, MetaParams.SUB_INFO_BUTTON_LINK)) {
                            string2.getClass();
                            if (mm7.Z(string2, false, MetaParams.PREFIX_BASE_64)) {
                                ss8 ss8Var6 = ss8.a;
                                string2 = ss8.a(fm7.R0(fm7.f0(7, string2)).toString());
                            }
                            String string5 = fm7.R0(string2).toString();
                            if (fm7.o0(string5)) {
                                string5 = null;
                            }
                            metaParams.C2(string5);
                        } else if (mm7.S(string, MetaParams.SUB_EXPIRE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.A2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.SUB_EXPIRE_BUTTON_LINK)) {
                            metaParams.B2(string2);
                        } else if (mm7.S(string, MetaParams.SUBSCRIPTIONS_EXPAND_NOW)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.R2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.SUBSCRIPTION_PIN)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.L2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.DONT_USE_FILTER)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.r1(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.MANUAL_BLOCK_USER_AGENT)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.N1(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.SUBSCRIPTIONS_SORT_TYPE) || mm7.S(string, MetaParams.SUBSCRIPTION_SORT_TYPE)) {
                            SubscriptionSortType.INSTANCE.getClass();
                            metaParams.S2(SubscriptionSortType.Companion.a(string2));
                        } else if (mm7.S(string, MetaParams.DNS_FROM_JSON_ENABLE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.q1(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.SOCKS_AUTH_MODE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.x2(u(string2));
                        } else if (mm7.S(string, MetaParams.SOCKS_AUTH_USER)) {
                            metaParams.z2(string2);
                        } else if (mm7.S(string, MetaParams.SOCKS_AUTH_PASSWORD)) {
                            metaParams.y2(string2);
                        } else if (mm7.S(string, MetaParams.INBOUND_HTTP_ENABLE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.J1(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.HTTP_AUTH_MODE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.G1(u(string2));
                        } else if (mm7.S(string, MetaParams.HTTP_AUTH_USER)) {
                            metaParams.I1(string2);
                        } else if (mm7.S(string, MetaParams.HTTP_AUTH_PASSWORD)) {
                            metaParams.H1(string2);
                        } else if (mm7.S(string, MetaParams.USER_AGENT_GEO_FILES)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.V2(l(string2));
                        } else if (mm7.S(string, MetaParams.SUBSCRIPTION_REQUEST_TIMEOUT)) {
                            Integer numB2 = mm7.b0(string2);
                            if (numB2 != null) {
                                int iIntValue = numB2.intValue();
                                kf3 kf3Var = dr.b;
                                int i = kf3Var.X;
                                if (iIntValue > kf3Var.Y || i > iIntValue) {
                                    numB2 = null;
                                }
                                if (numB2 == null) {
                                    numB2 = 7;
                                }
                            } else {
                                numB2 = 7;
                            }
                            metaParams.N2(numB2);
                        } else if (mm7.S(string, MetaParams.XRAY_TUN_ENABLE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.W2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.XRAY_TUN_MTU)) {
                            Integer numB3 = mm7.b0(string2);
                            kf3 kf3Var2 = dr.a;
                            if (numB3 == null) {
                                numB3 = null;
                            } else {
                                int iIntValue2 = numB3.intValue();
                                if (kf3Var2.X <= iIntValue2 && iIntValue2 <= kf3Var2.Y) {
                                    z2 = true;
                                }
                                if (!z2) {
                                    numB3 = null;
                                }
                            }
                            metaParams.X2(numB3);
                        } else if (mm7.S(string, MetaParams.BLOCK_BIND_TO_TUNNEL_ENABLE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.n1(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.PROXY_PING_MODE)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.m2(m(string2));
                        } else if (mm7.S(string, MetaParams.PROXY_PING_TIMEOUT)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.n2(t(string2));
                        } else if (mm7.S(string, MetaParams.USE_OKHTTP_LEGACY)) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.U2(Boolean.valueOf(f(string2)));
                        } else if (mm7.S(string, MetaParams.FALLBACK_URL)) {
                            MetaParams.INSTANCE.getClass();
                            if (b(string2)) {
                                ResetInfo resetInfo14 = metaParams.getResetInfo();
                                if (resetInfo14 != null) {
                                    resetInfo14.p(true);
                                }
                            } else {
                                ResetInfo resetInfo15 = metaParams.getResetInfo();
                                if (resetInfo15 != null) {
                                    resetInfo15.p(false);
                                }
                                metaParams.u1(eq8.a(1, string2, (6 & 2) != 0));
                            }
                        } else if (mm7.S(string, MetaParams.RESET) && z) {
                            MetaParams.INSTANCE.getClass();
                            metaParams.o2(Boolean.valueOf(f(string2)));
                        }
                    }
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    w39.t(th);
                }
            }
            return metaParams;
        }

        public static boolean b(String str) {
            return dh3.f(str, "0");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        public static MetaParams c(MetaParams metaParams, MetaParams metaParams2, boolean z) {
            ?? r2 = 0;
            r2 = 0;
            r2 = 0;
            MetaParams metaParams3 = new MetaParams(r2, -1);
            metaParams3.i2((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$1.INSTANCE, true));
            metaParams3.j2((Integer) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$2.INSTANCE, true));
            metaParams3.P2((SubscriptionUserInfo) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$3.INSTANCE, true));
            metaParams3.k2((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$4.INSTANCE, true));
            XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean tcpMaskSettingBean = (XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean) e(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$5.INSTANCE, MetaParams$Companion$mergeMetaParams$1$6.INSTANCE);
            metaParams3.v1(tcpMaskSettingBean != null ? tcpMaskSettingBean.getValue() : null);
            metaParams3.q2((String) e(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$7.INSTANCE, MetaParams$Companion$mergeMetaParams$1$8.INSTANCE));
            metaParams3.F1((String) e(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$9.INSTANCE, MetaParams$Companion$mergeMetaParams$1$10.INSTANCE));
            metaParams3.K1((Boolean) e(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$11.INSTANCE, MetaParams$Companion$mergeMetaParams$1$12.INSTANCE));
            metaParams3.l1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$13.INSTANCE, true));
            metaParams3.T2((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$14.INSTANCE, true));
            metaParams3.u2((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$15.INSTANCE, true));
            metaParams3.T1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$16.INSTANCE, true));
            metaParams3.S1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$17.INSTANCE, true));
            metaParams3.l2((String) e(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$18.INSTANCE, MetaParams$Companion$mergeMetaParams$1$19.INSTANCE));
            metaParams3.L1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$20.INSTANCE, false));
            metaParams3.H2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$21.INSTANCE, true));
            metaParams3.M2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$22.INSTANCE, true));
            metaParams3.I2((SubscriptionAutoConnectType) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$23.INSTANCE, true));
            metaParams3.v2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$24.INSTANCE, true));
            metaParams3.y1((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$25.INSTANCE, true));
            metaParams3.C1((FragmentationPackets) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$26.INSTANCE, true));
            FragmentationLength fragmentationLength = (FragmentationLength) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$27.INSTANCE, true);
            metaParams3.A1(fragmentationLength != null ? fragmentationLength.getValue() : null);
            FragmentationDelay fragmentationDelay = (FragmentationDelay) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$28.INSTANCE, true);
            metaParams3.x1(fragmentationDelay != null ? fragmentationDelay.getValue() : null);
            FragmentationDelay fragmentationDelay2 = (FragmentationDelay) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$29.INSTANCE, true);
            metaParams3.z1(fragmentationDelay2 != null ? fragmentationDelay2.getValue() : null);
            metaParams3.D1((FragmentationType) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$30.INSTANCE, true));
            metaParams3.w1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$31.INSTANCE, true));
            metaParams3.B1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$32.INSTANCE, true));
            metaParams3.V1((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$33.INSTANCE, true));
            metaParams3.X1((NoisesPacketType) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$34.INSTANCE, true));
            metaParams3.W1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$35.INSTANCE, true));
            metaParams3.U1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$36.INSTANCE, true));
            metaParams3.Y1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$37.INSTANCE, true));
            metaParams3.Z1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$38.INSTANCE, true));
            metaParams3.M1((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$39.INSTANCE, true));
            metaParams3.J2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$40.INSTANCE, true));
            metaParams3.O2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$41.INSTANCE, true));
            metaParams3.G2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$42.INSTANCE, true));
            metaParams3.K2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$43.INSTANCE, true));
            metaParams3.a2((Boolean) e(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$44.INSTANCE, MetaParams$Companion$mergeMetaParams$1$45.INSTANCE));
            metaParams3.g2((EPingType) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$46.INSTANCE, true));
            metaParams3.E1((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$47.INSTANCE, true));
            metaParams3.o1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$48.INSTANCE, true));
            metaParams3.p1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$49.INSTANCE, true));
            metaParams3.m1((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$50.INSTANCE, true));
            metaParams3.t2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$51.INSTANCE, true));
            metaParams3.s2((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$52.INSTANCE, true));
            metaParams3.r2((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$53.INSTANCE, true));
            metaParams3.e2((jk5) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$54.INSTANCE, true));
            metaParams3.b2((List) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$55.INSTANCE, true));
            metaParams3.d2((List) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$56.INSTANCE, true));
            metaParams3.c2((List) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$57.INSTANCE, true));
            metaParams3.O1((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$58.INSTANCE, true));
            metaParams3.Q1((Integer) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$59.INSTANCE, true));
            metaParams3.R1((Integer) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$60.INSTANCE, true));
            metaParams3.P1((MuxQuicType) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$61.INSTANCE, true));
            metaParams3.w2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$62.INSTANCE, true));
            metaParams3.h2((EIpType) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$63.INSTANCE, true));
            metaParams3.Q2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$64.INSTANCE, true));
            metaParams3.f2((vn5) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$65.INSTANCE, true));
            metaParams3.s1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$66.INSTANCE, true));
            metaParams3.t1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$67.INSTANCE, true));
            metaParams3.E2((SubInfoColor) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$68.INSTANCE, false));
            Object objD = d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$69.INSTANCE, false);
            String str = (String) objD;
            if (str == null || str.length() == 0 || str.equals("0")) {
                objD = null;
            }
            metaParams3.F2((String) objD);
            Object objD2 = d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$71.INSTANCE, false);
            String str2 = (String) objD2;
            if (str2 != null && str2.length() != 0 && !str2.equals("0")) {
                r2 = objD2;
            }
            metaParams3.D2((String) r2);
            metaParams3.C2((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$73.INSTANCE, false));
            metaParams3.A2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$74.INSTANCE, false));
            metaParams3.B2((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$75.INSTANCE, false));
            metaParams3.R2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$76.INSTANCE, true));
            metaParams3.L2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$77.INSTANCE, true));
            metaParams3.r1((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$78.INSTANCE, true));
            metaParams3.N1((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$79.INSTANCE, true));
            metaParams3.S2((SubscriptionSortType) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$80.INSTANCE, true));
            metaParams3.q1((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$81.INSTANCE, true));
            metaParams3.x2((InboundAuthMode) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$82.INSTANCE, true));
            metaParams3.z2((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$83.INSTANCE, true));
            metaParams3.y2((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$84.INSTANCE, true));
            metaParams3.J1((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$85.INSTANCE, true));
            metaParams3.G1((InboundAuthMode) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$86.INSTANCE, true));
            metaParams3.I1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$87.INSTANCE, true));
            metaParams3.H1((String) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$88.INSTANCE, true));
            metaParams3.V2((GeoUserAgent) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$89.INSTANCE, true));
            metaParams3.N2((Integer) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$90.INSTANCE, true));
            metaParams3.W2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$91.INSTANCE, true));
            metaParams3.X2((Integer) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$92.INSTANCE, true));
            metaParams3.n1((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$93.INSTANCE, true));
            metaParams3.m2((GoPingType) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$94.INSTANCE, true));
            metaParams3.n2((Integer) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$95.INSTANCE, true));
            metaParams3.U2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$96.INSTANCE, true));
            metaParams3.u1((String) e(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$97.INSTANCE, MetaParams$Companion$mergeMetaParams$1$98.INSTANCE));
            metaParams3.o2((Boolean) d(metaParams, z, metaParams2, MetaParams$Companion$mergeMetaParams$1$99.INSTANCE, true));
            metaParams3.p2(new ResetInfo());
            return metaParams3;
        }

        public static final Object d(MetaParams metaParams, boolean z, MetaParams metaParams2, gn2 gn2Var, boolean z2) {
            Object objB = gn2Var.B(metaParams);
            if (objB != null) {
                return objB;
            }
            if (z && z2) {
                return null;
            }
            return gn2Var.B(metaParams2);
        }

        public static final Object e(MetaParams metaParams, boolean z, MetaParams metaParams2, p05 p05Var, p05 p05Var2) {
            Object objD = d(metaParams, z, metaParams2, p05Var, false);
            ResetInfo resetInfo = metaParams.getResetInfo();
            if (resetInfo == null || !((Boolean) p05Var2.get(resetInfo)).booleanValue()) {
                return objD;
            }
            return null;
        }

        public static boolean f(String str) {
            return mm7.S(str, "true") || dh3.f(str, "1");
        }

        public static EIpType g(String str) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == 3005871) {
                if (lowerCase.equals("auto")) {
                    return EIpType.AUTO;
                }
                return null;
            }
            if (iHashCode == 3239397) {
                if (lowerCase.equals("ipv4")) {
                    return EIpType.IPv4;
                }
                return null;
            }
            if (iHashCode == 3239399 && lowerCase.equals("ipv6")) {
                return EIpType.IPv6;
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        
            if (java.lang.Integer.parseInt(r4) > 0) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.String h(java.lang.String r4) {
            /*
                su.happ.proxyutility.dto.enums.FragmentationDelay$Companion r0 = su.happ.proxyutility.dto.enums.FragmentationDelay.INSTANCE
                r0.getClass()
                r4.getClass()
                r0 = 45
                boolean r1 = defpackage.fm7.e0(r4, r0)     // Catch: java.lang.Throwable -> L3a
                if (r1 == 0) goto L33
                r1 = 1
                char[] r2 = new char[r1]     // Catch: java.lang.Throwable -> L3a
                r3 = 0
                r2[r3] = r0     // Catch: java.lang.Throwable -> L3a
                java.util.List r0 = defpackage.fm7.E0(r4, r2)     // Catch: java.lang.Throwable -> L3a
                java.lang.Object r2 = r0.get(r3)     // Catch: java.lang.Throwable -> L3a
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L3a
                int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L3a
                if (r2 <= 0) goto L43
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L3a
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L3a
                int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L3a
                if (r0 <= 0) goto L43
                goto L39
            L33:
                int r0 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L3a
                if (r0 <= 0) goto L43
            L39:
                return r4
            L3a:
                r4 = move-exception
                boolean r0 = r4 instanceof java.lang.InterruptedException
                if (r0 != 0) goto L45
                boolean r0 = r4 instanceof java.util.concurrent.CancellationException
                if (r0 != 0) goto L45
            L43:
                r4 = 0
                return r4
            L45:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: su.happ.proxyutility.dto.MetaParams.Companion.h(java.lang.String):java.lang.String");
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        
            if (java.lang.Integer.parseInt(r4) > 0) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.String i(java.lang.String r4) {
            /*
                su.happ.proxyutility.dto.enums.FragmentationLength$Companion r0 = su.happ.proxyutility.dto.enums.FragmentationLength.INSTANCE
                r0.getClass()
                r4.getClass()
                r0 = 45
                boolean r1 = defpackage.fm7.e0(r4, r0)     // Catch: java.lang.Throwable -> L3a
                if (r1 == 0) goto L33
                r1 = 1
                char[] r2 = new char[r1]     // Catch: java.lang.Throwable -> L3a
                r3 = 0
                r2[r3] = r0     // Catch: java.lang.Throwable -> L3a
                java.util.List r0 = defpackage.fm7.E0(r4, r2)     // Catch: java.lang.Throwable -> L3a
                java.lang.Object r2 = r0.get(r3)     // Catch: java.lang.Throwable -> L3a
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L3a
                int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L3a
                if (r2 <= 0) goto L43
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L3a
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L3a
                int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L3a
                if (r0 <= 0) goto L43
                goto L39
            L33:
                int r0 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L3a
                if (r0 <= 0) goto L43
            L39:
                return r4
            L3a:
                r4 = move-exception
                boolean r0 = r4 instanceof java.lang.InterruptedException
                if (r0 != 0) goto L45
                boolean r0 = r4 instanceof java.util.concurrent.CancellationException
                if (r0 != 0) goto L45
            L43:
                r4 = 0
                return r4
            L45:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: su.happ.proxyutility.dto.MetaParams.Companion.i(java.lang.String):java.lang.String");
        }

        public static FragmentationPackets j(String str) {
            Object next;
            Iterator<E> it = FragmentationPackets.c().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (mm7.S(str, ((FragmentationPackets) next).getValue())) {
                    return (FragmentationPackets) next;
                }
            }
            next = null;
            return (FragmentationPackets) next;
        }

        public static FragmentationType k(String str) {
            FragmentationType.INSTANCE.getClass();
            return FragmentationType.Companion.a(str);
        }

        public static GeoUserAgent l(String str) {
            Object next;
            GeoUserAgent.INSTANCE.getClass();
            str.getClass();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Iterator<E> it = GeoUserAgent.b().iterator();
            while (it.hasNext()) {
                next = it.next();
                String lowerCase2 = ((GeoUserAgent) next).name().toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (mm7.W(lowerCase2, "_", "-", false).equals(lowerCase)) {
                    return (GeoUserAgent) next;
                }
            }
            next = null;
            return (GeoUserAgent) next;
        }

        public static GoPingType m(String str) {
            Object next;
            GoPingType.INSTANCE.getClass();
            str.getClass();
            Iterator<E> it = GoPingType.a().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (dh3.f(((GoPingType) next).getGoValue(), str)) {
                    return (GoPingType) next;
                }
            }
            next = null;
            return (GoPingType) next;
        }

        public static MuxQuicType n(String str) {
            Object next;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Iterator<E> it = MuxQuicType.a().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (dh3.f(((MuxQuicType) next).getTitle(), lowerCase)) {
                    return (MuxQuicType) next;
                }
            }
            next = null;
            return (MuxQuicType) next;
        }

        public static NoisesPacketType o(String str) {
            NoisesPacketType.INSTANCE.getClass();
            str.getClass();
            NoisesPacketType noisesPacketType = NoisesPacketType.ARRAY;
            if (str.equalsIgnoreCase(noisesPacketType.getValue())) {
                return noisesPacketType;
            }
            NoisesPacketType noisesPacketType2 = NoisesPacketType.STR;
            if (str.equalsIgnoreCase(noisesPacketType2.getValue())) {
                return noisesPacketType2;
            }
            NoisesPacketType noisesPacketType3 = NoisesPacketType.HEX;
            if (str.equalsIgnoreCase(noisesPacketType3.getValue())) {
                return noisesPacketType3;
            }
            NoisesPacketType noisesPacketType4 = NoisesPacketType.BASE64;
            if (str.equalsIgnoreCase(noisesPacketType4.getValue())) {
                return noisesPacketType4;
            }
            NoisesPacketType noisesPacketType5 = NoisesPacketType.EXP;
            if (str.equalsIgnoreCase(noisesPacketType5.getValue())) {
                return noisesPacketType5;
            }
            return null;
        }

        public static vn5 p(String str) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("time")) {
                return vn5.Y;
            }
            if (lowerCase.equals("icon")) {
                return vn5.Z;
            }
            return null;
        }

        public static EPingType q(String str) {
            EPingType.INSTANCE.getClass();
            str.getClass();
            EPingType ePingType = EPingType.VIA_PROXY_GET;
            if (str.equalsIgnoreCase(ePingType.getMetaParamsValue())) {
                return ePingType;
            }
            EPingType ePingType2 = EPingType.VIA_PROXY_HEAD;
            if (str.equalsIgnoreCase(ePingType2.getMetaParamsValue())) {
                return ePingType2;
            }
            EPingType ePingType3 = EPingType.TCP;
            if (str.equalsIgnoreCase(ePingType3.getMetaParamsValue())) {
                return ePingType3;
            }
            EPingType ePingType4 = EPingType.ICMP;
            if (str.equalsIgnoreCase(ePingType4.getMetaParamsValue())) {
                return ePingType4;
            }
            return null;
        }

        public static String r(String str) {
            if (mm7.Z(str, false, MetaParams.PREFIX_BASE_64)) {
                ss8 ss8Var = ss8.a;
                str = ss8.a(fm7.R0(str.substring(7)).toString());
            }
            return fm7.Q0(25, str);
        }

        public static String s(String str) {
            if (str.length() == 0) {
                return null;
            }
            ProviderId.INSTANCE.getClass();
            String str2 = ProviderId.REGEX.d(str) ? str : null;
            String str3 = str2 != null ? str2 : null;
            if (str3 == null) {
                HappApplication happApplication = HappApplication.M0;
                k32.i().d().h(new m40(str, (byte) 14));
            }
            return str3;
        }

        public static Integer t(String str) {
            Integer numB0 = mm7.b0(str);
            if (numB0 == null) {
                return null;
            }
            int iIntValue = numB0.intValue();
            if (5 > iIntValue || iIntValue >= 16) {
                iIntValue = 7;
            }
            return Integer.valueOf(iIntValue);
        }

        public static InboundAuthMode u(String str) {
            Object next;
            InboundAuthMode.INSTANCE.getClass();
            str.getClass();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Iterator<E> it = InboundAuthMode.b().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (dh3.f(((InboundAuthMode) next).getValue(), lowerCase)) {
                    return (InboundAuthMode) next;
                }
            }
            next = null;
            return (InboundAuthMode) next;
        }

        public static List v(String str) {
            str.getClass();
            md8 md8VarL0 = w27.l0(w27.l0(fm7.v0(str, new char[]{','}), new nm7(str, (byte) 0)), MetaParams$Companion$toStringList$1.INSTANCE);
            MetaParams$Companion$toStringList$2 metaParams$Companion$toStringList$2 = MetaParams$Companion$toStringList$2.INSTANCE;
            metaParams$Companion$toStringList$2.getClass();
            List listN0 = w27.n0(new la2(md8VarL0, true, metaParams$Companion$toStringList$2));
            if (listN0.isEmpty()) {
                return null;
            }
            return listN0;
        }

        public static SubInfoColor w(String str) {
            SubInfoColor.INSTANCE.getClass();
            return SubInfoColor.Companion.a(str);
        }

        public static SubscriptionAutoConnectType x(String str) {
            Object next;
            Iterator<E> it = SubscriptionAutoConnectType.c().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (mm7.S(str, ((SubscriptionAutoConnectType) next).getValue())) {
                    return (SubscriptionAutoConnectType) next;
                }
            }
            next = null;
            return (SubscriptionAutoConnectType) next;
        }

        public static SubscriptionUserInfo y(String str) {
            if (!fm7.d0(str, " ", false)) {
                if (mm7.Z(str, false, MetaParams.PREFIX_BASE_64)) {
                    ss8 ss8Var = ss8.a;
                    str = ss8.a(fm7.f0(7, str));
                } else {
                    str = Uri.decode(str);
                }
            }
            SubscriptionUserInfo subscriptionUserInfo = new SubscriptionUserInfo(-1L, -1L, -1L, -1L);
            str.getClass();
            Iterator it = fm7.F0(str, new String[]{";"}, 6).iterator();
            while (it.hasNext()) {
                List listF0 = fm7.F0(fm7.R0((String) it.next()).toString(), new String[]{"="}, 6);
                ArrayList arrayList = new ArrayList(xv0.Z(listF0, 10));
                Iterator it2 = listF0.iterator();
                while (it2.hasNext()) {
                    arrayList.add(fm7.R0((String) it2.next()).toString());
                }
                String str2 = (String) arrayList.get(0);
                try {
                    if (mm7.S(str2, MetaParams.SUBSCRIPTION_USER_INFO_UPLOAD)) {
                        subscriptionUserInfo.p(Long.parseLong((String) arrayList.get(1)));
                    } else if (mm7.S(str2, MetaParams.SUBSCRIPTION_USER_INFO_DOWNLOAD)) {
                        subscriptionUserInfo.k(Long.parseLong((String) arrayList.get(1)));
                    } else if (mm7.S(str2, MetaParams.SUBSCRIPTION_USER_INFO_TOTAL)) {
                        subscriptionUserInfo.m(Long.parseLong((String) arrayList.get(1)));
                    } else if (mm7.S(str2, MetaParams.SUBSCRIPTION_USER_INFO_EXPIRE)) {
                        subscriptionUserInfo.l(Long.parseLong((String) arrayList.get(1)));
                    }
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                }
            }
            return subscriptionUserInfo;
        }

        public static LinkedHashMap z(String str) {
            String strDecode = Uri.decode(str);
            strDecode.getClass();
            List listE0 = fm7.E0(strDecode, new char[]{','});
            int size = listE0.size();
            if (3 > size || size >= 5) {
                listE0 = null;
            }
            if (listE0 == null) {
                return null;
            }
            String str2 = (String) listE0.get(0);
            String str3 = (String) listE0.get(1);
            String str4 = (String) listE0.get(2);
            String str5 = (String) wv0.u0(3, listE0);
            if (str5 == null) {
                str5 = "100-200";
            }
            return XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.c(str5, str3, str2, str4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
    public static final class Creator implements Parcelable.Creator<MetaParams> {
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
              (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x0646: RETURN (r1v0 ?? I:??[OBJECT, ARRAY]) (LINE:477)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        @Override // android.os.Parcelable.Creator
        public final su.happ.proxyutility.dto.MetaParams createFromParcel(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
              (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x0646: RETURN (r1v0 ?? I:??[OBJECT, ARRAY]) (LINE:477)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r96v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */

        @Override // android.os.Parcelable.Creator
        public final MetaParams[] newArray(int i) {
            return new MetaParams[i];
        }
    }

    public MetaParams(String str, Integer num, SubscriptionUserInfo subscriptionUserInfo, String str2, Map map, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool2, Boolean bool3, SubscriptionAutoConnectType subscriptionAutoConnectType, Boolean bool4, Boolean bool5, FragmentationPackets fragmentationPackets, String str12, String str13, String str14, FragmentationType fragmentationType, String str15, String str16, Boolean bool6, NoisesPacketType noisesPacketType, String str17, String str18, String str19, String str20, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, EPingType ePingType, Boolean bool14, String str21, String str22, Boolean bool15, Boolean bool16, String str23, String str24, jk5 jk5Var, List list, List list2, List list3, Boolean bool17, Integer num2, Integer num3, MuxQuicType muxQuicType, Boolean bool18, EIpType eIpType, Boolean bool19, vn5 vn5Var, String str25, String str26, SubInfoColor subInfoColor, String str27, String str28, String str29, Boolean bool20, String str30, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, SubscriptionSortType subscriptionSortType, Boolean bool25, InboundAuthMode inboundAuthMode, String str31, String str32, Boolean bool26, InboundAuthMode inboundAuthMode2, String str33, String str34, GeoUserAgent geoUserAgent, Integer num4, Boolean bool27, Integer num5, Boolean bool28, GoPingType goPingType, Integer num6, Boolean bool29, String str35, Boolean bool30, ResetInfo resetInfo) {
        this.profileTitle = str;
        this.profileUpdateInterval = num;
        this.subscriptionUserInfo = subscriptionUserInfo;
        this.profileWebPageUrl = str2;
        this.fragmentBean = map;
        this.resolveAddress = str3;
        this.host = str4;
        this.insecure = bool;
        this.announce = str5;
        this.supportUrl = str6;
        this.routing = str7;
        this.newUrl = str8;
        this.newDomain = str9;
        this.providerId = str10;
        this.installId = str11;
        this.subscriptionAutoConnect = bool2;
        this.subscriptionPingOnOpenEnabled = bool3;
        this.subscriptionAutoConnectType = subscriptionAutoConnectType;
        this.routingEnable = bool4;
        this.fragmentationEnable = bool5;
        this.fragmentationPackets = fragmentationPackets;
        this.fragmentationLength = str12;
        this.fragmentationDelay = str13;
        this.fragmentationInterval = str14;
        this.fragmentationType = fragmentationType;
        this.fragmentationAdvancedParam = str15;
        this.fragmentationMaxSplit = str16;
        this.noisesEnable = bool6;
        this.noisesPacketType = noisesPacketType;
        this.noisesPacket = str17;
        this.noisesDelay = str18;
        this.noisesRand = str19;
        this.noisesRandRange = str20;
        this.localDnsEnable = bool7;
        this.subscriptionAutoUpdateEnable = bool8;
        this.subscriptionAutoUpdateOpenEnable = bool9;
        this.subscriptionSendHwidEnabled = bool10;
        this.subscriptionAlwaysHwidEnable = bool11;
        this.subscriptionHwidInCookieEnable = bool12;
        this.notificationsSubsExpire = bool13;
        this.pingType = ePingType;
        this.hideSettings = bool14;
        this.changeUserAgent = str21;
        this.checkUrlViaProxy = str22;
        this.appAutoStart = bool15;
        this.resolveAddressServerEnable = bool16;
        this.resolveAddressServerDnsIp = str23;
        this.resolveAddressServerDnsDomain = str24;
        this.perAppProxyMode = jk5Var;
        this.perAppProxyList = list;
        this.perAppProxyListSet = list2;
        this.perAppProxyListInvert = list3;
        this.muxEnable = bool17;
        this.muxTcpConnections = num2;
        this.muxXudpConnections = num3;
        this.muxQuic = muxQuicType;
        this.sniffingEnable = bool18;
        this.preferredIpType = eIpType;
        this.subscriptionsCollapse = bool19;
        this.pingResult = vn5Var;
        this.excludeRoutes = str25;
        this.excludeRoutesSet = str26;
        this.subInfoColor = subInfoColor;
        this.subInfoText = str27;
        this.subInfoButtonText = str28;
        this.subInfoButtonLink = str29;
        this.subExpire = bool20;
        this.subExpireButtonLink = str30;
        this.subscriptionsExpandNow = bool21;
        this.subscriptionPin = bool22;
        this.dontUseFilter = bool23;
        this.manualBlockUserAgent = bool24;
        this.subscriptionsSortType = subscriptionSortType;
        this.dnsFromJsonEnable = bool25;
        this.socksAuthMode = inboundAuthMode;
        this.socksAuthUser = str31;
        this.socksAuthPassword = str32;
        this.inboundHttpEnable = bool26;
        this.httpAuthMode = inboundAuthMode2;
        this.httpAuthUser = str33;
        this.httpAuthPassword = str34;
        this.userAgentGeoFiles = geoUserAgent;
        this.subscriptionRequestTimeout = num4;
        this.xrayTunEnable = bool27;
        this.xrayTunMtu = num5;
        this.blockBindToTunnelEnable = bool28;
        this.proxyPingMode = goPingType;
        this.proxyPingTimeout = num6;
        this.useOkhttpLegacy = bool29;
        this.fallbackUrl = str35;
        this.reset = bool30;
        this.resetInfo = resetInfo;
    }

    public static MetaParams c(MetaParams metaParams, Boolean bool, SubInfoColor subInfoColor, String str, String str2, String str3, Boolean bool2, String str4, int i, int i2, int i3) {
        String str5 = metaParams.profileTitle;
        Integer num = metaParams.profileUpdateInterval;
        SubscriptionUserInfo subscriptionUserInfo = metaParams.subscriptionUserInfo;
        String str6 = metaParams.profileWebPageUrl;
        Map<String, Object> map = metaParams.fragmentBean;
        String str7 = metaParams.resolveAddress;
        String str8 = metaParams.host;
        Boolean bool3 = (i & 128) != 0 ? metaParams.insecure : bool;
        String str9 = metaParams.announce;
        String str10 = metaParams.supportUrl;
        String str11 = metaParams.routing;
        String str12 = metaParams.newUrl;
        String str13 = metaParams.newDomain;
        String str14 = metaParams.providerId;
        String str15 = metaParams.installId;
        Boolean bool4 = metaParams.subscriptionAutoConnect;
        Boolean bool5 = metaParams.subscriptionPingOnOpenEnabled;
        SubscriptionAutoConnectType subscriptionAutoConnectType = metaParams.subscriptionAutoConnectType;
        Boolean bool6 = metaParams.routingEnable;
        Boolean bool7 = metaParams.fragmentationEnable;
        FragmentationPackets fragmentationPackets = metaParams.fragmentationPackets;
        String str16 = metaParams.fragmentationLength;
        String str17 = metaParams.fragmentationDelay;
        String str18 = metaParams.fragmentationInterval;
        FragmentationType fragmentationType = metaParams.fragmentationType;
        String str19 = metaParams.fragmentationAdvancedParam;
        String str20 = metaParams.fragmentationMaxSplit;
        Boolean bool8 = metaParams.noisesEnable;
        NoisesPacketType noisesPacketType = metaParams.noisesPacketType;
        String str21 = metaParams.noisesPacket;
        String str22 = metaParams.noisesDelay;
        String str23 = metaParams.noisesRand;
        String str24 = metaParams.noisesRandRange;
        Boolean bool9 = metaParams.localDnsEnable;
        Boolean bool10 = metaParams.subscriptionAutoUpdateEnable;
        Boolean bool11 = metaParams.subscriptionAutoUpdateOpenEnable;
        Boolean bool12 = metaParams.subscriptionSendHwidEnabled;
        Boolean bool13 = metaParams.subscriptionAlwaysHwidEnable;
        Boolean bool14 = metaParams.subscriptionHwidInCookieEnable;
        Boolean bool15 = metaParams.notificationsSubsExpire;
        EPingType ePingType = metaParams.pingType;
        Boolean bool16 = metaParams.hideSettings;
        String str25 = metaParams.changeUserAgent;
        String str26 = metaParams.checkUrlViaProxy;
        Boolean bool17 = metaParams.appAutoStart;
        Boolean bool18 = metaParams.resolveAddressServerEnable;
        String str27 = metaParams.resolveAddressServerDnsIp;
        String str28 = metaParams.resolveAddressServerDnsDomain;
        jk5 jk5Var = metaParams.perAppProxyMode;
        List<String> list = metaParams.perAppProxyList;
        List<String> list2 = metaParams.perAppProxyListSet;
        List<String> list3 = metaParams.perAppProxyListInvert;
        Boolean bool19 = metaParams.muxEnable;
        Integer num2 = metaParams.muxTcpConnections;
        Integer num3 = metaParams.muxXudpConnections;
        MuxQuicType muxQuicType = metaParams.muxQuic;
        Boolean bool20 = metaParams.sniffingEnable;
        EIpType eIpType = metaParams.preferredIpType;
        Boolean bool21 = metaParams.subscriptionsCollapse;
        vn5 vn5Var = metaParams.pingResult;
        String str29 = metaParams.excludeRoutes;
        String str30 = metaParams.excludeRoutesSet;
        SubInfoColor subInfoColor2 = (i2 & 1073741824) != 0 ? metaParams.subInfoColor : subInfoColor;
        String str31 = (i2 & Integer.MIN_VALUE) != 0 ? metaParams.subInfoText : str;
        String str32 = (i3 & 1) != 0 ? metaParams.subInfoButtonText : str2;
        String str33 = (i3 & 2) != 0 ? metaParams.subInfoButtonLink : str3;
        Boolean bool22 = (i3 & 4) != 0 ? metaParams.subExpire : bool2;
        String str34 = (i3 & 8) != 0 ? metaParams.subExpireButtonLink : str4;
        Boolean bool23 = metaParams.subscriptionsExpandNow;
        Boolean bool24 = metaParams.subscriptionPin;
        Boolean bool25 = metaParams.dontUseFilter;
        Boolean bool26 = metaParams.manualBlockUserAgent;
        SubscriptionSortType subscriptionSortType = metaParams.subscriptionsSortType;
        Boolean bool27 = metaParams.dnsFromJsonEnable;
        InboundAuthMode inboundAuthMode = metaParams.socksAuthMode;
        String str35 = metaParams.socksAuthUser;
        String str36 = metaParams.socksAuthPassword;
        Boolean bool28 = metaParams.inboundHttpEnable;
        InboundAuthMode inboundAuthMode2 = metaParams.httpAuthMode;
        String str37 = metaParams.httpAuthUser;
        String str38 = metaParams.httpAuthPassword;
        GeoUserAgent geoUserAgent = metaParams.userAgentGeoFiles;
        Integer num4 = metaParams.subscriptionRequestTimeout;
        Boolean bool29 = metaParams.xrayTunEnable;
        Integer num5 = metaParams.xrayTunMtu;
        Boolean bool30 = metaParams.blockBindToTunnelEnable;
        GoPingType goPingType = metaParams.proxyPingMode;
        Integer num6 = metaParams.proxyPingTimeout;
        Boolean bool31 = metaParams.useOkhttpLegacy;
        String str39 = metaParams.fallbackUrl;
        Boolean bool32 = metaParams.reset;
        ResetInfo resetInfo = metaParams.resetInfo;
        metaParams.getClass();
        return new MetaParams(str5, num, subscriptionUserInfo, str6, map, str7, str8, bool3, str9, str10, str11, str12, str13, str14, str15, bool4, bool5, subscriptionAutoConnectType, bool6, bool7, fragmentationPackets, str16, str17, str18, fragmentationType, str19, str20, bool8, noisesPacketType, str21, str22, str23, str24, bool9, bool10, bool11, bool12, bool13, bool14, bool15, ePingType, bool16, str25, str26, bool17, bool18, str27, str28, jk5Var, list, list2, list3, bool19, num2, num3, muxQuicType, bool20, eIpType, bool21, vn5Var, str29, str30, subInfoColor2, str31, str32, str33, bool22, str34, bool23, bool24, bool25, bool26, subscriptionSortType, bool27, inboundAuthMode, str35, str36, bool28, inboundAuthMode2, str37, str38, geoUserAgent, num4, bool29, num5, bool30, goPingType, num6, bool31, str39, bool32, resetInfo);
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public final String getResolveAddress() {
        return this.resolveAddress;
    }

    public final void A1(String str) {
        this.fragmentationLength = str;
    }

    public final void A2(Boolean bool) {
        this.subExpire = bool;
    }

    public final Long B() {
        SubscriptionUserInfo subscriptionUserInfo = this.subscriptionUserInfo;
        if (subscriptionUserInfo != null) {
            return Long.valueOf(((subscriptionUserInfo.getExpire() * 1000) - we3.a.a().a()) / 86400000);
        }
        return null;
    }

    /* JADX INFO: renamed from: B0, reason: from getter */
    public final String getResolveAddressServerDnsDomain() {
        return this.resolveAddressServerDnsDomain;
    }

    public final void B1(String str) {
        this.fragmentationMaxSplit = str;
    }

    public final void B2(String str) {
        this.subExpireButtonLink = str;
    }

    public final Long C() {
        SubscriptionUserInfo subscriptionUserInfo = this.subscriptionUserInfo;
        if (subscriptionUserInfo != null) {
            return Long.valueOf(((subscriptionUserInfo.getExpire() * 1000) - we3.a.a().a()) / 3600000);
        }
        return null;
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final String getResolveAddressServerDnsIp() {
        return this.resolveAddressServerDnsIp;
    }

    public final void C1(FragmentationPackets fragmentationPackets) {
        this.fragmentationPackets = fragmentationPackets;
    }

    public final void C2(String str) {
        this.subInfoButtonLink = str;
    }

    public final Long D() {
        SubscriptionUserInfo subscriptionUserInfo = this.subscriptionUserInfo;
        if (subscriptionUserInfo != null) {
            return Long.valueOf(((subscriptionUserInfo.getExpire() * 1000) - we3.a.a().a()) / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
        }
        return null;
    }

    /* JADX INFO: renamed from: D0, reason: from getter */
    public final Boolean getResolveAddressServerEnable() {
        return this.resolveAddressServerEnable;
    }

    public final void D1(FragmentationType fragmentationType) {
        this.fragmentationType = fragmentationType;
    }

    public final void D2(String str) {
        this.subInfoButtonText = str;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    /* JADX INFO: renamed from: E0, reason: from getter */
    public final String getRouting() {
        return this.routing;
    }

    public final void E1(Boolean bool) {
        this.hideSettings = bool;
    }

    public final void E2(SubInfoColor subInfoColor) {
        this.subInfoColor = subInfoColor;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Map getFragmentBean() {
        return this.fragmentBean;
    }

    /* JADX INFO: renamed from: F0, reason: from getter */
    public final Boolean getRoutingEnable() {
        return this.routingEnable;
    }

    public final void F1(String str) {
        this.host = str;
    }

    public final void F2(String str) {
        this.subInfoText = str;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getFragmentationAdvancedParam() {
        return this.fragmentationAdvancedParam;
    }

    /* JADX INFO: renamed from: G0, reason: from getter */
    public final Boolean getSniffingEnable() {
        return this.sniffingEnable;
    }

    public final void G1(InboundAuthMode inboundAuthMode) {
        this.httpAuthMode = inboundAuthMode;
    }

    public final void G2(Boolean bool) {
        this.subscriptionAlwaysHwidEnable = bool;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getFragmentationDelay() {
        return this.fragmentationDelay;
    }

    /* JADX INFO: renamed from: H0, reason: from getter */
    public final InboundAuthMode getSocksAuthMode() {
        return this.socksAuthMode;
    }

    public final void H1(String str) {
        this.httpAuthPassword = str;
    }

    public final void H2(Boolean bool) {
        this.subscriptionAutoConnect = bool;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Boolean getFragmentationEnable() {
        return this.fragmentationEnable;
    }

    /* JADX INFO: renamed from: I0, reason: from getter */
    public final String getSocksAuthPassword() {
        return this.socksAuthPassword;
    }

    public final void I1(String str) {
        this.httpAuthUser = str;
    }

    public final void I2(SubscriptionAutoConnectType subscriptionAutoConnectType) {
        this.subscriptionAutoConnectType = subscriptionAutoConnectType;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getFragmentationInterval() {
        return this.fragmentationInterval;
    }

    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getSocksAuthUser() {
        return this.socksAuthUser;
    }

    public final void J1(Boolean bool) {
        this.inboundHttpEnable = bool;
    }

    public final void J2(Boolean bool) {
        this.subscriptionAutoUpdateOpenEnable = bool;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final String getFragmentationLength() {
        return this.fragmentationLength;
    }

    /* JADX INFO: renamed from: K0, reason: from getter */
    public final Boolean getSubExpire() {
        return this.subExpire;
    }

    public final void K1(Boolean bool) {
        this.insecure = bool;
    }

    public final void K2(Boolean bool) {
        this.subscriptionHwidInCookieEnable = bool;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final String getFragmentationMaxSplit() {
        return this.fragmentationMaxSplit;
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public final String getSubExpireButtonLink() {
        return this.subExpireButtonLink;
    }

    public final void L1(String str) {
        this.installId = str;
    }

    public final void L2(Boolean bool) {
        this.subscriptionPin = bool;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final FragmentationPackets getFragmentationPackets() {
        return this.fragmentationPackets;
    }

    /* JADX INFO: renamed from: M0, reason: from getter */
    public final String getSubInfoButtonLink() {
        return this.subInfoButtonLink;
    }

    public final void M1(Boolean bool) {
        this.localDnsEnable = bool;
    }

    public final void M2(Boolean bool) {
        this.subscriptionPingOnOpenEnabled = bool;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final FragmentationType getFragmentationType() {
        return this.fragmentationType;
    }

    /* JADX INFO: renamed from: N0, reason: from getter */
    public final String getSubInfoButtonText() {
        return this.subInfoButtonText;
    }

    public final void N1(Boolean bool) {
        this.manualBlockUserAgent = bool;
    }

    public final void N2(Integer num) {
        this.subscriptionRequestTimeout = num;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Boolean getHideSettings() {
        return this.hideSettings;
    }

    /* JADX INFO: renamed from: O0, reason: from getter */
    public final SubInfoColor getSubInfoColor() {
        return this.subInfoColor;
    }

    public final void O1(Boolean bool) {
        this.muxEnable = bool;
    }

    public final void O2(Boolean bool) {
        this.subscriptionSendHwidEnabled = bool;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: P0, reason: from getter */
    public final String getSubInfoText() {
        return this.subInfoText;
    }

    public final void P1(MuxQuicType muxQuicType) {
        this.muxQuic = muxQuicType;
    }

    public final void P2(SubscriptionUserInfo subscriptionUserInfo) {
        this.subscriptionUserInfo = subscriptionUserInfo;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final InboundAuthMode getHttpAuthMode() {
        return this.httpAuthMode;
    }

    /* JADX INFO: renamed from: Q0, reason: from getter */
    public final Boolean getSubscriptionAlwaysHwidEnable() {
        return this.subscriptionAlwaysHwidEnable;
    }

    public final void Q1(Integer num) {
        this.muxTcpConnections = num;
    }

    public final void Q2(Boolean bool) {
        this.subscriptionsCollapse = bool;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final String getHttpAuthPassword() {
        return this.httpAuthPassword;
    }

    /* JADX INFO: renamed from: R0, reason: from getter */
    public final Boolean getSubscriptionAutoConnect() {
        return this.subscriptionAutoConnect;
    }

    public final void R1(Integer num) {
        this.muxXudpConnections = num;
    }

    public final void R2(Boolean bool) {
        this.subscriptionsExpandNow = bool;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final String getHttpAuthUser() {
        return this.httpAuthUser;
    }

    /* JADX INFO: renamed from: S0, reason: from getter */
    public final SubscriptionAutoConnectType getSubscriptionAutoConnectType() {
        return this.subscriptionAutoConnectType;
    }

    public final void S1(String str) {
        this.newDomain = str;
    }

    public final void S2(SubscriptionSortType subscriptionSortType) {
        this.subscriptionsSortType = subscriptionSortType;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final Boolean getInboundHttpEnable() {
        return this.inboundHttpEnable;
    }

    /* JADX INFO: renamed from: T0, reason: from getter */
    public final Boolean getSubscriptionAutoUpdateOpenEnable() {
        return this.subscriptionAutoUpdateOpenEnable;
    }

    public final void T1(String str) {
        this.newUrl = str;
    }

    public final void T2(String str) {
        this.supportUrl = str;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final Boolean getInsecure() {
        return this.insecure;
    }

    /* JADX INFO: renamed from: U0, reason: from getter */
    public final Boolean getSubscriptionHwidInCookieEnable() {
        return this.subscriptionHwidInCookieEnable;
    }

    public final void U1(String str) {
        this.noisesDelay = str;
    }

    public final void U2(Boolean bool) {
        this.useOkhttpLegacy = bool;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final String getInstallId() {
        return this.installId;
    }

    /* JADX INFO: renamed from: V0, reason: from getter */
    public final Boolean getSubscriptionPin() {
        return this.subscriptionPin;
    }

    public final void V1(Boolean bool) {
        this.noisesEnable = bool;
    }

    public final void V2(GeoUserAgent geoUserAgent) {
        this.userAgentGeoFiles = geoUserAgent;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final Boolean getLocalDnsEnable() {
        return this.localDnsEnable;
    }

    /* JADX INFO: renamed from: W0, reason: from getter */
    public final Boolean getSubscriptionPingOnOpenEnabled() {
        return this.subscriptionPingOnOpenEnabled;
    }

    public final void W1(String str) {
        this.noisesPacket = str;
    }

    public final void W2(Boolean bool) {
        this.xrayTunEnable = bool;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final Boolean getManualBlockUserAgent() {
        return this.manualBlockUserAgent;
    }

    /* JADX INFO: renamed from: X0, reason: from getter */
    public final Integer getSubscriptionRequestTimeout() {
        return this.subscriptionRequestTimeout;
    }

    public final void X1(NoisesPacketType noisesPacketType) {
        this.noisesPacketType = noisesPacketType;
    }

    public final void X2(Integer num) {
        this.xrayTunMtu = num;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final Boolean getMuxEnable() {
        return this.muxEnable;
    }

    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final Boolean getSubscriptionSendHwidEnabled() {
        return this.subscriptionSendHwidEnabled;
    }

    public final void Y1(String str) {
        this.noisesRand = str;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final MuxQuicType getMuxQuic() {
        return this.muxQuic;
    }

    /* JADX INFO: renamed from: Z0, reason: from getter */
    public final SubscriptionUserInfo getSubscriptionUserInfo() {
        return this.subscriptionUserInfo;
    }

    public final void Z1(String str) {
        this.noisesRandRange = str;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final Integer getMuxTcpConnections() {
        return this.muxTcpConnections;
    }

    /* JADX INFO: renamed from: a1, reason: from getter */
    public final Boolean getSubscriptionsCollapse() {
        return this.subscriptionsCollapse;
    }

    public final void a2(Boolean bool) {
        this.notificationsSubsExpire = bool;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final Integer getMuxXudpConnections() {
        return this.muxXudpConnections;
    }

    /* JADX INFO: renamed from: b1, reason: from getter */
    public final Boolean getSubscriptionsExpandNow() {
        return this.subscriptionsExpandNow;
    }

    public final void b2(List list) {
        this.perAppProxyList = list;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final String getNewDomain() {
        return this.newDomain;
    }

    /* JADX INFO: renamed from: c1, reason: from getter */
    public final SubscriptionSortType getSubscriptionsSortType() {
        return this.subscriptionsSortType;
    }

    public final void c2(List list) {
        this.perAppProxyListInvert = list;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAnnounce() {
        return this.announce;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final String getNewUrl() {
        return this.newUrl;
    }

    /* JADX INFO: renamed from: d1, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final void d2(List list) {
        this.perAppProxyListSet = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getAppAutoStart() {
        return this.appAutoStart;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final String getNoisesDelay() {
        return this.noisesDelay;
    }

    /* JADX INFO: renamed from: e1, reason: from getter */
    public final Boolean getUseOkhttpLegacy() {
        return this.useOkhttpLegacy;
    }

    public final void e2(jk5 jk5Var) {
        this.perAppProxyMode = jk5Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0116  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        boolean zEquals4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaParams)) {
            return false;
        }
        MetaParams metaParams = (MetaParams) obj;
        if (!dh3.f(this.profileTitle, metaParams.profileTitle) || !dh3.f(this.profileUpdateInterval, metaParams.profileUpdateInterval) || !dh3.f(this.subscriptionUserInfo, metaParams.subscriptionUserInfo) || !dh3.f(this.profileWebPageUrl, metaParams.profileWebPageUrl)) {
            return false;
        }
        Map<String, Object> map = this.fragmentBean;
        Map<String, Object> map2 = metaParams.fragmentBean;
        if (map == null) {
            if (map2 == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (map2 == null) {
            zEquals = false;
        } else {
            zEquals = map.equals(map2);
        }
        if (!zEquals || !dh3.f(this.resolveAddress, metaParams.resolveAddress) || !dh3.f(this.host, metaParams.host) || !dh3.f(this.insecure, metaParams.insecure) || !dh3.f(this.announce, metaParams.announce) || !dh3.f(this.supportUrl, metaParams.supportUrl) || !dh3.f(this.routing, metaParams.routing) || !dh3.f(this.newUrl, metaParams.newUrl) || !dh3.f(this.newDomain, metaParams.newDomain) || !dh3.f(this.providerId, metaParams.providerId) || !dh3.f(this.installId, metaParams.installId) || !dh3.f(this.subscriptionAutoConnect, metaParams.subscriptionAutoConnect) || !dh3.f(this.subscriptionPingOnOpenEnabled, metaParams.subscriptionPingOnOpenEnabled) || this.subscriptionAutoConnectType != metaParams.subscriptionAutoConnectType || !dh3.f(this.routingEnable, metaParams.routingEnable) || !dh3.f(this.fragmentationEnable, metaParams.fragmentationEnable) || this.fragmentationPackets != metaParams.fragmentationPackets) {
            return false;
        }
        String str = this.fragmentationLength;
        String str2 = metaParams.fragmentationLength;
        if (str == null) {
            if (str2 == null) {
                zEquals2 = true;
            } else {
                zEquals2 = false;
            }
        } else if (str2 == null) {
            zEquals2 = false;
        } else {
            zEquals2 = str.equals(str2);
        }
        if (!zEquals2) {
            return false;
        }
        String str3 = this.fragmentationDelay;
        String str4 = metaParams.fragmentationDelay;
        if (str3 == null) {
            if (str4 == null) {
                zEquals3 = true;
            } else {
                zEquals3 = false;
            }
        } else if (str4 == null) {
            zEquals3 = false;
        } else {
            zEquals3 = str3.equals(str4);
        }
        if (!zEquals3) {
            return false;
        }
        String str5 = this.fragmentationInterval;
        String str6 = metaParams.fragmentationInterval;
        if (str5 == null) {
            if (str6 == null) {
                zEquals4 = true;
            } else {
                zEquals4 = false;
            }
        } else if (str6 == null) {
            zEquals4 = false;
        } else {
            zEquals4 = str5.equals(str6);
        }
        return zEquals4 && this.fragmentationType == metaParams.fragmentationType && dh3.f(this.fragmentationAdvancedParam, metaParams.fragmentationAdvancedParam) && dh3.f(this.fragmentationMaxSplit, metaParams.fragmentationMaxSplit) && dh3.f(this.noisesEnable, metaParams.noisesEnable) && this.noisesPacketType == metaParams.noisesPacketType && dh3.f(this.noisesPacket, metaParams.noisesPacket) && dh3.f(this.noisesDelay, metaParams.noisesDelay) && dh3.f(this.noisesRand, metaParams.noisesRand) && dh3.f(this.noisesRandRange, metaParams.noisesRandRange) && dh3.f(this.localDnsEnable, metaParams.localDnsEnable) && dh3.f(this.subscriptionAutoUpdateEnable, metaParams.subscriptionAutoUpdateEnable) && dh3.f(this.subscriptionAutoUpdateOpenEnable, metaParams.subscriptionAutoUpdateOpenEnable) && dh3.f(this.subscriptionSendHwidEnabled, metaParams.subscriptionSendHwidEnabled) && dh3.f(this.subscriptionAlwaysHwidEnable, metaParams.subscriptionAlwaysHwidEnable) && dh3.f(this.subscriptionHwidInCookieEnable, metaParams.subscriptionHwidInCookieEnable) && dh3.f(this.notificationsSubsExpire, metaParams.notificationsSubsExpire) && this.pingType == metaParams.pingType && dh3.f(this.hideSettings, metaParams.hideSettings) && dh3.f(this.changeUserAgent, metaParams.changeUserAgent) && dh3.f(this.checkUrlViaProxy, metaParams.checkUrlViaProxy) && dh3.f(this.appAutoStart, metaParams.appAutoStart) && dh3.f(this.resolveAddressServerEnable, metaParams.resolveAddressServerEnable) && dh3.f(this.resolveAddressServerDnsIp, metaParams.resolveAddressServerDnsIp) && dh3.f(this.resolveAddressServerDnsDomain, metaParams.resolveAddressServerDnsDomain) && this.perAppProxyMode == metaParams.perAppProxyMode && dh3.f(this.perAppProxyList, metaParams.perAppProxyList) && dh3.f(this.perAppProxyListSet, metaParams.perAppProxyListSet) && dh3.f(this.perAppProxyListInvert, metaParams.perAppProxyListInvert) && dh3.f(this.muxEnable, metaParams.muxEnable) && dh3.f(this.muxTcpConnections, metaParams.muxTcpConnections) && dh3.f(this.muxXudpConnections, metaParams.muxXudpConnections) && this.muxQuic == metaParams.muxQuic && dh3.f(this.sniffingEnable, metaParams.sniffingEnable) && this.preferredIpType == metaParams.preferredIpType && dh3.f(this.subscriptionsCollapse, metaParams.subscriptionsCollapse) && this.pingResult == metaParams.pingResult && dh3.f(this.excludeRoutes, metaParams.excludeRoutes) && dh3.f(this.excludeRoutesSet, metaParams.excludeRoutesSet) && this.subInfoColor == metaParams.subInfoColor && dh3.f(this.subInfoText, metaParams.subInfoText) && dh3.f(this.subInfoButtonText, metaParams.subInfoButtonText) && dh3.f(this.subInfoButtonLink, metaParams.subInfoButtonLink) && dh3.f(this.subExpire, metaParams.subExpire) && dh3.f(this.subExpireButtonLink, metaParams.subExpireButtonLink) && dh3.f(this.subscriptionsExpandNow, metaParams.subscriptionsExpandNow) && dh3.f(this.subscriptionPin, metaParams.subscriptionPin) && dh3.f(this.dontUseFilter, metaParams.dontUseFilter) && dh3.f(this.manualBlockUserAgent, metaParams.manualBlockUserAgent) && this.subscriptionsSortType == metaParams.subscriptionsSortType && dh3.f(this.dnsFromJsonEnable, metaParams.dnsFromJsonEnable) && this.socksAuthMode == metaParams.socksAuthMode && dh3.f(this.socksAuthUser, metaParams.socksAuthUser) && dh3.f(this.socksAuthPassword, metaParams.socksAuthPassword) && dh3.f(this.inboundHttpEnable, metaParams.inboundHttpEnable) && this.httpAuthMode == metaParams.httpAuthMode && dh3.f(this.httpAuthUser, metaParams.httpAuthUser) && dh3.f(this.httpAuthPassword, metaParams.httpAuthPassword) && this.userAgentGeoFiles == metaParams.userAgentGeoFiles && dh3.f(this.subscriptionRequestTimeout, metaParams.subscriptionRequestTimeout) && dh3.f(this.xrayTunEnable, metaParams.xrayTunEnable) && dh3.f(this.xrayTunMtu, metaParams.xrayTunMtu) && dh3.f(this.blockBindToTunnelEnable, metaParams.blockBindToTunnelEnable) && this.proxyPingMode == metaParams.proxyPingMode && dh3.f(this.proxyPingTimeout, metaParams.proxyPingTimeout) && dh3.f(this.useOkhttpLegacy, metaParams.useOkhttpLegacy) && dh3.f(this.fallbackUrl, metaParams.fallbackUrl) && dh3.f(this.reset, metaParams.reset) && dh3.f(this.resetInfo, metaParams.resetInfo);
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final Boolean getNoisesEnable() {
        return this.noisesEnable;
    }

    /* JADX INFO: renamed from: f1, reason: from getter */
    public final GeoUserAgent getUserAgentGeoFiles() {
        return this.userAgentGeoFiles;
    }

    public final void f2(vn5 vn5Var) {
        this.pingResult = vn5Var;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getBlockBindToTunnelEnable() {
        return this.blockBindToTunnelEnable;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final String getNoisesPacket() {
        return this.noisesPacket;
    }

    /* JADX INFO: renamed from: g1, reason: from getter */
    public final Boolean getXrayTunEnable() {
        return this.xrayTunEnable;
    }

    public final void g2(EPingType ePingType) {
        this.pingType = ePingType;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final NoisesPacketType getNoisesPacketType() {
        return this.noisesPacketType;
    }

    /* JADX INFO: renamed from: h1, reason: from getter */
    public final Integer getXrayTunMtu() {
        return this.xrayTunMtu;
    }

    public final void h2(EIpType eIpType) {
        this.preferredIpType = eIpType;
    }

    public final int hashCode() {
        String str = this.profileTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.profileUpdateInterval;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        SubscriptionUserInfo subscriptionUserInfo = this.subscriptionUserInfo;
        int iHashCode3 = (iHashCode2 + (subscriptionUserInfo == null ? 0 : subscriptionUserInfo.hashCode())) * 31;
        String str2 = this.profileWebPageUrl;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.fragmentBean;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.resolveAddress;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.host;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.insecure;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.announce;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.supportUrl;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.routing;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.newUrl;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.newDomain;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.providerId;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.installId;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.subscriptionAutoConnect;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.subscriptionPingOnOpenEnabled;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        SubscriptionAutoConnectType subscriptionAutoConnectType = this.subscriptionAutoConnectType;
        int iHashCode18 = (iHashCode17 + (subscriptionAutoConnectType == null ? 0 : subscriptionAutoConnectType.hashCode())) * 31;
        Boolean bool4 = this.routingEnable;
        int iHashCode19 = (iHashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.fragmentationEnable;
        int iHashCode20 = (iHashCode19 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        FragmentationPackets fragmentationPackets = this.fragmentationPackets;
        int iHashCode21 = (iHashCode20 + (fragmentationPackets == null ? 0 : fragmentationPackets.hashCode())) * 31;
        String str12 = this.fragmentationLength;
        int iHashCode22 = (iHashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.fragmentationDelay;
        int iHashCode23 = (iHashCode22 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.fragmentationInterval;
        int iHashCode24 = (iHashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        FragmentationType fragmentationType = this.fragmentationType;
        int iHashCode25 = (iHashCode24 + (fragmentationType == null ? 0 : fragmentationType.hashCode())) * 31;
        String str15 = this.fragmentationAdvancedParam;
        int iHashCode26 = (iHashCode25 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.fragmentationMaxSplit;
        int iHashCode27 = (iHashCode26 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool6 = this.noisesEnable;
        int iHashCode28 = (iHashCode27 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        NoisesPacketType noisesPacketType = this.noisesPacketType;
        int iHashCode29 = (iHashCode28 + (noisesPacketType == null ? 0 : noisesPacketType.hashCode())) * 31;
        String str17 = this.noisesPacket;
        int iHashCode30 = (iHashCode29 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.noisesDelay;
        int iHashCode31 = (iHashCode30 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.noisesRand;
        int iHashCode32 = (iHashCode31 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.noisesRandRange;
        int iHashCode33 = (iHashCode32 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Boolean bool7 = this.localDnsEnable;
        int iHashCode34 = (iHashCode33 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.subscriptionAutoUpdateEnable;
        int iHashCode35 = (iHashCode34 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.subscriptionAutoUpdateOpenEnable;
        int iHashCode36 = (iHashCode35 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.subscriptionSendHwidEnabled;
        int iHashCode37 = (iHashCode36 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.subscriptionAlwaysHwidEnable;
        int iHashCode38 = (iHashCode37 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.subscriptionHwidInCookieEnable;
        int iHashCode39 = (iHashCode38 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.notificationsSubsExpire;
        int iHashCode40 = (iHashCode39 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        EPingType ePingType = this.pingType;
        int iHashCode41 = (iHashCode40 + (ePingType == null ? 0 : ePingType.hashCode())) * 31;
        Boolean bool14 = this.hideSettings;
        int iHashCode42 = (iHashCode41 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        String str21 = this.changeUserAgent;
        int iHashCode43 = (iHashCode42 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.checkUrlViaProxy;
        int iHashCode44 = (iHashCode43 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Boolean bool15 = this.appAutoStart;
        int iHashCode45 = (iHashCode44 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.resolveAddressServerEnable;
        int iHashCode46 = (iHashCode45 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        String str23 = this.resolveAddressServerDnsIp;
        int iHashCode47 = (iHashCode46 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.resolveAddressServerDnsDomain;
        int iHashCode48 = (iHashCode47 + (str24 == null ? 0 : str24.hashCode())) * 31;
        jk5 jk5Var = this.perAppProxyMode;
        int iHashCode49 = (iHashCode48 + (jk5Var == null ? 0 : jk5Var.hashCode())) * 31;
        List<String> list = this.perAppProxyList;
        int iHashCode50 = (iHashCode49 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.perAppProxyListSet;
        int iHashCode51 = (iHashCode50 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.perAppProxyListInvert;
        int iHashCode52 = (iHashCode51 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool17 = this.muxEnable;
        int iHashCode53 = (iHashCode52 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Integer num2 = this.muxTcpConnections;
        int iHashCode54 = (iHashCode53 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.muxXudpConnections;
        int iHashCode55 = (iHashCode54 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MuxQuicType muxQuicType = this.muxQuic;
        int iHashCode56 = (iHashCode55 + (muxQuicType == null ? 0 : muxQuicType.hashCode())) * 31;
        Boolean bool18 = this.sniffingEnable;
        int iHashCode57 = (iHashCode56 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        EIpType eIpType = this.preferredIpType;
        int iHashCode58 = (iHashCode57 + (eIpType == null ? 0 : eIpType.hashCode())) * 31;
        Boolean bool19 = this.subscriptionsCollapse;
        int iHashCode59 = (iHashCode58 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        vn5 vn5Var = this.pingResult;
        int iHashCode60 = (iHashCode59 + (vn5Var == null ? 0 : vn5Var.hashCode())) * 31;
        String str25 = this.excludeRoutes;
        int iHashCode61 = (iHashCode60 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.excludeRoutesSet;
        int iHashCode62 = (iHashCode61 + (str26 == null ? 0 : str26.hashCode())) * 31;
        SubInfoColor subInfoColor = this.subInfoColor;
        int iHashCode63 = (iHashCode62 + (subInfoColor == null ? 0 : subInfoColor.hashCode())) * 31;
        String str27 = this.subInfoText;
        int iHashCode64 = (iHashCode63 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.subInfoButtonText;
        int iHashCode65 = (iHashCode64 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.subInfoButtonLink;
        int iHashCode66 = (iHashCode65 + (str29 == null ? 0 : str29.hashCode())) * 31;
        Boolean bool20 = this.subExpire;
        int iHashCode67 = (iHashCode66 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        String str30 = this.subExpireButtonLink;
        int iHashCode68 = (iHashCode67 + (str30 == null ? 0 : str30.hashCode())) * 31;
        Boolean bool21 = this.subscriptionsExpandNow;
        int iHashCode69 = (iHashCode68 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.subscriptionPin;
        int iHashCode70 = (iHashCode69 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.dontUseFilter;
        int iHashCode71 = (iHashCode70 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.manualBlockUserAgent;
        int iHashCode72 = (iHashCode71 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        SubscriptionSortType subscriptionSortType = this.subscriptionsSortType;
        int iHashCode73 = (iHashCode72 + (subscriptionSortType == null ? 0 : subscriptionSortType.hashCode())) * 31;
        Boolean bool25 = this.dnsFromJsonEnable;
        int iHashCode74 = (iHashCode73 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        InboundAuthMode inboundAuthMode = this.socksAuthMode;
        int iHashCode75 = (iHashCode74 + (inboundAuthMode == null ? 0 : inboundAuthMode.hashCode())) * 31;
        String str31 = this.socksAuthUser;
        int iHashCode76 = (iHashCode75 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.socksAuthPassword;
        int iHashCode77 = (iHashCode76 + (str32 == null ? 0 : str32.hashCode())) * 31;
        Boolean bool26 = this.inboundHttpEnable;
        int iHashCode78 = (iHashCode77 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        InboundAuthMode inboundAuthMode2 = this.httpAuthMode;
        int iHashCode79 = (iHashCode78 + (inboundAuthMode2 == null ? 0 : inboundAuthMode2.hashCode())) * 31;
        String str33 = this.httpAuthUser;
        int iHashCode80 = (iHashCode79 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.httpAuthPassword;
        int iHashCode81 = (iHashCode80 + (str34 == null ? 0 : str34.hashCode())) * 31;
        GeoUserAgent geoUserAgent = this.userAgentGeoFiles;
        int iHashCode82 = (iHashCode81 + (geoUserAgent == null ? 0 : geoUserAgent.hashCode())) * 31;
        Integer num4 = this.subscriptionRequestTimeout;
        int iHashCode83 = (iHashCode82 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool27 = this.xrayTunEnable;
        int iHashCode84 = (iHashCode83 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        Integer num5 = this.xrayTunMtu;
        int iHashCode85 = (iHashCode84 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool28 = this.blockBindToTunnelEnable;
        int iHashCode86 = (iHashCode85 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        GoPingType goPingType = this.proxyPingMode;
        int iHashCode87 = (iHashCode86 + (goPingType == null ? 0 : goPingType.hashCode())) * 31;
        Integer num6 = this.proxyPingTimeout;
        int iHashCode88 = (iHashCode87 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool29 = this.useOkhttpLegacy;
        int iHashCode89 = (iHashCode88 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        String str35 = this.fallbackUrl;
        int iHashCode90 = (iHashCode89 + (str35 == null ? 0 : str35.hashCode())) * 31;
        Boolean bool30 = this.reset;
        int iHashCode91 = (iHashCode90 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        ResetInfo resetInfo = this.resetInfo;
        return iHashCode91 + (resetInfo != null ? resetInfo.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final String getNoisesRand() {
        return this.noisesRand;
    }

    public final boolean i1() {
        SubscriptionUserInfo subscriptionUserInfo;
        if (!dh3.f(this.subExpire, Boolean.TRUE) || (subscriptionUserInfo = this.subscriptionUserInfo) == null) {
            return false;
        }
        long expire = subscriptionUserInfo.getExpire();
        Long lValueOf = Long.valueOf(expire);
        if (expire <= 0) {
            lValueOf = null;
        }
        return lValueOf != null && ((lValueOf.longValue() * 1000) - we3.a.a().a()) / 86400000 < 3;
    }

    public final void i2(String str) {
        this.profileTitle = str;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final String getNoisesRandRange() {
        return this.noisesRandRange;
    }

    public final String j1() {
        StringBuilder sb = new StringBuilder();
        if (this.insecure != null) {
            sb.append('i');
        }
        if (this.resolveAddress != null) {
            sb.append('r');
        }
        if (this.host != null) {
            sb.append('h');
        }
        if (this.fragmentBean != null) {
            sb.append('f');
        }
        return sb.toString();
    }

    public final void j2(Integer num) {
        this.profileUpdateInterval = num;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getChangeUserAgent() {
        return this.changeUserAgent;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final Boolean getNotificationsSubsExpire() {
        return this.notificationsSubsExpire;
    }

    public final ResetInfo k1(MetaParams metaParams) {
        boolean notificationSubsExpire;
        ResetInfo resetInfo = this.resetInfo;
        boolean fallbackUrl = (resetInfo == null && (resetInfo = metaParams.resetInfo) == null) ? false : resetInfo.getFallbackUrl();
        ResetInfo resetInfo2 = this.resetInfo;
        if (resetInfo2 != null) {
            notificationSubsExpire = resetInfo2.getNotificationSubsExpire();
        } else {
            ResetInfo resetInfo3 = metaParams.resetInfo;
            notificationSubsExpire = resetInfo3 != null ? resetInfo3.getNotificationSubsExpire() : false;
        }
        ResetInfo resetInfo4 = this.resetInfo;
        boolean fragment = (resetInfo4 == null && (resetInfo4 = metaParams.resetInfo) == null) ? false : resetInfo4.getFragment();
        ResetInfo resetInfo5 = this.resetInfo;
        boolean resolveAddress = (resetInfo5 == null && (resetInfo5 = metaParams.resetInfo) == null) ? false : resetInfo5.getResolveAddress();
        ResetInfo resetInfo6 = this.resetInfo;
        boolean host = (resetInfo6 == null && (resetInfo6 = metaParams.resetInfo) == null) ? false : resetInfo6.getHost();
        ResetInfo resetInfo7 = this.resetInfo;
        boolean insecure = (resetInfo7 == null && (resetInfo7 = metaParams.resetInfo) == null) ? false : resetInfo7.getInsecure();
        ResetInfo resetInfo8 = this.resetInfo;
        return new ResetInfo(fallbackUrl, notificationSubsExpire, fragment, resolveAddress, host, insecure, (resetInfo8 == null && (resetInfo8 = metaParams.resetInfo) == null) ? false : resetInfo8.getProviderId());
    }

    public final void k2(String str) {
        this.profileWebPageUrl = str;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getCheckUrlViaProxy() {
        return this.checkUrlViaProxy;
    }

    /* JADX INFO: renamed from: l0, reason: from getter */
    public final List getPerAppProxyList() {
        return this.perAppProxyList;
    }

    public final void l1(String str) {
        this.announce = str;
    }

    public final void l2(String str) {
        this.providerId = str;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getDnsFromJsonEnable() {
        return this.dnsFromJsonEnable;
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final List getPerAppProxyListInvert() {
        return this.perAppProxyListInvert;
    }

    public final void m1(Boolean bool) {
        this.appAutoStart = bool;
    }

    public final void m2(GoPingType goPingType) {
        this.proxyPingMode = goPingType;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final List getPerAppProxyListSet() {
        return this.perAppProxyListSet;
    }

    public final void n1(Boolean bool) {
        this.blockBindToTunnelEnable = bool;
    }

    public final void n2(Integer num) {
        this.proxyPingTimeout = num;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final jk5 getPerAppProxyMode() {
        return this.perAppProxyMode;
    }

    public final void o1(String str) {
        this.changeUserAgent = str;
    }

    public final void o2(Boolean bool) {
        this.reset = bool;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Boolean getDontUseFilter() {
        return this.dontUseFilter;
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final vn5 getPingResult() {
        return this.pingResult;
    }

    public final void p1(String str) {
        this.checkUrlViaProxy = str;
    }

    public final void p2(ResetInfo resetInfo) {
        this.resetInfo = resetInfo;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final EPingType getPingType() {
        return this.pingType;
    }

    public final void q1(Boolean bool) {
        this.dnsFromJsonEnable = bool;
    }

    public final void q2(String str) {
        this.resolveAddress = str;
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    public final EIpType getPreferredIpType() {
        return this.preferredIpType;
    }

    public final void r1(Boolean bool) {
        this.dontUseFilter = bool;
    }

    public final void r2(String str) {
        this.resolveAddressServerDnsDomain = str;
    }

    /* JADX INFO: renamed from: s0, reason: from getter */
    public final String getProfileTitle() {
        return this.profileTitle;
    }

    public final void s1(String str) {
        this.excludeRoutes = str;
    }

    public final void s2(String str) {
        this.resolveAddressServerDnsIp = str;
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    public final Integer getProfileUpdateInterval() {
        return this.profileUpdateInterval;
    }

    public final void t1(String str) {
        this.excludeRoutesSet = str;
    }

    public final void t2(Boolean bool) {
        this.resolveAddressServerEnable = bool;
    }

    public final String toString() {
        String str = this.profileTitle;
        Integer num = this.profileUpdateInterval;
        SubscriptionUserInfo subscriptionUserInfo = this.subscriptionUserInfo;
        String str2 = this.profileWebPageUrl;
        Map<String, Object> map = this.fragmentBean;
        String strL = map == null ? "null" : XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.l(map);
        String str3 = this.resolveAddress;
        String str4 = this.host;
        Boolean bool = this.insecure;
        String str5 = this.announce;
        String str6 = this.supportUrl;
        String str7 = this.routing;
        String str8 = this.newUrl;
        String str9 = this.newDomain;
        String str10 = this.providerId;
        String strC = "null";
        String str11 = this.installId;
        Boolean bool2 = this.subscriptionAutoConnect;
        Boolean bool3 = this.subscriptionPingOnOpenEnabled;
        SubscriptionAutoConnectType subscriptionAutoConnectType = this.subscriptionAutoConnectType;
        Boolean bool4 = this.routingEnable;
        Boolean bool5 = this.fragmentationEnable;
        FragmentationPackets fragmentationPackets = this.fragmentationPackets;
        String str12 = this.fragmentationLength;
        String strP = str12 == null ? strC : pc6.p("FragmentationLength(value=", str12, ")");
        String str13 = this.fragmentationDelay;
        String strC2 = str13 == null ? strC : FragmentationDelay.c(str13);
        String str14 = this.fragmentationInterval;
        strC = str14 != null ? FragmentationDelay.c(str14) : "null";
        FragmentationType fragmentationType = this.fragmentationType;
        String str15 = this.fragmentationAdvancedParam;
        String str16 = this.fragmentationMaxSplit;
        Boolean bool6 = this.noisesEnable;
        NoisesPacketType noisesPacketType = this.noisesPacketType;
        String str17 = this.noisesPacket;
        String str18 = this.noisesDelay;
        String str19 = this.noisesRand;
        String str20 = this.noisesRandRange;
        Boolean bool7 = this.localDnsEnable;
        Boolean bool8 = this.subscriptionAutoUpdateEnable;
        Boolean bool9 = this.subscriptionAutoUpdateOpenEnable;
        Boolean bool10 = this.subscriptionSendHwidEnabled;
        Boolean bool11 = this.subscriptionAlwaysHwidEnable;
        Boolean bool12 = this.subscriptionHwidInCookieEnable;
        Boolean bool13 = this.notificationsSubsExpire;
        EPingType ePingType = this.pingType;
        Boolean bool14 = this.hideSettings;
        String str21 = this.changeUserAgent;
        String str22 = this.checkUrlViaProxy;
        Boolean bool15 = this.appAutoStart;
        Boolean bool16 = this.resolveAddressServerEnable;
        String str23 = this.resolveAddressServerDnsIp;
        String str24 = this.resolveAddressServerDnsDomain;
        jk5 jk5Var = this.perAppProxyMode;
        List<String> list = this.perAppProxyList;
        List<String> list2 = this.perAppProxyListSet;
        List<String> list3 = this.perAppProxyListInvert;
        Boolean bool17 = this.muxEnable;
        Integer num2 = this.muxTcpConnections;
        Integer num3 = this.muxXudpConnections;
        MuxQuicType muxQuicType = this.muxQuic;
        Boolean bool18 = this.sniffingEnable;
        EIpType eIpType = this.preferredIpType;
        Boolean bool19 = this.subscriptionsCollapse;
        vn5 vn5Var = this.pingResult;
        String str25 = this.excludeRoutes;
        String str26 = this.excludeRoutesSet;
        SubInfoColor subInfoColor = this.subInfoColor;
        String str27 = this.subInfoText;
        String str28 = this.subInfoButtonText;
        String str29 = this.subInfoButtonLink;
        Boolean bool20 = this.subExpire;
        String str30 = this.subExpireButtonLink;
        Boolean bool21 = this.subscriptionsExpandNow;
        Boolean bool22 = this.subscriptionPin;
        Boolean bool23 = this.dontUseFilter;
        Boolean bool24 = this.manualBlockUserAgent;
        SubscriptionSortType subscriptionSortType = this.subscriptionsSortType;
        Boolean bool25 = this.dnsFromJsonEnable;
        InboundAuthMode inboundAuthMode = this.socksAuthMode;
        String str31 = this.socksAuthUser;
        String str32 = this.socksAuthPassword;
        Boolean bool26 = this.inboundHttpEnable;
        InboundAuthMode inboundAuthMode2 = this.httpAuthMode;
        String str33 = this.httpAuthUser;
        String str34 = this.httpAuthPassword;
        GeoUserAgent geoUserAgent = this.userAgentGeoFiles;
        Integer num4 = this.subscriptionRequestTimeout;
        Boolean bool27 = this.xrayTunEnable;
        Integer num5 = this.xrayTunMtu;
        Boolean bool28 = this.blockBindToTunnelEnable;
        GoPingType goPingType = this.proxyPingMode;
        Integer num6 = this.proxyPingTimeout;
        Boolean bool29 = this.useOkhttpLegacy;
        String str35 = this.fallbackUrl;
        Boolean bool30 = this.reset;
        ResetInfo resetInfo = this.resetInfo;
        StringBuilder sb = new StringBuilder("MetaParams(profileTitle=");
        sb.append(str);
        sb.append(", profileUpdateInterval=");
        sb.append(num);
        sb.append(", subscriptionUserInfo=");
        sb.append(subscriptionUserInfo);
        sb.append(", profileWebPageUrl=");
        sb.append(str2);
        sb.append(", fragmentBean=");
        oi0.y(sb, strL, ", resolveAddress=", str3, ", host=");
        sb.append(str4);
        sb.append(", insecure=");
        sb.append(bool);
        sb.append(", announce=");
        oi0.y(sb, str5, ", supportUrl=", str6, ", routing=");
        oi0.y(sb, str7, ", newUrl=", str8, ", newDomain=");
        oi0.y(sb, str9, ", providerId=", str10, ", installId=");
        sb.append(str11);
        sb.append(", subscriptionAutoConnect=");
        sb.append(bool2);
        sb.append(", subscriptionPingOnOpenEnabled=");
        sb.append(bool3);
        sb.append(", subscriptionAutoConnectType=");
        sb.append(subscriptionAutoConnectType);
        sb.append(", routingEnable=");
        sb.append(bool4);
        sb.append(", fragmentationEnable=");
        sb.append(bool5);
        sb.append(", fragmentationPackets=");
        sb.append(fragmentationPackets);
        sb.append(", fragmentationLength=");
        sb.append(strP);
        sb.append(", fragmentationDelay=");
        oi0.y(sb, strC2, ", fragmentationInterval=", strC, ", fragmentationType=");
        sb.append(fragmentationType);
        sb.append(", fragmentationAdvancedParam=");
        sb.append(str15);
        sb.append(", fragmentationMaxSplit=");
        sb.append(str16);
        sb.append(", noisesEnable=");
        sb.append(bool6);
        sb.append(", noisesPacketType=");
        sb.append(noisesPacketType);
        sb.append(", noisesPacket=");
        sb.append(str17);
        sb.append(", noisesDelay=");
        oi0.y(sb, str18, ", noisesRand=", str19, ", noisesRandRange=");
        sb.append(str20);
        sb.append(", localDnsEnable=");
        sb.append(bool7);
        sb.append(", subscriptionAutoUpdateEnable=");
        sb.append(bool8);
        sb.append(", subscriptionAutoUpdateOpenEnable=");
        sb.append(bool9);
        sb.append(", subscriptionSendHwidEnabled=");
        sb.append(bool10);
        sb.append(", subscriptionAlwaysHwidEnable=");
        sb.append(bool11);
        sb.append(", subscriptionHwidInCookieEnable=");
        sb.append(bool12);
        sb.append(", notificationsSubsExpire=");
        sb.append(bool13);
        sb.append(", pingType=");
        sb.append(ePingType);
        sb.append(", hideSettings=");
        sb.append(bool14);
        sb.append(", changeUserAgent=");
        oi0.y(sb, str21, ", checkUrlViaProxy=", str22, ", appAutoStart=");
        sb.append(bool15);
        sb.append(", resolveAddressServerEnable=");
        sb.append(bool16);
        sb.append(", resolveAddressServerDnsIp=");
        oi0.y(sb, str23, ", resolveAddressServerDnsDomain=", str24, ", perAppProxyMode=");
        sb.append(jk5Var);
        sb.append(", perAppProxyList=");
        sb.append(list);
        sb.append(", perAppProxyListSet=");
        sb.append(list2);
        sb.append(", perAppProxyListInvert=");
        sb.append(list3);
        sb.append(", muxEnable=");
        sb.append(bool17);
        sb.append(", muxTcpConnections=");
        sb.append(num2);
        sb.append(", muxXudpConnections=");
        sb.append(num3);
        sb.append(", muxQuic=");
        sb.append(muxQuicType);
        sb.append(", sniffingEnable=");
        sb.append(bool18);
        sb.append(", preferredIpType=");
        sb.append(eIpType);
        sb.append(", subscriptionsCollapse=");
        sb.append(bool19);
        sb.append(", pingResult=");
        sb.append(vn5Var);
        sb.append(", excludeRoutes=");
        oi0.y(sb, str25, ", excludeRoutesSet=", str26, ", subInfoColor=");
        sb.append(subInfoColor);
        sb.append(", subInfoText=");
        sb.append(str27);
        sb.append(", subInfoButtonText=");
        oi0.y(sb, str28, ", subInfoButtonLink=", str29, ", subExpire=");
        sb.append(bool20);
        sb.append(", subExpireButtonLink=");
        sb.append(str30);
        sb.append(", subscriptionsExpandNow=");
        sb.append(bool21);
        sb.append(", subscriptionPin=");
        sb.append(bool22);
        sb.append(", dontUseFilter=");
        sb.append(bool23);
        sb.append(", manualBlockUserAgent=");
        sb.append(bool24);
        sb.append(", subscriptionsSortType=");
        sb.append(subscriptionSortType);
        sb.append(", dnsFromJsonEnable=");
        sb.append(bool25);
        sb.append(", socksAuthMode=");
        sb.append(inboundAuthMode);
        sb.append(", socksAuthUser=");
        sb.append(str31);
        sb.append(", socksAuthPassword=");
        sb.append(str32);
        sb.append(", inboundHttpEnable=");
        sb.append(bool26);
        sb.append(", httpAuthMode=");
        sb.append(inboundAuthMode2);
        sb.append(", httpAuthUser=");
        sb.append(str33);
        sb.append(", httpAuthPassword=");
        sb.append(str34);
        sb.append(", userAgentGeoFiles=");
        sb.append(geoUserAgent);
        sb.append(", subscriptionRequestTimeout=");
        sb.append(num4);
        sb.append(", xrayTunEnable=");
        sb.append(bool27);
        sb.append(", xrayTunMtu=");
        sb.append(num5);
        sb.append(", blockBindToTunnelEnable=");
        sb.append(bool28);
        sb.append(", proxyPingMode=");
        sb.append(goPingType);
        sb.append(", proxyPingTimeout=");
        sb.append(num6);
        sb.append(", useOkhttpLegacy=");
        sb.append(bool29);
        sb.append(", fallbackUrl=");
        sb.append(str35);
        sb.append(", reset=");
        sb.append(bool30);
        sb.append(", resetInfo=");
        sb.append(resetInfo);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getExcludeRoutes() {
        return this.excludeRoutes;
    }

    /* JADX INFO: renamed from: u0, reason: from getter */
    public final String getProfileWebPageUrl() {
        return this.profileWebPageUrl;
    }

    public final void u1(String str) {
        this.fallbackUrl = str;
    }

    public final void u2(String str) {
        this.routing = str;
    }

    /* JADX INFO: renamed from: v0, reason: from getter */
    public final String getProviderId() {
        return this.providerId;
    }

    public final void v1(Map map) {
        this.fragmentBean = map;
    }

    public final void v2(Boolean bool) {
        this.routingEnable = bool;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final GoPingType getProxyPingMode() {
        return this.proxyPingMode;
    }

    public final void w1(String str) {
        this.fragmentationAdvancedParam = str;
    }

    public final void w2(Boolean bool) {
        this.sniffingEnable = bool;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.profileTitle);
        Integer num = this.profileUpdateInterval;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        SubscriptionUserInfo subscriptionUserInfo = this.subscriptionUserInfo;
        if (subscriptionUserInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subscriptionUserInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.profileWebPageUrl);
        Map<String, Object> map = this.fragmentBean;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.p(map, parcel);
        }
        parcel.writeString(this.resolveAddress);
        parcel.writeString(this.host);
        Boolean bool = this.insecure;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool);
        }
        parcel.writeString(this.announce);
        parcel.writeString(this.supportUrl);
        parcel.writeString(this.routing);
        parcel.writeString(this.newUrl);
        parcel.writeString(this.newDomain);
        parcel.writeString(this.providerId);
        parcel.writeString(this.installId);
        Boolean bool2 = this.subscriptionAutoConnect;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool2);
        }
        Boolean bool3 = this.subscriptionPingOnOpenEnabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool3);
        }
        SubscriptionAutoConnectType subscriptionAutoConnectType = this.subscriptionAutoConnectType;
        if (subscriptionAutoConnectType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subscriptionAutoConnectType.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.routingEnable;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool4);
        }
        Boolean bool5 = this.fragmentationEnable;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool5);
        }
        FragmentationPackets fragmentationPackets = this.fragmentationPackets;
        if (fragmentationPackets == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fragmentationPackets.writeToParcel(parcel, i);
        }
        String str = this.fragmentationLength;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        String str2 = this.fragmentationDelay;
        if (str2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str2);
        }
        String str3 = this.fragmentationInterval;
        if (str3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str3);
        }
        FragmentationType fragmentationType = this.fragmentationType;
        if (fragmentationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fragmentationType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fragmentationAdvancedParam);
        parcel.writeString(this.fragmentationMaxSplit);
        Boolean bool6 = this.noisesEnable;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool6);
        }
        NoisesPacketType noisesPacketType = this.noisesPacketType;
        if (noisesPacketType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            noisesPacketType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.noisesPacket);
        parcel.writeString(this.noisesDelay);
        parcel.writeString(this.noisesRand);
        parcel.writeString(this.noisesRandRange);
        Boolean bool7 = this.localDnsEnable;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool7);
        }
        Boolean bool8 = this.subscriptionAutoUpdateEnable;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool8);
        }
        Boolean bool9 = this.subscriptionAutoUpdateOpenEnable;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool9);
        }
        Boolean bool10 = this.subscriptionSendHwidEnabled;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool10);
        }
        Boolean bool11 = this.subscriptionAlwaysHwidEnable;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool11);
        }
        Boolean bool12 = this.subscriptionHwidInCookieEnable;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool12);
        }
        Boolean bool13 = this.notificationsSubsExpire;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool13);
        }
        EPingType ePingType = this.pingType;
        if (ePingType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ePingType.writeToParcel(parcel, i);
        }
        Boolean bool14 = this.hideSettings;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool14);
        }
        parcel.writeString(this.changeUserAgent);
        parcel.writeString(this.checkUrlViaProxy);
        Boolean bool15 = this.appAutoStart;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool15);
        }
        Boolean bool16 = this.resolveAddressServerEnable;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool16);
        }
        parcel.writeString(this.resolveAddressServerDnsIp);
        parcel.writeString(this.resolveAddressServerDnsDomain);
        jk5 jk5Var = this.perAppProxyMode;
        if (jk5Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(jk5Var.name());
        }
        parcel.writeStringList(this.perAppProxyList);
        parcel.writeStringList(this.perAppProxyListSet);
        parcel.writeStringList(this.perAppProxyListInvert);
        Boolean bool17 = this.muxEnable;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool17);
        }
        Integer num2 = this.muxTcpConnections;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.muxXudpConnections;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        MuxQuicType muxQuicType = this.muxQuic;
        if (muxQuicType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(muxQuicType.name());
        }
        Boolean bool18 = this.sniffingEnable;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool18);
        }
        EIpType eIpType = this.preferredIpType;
        if (eIpType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(eIpType.name());
        }
        Boolean bool19 = this.subscriptionsCollapse;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool19);
        }
        vn5 vn5Var = this.pingResult;
        if (vn5Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(vn5Var.name());
        }
        parcel.writeString(this.excludeRoutes);
        parcel.writeString(this.excludeRoutesSet);
        SubInfoColor subInfoColor = this.subInfoColor;
        if (subInfoColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(subInfoColor.name());
        }
        parcel.writeString(this.subInfoText);
        parcel.writeString(this.subInfoButtonText);
        parcel.writeString(this.subInfoButtonLink);
        Boolean bool20 = this.subExpire;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool20);
        }
        parcel.writeString(this.subExpireButtonLink);
        Boolean bool21 = this.subscriptionsExpandNow;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool21);
        }
        Boolean bool22 = this.subscriptionPin;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool22);
        }
        Boolean bool23 = this.dontUseFilter;
        if (bool23 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool23);
        }
        Boolean bool24 = this.manualBlockUserAgent;
        if (bool24 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool24);
        }
        SubscriptionSortType subscriptionSortType = this.subscriptionsSortType;
        if (subscriptionSortType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(subscriptionSortType.name());
        }
        Boolean bool25 = this.dnsFromJsonEnable;
        if (bool25 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool25);
        }
        InboundAuthMode inboundAuthMode = this.socksAuthMode;
        if (inboundAuthMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(inboundAuthMode.name());
        }
        parcel.writeString(this.socksAuthUser);
        parcel.writeString(this.socksAuthPassword);
        Boolean bool26 = this.inboundHttpEnable;
        if (bool26 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool26);
        }
        InboundAuthMode inboundAuthMode2 = this.httpAuthMode;
        if (inboundAuthMode2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(inboundAuthMode2.name());
        }
        parcel.writeString(this.httpAuthUser);
        parcel.writeString(this.httpAuthPassword);
        GeoUserAgent geoUserAgent = this.userAgentGeoFiles;
        if (geoUserAgent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(geoUserAgent.name());
        }
        Integer num4 = this.subscriptionRequestTimeout;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Boolean bool27 = this.xrayTunEnable;
        if (bool27 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool27);
        }
        Integer num5 = this.xrayTunMtu;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Boolean bool28 = this.blockBindToTunnelEnable;
        if (bool28 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool28);
        }
        GoPingType goPingType = this.proxyPingMode;
        if (goPingType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(goPingType.name());
        }
        Integer num6 = this.proxyPingTimeout;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        Boolean bool29 = this.useOkhttpLegacy;
        if (bool29 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool29);
        }
        parcel.writeString(this.fallbackUrl);
        Boolean bool30 = this.reset;
        if (bool30 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool30);
        }
        ResetInfo resetInfo = this.resetInfo;
        if (resetInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            resetInfo.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final Integer getProxyPingTimeout() {
        return this.proxyPingTimeout;
    }

    public final void x1(String str) {
        this.fragmentationDelay = str;
    }

    public final void x2(InboundAuthMode inboundAuthMode) {
        this.socksAuthMode = inboundAuthMode;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getExcludeRoutesSet() {
        return this.excludeRoutesSet;
    }

    /* JADX INFO: renamed from: y0, reason: from getter */
    public final Boolean getReset() {
        return this.reset;
    }

    public final void y1(Boolean bool) {
        this.fragmentationEnable = bool;
    }

    public final void y2(String str) {
        this.socksAuthPassword = str;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final ResetInfo getResetInfo() {
        return this.resetInfo;
    }

    public final void z1(String str) {
        this.fragmentationInterval = str;
    }

    public final void z2(String str) {
        this.socksAuthUser = str;
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;", "Landroid/os/Parcelable;", _UrlKt.FRAGMENT_ENCODE_SET, "fallbackUrl", "Z", "c", "()Z", "p", "(Z)V", "notificationSubsExpire", "k", "C", MetaParams.FRAGMENT, "d", "u", "resolveAddress", "m", "E", MetaParams.HOST, "e", "y", MetaParams.INSECURE, "g", "B", "providerId", "l", "D", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ResetInfo implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ResetInfo> CREATOR = new Creator();
        private boolean fallbackUrl;
        private boolean fragment;
        private boolean host;
        private boolean insecure;
        private boolean notificationSubsExpire;
        private boolean providerId;
        private boolean resolveAddress;

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
        public static final class Creator implements Parcelable.Creator<ResetInfo> {
            @Override // android.os.Parcelable.Creator
            public final ResetInfo createFromParcel(Parcel parcel) {
                parcel.getClass();
                boolean z = false;
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new ResetInfo(z, z2, z2, z2, z2, z2, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ResetInfo[] newArray(int i) {
                return new ResetInfo[i];
            }
        }

        public ResetInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            this.fallbackUrl = z;
            this.notificationSubsExpire = z2;
            this.fragment = z3;
            this.resolveAddress = z4;
            this.host = z5;
            this.insecure = z6;
            this.providerId = z7;
        }

        public final void B(boolean z) {
            this.insecure = z;
        }

        public final void C(boolean z) {
            this.notificationSubsExpire = z;
        }

        public final void D(boolean z) {
            this.providerId = z;
        }

        public final void E(boolean z) {
            this.resolveAddress = z;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getFallbackUrl() {
            return this.fallbackUrl;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getFragment() {
            return this.fragment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getHost() {
            return this.host;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResetInfo)) {
                return false;
            }
            ResetInfo resetInfo = (ResetInfo) obj;
            return this.fallbackUrl == resetInfo.fallbackUrl && this.notificationSubsExpire == resetInfo.notificationSubsExpire && this.fragment == resetInfo.fragment && this.resolveAddress == resetInfo.resolveAddress && this.host == resetInfo.host && this.insecure == resetInfo.insecure && this.providerId == resetInfo.providerId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getInsecure() {
            return this.insecure;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.providerId) + pc6.f(pc6.f(pc6.f(pc6.f(pc6.f(Boolean.hashCode(this.fallbackUrl) * 31, 31, this.notificationSubsExpire), 31, this.fragment), 31, this.resolveAddress), 31, this.host), 31, this.insecure);
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getNotificationSubsExpire() {
            return this.notificationSubsExpire;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getProviderId() {
            return this.providerId;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getResolveAddress() {
            return this.resolveAddress;
        }

        public final void p(boolean z) {
            this.fallbackUrl = z;
        }

        public final String toString() {
            boolean z = this.fallbackUrl;
            boolean z2 = this.notificationSubsExpire;
            boolean z3 = this.fragment;
            boolean z4 = this.resolveAddress;
            boolean z5 = this.host;
            boolean z6 = this.insecure;
            boolean z7 = this.providerId;
            StringBuilder sb = new StringBuilder("ResetInfo(fallbackUrl=");
            sb.append(z);
            sb.append(", notificationSubsExpire=");
            sb.append(z2);
            sb.append(", fragment=");
            sb.append(z3);
            sb.append(", resolveAddress=");
            sb.append(z4);
            sb.append(", host=");
            sb.append(z5);
            sb.append(", insecure=");
            sb.append(z6);
            sb.append(", providerId=");
            return p61.o(sb, z7, ")");
        }

        public final void u(boolean z) {
            this.fragment = z;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.fallbackUrl ? 1 : 0);
            parcel.writeInt(this.notificationSubsExpire ? 1 : 0);
            parcel.writeInt(this.fragment ? 1 : 0);
            parcel.writeInt(this.resolveAddress ? 1 : 0);
            parcel.writeInt(this.host ? 1 : 0);
            parcel.writeInt(this.insecure ? 1 : 0);
            parcel.writeInt(this.providerId ? 1 : 0);
        }

        public final void y(boolean z) {
            this.host = z;
        }

        public /* synthetic */ ResetInfo() {
            this(false, false, false, false, false, false, false);
        }
    }

    public /* synthetic */ MetaParams(Boolean bool, int i) {
        this(null, null, null, null, null, null, null, (i & 128) != 0 ? null : bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ResetInfo());
    }
}
