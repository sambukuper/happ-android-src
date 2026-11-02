.class public final Lokhttp3/internal/connection/FailedPlan;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/internal/connection/RoutePlanner$Plan;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0001\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\r\u001a\u00020\u0007H\u0016J\u0008\u0010\u000e\u001a\u00020\u0007H\u0016J\u0008\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u0011\u001a\u00020\u0010H\u0016J\u0008\u0010\u0012\u001a\u00020\u0010H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000c\u00a8\u0006\u0013"
    }
    d2 = {
        "Lokhttp3/internal/connection/FailedPlan;",
        "Lokhttp3/internal/connection/RoutePlanner$Plan;",
        "e",
        "",
        "<init>",
        "(Ljava/lang/Throwable;)V",
        "result",
        "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;",
        "getResult",
        "()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;",
        "isReady",
        "",
        "()Z",
        "connectTcp",
        "connectTlsEtc",
        "handleSuccess",
        "",
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
.field private final isReady:Z

.field private final result:Lokhttp3/internal/connection/RoutePlanner$ConnectResult;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    move-object v1, p0

    .line 13
    move-object v3, p1

    .line 14
    invoke-direct/range {v0 .. v5}, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;-><init>(Lokhttp3/internal/connection/RoutePlanner$Plan;Lokhttp3/internal/connection/RoutePlanner$Plan;Ljava/lang/Throwable;ILge1;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, v1, Lokhttp3/internal/connection/FailedPlan;->result:Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    .line 18
    .line 19
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
    invoke-virtual {p0}, Lokhttp3/internal/connection/FailedPlan;->cancel()Ljava/lang/Void;

    return-void
.end method

.method public connectTcp()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/connection/FailedPlan;->result:Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    .line 2
    .line 3
    return-object p0
.end method

.method public connectTlsEtc()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/connection/FailedPlan;->result:Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getResult()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/connection/FailedPlan;->result:Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    .line 2
    .line 3
    return-object p0
.end method

.method public handleSuccess()Ljava/lang/Void;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "unexpected call"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public bridge synthetic handleSuccess()Lokhttp3/internal/connection/RealConnection;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lokhttp3/internal/connection/FailedPlan;->handleSuccess()Ljava/lang/Void;

    move-result-object p0

    check-cast p0, Lokhttp3/internal/connection/RealConnection;

    return-object p0
.end method

.method public isReady()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/internal/connection/FailedPlan;->isReady:Z

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
    invoke-virtual {p0}, Lokhttp3/internal/connection/FailedPlan;->retry()Ljava/lang/Void;

    move-result-object p0

    check-cast p0, Lokhttp3/internal/connection/RoutePlanner$Plan;

    return-object p0
.end method
