.class public final Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OutSettingsBean"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$DNSRule;,
        Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$FreedomFinalRule;,
        Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;,
        Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;,
        Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;,
        Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean;,
        Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$WireGuardBean;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0007efghijkR0\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0004\u0010\u0005\u0012\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR*\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\r\u0010\u000e\u0012\u0004\u0008\u0013\u0010\u000b\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u000c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R*\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\"\u0010\u0005\u001a\u0004\u0008#\u0010\u0007\"\u0004\u0008$\u0010\tR$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R\u0019\u0010,\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010\u0016\u001a\u0004\u0008-\u0010\u0018R$\u0010.\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103R$\u00104\u001a\u0004\u0018\u00010\u000c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00084\u0010\u000e\u001a\u0004\u00085\u0010\u0010\"\u0004\u00086\u0010\u0012R*\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00088\u0010\u0005\u001a\u0004\u00089\u0010\u0007\"\u0004\u0008:\u0010\tR$\u0010;\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008;\u0010\u0016\u001a\u0004\u0008<\u0010\u0018\"\u0004\u0008=\u0010\u001aR\u0019\u0010>\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008>\u0010\u0016\u001a\u0004\u0008?\u0010\u0018R\u0019\u0010@\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008@\u0010\u000e\u001a\u0004\u0008A\u0010\u0010R*\u0010C\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008C\u0010\u0005\u001a\u0004\u0008D\u0010\u0007\"\u0004\u0008E\u0010\tR\u0019\u0010F\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008F\u0010\u0016\u001a\u0004\u0008G\u0010\u0018R$\u0010H\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008H\u0010\u0016\u001a\u0004\u0008I\u0010\u0018\"\u0004\u0008J\u0010\u001aR\u001f\u0010L\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008L\u0010\u0005\u001a\u0004\u0008M\u0010\u0007R*\u0010N\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008N\u0010\u0005\u001a\u0004\u0008O\u0010\u0007\"\u0004\u0008P\u0010\tR$\u0010Q\u001a\u0004\u0018\u00010\u000c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008Q\u0010\u000e\u001a\u0004\u0008R\u0010\u0010\"\u0004\u0008S\u0010\u0012R$\u0010T\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008T\u0010\u0016\u001a\u0004\u0008U\u0010\u0018\"\u0004\u0008V\u0010\u001aR$\u0010W\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008W\u0010\u0016\u001a\u0004\u0008X\u0010\u0018\"\u0004\u0008Y\u0010\u001aR$\u0010Z\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008Z\u0010\u0016\u001a\u0004\u0008[\u0010\u0018\"\u0004\u0008\\\u0010\u001aR$\u0010]\u001a\u0004\u0018\u00010\u000c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008]\u0010\u000e\u001a\u0004\u0008^\u0010\u0010\"\u0004\u0008_\u0010\u0012R*\u0010`\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008`\u0010\u0005\u001a\u0004\u0008a\u0010\u0007\"\u0004\u0008b\u0010\tR\u0019\u0010c\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008c\u0010\u000e\u001a\u0004\u0008d\u0010\u0010\u00a8\u0006l"
    }
    d2 = {
        "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;",
        "",
        "",
        "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean;",
        "vnext",
        "Ljava/util/List;",
        "l",
        "()Ljava/util/List;",
        "w",
        "(Ljava/util/List;)V",
        "getVnext$annotations",
        "()V",
        "",
        "alterId",
        "Ljava/lang/Integer;",
        "getAlterId",
        "()Ljava/lang/Integer;",
        "setAlterId",
        "(Ljava/lang/Integer;)V",
        "getAlterId$annotations",
        "",
        "security",
        "Ljava/lang/String;",
        "j",
        "()Ljava/lang/String;",
        "v",
        "(Ljava/lang/String;)V",
        "level",
        "I",
        "getLevel",
        "()I",
        "setLevel",
        "(I)V",
        "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;",
        "servers",
        "k",
        "setServers",
        "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;",
        "response",
        "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;",
        "getResponse",
        "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;",
        "setResponse",
        "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;)V",
        "network",
        "getNetwork",
        "address",
        "Ljava/lang/Object;",
        "a",
        "()Ljava/lang/Object;",
        "m",
        "(Ljava/lang/Object;)V",
        "port",
        "g",
        "s",
        "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$DNSRule;",
        "rules",
        "getRules",
        "setRules",
        "domainStrategy",
        "getDomainStrategy",
        "n",
        "redirect",
        "getRedirect",
        "userLevel",
        "getUserLevel",
        "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$FreedomFinalRule;",
        "finalRules",
        "getFinalRules",
        "setFinalRules",
        "inboundTag",
        "getInboundTag",
        "secretKey",
        "i",
        "u",
        "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$WireGuardBean;",
        "peers",
        "f",
        "reserved",
        "h",
        "t",
        "mtu",
        "e",
        "r",
        "encryption",
        "b",
        "o",
        "flow",
        "c",
        "p",
        "id",
        "d",
        "q",
        "testPre",
        "getTestPre",
        "setTestPre",
        "testSeed",
        "getTestSeed",
        "setTestSeed",
        "version",
        "getVersion",
        "VnextBean",
        "NoisesBean",
        "ServersBean",
        "Response",
        "DNSRule",
        "FreedomFinalRule",
        "WireGuardBean",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private address:Ljava/lang/Object;

.field private alterId:Ljava/lang/Integer;

.field private domainStrategy:Ljava/lang/String;

.field private encryption:Ljava/lang/String;
    .annotation runtime Lp37;
        value = "encryption"
    .end annotation
.end field

.field private finalRules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$FreedomFinalRule;",
            ">;"
        }
    .end annotation
