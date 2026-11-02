.class public final Lh99;
.super Lms2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final j:Ldq;

.field public static final k:Ldq;

.field public static final l:Ldq;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lbe;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lbe;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lz79;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {v1, v2}, Lz79;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Ldq;

    .line 14
    .line 15
    const-string v3, "ClientNotification.API"

    .line 16
    .line 17
    invoke-direct {v2, v3, v1, v0}, Ldq;-><init>(Ljava/lang/String;Lw79;Lbe;)V

    .line 18
    .line 19
    .line 20
    sput-object v2, Lh99;->j:Ldq;

    .line 21
    .line 22
    new-instance v0, Lbe;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-direct {v0, v1}, Lbe;-><init>(B)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lz79;

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    invoke-direct {v1, v2}, Lz79;-><init>(B)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Ldq;

    .line 35
    .line 36
    const-string v3, "ClientTelemetry.API"

    .line 37
    .line 38
    invoke-direct {v2, v3, v1, v0}, Ldq;-><init>(Ljava/lang/String;Lw79;Lbe;)V

    .line 39
    .line 40
    .line 41
    sput-object v2, Lh99;->k:Ldq;

    .line 42
    .line 43
    new-instance v0, Lbe;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    invoke-direct {v0, v1}, Lbe;-><init>(B)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Lz79;

    .line 50
    .line 51
    const/4 v2, 0x4

    .line 52
    invoke-direct {v1, v2}, Lz79;-><init>(B)V

    .line 53
    .line 54
    .line 55
    new-instance v2, Ldq;

    .line 56
    .line 57
    const-string v3, "CloudMessaging.API"

    .line 58
    .line 59
    invoke-direct {v2, v3, v1, v0}, Ldq;-><init>(Ljava/lang/String;Lw79;Lbe;)V

    .line 60
    .line 61
    .line 62
    sput-object v2, Lh99;->l:Ldq;

    .line 63
    .line 64
    return-void
.end method
