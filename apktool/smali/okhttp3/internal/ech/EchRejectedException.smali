.class public final Lokhttp3/internal/ech/EchRejectedException;
.super Ljavax/net/ssl/SSLException;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lokhttp3/internal/ech/EchRejectedException;",
        "Ljavax/net/ssl/SSLException;",
        "",
        "publicName",
        "Lkb0;",
        "nextEchConfigList",
        "<init>",
        "(Ljava/lang/String;Lkb0;)V",
        "Ljava/lang/String;",
        "getPublicName",
        "()Ljava/lang/String;",
        "Lkb0;",
        "getNextEchConfigList",
        "()Lkb0;",
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


# instance fields
.field private final nextEchConfigList:Lkb0;

.field private final publicName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkb0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Encrypted Client Hello (ECH) rejected"

    .line 5
    .line 6
    invoke-direct {p0, v0}, Ljavax/net/ssl/SSLException;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lokhttp3/internal/ech/EchRejectedException;->publicName:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lokhttp3/internal/ech/EchRejectedException;->nextEchConfigList:Lkb0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final getNextEchConfigList()Lkb0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/ech/EchRejectedException;->nextEchConfigList:Lkb0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPublicName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/ech/EchRejectedException;->publicName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
