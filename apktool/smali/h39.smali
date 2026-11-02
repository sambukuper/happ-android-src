.class public final Lh39;
.super Landroid/os/Binder;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g:Lvk1;


# direct methods
.method public constructor <init>(Lvk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh39;->g:Lvk1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Li39;)V
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p1, Li39;->a:Landroid/content/Intent;

    .line 12
    .line 13
    iget-object p0, p0, Lh39;->g:Lvk1;

    .line 14
    .line 15
    iget-object p0, p0, Lvk1;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lcom/google/firebase/messaging/EnhancedIntentService;

    .line 18
    .line 19
    sget v1, Lcom/google/firebase/messaging/EnhancedIntentService;->h0:I

    .line 20
    .line 21
    new-instance v1, Lz18;

    .line 22
    .line 23
    invoke-direct {v1}, Lz18;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lcom/google/firebase/messaging/EnhancedIntentService;->X:Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    new-instance v3, Lj0;

    .line 29
    .line 30
    const/16 v4, 0xc

    .line 31
    .line 32
    invoke-direct {v3, p0, v0, v1, v4}, Lj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    new-instance p0, Lnd;

    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    invoke-direct {p0, v0}, Lnd;-><init>(B)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Lj78;

    .line 45
    .line 46
    const/4 v2, 0x4

    .line 47
    invoke-direct {v0, p1, v2}, Lj78;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    iget-object p1, v1, Lz18;->a:Lfb9;

    .line 51
    .line 52
    invoke-virtual {p1, p0, v0}, Lfb9;->b(Ljava/util/concurrent/Executor;Lfa5;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    new-instance p0, Ljava/lang/SecurityException;

    .line 57
    .line 58
    const-string p1, "Binding only allowed within app"

    .line 59
    .line 60
    invoke-direct {p0, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0
.end method