.end field

.field private flow:Ljava/lang/String;
    .annotation runtime Lp37;
        value = "flow"
    .end annotation
.end field

.field private id:Ljava/lang/String;
    .annotation runtime Lp37;
        value = "id"
    .end annotation
.end field

.field private final inboundTag:Ljava/lang/String;

.field private level:I

.field private mtu:Ljava/lang/Integer;

.field private final network:Ljava/lang/String;

.field private final peers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$WireGuardBean;",
            ">;"
        }
    .end annotation
.end field

.field private port:Ljava/lang/Integer;

.field private final redirect:Ljava/lang/String;

.field private reserved:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private response:Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;

.field private rules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$DNSRule;",
            ">;"
        }
    .end annotation
.end field

.field private secretKey:Ljava/lang/String;

.field private security:Ljava/lang/String;

.field private servers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;",
            ">;"
        }
    .end annotation
.end field

.field private testPre:Ljava/lang/Integer;
    .annotation runtime Lp37;
        value = "testpre"
    .end annotation
.end field

.field private testSeed:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation runtime Lp37;
        value = "testseed"
    .end annotation
.end field

.field private final userLevel:Ljava/lang/Integer;

.field private final version:Ljava/lang/Integer;

.field private vnext:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 141
    const/4 v0, 0x0

    const v1, 0x1ffffff

    invoke-direct {p0, v0, v0, v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;-><init>(Ljava/util/List;Ljava/util/List;I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;I)V
    .locals 10

    .line 1
    const/16 v0, 0x1bb

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    and-int/lit8 v2, p3, 0x10

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    move-object p1, v3

    .line 18
    :cond_0
    and-int/lit16 v2, p3, 0x80

    .line 19
    .line 20
    const-string v4, ""

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    move-object v2, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v2, v4

    .line 27
    :goto_0
    and-int/lit16 v5, p3, 0x100

    .line 28
    .line 29
    if-eqz v5, :cond_2

    .line 30
    .line 31
    move-object v0, v3

    .line 32
    :cond_2
    and-int/lit16 v5, p3, 0x400

    .line 33
    .line 34
    if-eqz v5, :cond_3

    .line 35
    .line 36
    move-object v5, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_3
    const-string v5, "UseIP"

    .line 39
    .line 40
    :goto_1
    const v6, 0x8000

    .line 41
    .line 42
    .line 43
    and-int/2addr v6, p3

    .line 44
    if-eqz v6, :cond_4

    .line 45
    .line 46
    move-object v6, v3

    .line 47
    goto :goto_2

    .line 48
    :cond_4
    move-object v6, v4

    .line 49
    :goto_2
    const/high16 v7, 0x10000

    .line 50
    .line 51
    and-int/2addr v7, p3

    .line 52
    if-eqz v7, :cond_5

    .line 53
    .line 54
    move-object p2, v3

    .line 55
    :cond_5
    const/high16 v7, 0x80000

    .line 56
    .line 57
    and-int/2addr v7, p3

    .line 58
    if-eqz v7, :cond_6

    .line 59
    .line 60
    move-object v7, v3

    .line 61
    goto :goto_3

    .line 62
    :cond_6
    move-object v7, v4

    .line 63
    :goto_3
    const/high16 v8, 0x100000

    .line 64
    .line 65
    and-int/2addr v8, p3

    .line 66
    if-eqz v8, :cond_7

    .line 67
    .line 68
    move-object v8, v3

    .line 69
    goto :goto_4

    .line 70
    :cond_7
    move-object v8, v4

    .line 71
    :goto_4
    const/high16 v9, 0x200000

    .line 72
    .line 73
    and-int/2addr v9, p3

    .line 74
    if-eqz v9, :cond_8

    .line 75
    .line 76
    move-object v4, v3

    .line 77
    :cond_8
    const/high16 v9, 0x1000000

    .line 78
    .line 79
    and-int/2addr p3, v9

    .line 80
    if-eqz p3, :cond_9

    .line 81
    .line 82
    move-object v1, v3

    .line 83
    :cond_9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->vnext:Ljava/util/List;

    .line 87
    .line 88
    iput-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->alterId:Ljava/lang/Integer;

    .line 89
    .line 90
    const-string p3, "auto"

    .line 91
    .line 92
    iput-object p3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->security:Ljava/lang/String;

    .line 93
    .line 94
    const/16 p3, 0x8

    .line 95
    .line 96
    iput p3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->level:I

    .line 97
    .line 98
    iput-object p1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->servers:Ljava/util/List;

    .line 99
    .line 100
    iput-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->response:Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;

    .line 101
    .line 102
    iput-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->network:Ljava/lang/String;

    .line 103
    .line 104
    iput-object v2, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->address:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->port:Ljava/lang/Integer;

    .line 107
    .line 108
    iput-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->rules:Ljava/util/List;

    .line 109
    .line 110
    iput-object v5, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->domainStrategy:Ljava/lang/String;

    .line 111
    .line 112
    iput-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->redirect:Ljava/lang/String;

    .line 113
    .line 114
    iput-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->userLevel:Ljava/lang/Integer;

    .line 115
    .line 116
    iput-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->finalRules:Ljava/util/List;

    .line 117
    .line 118
    iput-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->inboundTag:Ljava/lang/String;

    .line 119
    .line 120
    iput-object v6, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->secretKey:Ljava/lang/String;

    .line 121
    .line 122
    iput-object p2, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->peers:Ljava/util/List;

    .line 123
    .line 124
    iput-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->reserved:Ljava/util/List;

    .line 125
    .line 126
    iput-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->mtu:Ljava/lang/Integer;

    .line 127
    .line 128
    iput-object v7, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->encryption:Ljava/lang/String;

    .line 129
    .line 130
    iput-object v8, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->flow:Ljava/lang/String;

    .line 131
    .line 132
    iput-object v4, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->id:Ljava/lang/String;

    .line 133
    .line 134
    iput-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->testPre:Ljava/lang/Integer;

    .line 135
    .line 136
    iput-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->testSeed:Ljava/util/List;

    .line 137
    .line 138
    iput-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->version:Ljava/lang/Integer;

    .line 139
    .line 140
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->address:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->encryption:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->flow:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->mtu:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 12
    .line 13
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->vnext:Ljava/util/List;

    .line 14
    .line 15
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->vnext:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->alterId:Ljava/lang/Integer;

    .line 25
    .line 26
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->alterId:Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->security:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->security:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->level:I

    .line 47
    .line 48
    iget v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->level:I

    .line 49
    .line 50
    if-eq v1, v3, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->servers:Ljava/util/List;

    .line 54
    .line 55
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->servers:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->response:Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;

    .line 65
    .line 66
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->response:Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;

    .line 67
    .line 68
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->network:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->network:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->address:Ljava/lang/Object;

    .line 87
    .line 88
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->address:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_9

    .line 95
    .line 96
    return v2

    .line 97
    :cond_9
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->port:Ljava/lang/Integer;

    .line 98
    .line 99
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->port:Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_a

    .line 106
    .line 107
    return v2

    .line 108
    :cond_a
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->rules:Ljava/util/List;

    .line 109
    .line 110
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->rules:Ljava/util/List;

    .line 111
    .line 112
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_b

    .line 117
    .line 118
    return v2

    .line 119
    :cond_b
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->domainStrategy:Ljava/lang/String;

    .line 120
    .line 121
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->domainStrategy:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-nez v1, :cond_c

    .line 128
    .line 129
    return v2

    .line 130
    :cond_c
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->redirect:Ljava/lang/String;

    .line 131
    .line 132
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->redirect:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-nez v1, :cond_d

    .line 139
    .line 140
    return v2

    .line 141
    :cond_d
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->userLevel:Ljava/lang/Integer;

    .line 142
    .line 143
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->userLevel:Ljava/lang/Integer;

    .line 144
    .line 145
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-nez v1, :cond_e

    .line 150
    .line 151
    return v2

    .line 152
    :cond_e
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->finalRules:Ljava/util/List;

    .line 153
    .line 154
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->finalRules:Ljava/util/List;

    .line 155
    .line 156
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-nez v1, :cond_f

    .line 161
    .line 162
    return v2

    .line 163
    :cond_f
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->inboundTag:Ljava/lang/String;

    .line 164
    .line 165
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->inboundTag:Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-nez v1, :cond_10

    .line 172
    .line 173
    return v2

    .line 174
    :cond_10
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->secretKey:Ljava/lang/String;

    .line 175
    .line 176
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->secretKey:Ljava/lang/String;

    .line 177
    .line 178
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-nez v1, :cond_11

    .line 183
    .line 184
    return v2

    .line 185
    :cond_11
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->peers:Ljava/util/List;

    .line 186
    .line 187
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->peers:Ljava/util/List;

    .line 188
    .line 189
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-nez v1, :cond_12

    .line 194
    .line 195
    return v2

    .line 196
    :cond_12
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->reserved:Ljava/util/List;

    .line 197
    .line 198
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->reserved:Ljava/util/List;

    .line 199
    .line 200
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-nez v1, :cond_13

    .line 205
    .line 206
    return v2

    .line 207
    :cond_13
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->mtu:Ljava/lang/Integer;

    .line 208
    .line 209
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->mtu:Ljava/lang/Integer;

    .line 210
    .line 211
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-nez v1, :cond_14

    .line 216
    .line 217
    return v2

    .line 218
    :cond_14
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->encryption:Ljava/lang/String;

    .line 219
    .line 220
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->encryption:Ljava/lang/String;

    .line 221
    .line 222
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-nez v1, :cond_15

    .line 227
    .line 228
    return v2

    .line 229
    :cond_15
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->flow:Ljava/lang/String;

    .line 230
    .line 231
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->flow:Ljava/lang/String;

    .line 232
    .line 233
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-nez v1, :cond_16

    .line 238
    .line 239
    return v2

    .line 240
    :cond_16
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->id:Ljava/lang/String;

    .line 241
    .line 242
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->id:Ljava/lang/String;

    .line 243
    .line 244
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-nez v1, :cond_17

    .line 249
    .line 250
    return v2

    .line 251
    :cond_17
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->testPre:Ljava/lang/Integer;

    .line 252
    .line 253
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->testPre:Ljava/lang/Integer;

    .line 254
    .line 255
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-nez v1, :cond_18

    .line 260
    .line 261
    return v2

    .line 262
    :cond_18
    iget-object v1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->testSeed:Ljava/util/List;

    .line 263
    .line 264
    iget-object v3, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->testSeed:Ljava/util/List;

    .line 265
    .line 266
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-nez v1, :cond_19

    .line 271
    .line 272
    return v2

    .line 273
    :cond_19
    iget-object p0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->version:Ljava/lang/Integer;

    .line 274
    .line 275
    iget-object p1, p1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->version:Ljava/lang/Integer;

    .line 276
    .line 277
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    if-nez p0, :cond_1a

    .line 282
    .line 283
    return v2

    .line 284
    :cond_1a
    return v0
.end method

.method public final f()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->peers:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->port:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->reserved:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->vnext:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    const/16 v2, 0x1f

    .line 13
    .line 14
    mul-int/2addr v0, v2

    .line 15
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->alterId:Ljava/lang/Integer;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    move v3, v1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    :goto_1
    add-int/2addr v0, v3

    .line 26
    mul-int/2addr v0, v2

    .line 27
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->security:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0, v2, v3}, Lpc6;->e(IILjava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->level:I

    .line 34
    .line 35
    invoke-static {v3, v0, v2}, Loi0;->e(III)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->servers:Ljava/util/List;

    .line 40
    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    move v3, v1

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    :goto_2
    add-int/2addr v0, v3

    .line 50
    mul-int/2addr v0, v2

    .line 51
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->response:Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;

    .line 52
    .line 53
    if-nez v3, :cond_3

    .line 54
    .line 55
    move v3, v1

    .line 56
    goto :goto_3

    .line 57
    :cond_3
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    :goto_3
    add-int/2addr v0, v3

    .line 62
    mul-int/2addr v0, v2

    .line 63
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->network:Ljava/lang/String;

    .line 64
    .line 65
    if-nez v3, :cond_4

    .line 66
    .line 67
    move v3, v1

    .line 68
    goto :goto_4

    .line 69
    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    :goto_4
    add-int/2addr v0, v3

    .line 74
    mul-int/2addr v0, v2

    .line 75
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->address:Ljava/lang/Object;

    .line 76
    .line 77
    if-nez v3, :cond_5

    .line 78
    .line 79
    move v3, v1

    .line 80
    goto :goto_5

    .line 81
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    :goto_5
    add-int/2addr v0, v3

    .line 86
    mul-int/2addr v0, v2

    .line 87
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->port:Ljava/lang/Integer;

    .line 88
    .line 89
    if-nez v3, :cond_6

    .line 90
    .line 91
    move v3, v1

    .line 92
    goto :goto_6

    .line 93
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    :goto_6
    add-int/2addr v0, v3

    .line 98
    mul-int/2addr v0, v2

    .line 99
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->rules:Ljava/util/List;

    .line 100
    .line 101
    if-nez v3, :cond_7

    .line 102
    .line 103
    move v3, v1

    .line 104
    goto :goto_7

    .line 105
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    :goto_7
    add-int/2addr v0, v3

    .line 110
    mul-int/2addr v0, v2

    .line 111
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->domainStrategy:Ljava/lang/String;

    .line 112
    .line 113
    if-nez v3, :cond_8

    .line 114
    .line 115
    move v3, v1

    .line 116
    goto :goto_8

    .line 117
    :cond_8
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    :goto_8
    add-int/2addr v0, v3

    .line 122
    mul-int/2addr v0, v2

    .line 123
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->redirect:Ljava/lang/String;

    .line 124
    .line 125
    if-nez v3, :cond_9

    .line 126
    .line 127
    move v3, v1

    .line 128
    goto :goto_9

    .line 129
    :cond_9
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    :goto_9
    add-int/2addr v0, v3

    .line 134
    mul-int/2addr v0, v2

    .line 135
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->userLevel:Ljava/lang/Integer;

    .line 136
    .line 137
    if-nez v3, :cond_a

    .line 138
    .line 139
    move v3, v1

    .line 140
    goto :goto_a

    .line 141
    :cond_a
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    :goto_a
    add-int/2addr v0, v3

    .line 146
    mul-int/2addr v0, v2

    .line 147
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->finalRules:Ljava/util/List;

    .line 148
    .line 149
    if-nez v3, :cond_b

    .line 150
    .line 151
    move v3, v1

    .line 152
    goto :goto_b

    .line 153
    :cond_b
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    :goto_b
    add-int/2addr v0, v3

    .line 158
    mul-int/2addr v0, v2

    .line 159
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->inboundTag:Ljava/lang/String;

    .line 160
    .line 161
    if-nez v3, :cond_c

    .line 162
    .line 163
    move v3, v1

    .line 164
    goto :goto_c

    .line 165
    :cond_c
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    :goto_c
    add-int/2addr v0, v3

    .line 170
    mul-int/2addr v0, v2

    .line 171
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->secretKey:Ljava/lang/String;

    .line 172
    .line 173
    if-nez v3, :cond_d

    .line 174
    .line 175
    move v3, v1

    .line 176
    goto :goto_d

    .line 177
    :cond_d
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    :goto_d
    add-int/2addr v0, v3

    .line 182
    mul-int/2addr v0, v2

    .line 183
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->peers:Ljava/util/List;

    .line 184
    .line 185
    if-nez v3, :cond_e

    .line 186
    .line 187
    move v3, v1

    .line 188
    goto :goto_e

    .line 189
    :cond_e
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    :goto_e
    add-int/2addr v0, v3

    .line 194
    mul-int/2addr v0, v2

    .line 195
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->reserved:Ljava/util/List;

    .line 196
    .line 197
    if-nez v3, :cond_f

    .line 198
    .line 199
    move v3, v1

    .line 200
    goto :goto_f

    .line 201
    :cond_f
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    :goto_f
    add-int/2addr v0, v3

    .line 206
    mul-int/2addr v0, v2

    .line 207
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->mtu:Ljava/lang/Integer;

    .line 208
    .line 209
    if-nez v3, :cond_10

    .line 210
    .line 211
    move v3, v1

    .line 212
    goto :goto_10

    .line 213
    :cond_10
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    :goto_10
    add-int/2addr v0, v3

    .line 218
    mul-int/2addr v0, v2

    .line 219
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->encryption:Ljava/lang/String;

    .line 220
    .line 221
    if-nez v3, :cond_11

    .line 222
    .line 223
    move v3, v1

    .line 224
    goto :goto_11

    .line 225
    :cond_11
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->encryption:Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    :goto_11
    add-int/2addr v0, v3

    .line 232
    mul-int/2addr v0, v2

    .line 233
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->flow:Ljava/lang/String;

    .line 234
    .line 235
    if-nez v3, :cond_12

    .line 236
    .line 237
    move v3, v1

    .line 238
    goto :goto_12

    .line 239
    :cond_12
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->flow:Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    :goto_12
    add-int/2addr v0, v3

    .line 246
    mul-int/2addr v0, v2

    .line 247
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->id:Ljava/lang/String;

    .line 248
    .line 249
    if-nez v3, :cond_13

    .line 250
    .line 251
    move v3, v1

    .line 252
    goto :goto_13

    .line 253
    :cond_13
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->id:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    :goto_13
    add-int/2addr v0, v3

    .line 260
    mul-int/2addr v0, v2

    .line 261
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->testPre:Ljava/lang/Integer;

    .line 262
    .line 263
    if-nez v3, :cond_14

    .line 264
    .line 265
    move v3, v1

    .line 266
    goto :goto_14

    .line 267
    :cond_14
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->testPre:Ljava/lang/Integer;

    .line 268
    .line 269
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    :goto_14
    add-int/2addr v0, v3

    .line 274
    mul-int/2addr v0, v2

    .line 275
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->testSeed:Ljava/util/List;

    .line 276
    .line 277
    if-nez v3, :cond_15

    .line 278
    .line 279
    move v3, v1

    .line 280
    goto :goto_15

    .line 281
    :cond_15
    iget-object v3, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->testSeed:Ljava/util/List;

    .line 282
    .line 283
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    :goto_15
    add-int/2addr v0, v3

    .line 288
    mul-int/2addr v0, v2

    .line 289
    iget-object p0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->version:Ljava/lang/Integer;

    .line 290
    .line 291
    if-nez p0, :cond_16

    .line 292
    .line 293
    goto :goto_16

    .line 294
    :cond_16
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    :goto_16
    add-int/2addr v0, v1

    .line 299
    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->secretKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->security:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->servers:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final l()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->vnext:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->address:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public final n()V
    .locals 1

    .line 1
    const-string v0, "UseIP"

    .line 2
    .line 3
    iput-object v0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->domainStrategy:Ljava/lang/String;

    .line 4
    .line 5
    return-void
.end method

.method public final o(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->encryption:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final p(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->flow:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final q(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final r(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->mtu:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final s(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->port:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final t(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->reserved:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->vnext:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->alterId:Ljava/lang/Integer;

    .line 6
    .line 7
    iget-object v3, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->security:Ljava/lang/String;

    .line 8
    .line 9
    iget v4, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->level:I

    .line 10
    .line 11
    iget-object v5, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->servers:Ljava/util/List;

    .line 12
    .line 13
    iget-object v6, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->response:Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;

    .line 14
    .line 15
    iget-object v7, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->network:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v8, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->address:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v9, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->port:Ljava/lang/Integer;

    .line 20
    .line 21
    iget-object v10, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->rules:Ljava/util/List;

    .line 22
    .line 23
    iget-object v11, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->domainStrategy:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v12, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->redirect:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v13, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->userLevel:Ljava/lang/Integer;

    .line 28
    .line 29
    iget-object v14, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->finalRules:Ljava/util/List;

    .line 30
    .line 31
    iget-object v15, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->inboundTag:Ljava/lang/String;

    .line 32
    .line 33
    move-object/from16 v16, v15

    .line 34
    .line 35
    iget-object v15, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->secretKey:Ljava/lang/String;

    .line 36
    .line 37
    move-object/from16 v17, v15

    .line 38
    .line 39
    iget-object v15, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->peers:Ljava/util/List;

    .line 40
    .line 41
    move-object/from16 v18, v15

    .line 42
    .line 43
    iget-object v15, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->reserved:Ljava/util/List;

    .line 44
    .line 45
    move-object/from16 v19, v15

    .line 46
    .line 47
    iget-object v15, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->mtu:Ljava/lang/Integer;

    .line 48
    .line 49
    move-object/from16 v20, v15

    .line 50
    .line 51
    iget-object v15, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->encryption:Ljava/lang/String;

    .line 52
    .line 53
    move-object/from16 v21, v15

    .line 54
    .line 55
    iget-object v15, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->flow:Ljava/lang/String;

    .line 56
    .line 57
    move-object/from16 v22, v15

    .line 58
    .line 59
    iget-object v15, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->id:Ljava/lang/String;

    .line 60
    .line 61
    move-object/from16 v23, v15

    .line 62
    .line 63
    iget-object v15, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->testPre:Ljava/lang/Integer;

    .line 64
    .line 65
    move-object/from16 v24, v15

    .line 66
    .line 67
    iget-object v15, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->testSeed:Ljava/util/List;

    .line 68
    .line 69
    iget-object v0, v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->version:Ljava/lang/Integer;

    .line 70
    .line 71
    move-object/from16 p0, v0

    .line 72
    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    move-object/from16 v25, v15

    .line 76
    .line 77
    const-string v15, "OutSettingsBean(vnext="

    .line 78
    .line 79
    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", alterId="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", security="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v1, ", level="

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v1, ", servers="

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v1, ", response="

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v1, ", network="

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", address="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v1, ", port="

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v1, ", rules="

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v1, ", domainStrategy="

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v1, ", redirect="

    .line 163
    .line 164
    const-string v2, ", userLevel="

    .line 165
    .line 166
    invoke-static {v0, v11, v1, v12, v2}, Loi0;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v1, ", finalRules="

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v1, ", inboundTag="

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v1, ", secretKey="

    .line 186
    .line 187
    const-string v2, ", peers="

    .line 188
    .line 189
    move-object/from16 v3, v16

    .line 190
    .line 191
    move-object/from16 v4, v17

    .line 192
    .line 193
    invoke-static {v0, v3, v1, v4, v2}, Loi0;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    move-object/from16 v1, v18

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v1, ", reserved="

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    move-object/from16 v1, v19

    .line 207
    .line 208
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    const-string v1, ", mtu="

    .line 212
    .line 213
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    move-object/from16 v1, v20

    .line 217
    .line 218
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-string v1, ", encryption="

    .line 222
    .line 223
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    move-object/from16 v1, v21

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v1, ", flow="

    .line 232
    .line 233
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string v1, ", id="

    .line 237
    .line 238
    const-string v2, ", testPre="

    .line 239
    .line 240
    move-object/from16 v3, v22

    .line 241
    .line 242
    move-object/from16 v4, v23

    .line 243
    .line 244
    invoke-static {v0, v3, v1, v4, v2}, Loi0;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    move-object/from16 v1, v24

    .line 248
    .line 249
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v1, ", testSeed="

    .line 253
    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    move-object/from16 v1, v25

    .line 258
    .line 259
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    const-string v1, ", version="

    .line 263
    .line 264
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    move-object/from16 v1, p0

    .line 268
    .line 269
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string v1, ")"

    .line 273
    .line 274
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    return-object v0
.end method

.method public final u(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->secretKey:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final v(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->security:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public final w()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->vnext:Ljava/util/List;

    .line 3
    .line 4
    return-void
.end method
