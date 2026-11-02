.class public final synthetic Lle;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/media/ImageReader$OnImageAvailableListener;


# instance fields
.field public final synthetic X:Lo8;

.field public final synthetic Y:Ljava/util/concurrent/Executor;

.field public final synthetic Z:Lp63;


# direct methods
.method public synthetic constructor <init>(Lo8;Ljava/util/concurrent/Executor;Lp63;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lle;->X:Lo8;

    .line 5
    .line 6
    iput-object p2, p0, Lle;->Y:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, Lle;->Z:Lp63;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onImageAvailable(Landroid/media/ImageReader;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lle;->X:Lo8;

    .line 2
    .line 3
    iget-object v0, p0, Lle;->Y:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iget-object p0, p0, Lle;->Z:Lp63;

    .line 6
    .line 7
    iget-object v1, p1, Lo8;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-boolean v2, p1, Lo8;->Y:Z

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lsc;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v2, p1, p0, v3}, Lsc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit v1

    .line 27
    return-void

    .line 28
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p0
.end method
