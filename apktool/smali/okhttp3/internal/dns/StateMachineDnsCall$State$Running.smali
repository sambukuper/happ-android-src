.class public final Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/internal/dns/StateMachineDnsCall$State;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/dns/StateMachineDnsCall$State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Running"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0008\u0010\u0019\u001a\u00020\u0000H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0011R\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;",
        "Lokhttp3/internal/dns/StateMachineDnsCall$State;",
        "canceled",
        "",
        "callback",
        "Lokhttp3/Dns$Callback;",
        "lockHeld",
        "runningQueries",
        "",
        "Lokhttp3/internal/dns/DnsQuery;",
        "pendingRecords",
        "Lokhttp3/Dns$Record;",
        "pendingExceptions",
        "Ljava/io/IOException;",
        "<init>",
        "(ZLokhttp3/Dns$Callback;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V",
        "getCanceled",
        "()Z",
        "getCallback",
        "()Lokhttp3/Dns$Callback;",
        "getLockHeld",
        "getRunningQueries",
        "()Ljava/util/List;",
        "getPendingRecords",
        "getPendingExceptions",
        "cancel",
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
.field private final callback:Lokhttp3/Dns$Callback;

.field private final canceled:Z

.field private final lockHeld:Z

.field private final pendingExceptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/io/IOException;",
            ">;"
        }
    .end annotation
.end field

.field private final pendingRecords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/Dns$Record;",
            ">;"
        }
    .end annotation
.end field

.field private final runningQueries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/internal/dns/DnsQuery;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLokhttp3/Dns$Callback;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lokhttp3/Dns$Callback;",
            "Z",
            "Ljava/util/List<",
            "+",
            "Lokhttp3/internal/dns/DnsQuery;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lokhttp3/Dns$Record;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Ljava/io/IOException;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-boolean p1, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->canceled:Z

    .line 17
    .line 18
    iput-object p2, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->callback:Lokhttp3/Dns$Callback;

    .line 19
    .line 20
    iput-boolean p3, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->lockHeld:Z

    .line 21
    .line 22
    iput-object p4, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->runningQueries:Ljava/util/List;

    .line 23
    .line 24
    iput-object p5, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->pendingRecords:Ljava/util/List;

    .line 25
    .line 26
    iput-object p6, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->pendingExceptions:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p5}, Ljava/util/List;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    if-eqz p3, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p0, "Check failed."

    .line 38
    .line 39
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    throw p0

    .line 44
    :cond_1
    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(ZLokhttp3/Dns$Callback;ZLjava/util/List;Ljava/util/List;Ljava/util/List;ILge1;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/4 p3, 0x0

    :cond_0
    move v3, p3

    and-int/lit8 p3, p7, 0x10

    .line 45
    sget-object p8, Ld02;->X:Ld02;

    if-eqz p3, :cond_1

    move-object v5, p8

    goto :goto_0

    :cond_1
    move-object v5, p5

    :goto_0
    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_2

    move-object v6, p8

    :goto_1
    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v4, p4

    goto :goto_2

    :cond_2
    move-object v6, p6

    goto :goto_1

    :goto_2
    invoke-direct/range {v0 .. v6}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;-><init>(ZLokhttp3/Dns$Callback;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public cancel()Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;
    .locals 7

    .line 1
    new-instance v0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;

    .line 2
    .line 3
    iget-object v2, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->callback:Lokhttp3/Dns$Callback;

    .line 4
    .line 5
    iget-boolean v3, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->lockHeld:Z

    .line 6
    .line 7
    iget-object v4, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->runningQueries:Ljava/util/List;

    .line 8
    .line 9
    iget-object v5, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->pendingRecords:Ljava/util/List;

    .line 10
    .line 11
    iget-object v6, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->pendingExceptions:Ljava/util/List;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct/range {v0 .. v6}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;-><init>(ZLokhttp3/Dns$Callback;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic cancel()Lokhttp3/internal/dns/StateMachineDnsCall$State;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->cancel()Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;

    move-result-object p0

    return-object p0
.end method

.method public final getCallback()Lokhttp3/Dns$Callback;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->callback:Lokhttp3/Dns$Callback;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCanceled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->canceled:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getLockHeld()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->lockHeld:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getPendingExceptions()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/io/IOException;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->pendingExceptions:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPendingRecords()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/Dns$Record;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->pendingRecords:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRunningQueries()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/internal/dns/DnsQuery;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->runningQueries:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
