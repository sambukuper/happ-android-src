.class public final Lokhttp3/internal/connection/ReusePlan;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/internal/connection/RoutePlanner$Plan;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\u0008\u0010\r\u001a\u00020\u000cH\u0016J\u0008\u0010\u000e\u001a\u00020\u0003H\u0016J\u0008\u0010\u000f\u001a\u00020\u000cH\u0016J\u0008\u0010\u0010\u001a\u00020\u000cH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\n\u00a8\u0006\u0011"
    }
    d2 = {
        "Lokhttp3/internal/connection/ReusePlan;",
        "Lokhttp3/internal/connection/RoutePlanner$Plan;",
        "connection",
        "Lokhttp3/internal/connection/RealConnection;",
        "<init>",
        "(Lokhttp3/internal/connection/RealConnection;)V",
        "getConnection",
        "()Lokhttp3/internal/connection/RealConnection;",
        "isReady",
        "",
        "()Z",
        "connectTcp",
        "",
        "connectTlsEtc",
        "handleSuccess",
        "cancel",
        "retry",
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
.field private final connection:Lokhttp3/internal/connection/RealConnection;

.field private final isReady:Z


# direct methods
.method public constructor <init>(Lokhttp3/internal/connection/RealConnection;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lokhttp3/internal/connection/ReusePlan;->connection:Lokhttp3/internal/connection/RealConnection;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lokhttp3/internal/connection/ReusePlan;->isReady:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public cancel()Ljava/lang/Void;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "unexpected cancel"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public bridge synthetic cancel()V
    .locals 0

    .line 9
    invoke-virtual {p0}, Lokhttp3/internal/connection/ReusePlan;->cancel()Ljava/lang/Void;

    return-void
.end method

.method public connectTcp()Ljava/lang/Void;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "already connected"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public bridge synthetic connectTcp()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lokhttp3/internal/connection/ReusePlan;->connectTcp()Ljava/lang/Void;

    move-result-object p0

    check-cast p0, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    return-object p0
.end method

.method public connectTlsEtc()Ljava/lang/Void;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "already connected"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public bridge synthetic connectTlsEtc()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lokhttp3/internal/connection/ReusePlan;->connectTlsEtc()Ljava/lang/Void;

    move-result-object p0

    check-cast p0, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    return-object p0
.end method

.method public final getConnection()Lokhttp3/internal/connection/RealConnection;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/connection/ReusePlan;->connection:Lokhttp3/internal/connection/RealConnection;

    .line 2
    .line 3
    return-object p0
.end method

.method public handleSuccess()Lokhttp3/internal/connection/RealConnection;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/connection/ReusePlan;->connection:Lokhttp3/internal/connection/RealConnection;

    .line 2
    .line 3
    return-object p0
.end method

.method public isReady()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/internal/connection/ReusePlan;->isReady:Z

    .line 2
    .line 3
    return p0
.end method

.method public retry()Ljava/lang/Void;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "unexpected retry"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public bridge synthetic retry()Lokhttp3/internal/connection/RoutePlanner$Plan;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lokhttp3/internal/connection/ReusePlan;->retry()Ljava/lang/Void;

    move-result-object p0

    check-cast p0, Lokhttp3/internal/connection/RoutePlanner$Plan;

    return-object p0
.end method
