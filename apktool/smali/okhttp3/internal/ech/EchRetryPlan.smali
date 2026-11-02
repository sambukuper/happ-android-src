.class public final Lokhttp3/internal/ech/EchRetryPlan;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/ech/EchRetryPlan$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001b\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lokhttp3/internal/ech/EchRetryPlan;",
        "",
        "",
        "publicName",
        "Lkb0;",
        "configList",
        "<init>",
        "(Ljava/lang/String;Lkb0;)V",
        "Ljava/lang/String;",
        "getPublicName",
        "()Ljava/lang/String;",
        "Lkb0;",
        "getConfigList",
        "()Lkb0;",
        "Companion",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lokhttp3/internal/ech/EchRetryPlan$Companion;

.field private static final INVALID_PUBLIC_NAME:Lkc6;


# instance fields
.field private final configList:Lkb0;

.field private final publicName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/internal/ech/EchRetryPlan$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/internal/ech/EchRetryPlan$Companion;-><init>(Lge1;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokhttp3/internal/ech/EchRetryPlan;->Companion:Lokhttp3/internal/ech/EchRetryPlan$Companion;

    .line 8
    .line 9
    new-instance v0, Lkc6;

    .line 10
    .line 11
    const-string v1, "(\\..*)|(.*\\.)|((.*\\.)?[0-9]+)|((.*\\.)?0[xX][0-9a-fA-F]*)"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lkc6;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lokhttp3/internal/ech/EchRetryPlan;->INVALID_PUBLIC_NAME:Lkc6;

    .line 17
    .line 18
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lkb0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/internal/ech/EchRetryPlan;->publicName:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lokhttp3/internal/ech/EchRetryPlan;->configList:Lkb0;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkb0;Lge1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/ech/EchRetryPlan;-><init>(Ljava/lang/String;Lkb0;)V

    return-void
.end method

.method public static final synthetic access$getINVALID_PUBLIC_NAME$cp()Lkc6;
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/internal/ech/EchRetryPlan;->INVALID_PUBLIC_NAME:Lkc6;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final getConfigList()Lkb0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/ech/EchRetryPlan;->configList:Lkb0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPublicName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/ech/EchRetryPlan;->publicName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
